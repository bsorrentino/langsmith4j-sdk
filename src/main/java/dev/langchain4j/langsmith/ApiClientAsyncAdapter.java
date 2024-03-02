package dev.langchain4j.langsmith;

import dev.langchain4j.langsmith.api.RunApiAsync;
import dev.langchain4j.langsmith.api.RunApiAsyncAdapter;
import dev.langchain4j.langsmith.gen.ApiClient;
import dev.langchain4j.langsmith.gen.api.RunApi;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.extern.java.Log;
import lombok.val;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.util.Objects;

@Log

public class ApiClientAsyncAdapter {

    @NonNull

    public static class Builder {

        String apiKey;
        String baseUrl;
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public final ApiClientAsyncAdapter build() {
            Objects.requireNonNull(apiKey, "apiKey is required");

            // okBuilder.addInterceptor(new HttpLogginInterceptor());

            val okBuilder = new OkHttpClient.Builder()
                    .addInterceptor(chain -> {
                        val request = chain.request().newBuilder()
                                .addHeader("x-api-key", apiKey).build();
                        return chain.proceed(request);
                    });

            val apiClient = new ApiClient(okBuilder.build());

            apiClient.getAdapterBuilder().baseUrl(baseUrl);

            return new ApiClientAsyncAdapter(apiClient);

        }
    }

    static Builder builder() {  return new Builder();  }

    final ApiClient client;

    private ApiClientAsyncAdapter(ApiClient client) {

        this.client = client;
    }

    public final RunApi createService() {
        return client.createService(RunApi.class);
    }

    public final RunApiAsync createServiceAsync() {
        return RunApiAsyncAdapter.of(createService());
    }

}





