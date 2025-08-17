

# RunsRun


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dottedOrder** | **String** |  |  [optional] |
|**endTime** | **String** |  |  [optional] |
|**error** | **String** |  |  [optional] |
|**events** | **List&lt;Map&lt;String, Object&gt;&gt;** |  |  [optional] |
|**extra** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**inputAttachments** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**inputs** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**outputAttachments** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**outputs** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**parentRunId** | **String** |  |  [optional] |
|**referenceExampleId** | **String** |  |  [optional] |
|**runType** | [**RunTypeEnum**](#RunTypeEnum) |  |  [optional] |
|**serialized** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**sessionId** | **String** |  |  [optional] |
|**sessionName** | **String** |  |  [optional] |
|**startTime** | **String** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**traceId** | **String** |  |  [optional] |



## Enum: RunTypeEnum

| Name | Value |
|---- | -----|
| TOOL | &quot;tool&quot; |
| CHAIN | &quot;chain&quot; |
| LLM | &quot;llm&quot; |
| RETRIEVER | &quot;retriever&quot; |
| EMBEDDING | &quot;embedding&quot; |
| PROMPT | &quot;prompt&quot; |
| PARSER | &quot;parser&quot; |



