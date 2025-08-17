

# ToolCallChunk

A chunk of a tool call (e.g., as part of a stream).  When merging ToolCallChunks (e.g., via AIMessageChunk.__add__), all string attributes are concatenated. Chunks are only merged if their values of `index` are equal and not None.  Example:  .. code-block:: python      left_chunks = [ToolCallChunk(name=\"foo\", args='{\"a\":', index=0)]     right_chunks = [ToolCallChunk(name=None, args='1}', index=0)]      (         AIMessageChunk(content=\"\", tool_call_chunks=left_chunks)         + AIMessageChunk(content=\"\", tool_call_chunks=right_chunks)     ).tool_call_chunks == [ToolCallChunk(name='foo', args='{\"a\":1}', index=0)]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**args** | **String** |  |  |
|**id** | **String** |  |  |
|**index** | **Integer** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TOOL_CALL_CHUNK | &quot;tool_call_chunk&quot; |



