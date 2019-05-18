# DefaultApi

All URIs are relative to *http://localhost:8000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lightGet**](DefaultApi.md#lightGet) | **GET** /light | Returns the light unit data.
[**lightPost**](DefaultApi.md#lightPost) | **POST** /light | Set the light unit data.

<a name="lightGet"></a>
# **lightGet**
> LightData lightGet()

Returns the light unit data.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    LightData result = apiInstance.lightGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#lightGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LightData**](LightData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="lightPost"></a>
# **lightPost**
> lightPost(body)

Set the light unit data.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
LightData body = new LightData(); // LightData | 
try {
    apiInstance.lightPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#lightPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LightData**](LightData.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

