package dev.langchain4j.langsmith;

import dev.langchain4j.langsmith.api.RunApiAsync;
import dev.langchain4j.langsmith.gen.model.*;
import lombok.*;
import lombok.extern.java.Log;
import retrofit2.Response;

import java.time.OffsetDateTime;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import static java.util.Optional.ofNullable;

@Log
public class RunTree {

    @Data
    @Builder(toBuilder = true)
    public static class Config {
        String name;
        RunTypeEnum runType;
        UUID id;
        String projectName;
        RunTree parentRun;
        String parentRunId;
        List<RunTree> childRuns;
        OffsetDateTime startTime;
        OffsetDateTime endTime;
        Map<String,Object> extra;
        List<String>  tags;
        String error;
        Object serialized;
        Inputs inputs;
        Outputs outputs;
        String referenceExampleId;
        String apiUrl;
        String apiKey;
        RunApiAsync client ;

        public final UUID getReferenceExampleUUID() {
            return Optional.ofNullable(referenceExampleId).map( UUID::fromString ).orElse( null );
        }
    }

    private final Config config;

    @Getter @Setter private UUID traceId;

    UUID getId() { return config.getId(); }

    RunTree getParentRun() { return config.getParentRun(); }

    RunApiAsync getClient() { return config.getClient(); }

    void setClient(RunApiAsync client) { config.setClient(client); }

    public static Config.ConfigBuilder getDefaultConfig() {

        return Config.builder()
                .id(UUID.randomUUID())
                .runType(RunTypeEnum.CHAIN)
                .projectName(ofNullable(System.getenv("LANGCHAIN_PROJECT")).orElse("default"))
                .childRuns(new ArrayList<>(10))
                .apiUrl(ofNullable(System.getenv("LANGCHAIN_ENDPOINT")).orElse("http://localhost:1984"))
                .apiKey( System.getenv("LANGCHAIN_API_KEY") )
                .startTime(OffsetDateTime.now())
                ;
    }

    public RunTree() {
        this(getDefaultConfig().build());
    }

    public RunTree(Config config) {
        Objects.requireNonNull( config, "config is null!");
        this.config = config;

        if( getClient() == null ) {

            val apiClient = ApiClientAsyncAdapter.builder()
                    .baseUrl(config.getApiUrl())
                    .apiKey(Optional.of(System.getenv("LANGCHAIN_API_KEY")).get())
                    .build();

            setClient(apiClient.createServiceAsync());
        }

        if (this.getTraceId() == null ) {
            if (this.getParentRun() != null) {

                val parentTraceId = this.getParentRun().getTraceId();
                val parentId = this.getParentRun().getId();

                this.setTraceId( parentTraceId != null ? parentTraceId : parentId );
            } else {
                this.setTraceId(this.getId());
            }
        }
    }

    public RunTree createChild(Config childConfig) {
        // Objects.requireNonNull(this.config.getExecutionOrder(), "execution order is null!");
        // Objects.requireNonNull(this.config.getChildExecutionOrder(), "child execution order is null!");

        val processedChildConfig = childConfig.toBuilder()
                .parentRun(this)
                .projectName(this.config.getProjectName())
                .client( this.getClient() )
                .build();

        val child = new RunTree(processedChildConfig);

        Objects.requireNonNull(this.config.getChildRuns(), "child runs is null!");
        this.config.getChildRuns().add(child);

        return child;
    }

    public RunTree end() {
        return end(null, null, null);
    }

    public RunTree end(Outputs outputs) {
        return end(outputs, null, null);
    }

    public RunTree end(Outputs outputs, String error) {
        return end(outputs, error, null);
    }

    public RunTree end(Outputs outputs, String error, OffsetDateTime endTime) {
        this.config.setOutputs(outputs);
        this.config.setError(error);
        this.config.setEndTime(ofNullable(endTime).orElse(OffsetDateTime.now()));

        return this;
    }

    private RunCreateSchemaExtended convertToCreate(RunTree run, boolean excludeChildRuns) {

        var runExtra = run.config.getExtra();
        if (runExtra == null) {
            runExtra = Collections.emptyMap();
        }
        // Runtime environment
        if (!runExtra.containsKey("runtime")) {
            runExtra = Collections.singletonMap("runtime", new Object());
        }
//        const runtimeEnv = await getRuntimeEnvironment();
//        for (const [k, v] of Object.entries(runtimeEnv)) {
//            if (!runExtra.runtime[k]) {
//                runExtra.runtime[k] = v;
//            }
//        }

        UUID parentRunId = null; // run.config.getParentRunId();
        List<RunCreateSchemaExtended> childRuns = Collections.emptyList();

        if (!excludeChildRuns) {

            var runChildRuns = run.config.getChildRuns();
            if (runChildRuns != null) {
                childRuns = runChildRuns.stream()
                        .map(r -> convertToCreate(r, true))
                        .collect(Collectors.toList());

            }
        } else {

            if (run.config.parentRun != null) {
                parentRunId = run.config.parentRun.config.getId();
            }
        }

        return RunCreateSchemaExtended.builder()
                .id(run.config.getId())
                .name(run.config.getName())
                .startTime(run.config.getStartTime())
                .endTime(run.config.getEndTime())
                .runType(run.config.getRunType())
                .referenceExampleId( config.getReferenceExampleUUID() )
                .extra(runExtra)
                .serialized(run.config.getSerialized())
                .error(run.config.getError())
                .inputs(run.config.getInputs())
                .outputs(run.config.getOutputs())
                .sessionName(run.config.getProjectName())
                .childRuns(childRuns)
                .parentRunId(parentRunId)
                //.traceId(run.getTraceId())
                //.dottedOrder(run.config.getDottedOrder())
                .tags(run.config.getTags())
                .build();

    }

    public CompletableFuture<Void> postRun() {
        return postRun(true);
    }

    private CompletableFuture<Void> postRun(boolean excludeChildRuns) {

        var runCreate = convertToCreate(this, true);

        return this.getClient().createRunRunsPost(runCreate).thenCompose(res -> {

            if( !res.isSuccessful() ) {

                //val message = format( "ERROR: code=[%d], url=[%s]", res.code(), res.res.message() );
                throw new RuntimeException(res.toString());

            }

            if (!excludeChildRuns) {

                log.warning("Posting with excludeChildRuns=false is deprecated and will be removed in a future version.");
                val childRuns = this.config.getChildRuns();
                if (childRuns != null) {
                    val runs = childRuns.stream()
                            .map(run -> postRun(false))
                            .toArray(CompletableFuture[]::new);
                    return CompletableFuture.allOf(runs);
                }
            }

            return CompletableFuture.completedFuture(null);
        });

    }

    public CompletableFuture<Response<Object>> patchRun() {

        var runUpdate = RunUpdateSchemaExtended.builder()
                .endTime(this.config.getEndTime())
                .error(this.config.getError())
                .outputs(this.config.getOutputs())
                //.parentRunId(this.config.getParentRunId())
                //.referenceExampleId(this.config.getReferenceExampleId())
                //.extra(this.config.getExtra())
                //.events(this.config.getEvents())
                //.dottedOrder( this.config.getDottedOrder())
                //.traceId( this.getTraceId() )
                //.tags( this.config.getTags() )
                .build();

        return this.getClient().updateRunRunsRunIdPatch(this.config.getId(), runUpdate);
    }
}
