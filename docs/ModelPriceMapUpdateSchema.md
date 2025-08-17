

# ModelPriceMapUpdateSchema

Model price map update schema.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**startTime** | **OffsetDateTime** |  |  [optional] |
|**matchPath** | **List&lt;String&gt;** |  |  [optional] |
|**matchPattern** | **String** |  |  |
|**promptCost** | [**PromptCost1**](PromptCost1.md) |  |  |
|**completionCost** | [**CompletionCost1**](CompletionCost1.md) |  |  |
|**promptCostDetails** | [**Map&lt;String, ModelPriceMapCreateSchemaCompletionCostDetailsValue&gt;**](ModelPriceMapCreateSchemaCompletionCostDetailsValue.md) |  |  [optional] |
|**completionCostDetails** | [**Map&lt;String, ModelPriceMapCreateSchemaCompletionCostDetailsValue&gt;**](ModelPriceMapCreateSchemaCompletionCostDetailsValue.md) |  |  [optional] |
|**provider** | **String** |  |  [optional] |



