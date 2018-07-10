/*
 * Coindirect
 * The Coindirect API is offered to all users to make use of our P2P Marketplace, Exchange and Wallets.
 *
 * OpenAPI spec version: 1
 * Contact: support@coindirect.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.coindirect.client.api;

import org.coindirect.client.invoker.ApiCallback;
import org.coindirect.client.invoker.ApiClient;
import org.coindirect.client.invoker.ApiException;
import org.coindirect.client.invoker.ApiResponse;
import org.coindirect.client.invoker.Configuration;
import org.coindirect.client.invoker.Pair;
import org.coindirect.client.invoker.ProgressRequestBody;
import org.coindirect.client.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.coindirect.client.model.Errors;
import org.coindirect.client.model.ExchangeOrder;
import org.coindirect.client.model.ExchangeOrderRequest;
import org.coindirect.client.model.Reasons;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExchangeOrdersApi {
    private ApiClient apiClient;

    public ExchangeOrdersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ExchangeOrdersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for cancelExchangeOrder
     * @param uuid  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cancelExchangeOrderCall(String uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/exchange/order/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call cancelExchangeOrderValidateBeforeCall(String uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling cancelExchangeOrder(Async)");
        }
        

        com.squareup.okhttp.Call call = cancelExchangeOrderCall(uuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Cancel Order
     * 
     * @param uuid  (required)
     * @return ExchangeOrder
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ExchangeOrder cancelExchangeOrder(String uuid) throws ApiException {
        ApiResponse<ExchangeOrder> resp = cancelExchangeOrderWithHttpInfo(uuid);
        return resp.getData();
    }

    /**
     * Cancel Order
     * 
     * @param uuid  (required)
     * @return ApiResponse&lt;ExchangeOrder&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ExchangeOrder> cancelExchangeOrderWithHttpInfo(String uuid) throws ApiException {
        com.squareup.okhttp.Call call = cancelExchangeOrderValidateBeforeCall(uuid, null, null);
        Type localVarReturnType = new TypeToken<ExchangeOrder>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Cancel Order (asynchronously)
     * 
     * @param uuid  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cancelExchangeOrderAsync(String uuid, final ApiCallback<ExchangeOrder> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = cancelExchangeOrderValidateBeforeCall(uuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ExchangeOrder>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getExchangeOrder
     * @param uuid  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getExchangeOrderCall(String uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/exchange/order/read/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getExchangeOrderValidateBeforeCall(String uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling getExchangeOrder(Async)");
        }
        

        com.squareup.okhttp.Call call = getExchangeOrderCall(uuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Order
     * 
     * @param uuid  (required)
     * @return ExchangeOrder
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ExchangeOrder getExchangeOrder(String uuid) throws ApiException {
        ApiResponse<ExchangeOrder> resp = getExchangeOrderWithHttpInfo(uuid);
        return resp.getData();
    }

    /**
     * Get Order
     * 
     * @param uuid  (required)
     * @return ApiResponse&lt;ExchangeOrder&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ExchangeOrder> getExchangeOrderWithHttpInfo(String uuid) throws ApiException {
        com.squareup.okhttp.Call call = getExchangeOrderValidateBeforeCall(uuid, null, null);
        Type localVarReturnType = new TypeToken<ExchangeOrder>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Order (asynchronously)
     * 
     * @param uuid  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getExchangeOrderAsync(String uuid, final ApiCallback<ExchangeOrder> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getExchangeOrderValidateBeforeCall(uuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ExchangeOrder>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMarketAccess
     * @param symbol  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMarketAccessCall(String symbol, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/exchange/order/access/{symbol}"
            .replaceAll("\\{" + "symbol" + "\\}", apiClient.escapeString(symbol.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getMarketAccessValidateBeforeCall(String symbol, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new ApiException("Missing the required parameter 'symbol' when calling getMarketAccess(Async)");
        }
        

        com.squareup.okhttp.Call call = getMarketAccessCall(symbol, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Check access to market
     * 
     * @param symbol  (required)
     * @return Reasons
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Reasons getMarketAccess(String symbol) throws ApiException {
        ApiResponse<Reasons> resp = getMarketAccessWithHttpInfo(symbol);
        return resp.getData();
    }

    /**
     * Check access to market
     * 
     * @param symbol  (required)
     * @return ApiResponse&lt;Reasons&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Reasons> getMarketAccessWithHttpInfo(String symbol) throws ApiException {
        com.squareup.okhttp.Call call = getMarketAccessValidateBeforeCall(symbol, null, null);
        Type localVarReturnType = new TypeToken<Reasons>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Check access to market (asynchronously)
     * 
     * @param symbol  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMarketAccessAsync(String symbol, final ApiCallback<Reasons> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getMarketAccessValidateBeforeCall(symbol, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Reasons>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listExchangeOrders
     * @param symbol  (optional)
     * @param completed  (optional)
     * @param offset start offset (optional, default to 0)
     * @param max max results (optional, default to 10)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listExchangeOrdersCall(String symbol, Boolean completed, Integer offset, Integer max, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/exchange/order";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (symbol != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("symbol", symbol));
        if (completed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("completed", completed));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (max != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("max", max));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listExchangeOrdersValidateBeforeCall(String symbol, Boolean completed, Integer offset, Integer max, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listExchangeOrdersCall(symbol, completed, offset, max, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Orders
     * 
     * @param symbol  (optional)
     * @param completed  (optional)
     * @param offset start offset (optional, default to 0)
     * @param max max results (optional, default to 10)
     * @return List&lt;ExchangeOrder&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ExchangeOrder> listExchangeOrders(String symbol, Boolean completed, Integer offset, Integer max) throws ApiException {
        ApiResponse<List<ExchangeOrder>> resp = listExchangeOrdersWithHttpInfo(symbol, completed, offset, max);
        return resp.getData();
    }

    /**
     * List Orders
     * 
     * @param symbol  (optional)
     * @param completed  (optional)
     * @param offset start offset (optional, default to 0)
     * @param max max results (optional, default to 10)
     * @return ApiResponse&lt;List&lt;ExchangeOrder&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ExchangeOrder>> listExchangeOrdersWithHttpInfo(String symbol, Boolean completed, Integer offset, Integer max) throws ApiException {
        com.squareup.okhttp.Call call = listExchangeOrdersValidateBeforeCall(symbol, completed, offset, max, null, null);
        Type localVarReturnType = new TypeToken<List<ExchangeOrder>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Orders (asynchronously)
     * 
     * @param symbol  (optional)
     * @param completed  (optional)
     * @param offset start offset (optional, default to 0)
     * @param max max results (optional, default to 10)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listExchangeOrdersAsync(String symbol, Boolean completed, Integer offset, Integer max, final ApiCallback<List<ExchangeOrder>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listExchangeOrdersValidateBeforeCall(symbol, completed, offset, max, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ExchangeOrder>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for placeExchangeOrder
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call placeExchangeOrderCall(ExchangeOrderRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/api/v1/exchange/order";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call placeExchangeOrderValidateBeforeCall(ExchangeOrderRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = placeExchangeOrderCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Place Order
     * Place an Order on the Exchange
     * @param body  (optional)
     * @return ExchangeOrder
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ExchangeOrder placeExchangeOrder(ExchangeOrderRequest body) throws ApiException {
        ApiResponse<ExchangeOrder> resp = placeExchangeOrderWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Place Order
     * Place an Order on the Exchange
     * @param body  (optional)
     * @return ApiResponse&lt;ExchangeOrder&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ExchangeOrder> placeExchangeOrderWithHttpInfo(ExchangeOrderRequest body) throws ApiException {
        com.squareup.okhttp.Call call = placeExchangeOrderValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<ExchangeOrder>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Place Order (asynchronously)
     * Place an Order on the Exchange
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call placeExchangeOrderAsync(ExchangeOrderRequest body, final ApiCallback<ExchangeOrder> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = placeExchangeOrderValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ExchangeOrder>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}