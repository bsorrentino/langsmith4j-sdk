

# TracerSession

TracerSession schema.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startTime** | **OffsetDateTime** |  |  [optional] |
|**endTime** | **OffsetDateTime** |  |  [optional] |
|**extra** | **Object** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**defaultDatasetId** | **UUID** |  |  [optional] |
|**referenceDatasetId** | **UUID** |  |  [optional] |
|**traceTier** | **TraceTier** |  |  [optional] |
|**id** | **UUID** |  |  |
|**runCount** | **Integer** |  |  [optional] |
|**latencyP50** | **BigDecimal** |  |  [optional] |
|**latencyP99** | **BigDecimal** |  |  [optional] |
|**firstTokenP50** | **BigDecimal** |  |  [optional] |
|**firstTokenP99** | **BigDecimal** |  |  [optional] |
|**totalTokens** | **Integer** |  |  [optional] |
|**promptTokens** | **Integer** |  |  [optional] |
|**completionTokens** | **Integer** |  |  [optional] |
|**totalCost** | **String** |  |  [optional] |
|**promptCost** | **String** |  |  [optional] |
|**completionCost** | **String** |  |  [optional] |
|**tenantId** | **UUID** |  |  |
|**lastRunStartTime** | **OffsetDateTime** |  |  [optional] |
|**lastRunStartTimeLive** | **OffsetDateTime** |  |  [optional] |
|**feedbackStats** | **Object** |  |  [optional] |
|**sessionFeedbackStats** | **Object** |  |  [optional] |
|**runFacets** | **List&lt;Object&gt;** |  |  [optional] |
|**errorRate** | **BigDecimal** |  |  [optional] |
|**streamingRate** | **BigDecimal** |  |  [optional] |
|**testRunNumber** | **Integer** |  |  [optional] |



