package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseFloorModuleStateFloorSegmentState
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseFloorModuleStateFloorSegmentState   {
  @JsonProperty("activation_segment")
  private Boolean activationSegment;

  @JsonProperty("capacity_segment")
  private Integer capacitySegment;

  public OpenbaseFloorModuleStateFloorSegmentState activationSegment(Boolean activationSegment) {
    this.activationSegment = activationSegment;
    return this;
  }

  /**
   * Get activationSegment
   * @return activationSegment
  */
  @ApiModelProperty(value = "")


  public Boolean getActivationSegment() {
    return activationSegment;
  }

  public void setActivationSegment(Boolean activationSegment) {
    this.activationSegment = activationSegment;
  }

  public OpenbaseFloorModuleStateFloorSegmentState capacitySegment(Integer capacitySegment) {
    this.capacitySegment = capacitySegment;
    return this;
  }

  /**
   * Get capacitySegment
   * @return capacitySegment
  */
  @ApiModelProperty(value = "")


  public Integer getCapacitySegment() {
    return capacitySegment;
  }

  public void setCapacitySegment(Integer capacitySegment) {
    this.capacitySegment = capacitySegment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseFloorModuleStateFloorSegmentState openbaseFloorModuleStateFloorSegmentState = (OpenbaseFloorModuleStateFloorSegmentState) o;
    return Objects.equals(this.activationSegment, openbaseFloorModuleStateFloorSegmentState.activationSegment) &&
        Objects.equals(this.capacitySegment, openbaseFloorModuleStateFloorSegmentState.capacitySegment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationSegment, capacitySegment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseFloorModuleStateFloorSegmentState {\n");
    
    sb.append("    activationSegment: ").append(toIndentedString(activationSegment)).append("\n");
    sb.append("    capacitySegment: ").append(toIndentedString(capacitySegment)).append("\n");
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

