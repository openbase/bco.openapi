package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseActionDescription;
import org.openapitools.model.OpenbaseActivationState;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseSceneData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseSceneData   {
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
  private String id;

  @JsonProperty("transaction_id")
  private Long transactionId;

  public OpenbaseSceneData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbaseSceneData addActionItem(OpenbaseActionDescription actionItem) {
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

  public OpenbaseSceneData activationState(OpenbaseActivationState activationState) {
    this.activationState = activationState;
    return this;
  }

  /**
   * Get activationState
   * @return activationState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseActivationState getActivationState() {
    return activationState;
  }

  public void setActivationState(OpenbaseActivationState activationState) {
    this.activationState = activationState;
  }

  public OpenbaseSceneData activationStateLast(OpenbaseActivationState activationStateLast) {
    this.activationStateLast = activationStateLast;
    return this;
  }

  /**
   * Get activationStateLast
   * @return activationStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseActivationState getActivationStateLast() {
    return activationStateLast;
  }

  public void setActivationStateLast(OpenbaseActivationState activationStateLast) {
    this.activationStateLast = activationStateLast;
  }

  public OpenbaseSceneData activationStateRequested(OpenbaseActivationState activationStateRequested) {
    this.activationStateRequested = activationStateRequested;
    return this;
  }

  /**
   * Get activationStateRequested
   * @return activationStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseActivationState getActivationStateRequested() {
    return activationStateRequested;
  }

  public void setActivationStateRequested(OpenbaseActivationState activationStateRequested) {
    this.activationStateRequested = activationStateRequested;
  }

  public OpenbaseSceneData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseSceneData addAliasItem(String aliasItem) {
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

  public OpenbaseSceneData id(String id) {
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

  public OpenbaseSceneData transactionId(Long transactionId) {
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
    OpenbaseSceneData openbaseSceneData = (OpenbaseSceneData) o;
    return Objects.equals(this.action, openbaseSceneData.action) &&
        Objects.equals(this.activationState, openbaseSceneData.activationState) &&
        Objects.equals(this.activationStateLast, openbaseSceneData.activationStateLast) &&
        Objects.equals(this.activationStateRequested, openbaseSceneData.activationStateRequested) &&
        Objects.equals(this.alias, openbaseSceneData.alias) &&
        Objects.equals(this.id, openbaseSceneData.id) &&
        Objects.equals(this.transactionId, openbaseSceneData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, activationState, activationStateLast, activationStateRequested, alias, id, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseSceneData {\n");
    
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

