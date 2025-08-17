

# BodyParamsForRunSchema

Query params for run endpoints.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **List&lt;UUID&gt;** |  |  [optional] |
|**trace** | **UUID** |  |  [optional] |
|**parentRun** | **UUID** |  |  [optional] |
|**runType** | **RunTypeEnum** |  |  [optional] |
|**session** | **List&lt;UUID&gt;** |  |  [optional] |
|**referenceExample** | **List&lt;UUID&gt;** |  |  [optional] |
|**executionOrder** | **Integer** |  |  [optional] |
|**startTime** | **OffsetDateTime** |  |  [optional] |
|**endTime** | **OffsetDateTime** |  |  [optional] |
|**error** | **Boolean** |  |  [optional] |
|**query** | **String** |  |  [optional] |
|**filter** | **String** |  |  [optional] |
|**traceFilter** | **String** |  |  [optional] |
|**treeFilter** | **String** |  |  [optional] |
|**isRoot** | **Boolean** |  |  [optional] |
|**dataSourceType** | **RunsFilterDataSourceTypeEnum** |  |  [optional] |
|**skipPagination** | **Boolean** |  |  [optional] |
|**searchFilter** | **String** |  |  [optional] |
|**useExperimentalSearch** | **Boolean** |  |  [optional] |
|**cursor** | **String** |  |  [optional] |
|**limit** | **Integer** |  |  [optional] |
|**select** | **List&lt;RunSelect&gt;** |  |  [optional] |
|**order** | **RunDateOrder** |  |  [optional] |
|**skipPrevCursor** | **Boolean** |  |  [optional] |



