package dev.langchain4j.langsmith.kvmap;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import lombok.val;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import static java.lang.String.format;

public class KVMapDataTypeAdapter<T extends KVMap> extends TypeAdapter<T> {

    /**
     * Override to writes the extra attributes of the data object to the JSON stream.
     *
     * @param jsonWriter the JSON writer
     * @param data the data object to write
     * @throws IOException if an I/O error occurssx
     */
    protected void writeExtraAttributes(JsonWriter jsonWriter, T data) throws IOException {

    }

    @Override
    public final void write(JsonWriter jsonWriter, T data) throws IOException {
        jsonWriter.beginObject();
        for (Map.Entry<String, Object> entry : data.getData().entrySet()) {
            jsonWriter.name(entry.getKey());

            val value = entry.getValue();

            if (value instanceof String) {
                jsonWriter.value((String) value);
            } else if (value instanceof Collection) {
                jsonWriter.beginArray();
                for (Object o : (Collection<?>) value) {
                    jsonWriter.value(o.toString());
                }
                jsonWriter.endArray();
            } else {
                throw new IllegalArgumentException(format("value type '%s' is not supported!", value.getClass()));
            }
        }

        writeExtraAttributes( jsonWriter, data );


        jsonWriter.endObject();
    }

    @Override
    public T read(JsonReader jsonReader) throws IOException {
        return null;
    }
}
