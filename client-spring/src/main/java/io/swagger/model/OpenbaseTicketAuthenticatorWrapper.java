package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseTicketAuthenticatorWrapper
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseTicketAuthenticatorWrapper   {
  @JsonProperty("authenticator")
  private String authenticator = null;

  @JsonProperty("ticket")
  private String ticket = null;

  public OpenbaseTicketAuthenticatorWrapper authenticator(String authenticator) {
    this.authenticator = authenticator;
    return this;
  }

  /**
   * Get authenticator
   * @return authenticator
  **/
  @ApiModelProperty(value = "")

  public String getAuthenticator() {
    return authenticator;
  }

  public void setAuthenticator(String authenticator) {
    this.authenticator = authenticator;
  }

  public OpenbaseTicketAuthenticatorWrapper ticket(String ticket) {
    this.ticket = ticket;
    return this;
  }

  /**
   * Get ticket
   * @return ticket
  **/
  @ApiModelProperty(value = "")

  public String getTicket() {
    return ticket;
  }

  public void setTicket(String ticket) {
    this.ticket = ticket;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseTicketAuthenticatorWrapper openbaseTicketAuthenticatorWrapper = (OpenbaseTicketAuthenticatorWrapper) o;
    return Objects.equals(this.authenticator, openbaseTicketAuthenticatorWrapper.authenticator) &&
        Objects.equals(this.ticket, openbaseTicketAuthenticatorWrapper.ticket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticator, ticket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseTicketAuthenticatorWrapper {\n");
    
    sb.append("    authenticator: ").append(toIndentedString(authenticator)).append("\n");
    sb.append("    ticket: ").append(toIndentedString(ticket)).append("\n");
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
