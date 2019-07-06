package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseActionDescription;
import io.swagger.model.OpenbaseActivationState;
import io.swagger.model.OpenbaseEmphasisState;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseAgentData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseAgentData   {
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

  @JsonProperty("emphasis_state")
  private OpenbaseEmphasisState emphasisState = null;

  @JsonProperty("emphasis_state_last")
  private OpenbaseEmphasisState emphasisStateLast = null;

  @JsonProperty("emphasis_state_requested")
  private OpenbaseEmphasisState emphasisStateRequested = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("transaction_id")
  private Long transactionId = null;

  public OpenbaseAgentData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbaseAgentData addActionItem(OpenbaseActionDescription actionItem) {
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

  public OpenbaseAgentData activationState(OpenbaseActivationState activationState) {
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

  public OpenbaseAgentData activationStateLast(OpenbaseActivationState activationStateLast) {
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

  public OpenbaseAgentData activationStateRequested(OpenbaseActivationState activationStateRequested) {
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

  public OpenbaseAgentData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseAgentData addAliasItem(String aliasItem) {
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

  public OpenbaseAgentData emphasisState(OpenbaseEmphasisState emphasisState) {
    this.emphasisState = emphasisState;
    return this;
  }

  /**
   * Get emphasisState
   * @return emphasisState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseEmphasisState getEmphasisState() {
    return emphasisState;
  }

  public void setEmphasisState(OpenbaseEmphasisState emphasisState) {
    this.emphasisState = emphasisState;
  }

  public OpenbaseAgentData emphasisStateLast(OpenbaseEmphasisState emphasisStateLast) {
    this.emphasisStateLast = emphasisStateLast;
    return this;
  }

  /**
   * Get emphasisStateLast
   * @return emphasisStateLast
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseEmphasisState getEmphasisStateLast() {
    return emphasisStateLast;
  }

  public void setEmphasisStateLast(OpenbaseEmphasisState emphasisStateLast) {
    this.emphasisStateLast = emphasisStateLast;
  }

  public OpenbaseAgentData emphasisStateRequested(OpenbaseEmphasisState emphasisStateRequested) {
    this.emphasisStateRequested = emphasisStateRequested;
    return this;
  }

  /**
   * Get emphasisStateRequested
   * @return emphasisStateRequested
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseEmphasisState getEmphasisStateRequested() {
    return emphasisStateRequested;
  }

  public void setEmphasisStateRequested(OpenbaseEmphasisState emphasisStateRequested) {
    this.emphasisStateRequested = emphasisStateRequested;
  }

  public OpenbaseAgentData id(String id) {
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

  public OpenbaseAgentData transactionId(Long transactionId) {
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
    OpenbaseAgentData openbaseAgentData = (OpenbaseAgentData) o;
    return Objects.equals(this.action, openbaseAgentData.action) &&
        Objects.equals(this.activationState, openbaseAgentData.activationState) &&
        Objects.equals(this.activationStateLast, openbaseAgentData.activationStateLast) &&
        Objects.equals(this.activationStateRequested, openbaseAgentData.activationStateRequested) &&
        Objects.equals(this.alias, openbaseAgentData.alias) &&
        Objects.equals(this.emphasisState, openbaseAgentData.emphasisState) &&
        Objects.equals(this.emphasisStateLast, openbaseAgentData.emphasisStateLast) &&
        Objects.equals(this.emphasisStateRequested, openbaseAgentData.emphasisStateRequested) &&
        Objects.equals(this.id, openbaseAgentData.id) &&
        Objects.equals(this.transactionId, openbaseAgentData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, activationState, activationStateLast, activationStateRequested, alias, emphasisState, emphasisStateLast, emphasisStateRequested, id, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseAgentData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    activationState: ").append(toIndentedString(activationState)).append("\n");
    sb.append("    activationStateLast: ").append(toIndentedString(activationStateLast)).append("\n");
    sb.append("    activationStateRequested: ").append(toIndentedString(activationStateRequested)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    emphasisState: ").append(toIndentedString(emphasisState)).append("\n");
    sb.append("    emphasisStateLast: ").append(toIndentedString(emphasisStateLast)).append("\n");
    sb.append("    emphasisStateRequested: ").append(toIndentedString(emphasisStateRequested)).append("\n");
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
