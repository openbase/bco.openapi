package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseActionDescription;
import org.openapitools.model.OpenbasePowerState;
import org.openapitools.model.OpenbaseStandbyState;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseMonitorData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-29T22:47:43.327074+02:00[Europe/Berlin]")

public class OpenbaseMonitorData   {
  @JsonProperty("action")
  @Valid
  private List<OpenbaseActionDescription> action = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("id")
  private String id;

  @JsonProperty("power_state")
  private OpenbasePowerState powerState = null;

  @JsonProperty("power_state_last")
  private OpenbasePowerState powerStateLast = null;

  @JsonProperty("power_state_requested")
  private OpenbasePowerState powerStateRequested = null;

  @JsonProperty("standby_state")
  private OpenbaseStandbyState standbyState = null;

  @JsonProperty("standby_state_last")
  private OpenbaseStandbyState standbyStateLast = null;

  @JsonProperty("standby_state_requested")
  private OpenbaseStandbyState standbyStateRequested = null;

  @JsonProperty("transaction_id")
  private Long transactionId;

  public OpenbaseMonitorData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbaseMonitorData addActionItem(OpenbaseActionDescription actionItem) {
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

  public OpenbaseMonitorData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseMonitorData addAliasItem(String aliasItem) {
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

  public OpenbaseMonitorData id(String id) {
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

  public OpenbaseMonitorData powerState(OpenbasePowerState powerState) {
    this.powerState = powerState;
    return this;
  }

  /**
   * Get powerState
   * @return powerState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePowerState getPowerState() {
    return powerState;
  }

  public void setPowerState(OpenbasePowerState powerState) {
    this.powerState = powerState;
  }

  public OpenbaseMonitorData powerStateLast(OpenbasePowerState powerStateLast) {
    this.powerStateLast = powerStateLast;
    return this;
  }

  /**
   * Get powerStateLast
   * @return powerStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePowerState getPowerStateLast() {
    return powerStateLast;
  }

  public void setPowerStateLast(OpenbasePowerState powerStateLast) {
    this.powerStateLast = powerStateLast;
  }

  public OpenbaseMonitorData powerStateRequested(OpenbasePowerState powerStateRequested) {
    this.powerStateRequested = powerStateRequested;
    return this;
  }

  /**
   * Get powerStateRequested
   * @return powerStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePowerState getPowerStateRequested() {
    return powerStateRequested;
  }

  public void setPowerStateRequested(OpenbasePowerState powerStateRequested) {
    this.powerStateRequested = powerStateRequested;
  }

  public OpenbaseMonitorData standbyState(OpenbaseStandbyState standbyState) {
    this.standbyState = standbyState;
    return this;
  }

  /**
   * Get standbyState
   * @return standbyState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseStandbyState getStandbyState() {
    return standbyState;
  }

  public void setStandbyState(OpenbaseStandbyState standbyState) {
    this.standbyState = standbyState;
  }

  public OpenbaseMonitorData standbyStateLast(OpenbaseStandbyState standbyStateLast) {
    this.standbyStateLast = standbyStateLast;
    return this;
  }

  /**
   * Get standbyStateLast
   * @return standbyStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseStandbyState getStandbyStateLast() {
    return standbyStateLast;
  }

  public void setStandbyStateLast(OpenbaseStandbyState standbyStateLast) {
    this.standbyStateLast = standbyStateLast;
  }

  public OpenbaseMonitorData standbyStateRequested(OpenbaseStandbyState standbyStateRequested) {
    this.standbyStateRequested = standbyStateRequested;
    return this;
  }

  /**
   * Get standbyStateRequested
   * @return standbyStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseStandbyState getStandbyStateRequested() {
    return standbyStateRequested;
  }

  public void setStandbyStateRequested(OpenbaseStandbyState standbyStateRequested) {
    this.standbyStateRequested = standbyStateRequested;
  }

  public OpenbaseMonitorData transactionId(Long transactionId) {
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
    OpenbaseMonitorData openbaseMonitorData = (OpenbaseMonitorData) o;
    return Objects.equals(this.action, openbaseMonitorData.action) &&
        Objects.equals(this.alias, openbaseMonitorData.alias) &&
        Objects.equals(this.id, openbaseMonitorData.id) &&
        Objects.equals(this.powerState, openbaseMonitorData.powerState) &&
        Objects.equals(this.powerStateLast, openbaseMonitorData.powerStateLast) &&
        Objects.equals(this.powerStateRequested, openbaseMonitorData.powerStateRequested) &&
        Objects.equals(this.standbyState, openbaseMonitorData.standbyState) &&
        Objects.equals(this.standbyStateLast, openbaseMonitorData.standbyStateLast) &&
        Objects.equals(this.standbyStateRequested, openbaseMonitorData.standbyStateRequested) &&
        Objects.equals(this.transactionId, openbaseMonitorData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, alias, id, powerState, powerStateLast, powerStateRequested, standbyState, standbyStateLast, standbyStateRequested, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseMonitorData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    powerState: ").append(toIndentedString(powerState)).append("\n");
    sb.append("    powerStateLast: ").append(toIndentedString(powerStateLast)).append("\n");
    sb.append("    powerStateRequested: ").append(toIndentedString(powerStateRequested)).append("\n");
    sb.append("    standbyState: ").append(toIndentedString(standbyState)).append("\n");
    sb.append("    standbyStateLast: ").append(toIndentedString(standbyStateLast)).append("\n");
    sb.append("    standbyStateRequested: ").append(toIndentedString(standbyStateRequested)).append("\n");
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

