package dev.langchain4j.langsmith.kvmap;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import dev.langchain4j.langsmith.gen.model.Inputs;
import lombok.val;

import java.io.IOException;

public class InputsDataTypeAdapter extends KVMapDataTypeAdapter<Inputs> {

    final Gson gson = new Gson();

    @Override
    protected void writeExtraAttributes(JsonWriter jsonWriter, Inputs data) throws IOException {

        val functions = data.getFunctions();
        if( functions != null ) {
            jsonWriter.name("functions");
            gson.toJson(functions, functions.getClass(), jsonWriter);
        }

        val messages = data.getMessages();
        if( messages != null ) {
            jsonWriter.name("messages");
            gson.toJson(messages, messages.getClass(), jsonWriter);
        }

    }

}