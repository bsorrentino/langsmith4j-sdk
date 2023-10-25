package dev.langchain4j.langsmith.api;

import dev.langchain4j.langsmith.ApiClient;
import dev.langchain4j.langsmith.RunTree;
import dev.langchain4j.langsmith.model.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;

import lombok.val;
import lombok.var;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Response;

import java.time.OffsetDateTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import static java.util.Collections.*;

/**
 * API tests for RunApi
 */
public class RunApiTest {

    private RunApi api;

    @Before
    public void setup() {

        api = ApiClient.builder()
                .baseUrl("http://localhost")
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
        RunUpdateSchema runUpdateSchemaExtended = null;
        // Object response = api.updateRunRunsRunIdPatch(runId, runUpdateSchemaExtended);

        // TODO: test validations
    }

    public static void main01( String [] args ) throws Exception {

        final ApiClient client = ApiClient.builder()
                .baseUrl( System.getenv("LANGCHAIN_ENDPOINT") )
                .apiKey( System.getenv("LANGCHAIN_API_KEY") )
                .build()
                ;

        final RunApiAsync apiInstance = client.createServiceAsync();

        var runId = UUID.randomUUID();
        var inputs = Inputs.builder()
                        .text( "Foo")
                        .build()
                        ;

        final RunCreateSchema schema =
                RunCreateSchema.builder()
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

        System.out.println( result );
        System.out.println( result.body() );
        System.out.println( result.headers() );

        System.exit(0);
    }
    public static void main( String [] args ) throws Exception {

        val parentRunConfig = RunTree.getDefaultConfig()
                .name("My Chat Bot")
                .runType( RunTypeEnum.CHAIN )
                .inputs( Inputs.builder()
                        .text("Summarize this morning's meetings.")
                        .build() )
                .serialized( new Object() )
                ;

        val parentRun = new RunTree(parentRunConfig);

        val res1 = parentRun.postRun(true).get( 2, TimeUnit.MINUTES);

        val childLlmRunConfig = RunTree.getDefaultConfig()
                .name("My Proprietary LLM")
                .runType( RunTypeEnum.LLM )
                .inputs( Inputs.builder()
                        .prompts(singletonList("You are an AI Assistant. The time is XYZ." +
                                " Summarize this morning's meetings."))
                        .build() )
                .serialized( new Object() )
                .build()
                ;
        val childLlmRun = parentRun.createChild( childLlmRunConfig );

        val res2 = childLlmRun.postRun(true).get( 2, TimeUnit.MINUTES);

        childLlmRun.end(
                Outputs.builder().generation( singletonList(
                    "I should use the transcript_loader tool" +
                    " to fetch meeting_transcripts from XYZ" ))
                        .build());

        val res3 = childLlmRun.patchRun().get( 2, TimeUnit.MINUTES);

        System.exit(0);
    }
}
