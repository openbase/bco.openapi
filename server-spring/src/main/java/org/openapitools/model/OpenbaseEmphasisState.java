package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseActionDescription;
import org.openapitools.model.OpenbaseTimestamp;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseEmphasisState
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseEmphasisState   {
  @JsonProperty("comfort")
  private Double comfort;

  @JsonProperty("economy")
  private Double economy;

  @JsonProperty("responsible_action")
  private OpenbaseActionDescription responsibleAction = null;

  @JsonProperty("security")
  private Double security;

  @JsonProperty("timestamp")
  private OpenbaseTimestamp timestamp = null;

  public OpenbaseEmphasisState comfort(Double comfort) {
    this.comfort = comfort;
    return this;
  }

  /**
   * Get comfort
   * @return comfort
  */
  @ApiModelProperty(value = "")


  public Double getComfort() {
    return comfort;
  }

  public void setComfort(Double comfort) {
    this.comfort = comfort;
  }

  public OpenbaseEmphasisState economy(Double economy) {
    this.economy = economy;
    return this;
  }

  /**
   * Get economy
   * @return economy
  */
  @ApiModelProperty(value = "")


  public Double getEconomy() {
    return economy;
  }

  public void setEconomy(Double economy) {
    this.economy = economy;
  }

  public OpenbaseEmphasisState responsibleAction(OpenbaseActionDescription responsibleAction) {
    this.responsibleAction = responsibleAction;
    return this;
  }

  /**
   * Get responsibleAction
   * @return responsibleAction
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseActionDescription getResponsibleAction() {
    return responsibleAction;
  }

  public void setResponsibleAction(OpenbaseActionDescription responsibleAction) {
    this.responsibleAction = responsibleAction;
  }

  public OpenbaseEmphasisState security(Double security) {
    this.security = security;
    return this;
  }

  /**
   * Get security
   * @return security
  */
  @ApiModelProperty(value = "")


  public Double getSecurity() {
    return security;
  }

  public void setSecurity(Double security) {
    this.security = security;
  }

  public OpenbaseEmphasisState timestamp(OpenbaseTimestamp timestamp) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseEmphasisState openbaseEmphasisState = (OpenbaseEmphasisState) o;
    return Objects.equals(this.comfort, openbaseEmphasisState.comfort) &&
        Objects.equals(this.economy, openbaseEmphasisState.economy) &&
        Objects.equals(this.responsibleAction, openbaseEmphasisState.responsibleAction) &&
        Objects.equals(this.security, openbaseEmphasisState.security) &&
        Objects.equals(this.timestamp, openbaseEmphasisState.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comfort, economy, responsibleAction, security, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseEmphasisState {\n");
    
    sb.append("    comfort: ").append(toIndentedString(comfort)).append("\n");
    sb.append("    economy: ").append(toIndentedString(economy)).append("\n");
    sb.append("    responsibleAction: ").append(toIndentedString(responsibleAction)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

