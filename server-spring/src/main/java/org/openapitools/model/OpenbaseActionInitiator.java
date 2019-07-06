package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseActionInitiatorInitiatorType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseActionInitiator
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbaseActionInitiator   {
  @JsonProperty("authenticated_by")
  private String authenticatedBy;

  @JsonProperty("authorized_by")
  private String authorizedBy;

  @JsonProperty("initiator_id")
  private String initiatorId;

  @JsonProperty("initiator_type")
  private OpenbaseActionInitiatorInitiatorType initiatorType;

  public OpenbaseActionInitiator authenticatedBy(String authenticatedBy) {
    this.authenticatedBy = authenticatedBy;
    return this;
  }

  /**
   * Get authenticatedBy
   * @return authenticatedBy
  */
  @ApiModelProperty(value = "")


  public String getAuthenticatedBy() {
    return authenticatedBy;
  }

  public void setAuthenticatedBy(String authenticatedBy) {
    this.authenticatedBy = authenticatedBy;
  }

  public OpenbaseActionInitiator authorizedBy(String authorizedBy) {
    this.authorizedBy = authorizedBy;
    return this;
  }

  /**
   * Get authorizedBy
   * @return authorizedBy
  */
  @ApiModelProperty(value = "")


  public String getAuthorizedBy() {
    return authorizedBy;
  }

  public void setAuthorizedBy(String authorizedBy) {
    this.authorizedBy = authorizedBy;
  }

  public OpenbaseActionInitiator initiatorId(String initiatorId) {
    this.initiatorId = initiatorId;
    return this;
  }

  /**
   * Get initiatorId
   * @return initiatorId
  */
  @ApiModelProperty(value = "")


  public String getInitiatorId() {
    return initiatorId;
  }

  public void setInitiatorId(String initiatorId) {
    this.initiatorId = initiatorId;
  }

  public OpenbaseActionInitiator initiatorType(OpenbaseActionInitiatorInitiatorType initiatorType) {
    this.initiatorType = initiatorType;
    return this;
  }

  /**
   * Get initiatorType
   * @return initiatorType
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseActionInitiatorInitiatorType getInitiatorType() {
    return initiatorType;
  }

  public void setInitiatorType(OpenbaseActionInitiatorInitiatorType initiatorType) {
    this.initiatorType = initiatorType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseActionInitiator openbaseActionInitiator = (OpenbaseActionInitiator) o;
    return Objects.equals(this.authenticatedBy, openbaseActionInitiator.authenticatedBy) &&
        Objects.equals(this.authorizedBy, openbaseActionInitiator.authorizedBy) &&
        Objects.equals(this.initiatorId, openbaseActionInitiator.initiatorId) &&
        Objects.equals(this.initiatorType, openbaseActionInitiator.initiatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticatedBy, authorizedBy, initiatorId, initiatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseActionInitiator {\n");
    
    sb.append("    authenticatedBy: ").append(toIndentedString(authenticatedBy)).append("\n");
    sb.append("    authorizedBy: ").append(toIndentedString(authorizedBy)).append("\n");
    sb.append("    initiatorId: ").append(toIndentedString(initiatorId)).append("\n");
    sb.append("    initiatorType: ").append(toIndentedString(initiatorType)).append("\n");
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

