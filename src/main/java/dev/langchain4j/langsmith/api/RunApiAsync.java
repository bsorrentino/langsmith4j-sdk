package dev.langchain4j.langsmith.api;

import dev.langchain4j.langsmith.model.RunCreateSchemaExtended;
import dev.langchain4j.langsmith.model.RunUpdateSchemaExtended;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public final class RunApiAsync {

    private final RunApi api;

    public static RunApiAsync of( RunApi api ) {
        return new RunApiAsync(api);
    }

    private RunApiAsync(RunApi api) {
        Objects.requireNonNull( api, "give api is null!");
        this.api = api;
    }

    public <T> CompletableFuture<Response<T>> createRunRunsPost(RunCreateSchemaExtended runCreateSchemaExtended) {

        final Call<Object> call = api.createRunRunsPost(runCreateSchemaExtended);

        final CompletableFuture<Response<T>> result = new CompletableFuture<>();
        call.enqueue(new Callback<Object>() {
            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {
                result.complete( (Response<T>)response);
            }

            @Override
            public void onFailure(Call<Object> call, Throwable throwable) {
                result.completeExceptionally(throwable);
            }
        });
        return result;
    }
    public <T> CompletableFuture<Response<T>> updateRunRunsRunIdPatch(UUID runId, RunUpdateSchemaExtended runUpdateSchemaExtended) {

        final Call<Object> call = api.updateRunRunsRunIdPatch( runId, runUpdateSchemaExtended );

        final CompletableFuture<Response<T>> result = new CompletableFuture<>();
        call.enqueue(new Callback<Object>() {
            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {
                result.complete( (Response<T>)response);
            }

            @Override
            public void onFailure(Call<Object> call, Throwable throwable) {
                result.completeExceptionally(throwable);
            }
        });
        return result;
    }

}