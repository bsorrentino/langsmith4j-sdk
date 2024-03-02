package dev.langchain4j.langsmith;

import dev.langchain4j.langsmith.api.RunApiAsync;
import dev.langchain4j.langsmith.gen.model.*;
import lombok.*;
import retrofit2.Response;

import java.time.OffsetDateTime;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import static java.lang.String.format;
import static java.util.Optional.ofNullable;


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
        String [] tags;
        String error;
        Object serialized;
        Inputs inputs;
        Outputs outputs;
        String referenceExampleId;
        @NonNull
        RunApiAsync client ;

        public final UUID getReferenceExampleUUID() {
            return Optional.ofNullable(referenceExampleId).map( UUID::fromString ).orElse( null );
        }
    }

    public final Config config;

    Object callerOptions;

    public static Config.ConfigBuilder getDefaultConfig() {

        return Config.builder()
                .id(UUID.randomUUID())
                .projectName(ofNullable(System.getenv("LANGCHAIN_PROJECT")).orElse("default"))
                .childRuns(new ArrayList<>(10))
                //.executionOrder(1)
                //.childExecutionOrder(1)
                .startTime(OffsetDateTime.now())
                .client( getDefaultApiClient() )
                ;
    }

    private static RunApiAsync getDefaultApiClient() {
        val apiClient =  ApiClientAsyncAdapter.builder()
                .baseUrl(ofNullable(System.getenv("LANGCHAIN_ENDPOINT")).orElse("http://localhost:1984"))
                .apiKey(Optional.of(System.getenv("LANGCHAIN_API_KEY")).get())
                .build();

        return apiClient.createServiceAsync();
    }

    public RunTree() {
        this(getDefaultConfig().build());
    }

    public RunTree(RunApiAsync client) {
        this(getDefaultConfig().client(client).build());
    }

    public RunTree(Config config) {
        this.config = ofNullable(config).orElse(getDefaultConfig().client( getDefaultApiClient() ).build());
    }

    public RunTree createChild(Config childConfig) {
        // Objects.requireNonNull(this.config.getExecutionOrder(), "execution order is null!");
        // Objects.requireNonNull(this.config.getChildExecutionOrder(), "child execution order is null!");

        val processedChildConfig = childConfig.toBuilder()
                .parentRun(this)
                .projectName(this.config.getProjectName())
                //.executionOrder(this.config.getChildExecutionOrder() + 1)
                //.childExecutionOrder(this.config.getChildExecutionOrder() + 1)
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

//        if (this.config.getParentRun() != null) {
//            this.config.getParentRun().config.setChildExecutionOrder(Math.max(
//                    this.config.getParentRun().config.getChildExecutionOrder(),
//                    this.config.getChildExecutionOrder()
//            ));
//        }
        return this;
    }

    private RunCreateSchema convertToCreate(RunTree run, boolean excludeChildRuns) {

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
        List<RunCreateSchema> childRuns = Collections.emptyList();

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

        val persistedRun = RunCreateSchema.builder()
                .id(run.config.getId())
                .name(run.config.getName())
                .startTime(run.config.getStartTime())
                .endTime(run.config.getEndTime())
                .runType(run.config.getRunType())
                .referenceExampleId( config.getReferenceExampleUUID() )
                .extra(runExtra)
                // .executionOrder(run.config.getExecutionOrder())
                .serialized(run.config.getSerialized())
                .error(run.config.getError())
                .inputs(run.config.getInputs())
                .outputs(run.config.getOutputs())
                .sessionName(run.config.getProjectName())
                .childRuns(childRuns)
                .parentRunId(parentRunId);

        return persistedRun.build();

    }

    private RunCreateSchemaExtended convertToCreateExtended(RunTree run, boolean excludeChildRuns) {

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
        List<RunCreateSchema> childRuns = Collections.emptyList();

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


        val persistedRun = RunCreateSchemaExtended.builder()
                .id(run.config.getId())
                .name(run.config.getName())
                .startTime(run.config.getStartTime())
                .endTime(run.config.getEndTime())
                .runType(run.config.getRunType())
                .referenceExampleId( config.getReferenceExampleUUID() )
                .extra(runExtra)
                //.executionOrder(run.config.getExecutionOrder())
                .serialized(run.config.getSerialized())
                .error(run.config.getError())
                .inputs(run.config.getInputs())
                .outputs(run.config.getOutputs())
                .sessionName(run.config.getProjectName())
                .childRuns(childRuns)
                .parentRunId(parentRunId);

        return persistedRun.build();

    }

    public CompletableFuture<Void> postRun() {
        return postRun(true);
    }

    private CompletableFuture<Void> postRun(boolean excludeChildRuns) {

        var runCreate = convertToCreateExtended(this, true);

        return this.config.getClient().createRunRunsPost(runCreate).thenCompose(res -> {

            if( !res.isSuccessful() ) {

                //val message = format( "ERROR: code=[%d], url=[%s]", res.code(), res.res.message() );
                throw new RuntimeException(res.toString());

            }

            if (!excludeChildRuns) {

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
                .build();

        return this.config.getClient().updateRunRunsRunIdPatch(this.config.getId(), runUpdate);
    }
}
