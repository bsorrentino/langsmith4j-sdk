package dev.langchain4j.langsmith;

import dev.langchain4j.langsmith.gen.api.RunApi;
import dev.langchain4j.langsmith.api.RunApiAsync;
import dev.langchain4j.langsmith.gen.model.RunCreateSchemaExtended;
import dev.langchain4j.langsmith.gen.model.RunUpdateSchemaExtended;
import dev.langchain4j.langsmith.gen.model.Inputs;
import dev.langchain4j.langsmith.gen.model.RunCreateSchema;
import dev.langchain4j.langsmith.gen.model.RunTypeEnum;
import lombok.extern.java.Log;
import lombok.var;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Response;

import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * API tests for RunApi
 */
@Log
public class RunApiTest {

    private RunApi api;

    @Before
    public void setup() {

        api = ApiClientAsyncAdapter.builder()
                .baseUrl("http://localhost")
                .apiKey( "xxxxxxxxxxxx" )
                .build()
                .createService();
    }

    /**
     * Create Run
     *
     * Create a new run.
     */
    @Test
    public void createRunRunsPostTest() {
        RunCreateSchema runCreateSchema = null;
        // Object response = api.createRunRunsPost(runCreateSchemaExtended);

        // TODO: test validations
    }
    /**
     * Update Run
     *
     * Update a run.
     */
    @Test
    public void updateRunRunsRunIdPatchTest() {
        UUID runId = null;
        RunUpdateSchemaExtended runUpdateSchemaExtended = null;
        // Object response = api.updateRunRunsRunIdPatch(runId, runUpdateSchemaExtended);

        // TODO: test validations
    }

    public static void main( String [] args ) throws Exception {

        final ApiClientAsyncAdapter client = ApiClientAsyncAdapter.builder()
                .baseUrl( System.getenv("LANGCHAIN_ENDPOINT") )
                .apiKey( System.getenv("LANGCHAIN_API_KEY") )
                .build()
                ;

        final RunApiAsync apiInstance = client.createServiceAsync();

        var runId = UUID.randomUUID();
        var inputs = Inputs.builder()
                        .prompt( "Foo")
                        .build()
                        ;

        final RunCreateSchemaExtended schema =
                RunCreateSchemaExtended.builder()
                        .id( runId )
                        .sessionName( System.getenv("LANGCHAIN_PROJECT") )
                        .name( "MyFirstRun" )
                        .runType( RunTypeEnum.CHAIN )
                        .startTime( OffsetDateTime.now() )
                        .inputs( inputs )
                        .build()
                        ;

        final CompletableFuture<Response<Object>> call = apiInstance.createRunRunsPost(schema);

        final Response<Object> result = call.join();

        log.info( result.toString() );
        log.info( result.body().toString() );
        log.info( result.headers().toString() );

        System.exit(0);
    }
}
