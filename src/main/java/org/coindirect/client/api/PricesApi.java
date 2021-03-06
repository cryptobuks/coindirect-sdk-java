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


import org.coindirect.client.model.CurrencySnapshot;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PricesApi {
    private ApiClient apiClient;

    public PricesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PricesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listCurrencySnapshots
     * @param baseCurrency  (optional)
     * @param countryCode  (optional)
     * @param offset start offset (optional, default to 0)
     * @param max max results (optional, default to 10)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listCurrencySnapshotsCall(String baseCurrency, String countryCode, Integer offset, Integer max, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/currency/snapshot";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (baseCurrency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("baseCurrency", baseCurrency));
        if (countryCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("countryCode", countryCode));
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
    private com.squareup.okhttp.Call listCurrencySnapshotsValidateBeforeCall(String baseCurrency, String countryCode, Integer offset, Integer max, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listCurrencySnapshotsCall(baseCurrency, countryCode, offset, max, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Latest Prices
     * 
     * @param baseCurrency  (optional)
     * @param countryCode  (optional)
     * @param offset start offset (optional, default to 0)
     * @param max max results (optional, default to 10)
     * @return List&lt;CurrencySnapshot&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CurrencySnapshot> listCurrencySnapshots(String baseCurrency, String countryCode, Integer offset, Integer max) throws ApiException {
        ApiResponse<List<CurrencySnapshot>> resp = listCurrencySnapshotsWithHttpInfo(baseCurrency, countryCode, offset, max);
        return resp.getData();
    }

    /**
     * List Latest Prices
     * 
     * @param baseCurrency  (optional)
     * @param countryCode  (optional)
     * @param offset start offset (optional, default to 0)
     * @param max max results (optional, default to 10)
     * @return ApiResponse&lt;List&lt;CurrencySnapshot&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CurrencySnapshot>> listCurrencySnapshotsWithHttpInfo(String baseCurrency, String countryCode, Integer offset, Integer max) throws ApiException {
        com.squareup.okhttp.Call call = listCurrencySnapshotsValidateBeforeCall(baseCurrency, countryCode, offset, max, null, null);
        Type localVarReturnType = new TypeToken<List<CurrencySnapshot>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Latest Prices (asynchronously)
     * 
     * @param baseCurrency  (optional)
     * @param countryCode  (optional)
     * @param offset start offset (optional, default to 0)
     * @param max max results (optional, default to 10)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listCurrencySnapshotsAsync(String baseCurrency, String countryCode, Integer offset, Integer max, final ApiCallback<List<CurrencySnapshot>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listCurrencySnapshotsValidateBeforeCall(baseCurrency, countryCode, offset, max, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CurrencySnapshot>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
