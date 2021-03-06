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
import java.util.ArrayList;
import java.util.List;
import org.coindirect.client.model.PriceLevel;

/**
 * OrderBook
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-10T11:44:48.559+02:00")
public class OrderBook {
  @SerializedName("sequence")
  private Long sequence = null;

  @SerializedName("bids")
  private List<PriceLevel> bids = null;

  @SerializedName("asks")
  private List<PriceLevel> asks = null;

  public OrderBook sequence(Long sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Get sequence
   * @return sequence
  **/
  @ApiModelProperty(value = "")
  public Long getSequence() {
    return sequence;
  }

  public void setSequence(Long sequence) {
    this.sequence = sequence;
  }

  public OrderBook bids(List<PriceLevel> bids) {
    this.bids = bids;
    return this;
  }

  public OrderBook addBidsItem(PriceLevel bidsItem) {
    if (this.bids == null) {
      this.bids = new ArrayList<PriceLevel>();
    }
    this.bids.add(bidsItem);
    return this;
  }

   /**
   * Get bids
   * @return bids
  **/
  @ApiModelProperty(value = "")
  public List<PriceLevel> getBids() {
    return bids;
  }

  public void setBids(List<PriceLevel> bids) {
    this.bids = bids;
  }

  public OrderBook asks(List<PriceLevel> asks) {
    this.asks = asks;
    return this;
  }

  public OrderBook addAsksItem(PriceLevel asksItem) {
    if (this.asks == null) {
      this.asks = new ArrayList<PriceLevel>();
    }
    this.asks.add(asksItem);
    return this;
  }

   /**
   * Get asks
   * @return asks
  **/
  @ApiModelProperty(value = "")
  public List<PriceLevel> getAsks() {
    return asks;
  }

  public void setAsks(List<PriceLevel> asks) {
    this.asks = asks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBook orderBook = (OrderBook) o;
    return Objects.equals(this.sequence, orderBook.sequence) &&
        Objects.equals(this.bids, orderBook.bids) &&
        Objects.equals(this.asks, orderBook.asks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequence, bids, asks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBook {\n");
    
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    bids: ").append(toIndentedString(bids)).append("\n");
    sb.append("    asks: ").append(toIndentedString(asks)).append("\n");
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

