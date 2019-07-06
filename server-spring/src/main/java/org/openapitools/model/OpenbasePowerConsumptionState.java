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
 * OpenbasePowerConsumptionState
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbasePowerConsumptionState   {
  @JsonProperty("consumption")
  private Double consumption;

  @JsonProperty("current")
  private Double current;

  @JsonProperty("responsible_action")
  private OpenbaseActionDescription responsibleAction = null;

  @JsonProperty("timestamp")
  private OpenbaseTimestamp timestamp = null;

  @JsonProperty("voltage")
  private Double voltage;

  public OpenbasePowerConsumptionState consumption(Double consumption) {
    this.consumption = consumption;
    return this;
  }

  /**
   * Get consumption
   * @return consumption
  */
  @ApiModelProperty(value = "")


  public Double getConsumption() {
    return consumption;
  }

  public void setConsumption(Double consumption) {
    this.consumption = consumption;
  }

  public OpenbasePowerConsumptionState current(Double current) {
    this.current = current;
    return this;
  }

  /**
   * Get current
   * @return current
  */
  @ApiModelProperty(value = "")


  public Double getCurrent() {
    return current;
  }

  public void setCurrent(Double current) {
    this.current = current;
  }

  public OpenbasePowerConsumptionState responsibleAction(OpenbaseActionDescription responsibleAction) {
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

  public OpenbasePowerConsumptionState timestamp(OpenbaseTimestamp timestamp) {
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

  public OpenbasePowerConsumptionState voltage(Double voltage) {
    this.voltage = voltage;
    return this;
  }

  /**
   * Get voltage
   * @return voltage
  */
  @ApiModelProperty(value = "")


  public Double getVoltage() {
    return voltage;
  }

  public void setVoltage(Double voltage) {
    this.voltage = voltage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbasePowerConsumptionState openbasePowerConsumptionState = (OpenbasePowerConsumptionState) o;
    return Objects.equals(this.consumption, openbasePowerConsumptionState.consumption) &&
        Objects.equals(this.current, openbasePowerConsumptionState.current) &&
        Objects.equals(this.responsibleAction, openbasePowerConsumptionState.responsibleAction) &&
        Objects.equals(this.timestamp, openbasePowerConsumptionState.timestamp) &&
        Objects.equals(this.voltage, openbasePowerConsumptionState.voltage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumption, current, responsibleAction, timestamp, voltage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbasePowerConsumptionState {\n");
    
    sb.append("    consumption: ").append(toIndentedString(consumption)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    responsibleAction: ").append(toIndentedString(responsibleAction)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    voltage: ").append(toIndentedString(voltage)).append("\n");
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

