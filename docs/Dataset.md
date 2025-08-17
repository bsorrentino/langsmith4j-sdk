

# Dataset

Dataset schema.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**inputsSchemaDefinition** | **Object** |  |  [optional] |
|**outputsSchemaDefinition** | **Object** |  |  [optional] |
|**externallyManaged** | **Boolean** |  |  [optional] |
|**transformations** | [**List&lt;DatasetTransformation&gt;**](DatasetTransformation.md) |  |  [optional] |
|**dataType** | **DataType** |  |  [optional] |
|**id** | **UUID** |  |  |
|**tenantId** | **UUID** |  |  |
|**exampleCount** | **Integer** |  |  |
|**sessionCount** | **Integer** |  |  |
|**modifiedAt** | **OffsetDateTime** |  |  |
|**lastSessionStartTime** | **OffsetDateTime** |  |  [optional] |



