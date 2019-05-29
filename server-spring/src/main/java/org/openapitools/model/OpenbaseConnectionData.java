package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseActionDescription;
import org.openapitools.model.OpenbaseDoorState;
import org.openapitools.model.OpenbasePassageState;
import org.openapitools.model.OpenbaseWindowState;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseConnectionData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-29T22:47:43.327074+02:00[Europe/Berlin]")

public class OpenbaseConnectionData   {
  @JsonProperty("action")
  @Valid
  private List<OpenbaseActionDescription> action = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("door_state")
  private OpenbaseDoorState doorState = null;

  @JsonProperty("door_state_last")
  private OpenbaseDoorState doorStateLast = null;

  @JsonProperty("id")
  private String id;

  @JsonProperty("passage_state")
  private OpenbasePassageState passageState = null;

  @JsonProperty("passage_state_last")
  private OpenbasePassageState passageStateLast = null;

  @JsonProperty("transaction_id")
  private Long transactionId;

  @JsonProperty("window_state")
  private OpenbaseWindowState windowState = null;

  @JsonProperty("window_state_last")
  private OpenbaseWindowState windowStateLast = null;

  public OpenbaseConnectionData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbaseConnectionData addActionItem(OpenbaseActionDescription actionItem) {
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

  public OpenbaseConnectionData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseConnectionData addAliasItem(String aliasItem) {
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

  public OpenbaseConnectionData doorState(OpenbaseDoorState doorState) {
    this.doorState = doorState;
    return this;
  }

  /**
   * Get doorState
   * @return doorState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseDoorState getDoorState() {
    return doorState;
  }

  public void setDoorState(OpenbaseDoorState doorState) {
    this.doorState = doorState;
  }

  public OpenbaseConnectionData doorStateLast(OpenbaseDoorState doorStateLast) {
    this.doorStateLast = doorStateLast;
    return this;
  }

  /**
   * Get doorStateLast
   * @return doorStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseDoorState getDoorStateLast() {
    return doorStateLast;
  }

  public void setDoorStateLast(OpenbaseDoorState doorStateLast) {
    this.doorStateLast = doorStateLast;
  }

  public OpenbaseConnectionData id(String id) {
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

  public OpenbaseConnectionData passageState(OpenbasePassageState passageState) {
    this.passageState = passageState;
    return this;
  }

  /**
   * Get passageState
   * @return passageState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePassageState getPassageState() {
    return passageState;
  }

  public void setPassageState(OpenbasePassageState passageState) {
    this.passageState = passageState;
  }

  public OpenbaseConnectionData passageStateLast(OpenbasePassageState passageStateLast) {
    this.passageStateLast = passageStateLast;
    return this;
  }

  /**
   * Get passageStateLast
   * @return passageStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePassageState getPassageStateLast() {
    return passageStateLast;
  }

  public void setPassageStateLast(OpenbasePassageState passageStateLast) {
    this.passageStateLast = passageStateLast;
  }

  public OpenbaseConnectionData transactionId(Long transactionId) {
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

  public OpenbaseConnectionData windowState(OpenbaseWindowState windowState) {
    this.windowState = windowState;
    return this;
  }

  /**
   * Get windowState
   * @return windowState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseWindowState getWindowState() {
    return windowState;
  }

  public void setWindowState(OpenbaseWindowState windowState) {
    this.windowState = windowState;
  }

  public OpenbaseConnectionData windowStateLast(OpenbaseWindowState windowStateLast) {
    this.windowStateLast = windowStateLast;
    return this;
  }

  /**
   * Get windowStateLast
   * @return windowStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseWindowState getWindowStateLast() {
    return windowStateLast;
  }

  public void setWindowStateLast(OpenbaseWindowState windowStateLast) {
    this.windowStateLast = windowStateLast;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseConnectionData openbaseConnectionData = (OpenbaseConnectionData) o;
    return Objects.equals(this.action, openbaseConnectionData.action) &&
        Objects.equals(this.alias, openbaseConnectionData.alias) &&
        Objects.equals(this.doorState, openbaseConnectionData.doorState) &&
        Objects.equals(this.doorStateLast, openbaseConnectionData.doorStateLast) &&
        Objects.equals(this.id, openbaseConnectionData.id) &&
        Objects.equals(this.passageState, openbaseConnectionData.passageState) &&
        Objects.equals(this.passageStateLast, openbaseConnectionData.passageStateLast) &&
        Objects.equals(this.transactionId, openbaseConnectionData.transactionId) &&
        Objects.equals(this.windowState, openbaseConnectionData.windowState) &&
        Objects.equals(this.windowStateLast, openbaseConnectionData.windowStateLast);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, alias, doorState, doorStateLast, id, passageState, passageStateLast, transactionId, windowState, windowStateLast);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseConnectionData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    doorState: ").append(toIndentedString(doorState)).append("\n");
    sb.append("    doorStateLast: ").append(toIndentedString(doorStateLast)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    passageState: ").append(toIndentedString(passageState)).append("\n");
    sb.append("    passageStateLast: ").append(toIndentedString(passageStateLast)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    windowState: ").append(toIndentedString(windowState)).append("\n");
    sb.append("    windowStateLast: ").append(toIndentedString(windowStateLast)).append("\n");
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

