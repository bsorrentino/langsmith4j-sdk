

# PromptOptimizationJobWithLogs


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**repoId** | **UUID** |  |  |
|**status** | **EPromptOptimizationJobStatus** |  |  |
|**tenantId** | **UUID** |  |  |
|**algorithm** | **EPromptOptimizationAlgorithm** |  |  |
|**config** | [**Config**](Config.md) |  |  |
|**results** | [**List&lt;PromptOptimizationResult&gt;**](PromptOptimizationResult.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**logs** | [**List&lt;PromptOptimizationJobLog&gt;**](PromptOptimizationJobLog.md) |  |  |



