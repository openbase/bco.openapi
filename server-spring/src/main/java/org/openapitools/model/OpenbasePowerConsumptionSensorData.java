package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseActionDescription;
import org.openapitools.model.OpenbasePowerConsumptionState;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbasePowerConsumptionSensorData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-29T22:47:43.327074+02:00[Europe/Berlin]")

public class OpenbasePowerConsumptionSensorData   {
  @JsonProperty("action")
  @Valid
  private List<OpenbaseActionDescription> action = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("id")
  private String id;

  @JsonProperty("power_consumption_state")
  private OpenbasePowerConsumptionState powerConsumptionState = null;

  @JsonProperty("power_consumption_state_last")
  private OpenbasePowerConsumptionState powerConsumptionStateLast = null;

  @JsonProperty("transaction_id")
  private Long transactionId;

  public OpenbasePowerConsumptionSensorData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbasePowerConsumptionSensorData addActionItem(OpenbaseActionDescription actionItem) {
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

  public OpenbasePowerConsumptionSensorData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbasePowerConsumptionSensorData addAliasItem(String aliasItem) {
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

  public OpenbasePowerConsumptionSensorData id(String id) {
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

  public OpenbasePowerConsumptionSensorData powerConsumptionState(OpenbasePowerConsumptionState powerConsumptionState) {
    this.powerConsumptionState = powerConsumptionState;
    return this;
  }

  /**
   * Get powerConsumptionState
   * @return powerConsumptionState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePowerConsumptionState getPowerConsumptionState() {
    return powerConsumptionState;
  }

  public void setPowerConsumptionState(OpenbasePowerConsumptionState powerConsumptionState) {
    this.powerConsumptionState = powerConsumptionState;
  }

  public OpenbasePowerConsumptionSensorData powerConsumptionStateLast(OpenbasePowerConsumptionState powerConsumptionStateLast) {
    this.powerConsumptionStateLast = powerConsumptionStateLast;
    return this;
  }

  /**
   * Get powerConsumptionStateLast
   * @return powerConsumptionStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePowerConsumptionState getPowerConsumptionStateLast() {
    return powerConsumptionStateLast;
  }

  public void setPowerConsumptionStateLast(OpenbasePowerConsumptionState powerConsumptionStateLast) {
    this.powerConsumptionStateLast = powerConsumptionStateLast;
  }

  public OpenbasePowerConsumptionSensorData transactionId(Long transactionId) {
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
    OpenbasePowerConsumptionSensorData openbasePowerConsumptionSensorData = (OpenbasePowerConsumptionSensorData) o;
    return Objects.equals(this.action, openbasePowerConsumptionSensorData.action) &&
        Objects.equals(this.alias, openbasePowerConsumptionSensorData.alias) &&
        Objects.equals(this.id, openbasePowerConsumptionSensorData.id) &&
        Objects.equals(this.powerConsumptionState, openbasePowerConsumptionSensorData.powerConsumptionState) &&
        Objects.equals(this.powerConsumptionStateLast, openbasePowerConsumptionSensorData.powerConsumptionStateLast) &&
        Objects.equals(this.transactionId, openbasePowerConsumptionSensorData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, alias, id, powerConsumptionState, powerConsumptionStateLast, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbasePowerConsumptionSensorData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    powerConsumptionState: ").append(toIndentedString(powerConsumptionState)).append("\n");
    sb.append("    powerConsumptionStateLast: ").append(toIndentedString(powerConsumptionStateLast)).append("\n");
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

