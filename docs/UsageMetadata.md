

# UsageMetadata

Usage metadata for a message, such as token counts.  This is a standard representation of token usage that is consistent across models.  Example:      .. code-block:: python          {             \"input_tokens\": 350,             \"output_tokens\": 240,             \"total_tokens\": 590,             \"input_token_details\": {                 \"audio\": 10,                 \"cache_creation\": 200,                 \"cache_read\": 100,             },             \"output_token_details\": {                 \"audio\": 10,                 \"reasoning\": 200,             }         }  .. versionchanged:: 0.3.9      Added ``input_token_details`` and ``output_token_details``.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inputTokens** | **Integer** |  |  |
|**outputTokens** | **Integer** |  |  |
|**totalTokens** | **Integer** |  |  |
|**inputTokenDetails** | [**InputTokenDetails**](InputTokenDetails.md) |  |  [optional] |
|**outputTokenDetails** | [**OutputTokenDetails**](OutputTokenDetails.md) |  |  [optional] |



