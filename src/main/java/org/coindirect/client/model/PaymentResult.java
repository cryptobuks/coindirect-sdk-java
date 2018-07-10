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

/**
 * PaymentResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-10T11:44:48.559+02:00")
public class PaymentResult {
  @SerializedName("status")
  private Integer status = null;

  @SerializedName("redirectLocation")
  private String redirectLocation = null;

  @SerializedName("context")
  private String context = null;

  public PaymentResult status(Integer status) {
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

  public PaymentResult redirectLocation(String redirectLocation) {
    this.redirectLocation = redirectLocation;
    return this;
  }

   /**
   * Get redirectLocation
   * @return redirectLocation
  **/
  @ApiModelProperty(value = "")
  public String getRedirectLocation() {
    return redirectLocation;
  }

  public void setRedirectLocation(String redirectLocation) {
    this.redirectLocation = redirectLocation;
  }

  public PaymentResult context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(value = "")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentResult paymentResult = (PaymentResult) o;
    return Objects.equals(this.status, paymentResult.status) &&
        Objects.equals(this.redirectLocation, paymentResult.redirectLocation) &&
        Objects.equals(this.context, paymentResult.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, redirectLocation, context);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentResult {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    redirectLocation: ").append(toIndentedString(redirectLocation)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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
