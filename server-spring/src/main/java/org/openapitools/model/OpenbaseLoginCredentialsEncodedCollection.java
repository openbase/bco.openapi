package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseLoginCredentialsEncoded;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseLoginCredentialsEncodedCollection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseLoginCredentialsEncodedCollection   {
  @JsonProperty("login_credentials_encoded")
  @Valid
  private List<OpenbaseLoginCredentialsEncoded> loginCredentialsEncoded = null;

  public OpenbaseLoginCredentialsEncodedCollection loginCredentialsEncoded(List<OpenbaseLoginCredentialsEncoded> loginCredentialsEncoded) {
    this.loginCredentialsEncoded = loginCredentialsEncoded;
    return this;
  }

  public OpenbaseLoginCredentialsEncodedCollection addLoginCredentialsEncodedItem(OpenbaseLoginCredentialsEncoded loginCredentialsEncodedItem) {
    if (this.loginCredentialsEncoded == null) {
      this.loginCredentialsEncoded = new ArrayList<>();
    }
    this.loginCredentialsEncoded.add(loginCredentialsEncodedItem);
    return this;
  }

  /**
   * Get loginCredentialsEncoded
   * @return loginCredentialsEncoded
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseLoginCredentialsEncoded> getLoginCredentialsEncoded() {
    return loginCredentialsEncoded;
  }

  public void setLoginCredentialsEncoded(List<OpenbaseLoginCredentialsEncoded> loginCredentialsEncoded) {
    this.loginCredentialsEncoded = loginCredentialsEncoded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseLoginCredentialsEncodedCollection openbaseLoginCredentialsEncodedCollection = (OpenbaseLoginCredentialsEncodedCollection) o;
    return Objects.equals(this.loginCredentialsEncoded, openbaseLoginCredentialsEncodedCollection.loginCredentialsEncoded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginCredentialsEncoded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseLoginCredentialsEncodedCollection {\n");
    
    sb.append("    loginCredentialsEncoded: ").append(toIndentedString(loginCredentialsEncoded)).append("\n");
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

