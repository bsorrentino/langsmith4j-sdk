

# FeedbackCreateCoreSchema

Schema used for creating feedback without run id or session id.

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
|**id** | **UUID** |  |  [optional] |
|**feedbackSource** | [**FeedbackSource**](FeedbackSource.md) |  |  [optional] |
|**feedbackConfig** | [**FeedbackConfig**](FeedbackConfig.md) |  |  [optional] |
|**extra** | **Object** |  |  [optional] |



