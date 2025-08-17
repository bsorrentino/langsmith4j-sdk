

# AIMessage

Message from an AI.  AIMessage is returned from a chat model as a response to a prompt.  This message represents the output of the model and consists of both the raw output as returned by the model together standardized fields (e.g., tool calls, usage metadata) added by the LangChain framework.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | [**Content**](Content.md) |  |  |
|**additionalKwargs** | **Object** |  |  [optional] |
|**responseMetadata** | **Object** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**name** | [**Name**](Name.md) |  |  [optional] |
|**id** | [**Id**](Id.md) |  |  [optional] |
|**example** | **Boolean** |  |  [optional] |
|**toolCalls** | [**List&lt;ToolCall&gt;**](ToolCall.md) |  |  [optional] |
|**invalidToolCalls** | [**List&lt;InvalidToolCall&gt;**](InvalidToolCall.md) |  |  [optional] |
|**usageMetadata** | [**AIMessageUsageMetadata**](AIMessageUsageMetadata.md) |  |  [optional] |



