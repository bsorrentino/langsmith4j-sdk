package dev.langchain4j.langsmith.api;

import dev.langchain4j.langsmith.model.RunCreateSchemaExtended;
import dev.langchain4j.langsmith.model.RunUpdateSchemaExtended;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface RunApi {
    /**
     * Create Run
     * Create a new run.
     *
     * @param runCreateSchemaExtended (required)
     * @return Call&lt;Object&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("runs")
    Call<Object> createRunRunsPost(
            @retrofit2.http.Body RunCreateSchemaExtended runCreateSchemaExtended
    );

    /**
     * Update Run
     * Update a run.
     *
     * @param runId                   (required)
     * @param runUpdateSchemaExtended (required)
     * @return Call&lt;Object&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("runs/{run_id}")
    Call<Object> updateRunRunsRunIdPatch(
            @retrofit2.http.Path("run_id") UUID runId, @retrofit2.http.Body RunUpdateSchemaExtended runUpdateSchemaExtended
    );

}