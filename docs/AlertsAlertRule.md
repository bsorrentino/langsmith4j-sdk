

# AlertsAlertRule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aggregation** | [**AggregationEnum**](#AggregationEnum) |  |  |
|**attribute** | [**AttributeEnum**](#AttributeEnum) |  |  |
|**createdAt** | **String** |  |  [optional] |
|**denominatorFilter** | **String** |  |  [optional] |
|**description** | **String** |  |  |
|**filter** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**name** | **String** |  |  |
|**operator** | [**OperatorEnum**](#OperatorEnum) |  |  |
|**threshold** | **BigDecimal** |  |  [optional] |
|**thresholdMultiplier** | **BigDecimal** |  |  [optional] |
|**thresholdWindowMinutes** | **Integer** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**updatedAt** | **String** |  |  [optional] |
|**windowMinutes** | **Integer** | max 15 minutes for alert rule |  |



## Enum: AggregationEnum

| Name | Value |
|---- | -----|
| AVG | &quot;avg&quot; |
| SUM | &quot;sum&quot; |
| PCT | &quot;pct&quot; |



## Enum: AttributeEnum

| Name | Value |
|---- | -----|
| LATENCY | &quot;latency&quot; |
| ERROR_COUNT | &quot;error_count&quot; |
| FEEDBACK_SCORE | &quot;feedback_score&quot; |
| RUN_LATENCY | &quot;run_latency&quot; |
| RUN_COUNT | &quot;run_count&quot; |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| GTE | &quot;gte&quot; |
| LTE | &quot;lte&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| THRESHOLD | &quot;threshold&quot; |
| CHANGE | &quot;change&quot; |



