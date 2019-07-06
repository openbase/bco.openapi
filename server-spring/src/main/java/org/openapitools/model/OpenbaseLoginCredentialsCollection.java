package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseLoginCredentials;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseLoginCredentialsCollection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseLoginCredentialsCollection   {
  @JsonProperty("login_credentials")
  @Valid
  private List<OpenbaseLoginCredentials> loginCredentials = null;

  public OpenbaseLoginCredentialsCollection loginCredentials(List<OpenbaseLoginCredentials> loginCredentials) {
    this.loginCredentials = loginCredentials;
    return this;
  }

  public OpenbaseLoginCredentialsCollection addLoginCredentialsItem(OpenbaseLoginCredentials loginCredentialsItem) {
    if (this.loginCredentials == null) {
      this.loginCredentials = new ArrayList<>();
    }
    this.loginCredentials.add(loginCredentialsItem);
    return this;
  }

  /**
   * Get loginCredentials
   * @return loginCredentials
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseLoginCredentials> getLoginCredentials() {
    return loginCredentials;
  }

  public void setLoginCredentials(List<OpenbaseLoginCredentials> loginCredentials) {
    this.loginCredentials = loginCredentials;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseLoginCredentialsCollection openbaseLoginCredentialsCollection = (OpenbaseLoginCredentialsCollection) o;
    return Objects.equals(this.loginCredentials, openbaseLoginCredentialsCollection.loginCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginCredentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseLoginCredentialsCollection {\n");
    
    sb.append("    loginCredentials: ").append(toIndentedString(loginCredentials)).append("\n");
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

