# RunApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**readRunApiV1RunsRunIdGet**](RunApi.md#readRunApiV1RunsRunIdGet) | **GET** /api/v1/runs/{run_id} | Read Run |
| [**readRunApiV1RunsRunIdGetWithHttpInfo**](RunApi.md#readRunApiV1RunsRunIdGetWithHttpInfo) | **GET** /api/v1/runs/{run_id} | Read Run |
| [**updateRunApiV1RunsRunIdPatch**](RunApi.md#updateRunApiV1RunsRunIdPatch) | **PATCH** /api/v1/runs/{run_id} | Update Run |
| [**updateRunApiV1RunsRunIdPatchWithHttpInfo**](RunApi.md#updateRunApiV1RunsRunIdPatchWithHttpInfo) | **PATCH** /api/v1/runs/{run_id} | Update Run |



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

