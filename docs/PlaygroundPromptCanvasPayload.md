

# PlaygroundPromptCanvasPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messages** | [**List&lt;PlaygroundPromptCanvasPayloadMessagesInner&gt;**](PlaygroundPromptCanvasPayloadMessagesInner.md) |  |  |
|**highlighted** | [**Highlight**](Highlight.md) |  |  [optional] |
|**artifact** | [**Artifact**](Artifact.md) |  |  [optional] |
|**artifactLength** | [**ArtifactLengthEnum**](#ArtifactLengthEnum) |  |  [optional] |
|**readingLevel** | [**ReadingLevelEnum**](#ReadingLevelEnum) |  |  [optional] |
|**customAction** | **String** |  |  [optional] |
|**templateFormat** | [**TemplateFormatEnum**](#TemplateFormatEnum) |  |  |
|**secrets** | **Map&lt;String, String&gt;** |  |  |



## Enum: ArtifactLengthEnum

| Name | Value |
|---- | -----|
| SHORTEST | &quot;shortest&quot; |
| SHORT | &quot;short&quot; |
| LONG | &quot;long&quot; |
| LONGEST | &quot;longest&quot; |



## Enum: ReadingLevelEnum

| Name | Value |
|---- | -----|
| CHILD | &quot;child&quot; |
| TEENAGER | &quot;teenager&quot; |
| COLLEGE | &quot;college&quot; |
| PHD | &quot;phd&quot; |



## Enum: TemplateFormatEnum

| Name | Value |
|---- | -----|
| F_STRING | &quot;f-string&quot; |
| MUSTACHE | &quot;mustache&quot; |



