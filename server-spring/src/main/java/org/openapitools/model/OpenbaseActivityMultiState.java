package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseActionDescription;
import org.openapitools.model.OpenbaseTimestamp;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseActivityMultiState
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseActivityMultiState   {
  @JsonProperty("activity_id")
  @Valid
  private List<String> activityId = null;

  @JsonProperty("responsible_action")
  private OpenbaseActionDescription responsibleAction = null;

  @JsonProperty("state_transaction_reference")
  private Long stateTransactionReference;

  @JsonProperty("timestamp")
  private OpenbaseTimestamp timestamp = null;

  public OpenbaseActivityMultiState activityId(List<String> activityId) {
    this.activityId = activityId;
    return this;
  }

  public OpenbaseActivityMultiState addActivityIdItem(String activityIdItem) {
    if (this.activityId == null) {
      this.activityId = new ArrayList<>();
    }
    this.activityId.add(activityIdItem);
    return this;
  }

  /**
   * Get activityId
   * @return activityId
  */
  @ApiModelProperty(value = "")


  public List<String> getActivityId() {
    return activityId;
  }

  public void setActivityId(List<String> activityId) {
    this.activityId = activityId;
  }

  public OpenbaseActivityMultiState responsibleAction(OpenbaseActionDescription responsibleAction) {
    this.responsibleAction = responsibleAction;
    return this;
  }

  /**
   * Get responsibleAction
   * @return responsibleAction
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseActionDescription getResponsibleAction() {
    return responsibleAction;
  }

  public void setResponsibleAction(OpenbaseActionDescription responsibleAction) {
    this.responsibleAction = responsibleAction;
  }

  public OpenbaseActivityMultiState stateTransactionReference(Long stateTransactionReference) {
    this.stateTransactionReference = stateTransactionReference;
    return this;
  }

  /**
   * Get stateTransactionReference
   * @return stateTransactionReference
  */
  @ApiModelProperty(value = "")


  public Long getStateTransactionReference() {
    return stateTransactionReference;
  }

  public void setStateTransactionReference(Long stateTransactionReference) {
    this.stateTransactionReference = stateTransactionReference;
  }

  public OpenbaseActivityMultiState timestamp(OpenbaseTimestamp timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTimestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OpenbaseTimestamp timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseActivityMultiState openbaseActivityMultiState = (OpenbaseActivityMultiState) o;
    return Objects.equals(this.activityId, openbaseActivityMultiState.activityId) &&
        Objects.equals(this.responsibleAction, openbaseActivityMultiState.responsibleAction) &&
        Objects.equals(this.stateTransactionReference, openbaseActivityMultiState.stateTransactionReference) &&
        Objects.equals(this.timestamp, openbaseActivityMultiState.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, responsibleAction, stateTransactionReference, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseActivityMultiState {\n");
    
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    responsibleAction: ").append(toIndentedString(responsibleAction)).append("\n");
    sb.append("    stateTransactionReference: ").append(toIndentedString(stateTransactionReference)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

