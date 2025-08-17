

# OrganizationPGSchemaSlim

Schema for an organization in postgres for list views.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**displayName** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**createdByUserId** | **UUID** |  |  [optional] |
|**createdByLsUserId** | **UUID** |  |  [optional] |
|**modifiedAt** | **OffsetDateTime** |  |  [optional] |
|**isPersonal** | **Boolean** |  |  |
|**disabled** | **Boolean** |  |  |
|**ssoLoginSlug** | **String** |  |  [optional] |
|**ssoOnly** | **Boolean** |  |  [optional] |
|**jitProvisioningEnabled** | **Boolean** |  |  [optional] |
|**publicSharingDisabled** | **Boolean** |  |  [optional] |



