package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseTicketSessionKeyWrapper
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbaseTicketSessionKeyWrapper   {
  @JsonProperty("session_key")
  private String sessionKey;

  @JsonProperty("ticket")
  private String ticket;

  public OpenbaseTicketSessionKeyWrapper sessionKey(String sessionKey) {
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

  public OpenbaseTicketSessionKeyWrapper ticket(String ticket) {
    this.ticket = ticket;
    return this;
  }

  /**
   * Get ticket
   * @return ticket
  */
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
    OpenbaseTicketSessionKeyWrapper openbaseTicketSessionKeyWrapper = (OpenbaseTicketSessionKeyWrapper) o;
    return Objects.equals(this.sessionKey, openbaseTicketSessionKeyWrapper.sessionKey) &&
        Objects.equals(this.ticket, openbaseTicketSessionKeyWrapper.ticket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionKey, ticket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseTicketSessionKeyWrapper {\n");
    
    sb.append("    sessionKey: ").append(toIndentedString(sessionKey)).append("\n");
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

