package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseLoginCredentialsEncoded;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseLoginCredentialsEncodedCollection
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
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
      this.loginCredentialsEncoded = new ArrayList<OpenbaseLoginCredentialsEncoded>();
    }
    this.loginCredentialsEncoded.add(loginCredentialsEncodedItem);
    return this;
  }

  /**
   * Get loginCredentialsEncoded
   * @return loginCredentialsEncoded
  **/
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
