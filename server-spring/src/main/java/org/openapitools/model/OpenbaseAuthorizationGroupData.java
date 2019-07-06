package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseActionDescription;
import org.openapitools.model.OpenbaseActivityState;
import org.openapitools.model.OpenbasePresenceState;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseAuthorizationGroupData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseAuthorizationGroupData   {
  @JsonProperty("action")
  @Valid
  private List<OpenbaseActionDescription> action = null;

  @JsonProperty("activity_state")
  @Valid
  private List<OpenbaseActivityState> activityState = null;

  @JsonProperty("activity_state_last")
  @Valid
  private List<OpenbaseActivityState> activityStateLast = null;

  @JsonProperty("activity_state_requested")
  @Valid
  private List<OpenbaseActivityState> activityStateRequested = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("id")
  private String id;

  @JsonProperty("presence_state")
  private OpenbasePresenceState presenceState = null;

  @JsonProperty("presence_state_last")
  private OpenbasePresenceState presenceStateLast = null;

  @JsonProperty("transaction_id")
  private Long transactionId;

  public OpenbaseAuthorizationGroupData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbaseAuthorizationGroupData addActionItem(OpenbaseActionDescription actionItem) {
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

  public OpenbaseAuthorizationGroupData activityState(List<OpenbaseActivityState> activityState) {
    this.activityState = activityState;
    return this;
  }

  public OpenbaseAuthorizationGroupData addActivityStateItem(OpenbaseActivityState activityStateItem) {
    if (this.activityState == null) {
      this.activityState = new ArrayList<>();
    }
    this.activityState.add(activityStateItem);
    return this;
  }

  /**
   * Get activityState
   * @return activityState
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseActivityState> getActivityState() {
    return activityState;
  }

  public void setActivityState(List<OpenbaseActivityState> activityState) {
    this.activityState = activityState;
  }

  public OpenbaseAuthorizationGroupData activityStateLast(List<OpenbaseActivityState> activityStateLast) {
    this.activityStateLast = activityStateLast;
    return this;
  }

  public OpenbaseAuthorizationGroupData addActivityStateLastItem(OpenbaseActivityState activityStateLastItem) {
    if (this.activityStateLast == null) {
      this.activityStateLast = new ArrayList<>();
    }
    this.activityStateLast.add(activityStateLastItem);
    return this;
  }

  /**
   * Get activityStateLast
   * @return activityStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseActivityState> getActivityStateLast() {
    return activityStateLast;
  }

  public void setActivityStateLast(List<OpenbaseActivityState> activityStateLast) {
    this.activityStateLast = activityStateLast;
  }

  public OpenbaseAuthorizationGroupData activityStateRequested(List<OpenbaseActivityState> activityStateRequested) {
    this.activityStateRequested = activityStateRequested;
    return this;
  }

  public OpenbaseAuthorizationGroupData addActivityStateRequestedItem(OpenbaseActivityState activityStateRequestedItem) {
    if (this.activityStateRequested == null) {
      this.activityStateRequested = new ArrayList<>();
    }
    this.activityStateRequested.add(activityStateRequestedItem);
    return this;
  }

  /**
   * Get activityStateRequested
   * @return activityStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseActivityState> getActivityStateRequested() {
    return activityStateRequested;
  }

  public void setActivityStateRequested(List<OpenbaseActivityState> activityStateRequested) {
    this.activityStateRequested = activityStateRequested;
  }

  public OpenbaseAuthorizationGroupData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseAuthorizationGroupData addAliasItem(String aliasItem) {
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

  public OpenbaseAuthorizationGroupData id(String id) {
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

  public OpenbaseAuthorizationGroupData presenceState(OpenbasePresenceState presenceState) {
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

  public OpenbaseAuthorizationGroupData presenceStateLast(OpenbasePresenceState presenceStateLast) {
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

  public OpenbaseAuthorizationGroupData transactionId(Long transactionId) {
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
    OpenbaseAuthorizationGroupData openbaseAuthorizationGroupData = (OpenbaseAuthorizationGroupData) o;
    return Objects.equals(this.action, openbaseAuthorizationGroupData.action) &&
        Objects.equals(this.activityState, openbaseAuthorizationGroupData.activityState) &&
        Objects.equals(this.activityStateLast, openbaseAuthorizationGroupData.activityStateLast) &&
        Objects.equals(this.activityStateRequested, openbaseAuthorizationGroupData.activityStateRequested) &&
        Objects.equals(this.alias, openbaseAuthorizationGroupData.alias) &&
        Objects.equals(this.id, openbaseAuthorizationGroupData.id) &&
        Objects.equals(this.presenceState, openbaseAuthorizationGroupData.presenceState) &&
        Objects.equals(this.presenceStateLast, openbaseAuthorizationGroupData.presenceStateLast) &&
        Objects.equals(this.transactionId, openbaseAuthorizationGroupData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, activityState, activityStateLast, activityStateRequested, alias, id, presenceState, presenceStateLast, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseAuthorizationGroupData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    activityState: ").append(toIndentedString(activityState)).append("\n");
    sb.append("    activityStateLast: ").append(toIndentedString(activityStateLast)).append("\n");
    sb.append("    activityStateRequested: ").append(toIndentedString(activityStateRequested)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    presenceState: ").append(toIndentedString(presenceState)).append("\n");
    sb.append("    presenceStateLast: ").append(toIndentedString(presenceStateLast)).append("\n");
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

