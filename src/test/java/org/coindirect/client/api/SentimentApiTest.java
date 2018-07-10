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

import org.coindirect.client.invoker.ApiException;
import org.coindirect.client.model.ExchangeRate;
import org.coindirect.client.model.Sentiment;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SentimentApi
 */
@Ignore
public class SentimentApiTest {

    private final SentimentApi api = new SentimentApi();

    
    /**
     * Read Last Exchange Rates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listExchangeRatesLastTest() throws ApiException {
        String currency = null;
        List<ExchangeRate> response = api.listExchangeRatesLast(currency);

        // TODO: test validations
    }
    
    /**
     * Read Exchange Rates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listExchangeRatesRecentTest() throws ApiException {
        String baseCurrency = null;
        String counterCurrency = null;
        List<ExchangeRate> response = api.listExchangeRatesRecent(baseCurrency, counterCurrency);

        // TODO: test validations
    }
    
    /**
     * Read Aggregated Sentiment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSentimentAggregatedTest() throws ApiException {
        List<String> currency = null;
        Long after = null;
        List<Sentiment> response = api.listSentimentAggregated(currency, after);

        // TODO: test validations
    }
    
    /**
     * Read Last Sentiment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSentimentLastTest() throws ApiException {
        List<String> currency = null;
        List<Sentiment> response = api.listSentimentLast(currency);

        // TODO: test validations
    }
    
}