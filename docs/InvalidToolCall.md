

# InvalidToolCall

Allowance for errors made by LLM.  Here we add an `error` key to surface errors made during generation (e.g., invalid JSON arguments.)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**args** | **String** |  |  |
|**id** | **String** |  |  |
|**error** | **String** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INVALID_TOOL_CALL | &quot;invalid_tool_call&quot; |



