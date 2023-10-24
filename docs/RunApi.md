# RunApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRunRunsPost**](RunApi.md#createRunRunsPost) | **POST** runs | Create Run |
| [**updateRunRunsRunIdPatch**](RunApi.md#updateRunRunsRunIdPatch) | **PATCH** runs/{run_id} | Update Run |



## createRunRunsPost

> Object createRunRunsPost(runCreateSchemaExtended)

Create Run

Create a new run.

### Example

```java
// Import classes:
import dev.langchain4j.langsmith.ApiClient;
import dev.langchain4j.langsmith.ApiException;
import dev.langchain4j.langsmith.Configuration;
import dev.langchain4j.langsmith.models.*;
import dev.langchain4j.langsmith.api.RunApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        RunCreateSchemaExtended runCreateSchemaExtended = new RunCreateSchemaExtended(); // RunCreateSchemaExtended | 
        try {
            Object result = apiInstance.createRunRunsPost(runCreateSchemaExtended);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#createRunRunsPost");
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
| **runCreateSchemaExtended** | [**RunCreateSchemaExtended**](RunCreateSchemaExtended.md)|  | |

### Return type

**Object**

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


## updateRunRunsRunIdPatch

> Object updateRunRunsRunIdPatch(runId, runUpdateSchemaExtended)

Update Run

Update a run.

### Example

```java
// Import classes:
import dev.langchain4j.langsmith.ApiClient;
import dev.langchain4j.langsmith.ApiException;
import dev.langchain4j.langsmith.Configuration;
import dev.langchain4j.langsmith.models.*;
import dev.langchain4j.langsmith.api.RunApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunApi apiInstance = new RunApi(defaultClient);
        UUID runId = UUID.randomUUID(); // UUID | 
        RunUpdateSchemaExtended runUpdateSchemaExtended = new RunUpdateSchemaExtended(); // RunUpdateSchemaExtended | 
        try {
            Object result = apiInstance.updateRunRunsRunIdPatch(runId, runUpdateSchemaExtended);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RunApi#updateRunRunsRunIdPatch");
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
| **runUpdateSchemaExtended** | [**RunUpdateSchemaExtended**](RunUpdateSchemaExtended.md)|  | |

### Return type

**Object**

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

