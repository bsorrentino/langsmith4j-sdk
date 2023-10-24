

# RunCreateSchema

Create class for a Run object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**inputs** | **Object** |  |  [optional] |
|**runType** | **RunTypeEnum** |  |  |
|**startTime** | **OffsetDateTime** |  |  [optional] |
|**endTime** | **OffsetDateTime** |  |  [optional] |
|**extra** | **Object** |  |  [optional] |
|**error** | **String** |  |  [optional] |
|**executionOrder** | **Integer** |  |  [optional] |
|**serialized** | **Object** |  |  [optional] |
|**outputs** | **Object** |  |  [optional] |
|**parentRunId** | **UUID** |  |  [optional] |
|**manifestId** | **UUID** |  |  [optional] |
|**events** | **List&lt;Object&gt;** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**sessionId** | **UUID** |  |  [optional] |
|**sessionName** | **String** |  |  [optional] |
|**childRuns** | [**List&lt;RunCreateSchema&gt;**](RunCreateSchema.md) |  |  [optional] |
|**referenceExampleId** | **UUID** |  |  [optional] |



