package dev.langchain4j.langsmith.api;

import dev.langchain4j.langsmith.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import dev.langchain4j.langsmith.model.HTTPValidationError;
import dev.langchain4j.langsmith.model.RunCreateSchemaExtended;
import dev.langchain4j.langsmith.model.RunUpdateSchemaExtended;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface RunApi {
  /**
   * Create Run
   * Create a new run.
   * @param runCreateSchemaExtended  (required)
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
   * @param runId  (required)
   * @param runUpdateSchemaExtended  (required)
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
