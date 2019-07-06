package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseActionDescription;
import io.swagger.model.OpenbaseBatteryState;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseBatteryData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseBatteryData   {
  @JsonProperty("action")
  @Valid
  private List<OpenbaseActionDescription> action = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("battery_state")
  private OpenbaseBatteryState batteryState = null;

  @JsonProperty("battery_state_last")
  private OpenbaseBatteryState batteryStateLast = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("transaction_id")
  private Long transactionId = null;

  public OpenbaseBatteryData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbaseBatteryData addActionItem(OpenbaseActionDescription actionItem) {
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

  public OpenbaseBatteryData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseBatteryData addAliasItem(String aliasItem) {
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

  public OpenbaseBatteryData batteryState(OpenbaseBatteryState batteryState) {
    this.batteryState = batteryState;
    return this;
  }

  /**
   * Get batteryState
   * @return batteryState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseBatteryState getBatteryState() {
    return batteryState;
  }

  public void setBatteryState(OpenbaseBatteryState batteryState) {
    this.batteryState = batteryState;
  }

  public OpenbaseBatteryData batteryStateLast(OpenbaseBatteryState batteryStateLast) {
    this.batteryStateLast = batteryStateLast;
    return this;
  }

  /**
   * Get batteryStateLast
   * @return batteryStateLast
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseBatteryState getBatteryStateLast() {
    return batteryStateLast;
  }

  public void setBatteryStateLast(OpenbaseBatteryState batteryStateLast) {
    this.batteryStateLast = batteryStateLast;
  }

  public OpenbaseBatteryData id(String id) {
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

  public OpenbaseBatteryData transactionId(Long transactionId) {
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
    OpenbaseBatteryData openbaseBatteryData = (OpenbaseBatteryData) o;
    return Objects.equals(this.action, openbaseBatteryData.action) &&
        Objects.equals(this.alias, openbaseBatteryData.alias) &&
        Objects.equals(this.batteryState, openbaseBatteryData.batteryState) &&
        Objects.equals(this.batteryStateLast, openbaseBatteryData.batteryStateLast) &&
        Objects.equals(this.id, openbaseBatteryData.id) &&
        Objects.equals(this.transactionId, openbaseBatteryData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, alias, batteryState, batteryStateLast, id, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseBatteryData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    batteryState: ").append(toIndentedString(batteryState)).append("\n");
    sb.append("    batteryStateLast: ").append(toIndentedString(batteryStateLast)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
