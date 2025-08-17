

# RunStatsGroupBySeriesResponse

Include additional information about where the group_by param was set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attribute** | [**AttributeEnum**](#AttributeEnum) |  |  |
|**path** | **String** |  |  [optional] |
|**maxGroups** | **Integer** |  |  [optional] |
|**setBy** | [**SetByEnum**](#SetByEnum) |  |  [optional] |



## Enum: AttributeEnum

| Name | Value |
|---- | -----|
| NAME | &quot;name&quot; |
| RUN_TYPE | &quot;run_type&quot; |
| TAG | &quot;tag&quot; |
| METADATA | &quot;metadata&quot; |



## Enum: SetByEnum

| Name | Value |
|---- | -----|
| SECTION | &quot;section&quot; |
| SERIES | &quot;series&quot; |



