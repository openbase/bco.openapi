package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseInterval;
import org.openapitools.model.OpenbaseUserClientPair;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseTicket
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

public class OpenbaseTicket   {
  @JsonProperty("session_key")
  private String sessionKey;

  @JsonProperty("user_client_pair")
  private OpenbaseUserClientPair userClientPair = null;

  @JsonProperty("validity_period")
  private OpenbaseInterval validityPeriod = null;

  public OpenbaseTicket sessionKey(String sessionKey) {
    this.sessionKey = sessionKey;
    return this;
  }

  /**
   * Get sessionKey
   * @return sessionKey
  */
  @ApiModelProperty(value = "")


  public String getSessionKey() {
    return sessionKey;
  }

  public void setSessionKey(String sessionKey) {
    this.sessionKey = sessionKey;
  }

  public OpenbaseTicket userClientPair(OpenbaseUserClientPair userClientPair) {
    this.userClientPair = userClientPair;
    return this;
  }

  /**
   * Get userClientPair
   * @return userClientPair
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseUserClientPair getUserClientPair() {
    return userClientPair;
  }

  public void setUserClientPair(OpenbaseUserClientPair userClientPair) {
    this.userClientPair = userClientPair;
  }

  public OpenbaseTicket validityPeriod(OpenbaseInterval validityPeriod) {
    this.validityPeriod = validityPeriod;
    return this;
  }

  /**
   * Get validityPeriod
   * @return validityPeriod
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseInterval getValidityPeriod() {
    return validityPeriod;
  }

  public void setValidityPeriod(OpenbaseInterval validityPeriod) {
    this.validityPeriod = validityPeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseTicket openbaseTicket = (OpenbaseTicket) o;
    return Objects.equals(this.sessionKey, openbaseTicket.sessionKey) &&
        Objects.equals(this.userClientPair, openbaseTicket.userClientPair) &&
        Objects.equals(this.validityPeriod, openbaseTicket.validityPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionKey, userClientPair, validityPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseTicket {\n");
    
    sb.append("    sessionKey: ").append(toIndentedString(sessionKey)).append("\n");
    sb.append("    userClientPair: ").append(toIndentedString(userClientPair)).append("\n");
    sb.append("    validityPeriod: ").append(toIndentedString(validityPeriod)).append("\n");
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

