# RunApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRuleApiV1RunsRulesPost**](RunApi.md#createRuleApiV1RunsRulesPost) | **POST** /api/v1/runs/rules | Create Rule |
| [**createRuleApiV1RunsRulesPostWithHttpInfo**](RunApi.md#createRuleApiV1RunsRulesPostWithHttpInfo) | **POST** /api/v1/runs/rules | Create Rule |
| [**deleteRuleApiV1RunsRulesRuleIdDelete**](RunApi.md#deleteRuleApiV1RunsRulesRuleIdDelete) | **DELETE** /api/v1/runs/rules/{rule_id} | Delete Rule |
| [**deleteRuleApiV1RunsRulesRuleIdDeleteWithHttpInfo**](RunApi.md#deleteRuleApiV1RunsRulesRuleIdDeleteWithHttpInfo) | **DELETE** /api/v1/runs/rules/{rule_id} | Delete Rule |
| [**deleteRunsApiV1RunsDeletePost**](RunApi.md#deleteRunsApiV1RunsDeletePost) | **POST** /api/v1/runs/delete | Delete Runs |
| [**deleteRunsApiV1RunsDeletePostWithHttpInfo**](RunApi.md#deleteRunsApiV1RunsDeletePostWithHttpInfo) | **POST** /api/v1/runs/delete | Delete Runs |
| [**generateQueryForRunsApiV1RunsGenerateQueryPost**](RunApi.md#generateQueryForRunsApiV1RunsGenerateQueryPost) | **POST** /api/v1/runs/generate-query | Generate Query For Runs |
| [**generateQueryForRunsApiV1RunsGenerateQueryPostWithHttpInfo**](RunApi.md#generateQueryForRunsApiV1RunsGenerateQueryPostWithHttpInfo) | **POST** /api/v1/runs/generate-query | Generate Query For Runs |
| [**getLastAppliedRuleApiV1RunsRulesRuleIdLastAppliedGet**](RunApi.md#getLastAppliedRuleApiV1RunsRulesRuleIdLastAppliedGet) | **GET** /api/v1/runs/rules/{rule_id}/last_applied | Get Last Applied Rule |
| [**getLastAppliedRuleApiV1RunsRulesRuleIdLastAppliedGetWithHttpInfo**](RunApi.md#getLastAppliedRuleApiV1RunsRulesRuleIdLastAppliedGetWithHttpInfo) | **GET** /api/v1/runs/rules/{rule_id}/last_applied | Get Last Applied Rule |
| [**groupRunsApiV1RunsGroupPost**](RunApi.md#groupRunsApiV1RunsGroupPost) | **POST** /api/v1/runs/group | Group Runs |
| [**groupRunsApiV1RunsGroupPostWithHttpInfo**](RunApi.md#groupRunsApiV1RunsGroupPostWithHttpInfo) | **POST** /api/v1/runs/group | Group Runs |
| [**listRuleLogsApiV1RunsRulesRuleIdLogsGet**](RunApi.md#listRuleLogsApiV1RunsRulesRuleIdLogsGet) | **GET** /api/v1/runs/rules/{rule_id}/logs | List Rule Logs |
| [**listRuleLogsApiV1RunsRulesRuleIdLogsGetWithHttpInfo**](RunApi.md#listRuleLogsApiV1RunsRulesRuleIdLogsGetWithHttpInfo) | **GET** /api/v1/runs/rules/{rule_id}/logs | List Rule Logs |
| [**listRulesApiV1RunsRulesGet**](RunApi.md#listRulesApiV1RunsRulesGet) | **GET** /api/v1/runs/rules | List Rules |
| [**listRulesApiV1RunsRulesGetWithHttpInfo**](RunApi.md#listRulesApiV1RunsRulesGetWithHttpInfo) | **GET** /api/v1/runs/rules | List Rules |
| [**queryRunsApiV1RunsQueryPost**](RunApi.md#queryRunsApiV1RunsQueryPost) | **POST** /api/v1/runs/query | Query Runs |
| [**queryRunsApiV1RunsQueryPostWithHttpInfo**](RunApi.md#queryRunsApiV1RunsQueryPostWithHttpInfo) | **POST** /api/v1/runs/query | Query Runs |
| [**readRunApiV1RunsRunIdGet**](RunApi.md#readRunApiV1RunsRunIdGet) | **GET** /api/v1/runs/{run_id} | Read Run |
| [**readRunApiV1RunsRunIdGetWithHttpInfo**](RunApi.md#readRunApiV1RunsRunIdGetWithHttpInfo) | **GET** /api/v1/runs/{run_id} | Read Run |
| [**readRunShareStateApiV1RunsRunIdShareGet**](RunApi.md#readRunShareStateApiV1RunsRunIdShareGet) | **GET** /api/v1/runs/{run_id}/share | Read Run Share State |
| [**readRunShareStateApiV1RunsRunIdShareGetWithHttpInfo**](RunApi.md#readRunShareStateApiV1RunsRunIdShareGetWithHttpInfo) | **GET** /api/v1/runs/{run_id}/share | Read Run Share State |
| [**shareRunApiV1RunsRunIdSharePut**](RunApi.md#shareRunApiV1RunsRunIdSharePut) | **PUT** /api/v1/runs/{run_id}/share | Share Run |
| [**shareRunApiV1RunsRunIdSharePutWithHttpInfo**](RunApi.md#shareRunApiV1RunsRunIdSharePutWithHttpInfo) | **PUT** /api/v1/runs/{run_id}/share | Share Run |
| [**statsGroupRunsApiV1RunsGroupStatsPost**](RunApi.md#statsGroupRunsApiV1RunsGroupStatsPost) | **POST** /api/v1/runs/group/stats | Stats Group Runs |
| [**statsGroupRunsApiV1RunsGroupStatsPostWithHttpInfo**](RunApi.md#statsGroupRunsApiV1RunsGroupStatsPostWithHttpInfo) | **POST** /api/v1/runs/group/stats | Stats Group Runs |
| [**statsRunsApiV1RunsStatsPost**](RunApi.md#statsRunsApiV1RunsStatsPost) | **POST** /api/v1/runs/stats | Stats Runs |
| [**statsRunsApiV1RunsStatsPostWithHttpInfo**](RunApi.md#statsRunsApiV1RunsStatsPostWithHttpInfo) | **POST** /api/v1/runs/stats | Stats Runs |
| [**triggerRuleApiV1RunsRulesRuleIdTriggerPost**](RunApi.md#triggerRuleApiV1RunsRulesRuleIdTriggerPost) | **POST** /api/v1/runs/rules/{rule_id}/trigger | Trigger Rule |
| [**triggerRuleApiV1RunsRulesRuleIdTriggerPostWithHttpInfo**](RunApi.md#triggerRuleApiV1RunsRulesRuleIdTriggerPostWithHttpInfo) | **POST** /api/v1/runs/rules/{rule_id}/trigger | Trigger Rule |
| [**triggerRulesApiV1RunsRulesTriggerPost**](RunApi.md#triggerRulesApiV1RunsRulesTriggerPost) | **POST** /api/v1/runs/rules/trigger | Trigger Rules |
| [**triggerRulesApiV1RunsRulesTriggerPostWithHttpInfo**](RunApi.md#triggerRulesApiV1RunsRulesTriggerPostWithHttpInfo) | **POST** /api/v1/runs/rules/trigger | Trigger Rules |
| [**unshareRunApiV1RunsRunIdShareDelete**](RunApi.md#unshareRunApiV1RunsRunIdShareDelete) | **DELETE** /api/v1/runs/{run_id}/share | Unshare Run |
| [**unshareRunApiV1RunsRunIdShareDeleteWithHttpInfo**](RunApi.md#unshareRunApiV1RunsRunIdShareDeleteWithHttpInfo) | **DELETE** /api/v1/runs/{run_id}/share | Unshare Run |
| [**updateRuleApiV1RunsRulesRuleIdPatch**](RunApi.md#updateRuleApiV1RunsRulesRuleIdPatch) | **PATCH** /api/v1/runs/rules/{rule_id} | Update Rule |
| [**updateRuleApiV1RunsRulesRuleIdPatchWithHttpInfo**](RunApi.md#updateRuleApiV1RunsRulesRuleIdPatchWithHttpInfo) | **PATCH** /api/v1/runs/rules/{rule_id} | Update Rule |
| [**updateRunApiV1RunsRunIdPatch**](RunApi.md#updateRunApiV1RunsRunIdPatch) | **PATCH** /api/v1/runs/{run_id} | Update Run |
| [**updateRunApiV1RunsRunIdPatchWithHttpInfo**](RunApi.md#updateRunApiV1RunsRunIdPatchWithHttpInfo) | **PATCH** /api/v1/runs/{run_id} | Update Run |



## createRuleApiV1RunsRulesPost

> CompletableFuture<RunRulesSchema> createRuleApiV1RunsRulesPost(runRulesCreateSchema)

Create Rule

Create a new run rule.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        RunRulesCreateSchema runRulesCreateSchema = new RunRulesCreateSchema(); // RunRulesCreateSchema | 
        try {
            CompletableFuture<RunRulesSchema> result = apiInstance.createRuleApiV1RunsRulesPost(runRulesCreateSchema);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#createRuleApiV1RunsRulesPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runRulesCreateSchema** | [**RunRulesCreateSchema**](RunRulesCreateSchema.md)|  | |

### Return type

CompletableFuture<[**RunRulesSchema**](RunRulesSchema.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## createRuleApiV1RunsRulesPostWithHttpInfo

> CompletableFuture<ApiResponse<RunRulesSchema>> createRuleApiV1RunsRulesPost createRuleApiV1RunsRulesPostWithHttpInfo(runRulesCreateSchema)

Create Rule

Create a new run rule.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        RunRulesCreateSchema runRulesCreateSchema = new RunRulesCreateSchema(); // RunRulesCreateSchema | 
        try {
            CompletableFuture<ApiResponse<RunRulesSchema>> response = apiInstance.createRuleApiV1RunsRulesPostWithHttpInfo(runRulesCreateSchema);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunApi#createRuleApiV1RunsRulesPost");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#createRuleApiV1RunsRulesPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runRulesCreateSchema** | [**RunRulesCreateSchema**](RunRulesCreateSchema.md)|  | |

### Return type

CompletableFuture<ApiResponse<[**RunRulesSchema**](RunRulesSchema.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## deleteRuleApiV1RunsRulesRuleIdDelete

> CompletableFuture<Object> deleteRuleApiV1RunsRulesRuleIdDelete(ruleId)

Delete Rule

Delete a run rule.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID ruleId = UUID.randomUUID(); // UUID | 
        try {
            CompletableFuture<Object> result = apiInstance.deleteRuleApiV1RunsRulesRuleIdDelete(ruleId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#deleteRuleApiV1RunsRulesRuleIdDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleId** | **UUID**|  | |

### Return type

CompletableFuture<**Object**>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## deleteRuleApiV1RunsRulesRuleIdDeleteWithHttpInfo

> CompletableFuture<ApiResponse<Object>> deleteRuleApiV1RunsRulesRuleIdDelete deleteRuleApiV1RunsRulesRuleIdDeleteWithHttpInfo(ruleId)

Delete Rule

Delete a run rule.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID ruleId = UUID.randomUUID(); // UUID | 
        try {
            CompletableFuture<ApiResponse<Object>> response = apiInstance.deleteRuleApiV1RunsRulesRuleIdDeleteWithHttpInfo(ruleId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunApi#deleteRuleApiV1RunsRulesRuleIdDelete");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#deleteRuleApiV1RunsRulesRuleIdDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleId** | **UUID**|  | |

### Return type

CompletableFuture<ApiResponse<**Object**>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## deleteRunsApiV1RunsDeletePost

> CompletableFuture<Object> deleteRunsApiV1RunsDeletePost(bodyDeleteRunsApiV1RunsDeletePost)

Delete Runs

Delete specific runs by trace IDs or metadata key-value pairs.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        BodyDeleteRunsApiV1RunsDeletePost bodyDeleteRunsApiV1RunsDeletePost = new BodyDeleteRunsApiV1RunsDeletePost(); // BodyDeleteRunsApiV1RunsDeletePost | 
        try {
            CompletableFuture<Object> result = apiInstance.deleteRunsApiV1RunsDeletePost(bodyDeleteRunsApiV1RunsDeletePost);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#deleteRunsApiV1RunsDeletePost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bodyDeleteRunsApiV1RunsDeletePost** | [**BodyDeleteRunsApiV1RunsDeletePost**](BodyDeleteRunsApiV1RunsDeletePost.md)|  | [optional] |

### Return type

CompletableFuture<**Object**>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## deleteRunsApiV1RunsDeletePostWithHttpInfo

> CompletableFuture<ApiResponse<Object>> deleteRunsApiV1RunsDeletePost deleteRunsApiV1RunsDeletePostWithHttpInfo(bodyDeleteRunsApiV1RunsDeletePost)

Delete Runs

Delete specific runs by trace IDs or metadata key-value pairs.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        BodyDeleteRunsApiV1RunsDeletePost bodyDeleteRunsApiV1RunsDeletePost = new BodyDeleteRunsApiV1RunsDeletePost(); // BodyDeleteRunsApiV1RunsDeletePost | 
        try {
            CompletableFuture<ApiResponse<Object>> response = apiInstance.deleteRunsApiV1RunsDeletePostWithHttpInfo(bodyDeleteRunsApiV1RunsDeletePost);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunApi#deleteRunsApiV1RunsDeletePost");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#deleteRunsApiV1RunsDeletePost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bodyDeleteRunsApiV1RunsDeletePost** | [**BodyDeleteRunsApiV1RunsDeletePost**](BodyDeleteRunsApiV1RunsDeletePost.md)|  | [optional] |

### Return type

CompletableFuture<ApiResponse<**Object**>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## generateQueryForRunsApiV1RunsGenerateQueryPost

> CompletableFuture<ResponseBodyForRunsGenerateQuery> generateQueryForRunsApiV1RunsGenerateQueryPost(requestBodyForRunsGenerateQuery)

Generate Query For Runs

Get runs filter expression query for a given natural language query.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        RequestBodyForRunsGenerateQuery requestBodyForRunsGenerateQuery = new RequestBodyForRunsGenerateQuery(); // RequestBodyForRunsGenerateQuery | 
        try {
            CompletableFuture<ResponseBodyForRunsGenerateQuery> result = apiInstance.generateQueryForRunsApiV1RunsGenerateQueryPost(requestBodyForRunsGenerateQuery);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#generateQueryForRunsApiV1RunsGenerateQueryPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBodyForRunsGenerateQuery** | [**RequestBodyForRunsGenerateQuery**](RequestBodyForRunsGenerateQuery.md)|  | |

### Return type

CompletableFuture<[**ResponseBodyForRunsGenerateQuery**](ResponseBodyForRunsGenerateQuery.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## generateQueryForRunsApiV1RunsGenerateQueryPostWithHttpInfo

> CompletableFuture<ApiResponse<ResponseBodyForRunsGenerateQuery>> generateQueryForRunsApiV1RunsGenerateQueryPost generateQueryForRunsApiV1RunsGenerateQueryPostWithHttpInfo(requestBodyForRunsGenerateQuery)

Generate Query For Runs

Get runs filter expression query for a given natural language query.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        RequestBodyForRunsGenerateQuery requestBodyForRunsGenerateQuery = new RequestBodyForRunsGenerateQuery(); // RequestBodyForRunsGenerateQuery | 
        try {
            CompletableFuture<ApiResponse<ResponseBodyForRunsGenerateQuery>> response = apiInstance.generateQueryForRunsApiV1RunsGenerateQueryPostWithHttpInfo(requestBodyForRunsGenerateQuery);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunApi#generateQueryForRunsApiV1RunsGenerateQueryPost");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#generateQueryForRunsApiV1RunsGenerateQueryPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBodyForRunsGenerateQuery** | [**RequestBodyForRunsGenerateQuery**](RequestBodyForRunsGenerateQuery.md)|  | |

### Return type

CompletableFuture<ApiResponse<[**ResponseBodyForRunsGenerateQuery**](ResponseBodyForRunsGenerateQuery.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## getLastAppliedRuleApiV1RunsRulesRuleIdLastAppliedGet

> CompletableFuture<RuleLogSchema> getLastAppliedRuleApiV1RunsRulesRuleIdLastAppliedGet(ruleId)

Get Last Applied Rule

Get the last applied rule.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID ruleId = UUID.randomUUID(); // UUID | 
        try {
            CompletableFuture<RuleLogSchema> result = apiInstance.getLastAppliedRuleApiV1RunsRulesRuleIdLastAppliedGet(ruleId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#getLastAppliedRuleApiV1RunsRulesRuleIdLastAppliedGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleId** | **UUID**|  | |

### Return type

CompletableFuture<[**RuleLogSchema**](RuleLogSchema.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## getLastAppliedRuleApiV1RunsRulesRuleIdLastAppliedGetWithHttpInfo

> CompletableFuture<ApiResponse<RuleLogSchema>> getLastAppliedRuleApiV1RunsRulesRuleIdLastAppliedGet getLastAppliedRuleApiV1RunsRulesRuleIdLastAppliedGetWithHttpInfo(ruleId)

Get Last Applied Rule

Get the last applied rule.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID ruleId = UUID.randomUUID(); // UUID | 
        try {
            CompletableFuture<ApiResponse<RuleLogSchema>> response = apiInstance.getLastAppliedRuleApiV1RunsRulesRuleIdLastAppliedGetWithHttpInfo(ruleId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunApi#getLastAppliedRuleApiV1RunsRulesRuleIdLastAppliedGet");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#getLastAppliedRuleApiV1RunsRulesRuleIdLastAppliedGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleId** | **UUID**|  | |

### Return type

CompletableFuture<ApiResponse<[**RuleLogSchema**](RuleLogSchema.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## groupRunsApiV1RunsGroupPost

> CompletableFuture<Object> groupRunsApiV1RunsGroupPost(runGroupRequest, accept)

Group Runs

Get runs grouped by an expression

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        RunGroupRequest runGroupRequest = new RunGroupRequest(); // RunGroupRequest | 
        String accept = "accept_example"; // String | 
        try {
            CompletableFuture<Object> result = apiInstance.groupRunsApiV1RunsGroupPost(runGroupRequest, accept);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#groupRunsApiV1RunsGroupPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runGroupRequest** | [**RunGroupRequest**](RunGroupRequest.md)|  | |
| **accept** | **String**|  | [optional] |

### Return type

CompletableFuture<**Object**>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## groupRunsApiV1RunsGroupPostWithHttpInfo

> CompletableFuture<ApiResponse<Object>> groupRunsApiV1RunsGroupPost groupRunsApiV1RunsGroupPostWithHttpInfo(runGroupRequest, accept)

Group Runs

Get runs grouped by an expression

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        RunGroupRequest runGroupRequest = new RunGroupRequest(); // RunGroupRequest | 
        String accept = "accept_example"; // String | 
        try {
            CompletableFuture<ApiResponse<Object>> response = apiInstance.groupRunsApiV1RunsGroupPostWithHttpInfo(runGroupRequest, accept);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunApi#groupRunsApiV1RunsGroupPost");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#groupRunsApiV1RunsGroupPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runGroupRequest** | [**RunGroupRequest**](RunGroupRequest.md)|  | |
| **accept** | **String**|  | [optional] |

### Return type

CompletableFuture<ApiResponse<**Object**>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## listRuleLogsApiV1RunsRulesRuleIdLogsGet

> CompletableFuture<List<RuleLogSchema>> listRuleLogsApiV1RunsRulesRuleIdLogsGet(ruleId, limit, offset, startTime, endTime)

List Rule Logs

List logs for a particular rule

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID ruleId = UUID.randomUUID(); // UUID | 
        Integer limit = 720; // Integer | 
        Integer offset = 0; // Integer | 
        OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | 
        try {
            CompletableFuture<List<RuleLogSchema>> result = apiInstance.listRuleLogsApiV1RunsRulesRuleIdLogsGet(ruleId, limit, offset, startTime, endTime);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#listRuleLogsApiV1RunsRulesRuleIdLogsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleId** | **UUID**|  | |
| **limit** | **Integer**|  | [optional] [default to 720] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **startTime** | **OffsetDateTime**|  | [optional] |
| **endTime** | **OffsetDateTime**|  | [optional] |

### Return type

CompletableFuture<[**List&lt;RuleLogSchema&gt;**](RuleLogSchema.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## listRuleLogsApiV1RunsRulesRuleIdLogsGetWithHttpInfo

> CompletableFuture<ApiResponse<List<RuleLogSchema>>> listRuleLogsApiV1RunsRulesRuleIdLogsGet listRuleLogsApiV1RunsRulesRuleIdLogsGetWithHttpInfo(ruleId, limit, offset, startTime, endTime)

List Rule Logs

List logs for a particular rule

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID ruleId = UUID.randomUUID(); // UUID | 
        Integer limit = 720; // Integer | 
        Integer offset = 0; // Integer | 
        OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | 
        try {
            CompletableFuture<ApiResponse<List<RuleLogSchema>>> response = apiInstance.listRuleLogsApiV1RunsRulesRuleIdLogsGetWithHttpInfo(ruleId, limit, offset, startTime, endTime);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunApi#listRuleLogsApiV1RunsRulesRuleIdLogsGet");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#listRuleLogsApiV1RunsRulesRuleIdLogsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleId** | **UUID**|  | |
| **limit** | **Integer**|  | [optional] [default to 720] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **startTime** | **OffsetDateTime**|  | [optional] |
| **endTime** | **OffsetDateTime**|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**List&lt;RuleLogSchema&gt;**](RuleLogSchema.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## listRulesApiV1RunsRulesGet

> CompletableFuture<List<RunRulesSchema>> listRulesApiV1RunsRulesGet(datasetId, sessionId, type, nameContains, id)

List Rules

List all run rules.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID datasetId = UUID.randomUUID(); // UUID | 
        UUID sessionId = UUID.randomUUID(); // UUID | 
        String type = "session"; // String | 
        String nameContains = "nameContains_example"; // String | 
        List<UUID> id = Arrays.asList(); // List<UUID> | 
        try {
            CompletableFuture<List<RunRulesSchema>> result = apiInstance.listRulesApiV1RunsRulesGet(datasetId, sessionId, type, nameContains, id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#listRulesApiV1RunsRulesGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **datasetId** | **UUID**|  | [optional] |
| **sessionId** | **UUID**|  | [optional] |
| **type** | **String**|  | [optional] [enum: session, dataset] |
| **nameContains** | **String**|  | [optional] |
| **id** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |

### Return type

CompletableFuture<[**List&lt;RunRulesSchema&gt;**](RunRulesSchema.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## listRulesApiV1RunsRulesGetWithHttpInfo

> CompletableFuture<ApiResponse<List<RunRulesSchema>>> listRulesApiV1RunsRulesGet listRulesApiV1RunsRulesGetWithHttpInfo(datasetId, sessionId, type, nameContains, id)

List Rules

List all run rules.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID datasetId = UUID.randomUUID(); // UUID | 
        UUID sessionId = UUID.randomUUID(); // UUID | 
        String type = "session"; // String | 
        String nameContains = "nameContains_example"; // String | 
        List<UUID> id = Arrays.asList(); // List<UUID> | 
        try {
            CompletableFuture<ApiResponse<List<RunRulesSchema>>> response = apiInstance.listRulesApiV1RunsRulesGetWithHttpInfo(datasetId, sessionId, type, nameContains, id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunApi#listRulesApiV1RunsRulesGet");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#listRulesApiV1RunsRulesGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **datasetId** | **UUID**|  | [optional] |
| **sessionId** | **UUID**|  | [optional] |
| **type** | **String**|  | [optional] [enum: session, dataset] |
| **nameContains** | **String**|  | [optional] |
| **id** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**List&lt;RunRulesSchema&gt;**](RunRulesSchema.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## queryRunsApiV1RunsQueryPost

> CompletableFuture<ListRunsResponse> queryRunsApiV1RunsQueryPost(bodyParamsForRunSchema)

Query Runs

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        BodyParamsForRunSchema bodyParamsForRunSchema = new BodyParamsForRunSchema(); // BodyParamsForRunSchema | 
        try {
            CompletableFuture<ListRunsResponse> result = apiInstance.queryRunsApiV1RunsQueryPost(bodyParamsForRunSchema);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#queryRunsApiV1RunsQueryPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bodyParamsForRunSchema** | [**BodyParamsForRunSchema**](BodyParamsForRunSchema.md)|  | |

### Return type

CompletableFuture<[**ListRunsResponse**](ListRunsResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## queryRunsApiV1RunsQueryPostWithHttpInfo

> CompletableFuture<ApiResponse<ListRunsResponse>> queryRunsApiV1RunsQueryPost queryRunsApiV1RunsQueryPostWithHttpInfo(bodyParamsForRunSchema)

Query Runs

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        BodyParamsForRunSchema bodyParamsForRunSchema = new BodyParamsForRunSchema(); // BodyParamsForRunSchema | 
        try {
            CompletableFuture<ApiResponse<ListRunsResponse>> response = apiInstance.queryRunsApiV1RunsQueryPostWithHttpInfo(bodyParamsForRunSchema);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunApi#queryRunsApiV1RunsQueryPost");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#queryRunsApiV1RunsQueryPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bodyParamsForRunSchema** | [**BodyParamsForRunSchema**](BodyParamsForRunSchema.md)|  | |

### Return type

CompletableFuture<ApiResponse<[**ListRunsResponse**](ListRunsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## readRunApiV1RunsRunIdGet

> CompletableFuture<RunSchema> readRunApiV1RunsRunIdGet(runId, sessionId, startTime, excludeS3StoredAttributes, excludeSerialized)

Read Run

Get a specific run.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID runId = UUID.randomUUID(); // UUID | 
        UUID sessionId = UUID.randomUUID(); // UUID | 
        OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | 
        Boolean excludeS3StoredAttributes = false; // Boolean | 
        Boolean excludeSerialized = false; // Boolean | 
        try {
            CompletableFuture<RunSchema> result = apiInstance.readRunApiV1RunsRunIdGet(runId, sessionId, startTime, excludeS3StoredAttributes, excludeSerialized);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#readRunApiV1RunsRunIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runId** | **UUID**|  | |
| **sessionId** | **UUID**|  | [optional] |
| **startTime** | **OffsetDateTime**|  | [optional] |
| **excludeS3StoredAttributes** | **Boolean**|  | [optional] [default to false] |
| **excludeSerialized** | **Boolean**|  | [optional] [default to false] |

### Return type

CompletableFuture<[**RunSchema**](RunSchema.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## readRunApiV1RunsRunIdGetWithHttpInfo

> CompletableFuture<ApiResponse<RunSchema>> readRunApiV1RunsRunIdGet readRunApiV1RunsRunIdGetWithHttpInfo(runId, sessionId, startTime, excludeS3StoredAttributes, excludeSerialized)

Read Run

Get a specific run.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID runId = UUID.randomUUID(); // UUID | 
        UUID sessionId = UUID.randomUUID(); // UUID | 
        OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | 
        Boolean excludeS3StoredAttributes = false; // Boolean | 
        Boolean excludeSerialized = false; // Boolean | 
        try {
            CompletableFuture<ApiResponse<RunSchema>> response = apiInstance.readRunApiV1RunsRunIdGetWithHttpInfo(runId, sessionId, startTime, excludeS3StoredAttributes, excludeSerialized);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunApi#readRunApiV1RunsRunIdGet");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#readRunApiV1RunsRunIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runId** | **UUID**|  | |
| **sessionId** | **UUID**|  | [optional] |
| **startTime** | **OffsetDateTime**|  | [optional] |
| **excludeS3StoredAttributes** | **Boolean**|  | [optional] [default to false] |
| **excludeSerialized** | **Boolean**|  | [optional] [default to false] |

### Return type

CompletableFuture<ApiResponse<[**RunSchema**](RunSchema.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## readRunShareStateApiV1RunsRunIdShareGet

> CompletableFuture<RunShareSchema> readRunShareStateApiV1RunsRunIdShareGet(runId)

Read Run Share State

Get the state of sharing of a run.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID runId = UUID.randomUUID(); // UUID | 
        try {
            CompletableFuture<RunShareSchema> result = apiInstance.readRunShareStateApiV1RunsRunIdShareGet(runId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#readRunShareStateApiV1RunsRunIdShareGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runId** | **UUID**|  | |

### Return type

CompletableFuture<[**RunShareSchema**](RunShareSchema.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## readRunShareStateApiV1RunsRunIdShareGetWithHttpInfo

> CompletableFuture<ApiResponse<RunShareSchema>> readRunShareStateApiV1RunsRunIdShareGet readRunShareStateApiV1RunsRunIdShareGetWithHttpInfo(runId)

Read Run Share State

Get the state of sharing of a run.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID runId = UUID.randomUUID(); // UUID | 
        try {
            CompletableFuture<ApiResponse<RunShareSchema>> response = apiInstance.readRunShareStateApiV1RunsRunIdShareGetWithHttpInfo(runId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunApi#readRunShareStateApiV1RunsRunIdShareGet");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#readRunShareStateApiV1RunsRunIdShareGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runId** | **UUID**|  | |

### Return type

CompletableFuture<ApiResponse<[**RunShareSchema**](RunShareSchema.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## shareRunApiV1RunsRunIdSharePut

> CompletableFuture<RunShareSchema> shareRunApiV1RunsRunIdSharePut(runId)

Share Run

Share a run.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID runId = UUID.randomUUID(); // UUID | 
        try {
            CompletableFuture<RunShareSchema> result = apiInstance.shareRunApiV1RunsRunIdSharePut(runId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#shareRunApiV1RunsRunIdSharePut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runId** | **UUID**|  | |

### Return type

CompletableFuture<[**RunShareSchema**](RunShareSchema.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## shareRunApiV1RunsRunIdSharePutWithHttpInfo

> CompletableFuture<ApiResponse<RunShareSchema>> shareRunApiV1RunsRunIdSharePut shareRunApiV1RunsRunIdSharePutWithHttpInfo(runId)

Share Run

Share a run.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID runId = UUID.randomUUID(); // UUID | 
        try {
            CompletableFuture<ApiResponse<RunShareSchema>> response = apiInstance.shareRunApiV1RunsRunIdSharePutWithHttpInfo(runId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunApi#shareRunApiV1RunsRunIdSharePut");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#shareRunApiV1RunsRunIdSharePut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runId** | **UUID**|  | |

### Return type

CompletableFuture<ApiResponse<[**RunShareSchema**](RunShareSchema.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## statsGroupRunsApiV1RunsGroupStatsPost

> CompletableFuture<RunGroupStats> statsGroupRunsApiV1RunsGroupStatsPost(runGroupRequest)

Stats Group Runs

Get stats for the grouped runs.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        RunGroupRequest runGroupRequest = new RunGroupRequest(); // RunGroupRequest | 
        try {
            CompletableFuture<RunGroupStats> result = apiInstance.statsGroupRunsApiV1RunsGroupStatsPost(runGroupRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#statsGroupRunsApiV1RunsGroupStatsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runGroupRequest** | [**RunGroupRequest**](RunGroupRequest.md)|  | |

### Return type

CompletableFuture<[**RunGroupStats**](RunGroupStats.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## statsGroupRunsApiV1RunsGroupStatsPostWithHttpInfo

> CompletableFuture<ApiResponse<RunGroupStats>> statsGroupRunsApiV1RunsGroupStatsPost statsGroupRunsApiV1RunsGroupStatsPostWithHttpInfo(runGroupRequest)

Stats Group Runs

Get stats for the grouped runs.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        RunGroupRequest runGroupRequest = new RunGroupRequest(); // RunGroupRequest | 
        try {
            CompletableFuture<ApiResponse<RunGroupStats>> response = apiInstance.statsGroupRunsApiV1RunsGroupStatsPostWithHttpInfo(runGroupRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunApi#statsGroupRunsApiV1RunsGroupStatsPost");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#statsGroupRunsApiV1RunsGroupStatsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runGroupRequest** | [**RunGroupRequest**](RunGroupRequest.md)|  | |

### Return type

CompletableFuture<ApiResponse<[**RunGroupStats**](RunGroupStats.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## statsRunsApiV1RunsStatsPost

> CompletableFuture<ResponseStatsRunsApiV1RunsStatsPost> statsRunsApiV1RunsStatsPost(runStatsQueryParams)

Stats Runs

Get all runs by query in body payload.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        RunStatsQueryParams runStatsQueryParams = new RunStatsQueryParams(); // RunStatsQueryParams | 
        try {
            CompletableFuture<ResponseStatsRunsApiV1RunsStatsPost> result = apiInstance.statsRunsApiV1RunsStatsPost(runStatsQueryParams);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#statsRunsApiV1RunsStatsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runStatsQueryParams** | [**RunStatsQueryParams**](RunStatsQueryParams.md)|  | |

### Return type

CompletableFuture<[**ResponseStatsRunsApiV1RunsStatsPost**](ResponseStatsRunsApiV1RunsStatsPost.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## statsRunsApiV1RunsStatsPostWithHttpInfo

> CompletableFuture<ApiResponse<ResponseStatsRunsApiV1RunsStatsPost>> statsRunsApiV1RunsStatsPost statsRunsApiV1RunsStatsPostWithHttpInfo(runStatsQueryParams)

Stats Runs

Get all runs by query in body payload.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        RunStatsQueryParams runStatsQueryParams = new RunStatsQueryParams(); // RunStatsQueryParams | 
        try {
            CompletableFuture<ApiResponse<ResponseStatsRunsApiV1RunsStatsPost>> response = apiInstance.statsRunsApiV1RunsStatsPostWithHttpInfo(runStatsQueryParams);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunApi#statsRunsApiV1RunsStatsPost");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#statsRunsApiV1RunsStatsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runStatsQueryParams** | [**RunStatsQueryParams**](RunStatsQueryParams.md)|  | |

### Return type

CompletableFuture<ApiResponse<[**ResponseStatsRunsApiV1RunsStatsPost**](ResponseStatsRunsApiV1RunsStatsPost.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## triggerRuleApiV1RunsRulesRuleIdTriggerPost

> CompletableFuture<RunRulesSchema> triggerRuleApiV1RunsRulesRuleIdTriggerPost(ruleId)

Trigger Rule

Trigger a run rule manually.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID ruleId = UUID.randomUUID(); // UUID | 
        try {
            CompletableFuture<RunRulesSchema> result = apiInstance.triggerRuleApiV1RunsRulesRuleIdTriggerPost(ruleId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#triggerRuleApiV1RunsRulesRuleIdTriggerPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleId** | **UUID**|  | |

### Return type

CompletableFuture<[**RunRulesSchema**](RunRulesSchema.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## triggerRuleApiV1RunsRulesRuleIdTriggerPostWithHttpInfo

> CompletableFuture<ApiResponse<RunRulesSchema>> triggerRuleApiV1RunsRulesRuleIdTriggerPost triggerRuleApiV1RunsRulesRuleIdTriggerPostWithHttpInfo(ruleId)

Trigger Rule

Trigger a run rule manually.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID ruleId = UUID.randomUUID(); // UUID | 
        try {
            CompletableFuture<ApiResponse<RunRulesSchema>> response = apiInstance.triggerRuleApiV1RunsRulesRuleIdTriggerPostWithHttpInfo(ruleId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunApi#triggerRuleApiV1RunsRulesRuleIdTriggerPost");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#triggerRuleApiV1RunsRulesRuleIdTriggerPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleId** | **UUID**|  | |

### Return type

CompletableFuture<ApiResponse<[**RunRulesSchema**](RunRulesSchema.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## triggerRulesApiV1RunsRulesTriggerPost

> CompletableFuture<Object> triggerRulesApiV1RunsRulesTriggerPost(triggerRulesRequest)

Trigger Rules

Trigger an array of run rules manually.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        TriggerRulesRequest triggerRulesRequest = new TriggerRulesRequest(); // TriggerRulesRequest | 
        try {
            CompletableFuture<Object> result = apiInstance.triggerRulesApiV1RunsRulesTriggerPost(triggerRulesRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#triggerRulesApiV1RunsRulesTriggerPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **triggerRulesRequest** | [**TriggerRulesRequest**](TriggerRulesRequest.md)|  | |

### Return type

CompletableFuture<**Object**>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## triggerRulesApiV1RunsRulesTriggerPostWithHttpInfo

> CompletableFuture<ApiResponse<Object>> triggerRulesApiV1RunsRulesTriggerPost triggerRulesApiV1RunsRulesTriggerPostWithHttpInfo(triggerRulesRequest)

Trigger Rules

Trigger an array of run rules manually.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        TriggerRulesRequest triggerRulesRequest = new TriggerRulesRequest(); // TriggerRulesRequest | 
        try {
            CompletableFuture<ApiResponse<Object>> response = apiInstance.triggerRulesApiV1RunsRulesTriggerPostWithHttpInfo(triggerRulesRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunApi#triggerRulesApiV1RunsRulesTriggerPost");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#triggerRulesApiV1RunsRulesTriggerPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **triggerRulesRequest** | [**TriggerRulesRequest**](TriggerRulesRequest.md)|  | |

### Return type

CompletableFuture<ApiResponse<**Object**>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## unshareRunApiV1RunsRunIdShareDelete

> CompletableFuture<Object> unshareRunApiV1RunsRunIdShareDelete(runId)

Unshare Run

Unshare a run.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID runId = UUID.randomUUID(); // UUID | 
        try {
            CompletableFuture<Object> result = apiInstance.unshareRunApiV1RunsRunIdShareDelete(runId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#unshareRunApiV1RunsRunIdShareDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runId** | **UUID**|  | |

### Return type

CompletableFuture<**Object**>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## unshareRunApiV1RunsRunIdShareDeleteWithHttpInfo

> CompletableFuture<ApiResponse<Object>> unshareRunApiV1RunsRunIdShareDelete unshareRunApiV1RunsRunIdShareDeleteWithHttpInfo(runId)

Unshare Run

Unshare a run.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID runId = UUID.randomUUID(); // UUID | 
        try {
            CompletableFuture<ApiResponse<Object>> response = apiInstance.unshareRunApiV1RunsRunIdShareDeleteWithHttpInfo(runId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunApi#unshareRunApiV1RunsRunIdShareDelete");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#unshareRunApiV1RunsRunIdShareDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runId** | **UUID**|  | |

### Return type

CompletableFuture<ApiResponse<**Object**>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## updateRuleApiV1RunsRulesRuleIdPatch

> CompletableFuture<RunRulesSchema> updateRuleApiV1RunsRulesRuleIdPatch(ruleId, runRulesCreateSchema)

Update Rule

Update a run rule.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID ruleId = UUID.randomUUID(); // UUID | 
        RunRulesCreateSchema runRulesCreateSchema = new RunRulesCreateSchema(); // RunRulesCreateSchema | 
        try {
            CompletableFuture<RunRulesSchema> result = apiInstance.updateRuleApiV1RunsRulesRuleIdPatch(ruleId, runRulesCreateSchema);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#updateRuleApiV1RunsRulesRuleIdPatch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleId** | **UUID**|  | |
| **runRulesCreateSchema** | [**RunRulesCreateSchema**](RunRulesCreateSchema.md)|  | |

### Return type

CompletableFuture<[**RunRulesSchema**](RunRulesSchema.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## updateRuleApiV1RunsRulesRuleIdPatchWithHttpInfo

> CompletableFuture<ApiResponse<RunRulesSchema>> updateRuleApiV1RunsRulesRuleIdPatch updateRuleApiV1RunsRulesRuleIdPatchWithHttpInfo(ruleId, runRulesCreateSchema)

Update Rule

Update a run rule.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID ruleId = UUID.randomUUID(); // UUID | 
        RunRulesCreateSchema runRulesCreateSchema = new RunRulesCreateSchema(); // RunRulesCreateSchema | 
        try {
            CompletableFuture<ApiResponse<RunRulesSchema>> response = apiInstance.updateRuleApiV1RunsRulesRuleIdPatchWithHttpInfo(ruleId, runRulesCreateSchema);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunApi#updateRuleApiV1RunsRulesRuleIdPatch");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#updateRuleApiV1RunsRulesRuleIdPatch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleId** | **UUID**|  | |
| **runRulesCreateSchema** | [**RunRulesCreateSchema**](RunRulesCreateSchema.md)|  | |

### Return type

CompletableFuture<ApiResponse<[**RunRulesSchema**](RunRulesSchema.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## updateRunApiV1RunsRunIdPatch

> CompletableFuture<Object> updateRunApiV1RunsRunIdPatch(runId)

Update Run

Update a run.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID runId = UUID.randomUUID(); // UUID | 
        try {
            CompletableFuture<Object> result = apiInstance.updateRunApiV1RunsRunIdPatch(runId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#updateRunApiV1RunsRunIdPatch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runId** | **UUID**|  | |

### Return type

CompletableFuture<**Object**>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## updateRunApiV1RunsRunIdPatchWithHttpInfo

> CompletableFuture<ApiResponse<Object>> updateRunApiV1RunsRunIdPatch updateRunApiV1RunsRunIdPatchWithHttpInfo(runId)

Update Run

Update a run.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID runId = UUID.randomUUID(); // UUID | 
        try {
            CompletableFuture<ApiResponse<Object>> response = apiInstance.updateRunApiV1RunsRunIdPatchWithHttpInfo(runId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunApi#updateRunApiV1RunsRunIdPatch");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#updateRunApiV1RunsRunIdPatch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runId** | **UUID**|  | |

### Return type

CompletableFuture<ApiResponse<**Object**>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

