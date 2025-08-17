

# PlaygroundPromptCanvasPayloadMessagesInner

## oneOf schemas
* [AIMessage](AIMessage.md)
* [AIMessageChunk](AIMessageChunk.md)
* [ChatMessage](ChatMessage.md)
* [ChatMessageChunk](ChatMessageChunk.md)
* [FunctionMessage](FunctionMessage.md)
* [FunctionMessageChunk](FunctionMessageChunk.md)
* [HumanMessage](HumanMessage.md)
* [HumanMessageChunk](HumanMessageChunk.md)
* [SystemMessage](SystemMessage.md)
* [SystemMessageChunk](SystemMessageChunk.md)
* [ToolMessage](ToolMessage.md)
* [ToolMessageChunk](ToolMessageChunk.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.PlaygroundPromptCanvasPayloadMessagesInner;
import org.bsc.langgraph4j.langsmith.gen.model.AIMessage;
import org.bsc.langgraph4j.langsmith.gen.model.AIMessageChunk;
import org.bsc.langgraph4j.langsmith.gen.model.ChatMessage;
import org.bsc.langgraph4j.langsmith.gen.model.ChatMessageChunk;
import org.bsc.langgraph4j.langsmith.gen.model.FunctionMessage;
import org.bsc.langgraph4j.langsmith.gen.model.FunctionMessageChunk;
import org.bsc.langgraph4j.langsmith.gen.model.HumanMessage;
import org.bsc.langgraph4j.langsmith.gen.model.HumanMessageChunk;
import org.bsc.langgraph4j.langsmith.gen.model.SystemMessage;
import org.bsc.langgraph4j.langsmith.gen.model.SystemMessageChunk;
import org.bsc.langgraph4j.langsmith.gen.model.ToolMessage;
import org.bsc.langgraph4j.langsmith.gen.model.ToolMessageChunk;

public class Example {
    public static void main(String[] args) {
        PlaygroundPromptCanvasPayloadMessagesInner examplePlaygroundPromptCanvasPayloadMessagesInner = new PlaygroundPromptCanvasPayloadMessagesInner();

        // create a new AIMessage
        AIMessage exampleAIMessage = new AIMessage();
        // set PlaygroundPromptCanvasPayloadMessagesInner to AIMessage
        examplePlaygroundPromptCanvasPayloadMessagesInner.setActualInstance(exampleAIMessage);
        // to get back the AIMessage set earlier
        AIMessage testAIMessage = (AIMessage) examplePlaygroundPromptCanvasPayloadMessagesInner.getActualInstance();

        // create a new AIMessageChunk
        AIMessageChunk exampleAIMessageChunk = new AIMessageChunk();
        // set PlaygroundPromptCanvasPayloadMessagesInner to AIMessageChunk
        examplePlaygroundPromptCanvasPayloadMessagesInner.setActualInstance(exampleAIMessageChunk);
        // to get back the AIMessageChunk set earlier
        AIMessageChunk testAIMessageChunk = (AIMessageChunk) examplePlaygroundPromptCanvasPayloadMessagesInner.getActualInstance();

        // create a new ChatMessage
        ChatMessage exampleChatMessage = new ChatMessage();
        // set PlaygroundPromptCanvasPayloadMessagesInner to ChatMessage
        examplePlaygroundPromptCanvasPayloadMessagesInner.setActualInstance(exampleChatMessage);
        // to get back the ChatMessage set earlier
        ChatMessage testChatMessage = (ChatMessage) examplePlaygroundPromptCanvasPayloadMessagesInner.getActualInstance();

        // create a new ChatMessageChunk
        ChatMessageChunk exampleChatMessageChunk = new ChatMessageChunk();
        // set PlaygroundPromptCanvasPayloadMessagesInner to ChatMessageChunk
        examplePlaygroundPromptCanvasPayloadMessagesInner.setActualInstance(exampleChatMessageChunk);
        // to get back the ChatMessageChunk set earlier
        ChatMessageChunk testChatMessageChunk = (ChatMessageChunk) examplePlaygroundPromptCanvasPayloadMessagesInner.getActualInstance();

        // create a new FunctionMessage
        FunctionMessage exampleFunctionMessage = new FunctionMessage();
        // set PlaygroundPromptCanvasPayloadMessagesInner to FunctionMessage
        examplePlaygroundPromptCanvasPayloadMessagesInner.setActualInstance(exampleFunctionMessage);
        // to get back the FunctionMessage set earlier
        FunctionMessage testFunctionMessage = (FunctionMessage) examplePlaygroundPromptCanvasPayloadMessagesInner.getActualInstance();

        // create a new FunctionMessageChunk
        FunctionMessageChunk exampleFunctionMessageChunk = new FunctionMessageChunk();
        // set PlaygroundPromptCanvasPayloadMessagesInner to FunctionMessageChunk
        examplePlaygroundPromptCanvasPayloadMessagesInner.setActualInstance(exampleFunctionMessageChunk);
        // to get back the FunctionMessageChunk set earlier
        FunctionMessageChunk testFunctionMessageChunk = (FunctionMessageChunk) examplePlaygroundPromptCanvasPayloadMessagesInner.getActualInstance();

        // create a new HumanMessage
        HumanMessage exampleHumanMessage = new HumanMessage();
        // set PlaygroundPromptCanvasPayloadMessagesInner to HumanMessage
        examplePlaygroundPromptCanvasPayloadMessagesInner.setActualInstance(exampleHumanMessage);
        // to get back the HumanMessage set earlier
        HumanMessage testHumanMessage = (HumanMessage) examplePlaygroundPromptCanvasPayloadMessagesInner.getActualInstance();

        // create a new HumanMessageChunk
        HumanMessageChunk exampleHumanMessageChunk = new HumanMessageChunk();
        // set PlaygroundPromptCanvasPayloadMessagesInner to HumanMessageChunk
        examplePlaygroundPromptCanvasPayloadMessagesInner.setActualInstance(exampleHumanMessageChunk);
        // to get back the HumanMessageChunk set earlier
        HumanMessageChunk testHumanMessageChunk = (HumanMessageChunk) examplePlaygroundPromptCanvasPayloadMessagesInner.getActualInstance();

        // create a new SystemMessage
        SystemMessage exampleSystemMessage = new SystemMessage();
        // set PlaygroundPromptCanvasPayloadMessagesInner to SystemMessage
        examplePlaygroundPromptCanvasPayloadMessagesInner.setActualInstance(exampleSystemMessage);
        // to get back the SystemMessage set earlier
        SystemMessage testSystemMessage = (SystemMessage) examplePlaygroundPromptCanvasPayloadMessagesInner.getActualInstance();

        // create a new SystemMessageChunk
        SystemMessageChunk exampleSystemMessageChunk = new SystemMessageChunk();
        // set PlaygroundPromptCanvasPayloadMessagesInner to SystemMessageChunk
        examplePlaygroundPromptCanvasPayloadMessagesInner.setActualInstance(exampleSystemMessageChunk);
        // to get back the SystemMessageChunk set earlier
        SystemMessageChunk testSystemMessageChunk = (SystemMessageChunk) examplePlaygroundPromptCanvasPayloadMessagesInner.getActualInstance();

        // create a new ToolMessage
        ToolMessage exampleToolMessage = new ToolMessage();
        // set PlaygroundPromptCanvasPayloadMessagesInner to ToolMessage
        examplePlaygroundPromptCanvasPayloadMessagesInner.setActualInstance(exampleToolMessage);
        // to get back the ToolMessage set earlier
        ToolMessage testToolMessage = (ToolMessage) examplePlaygroundPromptCanvasPayloadMessagesInner.getActualInstance();

        // create a new ToolMessageChunk
        ToolMessageChunk exampleToolMessageChunk = new ToolMessageChunk();
        // set PlaygroundPromptCanvasPayloadMessagesInner to ToolMessageChunk
        examplePlaygroundPromptCanvasPayloadMessagesInner.setActualInstance(exampleToolMessageChunk);
        // to get back the ToolMessageChunk set earlier
        ToolMessageChunk testToolMessageChunk = (ToolMessageChunk) examplePlaygroundPromptCanvasPayloadMessagesInner.getActualInstance();
    }
}
```


