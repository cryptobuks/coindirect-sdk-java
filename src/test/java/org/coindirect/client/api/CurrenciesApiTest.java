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
import java.math.BigDecimal;
import org.coindirect.client.model.Currency;
import org.coindirect.client.model.WrappedPrimitive;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CurrenciesApi
 */
@Ignore
public class CurrenciesApiTest {

    private final CurrenciesApi api = new CurrenciesApi();

    
    /**
     * Convert Currency Value
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertCurrencyTest() throws ApiException {
        String fromCode = null;
        String toCode = null;
        BigDecimal amount = null;
        WrappedPrimitive response = api.convertCurrency(fromCode, toCode, amount);

        // TODO: test validations
    }
    
    /**
     * Read Currency
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrencyTest() throws ApiException {
        Long id = null;
        Currency response = api.getCurrency(id);

        // TODO: test validations
    }
    
    /**
     * List Crypto Currencies
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCurrenciesCryptoTest() throws ApiException {
        Boolean allowDeposits = null;
        Integer offset = null;
        Integer max = null;
        List<Currency> response = api.listCurrenciesCrypto(allowDeposits, offset, max);

        // TODO: test validations
    }
    
    /**
     * List Fiat Currencies
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCurrenciesFiatTest() throws ApiException {
        Boolean usable = null;
        Integer offset = null;
        Integer max = null;
        List<Currency> response = api.listCurrenciesFiat(usable, offset, max);

        // TODO: test validations
    }
    
}