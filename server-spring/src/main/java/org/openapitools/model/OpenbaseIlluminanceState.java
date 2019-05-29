package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseActionDescription;
import org.openapitools.model.OpenbaseIlluminanceStateDataUnit;
import org.openapitools.model.OpenbaseTimestamp;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseIlluminanceState
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-29T22:47:43.327074+02:00[Europe/Berlin]")

public class OpenbaseIlluminanceState   {
  @JsonProperty("illuminance")
  private Double illuminance;

  @JsonProperty("illuminance_data_unit")
  private OpenbaseIlluminanceStateDataUnit illuminanceDataUnit;

  @JsonProperty("responsible_action")
  private OpenbaseActionDescription responsibleAction = null;

  @JsonProperty("timestamp")
  private OpenbaseTimestamp timestamp = null;

  public OpenbaseIlluminanceState illuminance(Double illuminance) {
    this.illuminance = illuminance;
    return this;
  }

  /**
   * Get illuminance
   * @return illuminance
  */
  @ApiModelProperty(value = "")


  public Double getIlluminance() {
    return illuminance;
  }

  public void setIlluminance(Double illuminance) {
    this.illuminance = illuminance;
  }

  public OpenbaseIlluminanceState illuminanceDataUnit(OpenbaseIlluminanceStateDataUnit illuminanceDataUnit) {
    this.illuminanceDataUnit = illuminanceDataUnit;
    return this;
  }

  /**
   * Get illuminanceDataUnit
   * @return illuminanceDataUnit
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseIlluminanceStateDataUnit getIlluminanceDataUnit() {
    return illuminanceDataUnit;
  }

  public void setIlluminanceDataUnit(OpenbaseIlluminanceStateDataUnit illuminanceDataUnit) {
    this.illuminanceDataUnit = illuminanceDataUnit;
  }

  public OpenbaseIlluminanceState responsibleAction(OpenbaseActionDescription responsibleAction) {
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

  public OpenbaseIlluminanceState timestamp(OpenbaseTimestamp timestamp) {
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
    OpenbaseIlluminanceState openbaseIlluminanceState = (OpenbaseIlluminanceState) o;
    return Objects.equals(this.illuminance, openbaseIlluminanceState.illuminance) &&
        Objects.equals(this.illuminanceDataUnit, openbaseIlluminanceState.illuminanceDataUnit) &&
        Objects.equals(this.responsibleAction, openbaseIlluminanceState.responsibleAction) &&
        Objects.equals(this.timestamp, openbaseIlluminanceState.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(illuminance, illuminanceDataUnit, responsibleAction, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseIlluminanceState {\n");
    
    sb.append("    illuminance: ").append(toIndentedString(illuminance)).append("\n");
    sb.append("    illuminanceDataUnit: ").append(toIndentedString(illuminanceDataUnit)).append("\n");
    sb.append("    responsibleAction: ").append(toIndentedString(responsibleAction)).append("\n");
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

