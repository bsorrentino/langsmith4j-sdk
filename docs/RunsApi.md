# RunsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**runsBatchPost**](RunsApi.md#runsBatchPost) | **POST** /runs/batch | Ingest Runs (Batch JSON) |
| [**runsBatchPostWithHttpInfo**](RunsApi.md#runsBatchPostWithHttpInfo) | **POST** /runs/batch | Ingest Runs (Batch JSON) |
| [**runsMultipartPost**](RunsApi.md#runsMultipartPost) | **POST** /runs/multipart | Ingest Runs (Multipart) |
| [**runsMultipartPostWithHttpInfo**](RunsApi.md#runsMultipartPostWithHttpInfo) | **POST** /runs/multipart | Ingest Runs (Multipart) |
| [**runsPost**](RunsApi.md#runsPost) | **POST** /runs | Create a Run |
| [**runsPostWithHttpInfo**](RunsApi.md#runsPostWithHttpInfo) | **POST** /runs | Create a Run |
| [**runsRunIdPatch**](RunsApi.md#runsRunIdPatch) | **PATCH** /runs/{run_id} | Update a Run |
| [**runsRunIdPatchWithHttpInfo**](RunsApi.md#runsRunIdPatchWithHttpInfo) | **PATCH** /runs/{run_id} | Update a Run |



## runsBatchPost

> CompletableFuture<Map<String, RunsPost202ResponseValue>> runsBatchPost(runsBatchPostRequest)

Ingest Runs (Batch JSON)

Ingests a batch of runs in a single JSON payload. The payload must have &#x60;post&#x60; and/or &#x60;patch&#x60; arrays containing run objects. Prefer this endpoint over single‑run ingestion when submitting hundreds of runs, but &#x60;/runs/multipart&#x60; offers better handling for very large fields and attachments.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunsApi apiInstance = new RunsApi(defaultClient);
        RunsBatchPostRequest runsBatchPostRequest = new RunsBatchPostRequest(); // RunsBatchPostRequest | 
        try {
            CompletableFuture<Map<String, RunsPost202ResponseValue>> result = apiInstance.runsBatchPost(runsBatchPostRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunsApi#runsBatchPost");
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
| **runsBatchPostRequest** | [**RunsBatchPostRequest**](RunsBatchPostRequest.md)|  | |

### Return type

CompletableFuture<[**Map&lt;String, RunsPost202ResponseValue&gt;**](RunsPost202ResponseValue.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Runs batch ingested |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |

## runsBatchPostWithHttpInfo

> CompletableFuture<ApiResponse<Map<String, RunsPost202ResponseValue>>> runsBatchPost runsBatchPostWithHttpInfo(runsBatchPostRequest)

Ingest Runs (Batch JSON)

Ingests a batch of runs in a single JSON payload. The payload must have &#x60;post&#x60; and/or &#x60;patch&#x60; arrays containing run objects. Prefer this endpoint over single‑run ingestion when submitting hundreds of runs, but &#x60;/runs/multipart&#x60; offers better handling for very large fields and attachments.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunsApi apiInstance = new RunsApi(defaultClient);
        RunsBatchPostRequest runsBatchPostRequest = new RunsBatchPostRequest(); // RunsBatchPostRequest | 
        try {
            CompletableFuture<ApiResponse<Map<String, RunsPost202ResponseValue>>> response = apiInstance.runsBatchPostWithHttpInfo(runsBatchPostRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunsApi#runsBatchPost");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunsApi#runsBatchPost");
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
| **runsBatchPostRequest** | [**RunsBatchPostRequest**](RunsBatchPostRequest.md)|  | |

### Return type

CompletableFuture<ApiResponse<[**Map&lt;String, RunsPost202ResponseValue&gt;**](RunsPost202ResponseValue.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Runs batch ingested |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |


## runsMultipartPost

> CompletableFuture<Map<String, String>> runsMultipartPost(postLeftCurlyBracketRunIdRightCurlyBracket, patchLeftCurlyBracketRunIdRightCurlyBracket, postLeftCurlyBracketRunIdRightCurlyBracketInputs, patchLeftCurlyBracketRunIdRightCurlyBracketOutputs, feedbackLeftCurlyBracketRunIdRightCurlyBracket, attachmentLeftCurlyBracketRunIdRightCurlyBracketLeftCurlyBracketFilenameRightCurlyBracket)

Ingest Runs (Multipart)

Ingests multiple runs, feedback objects, and binary attachments in a single &#x60;multipart/form-data&#x60; request. **Part‑name pattern**: &#x60;&lt;event&gt;.&lt;run_id&gt;[.&lt;field&gt;]&#x60; where &#x60;event&#x60; ∈ {&#x60;post&#x60;, &#x60;patch&#x60;, &#x60;feedback&#x60;, &#x60;attachment&#x60;}. * &#x60;post|patch.&lt;run_id&gt;&#x60; – JSON run payload. * &#x60;post|patch.&lt;run_id&gt;.&lt;field&gt;&#x60; – out‑of‑band run data (&#x60;inputs&#x60;, &#x60;outputs&#x60;, &#x60;events&#x60;, &#x60;error&#x60;, &#x60;extra&#x60;, &#x60;serialized&#x60;). * &#x60;feedback.&lt;run_id&gt;&#x60; – JSON feedback payload (must include &#x60;trace_id&#x60;). * &#x60;attachment.&lt;run_id&gt;.&lt;filename&gt;&#x60; – arbitrary binary attachment stored in S3. **Headers**: every part must set &#x60;Content-Type&#x60; **and** either a &#x60;Content-Length&#x60; header or &#x60;length&#x60; parameter. Per‑part &#x60;Content-Encoding&#x60; is **not** allowed; the top‑level request may be &#x60;Content-Encoding: zstd&#x60;. **Best performance** for high‑volume ingestion.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunsApi apiInstance = new RunsApi(defaultClient);
        File postLeftCurlyBracketRunIdRightCurlyBracket = new File("/path/to/file"); // File | Run to create (JSON)
        File patchLeftCurlyBracketRunIdRightCurlyBracket = new File("/path/to/file"); // File | Run to update (JSON)
        File postLeftCurlyBracketRunIdRightCurlyBracketInputs = new File("/path/to/file"); // File | Large inputs object (JSON) stored out‑of‑band
        File patchLeftCurlyBracketRunIdRightCurlyBracketOutputs = new File("/path/to/file"); // File | Large outputs object (JSON) stored out‑of‑band
        File feedbackLeftCurlyBracketRunIdRightCurlyBracket = new File("/path/to/file"); // File | Feedback object (JSON) – must include trace_id
        File attachmentLeftCurlyBracketRunIdRightCurlyBracketLeftCurlyBracketFilenameRightCurlyBracket = new File("/path/to/file"); // File | Binary attachment linked to run {run_id}
        try {
            CompletableFuture<Map<String, String>> result = apiInstance.runsMultipartPost(postLeftCurlyBracketRunIdRightCurlyBracket, patchLeftCurlyBracketRunIdRightCurlyBracket, postLeftCurlyBracketRunIdRightCurlyBracketInputs, patchLeftCurlyBracketRunIdRightCurlyBracketOutputs, feedbackLeftCurlyBracketRunIdRightCurlyBracket, attachmentLeftCurlyBracketRunIdRightCurlyBracketLeftCurlyBracketFilenameRightCurlyBracket);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunsApi#runsMultipartPost");
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
| **postLeftCurlyBracketRunIdRightCurlyBracket** | **File**| Run to create (JSON) | [optional] |
| **patchLeftCurlyBracketRunIdRightCurlyBracket** | **File**| Run to update (JSON) | [optional] |
| **postLeftCurlyBracketRunIdRightCurlyBracketInputs** | **File**| Large inputs object (JSON) stored out‑of‑band | [optional] |
| **patchLeftCurlyBracketRunIdRightCurlyBracketOutputs** | **File**| Large outputs object (JSON) stored out‑of‑band | [optional] |
| **feedbackLeftCurlyBracketRunIdRightCurlyBracket** | **File**| Feedback object (JSON) – must include trace_id | [optional] |
| **attachmentLeftCurlyBracketRunIdRightCurlyBracketLeftCurlyBracketFilenameRightCurlyBracket** | [**File**](File.md)| Binary attachment linked to run {run_id} | [optional] |

### Return type

CompletableFuture<**Map&lt;String, String&gt;**>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |

## runsMultipartPostWithHttpInfo

> CompletableFuture<ApiResponse<Map<String, String>>> runsMultipartPost runsMultipartPostWithHttpInfo(postLeftCurlyBracketRunIdRightCurlyBracket, patchLeftCurlyBracketRunIdRightCurlyBracket, postLeftCurlyBracketRunIdRightCurlyBracketInputs, patchLeftCurlyBracketRunIdRightCurlyBracketOutputs, feedbackLeftCurlyBracketRunIdRightCurlyBracket, attachmentLeftCurlyBracketRunIdRightCurlyBracketLeftCurlyBracketFilenameRightCurlyBracket)

Ingest Runs (Multipart)

Ingests multiple runs, feedback objects, and binary attachments in a single &#x60;multipart/form-data&#x60; request. **Part‑name pattern**: &#x60;&lt;event&gt;.&lt;run_id&gt;[.&lt;field&gt;]&#x60; where &#x60;event&#x60; ∈ {&#x60;post&#x60;, &#x60;patch&#x60;, &#x60;feedback&#x60;, &#x60;attachment&#x60;}. * &#x60;post|patch.&lt;run_id&gt;&#x60; – JSON run payload. * &#x60;post|patch.&lt;run_id&gt;.&lt;field&gt;&#x60; – out‑of‑band run data (&#x60;inputs&#x60;, &#x60;outputs&#x60;, &#x60;events&#x60;, &#x60;error&#x60;, &#x60;extra&#x60;, &#x60;serialized&#x60;). * &#x60;feedback.&lt;run_id&gt;&#x60; – JSON feedback payload (must include &#x60;trace_id&#x60;). * &#x60;attachment.&lt;run_id&gt;.&lt;filename&gt;&#x60; – arbitrary binary attachment stored in S3. **Headers**: every part must set &#x60;Content-Type&#x60; **and** either a &#x60;Content-Length&#x60; header or &#x60;length&#x60; parameter. Per‑part &#x60;Content-Encoding&#x60; is **not** allowed; the top‑level request may be &#x60;Content-Encoding: zstd&#x60;. **Best performance** for high‑volume ingestion.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunsApi apiInstance = new RunsApi(defaultClient);
        File postLeftCurlyBracketRunIdRightCurlyBracket = new File("/path/to/file"); // File | Run to create (JSON)
        File patchLeftCurlyBracketRunIdRightCurlyBracket = new File("/path/to/file"); // File | Run to update (JSON)
        File postLeftCurlyBracketRunIdRightCurlyBracketInputs = new File("/path/to/file"); // File | Large inputs object (JSON) stored out‑of‑band
        File patchLeftCurlyBracketRunIdRightCurlyBracketOutputs = new File("/path/to/file"); // File | Large outputs object (JSON) stored out‑of‑band
        File feedbackLeftCurlyBracketRunIdRightCurlyBracket = new File("/path/to/file"); // File | Feedback object (JSON) – must include trace_id
        File attachmentLeftCurlyBracketRunIdRightCurlyBracketLeftCurlyBracketFilenameRightCurlyBracket = new File("/path/to/file"); // File | Binary attachment linked to run {run_id}
        try {
            CompletableFuture<ApiResponse<Map<String, String>>> response = apiInstance.runsMultipartPostWithHttpInfo(postLeftCurlyBracketRunIdRightCurlyBracket, patchLeftCurlyBracketRunIdRightCurlyBracket, postLeftCurlyBracketRunIdRightCurlyBracketInputs, patchLeftCurlyBracketRunIdRightCurlyBracketOutputs, feedbackLeftCurlyBracketRunIdRightCurlyBracket, attachmentLeftCurlyBracketRunIdRightCurlyBracketLeftCurlyBracketFilenameRightCurlyBracket);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunsApi#runsMultipartPost");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunsApi#runsMultipartPost");
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
| **postLeftCurlyBracketRunIdRightCurlyBracket** | **File**| Run to create (JSON) | [optional] |
| **patchLeftCurlyBracketRunIdRightCurlyBracket** | **File**| Run to update (JSON) | [optional] |
| **postLeftCurlyBracketRunIdRightCurlyBracketInputs** | **File**| Large inputs object (JSON) stored out‑of‑band | [optional] |
| **patchLeftCurlyBracketRunIdRightCurlyBracketOutputs** | **File**| Large outputs object (JSON) stored out‑of‑band | [optional] |
| **feedbackLeftCurlyBracketRunIdRightCurlyBracket** | **File**| Feedback object (JSON) – must include trace_id | [optional] |
| **attachmentLeftCurlyBracketRunIdRightCurlyBracketLeftCurlyBracketFilenameRightCurlyBracket** | [**File**](File.md)| Binary attachment linked to run {run_id} | [optional] |

### Return type

CompletableFuture<ApiResponse<**Map&lt;String, String&gt;**>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |


## runsPost

> CompletableFuture<Map<String, RunsPost202ResponseValue>> runsPost(runsRun)

Create a Run

Queues a single run for ingestion. The request body must be a JSON-encoded run object that follows the Run schema.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunsApi apiInstance = new RunsApi(defaultClient);
        RunsRun runsRun = new RunsRun(); // RunsRun | 
        try {
            CompletableFuture<Map<String, RunsPost202ResponseValue>> result = apiInstance.runsPost(runsRun);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunsApi#runsPost");
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
| **runsRun** | [**RunsRun**](RunsRun.md)|  | |

### Return type

CompletableFuture<[**Map&lt;String, RunsPost202ResponseValue&gt;**](RunsPost202ResponseValue.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Run created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |

## runsPostWithHttpInfo

> CompletableFuture<ApiResponse<Map<String, RunsPost202ResponseValue>>> runsPost runsPostWithHttpInfo(runsRun)

Create a Run

Queues a single run for ingestion. The request body must be a JSON-encoded run object that follows the Run schema.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunsApi apiInstance = new RunsApi(defaultClient);
        RunsRun runsRun = new RunsRun(); // RunsRun | 
        try {
            CompletableFuture<ApiResponse<Map<String, RunsPost202ResponseValue>>> response = apiInstance.runsPostWithHttpInfo(runsRun);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunsApi#runsPost");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunsApi#runsPost");
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
| **runsRun** | [**RunsRun**](RunsRun.md)|  | |

### Return type

CompletableFuture<ApiResponse<[**Map&lt;String, RunsPost202ResponseValue&gt;**](RunsPost202ResponseValue.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Run created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |


## runsRunIdPatch

> CompletableFuture<Map<String, RunsPost202ResponseValue>> runsRunIdPatch(UNKNOWN_PARAMETER_NAME, runsRun)

Update a Run

Updates a run identified by its ID. The body should contain only the fields to be changed; unknown fields are ignored.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunsApi apiInstance = new RunsApi(defaultClient);
         UNKNOWN_PARAMETER_NAME = new null(); //  | Run ID
        RunsRun runsRun = new RunsRun(); // RunsRun | 
        try {
            CompletableFuture<Map<String, RunsPost202ResponseValue>> result = apiInstance.runsRunIdPatch(UNKNOWN_PARAMETER_NAME, runsRun);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunsApi#runsRunIdPatch");
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
| **UNKNOWN_PARAMETER_NAME** | [****](.md)| Run ID | |
| **runsRun** | [**RunsRun**](RunsRun.md)|  | |

### Return type

CompletableFuture<[**Map&lt;String, RunsPost202ResponseValue&gt;**](RunsPost202ResponseValue.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Run updated |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |

## runsRunIdPatchWithHttpInfo

> CompletableFuture<ApiResponse<Map<String, RunsPost202ResponseValue>>> runsRunIdPatch runsRunIdPatchWithHttpInfo(UNKNOWN_PARAMETER_NAME, runsRun)

Update a Run

Updates a run identified by its ID. The body should contain only the fields to be changed; unknown fields are ignored.

### Example

```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.ApiClient;
import org.bsc.langgraph4j.langsmith.gen.ApiException;
import org.bsc.langgraph4j.langsmith.gen.ApiResponse;
import org.bsc.langgraph4j.langsmith.gen.Configuration;
import org.bsc.langgraph4j.langsmith.gen.models.*;
import org.bsc.langgraph4j.langsmith.gen.api.RunsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RunsApi apiInstance = new RunsApi(defaultClient);
         UNKNOWN_PARAMETER_NAME = new null(); //  | Run ID
        RunsRun runsRun = new RunsRun(); // RunsRun | 
        try {
            CompletableFuture<ApiResponse<Map<String, RunsPost202ResponseValue>>> response = apiInstance.runsRunIdPatchWithHttpInfo(UNKNOWN_PARAMETER_NAME, runsRun);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RunsApi#runsRunIdPatch");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RunsApi#runsRunIdPatch");
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
| **UNKNOWN_PARAMETER_NAME** | [****](.md)| Run ID | |
| **runsRun** | [**RunsRun**](RunsRun.md)|  | |

### Return type

CompletableFuture<ApiResponse<[**Map&lt;String, RunsPost202ResponseValue&gt;**](RunsPost202ResponseValue.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Run updated |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |

