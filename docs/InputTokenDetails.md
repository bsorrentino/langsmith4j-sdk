

# InputTokenDetails

Breakdown of input token counts.  Does *not* need to sum to full input token count. Does *not* need to have all keys.  Example:      .. code-block:: python          {             \"audio\": 10,             \"cache_creation\": 200,             \"cache_read\": 100,         }  .. versionadded:: 0.3.9  May also hold extra provider-specific keys.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**audio** | **Integer** |  |  [optional] |
|**cacheCreation** | **Integer** |  |  [optional] |
|**cacheRead** | **Integer** |  |  [optional] |



