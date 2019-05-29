package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseTimestamp;
import org.openapitools.model.OpenbaseUserClientPair;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseAuthenticator
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-29T22:47:43.327074+02:00[Europe/Berlin]")

public class OpenbaseAuthenticator   {
  @JsonProperty("timestamp")
  private OpenbaseTimestamp timestamp = null;

  @JsonProperty("user_client_pair")
  private OpenbaseUserClientPair userClientPair = null;

  public OpenbaseAuthenticator timestamp(OpenbaseTimestamp timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTimestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OpenbaseTimestamp timestamp) {
    this.timestamp = timestamp;
  }

  public OpenbaseAuthenticator userClientPair(OpenbaseUserClientPair userClientPair) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseAuthenticator openbaseAuthenticator = (OpenbaseAuthenticator) o;
    return Objects.equals(this.timestamp, openbaseAuthenticator.timestamp) &&
        Objects.equals(this.userClientPair, openbaseAuthenticator.userClientPair);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, userClientPair);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseAuthenticator {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    userClientPair: ").append(toIndentedString(userClientPair)).append("\n");
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

