

# ModelPriceMapCreateSchema

Model price map create schema.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**startTime** | **OffsetDateTime** |  |  [optional] |
|**matchPath** | **List&lt;String&gt;** |  |  [optional] |
|**matchPattern** | **String** |  |  |
|**promptCost** | [**PromptCost**](PromptCost.md) |  |  |
|**completionCost** | [**CompletionCost**](CompletionCost.md) |  |  |
|**promptCostDetails** | [**Map&lt;String, ModelPriceMapCreateSchemaPromptCostDetailsValue&gt;**](ModelPriceMapCreateSchemaPromptCostDetailsValue.md) |  |  [optional] |
|**completionCostDetails** | [**Map&lt;String, ModelPriceMapCreateSchemaCompletionCostDetailsValue&gt;**](ModelPriceMapCreateSchemaCompletionCostDetailsValue.md) |  |  [optional] |
|**provider** | **String** |  |  [optional] |



