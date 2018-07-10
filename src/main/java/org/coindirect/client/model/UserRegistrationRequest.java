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
 * UserRegistrationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-10T11:44:48.559+02:00")
public class UserRegistrationRequest {
  @SerializedName("emailAddress")
  private String emailAddress = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("recaptcha")
  private String recaptcha = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("confirmationUrl")
  private String confirmationUrl = null;

  public UserRegistrationRequest emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @ApiModelProperty(value = "")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public UserRegistrationRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserRegistrationRequest recaptcha(String recaptcha) {
    this.recaptcha = recaptcha;
    return this;
  }

   /**
   * Get recaptcha
   * @return recaptcha
  **/
  @ApiModelProperty(value = "")
  public String getRecaptcha() {
    return recaptcha;
  }

  public void setRecaptcha(String recaptcha) {
    this.recaptcha = recaptcha;
  }

  public UserRegistrationRequest timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(value = "")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public UserRegistrationRequest language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(value = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public UserRegistrationRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public UserRegistrationRequest confirmationUrl(String confirmationUrl) {
    this.confirmationUrl = confirmationUrl;
    return this;
  }

   /**
   * Get confirmationUrl
   * @return confirmationUrl
  **/
  @ApiModelProperty(value = "")
  public String getConfirmationUrl() {
    return confirmationUrl;
  }

  public void setConfirmationUrl(String confirmationUrl) {
    this.confirmationUrl = confirmationUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRegistrationRequest userRegistrationRequest = (UserRegistrationRequest) o;
    return Objects.equals(this.emailAddress, userRegistrationRequest.emailAddress) &&
        Objects.equals(this.password, userRegistrationRequest.password) &&
        Objects.equals(this.recaptcha, userRegistrationRequest.recaptcha) &&
        Objects.equals(this.timezone, userRegistrationRequest.timezone) &&
        Objects.equals(this.language, userRegistrationRequest.language) &&
        Objects.equals(this.countryCode, userRegistrationRequest.countryCode) &&
        Objects.equals(this.confirmationUrl, userRegistrationRequest.confirmationUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, password, recaptcha, timezone, language, countryCode, confirmationUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRegistrationRequest {\n");
    
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    recaptcha: ").append(toIndentedString(recaptcha)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    confirmationUrl: ").append(toIndentedString(confirmationUrl)).append("\n");
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

