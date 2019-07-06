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
 * OpenbaseTemperatureControllerData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseTemperatureControllerData   {
  @JsonProperty("action")
  @Valid
  private List<OpenbaseActionDescription> action = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("id")
  private String id;

  @JsonProperty("target_temperature_state")
  private OpenbaseTemperatureState targetTemperatureState = null;

  @JsonProperty("target_temperature_state_last")
  private OpenbaseTemperatureState targetTemperatureStateLast = null;

  @JsonProperty("target_temperature_state_requested")
  private OpenbaseTemperatureState targetTemperatureStateRequested = null;

  @JsonProperty("temperature_alarm_state")
  private OpenbaseAlarmState temperatureAlarmState = null;

  @JsonProperty("temperature_alarm_state_last")
  private OpenbaseAlarmState temperatureAlarmStateLast = null;

  @JsonProperty("temperature_alarm_state_requested")
  private OpenbaseAlarmState temperatureAlarmStateRequested = null;

  @JsonProperty("temperature_state")
  private OpenbaseTemperatureState temperatureState = null;

  @JsonProperty("temperature_state_last")
  private OpenbaseTemperatureState temperatureStateLast = null;

  @JsonProperty("temperature_state_requested")
  private OpenbaseTemperatureState temperatureStateRequested = null;

  @JsonProperty("transaction_id")
  private Long transactionId;

  public OpenbaseTemperatureControllerData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbaseTemperatureControllerData addActionItem(OpenbaseActionDescription actionItem) {
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

  public OpenbaseTemperatureControllerData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseTemperatureControllerData addAliasItem(String aliasItem) {
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

  public OpenbaseTemperatureControllerData id(String id) {
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

  public OpenbaseTemperatureControllerData targetTemperatureState(OpenbaseTemperatureState targetTemperatureState) {
    this.targetTemperatureState = targetTemperatureState;
    return this;
  }

  /**
   * Get targetTemperatureState
   * @return targetTemperatureState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTemperatureState getTargetTemperatureState() {
    return targetTemperatureState;
  }

  public void setTargetTemperatureState(OpenbaseTemperatureState targetTemperatureState) {
    this.targetTemperatureState = targetTemperatureState;
  }

  public OpenbaseTemperatureControllerData targetTemperatureStateLast(OpenbaseTemperatureState targetTemperatureStateLast) {
    this.targetTemperatureStateLast = targetTemperatureStateLast;
    return this;
  }

  /**
   * Get targetTemperatureStateLast
   * @return targetTemperatureStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTemperatureState getTargetTemperatureStateLast() {
    return targetTemperatureStateLast;
  }

  public void setTargetTemperatureStateLast(OpenbaseTemperatureState targetTemperatureStateLast) {
    this.targetTemperatureStateLast = targetTemperatureStateLast;
  }

  public OpenbaseTemperatureControllerData targetTemperatureStateRequested(OpenbaseTemperatureState targetTemperatureStateRequested) {
    this.targetTemperatureStateRequested = targetTemperatureStateRequested;
    return this;
  }

  /**
   * Get targetTemperatureStateRequested
   * @return targetTemperatureStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTemperatureState getTargetTemperatureStateRequested() {
    return targetTemperatureStateRequested;
  }

  public void setTargetTemperatureStateRequested(OpenbaseTemperatureState targetTemperatureStateRequested) {
    this.targetTemperatureStateRequested = targetTemperatureStateRequested;
  }

  public OpenbaseTemperatureControllerData temperatureAlarmState(OpenbaseAlarmState temperatureAlarmState) {
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

  public OpenbaseTemperatureControllerData temperatureAlarmStateLast(OpenbaseAlarmState temperatureAlarmStateLast) {
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

  public OpenbaseTemperatureControllerData temperatureAlarmStateRequested(OpenbaseAlarmState temperatureAlarmStateRequested) {
    this.temperatureAlarmStateRequested = temperatureAlarmStateRequested;
    return this;
  }

  /**
   * Get temperatureAlarmStateRequested
   * @return temperatureAlarmStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseAlarmState getTemperatureAlarmStateRequested() {
    return temperatureAlarmStateRequested;
  }

  public void setTemperatureAlarmStateRequested(OpenbaseAlarmState temperatureAlarmStateRequested) {
    this.temperatureAlarmStateRequested = temperatureAlarmStateRequested;
  }

  public OpenbaseTemperatureControllerData temperatureState(OpenbaseTemperatureState temperatureState) {
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

  public OpenbaseTemperatureControllerData temperatureStateLast(OpenbaseTemperatureState temperatureStateLast) {
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

  public OpenbaseTemperatureControllerData temperatureStateRequested(OpenbaseTemperatureState temperatureStateRequested) {
    this.temperatureStateRequested = temperatureStateRequested;
    return this;
  }

  /**
   * Get temperatureStateRequested
   * @return temperatureStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTemperatureState getTemperatureStateRequested() {
    return temperatureStateRequested;
  }

  public void setTemperatureStateRequested(OpenbaseTemperatureState temperatureStateRequested) {
    this.temperatureStateRequested = temperatureStateRequested;
  }

  public OpenbaseTemperatureControllerData transactionId(Long transactionId) {
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
    OpenbaseTemperatureControllerData openbaseTemperatureControllerData = (OpenbaseTemperatureControllerData) o;
    return Objects.equals(this.action, openbaseTemperatureControllerData.action) &&
        Objects.equals(this.alias, openbaseTemperatureControllerData.alias) &&
        Objects.equals(this.id, openbaseTemperatureControllerData.id) &&
        Objects.equals(this.targetTemperatureState, openbaseTemperatureControllerData.targetTemperatureState) &&
        Objects.equals(this.targetTemperatureStateLast, openbaseTemperatureControllerData.targetTemperatureStateLast) &&
        Objects.equals(this.targetTemperatureStateRequested, openbaseTemperatureControllerData.targetTemperatureStateRequested) &&
        Objects.equals(this.temperatureAlarmState, openbaseTemperatureControllerData.temperatureAlarmState) &&
        Objects.equals(this.temperatureAlarmStateLast, openbaseTemperatureControllerData.temperatureAlarmStateLast) &&
        Objects.equals(this.temperatureAlarmStateRequested, openbaseTemperatureControllerData.temperatureAlarmStateRequested) &&
        Objects.equals(this.temperatureState, openbaseTemperatureControllerData.temperatureState) &&
        Objects.equals(this.temperatureStateLast, openbaseTemperatureControllerData.temperatureStateLast) &&
        Objects.equals(this.temperatureStateRequested, openbaseTemperatureControllerData.temperatureStateRequested) &&
        Objects.equals(this.transactionId, openbaseTemperatureControllerData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, alias, id, targetTemperatureState, targetTemperatureStateLast, targetTemperatureStateRequested, temperatureAlarmState, temperatureAlarmStateLast, temperatureAlarmStateRequested, temperatureState, temperatureStateLast, temperatureStateRequested, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseTemperatureControllerData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    targetTemperatureState: ").append(toIndentedString(targetTemperatureState)).append("\n");
    sb.append("    targetTemperatureStateLast: ").append(toIndentedString(targetTemperatureStateLast)).append("\n");
    sb.append("    targetTemperatureStateRequested: ").append(toIndentedString(targetTemperatureStateRequested)).append("\n");
    sb.append("    temperatureAlarmState: ").append(toIndentedString(temperatureAlarmState)).append("\n");
    sb.append("    temperatureAlarmStateLast: ").append(toIndentedString(temperatureAlarmStateLast)).append("\n");
    sb.append("    temperatureAlarmStateRequested: ").append(toIndentedString(temperatureAlarmStateRequested)).append("\n");
    sb.append("    temperatureState: ").append(toIndentedString(temperatureState)).append("\n");
    sb.append("    temperatureStateLast: ").append(toIndentedString(temperatureStateLast)).append("\n");
    sb.append("    temperatureStateRequested: ").append(toIndentedString(temperatureStateRequested)).append("\n");
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

