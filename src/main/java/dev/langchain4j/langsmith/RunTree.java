package dev.langchain4j.langsmith;

import dev.langchain4j.langsmith.api.RunApiAsync;
import dev.langchain4j.langsmith.model.*;
import lombok.Builder;
import lombok.Data;
import lombok.val;
import lombok.var;
import retrofit2.Response;

import java.time.OffsetDateTime;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Optional.ofNullable;

public class RunTree {
    @Data
    @Builder(toBuilder = true)
    public static class Config {
        String name;
        RunTypeEnum runType;
        UUID id;
        String sessionName;
        Integer executionOrder;
        Integer childExecutionOrder;
        RunTree parentRun;
        List<RunTree> childRuns;
        OffsetDateTime startTime;
        OffsetDateTime endTime;
        Map<String,Object> extra;
        String error;
        Object serialized;
        Inputs inputs;
        Outputs outputs;
        UUID referenceExampleId;
        UUID parentRunId;
        List<Object> events;

    }

    final RunApiAsync client;
    public final Config config;

    Object callerOptions;

    public static Config.ConfigBuilder getDefaultConfig() {

        return Config.builder()
                .id( UUID.randomUUID())
                .sessionName( ofNullable(System.getenv("LANGCHAIN_PROJECT" )).orElse("default") )
                .childRuns( new ArrayList<>(10) )
                .executionOrder( 1 )
                .childExecutionOrder( 1 )
                .startTime(OffsetDateTime.now())
                ;
    }
    private static RunApiAsync getDefaultApiClient() {
        return ApiClient.builder()
                .baseUrl( ofNullable( System.getenv("LANGCHAIN_ENDPOINT")).orElse("http://localhost:1984"))
                .apiKey( Optional.of(System.getenv("LANGCHAIN_API_KEY")).get() )
                .build()
                .createServiceAsync();
    }

    public RunTree( ) {
        this( getDefaultApiClient(), getDefaultConfig() );
    }
    public RunTree( RunApiAsync client ) {
        this(client,getDefaultConfig());
    }
    public RunTree( Config.ConfigBuilder config ) {
        this(getDefaultApiClient(),config);
    }
    public RunTree( RunApiAsync client, Config.ConfigBuilder config ) {
        this.client = ofNullable(client).orElse(getDefaultApiClient());
        this.config = ofNullable(config).orElse(getDefaultConfig()).build();
    }

    public RunTree createChild( Config childConfig) {
        Objects.requireNonNull( this.config.getExecutionOrder(), "execution order is null!");
        Objects.requireNonNull( this.config.getChildExecutionOrder(), "child execution order is null!");

        val processedChildConfig = childConfig.toBuilder()
                .parentRun( this )
                .sessionName( this.config.getSessionName() )
                .executionOrder( this.config.getChildExecutionOrder() + 1 )
                .childExecutionOrder( this.config.getChildExecutionOrder() + 1 )
                ;

        val child = new RunTree( this.client, processedChildConfig );

        Objects.requireNonNull( this.config.getChildRuns(), "child runs is null!");
        this.config.getChildRuns().add(child);

        return child;
    }

    public void end() {
        end( null, null, null );
    }
    public void end(Outputs outputs) {
        end( outputs, null, null );
    }
    public void end(Outputs outputs, String error) {
        end( outputs, error, null );
    }
    public void end( Outputs outputs, String error, OffsetDateTime endTime ) {
        this.config.setOutputs(outputs);
        this.config.setError( error );
        this.config.setEndTime( ofNullable(endTime).orElse( OffsetDateTime.now()) );

        if (this.config.getParentRun() != null ) {
            this.config.getParentRun().config.setChildExecutionOrder(  Math.max(
                    this.config.getParentRun().config.getChildExecutionOrder(),
                    this.config.getChildExecutionOrder()
            ));
        }
    }
    private RunCreateSchema convertToCreate( RunTree run ) {

        var runExtra = run.config.getExtra();
        if( runExtra == null ) {
            runExtra = Collections.emptyMap();
        }
        // Runtime environment
//        const runExtra = run.extra ?? {};
//        if (!runExtra.runtime) {
//            runExtra.runtime = {};
//        }
//        const runtimeEnv = await getRuntimeEnvironment();
//        for (const [k, v] of Object.entries(runtimeEnv)) {
//            if (!runExtra.runtime[k]) {
//                runExtra.runtime[k] = v;
//            }
//        }

        UUID parentRunId = null; // run.config.getParentRunId();

        var childRuns = ofNullable(run.config.getChildRuns())
                    .map(_runs ->
                            _runs.stream()
                                    .map(this::convertToCreate)
                                    .collect(Collectors.toList()))
                    .orElse(Collections.emptyList())
                    ;

        val persistedRun = RunCreateSchema.builder()
                .id( run.config.getId() )
                .name( run.config.getName() )
                .startTime( run.config.getStartTime() )
                .endTime( run.config.getEndTime() )
                .runType( run.config.getRunType() )
                .referenceExampleId(run.config.getReferenceExampleId())
                .extra( runExtra )
                .executionOrder( run.config.getExecutionOrder() )
                .serialized( run.config.getSerialized() )
                .error( run.config.getError() )
                .inputs( run.config.getInputs() )
                .outputs( run.config.getOutputs() )
                .sessionName( run.config.getSessionName() )
                .childRuns( childRuns )
                .parentRunId( parentRunId )
                ;

        return persistedRun.build();

    }
    public  CompletableFuture<Object> postRun(boolean excludeChildRuns) {
        var runCreate = convertToCreate(this );

        return this.client.createRunRunsPost(runCreate).thenApply( res -> {

            if( res.isSuccessful() && !excludeChildRuns) {

                ofNullable(this.config.getChildRuns()).
                        orElse(Collections.emptyList())
                        .stream()
                        .map( run -> postRun(false))
                        .forEach(CompletableFuture::join);
            }
            return res;
            // return CompletableFuture.completedFuture(res);
        });

    }

    public CompletableFuture<Response<Object>> patchRun() {

        var runUpdate  = RunUpdateSchema.builder()
                .endTime( this.config.getEndTime() )
                .error( this.config.getError() )
                .outputs( this.config.getOutputs() )
                .parentRunId( this.config.getParentRunId() )
                .referenceExampleId( this.config.getReferenceExampleId() )
                .extra( this.config.getExtra() )
                .events( this.config.getEvents() )
                .build()
                ;

        return  this.client.updateRunRunsRunIdPatch(this.config.getId(), runUpdate);
    }
}
