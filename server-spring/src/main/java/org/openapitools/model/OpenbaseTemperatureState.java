package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseActionDescription;
import org.openapitools.model.OpenbaseTemperatureStateDataUnit;
import org.openapitools.model.OpenbaseTimestamp;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseTemperatureState
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-29T22:47:43.327074+02:00[Europe/Berlin]")

public class OpenbaseTemperatureState   {
  @JsonProperty("responsible_action")
  private OpenbaseActionDescription responsibleAction = null;

  @JsonProperty("temperature")
  private Double temperature;

  @JsonProperty("temperature_data_unit")
  private OpenbaseTemperatureStateDataUnit temperatureDataUnit;

  @JsonProperty("timestamp")
  private OpenbaseTimestamp timestamp = null;

  public OpenbaseTemperatureState responsibleAction(OpenbaseActionDescription responsibleAction) {
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

  public OpenbaseTemperatureState temperature(Double temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * Get temperature
   * @return temperature
  */
  @ApiModelProperty(value = "")


  public Double getTemperature() {
    return temperature;
  }

  public void setTemperature(Double temperature) {
    this.temperature = temperature;
  }

  public OpenbaseTemperatureState temperatureDataUnit(OpenbaseTemperatureStateDataUnit temperatureDataUnit) {
    this.temperatureDataUnit = temperatureDataUnit;
    return this;
  }

  /**
   * Get temperatureDataUnit
   * @return temperatureDataUnit
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTemperatureStateDataUnit getTemperatureDataUnit() {
    return temperatureDataUnit;
  }

  public void setTemperatureDataUnit(OpenbaseTemperatureStateDataUnit temperatureDataUnit) {
    this.temperatureDataUnit = temperatureDataUnit;
  }

  public OpenbaseTemperatureState timestamp(OpenbaseTimestamp timestamp) {
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
    OpenbaseTemperatureState openbaseTemperatureState = (OpenbaseTemperatureState) o;
    return Objects.equals(this.responsibleAction, openbaseTemperatureState.responsibleAction) &&
        Objects.equals(this.temperature, openbaseTemperatureState.temperature) &&
        Objects.equals(this.temperatureDataUnit, openbaseTemperatureState.temperatureDataUnit) &&
        Objects.equals(this.timestamp, openbaseTemperatureState.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responsibleAction, temperature, temperatureDataUnit, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseTemperatureState {\n");
    
    sb.append("    responsibleAction: ").append(toIndentedString(responsibleAction)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    temperatureDataUnit: ").append(toIndentedString(temperatureDataUnit)).append("\n");
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

