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
import org.coindirect.client.model.OfferToBuy;
import org.coindirect.client.model.OfferToSell;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for P2PMarketplaceOffersPublicApi
 */
@Ignore
public class P2PMarketplaceOffersPublicApiTest {

    private final P2PMarketplaceOffersPublicApi api = new P2PMarketplaceOffersPublicApi();

    
    /**
     * Get offer information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getP2POfferTest() throws ApiException {
        Long id = null;
        OfferToSell response = api.getP2POffer(id);

        // TODO: test validations
    }
    
    /**
     * Find buy offers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listP2PBuyOffersTest() throws ApiException {
        String currencyForSale = null;
        String currencyAccepted = null;
        Long category = null;
        Long type = null;
        String search = null;
        String affiliateCode = null;
        String countryCode = null;
        Integer offset = null;
        Integer max = null;
        List<OfferToBuy> response = api.listP2PBuyOffers(currencyForSale, currencyAccepted, category, type, search, affiliateCode, countryCode, offset, max);

        // TODO: test validations
    }
    
    /**
     * List sell offers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listP2PSellOffersTest() throws ApiException {
        String currencyForSale = null;
        String currencyAccepted = null;
        Long category = null;
        Long type = null;
        String search = null;
        String affiliateCode = null;
        BigDecimal minimumAvailable = null;
        String countryCode = null;
        Integer offset = null;
        Integer max = null;
        List<OfferToSell> response = api.listP2PSellOffers(currencyForSale, currencyAccepted, category, type, search, affiliateCode, minimumAvailable, countryCode, offset, max);

        // TODO: test validations
    }
    
}
