package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseActionDescription;
import org.openapitools.model.OpenbasePose;
import org.openapitools.model.OpenbaseTimestamp;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseLocalPositionState
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbaseLocalPositionState   {
  @JsonProperty("location_id")
  @Valid
  private List<String> locationId = null;

  @JsonProperty("pose")
  private OpenbasePose pose = null;

  @JsonProperty("responsible_action")
  private OpenbaseActionDescription responsibleAction = null;

  @JsonProperty("timestamp")
  private OpenbaseTimestamp timestamp = null;

  public OpenbaseLocalPositionState locationId(List<String> locationId) {
    this.locationId = locationId;
    return this;
  }

  public OpenbaseLocalPositionState addLocationIdItem(String locationIdItem) {
    if (this.locationId == null) {
      this.locationId = new ArrayList<>();
    }
    this.locationId.add(locationIdItem);
    return this;
  }

  /**
   * Get locationId
   * @return locationId
  */
  @ApiModelProperty(value = "")


  public List<String> getLocationId() {
    return locationId;
  }

  public void setLocationId(List<String> locationId) {
    this.locationId = locationId;
  }

  public OpenbaseLocalPositionState pose(OpenbasePose pose) {
    this.pose = pose;
    return this;
  }

  /**
   * Get pose
   * @return pose
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePose getPose() {
    return pose;
  }

  public void setPose(OpenbasePose pose) {
    this.pose = pose;
  }

  public OpenbaseLocalPositionState responsibleAction(OpenbaseActionDescription responsibleAction) {
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

  public OpenbaseLocalPositionState timestamp(OpenbaseTimestamp timestamp) {
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
    OpenbaseLocalPositionState openbaseLocalPositionState = (OpenbaseLocalPositionState) o;
    return Objects.equals(this.locationId, openbaseLocalPositionState.locationId) &&
        Objects.equals(this.pose, openbaseLocalPositionState.pose) &&
        Objects.equals(this.responsibleAction, openbaseLocalPositionState.responsibleAction) &&
        Objects.equals(this.timestamp, openbaseLocalPositionState.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, pose, responsibleAction, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseLocalPositionState {\n");
    
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    pose: ").append(toIndentedString(pose)).append("\n");
    sb.append("    responsibleAction: ").append(toIndentedString(responsibleAction)).append("\n");
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

