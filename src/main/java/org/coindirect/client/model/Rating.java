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
 * Rating
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-10T11:44:48.559+02:00")
public class Rating {
  @SerializedName("score")
  private Integer score = null;

  @SerializedName("publicFeedback")
  private String publicFeedback = null;

  @SerializedName("privateFeedback")
  private String privateFeedback = null;

  public Rating score(Integer score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(value = "")
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public Rating publicFeedback(String publicFeedback) {
    this.publicFeedback = publicFeedback;
    return this;
  }

   /**
   * Get publicFeedback
   * @return publicFeedback
  **/
  @ApiModelProperty(value = "")
  public String getPublicFeedback() {
    return publicFeedback;
  }

  public void setPublicFeedback(String publicFeedback) {
    this.publicFeedback = publicFeedback;
  }

  public Rating privateFeedback(String privateFeedback) {
    this.privateFeedback = privateFeedback;
    return this;
  }

   /**
   * Get privateFeedback
   * @return privateFeedback
  **/
  @ApiModelProperty(value = "")
  public String getPrivateFeedback() {
    return privateFeedback;
  }

  public void setPrivateFeedback(String privateFeedback) {
    this.privateFeedback = privateFeedback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rating rating = (Rating) o;
    return Objects.equals(this.score, rating.score) &&
        Objects.equals(this.publicFeedback, rating.publicFeedback) &&
        Objects.equals(this.privateFeedback, rating.privateFeedback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, publicFeedback, privateFeedback);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rating {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    publicFeedback: ").append(toIndentedString(publicFeedback)).append("\n");
    sb.append("    privateFeedback: ").append(toIndentedString(privateFeedback)).append("\n");
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
