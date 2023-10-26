package dev.langchain4j.langsmith;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import dev.langchain4j.langsmith.model.Inputs;
import lombok.val;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;

import static java.lang.String.format;

public class InputsDataTypeAdapter extends TypeAdapter<Inputs> {

    final Gson gson = new Gson();

    @Override
    public void write(JsonWriter jsonWriter, Inputs inputs) throws IOException {
        jsonWriter.beginObject();
        for (Map.Entry<String, Object> entry : inputs.getData().entrySet()) {
            jsonWriter.name(entry.getKey());

            val value = entry.getValue();

            if( value instanceof String ) {
                jsonWriter.value( (String)value );
            }
            else if( value instanceof Collection) {
                jsonWriter.beginArray();
                for (Object o : (Collection<?>) value) {
                    jsonWriter.value(o.toString());
                }
                jsonWriter.endArray();
            }
            else {
                throw new IllegalArgumentException(format("value type '%s' is not supported!", value.getClass()));
            }

        }

        // function
        Optional.ofNullable(inputs.getFunctions())
                .ifPresent( v ->  gson.toJson( v, v.getClass(), jsonWriter));
        // messages
        Optional.ofNullable(inputs.getMessages())
                .ifPresent( v ->  gson.toJson( v, v.getClass(), jsonWriter));


        jsonWriter.endObject();
    }

    @Override
    public Inputs read(JsonReader jsonReader) throws IOException {
        return null;
    }
}