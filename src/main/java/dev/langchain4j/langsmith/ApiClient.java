package dev.langchain4j.langsmith;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;

public class ApiClient {


    private final Retrofit adapter;

    public static class Builder {
      private final JSON json = new JSON();
      private final OkHttpClient.Builder okBuilder = new OkHttpClient.Builder();

      private final Retrofit.Builder adapterBuilder = new Retrofit.Builder();
      private Builder() {
        adapterBuilder
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonCustomConverterFactory.create(json.getGson()));
      }

      public Builder apiKey(String apiKey) {

        okBuilder.addInterceptor(chain -> {
          final Request request = chain.request().newBuilder().addHeader("x-api-key", apiKey).build();
          return chain.proceed(request);
        });

        return this;
      }

      public Builder baseUrl(String baseUrl) {
        adapterBuilder.baseUrl( baseUrl );
        return this;
      }

      public ApiClient build() {
        final OkHttpClient okHttpClient = okBuilder.build();

        return new ApiClient(adapterBuilder.client(okHttpClient).build());

      }
    }

    public static Builder builder() {
      return new Builder();
    }

    private ApiClient( Retrofit adapter ) {
      this.adapter = adapter;
    }


    public <S> S createService(Class<S> serviceClass) {
        return adapter.create(serviceClass);
    }

}

/**
 * This wrapper is to take care of this case:
 * when the deserialization fails due to JsonParseException and the
 * expected type is String, then just return the body string.
 */
class GsonResponseBodyConverterToString<T> implements Converter<ResponseBody, T> {
    private final Gson gson;
    private final Type type;

    GsonResponseBodyConverterToString(Gson gson, Type type) {
        this.gson = gson;
        this.type = type;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        String returned = value.string();
        try {
            return gson.fromJson(returned, type);
        } catch (JsonParseException e) {
            return (T) returned;
        }
    }
}


class GsonCustomConverterFactory extends Converter.Factory {
    private final Gson gson;
    private final GsonConverterFactory gsonConverterFactory;

    public static GsonCustomConverterFactory create(Gson gson) {
        return new GsonCustomConverterFactory(gson);
    }

    private GsonCustomConverterFactory(Gson gson) {
        if (gson == null)
            throw new NullPointerException("gson == null");
        this.gson = gson;
        this.gsonConverterFactory = GsonConverterFactory.create(gson);
    }

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        if (type.equals(String.class))
            return new GsonResponseBodyConverterToString<Object>(gson, type);
        else
            return gsonConverterFactory.responseBodyConverter(type, annotations, retrofit);
    }

    @Override
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        return gsonConverterFactory.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
    }
}
