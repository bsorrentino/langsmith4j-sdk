

# FeedbackSchema

Schema for getting feedback.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**modifiedAt** | **OffsetDateTime** |  |  [optional] |
|**key** | **String** |  |  |
|**score** | [**Score**](Score.md) |  |  [optional] |
|**value** | [**Value1**](Value1.md) |  |  [optional] |
|**comment** | **String** |  |  [optional] |
|**correction** | [**Correction**](Correction.md) |  |  [optional] |
|**feedbackGroupId** | **UUID** |  |  [optional] |
|**comparativeExperimentId** | **UUID** |  |  [optional] |
|**runId** | **UUID** |  |  [optional] |
|**sessionId** | **UUID** |  |  [optional] |
|**id** | **UUID** |  |  |
|**traceId** | **UUID** |  |  [optional] |
|**startTime** | **OffsetDateTime** |  |  [optional] |
|**feedbackSource** | [**FeedbackSource**](FeedbackSource.md) |  |  [optional] |
|**extra** | **Object** |  |  [optional] |



