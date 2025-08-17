

# ToolMessage

Message for passing the result of executing a tool back to a model.  ToolMessages contain the result of a tool invocation. Typically, the result is encoded inside the `content` field.  Example: A ToolMessage representing a result of 42 from a tool call with id      .. code-block:: python          from langchain_core.messages import ToolMessage          ToolMessage(content='42', tool_call_id='call_Jja7J89XsjrOLA5r!MEOW!SL')   Example: A ToolMessage where only part of the tool output is sent to the model     and the full output is passed in to artifact.      .. versionadded:: 0.2.17      .. code-block:: python          from langchain_core.messages import ToolMessage          tool_output = {             \"stdout\": \"From the graph we can see that the correlation between x and y is ...\",             \"stderr\": None,             \"artifacts\": {\"type\": \"image\", \"base64_data\": \"/9j/4gIcSU...\"},         }          ToolMessage(             content=tool_output[\"stdout\"],             artifact=tool_output,             tool_call_id='call_Jja7J89XsjrOLA5r!MEOW!SL',         )  The tool_call_id field is used to associate the tool call request with the tool call response. This is useful in situations where a chat model is able to request multiple tool calls in parallel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | [**Content**](Content.md) |  |  |
|**additionalKwargs** | **Object** |  |  [optional] |
|**responseMetadata** | **Object** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**name** | [**Name2**](Name2.md) |  |  [optional] |
|**id** | [**Id**](Id.md) |  |  [optional] |
|**toolCallId** | **String** |  |  |
|**artifact** | **Object** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;success&quot; |
| ERROR | &quot;error&quot; |



