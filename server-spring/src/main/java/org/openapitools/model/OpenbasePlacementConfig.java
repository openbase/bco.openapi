package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbasePose;
import org.openapitools.model.OpenbaseShape;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbasePlacementConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbasePlacementConfig   {
  @JsonProperty("location_id")
  private String locationId;

  @JsonProperty("pose")
  private OpenbasePose pose = null;

  @JsonProperty("shape")
  private OpenbaseShape shape = null;

  @JsonProperty("transformation_frame_id")
  private String transformationFrameId;

  public OpenbasePlacementConfig locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   * @return locationId
  */
  @ApiModelProperty(value = "")


  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public OpenbasePlacementConfig pose(OpenbasePose pose) {
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

  public OpenbasePlacementConfig shape(OpenbaseShape shape) {
    this.shape = shape;
    return this;
  }

  /**
   * Get shape
   * @return shape
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseShape getShape() {
    return shape;
  }

  public void setShape(OpenbaseShape shape) {
    this.shape = shape;
  }

  public OpenbasePlacementConfig transformationFrameId(String transformationFrameId) {
    this.transformationFrameId = transformationFrameId;
    return this;
  }

  /**
   * Get transformationFrameId
   * @return transformationFrameId
  */
  @ApiModelProperty(value = "")


  public String getTransformationFrameId() {
    return transformationFrameId;
  }

  public void setTransformationFrameId(String transformationFrameId) {
    this.transformationFrameId = transformationFrameId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbasePlacementConfig openbasePlacementConfig = (OpenbasePlacementConfig) o;
    return Objects.equals(this.locationId, openbasePlacementConfig.locationId) &&
        Objects.equals(this.pose, openbasePlacementConfig.pose) &&
        Objects.equals(this.shape, openbasePlacementConfig.shape) &&
        Objects.equals(this.transformationFrameId, openbasePlacementConfig.transformationFrameId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, pose, shape, transformationFrameId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbasePlacementConfig {\n");
    
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    pose: ").append(toIndentedString(pose)).append("\n");
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
    sb.append("    transformationFrameId: ").append(toIndentedString(transformationFrameId)).append("\n");
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

