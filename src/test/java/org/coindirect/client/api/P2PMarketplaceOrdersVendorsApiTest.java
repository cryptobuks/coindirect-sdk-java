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
import org.coindirect.client.model.Authorization;
import org.coindirect.client.model.Order;
import org.coindirect.client.model.OrderDocument;
import org.coindirect.client.model.PaymentOption;
import org.coindirect.client.model.PaymentResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for P2PMarketplaceOrdersVendorsApi
 */
@Ignore
public class P2PMarketplaceOrdersVendorsApiTest {

    private final P2PMarketplaceOrdersVendorsApi api = new P2PMarketplaceOrdersVendorsApi();

    
    /**
     * Cancel Order
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vendorCancelP2POrderTest() throws ApiException {
        Long id = null;
        Authorization body = null;
        Order response = api.vendorCancelP2POrder(id, body);

        // TODO: test validations
    }
    
    /**
     * Export Orders CSV
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vendorExportP2POrdersTest() throws ApiException {
        String fromDate = null;
        String toDate = null;
        api.vendorExportP2POrders(fromDate, toDate);

        // TODO: test validations
    }
    
    /**
     * Get order
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vendorGetP2POrderTest() throws ApiException {
        Long id = null;
        Order response = api.vendorGetP2POrder(id);

        // TODO: test validations
    }
    
    /**
     * Get documents for Order
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vendorGetP2POrderDocumentTest() throws ApiException {
        Long id = null;
        List<OrderDocument> response = api.vendorGetP2POrderDocument(id);

        // TODO: test validations
    }
    
    /**
     * List Completed Orders
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vendorListP2PCompletedOrdersTest() throws ApiException {
        Integer offset = null;
        Integer max = null;
        List<Order> response = api.vendorListP2PCompletedOrders(offset, max);

        // TODO: test validations
    }
    
    /**
     * List Pending Orders
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vendorListP2PPendingOrdersTest() throws ApiException {
        Integer offset = null;
        Integer max = null;
        List<Order> response = api.vendorListP2PPendingOrders(offset, max);

        // TODO: test validations
    }
    
    /**
     * Mark an order as paid (buyer)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vendorMarkP2POrderAsPaidBuyerTest() throws ApiException {
        Long id = null;
        Order response = api.vendorMarkP2POrderAsPaidBuyer(id);

        // TODO: test validations
    }
    
    /**
     * Mark an order as paid (seller)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vendorMarkP2POrderAsPaidSellerTest() throws ApiException {
        Long id = null;
        Order response = api.vendorMarkP2POrderAsPaidSeller(id);

        // TODO: test validations
    }
    
    /**
     * Pay for order
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vendorPayP2POrderTest() throws ApiException {
        Long id = null;
        PaymentOption body = null;
        PaymentResult response = api.vendorPayP2POrder(id, body);

        // TODO: test validations
    }
    
    /**
     * Confirm Order
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vendorPlaceP2POrderTest() throws ApiException {
        Long id = null;
        Authorization body = null;
        Order response = api.vendorPlaceP2POrder(id, body);

        // TODO: test validations
    }
    
    /**
     * Upload Order Documentation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vendorUploadP2POrderDocumentTest() throws ApiException {
        Long id = null;
        OrderDocument body = null;
        api.vendorUploadP2POrderDocument(id, body);

        // TODO: test validations
    }
    
}
