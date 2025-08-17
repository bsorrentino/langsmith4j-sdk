

# CommitWithLookups

All database fields for commits, plus helpful computed fields and user info for private prompts.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**manifest** | **Object** |  |  |
|**repoId** | **UUID** |  |  |
|**parentId** | **UUID** |  |  [optional] |
|**commitHash** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**exampleRunIds** | **List&lt;UUID&gt;** |  |  |
|**numDownloads** | **Integer** |  |  |
|**numViews** | **Integer** |  |  |
|**parentCommitHash** | **String** |  |  [optional] |
|**fullName** | **String** |  |  [optional] |



