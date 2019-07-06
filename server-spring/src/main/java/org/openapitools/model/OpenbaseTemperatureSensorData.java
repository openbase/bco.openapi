package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseActionDescription;
import org.openapitools.model.OpenbaseAlarmState;
import org.openapitools.model.OpenbaseTemperatureState;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseTemperatureSensorData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbaseTemperatureSensorData   {
  @JsonProperty("action")
  @Valid
  private List<OpenbaseActionDescription> action = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("id")
  private String id;

  @JsonProperty("temperature_alarm_state")
  private OpenbaseAlarmState temperatureAlarmState = null;

  @JsonProperty("temperature_alarm_state_last")
  private OpenbaseAlarmState temperatureAlarmStateLast = null;

  @JsonProperty("temperature_state")
  private OpenbaseTemperatureState temperatureState = null;

  @JsonProperty("temperature_state_last")
  private OpenbaseTemperatureState temperatureStateLast = null;

  @JsonProperty("transaction_id")
  private Long transactionId;

  public OpenbaseTemperatureSensorData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbaseTemperatureSensorData addActionItem(OpenbaseActionDescription actionItem) {
    if (this.action == null) {
      this.action = new ArrayList<>();
    }
    this.action.add(actionItem);
    return this;
  }

  /**
   * Get action
   * @return action
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseActionDescription> getAction() {
    return action;
  }

  public void setAction(List<OpenbaseActionDescription> action) {
    this.action = action;
  }

  public OpenbaseTemperatureSensorData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseTemperatureSensorData addAliasItem(String aliasItem) {
    if (this.alias == null) {
      this.alias = new ArrayList<>();
    }
    this.alias.add(aliasItem);
    return this;
  }

  /**
   * Get alias
   * @return alias
  */
  @ApiModelProperty(value = "")


  public List<String> getAlias() {
    return alias;
  }

  public void setAlias(List<String> alias) {
    this.alias = alias;
  }

  public OpenbaseTemperatureSensorData id(String id) {
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

  public OpenbaseTemperatureSensorData temperatureAlarmState(OpenbaseAlarmState temperatureAlarmState) {
    this.temperatureAlarmState = temperatureAlarmState;
    return this;
  }

  /**
   * Get temperatureAlarmState
   * @return temperatureAlarmState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseAlarmState getTemperatureAlarmState() {
    return temperatureAlarmState;
  }

  public void setTemperatureAlarmState(OpenbaseAlarmState temperatureAlarmState) {
    this.temperatureAlarmState = temperatureAlarmState;
  }

  public OpenbaseTemperatureSensorData temperatureAlarmStateLast(OpenbaseAlarmState temperatureAlarmStateLast) {
    this.temperatureAlarmStateLast = temperatureAlarmStateLast;
    return this;
  }

  /**
   * Get temperatureAlarmStateLast
   * @return temperatureAlarmStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseAlarmState getTemperatureAlarmStateLast() {
    return temperatureAlarmStateLast;
  }

  public void setTemperatureAlarmStateLast(OpenbaseAlarmState temperatureAlarmStateLast) {
    this.temperatureAlarmStateLast = temperatureAlarmStateLast;
  }

  public OpenbaseTemperatureSensorData temperatureState(OpenbaseTemperatureState temperatureState) {
    this.temperatureState = temperatureState;
    return this;
  }

  /**
   * Get temperatureState
   * @return temperatureState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTemperatureState getTemperatureState() {
    return temperatureState;
  }

  public void setTemperatureState(OpenbaseTemperatureState temperatureState) {
    this.temperatureState = temperatureState;
  }

  public OpenbaseTemperatureSensorData temperatureStateLast(OpenbaseTemperatureState temperatureStateLast) {
    this.temperatureStateLast = temperatureStateLast;
    return this;
  }

  /**
   * Get temperatureStateLast
   * @return temperatureStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTemperatureState getTemperatureStateLast() {
    return temperatureStateLast;
  }

  public void setTemperatureStateLast(OpenbaseTemperatureState temperatureStateLast) {
    this.temperatureStateLast = temperatureStateLast;
  }

  public OpenbaseTemperatureSensorData transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
  */
  @ApiModelProperty(value = "")


  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseTemperatureSensorData openbaseTemperatureSensorData = (OpenbaseTemperatureSensorData) o;
    return Objects.equals(this.action, openbaseTemperatureSensorData.action) &&
        Objects.equals(this.alias, openbaseTemperatureSensorData.alias) &&
        Objects.equals(this.id, openbaseTemperatureSensorData.id) &&
        Objects.equals(this.temperatureAlarmState, openbaseTemperatureSensorData.temperatureAlarmState) &&
        Objects.equals(this.temperatureAlarmStateLast, openbaseTemperatureSensorData.temperatureAlarmStateLast) &&
        Objects.equals(this.temperatureState, openbaseTemperatureSensorData.temperatureState) &&
        Objects.equals(this.temperatureStateLast, openbaseTemperatureSensorData.temperatureStateLast) &&
        Objects.equals(this.transactionId, openbaseTemperatureSensorData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, alias, id, temperatureAlarmState, temperatureAlarmStateLast, temperatureState, temperatureStateLast, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseTemperatureSensorData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    temperatureAlarmState: ").append(toIndentedString(temperatureAlarmState)).append("\n");
    sb.append("    temperatureAlarmStateLast: ").append(toIndentedString(temperatureAlarmStateLast)).append("\n");
    sb.append("    temperatureState: ").append(toIndentedString(temperatureState)).append("\n");
    sb.append("    temperatureStateLast: ").append(toIndentedString(temperatureStateLast)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

