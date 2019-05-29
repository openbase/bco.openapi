package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseActionDescription;
import org.openapitools.model.OpenbaseMotionState;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseMotionDetectorData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-29T22:47:43.327074+02:00[Europe/Berlin]")

public class OpenbaseMotionDetectorData   {
  @JsonProperty("action")
  @Valid
  private List<OpenbaseActionDescription> action = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("id")
  private String id;

  @JsonProperty("motion_state")
  private OpenbaseMotionState motionState = null;

  @JsonProperty("motion_state_last")
  private OpenbaseMotionState motionStateLast = null;

  @JsonProperty("transaction_id")
  private Long transactionId;

  public OpenbaseMotionDetectorData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbaseMotionDetectorData addActionItem(OpenbaseActionDescription actionItem) {
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

  public OpenbaseMotionDetectorData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseMotionDetectorData addAliasItem(String aliasItem) {
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

  public OpenbaseMotionDetectorData id(String id) {
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

  public OpenbaseMotionDetectorData motionState(OpenbaseMotionState motionState) {
    this.motionState = motionState;
    return this;
  }

  /**
   * Get motionState
   * @return motionState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseMotionState getMotionState() {
    return motionState;
  }

  public void setMotionState(OpenbaseMotionState motionState) {
    this.motionState = motionState;
  }

  public OpenbaseMotionDetectorData motionStateLast(OpenbaseMotionState motionStateLast) {
    this.motionStateLast = motionStateLast;
    return this;
  }

  /**
   * Get motionStateLast
   * @return motionStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseMotionState getMotionStateLast() {
    return motionStateLast;
  }

  public void setMotionStateLast(OpenbaseMotionState motionStateLast) {
    this.motionStateLast = motionStateLast;
  }

  public OpenbaseMotionDetectorData transactionId(Long transactionId) {
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
    OpenbaseMotionDetectorData openbaseMotionDetectorData = (OpenbaseMotionDetectorData) o;
    return Objects.equals(this.action, openbaseMotionDetectorData.action) &&
        Objects.equals(this.alias, openbaseMotionDetectorData.alias) &&
        Objects.equals(this.id, openbaseMotionDetectorData.id) &&
        Objects.equals(this.motionState, openbaseMotionDetectorData.motionState) &&
        Objects.equals(this.motionStateLast, openbaseMotionDetectorData.motionStateLast) &&
        Objects.equals(this.transactionId, openbaseMotionDetectorData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, alias, id, motionState, motionStateLast, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseMotionDetectorData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    motionState: ").append(toIndentedString(motionState)).append("\n");
    sb.append("    motionStateLast: ").append(toIndentedString(motionStateLast)).append("\n");
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

