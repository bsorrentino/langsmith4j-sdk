

# APIKeyCreateRequest

API key POST schema.  expires_at: Optional datetime when the API key will expire. workspaces: List of workspace UUIDs this key can access (feature-flagged). role_id: Optional UUID of the role to assign to API key.     If not provided, uses default role based on read_only flag:     - WORKSPACE_ADMIN if read_only is False     - WORKSPACE_READER if read_only is True

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**readOnly** | **Boolean** |  |  [optional] |
|**expiresAt** | **OffsetDateTime** |  |  [optional] |
|**workspaces** | **List&lt;UUID&gt;** |  |  [optional] |
|**roleId** | **UUID** |  |  [optional] |



