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


package org.coindirect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.coindirect.client.model.Currency;
import org.coindirect.client.model.OrderDocument;
import org.coindirect.client.model.PaymentMethod;
import org.coindirect.client.model.PaymentOption;
import org.coindirect.client.model.PublicAccount;
import org.coindirect.client.model.PublicOffer;
import org.threeten.bp.OffsetDateTime;

/**
 * Order
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-10T11:44:48.559+02:00")
public class Order {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("price")
  private BigDecimal price = null;

  @SerializedName("currencyForSale")
  private Currency currencyForSale = null;

  @SerializedName("baseCurrency")
  private Currency baseCurrency = null;

  @SerializedName("baseAmount")
  private BigDecimal baseAmount = null;

  @SerializedName("basePrice")
  private BigDecimal basePrice = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("value")
  private BigDecimal value = null;

  @SerializedName("achievedAmount")
  private BigDecimal achievedAmount = null;

  @SerializedName("achievedOutput")
  private BigDecimal achievedOutput = null;

  @SerializedName("expiresIn")
  private Long expiresIn = null;

  @SerializedName("dateCreated")
  private OffsetDateTime dateCreated = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("paymentMethod")
  private PaymentMethod paymentMethod = null;

  @SerializedName("uploadableDocuments")
  private List<String> uploadableDocuments = null;

  @SerializedName("documents")
  private List<OrderDocument> documents = null;

  @SerializedName("paymentOptions")
  private List<PaymentOption> paymentOptions = null;

  @SerializedName("currencyAccepted")
  private Currency currencyAccepted = null;

  @SerializedName("paid")
  private Boolean paid = false;

  @SerializedName("type")
  private String type = null;

  @SerializedName("rating")
  private Integer rating = null;

  @SerializedName("buyerAccount")
  private PublicAccount buyerAccount = null;

  @SerializedName("sellerAccount")
  private PublicAccount sellerAccount = null;

  @SerializedName("chat")
  private Boolean chat = false;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("paymentReference")
  private String paymentReference = null;

  @SerializedName("paymentTime")
  private OffsetDateTime paymentTime = null;

  @SerializedName("paymentType")
  private String paymentType = null;

  @SerializedName("paymentMetadata")
  private Map<String, Object> paymentMetadata = null;

  @SerializedName("dispute")
  private Boolean dispute = false;

  @SerializedName("exchangeRequired")
  private Boolean exchangeRequired = false;

  @SerializedName("offer")
  private PublicOffer offer = null;

  @SerializedName("convertToCurrency")
  private Currency convertToCurrency = null;

  public Order id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Order price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Order currencyForSale(Currency currencyForSale) {
    this.currencyForSale = currencyForSale;
    return this;
  }

   /**
   * Get currencyForSale
   * @return currencyForSale
  **/
  @ApiModelProperty(value = "")
  public Currency getCurrencyForSale() {
    return currencyForSale;
  }

  public void setCurrencyForSale(Currency currencyForSale) {
    this.currencyForSale = currencyForSale;
  }

  public Order baseCurrency(Currency baseCurrency) {
    this.baseCurrency = baseCurrency;
    return this;
  }

   /**
   * Get baseCurrency
   * @return baseCurrency
  **/
  @ApiModelProperty(value = "")
  public Currency getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(Currency baseCurrency) {
    this.baseCurrency = baseCurrency;
  }

  public Order baseAmount(BigDecimal baseAmount) {
    this.baseAmount = baseAmount;
    return this;
  }

   /**
   * Get baseAmount
   * @return baseAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getBaseAmount() {
    return baseAmount;
  }

  public void setBaseAmount(BigDecimal baseAmount) {
    this.baseAmount = baseAmount;
  }

  public Order basePrice(BigDecimal basePrice) {
    this.basePrice = basePrice;
    return this;
  }

   /**
   * Get basePrice
   * @return basePrice
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(BigDecimal basePrice) {
    this.basePrice = basePrice;
  }

  public Order amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Order value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public Order achievedAmount(BigDecimal achievedAmount) {
    this.achievedAmount = achievedAmount;
    return this;
  }

   /**
   * Get achievedAmount
   * @return achievedAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAchievedAmount() {
    return achievedAmount;
  }

  public void setAchievedAmount(BigDecimal achievedAmount) {
    this.achievedAmount = achievedAmount;
  }

  public Order achievedOutput(BigDecimal achievedOutput) {
    this.achievedOutput = achievedOutput;
    return this;
  }

   /**
   * Get achievedOutput
   * @return achievedOutput
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAchievedOutput() {
    return achievedOutput;
  }

  public void setAchievedOutput(BigDecimal achievedOutput) {
    this.achievedOutput = achievedOutput;
  }

  public Order expiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Get expiresIn
   * @return expiresIn
  **/
  @ApiModelProperty(value = "")
  public Long getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
  }

  public Order dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public Order status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Order paymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")
  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public Order uploadableDocuments(List<String> uploadableDocuments) {
    this.uploadableDocuments = uploadableDocuments;
    return this;
  }

  public Order addUploadableDocumentsItem(String uploadableDocumentsItem) {
    if (this.uploadableDocuments == null) {
      this.uploadableDocuments = new ArrayList<String>();
    }
    this.uploadableDocuments.add(uploadableDocumentsItem);
    return this;
  }

   /**
   * Get uploadableDocuments
   * @return uploadableDocuments
  **/
  @ApiModelProperty(value = "")
  public List<String> getUploadableDocuments() {
    return uploadableDocuments;
  }

  public void setUploadableDocuments(List<String> uploadableDocuments) {
    this.uploadableDocuments = uploadableDocuments;
  }

  public Order documents(List<OrderDocument> documents) {
    this.documents = documents;
    return this;
  }

  public Order addDocumentsItem(OrderDocument documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<OrderDocument>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Get documents
   * @return documents
  **/
  @ApiModelProperty(value = "")
  public List<OrderDocument> getDocuments() {
    return documents;
  }

  public void setDocuments(List<OrderDocument> documents) {
    this.documents = documents;
  }

  public Order paymentOptions(List<PaymentOption> paymentOptions) {
    this.paymentOptions = paymentOptions;
    return this;
  }

  public Order addPaymentOptionsItem(PaymentOption paymentOptionsItem) {
    if (this.paymentOptions == null) {
      this.paymentOptions = new ArrayList<PaymentOption>();
    }
    this.paymentOptions.add(paymentOptionsItem);
    return this;
  }

   /**
   * Get paymentOptions
   * @return paymentOptions
  **/
  @ApiModelProperty(value = "")
  public List<PaymentOption> getPaymentOptions() {
    return paymentOptions;
  }

  public void setPaymentOptions(List<PaymentOption> paymentOptions) {
    this.paymentOptions = paymentOptions;
  }

  public Order currencyAccepted(Currency currencyAccepted) {
    this.currencyAccepted = currencyAccepted;
    return this;
  }

   /**
   * Get currencyAccepted
   * @return currencyAccepted
  **/
  @ApiModelProperty(value = "")
  public Currency getCurrencyAccepted() {
    return currencyAccepted;
  }

  public void setCurrencyAccepted(Currency currencyAccepted) {
    this.currencyAccepted = currencyAccepted;
  }

  public Order paid(Boolean paid) {
    this.paid = paid;
    return this;
  }

   /**
   * Get paid
   * @return paid
  **/
  @ApiModelProperty(value = "")
  public Boolean isPaid() {
    return paid;
  }

  public void setPaid(Boolean paid) {
    this.paid = paid;
  }

  public Order type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Order rating(Integer rating) {
    this.rating = rating;
    return this;
  }

   /**
   * Get rating
   * @return rating
  **/
  @ApiModelProperty(value = "")
  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public Order buyerAccount(PublicAccount buyerAccount) {
    this.buyerAccount = buyerAccount;
    return this;
  }

   /**
   * Get buyerAccount
   * @return buyerAccount
  **/
  @ApiModelProperty(value = "")
  public PublicAccount getBuyerAccount() {
    return buyerAccount;
  }

  public void setBuyerAccount(PublicAccount buyerAccount) {
    this.buyerAccount = buyerAccount;
  }

  public Order sellerAccount(PublicAccount sellerAccount) {
    this.sellerAccount = sellerAccount;
    return this;
  }

   /**
   * Get sellerAccount
   * @return sellerAccount
  **/
  @ApiModelProperty(value = "")
  public PublicAccount getSellerAccount() {
    return sellerAccount;
  }

  public void setSellerAccount(PublicAccount sellerAccount) {
    this.sellerAccount = sellerAccount;
  }

  public Order chat(Boolean chat) {
    this.chat = chat;
    return this;
  }

   /**
   * Get chat
   * @return chat
  **/
  @ApiModelProperty(value = "")
  public Boolean isChat() {
    return chat;
  }

  public void setChat(Boolean chat) {
    this.chat = chat;
  }

  public Order notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Order paymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
    return this;
  }

   /**
   * Get paymentReference
   * @return paymentReference
  **/
  @ApiModelProperty(value = "")
  public String getPaymentReference() {
    return paymentReference;
  }

  public void setPaymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
  }

  public Order paymentTime(OffsetDateTime paymentTime) {
    this.paymentTime = paymentTime;
    return this;
  }

   /**
   * Get paymentTime
   * @return paymentTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPaymentTime() {
    return paymentTime;
  }

  public void setPaymentTime(OffsetDateTime paymentTime) {
    this.paymentTime = paymentTime;
  }

  public Order paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @ApiModelProperty(value = "")
  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public Order paymentMetadata(Map<String, Object> paymentMetadata) {
    this.paymentMetadata = paymentMetadata;
    return this;
  }

  public Order putPaymentMetadataItem(String key, Object paymentMetadataItem) {
    if (this.paymentMetadata == null) {
      this.paymentMetadata = new HashMap<String, Object>();
    }
    this.paymentMetadata.put(key, paymentMetadataItem);
    return this;
  }

   /**
   * Get paymentMetadata
   * @return paymentMetadata
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getPaymentMetadata() {
    return paymentMetadata;
  }

  public void setPaymentMetadata(Map<String, Object> paymentMetadata) {
    this.paymentMetadata = paymentMetadata;
  }

  public Order dispute(Boolean dispute) {
    this.dispute = dispute;
    return this;
  }

   /**
   * Get dispute
   * @return dispute
  **/
  @ApiModelProperty(value = "")
  public Boolean isDispute() {
    return dispute;
  }

  public void setDispute(Boolean dispute) {
    this.dispute = dispute;
  }

  public Order exchangeRequired(Boolean exchangeRequired) {
    this.exchangeRequired = exchangeRequired;
    return this;
  }

   /**
   * Get exchangeRequired
   * @return exchangeRequired
  **/
  @ApiModelProperty(value = "")
  public Boolean isExchangeRequired() {
    return exchangeRequired;
  }

  public void setExchangeRequired(Boolean exchangeRequired) {
    this.exchangeRequired = exchangeRequired;
  }

  public Order offer(PublicOffer offer) {
    this.offer = offer;
    return this;
  }

   /**
   * Get offer
   * @return offer
  **/
  @ApiModelProperty(value = "")
  public PublicOffer getOffer() {
    return offer;
  }

  public void setOffer(PublicOffer offer) {
    this.offer = offer;
  }

  public Order convertToCurrency(Currency convertToCurrency) {
    this.convertToCurrency = convertToCurrency;
    return this;
  }

   /**
   * Get convertToCurrency
   * @return convertToCurrency
  **/
  @ApiModelProperty(value = "")
  public Currency getConvertToCurrency() {
    return convertToCurrency;
  }

  public void setConvertToCurrency(Currency convertToCurrency) {
    this.convertToCurrency = convertToCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.price, order.price) &&
        Objects.equals(this.currencyForSale, order.currencyForSale) &&
        Objects.equals(this.baseCurrency, order.baseCurrency) &&
        Objects.equals(this.baseAmount, order.baseAmount) &&
        Objects.equals(this.basePrice, order.basePrice) &&
        Objects.equals(this.amount, order.amount) &&
        Objects.equals(this.value, order.value) &&
        Objects.equals(this.achievedAmount, order.achievedAmount) &&
        Objects.equals(this.achievedOutput, order.achievedOutput) &&
        Objects.equals(this.expiresIn, order.expiresIn) &&
        Objects.equals(this.dateCreated, order.dateCreated) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.paymentMethod, order.paymentMethod) &&
        Objects.equals(this.uploadableDocuments, order.uploadableDocuments) &&
        Objects.equals(this.documents, order.documents) &&
        Objects.equals(this.paymentOptions, order.paymentOptions) &&
        Objects.equals(this.currencyAccepted, order.currencyAccepted) &&
        Objects.equals(this.paid, order.paid) &&
        Objects.equals(this.type, order.type) &&
        Objects.equals(this.rating, order.rating) &&
        Objects.equals(this.buyerAccount, order.buyerAccount) &&
        Objects.equals(this.sellerAccount, order.sellerAccount) &&
        Objects.equals(this.chat, order.chat) &&
        Objects.equals(this.notes, order.notes) &&
        Objects.equals(this.paymentReference, order.paymentReference) &&
        Objects.equals(this.paymentTime, order.paymentTime) &&
        Objects.equals(this.paymentType, order.paymentType) &&
        Objects.equals(this.paymentMetadata, order.paymentMetadata) &&
        Objects.equals(this.dispute, order.dispute) &&
        Objects.equals(this.exchangeRequired, order.exchangeRequired) &&
        Objects.equals(this.offer, order.offer) &&
        Objects.equals(this.convertToCurrency, order.convertToCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, price, currencyForSale, baseCurrency, baseAmount, basePrice, amount, value, achievedAmount, achievedOutput, expiresIn, dateCreated, status, paymentMethod, uploadableDocuments, documents, paymentOptions, currencyAccepted, paid, type, rating, buyerAccount, sellerAccount, chat, notes, paymentReference, paymentTime, paymentType, paymentMetadata, dispute, exchangeRequired, offer, convertToCurrency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currencyForSale: ").append(toIndentedString(currencyForSale)).append("\n");
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
    sb.append("    baseAmount: ").append(toIndentedString(baseAmount)).append("\n");
    sb.append("    basePrice: ").append(toIndentedString(basePrice)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    achievedAmount: ").append(toIndentedString(achievedAmount)).append("\n");
    sb.append("    achievedOutput: ").append(toIndentedString(achievedOutput)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    uploadableDocuments: ").append(toIndentedString(uploadableDocuments)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    paymentOptions: ").append(toIndentedString(paymentOptions)).append("\n");
    sb.append("    currencyAccepted: ").append(toIndentedString(currencyAccepted)).append("\n");
    sb.append("    paid: ").append(toIndentedString(paid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    buyerAccount: ").append(toIndentedString(buyerAccount)).append("\n");
    sb.append("    sellerAccount: ").append(toIndentedString(sellerAccount)).append("\n");
    sb.append("    chat: ").append(toIndentedString(chat)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    paymentReference: ").append(toIndentedString(paymentReference)).append("\n");
    sb.append("    paymentTime: ").append(toIndentedString(paymentTime)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentMetadata: ").append(toIndentedString(paymentMetadata)).append("\n");
    sb.append("    dispute: ").append(toIndentedString(dispute)).append("\n");
    sb.append("    exchangeRequired: ").append(toIndentedString(exchangeRequired)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    convertToCurrency: ").append(toIndentedString(convertToCurrency)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

