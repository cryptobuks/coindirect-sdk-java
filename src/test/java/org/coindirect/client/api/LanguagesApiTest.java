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
import org.coindirect.client.model.Language;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LanguagesApi
 */
@Ignore
public class LanguagesApiTest {

    private final LanguagesApi api = new LanguagesApi();

    
    /**
     * Read Language
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLanguageTest() throws ApiException {
        Long id = null;
        Language response = api.getLanguage(id);

        // TODO: test validations
    }
    
    /**
     * List Languages
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listLanguagesTest() throws ApiException {
        Integer offset = null;
        Integer max = null;
        List<Language> response = api.listLanguages(offset, max);

        // TODO: test validations
    }
    
}
