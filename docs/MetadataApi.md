# MetadataApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getVersion**](MetadataApi.md#getVersion) | **GET** /version | Return Running Software Version. |
| [**isAlive**](MetadataApi.md#isAlive) | **GET** /health/alive | Check HTTP Server Status |
| [**isReady**](MetadataApi.md#isReady) | **GET** /health/ready | Check HTTP Server and Database Status |


<a name="getVersion"></a>
# **getVersion**
> GetVersion200Response getVersion()

Return Running Software Version.

This endpoint returns the version of Ory Hydra.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of this service, the version will never refer to the cluster state, only to a single instance.

### Example
```java
// Import classes:
import sh.ory.hydra.ApiClient;
import sh.ory.hydra.ApiException;
import sh.ory.hydra.Configuration;
import sh.ory.hydra.models.*;
import sh.ory.hydra.api.MetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MetadataApi apiInstance = new MetadataApi(defaultClient);
    try {
      GetVersion200Response result = apiInstance.getVersion();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#getVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetVersion200Response**](GetVersion200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the Ory Hydra version. |  -  |

<a name="isAlive"></a>
# **isAlive**
> HealthStatus isAlive()

Check HTTP Server Status

This endpoint returns a HTTP 200 status code when Ory Hydra is accepting incoming HTTP requests. This status does currently not include checks whether the database connection is working.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.

### Example
```java
// Import classes:
import sh.ory.hydra.ApiClient;
import sh.ory.hydra.ApiException;
import sh.ory.hydra.Configuration;
import sh.ory.hydra.models.*;
import sh.ory.hydra.api.MetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MetadataApi apiInstance = new MetadataApi(defaultClient);
    try {
      HealthStatus result = apiInstance.isAlive();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#isAlive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HealthStatus**](HealthStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ory Hydra is ready to accept connections. |  -  |
| **500** | genericError |  -  |

<a name="isReady"></a>
# **isReady**
> IsReady200Response isReady()

Check HTTP Server and Database Status

This endpoint returns a HTTP 200 status code when Ory Hydra is up running and the environment dependencies (e.g. the database) are responsive as well.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of Ory Hydra, the health status will never refer to the cluster state, only to a single instance.

### Example
```java
// Import classes:
import sh.ory.hydra.ApiClient;
import sh.ory.hydra.ApiException;
import sh.ory.hydra.Configuration;
import sh.ory.hydra.models.*;
import sh.ory.hydra.api.MetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MetadataApi apiInstance = new MetadataApi(defaultClient);
    try {
      IsReady200Response result = apiInstance.isReady();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#isReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IsReady200Response**](IsReady200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ory Hydra is ready to accept requests. |  -  |
| **503** | Ory Kratos is not yet ready to accept requests. |  -  |

