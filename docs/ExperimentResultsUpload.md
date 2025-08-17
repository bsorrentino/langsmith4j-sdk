

# ExperimentResultsUpload

Class for uploading the results of an already-run experiment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**experimentName** | **String** |  |  |
|**experimentDescription** | **String** |  |  [optional] |
|**datasetId** | **UUID** |  |  [optional] |
|**datasetName** | **String** |  |  [optional] |
|**datasetDescription** | **String** |  |  [optional] |
|**summaryExperimentScores** | [**List&lt;FeedbackCreateCoreSchema&gt;**](FeedbackCreateCoreSchema.md) |  |  [optional] |
|**results** | [**List&lt;ExperimentResultRow&gt;**](ExperimentResultRow.md) |  |  |
|**experimentStartTime** | **OffsetDateTime** |  |  |
|**experimentEndTime** | **OffsetDateTime** |  |  |
|**experimentMetadata** | **Object** |  |  [optional] |



