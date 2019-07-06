package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseActionDescription;
import org.openapitools.model.OpenbaseBrightnessState;
import org.openapitools.model.OpenbasePowerState;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseDimmerData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseDimmerData   {
  @JsonProperty("action")
  @Valid
  private List<OpenbaseActionDescription> action = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("brightness_state")
  private OpenbaseBrightnessState brightnessState = null;

  @JsonProperty("brightness_state_last")
  private OpenbaseBrightnessState brightnessStateLast = null;

  @JsonProperty("brightness_state_requested")
  private OpenbaseBrightnessState brightnessStateRequested = null;

  @JsonProperty("id")
  private String id;

  @JsonProperty("power_state")
  private OpenbasePowerState powerState = null;

  @JsonProperty("power_state_last")
  private OpenbasePowerState powerStateLast = null;

  @JsonProperty("power_state_requested")
  private OpenbasePowerState powerStateRequested = null;

  @JsonProperty("transaction_id")
  private Long transactionId;

  public OpenbaseDimmerData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbaseDimmerData addActionItem(OpenbaseActionDescription actionItem) {
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

  public OpenbaseDimmerData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseDimmerData addAliasItem(String aliasItem) {
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

  public OpenbaseDimmerData brightnessState(OpenbaseBrightnessState brightnessState) {
    this.brightnessState = brightnessState;
    return this;
  }

  /**
   * Get brightnessState
   * @return brightnessState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseBrightnessState getBrightnessState() {
    return brightnessState;
  }

  public void setBrightnessState(OpenbaseBrightnessState brightnessState) {
    this.brightnessState = brightnessState;
  }

  public OpenbaseDimmerData brightnessStateLast(OpenbaseBrightnessState brightnessStateLast) {
    this.brightnessStateLast = brightnessStateLast;
    return this;
  }

  /**
   * Get brightnessStateLast
   * @return brightnessStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseBrightnessState getBrightnessStateLast() {
    return brightnessStateLast;
  }

  public void setBrightnessStateLast(OpenbaseBrightnessState brightnessStateLast) {
    this.brightnessStateLast = brightnessStateLast;
  }

  public OpenbaseDimmerData brightnessStateRequested(OpenbaseBrightnessState brightnessStateRequested) {
    this.brightnessStateRequested = brightnessStateRequested;
    return this;
  }

  /**
   * Get brightnessStateRequested
   * @return brightnessStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseBrightnessState getBrightnessStateRequested() {
    return brightnessStateRequested;
  }

  public void setBrightnessStateRequested(OpenbaseBrightnessState brightnessStateRequested) {
    this.brightnessStateRequested = brightnessStateRequested;
  }

  public OpenbaseDimmerData id(String id) {
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

  public OpenbaseDimmerData powerState(OpenbasePowerState powerState) {
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

  public OpenbaseDimmerData powerStateLast(OpenbasePowerState powerStateLast) {
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

  public OpenbaseDimmerData powerStateRequested(OpenbasePowerState powerStateRequested) {
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

  public OpenbaseDimmerData transactionId(Long transactionId) {
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
    OpenbaseDimmerData openbaseDimmerData = (OpenbaseDimmerData) o;
    return Objects.equals(this.action, openbaseDimmerData.action) &&
        Objects.equals(this.alias, openbaseDimmerData.alias) &&
        Objects.equals(this.brightnessState, openbaseDimmerData.brightnessState) &&
        Objects.equals(this.brightnessStateLast, openbaseDimmerData.brightnessStateLast) &&
        Objects.equals(this.brightnessStateRequested, openbaseDimmerData.brightnessStateRequested) &&
        Objects.equals(this.id, openbaseDimmerData.id) &&
        Objects.equals(this.powerState, openbaseDimmerData.powerState) &&
        Objects.equals(this.powerStateLast, openbaseDimmerData.powerStateLast) &&
        Objects.equals(this.powerStateRequested, openbaseDimmerData.powerStateRequested) &&
        Objects.equals(this.transactionId, openbaseDimmerData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, alias, brightnessState, brightnessStateLast, brightnessStateRequested, id, powerState, powerStateLast, powerStateRequested, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseDimmerData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    brightnessState: ").append(toIndentedString(brightnessState)).append("\n");
    sb.append("    brightnessStateLast: ").append(toIndentedString(brightnessStateLast)).append("\n");
    sb.append("    brightnessStateRequested: ").append(toIndentedString(brightnessStateRequested)).append("\n");
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

