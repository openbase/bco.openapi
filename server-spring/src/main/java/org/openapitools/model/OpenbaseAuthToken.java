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
 * OpenbaseAuthToken
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbaseAuthToken   {
  @JsonProperty("authentication_token")
  private String authenticationToken;

  @JsonProperty("authorization_token")
  private String authorizationToken;

  public OpenbaseAuthToken authenticationToken(String authenticationToken) {
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

  public OpenbaseAuthToken authorizationToken(String authorizationToken) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseAuthToken openbaseAuthToken = (OpenbaseAuthToken) o;
    return Objects.equals(this.authenticationToken, openbaseAuthToken.authenticationToken) &&
        Objects.equals(this.authorizationToken, openbaseAuthToken.authorizationToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationToken, authorizationToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseAuthToken {\n");
    
    sb.append("    authenticationToken: ").append(toIndentedString(authenticationToken)).append("\n");
    sb.append("    authorizationToken: ").append(toIndentedString(authorizationToken)).append("\n");
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

