

# RunSchema

Run schema.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**inputs** | **Object** |  |  [optional] |
|**inputsPreview** | **String** |  |  [optional] |
|**runType** | **RunTypeEnum** |  |  |
|**startTime** | **OffsetDateTime** |  |  [optional] |
|**endTime** | **OffsetDateTime** |  |  [optional] |
|**extra** | **Object** |  |  [optional] |
|**error** | **String** |  |  [optional] |
|**executionOrder** | **Integer** |  |  [optional] |
|**serialized** | **Object** |  |  [optional] |
|**outputs** | **Object** |  |  [optional] |
|**outputsPreview** | **String** |  |  [optional] |
|**parentRunId** | **UUID** |  |  [optional] |
|**manifestId** | **UUID** |  |  [optional] |
|**manifestS3Id** | **UUID** |  |  [optional] |
|**events** | **List&lt;Object&gt;** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**inputsS3Urls** | **Object** |  |  [optional] |
|**outputsS3Urls** | **Object** |  |  [optional] |
|**s3Urls** | **Object** |  |  [optional] |
|**traceId** | **UUID** |  |  |
|**dottedOrder** | **String** |  |  |
|**id** | **UUID** |  |  |
|**status** | **String** |  |  |
|**childRunIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**directChildRunIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**parentRunIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**feedbackStats** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**referenceExampleId** | **UUID** |  |  [optional] |
|**totalTokens** | **Integer** |  |  [optional] |
|**promptTokens** | **Integer** |  |  [optional] |
|**completionTokens** | **Integer** |  |  [optional] |
|**promptTokenDetails** | **Map&lt;String, Integer&gt;** |  |  [optional] |
|**completionTokenDetails** | **Map&lt;String, Integer&gt;** |  |  [optional] |
|**totalCost** | **String** |  |  [optional] |
|**promptCost** | **String** |  |  [optional] |
|**completionCost** | **String** |  |  [optional] |
|**promptCostDetails** | **Map&lt;String, String&gt;** |  |  [optional] |
|**completionCostDetails** | **Map&lt;String, String&gt;** |  |  [optional] |
|**priceModelId** | **UUID** |  |  [optional] |
|**firstTokenTime** | **OffsetDateTime** |  |  [optional] |
|**sessionId** | **UUID** |  |  |
|**appPath** | **String** |  |  |
|**lastQueuedAt** | **OffsetDateTime** |  |  [optional] |
|**inDataset** | **Boolean** |  |  [optional] |
|**shareToken** | **UUID** |  |  [optional] |
|**traceTier** | **TraceTier** |  |  [optional] |
|**traceFirstReceivedAt** | **OffsetDateTime** |  |  [optional] |
|**ttlSeconds** | **Integer** |  |  [optional] |
|**traceUpgrade** | **Boolean** |  |  [optional] |
|**referenceDatasetId** | **UUID** |  |  [optional] |
|**threadId** | **String** |  |  [optional] |



