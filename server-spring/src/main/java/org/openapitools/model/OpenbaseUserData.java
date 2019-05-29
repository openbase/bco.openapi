package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseActionDescription;
import org.openapitools.model.OpenbaseActivityMultiState;
import org.openapitools.model.OpenbaseGlobalPositionState;
import org.openapitools.model.OpenbaseLocalPositionState;
import org.openapitools.model.OpenbasePresenceState;
import org.openapitools.model.OpenbaseUserTransitState;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseUserData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-29T22:47:43.327074+02:00[Europe/Berlin]")

public class OpenbaseUserData   {
  @JsonProperty("action")
  @Valid
  private List<OpenbaseActionDescription> action = null;

  @JsonProperty("activity_multi_state")
  private OpenbaseActivityMultiState activityMultiState = null;

  @JsonProperty("activity_multi_state_last")
  private OpenbaseActivityMultiState activityMultiStateLast = null;

  @JsonProperty("activity_multi_state_requested")
  private OpenbaseActivityMultiState activityMultiStateRequested = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("global_position_state")
  private OpenbaseGlobalPositionState globalPositionState = null;

  @JsonProperty("global_position_state_last")
  private OpenbaseGlobalPositionState globalPositionStateLast = null;

  @JsonProperty("global_position_state_requested")
  private OpenbaseGlobalPositionState globalPositionStateRequested = null;

  @JsonProperty("id")
  private String id;

  @JsonProperty("local_position_state")
  private OpenbaseLocalPositionState localPositionState = null;

  @JsonProperty("local_position_state_last")
  private OpenbaseLocalPositionState localPositionStateLast = null;

  @JsonProperty("local_position_state_requested")
  private OpenbaseLocalPositionState localPositionStateRequested = null;

  @JsonProperty("presence_state")
  private OpenbasePresenceState presenceState = null;

  @JsonProperty("presence_state_last")
  private OpenbasePresenceState presenceStateLast = null;

  @JsonProperty("presence_state_requested")
  private OpenbasePresenceState presenceStateRequested = null;

  @JsonProperty("transaction_id")
  private Long transactionId;

  @JsonProperty("user_transit_state")
  private OpenbaseUserTransitState userTransitState = null;

  @JsonProperty("user_transit_state_last")
  private OpenbaseUserTransitState userTransitStateLast = null;

  @JsonProperty("user_transit_state_requested")
  private OpenbaseUserTransitState userTransitStateRequested = null;

  public OpenbaseUserData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbaseUserData addActionItem(OpenbaseActionDescription actionItem) {
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

  public OpenbaseUserData activityMultiState(OpenbaseActivityMultiState activityMultiState) {
    this.activityMultiState = activityMultiState;
    return this;
  }

  /**
   * Get activityMultiState
   * @return activityMultiState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseActivityMultiState getActivityMultiState() {
    return activityMultiState;
  }

  public void setActivityMultiState(OpenbaseActivityMultiState activityMultiState) {
    this.activityMultiState = activityMultiState;
  }

  public OpenbaseUserData activityMultiStateLast(OpenbaseActivityMultiState activityMultiStateLast) {
    this.activityMultiStateLast = activityMultiStateLast;
    return this;
  }

  /**
   * Get activityMultiStateLast
   * @return activityMultiStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseActivityMultiState getActivityMultiStateLast() {
    return activityMultiStateLast;
  }

  public void setActivityMultiStateLast(OpenbaseActivityMultiState activityMultiStateLast) {
    this.activityMultiStateLast = activityMultiStateLast;
  }

  public OpenbaseUserData activityMultiStateRequested(OpenbaseActivityMultiState activityMultiStateRequested) {
    this.activityMultiStateRequested = activityMultiStateRequested;
    return this;
  }

  /**
   * Get activityMultiStateRequested
   * @return activityMultiStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseActivityMultiState getActivityMultiStateRequested() {
    return activityMultiStateRequested;
  }

  public void setActivityMultiStateRequested(OpenbaseActivityMultiState activityMultiStateRequested) {
    this.activityMultiStateRequested = activityMultiStateRequested;
  }

  public OpenbaseUserData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseUserData addAliasItem(String aliasItem) {
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

  public OpenbaseUserData globalPositionState(OpenbaseGlobalPositionState globalPositionState) {
    this.globalPositionState = globalPositionState;
    return this;
  }

  /**
   * Get globalPositionState
   * @return globalPositionState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseGlobalPositionState getGlobalPositionState() {
    return globalPositionState;
  }

  public void setGlobalPositionState(OpenbaseGlobalPositionState globalPositionState) {
    this.globalPositionState = globalPositionState;
  }

  public OpenbaseUserData globalPositionStateLast(OpenbaseGlobalPositionState globalPositionStateLast) {
    this.globalPositionStateLast = globalPositionStateLast;
    return this;
  }

  /**
   * Get globalPositionStateLast
   * @return globalPositionStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseGlobalPositionState getGlobalPositionStateLast() {
    return globalPositionStateLast;
  }

  public void setGlobalPositionStateLast(OpenbaseGlobalPositionState globalPositionStateLast) {
    this.globalPositionStateLast = globalPositionStateLast;
  }

  public OpenbaseUserData globalPositionStateRequested(OpenbaseGlobalPositionState globalPositionStateRequested) {
    this.globalPositionStateRequested = globalPositionStateRequested;
    return this;
  }

  /**
   * Get globalPositionStateRequested
   * @return globalPositionStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseGlobalPositionState getGlobalPositionStateRequested() {
    return globalPositionStateRequested;
  }

  public void setGlobalPositionStateRequested(OpenbaseGlobalPositionState globalPositionStateRequested) {
    this.globalPositionStateRequested = globalPositionStateRequested;
  }

  public OpenbaseUserData id(String id) {
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

  public OpenbaseUserData localPositionState(OpenbaseLocalPositionState localPositionState) {
    this.localPositionState = localPositionState;
    return this;
  }

  /**
   * Get localPositionState
   * @return localPositionState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseLocalPositionState getLocalPositionState() {
    return localPositionState;
  }

  public void setLocalPositionState(OpenbaseLocalPositionState localPositionState) {
    this.localPositionState = localPositionState;
  }

  public OpenbaseUserData localPositionStateLast(OpenbaseLocalPositionState localPositionStateLast) {
    this.localPositionStateLast = localPositionStateLast;
    return this;
  }

  /**
   * Get localPositionStateLast
   * @return localPositionStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseLocalPositionState getLocalPositionStateLast() {
    return localPositionStateLast;
  }

  public void setLocalPositionStateLast(OpenbaseLocalPositionState localPositionStateLast) {
    this.localPositionStateLast = localPositionStateLast;
  }

  public OpenbaseUserData localPositionStateRequested(OpenbaseLocalPositionState localPositionStateRequested) {
    this.localPositionStateRequested = localPositionStateRequested;
    return this;
  }

  /**
   * Get localPositionStateRequested
   * @return localPositionStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseLocalPositionState getLocalPositionStateRequested() {
    return localPositionStateRequested;
  }

  public void setLocalPositionStateRequested(OpenbaseLocalPositionState localPositionStateRequested) {
    this.localPositionStateRequested = localPositionStateRequested;
  }

  public OpenbaseUserData presenceState(OpenbasePresenceState presenceState) {
    this.presenceState = presenceState;
    return this;
  }

  /**
   * Get presenceState
   * @return presenceState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePresenceState getPresenceState() {
    return presenceState;
  }

  public void setPresenceState(OpenbasePresenceState presenceState) {
    this.presenceState = presenceState;
  }

  public OpenbaseUserData presenceStateLast(OpenbasePresenceState presenceStateLast) {
    this.presenceStateLast = presenceStateLast;
    return this;
  }

  /**
   * Get presenceStateLast
   * @return presenceStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePresenceState getPresenceStateLast() {
    return presenceStateLast;
  }

  public void setPresenceStateLast(OpenbasePresenceState presenceStateLast) {
    this.presenceStateLast = presenceStateLast;
  }

  public OpenbaseUserData presenceStateRequested(OpenbasePresenceState presenceStateRequested) {
    this.presenceStateRequested = presenceStateRequested;
    return this;
  }

  /**
   * Get presenceStateRequested
   * @return presenceStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePresenceState getPresenceStateRequested() {
    return presenceStateRequested;
  }

  public void setPresenceStateRequested(OpenbasePresenceState presenceStateRequested) {
    this.presenceStateRequested = presenceStateRequested;
  }

  public OpenbaseUserData transactionId(Long transactionId) {
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

  public OpenbaseUserData userTransitState(OpenbaseUserTransitState userTransitState) {
    this.userTransitState = userTransitState;
    return this;
  }

  /**
   * Get userTransitState
   * @return userTransitState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseUserTransitState getUserTransitState() {
    return userTransitState;
  }

  public void setUserTransitState(OpenbaseUserTransitState userTransitState) {
    this.userTransitState = userTransitState;
  }

  public OpenbaseUserData userTransitStateLast(OpenbaseUserTransitState userTransitStateLast) {
    this.userTransitStateLast = userTransitStateLast;
    return this;
  }

  /**
   * Get userTransitStateLast
   * @return userTransitStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseUserTransitState getUserTransitStateLast() {
    return userTransitStateLast;
  }

  public void setUserTransitStateLast(OpenbaseUserTransitState userTransitStateLast) {
    this.userTransitStateLast = userTransitStateLast;
  }

  public OpenbaseUserData userTransitStateRequested(OpenbaseUserTransitState userTransitStateRequested) {
    this.userTransitStateRequested = userTransitStateRequested;
    return this;
  }

  /**
   * Get userTransitStateRequested
   * @return userTransitStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseUserTransitState getUserTransitStateRequested() {
    return userTransitStateRequested;
  }

  public void setUserTransitStateRequested(OpenbaseUserTransitState userTransitStateRequested) {
    this.userTransitStateRequested = userTransitStateRequested;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseUserData openbaseUserData = (OpenbaseUserData) o;
    return Objects.equals(this.action, openbaseUserData.action) &&
        Objects.equals(this.activityMultiState, openbaseUserData.activityMultiState) &&
        Objects.equals(this.activityMultiStateLast, openbaseUserData.activityMultiStateLast) &&
        Objects.equals(this.activityMultiStateRequested, openbaseUserData.activityMultiStateRequested) &&
        Objects.equals(this.alias, openbaseUserData.alias) &&
        Objects.equals(this.globalPositionState, openbaseUserData.globalPositionState) &&
        Objects.equals(this.globalPositionStateLast, openbaseUserData.globalPositionStateLast) &&
        Objects.equals(this.globalPositionStateRequested, openbaseUserData.globalPositionStateRequested) &&
        Objects.equals(this.id, openbaseUserData.id) &&
        Objects.equals(this.localPositionState, openbaseUserData.localPositionState) &&
        Objects.equals(this.localPositionStateLast, openbaseUserData.localPositionStateLast) &&
        Objects.equals(this.localPositionStateRequested, openbaseUserData.localPositionStateRequested) &&
        Objects.equals(this.presenceState, openbaseUserData.presenceState) &&
        Objects.equals(this.presenceStateLast, openbaseUserData.presenceStateLast) &&
        Objects.equals(this.presenceStateRequested, openbaseUserData.presenceStateRequested) &&
        Objects.equals(this.transactionId, openbaseUserData.transactionId) &&
        Objects.equals(this.userTransitState, openbaseUserData.userTransitState) &&
        Objects.equals(this.userTransitStateLast, openbaseUserData.userTransitStateLast) &&
        Objects.equals(this.userTransitStateRequested, openbaseUserData.userTransitStateRequested);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, activityMultiState, activityMultiStateLast, activityMultiStateRequested, alias, globalPositionState, globalPositionStateLast, globalPositionStateRequested, id, localPositionState, localPositionStateLast, localPositionStateRequested, presenceState, presenceStateLast, presenceStateRequested, transactionId, userTransitState, userTransitStateLast, userTransitStateRequested);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseUserData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    activityMultiState: ").append(toIndentedString(activityMultiState)).append("\n");
    sb.append("    activityMultiStateLast: ").append(toIndentedString(activityMultiStateLast)).append("\n");
    sb.append("    activityMultiStateRequested: ").append(toIndentedString(activityMultiStateRequested)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    globalPositionState: ").append(toIndentedString(globalPositionState)).append("\n");
    sb.append("    globalPositionStateLast: ").append(toIndentedString(globalPositionStateLast)).append("\n");
    sb.append("    globalPositionStateRequested: ").append(toIndentedString(globalPositionStateRequested)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localPositionState: ").append(toIndentedString(localPositionState)).append("\n");
    sb.append("    localPositionStateLast: ").append(toIndentedString(localPositionStateLast)).append("\n");
    sb.append("    localPositionStateRequested: ").append(toIndentedString(localPositionStateRequested)).append("\n");
    sb.append("    presenceState: ").append(toIndentedString(presenceState)).append("\n");
    sb.append("    presenceStateLast: ").append(toIndentedString(presenceStateLast)).append("\n");
    sb.append("    presenceStateRequested: ").append(toIndentedString(presenceStateRequested)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    userTransitState: ").append(toIndentedString(userTransitState)).append("\n");
    sb.append("    userTransitStateLast: ").append(toIndentedString(userTransitStateLast)).append("\n");
    sb.append("    userTransitStateRequested: ").append(toIndentedString(userTransitStateRequested)).append("\n");
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

