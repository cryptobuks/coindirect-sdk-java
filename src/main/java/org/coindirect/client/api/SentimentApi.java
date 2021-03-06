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


import org.coindirect.client.model.ExchangeRate;
import org.coindirect.client.model.Sentiment;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SentimentApi {
    private ApiClient apiClient;

    public SentimentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SentimentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listExchangeRatesLast
     * @param currency  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listExchangeRatesLastCall(String currency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/exchange-rate/last";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));

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
    private com.squareup.okhttp.Call listExchangeRatesLastValidateBeforeCall(String currency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listExchangeRatesLastCall(currency, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read Last Exchange Rates
     * 
     * @param currency  (optional)
     * @return List&lt;ExchangeRate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ExchangeRate> listExchangeRatesLast(String currency) throws ApiException {
        ApiResponse<List<ExchangeRate>> resp = listExchangeRatesLastWithHttpInfo(currency);
        return resp.getData();
    }

    /**
     * Read Last Exchange Rates
     * 
     * @param currency  (optional)
     * @return ApiResponse&lt;List&lt;ExchangeRate&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ExchangeRate>> listExchangeRatesLastWithHttpInfo(String currency) throws ApiException {
        com.squareup.okhttp.Call call = listExchangeRatesLastValidateBeforeCall(currency, null, null);
        Type localVarReturnType = new TypeToken<List<ExchangeRate>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read Last Exchange Rates (asynchronously)
     * 
     * @param currency  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listExchangeRatesLastAsync(String currency, final ApiCallback<List<ExchangeRate>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listExchangeRatesLastValidateBeforeCall(currency, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ExchangeRate>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listExchangeRatesRecent
     * @param baseCurrency  (optional)
     * @param counterCurrency  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listExchangeRatesRecentCall(String baseCurrency, String counterCurrency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/exchange-rate/recent";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (baseCurrency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("baseCurrency", baseCurrency));
        if (counterCurrency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("counterCurrency", counterCurrency));

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
    private com.squareup.okhttp.Call listExchangeRatesRecentValidateBeforeCall(String baseCurrency, String counterCurrency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listExchangeRatesRecentCall(baseCurrency, counterCurrency, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read Exchange Rates
     * 
     * @param baseCurrency  (optional)
     * @param counterCurrency  (optional)
     * @return List&lt;ExchangeRate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ExchangeRate> listExchangeRatesRecent(String baseCurrency, String counterCurrency) throws ApiException {
        ApiResponse<List<ExchangeRate>> resp = listExchangeRatesRecentWithHttpInfo(baseCurrency, counterCurrency);
        return resp.getData();
    }

    /**
     * Read Exchange Rates
     * 
     * @param baseCurrency  (optional)
     * @param counterCurrency  (optional)
     * @return ApiResponse&lt;List&lt;ExchangeRate&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ExchangeRate>> listExchangeRatesRecentWithHttpInfo(String baseCurrency, String counterCurrency) throws ApiException {
        com.squareup.okhttp.Call call = listExchangeRatesRecentValidateBeforeCall(baseCurrency, counterCurrency, null, null);
        Type localVarReturnType = new TypeToken<List<ExchangeRate>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read Exchange Rates (asynchronously)
     * 
     * @param baseCurrency  (optional)
     * @param counterCurrency  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listExchangeRatesRecentAsync(String baseCurrency, String counterCurrency, final ApiCallback<List<ExchangeRate>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listExchangeRatesRecentValidateBeforeCall(baseCurrency, counterCurrency, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ExchangeRate>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listSentimentAggregated
     * @param currency  (optional)
     * @param after  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listSentimentAggregatedCall(List<String> currency, Long after, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/sentiment/aggregated";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (currency != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "currency", currency));
        if (after != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("after", after));

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
    private com.squareup.okhttp.Call listSentimentAggregatedValidateBeforeCall(List<String> currency, Long after, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listSentimentAggregatedCall(currency, after, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read Aggregated Sentiment
     * 
     * @param currency  (optional)
     * @param after  (optional)
     * @return List&lt;Sentiment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Sentiment> listSentimentAggregated(List<String> currency, Long after) throws ApiException {
        ApiResponse<List<Sentiment>> resp = listSentimentAggregatedWithHttpInfo(currency, after);
        return resp.getData();
    }

    /**
     * Read Aggregated Sentiment
     * 
     * @param currency  (optional)
     * @param after  (optional)
     * @return ApiResponse&lt;List&lt;Sentiment&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Sentiment>> listSentimentAggregatedWithHttpInfo(List<String> currency, Long after) throws ApiException {
        com.squareup.okhttp.Call call = listSentimentAggregatedValidateBeforeCall(currency, after, null, null);
        Type localVarReturnType = new TypeToken<List<Sentiment>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read Aggregated Sentiment (asynchronously)
     * 
     * @param currency  (optional)
     * @param after  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listSentimentAggregatedAsync(List<String> currency, Long after, final ApiCallback<List<Sentiment>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listSentimentAggregatedValidateBeforeCall(currency, after, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Sentiment>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listSentimentLast
     * @param currency  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listSentimentLastCall(List<String> currency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/sentiment/last";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (currency != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "currency", currency));

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
    private com.squareup.okhttp.Call listSentimentLastValidateBeforeCall(List<String> currency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listSentimentLastCall(currency, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read Last Sentiment
     * 
     * @param currency  (optional)
     * @return List&lt;Sentiment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Sentiment> listSentimentLast(List<String> currency) throws ApiException {
        ApiResponse<List<Sentiment>> resp = listSentimentLastWithHttpInfo(currency);
        return resp.getData();
    }

    /**
     * Read Last Sentiment
     * 
     * @param currency  (optional)
     * @return ApiResponse&lt;List&lt;Sentiment&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Sentiment>> listSentimentLastWithHttpInfo(List<String> currency) throws ApiException {
        com.squareup.okhttp.Call call = listSentimentLastValidateBeforeCall(currency, null, null);
        Type localVarReturnType = new TypeToken<List<Sentiment>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read Last Sentiment (asynchronously)
     * 
     * @param currency  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listSentimentLastAsync(List<String> currency, final ApiCallback<List<Sentiment>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listSentimentLastValidateBeforeCall(currency, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Sentiment>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
