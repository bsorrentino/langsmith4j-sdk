

# DatasetPublicSchema

Public schema for datasets.  Doesn't currently include session counts/stats since public test project sharing is not yet shipped

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
|**exampleCount** | **Integer** |  |  |



