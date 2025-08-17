

# AnnotationQueueSchemaWithRubric

AnnotationQueue schema with rubric.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**defaultDataset** | **UUID** |  |  [optional] |
|**numReviewersPerItem** | **Integer** |  |  [optional] |
|**enableReservations** | **Boolean** |  |  [optional] |
|**reservationMinutes** | **Integer** |  |  [optional] |
|**id** | **UUID** |  |  |
|**tenantId** | **UUID** |  |  |
|**sourceRuleId** | **UUID** |  |  [optional] |
|**runRuleId** | **UUID** |  |  [optional] |
|**rubricItems** | [**List&lt;AnnotationQueueRubricItemSchema&gt;**](AnnotationQueueRubricItemSchema.md) |  |  [optional] |
|**rubricInstructions** | **String** |  |  [optional] |



