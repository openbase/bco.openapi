package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseTicketAuthenticatorWrapper;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseAuthenticatedValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-29T22:47:43.327074+02:00[Europe/Berlin]")

public class OpenbaseAuthenticatedValue   {
  @JsonProperty("authentication_token")
  private String authenticationToken;

  @JsonProperty("authorization_token")
  private String authorizationToken;

  @JsonProperty("ticket_authenticator_wrapper")
  private OpenbaseTicketAuthenticatorWrapper ticketAuthenticatorWrapper = null;

  @JsonProperty("transaction_id")
  private Long transactionId;

  @JsonProperty("value")
  private String value;

  public OpenbaseAuthenticatedValue authenticationToken(String authenticationToken) {
    this.authenticationToken = authenticationToken;
    return this;
  }

  /**
   * Get authenticationToken
   * @return authenticationToken
  */
  @ApiModelProperty(value = "")


  public String getAuthenticationToken() {
    return authenticationToken;
  }

  public void setAuthenticationToken(String authenticationToken) {
    this.authenticationToken = authenticationToken;
  }

  public OpenbaseAuthenticatedValue authorizationToken(String authorizationToken) {
    this.authorizationToken = authorizationToken;
    return this;
  }

  /**
   * Get authorizationToken
   * @return authorizationToken
  */
  @ApiModelProperty(value = "")


  public String getAuthorizationToken() {
    return authorizationToken;
  }

  public void setAuthorizationToken(String authorizationToken) {
    this.authorizationToken = authorizationToken;
  }

  public OpenbaseAuthenticatedValue ticketAuthenticatorWrapper(OpenbaseTicketAuthenticatorWrapper ticketAuthenticatorWrapper) {
    this.ticketAuthenticatorWrapper = ticketAuthenticatorWrapper;
    return this;
  }

  /**
   * Get ticketAuthenticatorWrapper
   * @return ticketAuthenticatorWrapper
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTicketAuthenticatorWrapper getTicketAuthenticatorWrapper() {
    return ticketAuthenticatorWrapper;
  }

  public void setTicketAuthenticatorWrapper(OpenbaseTicketAuthenticatorWrapper ticketAuthenticatorWrapper) {
    this.ticketAuthenticatorWrapper = ticketAuthenticatorWrapper;
  }

  public OpenbaseAuthenticatedValue transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
  */
  @ApiModelProperty(value = "")


  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  public OpenbaseAuthenticatedValue value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @ApiModelProperty(value = "")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseAuthenticatedValue openbaseAuthenticatedValue = (OpenbaseAuthenticatedValue) o;
    return Objects.equals(this.authenticationToken, openbaseAuthenticatedValue.authenticationToken) &&
        Objects.equals(this.authorizationToken, openbaseAuthenticatedValue.authorizationToken) &&
        Objects.equals(this.ticketAuthenticatorWrapper, openbaseAuthenticatedValue.ticketAuthenticatorWrapper) &&
        Objects.equals(this.transactionId, openbaseAuthenticatedValue.transactionId) &&
        Objects.equals(this.value, openbaseAuthenticatedValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationToken, authorizationToken, ticketAuthenticatorWrapper, transactionId, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseAuthenticatedValue {\n");
    
    sb.append("    authenticationToken: ").append(toIndentedString(authenticationToken)).append("\n");
    sb.append("    authorizationToken: ").append(toIndentedString(authorizationToken)).append("\n");
    sb.append("    ticketAuthenticatorWrapper: ").append(toIndentedString(ticketAuthenticatorWrapper)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

