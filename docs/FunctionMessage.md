

# FunctionMessage

Message for passing the result of executing a tool back to a model.  FunctionMessage are an older version of the ToolMessage schema, and do not contain the tool_call_id field.  The tool_call_id field is used to associate the tool call request with the tool call response. This is useful in situations where a chat model is able to request multiple tool calls in parallel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | [**Content**](Content.md) |  |  |
|**additionalKwargs** | **Object** |  |  [optional] |
|**responseMetadata** | **Object** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**name** | **String** |  |  |
|**id** | [**Id**](Id.md) |  |  [optional] |



