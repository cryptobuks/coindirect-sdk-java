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
import org.coindirect.client.model.ChatMessage;
import org.coindirect.client.model.WrappedPrimitive;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for P2PMarketplaceOrdersChatsApi
 */
@Ignore
public class P2PMarketplaceOrdersChatsApiTest {

    private final P2PMarketplaceOrdersChatsApi api = new P2PMarketplaceOrdersChatsApi();

    
    /**
     * Retrieve URL for message attachment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getP2POrderMessageAttachmentURLTest() throws ApiException {
        Long id = null;
        Long fileId = null;
        WrappedPrimitive response = api.getP2POrderMessageAttachmentURL(id, fileId);

        // TODO: test validations
    }
    
    /**
     * Read messages for Order
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getP2POrderMessagesTest() throws ApiException {
        Long id = null;
        Long start = null;
        List<ChatMessage> response = api.getP2POrderMessages(id, start);

        // TODO: test validations
    }
    
    /**
     * Send message for order
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendP2POrderMessageTest() throws ApiException {
        Long id = null;
        ChatMessage body = null;
        api.sendP2POrderMessage(id, body);

        // TODO: test validations
    }
    
}
