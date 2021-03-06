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


import org.coindirect.client.model.ChatMessage;
import org.coindirect.client.model.WrappedPrimitive;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P2PMarketplaceOrdersChatsApi {
    private ApiClient apiClient;

    public P2PMarketplaceOrdersChatsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public P2PMarketplaceOrdersChatsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getP2POrderMessageAttachmentURL
     * @param id  (required)
     * @param fileId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getP2POrderMessageAttachmentURLCall(Long id, Long fileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/order/chat/{id}/{fileId}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(fileId.toString()));

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
    private com.squareup.okhttp.Call getP2POrderMessageAttachmentURLValidateBeforeCall(Long id, Long fileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getP2POrderMessageAttachmentURL(Async)");
        }
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling getP2POrderMessageAttachmentURL(Async)");
        }
        

        com.squareup.okhttp.Call call = getP2POrderMessageAttachmentURLCall(id, fileId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieve URL for message attachment
     * 
     * @param id  (required)
     * @param fileId  (required)
     * @return WrappedPrimitive
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WrappedPrimitive getP2POrderMessageAttachmentURL(Long id, Long fileId) throws ApiException {
        ApiResponse<WrappedPrimitive> resp = getP2POrderMessageAttachmentURLWithHttpInfo(id, fileId);
        return resp.getData();
    }

    /**
     * Retrieve URL for message attachment
     * 
     * @param id  (required)
     * @param fileId  (required)
     * @return ApiResponse&lt;WrappedPrimitive&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WrappedPrimitive> getP2POrderMessageAttachmentURLWithHttpInfo(Long id, Long fileId) throws ApiException {
        com.squareup.okhttp.Call call = getP2POrderMessageAttachmentURLValidateBeforeCall(id, fileId, null, null);
        Type localVarReturnType = new TypeToken<WrappedPrimitive>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve URL for message attachment (asynchronously)
     * 
     * @param id  (required)
     * @param fileId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getP2POrderMessageAttachmentURLAsync(Long id, Long fileId, final ApiCallback<WrappedPrimitive> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getP2POrderMessageAttachmentURLValidateBeforeCall(id, fileId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<WrappedPrimitive>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getP2POrderMessages
     * @param id  (required)
     * @param start  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getP2POrderMessagesCall(Long id, Long start, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/order/chat/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start", start));

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
    private com.squareup.okhttp.Call getP2POrderMessagesValidateBeforeCall(Long id, Long start, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getP2POrderMessages(Async)");
        }
        

        com.squareup.okhttp.Call call = getP2POrderMessagesCall(id, start, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read messages for Order
     * 
     * @param id  (required)
     * @param start  (optional)
     * @return List&lt;ChatMessage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ChatMessage> getP2POrderMessages(Long id, Long start) throws ApiException {
        ApiResponse<List<ChatMessage>> resp = getP2POrderMessagesWithHttpInfo(id, start);
        return resp.getData();
    }

    /**
     * Read messages for Order
     * 
     * @param id  (required)
     * @param start  (optional)
     * @return ApiResponse&lt;List&lt;ChatMessage&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ChatMessage>> getP2POrderMessagesWithHttpInfo(Long id, Long start) throws ApiException {
        com.squareup.okhttp.Call call = getP2POrderMessagesValidateBeforeCall(id, start, null, null);
        Type localVarReturnType = new TypeToken<List<ChatMessage>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read messages for Order (asynchronously)
     * 
     * @param id  (required)
     * @param start  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getP2POrderMessagesAsync(Long id, Long start, final ApiCallback<List<ChatMessage>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getP2POrderMessagesValidateBeforeCall(id, start, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ChatMessage>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for sendP2POrderMessage
     * @param id  (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call sendP2POrderMessageCall(Long id, ChatMessage body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/api/order/chat/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
    private com.squareup.okhttp.Call sendP2POrderMessageValidateBeforeCall(Long id, ChatMessage body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling sendP2POrderMessage(Async)");
        }
        

        com.squareup.okhttp.Call call = sendP2POrderMessageCall(id, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Send message for order
     * 
     * @param id  (required)
     * @param body  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void sendP2POrderMessage(Long id, ChatMessage body) throws ApiException {
        sendP2POrderMessageWithHttpInfo(id, body);
    }

    /**
     * Send message for order
     * 
     * @param id  (required)
     * @param body  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> sendP2POrderMessageWithHttpInfo(Long id, ChatMessage body) throws ApiException {
        com.squareup.okhttp.Call call = sendP2POrderMessageValidateBeforeCall(id, body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Send message for order (asynchronously)
     * 
     * @param id  (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call sendP2POrderMessageAsync(Long id, ChatMessage body, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = sendP2POrderMessageValidateBeforeCall(id, body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
