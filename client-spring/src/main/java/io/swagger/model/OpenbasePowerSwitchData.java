package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseActionDescription;
import io.swagger.model.OpenbasePowerState;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbasePowerSwitchData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbasePowerSwitchData   {
  @JsonProperty("action")
  @Valid
  private List<OpenbaseActionDescription> action = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("power_state")
  private OpenbasePowerState powerState = null;

  @JsonProperty("power_state_last")
  private OpenbasePowerState powerStateLast = null;

  @JsonProperty("power_state_requested")
  private OpenbasePowerState powerStateRequested = null;

  @JsonProperty("transaction_id")
  private Long transactionId = null;

  public OpenbasePowerSwitchData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbasePowerSwitchData addActionItem(OpenbaseActionDescription actionItem) {
    if (this.action == null) {
      this.action = new ArrayList<OpenbaseActionDescription>();
    }
    this.action.add(actionItem);
    return this;
  }

  /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbaseActionDescription> getAction() {
    return action;
  }

  public void setAction(List<OpenbaseActionDescription> action) {
    this.action = action;
  }

  public OpenbasePowerSwitchData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbasePowerSwitchData addAliasItem(String aliasItem) {
    if (this.alias == null) {
      this.alias = new ArrayList<String>();
    }
    this.alias.add(aliasItem);
    return this;
  }

  /**
   * Get alias
   * @return alias
  **/
  @ApiModelProperty(value = "")

  public List<String> getAlias() {
    return alias;
  }

  public void setAlias(List<String> alias) {
    this.alias = alias;
  }

  public OpenbasePowerSwitchData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OpenbasePowerSwitchData powerState(OpenbasePowerState powerState) {
    this.powerState = powerState;
    return this;
  }

  /**
   * Get powerState
   * @return powerState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbasePowerState getPowerState() {
    return powerState;
  }

  public void setPowerState(OpenbasePowerState powerState) {
    this.powerState = powerState;
  }

  public OpenbasePowerSwitchData powerStateLast(OpenbasePowerState powerStateLast) {
    this.powerStateLast = powerStateLast;
    return this;
  }

  /**
   * Get powerStateLast
   * @return powerStateLast
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbasePowerState getPowerStateLast() {
    return powerStateLast;
  }

  public void setPowerStateLast(OpenbasePowerState powerStateLast) {
    this.powerStateLast = powerStateLast;
  }

  public OpenbasePowerSwitchData powerStateRequested(OpenbasePowerState powerStateRequested) {
    this.powerStateRequested = powerStateRequested;
    return this;
  }

  /**
   * Get powerStateRequested
   * @return powerStateRequested
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbasePowerState getPowerStateRequested() {
    return powerStateRequested;
  }

  public void setPowerStateRequested(OpenbasePowerState powerStateRequested) {
    this.powerStateRequested = powerStateRequested;
  }

  public OpenbasePowerSwitchData transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
  **/
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
    OpenbasePowerSwitchData openbasePowerSwitchData = (OpenbasePowerSwitchData) o;
    return Objects.equals(this.action, openbasePowerSwitchData.action) &&
        Objects.equals(this.alias, openbasePowerSwitchData.alias) &&
        Objects.equals(this.id, openbasePowerSwitchData.id) &&
        Objects.equals(this.powerState, openbasePowerSwitchData.powerState) &&
        Objects.equals(this.powerStateLast, openbasePowerSwitchData.powerStateLast) &&
        Objects.equals(this.powerStateRequested, openbasePowerSwitchData.powerStateRequested) &&
        Objects.equals(this.transactionId, openbasePowerSwitchData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, alias, id, powerState, powerStateLast, powerStateRequested, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbasePowerSwitchData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    powerState: ").append(toIndentedString(powerState)).append("\n");
    sb.append("    powerStateLast: ").append(toIndentedString(powerStateLast)).append("\n");
    sb.append("    powerStateRequested: ").append(toIndentedString(powerStateRequested)).append("\n");
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