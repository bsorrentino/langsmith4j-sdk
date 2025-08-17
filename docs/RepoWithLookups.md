

# RepoWithLookups

All database fields for repos, plus helpful computed fields.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**repoHandle** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**readme** | **String** |  |  [optional] |
|**id** | **UUID** |  |  |
|**tenantId** | **UUID** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**isPublic** | **Boolean** |  |  |
|**isArchived** | **Boolean** |  |  |
|**tags** | **List&lt;String&gt;** |  |  |
|**originalRepoId** | **UUID** |  |  [optional] |
|**upstreamRepoId** | **UUID** |  |  [optional] |
|**owner** | **String** |  |  |
|**fullName** | **String** |  |  |
|**numLikes** | **Integer** |  |  |
|**numDownloads** | **Integer** |  |  |
|**numViews** | **Integer** |  |  |
|**likedByAuthUser** | **Boolean** |  |  [optional] |
|**lastCommitHash** | **String** |  |  [optional] |
|**numCommits** | **Integer** |  |  |
|**originalRepoFullName** | **String** |  |  [optional] |
|**upstreamRepoFullName** | **String** |  |  [optional] |
|**latestCommitManifest** | [**CommitManifestResponse**](CommitManifestResponse.md) |  |  [optional] |



