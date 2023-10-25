package dev.langchain4j.langsmith.api;

import dev.langchain4j.langsmith.model.RunCreateSchemaExtended;
import dev.langchain4j.langsmith.model.RunUpdateSchemaExtended;
import retrofit2.Response;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface RunApiAsync {

    RunApi getApi();

    <T> CompletableFuture<Response<T>> createRunRunsPost(RunCreateSchemaExtended runCreateSchemaExtended);

    <T> CompletableFuture<Response<T>> updateRunRunsRunIdPatch(UUID runId, RunUpdateSchemaExtended runUpdateSchemaExtended);
}
