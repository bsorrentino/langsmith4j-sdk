

# AnnotationQueueCreateSchema

AnnotationQueue schema.

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
|**id** | **UUID** |  |  [optional] |
|**rubricItems** | [**List&lt;AnnotationQueueRubricItemSchema&gt;**](AnnotationQueueRubricItemSchema.md) |  |  [optional] |
|**rubricInstructions** | **String** |  |  [optional] |
|**sessionIds** | **List&lt;UUID&gt;** |  |  [optional] |



