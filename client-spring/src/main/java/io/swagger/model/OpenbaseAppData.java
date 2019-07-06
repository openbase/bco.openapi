package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseActionDescription;
import io.swagger.model.OpenbaseActivationState;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseAppData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseAppData   {
  @JsonProperty("action")
  @Valid
  private List<OpenbaseActionDescription> action = null;

  @JsonProperty("activation_state")
  private OpenbaseActivationState activationState = null;

  @JsonProperty("activation_state_last")
  private OpenbaseActivationState activationStateLast = null;

  @JsonProperty("activation_state_requested")
  private OpenbaseActivationState activationStateRequested = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("transaction_id")
  private Long transactionId = null;

  public OpenbaseAppData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbaseAppData addActionItem(OpenbaseActionDescription actionItem) {
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

  public OpenbaseAppData activationState(OpenbaseActivationState activationState) {
    this.activationState = activationState;
    return this;
  }

  /**
   * Get activationState
   * @return activationState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseActivationState getActivationState() {
    return activationState;
  }

  public void setActivationState(OpenbaseActivationState activationState) {
    this.activationState = activationState;
  }

  public OpenbaseAppData activationStateLast(OpenbaseActivationState activationStateLast) {
    this.activationStateLast = activationStateLast;
    return this;
  }

  /**
   * Get activationStateLast
   * @return activationStateLast
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseActivationState getActivationStateLast() {
    return activationStateLast;
  }

  public void setActivationStateLast(OpenbaseActivationState activationStateLast) {
    this.activationStateLast = activationStateLast;
  }

  public OpenbaseAppData activationStateRequested(OpenbaseActivationState activationStateRequested) {
    this.activationStateRequested = activationStateRequested;
    return this;
  }

  /**
   * Get activationStateRequested
   * @return activationStateRequested
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseActivationState getActivationStateRequested() {
    return activationStateRequested;
  }

  public void setActivationStateRequested(OpenbaseActivationState activationStateRequested) {
    this.activationStateRequested = activationStateRequested;
  }

  public OpenbaseAppData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseAppData addAliasItem(String aliasItem) {
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

  public OpenbaseAppData id(String id) {
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

  public OpenbaseAppData transactionId(Long transactionId) {
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
    OpenbaseAppData openbaseAppData = (OpenbaseAppData) o;
    return Objects.equals(this.action, openbaseAppData.action) &&
        Objects.equals(this.activationState, openbaseAppData.activationState) &&
        Objects.equals(this.activationStateLast, openbaseAppData.activationStateLast) &&
        Objects.equals(this.activationStateRequested, openbaseAppData.activationStateRequested) &&
        Objects.equals(this.alias, openbaseAppData.alias) &&
        Objects.equals(this.id, openbaseAppData.id) &&
        Objects.equals(this.transactionId, openbaseAppData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, activationState, activationStateLast, activationStateRequested, alias, id, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseAppData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    activationState: ").append(toIndentedString(activationState)).append("\n");
    sb.append("    activationStateLast: ").append(toIndentedString(activationStateLast)).append("\n");
    sb.append("    activationStateRequested: ").append(toIndentedString(activationStateRequested)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
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
