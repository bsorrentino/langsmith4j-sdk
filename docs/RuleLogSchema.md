

# RuleLogSchema

Run rules log schema.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ruleId** | **UUID** |  |  |
|**runId** | **UUID** |  |  |
|**runName** | **String** |  |  [optional] |
|**runType** | **String** |  |  [optional] |
|**runSessionId** | **UUID** |  |  [optional] |
|**startTime** | **OffsetDateTime** |  |  |
|**endTime** | **OffsetDateTime** |  |  |
|**applicationTime** | **OffsetDateTime** |  |  [optional] |
|**addToAnnotationQueue** | [**RuleLogActionResponse**](RuleLogActionResponse.md) |  |  [optional] |
|**addToDataset** | [**RuleLogActionResponse**](RuleLogActionResponse.md) |  |  [optional] |
|**evaluators** | [**RuleLogActionResponse**](RuleLogActionResponse.md) |  |  [optional] |
|**alerts** | [**RuleLogActionResponse**](RuleLogActionResponse.md) |  |  [optional] |
|**webhooks** | [**RuleLogActionResponse**](RuleLogActionResponse.md) |  |  [optional] |



