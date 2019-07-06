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
 * OpenbaseLoginCredentials
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseLoginCredentials   {
  @JsonProperty("admin")
  private Boolean admin = null;

  @JsonProperty("credentials")
  private String credentials = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("symmetric")
  private Boolean symmetric = null;

  public OpenbaseLoginCredentials admin(Boolean admin) {
    this.admin = admin;
    return this;
  }

  /**
   * Get admin
   * @return admin
  **/
  @ApiModelProperty(value = "")

  public Boolean isAdmin() {
    return admin;
  }

  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  public OpenbaseLoginCredentials credentials(String credentials) {
    this.credentials = credentials;
    return this;
  }

  /**
   * Get credentials
   * @return credentials
  **/
  @ApiModelProperty(value = "")

  public String getCredentials() {
    return credentials;
  }

  public void setCredentials(String credentials) {
    this.credentials = credentials;
  }

  public OpenbaseLoginCredentials id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OpenbaseLoginCredentials symmetric(Boolean symmetric) {
    this.symmetric = symmetric;
    return this;
  }

  /**
   * Get symmetric
   * @return symmetric
  **/
  @ApiModelProperty(value = "")

  public Boolean isSymmetric() {
    return symmetric;
  }

  public void setSymmetric(Boolean symmetric) {
    this.symmetric = symmetric;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseLoginCredentials openbaseLoginCredentials = (OpenbaseLoginCredentials) o;
    return Objects.equals(this.admin, openbaseLoginCredentials.admin) &&
        Objects.equals(this.credentials, openbaseLoginCredentials.credentials) &&
        Objects.equals(this.id, openbaseLoginCredentials.id) &&
        Objects.equals(this.symmetric, openbaseLoginCredentials.symmetric);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admin, credentials, id, symmetric);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseLoginCredentials {\n");
    
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    symmetric: ").append(toIndentedString(symmetric)).append("\n");
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
