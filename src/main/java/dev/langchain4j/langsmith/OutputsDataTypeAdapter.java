package dev.langchain4j.langsmith;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import dev.langchain4j.langsmith.model.Outputs;
import lombok.val;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import static java.lang.String.format;

public class OutputsDataTypeAdapter extends TypeAdapter<Outputs>  {
    @Override
    public void write(JsonWriter jsonWriter, Outputs outputs) throws IOException {
        jsonWriter.beginObject();
        for (Map.Entry<String, Object> entry : outputs.getData().entrySet()) {
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

        jsonWriter.endObject();

    }

    @Override
    public Outputs read(JsonReader jsonReader) throws IOException {
        return null;
    }
}
