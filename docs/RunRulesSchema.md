

# RunRulesSchema

Run rules schema.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**tenantId** | **UUID** |  |  |
|**isEnabled** | **Boolean** |  |  [optional] |
|**sessionId** | **UUID** |  |  [optional] |
|**sessionName** | **String** |  |  [optional] |
|**datasetId** | **UUID** |  |  [optional] |
|**datasetName** | **String** |  |  [optional] |
|**displayName** | **String** |  |  |
|**samplingRate** | **BigDecimal** |  |  |
|**filter** | **String** |  |  [optional] |
|**traceFilter** | **String** |  |  [optional] |
|**treeFilter** | **String** |  |  [optional] |
|**addToAnnotationQueueId** | **UUID** |  |  [optional] |
|**addToAnnotationQueueName** | **String** |  |  [optional] |
|**addToDatasetId** | **UUID** |  |  [optional] |
|**addToDatasetName** | **String** |  |  [optional] |
|**addToDatasetPreferCorrection** | **Boolean** |  |  [optional] |
|**correctionsDatasetId** | **UUID** |  |  [optional] |
|**useCorrectionsDataset** | **Boolean** |  |  [optional] |
|**numFewShotExamples** | **Integer** |  |  [optional] |
|**evaluators** | [**List&lt;EvaluatorTopLevel&gt;**](EvaluatorTopLevel.md) |  |  [optional] |
|**codeEvaluators** | [**List&lt;CodeEvaluatorTopLevel&gt;**](CodeEvaluatorTopLevel.md) |  |  [optional] |
|**alerts** | [**List&lt;RunRulesPagerdutyAlertSchema&gt;**](RunRulesPagerdutyAlertSchema.md) |  |  [optional] |
|**webhooks** | [**List&lt;RunRulesWebhookSchema&gt;**](RunRulesWebhookSchema.md) |  |  |
|**extendOnly** | **Boolean** |  |  [optional] |
|**includeExtendedStats** | **Boolean** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**backfillFrom** | **OffsetDateTime** |  |  [optional] |
|**_transient** | **Boolean** |  |  [optional] |
|**evaluatorVersion** | **Integer** |  |  |
|**evaluatorId** | **UUID** |  |  [optional] |
|**alignmentAnnotationQueueId** | **UUID** |  |  [optional] |



