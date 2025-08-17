

# RunRulesCreateSchema


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayName** | **String** |  |  |
|**sessionId** | **UUID** |  |  [optional] |
|**isEnabled** | **Boolean** |  |  [optional] |
|**datasetId** | **UUID** |  |  [optional] |
|**samplingRate** | **BigDecimal** |  |  |
|**filter** | **String** |  |  [optional] |
|**traceFilter** | **String** |  |  [optional] |
|**treeFilter** | **String** |  |  [optional] |
|**backfillFrom** | **OffsetDateTime** |  |  [optional] |
|**useCorrectionsDataset** | **Boolean** |  |  [optional] |
|**numFewShotExamples** | **Integer** |  |  [optional] |
|**extendOnly** | **Boolean** |  |  [optional] |
|**_transient** | **Boolean** |  |  [optional] |
|**addToAnnotationQueueId** | **UUID** |  |  [optional] |
|**addToDatasetId** | **UUID** |  |  [optional] |
|**addToDatasetPreferCorrection** | **Boolean** |  |  [optional] |
|**evaluators** | [**List&lt;EvaluatorTopLevel&gt;**](EvaluatorTopLevel.md) |  |  [optional] |
|**codeEvaluators** | [**List&lt;CodeEvaluatorTopLevel&gt;**](CodeEvaluatorTopLevel.md) |  |  [optional] |
|**alerts** | [**List&lt;RunRulesPagerdutyAlertSchema&gt;**](RunRulesPagerdutyAlertSchema.md) |  |  [optional] |
|**webhooks** | [**List&lt;RunRulesWebhookSchema&gt;**](RunRulesWebhookSchema.md) |  |  [optional] |
|**evaluatorVersion** | **Integer** |  |  [optional] |
|**createAlignmentQueue** | **Boolean** |  |  [optional] |
|**includeExtendedStats** | **Boolean** |  |  [optional] |



