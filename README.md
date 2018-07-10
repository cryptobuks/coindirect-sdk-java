# client

Coindirect
- API version: 1
  - Build date: 2018-07-10T11:44:48.559+02:00

The Coindirect API is offered to all users to make use of our P2P Marketplace, Exchange and Wallets.

  For more information, please visit [https://help.coindirect.com](https://help.coindirect.com)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.coindirect</groupId>
  <artifactId>client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.coindirect:client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.coindirect.client.invoker.*;
import org.coindirect.client.invoker.auth.*;
import org.coindirect.client.model.*;
import org.coindirect.client.api.AccountsApi;

import java.io.File;
import java.util.*;

public class AccountsApiExample {

    public static void main(String[] args) {
        
        AccountsApi apiInstance = new AccountsApi();
        AccountDocument body = new AccountDocument(); // AccountDocument | 
        try {
            AccountDocument result = apiInstance.createAccountDocument(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#createAccountDocument");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**createAccountDocument**](docs/AccountsApi.md#createAccountDocument) | **POST** /api/account/document | Upload a document for an account
*AccountsApi* | [**getAccountPreference**](docs/AccountsApi.md#getAccountPreference) | **GET** /api/account/preference/{name} | Read Account Preference
*AccountsApi* | [**getAccountProgress**](docs/AccountsApi.md#getAccountProgress) | **GET** /api/account/progress | Check progress of account setup
*AccountsApi* | [**getAccountWebsocketChannel**](docs/AccountsApi.md#getAccountWebsocketChannel) | **GET** /api/account/channel | Get WebSocket Channel
*AccountsApi* | [**getAffiliateCode**](docs/AccountsApi.md#getAffiliateCode) | **GET** /api/account/affiliate/code | Get affiliate code
*AccountsApi* | [**listAccountDocuments**](docs/AccountsApi.md#listAccountDocuments) | **GET** /api/account/document | List uploaded documents for an account
*AccountsApi* | [**listAccountPreferences**](docs/AccountsApi.md#listAccountPreferences) | **GET** /api/account/preference | List Account Preferences
*AccountsApi* | [**listAffiliateBalances**](docs/AccountsApi.md#listAffiliateBalances) | **GET** /api/account/affiliate/balance | Get affiliate balances
*AccountsApi* | [**listAffiliateTransactions**](docs/AccountsApi.md#listAffiliateTransactions) | **GET** /api/account/affiliate/transaction | Get affiliate transactions
*AccountsApi* | [**updateAccountPreference**](docs/AccountsApi.md#updateAccountPreference) | **PUT** /api/account/preference/{name} | Update Account Preference
*BankingApi* | [**createBank**](docs/BankingApi.md#createBank) | **POST** /api/bank | Create Bank
*BankingApi* | [**getBank**](docs/BankingApi.md#getBank) | **GET** /api/bank/read/{id} | Read Bank
*BankingApi* | [**listBanksByCountry**](docs/BankingApi.md#listBanksByCountry) | **GET** /api/bank/{countryCode} | List Banks by Country
*CountriesApi* | [**detectCountryByIp**](docs/CountriesApi.md#detectCountryByIp) | **GET** /api/country/detect | Detect Country by IP
*CountriesApi* | [**getCountry**](docs/CountriesApi.md#getCountry) | **GET** /api/country/{id} | Read Country
*CountriesApi* | [**listCountries**](docs/CountriesApi.md#listCountries) | **GET** /api/country | List Countries
*CurrenciesApi* | [**convertCurrency**](docs/CurrenciesApi.md#convertCurrency) | **GET** /api/currency/convert/{fromCode}/{toCode} | Convert Currency Value
*CurrenciesApi* | [**getCurrency**](docs/CurrenciesApi.md#getCurrency) | **GET** /api/currency/{id} | Read Currency
*CurrenciesApi* | [**listCurrenciesCrypto**](docs/CurrenciesApi.md#listCurrenciesCrypto) | **GET** /api/currency/crypto | List Crypto Currencies
*CurrenciesApi* | [**listCurrenciesFiat**](docs/CurrenciesApi.md#listCurrenciesFiat) | **GET** /api/currency/fiat | List Fiat Currencies
*ExchangeApi* | [**getExchangeOrderBook**](docs/ExchangeApi.md#getExchangeOrderBook) | **GET** /api/v1/exchange/market/book | Get Order Book For Market
*ExchangeApi* | [**listExchangeMarkets**](docs/ExchangeApi.md#listExchangeMarkets) | **GET** /api/v1/exchange/market | List Markets
*ExchangeHistoricalDataApi* | [**getHistoricalExchangeData**](docs/ExchangeHistoricalDataApi.md#getHistoricalExchangeData) | **GET** /api/v1/exchange/historical/{market}/{history}/{grouping} | Retrieve Historical Data
*ExchangeHistoricalDataApi* | [**getHistoricalExchangeTrades**](docs/ExchangeHistoricalDataApi.md#getHistoricalExchangeTrades) | **GET** /api/v1/exchange/historical/trades/{market}/{history} | Retrieve Historical Trades
*ExchangeOrdersApi* | [**cancelExchangeOrder**](docs/ExchangeOrdersApi.md#cancelExchangeOrder) | **DELETE** /api/v1/exchange/order/{uuid} | Cancel Order
*ExchangeOrdersApi* | [**getExchangeOrder**](docs/ExchangeOrdersApi.md#getExchangeOrder) | **GET** /api/v1/exchange/order/read/{uuid} | Get Order
*ExchangeOrdersApi* | [**getMarketAccess**](docs/ExchangeOrdersApi.md#getMarketAccess) | **GET** /api/v1/exchange/order/access/{symbol} | Check access to market
*ExchangeOrdersApi* | [**listExchangeOrders**](docs/ExchangeOrdersApi.md#listExchangeOrders) | **GET** /api/v1/exchange/order | List Orders
*ExchangeOrdersApi* | [**placeExchangeOrder**](docs/ExchangeOrdersApi.md#placeExchangeOrder) | **POST** /api/v1/exchange/order | Place Order
*LanguagesApi* | [**getLanguage**](docs/LanguagesApi.md#getLanguage) | **GET** /api/language/{id} | Read Language
*LanguagesApi* | [**listLanguages**](docs/LanguagesApi.md#listLanguages) | **GET** /api/language | List Languages
*P2PMarketplaceOffersPublicApi* | [**getP2POffer**](docs/P2PMarketplaceOffersPublicApi.md#getP2POffer) | **GET** /api/public/offer/{id} | Get offer information
*P2PMarketplaceOffersPublicApi* | [**listP2PBuyOffers**](docs/P2PMarketplaceOffersPublicApi.md#listP2PBuyOffers) | **GET** /api/public/offer/buy/{currencyForSale}/{currencyAccepted} | Find buy offers
*P2PMarketplaceOffersPublicApi* | [**listP2PSellOffers**](docs/P2PMarketplaceOffersPublicApi.md#listP2PSellOffers) | **GET** /api/public/offer/sell/{currencyForSale}/{currencyAccepted} | List sell offers
*P2PMarketplaceOffersVendorsApi* | [**createP2PBuyOffer**](docs/P2PMarketplaceOffersVendorsApi.md#createP2PBuyOffer) | **POST** /api/offer/buy | Create Offer to Buy
*P2PMarketplaceOffersVendorsApi* | [**createP2PSellOffer**](docs/P2PMarketplaceOffersVendorsApi.md#createP2PSellOffer) | **POST** /api/offer/sell | Create Offer to Sell
*P2PMarketplaceOffersVendorsApi* | [**deleteP2POffer**](docs/P2PMarketplaceOffersVendorsApi.md#deleteP2POffer) | **DELETE** /api/offer/{id} | Delete Offer
*P2PMarketplaceOffersVendorsApi* | [**evaluateP2PEquation**](docs/P2PMarketplaceOffersVendorsApi.md#evaluateP2PEquation) | **POST** /api/offer/equation | Execution Equation
*P2PMarketplaceOffersVendorsApi* | [**getP2POffer**](docs/P2PMarketplaceOffersVendorsApi.md#getP2POffer) | **GET** /api/offer/{id} | Read an Offer
*P2PMarketplaceOffersVendorsApi* | [**listP2PExchanges**](docs/P2PMarketplaceOffersVendorsApi.md#listP2PExchanges) | **GET** /api/offer/exchanges | List Exchanges for Equations
*P2PMarketplaceOffersVendorsApi* | [**listP2POffers**](docs/P2PMarketplaceOffersVendorsApi.md#listP2POffers) | **GET** /api/offer | List Offers
*P2PMarketplaceOffersVendorsApi* | [**listP2PVariables**](docs/P2PMarketplaceOffersVendorsApi.md#listP2PVariables) | **GET** /api/offer/variables | List Variables for Equations
*P2PMarketplaceOffersVendorsApi* | [**updateP2POffer**](docs/P2PMarketplaceOffersVendorsApi.md#updateP2POffer) | **PUT** /api/offer/{id} | Update Offer
*P2PMarketplaceOrdersChatsApi* | [**getP2POrderMessageAttachmentURL**](docs/P2PMarketplaceOrdersChatsApi.md#getP2POrderMessageAttachmentURL) | **GET** /api/order/chat/{id}/{fileId} | Retrieve URL for message attachment
*P2PMarketplaceOrdersChatsApi* | [**getP2POrderMessages**](docs/P2PMarketplaceOrdersChatsApi.md#getP2POrderMessages) | **GET** /api/order/chat/{id} | Read messages for Order
*P2PMarketplaceOrdersChatsApi* | [**sendP2POrderMessage**](docs/P2PMarketplaceOrdersChatsApi.md#sendP2POrderMessage) | **POST** /api/order/chat/{id} | Send message for order
*P2PMarketplaceOrdersCustomersApi* | [**beginP2PBuyOrder**](docs/P2PMarketplaceOrdersCustomersApi.md#beginP2PBuyOrder) | **POST** /api/order/buy | Pre-authorize buy order
*P2PMarketplaceOrdersCustomersApi* | [**beginP2PSellOrder**](docs/P2PMarketplaceOrdersCustomersApi.md#beginP2PSellOrder) | **POST** /api/order/sell | Pre-authorize sell order
*P2PMarketplaceOrdersCustomersApi* | [**cancelP2POrder**](docs/P2PMarketplaceOrdersCustomersApi.md#cancelP2POrder) | **DELETE** /api/order/{id} | Cancel Order
*P2PMarketplaceOrdersCustomersApi* | [**exportP2POrders**](docs/P2PMarketplaceOrdersCustomersApi.md#exportP2POrders) | **GET** /api/order/csv | Export Orders CSV
*P2PMarketplaceOrdersCustomersApi* | [**getP2POrder**](docs/P2PMarketplaceOrdersCustomersApi.md#getP2POrder) | **GET** /api/order/{id} | Get order
*P2PMarketplaceOrdersCustomersApi* | [**getP2POrderDocument**](docs/P2PMarketplaceOrdersCustomersApi.md#getP2POrderDocument) | **GET** /api/order/upload/{orderId} | View Upload Order Documentation
*P2PMarketplaceOrdersCustomersApi* | [**listP2PCompletedOrders**](docs/P2PMarketplaceOrdersCustomersApi.md#listP2PCompletedOrders) | **GET** /api/order/completed | List Completed Orders
*P2PMarketplaceOrdersCustomersApi* | [**listP2POrderDocuments**](docs/P2PMarketplaceOrdersCustomersApi.md#listP2POrderDocuments) | **GET** /api/order/uploads/{id} | Get documents for Order
*P2PMarketplaceOrdersCustomersApi* | [**listP2POrders**](docs/P2PMarketplaceOrdersCustomersApi.md#listP2POrders) | **GET** /api/order | List Orders
*P2PMarketplaceOrdersCustomersApi* | [**listP2PPendingOrders**](docs/P2PMarketplaceOrdersCustomersApi.md#listP2PPendingOrders) | **GET** /api/order/pending | List Pending Orders
*P2PMarketplaceOrdersCustomersApi* | [**markP2POrderAsPaidBuyer**](docs/P2PMarketplaceOrdersCustomersApi.md#markP2POrderAsPaidBuyer) | **PUT** /api/order/mark-paid/{id} | Mark an order as paid (buyer)
*P2PMarketplaceOrdersCustomersApi* | [**markP2POrderAsPaidSeller**](docs/P2PMarketplaceOrdersCustomersApi.md#markP2POrderAsPaidSeller) | **PUT** /api/order/approve/{id} | Mark an order as paid (seller)
*P2PMarketplaceOrdersCustomersApi* | [**payP2POrder**](docs/P2PMarketplaceOrdersCustomersApi.md#payP2POrder) | **POST** /api/order/pay/{id} | Pay for order
*P2PMarketplaceOrdersCustomersApi* | [**placeP2POrder**](docs/P2PMarketplaceOrdersCustomersApi.md#placeP2POrder) | **PUT** /api/order/{id} | Place Order
*P2PMarketplaceOrdersCustomersApi* | [**rateP2POrder**](docs/P2PMarketplaceOrdersCustomersApi.md#rateP2POrder) | **PUT** /api/order/rate/{id} | Rate order
*P2PMarketplaceOrdersCustomersApi* | [**updateP2POrderPayment**](docs/P2PMarketplaceOrdersCustomersApi.md#updateP2POrderPayment) | **GET** /api/order/pay/{id} | Update payment status for order
*P2PMarketplaceOrdersCustomersApi* | [**uploadP2POrderDocument**](docs/P2PMarketplaceOrdersCustomersApi.md#uploadP2POrderDocument) | **POST** /api/order/upload/{id} | Upload Order Documentation
*P2PMarketplaceOrdersDisputesApi* | [**cancelP2POrderDispute**](docs/P2PMarketplaceOrdersDisputesApi.md#cancelP2POrderDispute) | **DELETE** /api/order/dispute/{id} | Cancel Dispute
*P2PMarketplaceOrdersDisputesApi* | [**createP2POrderDispute**](docs/P2PMarketplaceOrdersDisputesApi.md#createP2POrderDispute) | **POST** /api/order/dispute | Create Dispute
*P2PMarketplaceOrdersDisputesApi* | [**getP2POrderDispute**](docs/P2PMarketplaceOrdersDisputesApi.md#getP2POrderDispute) | **GET** /api/order/dispute/{id} | Retrieve Dispute
*P2PMarketplaceOrdersDisputesApi* | [**listP2PBuyerDisputeReasons**](docs/P2PMarketplaceOrdersDisputesApi.md#listP2PBuyerDisputeReasons) | **GET** /api/order/dispute/reason/buy | List Buyer Dispute Reasons
*P2PMarketplaceOrdersDisputesApi* | [**listP2PSellerDisputeReasons**](docs/P2PMarketplaceOrdersDisputesApi.md#listP2PSellerDisputeReasons) | **GET** /api/order/dispute/reason/sell | List Seller Dispute Reasons
*P2PMarketplaceOrdersVendorsApi* | [**vendorCancelP2POrder**](docs/P2PMarketplaceOrdersVendorsApi.md#vendorCancelP2POrder) | **DELETE** /api/partner/order/{id} | Cancel Order
*P2PMarketplaceOrdersVendorsApi* | [**vendorExportP2POrders**](docs/P2PMarketplaceOrdersVendorsApi.md#vendorExportP2POrders) | **GET** /api/partner/order/csv | Export Orders CSV
*P2PMarketplaceOrdersVendorsApi* | [**vendorGetP2POrder**](docs/P2PMarketplaceOrdersVendorsApi.md#vendorGetP2POrder) | **GET** /api/partner/order/{id} | Get order
*P2PMarketplaceOrdersVendorsApi* | [**vendorGetP2POrderDocument**](docs/P2PMarketplaceOrdersVendorsApi.md#vendorGetP2POrderDocument) | **GET** /api/partner/order/uploads/{id} | Get documents for Order
*P2PMarketplaceOrdersVendorsApi* | [**vendorListP2PCompletedOrders**](docs/P2PMarketplaceOrdersVendorsApi.md#vendorListP2PCompletedOrders) | **GET** /api/partner/order/completed | List Completed Orders
*P2PMarketplaceOrdersVendorsApi* | [**vendorListP2PPendingOrders**](docs/P2PMarketplaceOrdersVendorsApi.md#vendorListP2PPendingOrders) | **GET** /api/partner/order/pending | List Pending Orders
*P2PMarketplaceOrdersVendorsApi* | [**vendorMarkP2POrderAsPaidBuyer**](docs/P2PMarketplaceOrdersVendorsApi.md#vendorMarkP2POrderAsPaidBuyer) | **PUT** /api/partner/order/mark-paid/{id} | Mark an order as paid (buyer)
*P2PMarketplaceOrdersVendorsApi* | [**vendorMarkP2POrderAsPaidSeller**](docs/P2PMarketplaceOrdersVendorsApi.md#vendorMarkP2POrderAsPaidSeller) | **PUT** /api/partner/order/approve/{id} | Mark an order as paid (seller)
*P2PMarketplaceOrdersVendorsApi* | [**vendorPayP2POrder**](docs/P2PMarketplaceOrdersVendorsApi.md#vendorPayP2POrder) | **POST** /api/partner/order/pay/{id} | Pay for order
*P2PMarketplaceOrdersVendorsApi* | [**vendorPlaceP2POrder**](docs/P2PMarketplaceOrdersVendorsApi.md#vendorPlaceP2POrder) | **PUT** /api/partner/order/{id} | Confirm Order
*P2PMarketplaceOrdersVendorsApi* | [**vendorUploadP2POrderDocument**](docs/P2PMarketplaceOrdersVendorsApi.md#vendorUploadP2POrderDocument) | **POST** /api/partner/order/upload/{id} | Upload Order Documentation
*P2PVendorApplicationsApi* | [**cancelP2PVendorApplication**](docs/P2PVendorApplicationsApi.md#cancelP2PVendorApplication) | **DELETE** /api/partner/application/{id} | Cancel Application
*P2PVendorApplicationsApi* | [**createP2PVendorApplication**](docs/P2PVendorApplicationsApi.md#createP2PVendorApplication) | **POST** /api/partner/application | Apply to be a vendor
*P2PVendorApplicationsApi* | [**getP2PVendorApplication**](docs/P2PVendorApplicationsApi.md#getP2PVendorApplication) | **GET** /api/partner/application/{id} | Retrieve Application
*P2PVendorApplicationsApi* | [**listP2PVendorApplications**](docs/P2PVendorApplicationsApi.md#listP2PVendorApplications) | **GET** /api/partner/application | List Applications
*P2PVendorApplicationsApi* | [**uploadP2PVendorApplicationDocument**](docs/P2PVendorApplicationsApi.md#uploadP2PVendorApplicationDocument) | **POST** /api/partner/application/{applicationId}/upload | Upload an application document
*PaymentMethodsApi* | [**createPaymentMethod**](docs/PaymentMethodsApi.md#createPaymentMethod) | **POST** /api/payment-method | Create Payment Method
*PaymentMethodsApi* | [**deletePaymentMethod**](docs/PaymentMethodsApi.md#deletePaymentMethod) | **DELETE** /api/payment-method/{id} | Delete Payment Method
*PaymentMethodsApi* | [**getPaymentMethod**](docs/PaymentMethodsApi.md#getPaymentMethod) | **GET** /api/payment-method/{id} | Retrieve Payment Method
*PaymentMethodsApi* | [**getPaymentMethodCategory**](docs/PaymentMethodsApi.md#getPaymentMethodCategory) | **GET** /api/paymentMethodCategory/{id} | Read Payment Method Category
*PaymentMethodsApi* | [**getPaymentMethodType**](docs/PaymentMethodsApi.md#getPaymentMethodType) | **GET** /api/payment-method-type/{id} | Read Payment Method Type
*PaymentMethodsApi* | [**listNestedOptionsForPaymentMethodType**](docs/PaymentMethodsApi.md#listNestedOptionsForPaymentMethodType) | **GET** /api/payment-method-type/dynamic-options/{id}/{code} | List Dependant options for Payment Method Type on field
*PaymentMethodsApi* | [**listOptionsForPaymentMethodType**](docs/PaymentMethodsApi.md#listOptionsForPaymentMethodType) | **GET** /api/payment-method-type/options/{id} | List Options for Payment Method Type
*PaymentMethodsApi* | [**listPaymentMethodCategories**](docs/PaymentMethodsApi.md#listPaymentMethodCategories) | **GET** /api/paymentMethodCategory | List Payment Method Categories
*PaymentMethodsApi* | [**listPaymentMethodTypes**](docs/PaymentMethodsApi.md#listPaymentMethodTypes) | **GET** /api/payment-method-type | List Payment Method Types
*PaymentMethodsApi* | [**listPaymentMethods**](docs/PaymentMethodsApi.md#listPaymentMethods) | **GET** /api/payment-method | List Payment Methods
*PaymentMethodsApi* | [**listSearchOptionsForPaymentMethodType**](docs/PaymentMethodsApi.md#listSearchOptionsForPaymentMethodType) | **GET** /api/payment-method-type/search-options/{id} | List Search options for Payment Method Type
*PaymentMethodsApi* | [**updatePaymentMethod**](docs/PaymentMethodsApi.md#updatePaymentMethod) | **PUT** /api/payment-method/{id} | Update Payment Method
*PaymentTypesAndCategoriesApi* | [**listOptionsForPaymentMethodType**](docs/PaymentTypesAndCategoriesApi.md#listOptionsForPaymentMethodType) | **GET** /api/public/payment/type/options/{id} | List option for Payment Method Type
*PaymentTypesAndCategoriesApi* | [**listPaymentMethodCategories**](docs/PaymentTypesAndCategoriesApi.md#listPaymentMethodCategories) | **GET** /api/public/payment/categories | List Payment Method Categories
*PaymentTypesAndCategoriesApi* | [**listPaymentMethodTypes**](docs/PaymentTypesAndCategoriesApi.md#listPaymentMethodTypes) | **GET** /api/public/payment/types | List Payment Method Types
*PaymentTypesAndCategoriesApi* | [**listPaymentMethodTypesByCategory**](docs/PaymentTypesAndCategoriesApi.md#listPaymentMethodTypesByCategory) | **GET** /api/public/payment/types/{id} | List Payment Method Types for Category
*PricesApi* | [**listCurrencySnapshots**](docs/PricesApi.md#listCurrencySnapshots) | **GET** /api/currency/snapshot | List Latest Prices
*SentimentApi* | [**listExchangeRatesLast**](docs/SentimentApi.md#listExchangeRatesLast) | **GET** /api/exchange-rate/last | Read Last Exchange Rates
*SentimentApi* | [**listExchangeRatesRecent**](docs/SentimentApi.md#listExchangeRatesRecent) | **GET** /api/exchange-rate/recent | Read Exchange Rates
*SentimentApi* | [**listSentimentAggregated**](docs/SentimentApi.md#listSentimentAggregated) | **GET** /api/sentiment/aggregated | Read Aggregated Sentiment
*SentimentApi* | [**listSentimentLast**](docs/SentimentApi.md#listSentimentLast) | **GET** /api/sentiment/last | Read Last Sentiment
*TransactionsApi* | [**getResource**](docs/TransactionsApi.md#getResource) | **GET** /api/transaction/type/{id} | Read Transaction Type
*TransactionsApi* | [**getTransaction**](docs/TransactionsApi.md#getTransaction) | **GET** /api/transaction/read/{id} | Get Transaction
*TransactionsApi* | [**listTransactionTypes**](docs/TransactionsApi.md#listTransactionTypes) | **GET** /api/transaction/type | List Transaction Types
*TransactionsApi* | [**listTransactions**](docs/TransactionsApi.md#listTransactions) | **GET** /api/transaction | List Transactions
*TransactionsApi* | [**listTransactionsForWallet**](docs/TransactionsApi.md#listTransactionsForWallet) | **GET** /api/transaction/{id} | List Transactions for Wallet
*UsersApi* | [**beginForgotPassword**](docs/UsersApi.md#beginForgotPassword) | **POST** /api/user/forgot/request | Forgot Password Request
*UsersApi* | [**beginTwoFactorSetup**](docs/UsersApi.md#beginTwoFactorSetup) | **POST** /api/user/twofactor/request | Begin Two Factor Setup
*UsersApi* | [**confirmForgotPassword**](docs/UsersApi.md#confirmForgotPassword) | **POST** /api/user/forgot/confirm | Forgot Password Confirm Reset
*UsersApi* | [**confirmNewUser**](docs/UsersApi.md#confirmNewUser) | **POST** /api/user/register/confirm | Confirm new user registration
*UsersApi* | [**confirmTwoFactorSetup**](docs/UsersApi.md#confirmTwoFactorSetup) | **POST** /api/user/twofactor/confirm | Confirm Two Factor Code
*UsersApi* | [**createApiKey**](docs/UsersApi.md#createApiKey) | **POST** /api/token | Create API Key
*UsersApi* | [**deleteApiKey**](docs/UsersApi.md#deleteApiKey) | **DELETE** /api/token | Delete/Revoke API Key
*UsersApi* | [**getProfile**](docs/UsersApi.md#getProfile) | **GET** /api/user/profile | Get current user profile
*UsersApi* | [**getTwoFactorStatus**](docs/UsersApi.md#getTwoFactorStatus) | **GET** /api/user/twofactor/state | Check Two Factor Status
*UsersApi* | [**getUserWebsocketChannel**](docs/UsersApi.md#getUserWebsocketChannel) | **GET** /api/user/channel | Get WebSocket Channel
*UsersApi* | [**listApiKeys**](docs/UsersApi.md#listApiKeys) | **GET** /api/token | List API Keys
*UsersApi* | [**registerNewUser**](docs/UsersApi.md#registerNewUser) | **POST** /api/user/register | Register a new user
*UsersApi* | [**reissueApiToken**](docs/UsersApi.md#reissueApiToken) | **POST** /api/login/reissue | Reissue Temporary Token
*UsersApi* | [**resendVerificationEmail**](docs/UsersApi.md#resendVerificationEmail) | **POST** /api/user/register/resend | Resend verification email
*UsersApi* | [**updatePassword**](docs/UsersApi.md#updatePassword) | **PUT** /api/user/password | Update user password
*UsersApi* | [**updateProfile**](docs/UsersApi.md#updateProfile) | **PUT** /api/user | Update User Profile
*UsersApi* | [**updateProfileImage**](docs/UsersApi.md#updateProfileImage) | **PUT** /api/user/image | Update profile image
*UsersApi* | [**updateProfile_0**](docs/UsersApi.md#updateProfile_0) | **PUT** /api/user/profile | Update current user profile
*UsersApi* | [**uploadIdVerificationDocument**](docs/UsersApi.md#uploadIdVerificationDocument) | **POST** /api/user/document | Upload ID verification document
*WalletsApi* | [**createTransferRequest**](docs/WalletsApi.md#createTransferRequest) | **POST** /api/wallet/transfer | Create Transfer Request
*WalletsApi* | [**createWallet**](docs/WalletsApi.md#createWallet) | **POST** /api/wallet | Create Wallet
*WalletsApi* | [**getConvertibleCurrencies**](docs/WalletsApi.md#getConvertibleCurrencies) | **GET** /api/wallet/{code}/convert | Get convertible currencies
*WalletsApi* | [**getTransferRequestOutputEstimate**](docs/WalletsApi.md#getTransferRequestOutputEstimate) | **PUT** /api/wallet/transfer | Estimate Transfer Request Output
*WalletsApi* | [**getTransferableCurrencies**](docs/WalletsApi.md#getTransferableCurrencies) | **GET** /api/wallet/{id}/transfer | Get transferable currencies
*WalletsApi* | [**getWallet**](docs/WalletsApi.md#getWallet) | **GET** /api/wallet/{id} | Read Wallet
*WalletsApi* | [**getWalletDepositAddress**](docs/WalletsApi.md#getWalletDepositAddress) | **POST** /api/wallet/deposit/{id} | Get Deposit Address
*WalletsApi* | [**getWalletFundingOptions**](docs/WalletsApi.md#getWalletFundingOptions) | **GET** /api/wallet/funding/{id} | Get Funding Options
*WalletsApi* | [**getWithdrawalRequest**](docs/WalletsApi.md#getWithdrawalRequest) | **GET** /api/wallet/withdrawal/request/{id} | Read Withdrawal Request
*WalletsApi* | [**listTransferRequests**](docs/WalletsApi.md#listTransferRequests) | **GET** /api/wallet/transfer | List Transfer Requests
*WalletsApi* | [**listWallets**](docs/WalletsApi.md#listWallets) | **GET** /api/wallet | List Wallets
*WalletsApi* | [**listWithdrawalRequests**](docs/WalletsApi.md#listWithdrawalRequests) | **GET** /api/wallet/withdrawal/request | List Withdrawal Requests
*WalletsApi* | [**withdrawFromWallet**](docs/WalletsApi.md#withdrawFromWallet) | **POST** /api/wallet/withdraw/{id} | Withdraw from Wallet


## Documentation for Models

 - [AccountDocument](docs/AccountDocument.md)
 - [AccountPreference](docs/AccountPreference.md)
 - [AccountProgress](docs/AccountProgress.md)
 - [AffiliateTransaction](docs/AffiliateTransaction.md)
 - [AuthenticationToken](docs/AuthenticationToken.md)
 - [AuthenticationTokenRequest](docs/AuthenticationTokenRequest.md)
 - [Authorization](docs/Authorization.md)
 - [Bank](docs/Bank.md)
 - [ChatMember](docs/ChatMember.md)
 - [ChatMessage](docs/ChatMessage.md)
 - [Country](docs/Country.md)
 - [CountryDocument](docs/CountryDocument.md)
 - [Currency](docs/Currency.md)
 - [CurrencySnapshot](docs/CurrencySnapshot.md)
 - [CurrencyWithdrawalParameter](docs/CurrencyWithdrawalParameter.md)
 - [EncodedFile](docs/EncodedFile.md)
 - [Equation](docs/Equation.md)
 - [Error](docs/Error.md)
 - [Errors](docs/Errors.md)
 - [Exchange](docs/Exchange.md)
 - [ExchangeOrder](docs/ExchangeOrder.md)
 - [ExchangeOrderRequest](docs/ExchangeOrderRequest.md)
 - [ExchangeRate](docs/ExchangeRate.md)
 - [GenericOption](docs/GenericOption.md)
 - [HistoricalData](docs/HistoricalData.md)
 - [HistoricalDataRequest](docs/HistoricalDataRequest.md)
 - [Language](docs/Language.md)
 - [Market](docs/Market.md)
 - [MarketSummary](docs/MarketSummary.md)
 - [OHLCV](docs/OHLCV.md)
 - [Offer](docs/Offer.md)
 - [OfferPaymentMethod](docs/OfferPaymentMethod.md)
 - [OfferToBuy](docs/OfferToBuy.md)
 - [OfferToSell](docs/OfferToSell.md)
 - [Order](docs/Order.md)
 - [OrderBook](docs/OrderBook.md)
 - [OrderDispute](docs/OrderDispute.md)
 - [OrderDisputeReason](docs/OrderDisputeReason.md)
 - [OrderDocument](docs/OrderDocument.md)
 - [OrderRequest](docs/OrderRequest.md)
 - [PartnerApplication](docs/PartnerApplication.md)
 - [PartnerApplicationDocument](docs/PartnerApplicationDocument.md)
 - [PaymentMethod](docs/PaymentMethod.md)
 - [PaymentMethodCategory](docs/PaymentMethodCategory.md)
 - [PaymentMethodType](docs/PaymentMethodType.md)
 - [PaymentOption](docs/PaymentOption.md)
 - [PaymentResult](docs/PaymentResult.md)
 - [PriceLevel](docs/PriceLevel.md)
 - [PublicAccount](docs/PublicAccount.md)
 - [PublicOffer](docs/PublicOffer.md)
 - [Rating](docs/Rating.md)
 - [RatingSummary](docs/RatingSummary.md)
 - [Reason](docs/Reason.md)
 - [Reasons](docs/Reasons.md)
 - [Region](docs/Region.md)
 - [Sentiment](docs/Sentiment.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionType](docs/TransactionType.md)
 - [TransferRequest](docs/TransferRequest.md)
 - [User](docs/User.md)
 - [UserForgotPasswordRequest](docs/UserForgotPasswordRequest.md)
 - [UserPasswordChangeRequest](docs/UserPasswordChangeRequest.md)
 - [UserProfile](docs/UserProfile.md)
 - [UserRegistrationRequest](docs/UserRegistrationRequest.md)
 - [Wallet](docs/Wallet.md)
 - [WalletFundingOption](docs/WalletFundingOption.md)
 - [Withdrawal](docs/Withdrawal.md)
 - [WithdrawalRequest](docs/WithdrawalRequest.md)
 - [WrappedPrimitive](docs/WrappedPrimitive.md)
 - [WrappedString](docs/WrappedString.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@coindirect.com

