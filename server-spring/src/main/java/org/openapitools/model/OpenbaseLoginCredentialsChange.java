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
 * OpenbaseLoginCredentialsChange
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-29T22:47:43.327074+02:00[Europe/Berlin]")

public class OpenbaseLoginCredentialsChange   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("new_credentials")
  private String newCredentials;

  @JsonProperty("old_credentials")
  private String oldCredentials;

  @JsonProperty("symmetric")
  private Boolean symmetric;

  public OpenbaseLoginCredentialsChange id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OpenbaseLoginCredentialsChange newCredentials(String newCredentials) {
    this.newCredentials = newCredentials;
    return this;
  }

  /**
   * Get newCredentials
   * @return newCredentials
  */
  @ApiModelProperty(value = "")


  public String getNewCredentials() {
    return newCredentials;
  }

  public void setNewCredentials(String newCredentials) {
    this.newCredentials = newCredentials;
  }

  public OpenbaseLoginCredentialsChange oldCredentials(String oldCredentials) {
    this.oldCredentials = oldCredentials;
    return this;
  }

  /**
   * Get oldCredentials
   * @return oldCredentials
  */
  @ApiModelProperty(value = "")


  public String getOldCredentials() {
    return oldCredentials;
  }

  public void setOldCredentials(String oldCredentials) {
    this.oldCredentials = oldCredentials;
  }

  public OpenbaseLoginCredentialsChange symmetric(Boolean symmetric) {
    this.symmetric = symmetric;
    return this;
  }

  /**
   * Get symmetric
   * @return symmetric
  */
  @ApiModelProperty(value = "")


  public Boolean getSymmetric() {
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
    OpenbaseLoginCredentialsChange openbaseLoginCredentialsChange = (OpenbaseLoginCredentialsChange) o;
    return Objects.equals(this.id, openbaseLoginCredentialsChange.id) &&
        Objects.equals(this.newCredentials, openbaseLoginCredentialsChange.newCredentials) &&
        Objects.equals(this.oldCredentials, openbaseLoginCredentialsChange.oldCredentials) &&
        Objects.equals(this.symmetric, openbaseLoginCredentialsChange.symmetric);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, newCredentials, oldCredentials, symmetric);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseLoginCredentialsChange {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    newCredentials: ").append(toIndentedString(newCredentials)).append("\n");
    sb.append("    oldCredentials: ").append(toIndentedString(oldCredentials)).append("\n");
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

