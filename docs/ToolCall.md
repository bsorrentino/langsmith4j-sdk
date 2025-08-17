

# ToolCall

Represents a request to call a tool.  Example:      .. code-block:: python          {             \"name\": \"foo\",             \"args\": {\"a\": 1},             \"id\": \"123\"         }      This represents a request to call the tool named \"foo\" with arguments {\"a\": 1}     and an identifier of \"123\".

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**args** | **Object** |  |  |
|**id** | **String** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TOOL_CALL | &quot;tool_call&quot; |



