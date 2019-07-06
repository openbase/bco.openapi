package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseAxisAlignedBoundingBox3DFloat;
import io.swagger.model.OpenbaseFloorCeilingEdgeIndices;
import io.swagger.model.OpenbaseVec3DDouble;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseShape
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseShape   {
  @JsonProperty("bounding_box")
  private OpenbaseAxisAlignedBoundingBox3DFloat boundingBox = null;

  @JsonProperty("ceiling")
  @Valid
  private List<OpenbaseVec3DDouble> ceiling = null;

  @JsonProperty("floor")
  @Valid
  private List<OpenbaseVec3DDouble> floor = null;

  @JsonProperty("floor_ceiling_edge")
  @Valid
  private List<OpenbaseFloorCeilingEdgeIndices> floorCeilingEdge = null;

  public OpenbaseShape boundingBox(OpenbaseAxisAlignedBoundingBox3DFloat boundingBox) {
    this.boundingBox = boundingBox;
    return this;
  }

  /**
   * Get boundingBox
   * @return boundingBox
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseAxisAlignedBoundingBox3DFloat getBoundingBox() {
    return boundingBox;
  }

  public void setBoundingBox(OpenbaseAxisAlignedBoundingBox3DFloat boundingBox) {
    this.boundingBox = boundingBox;
  }

  public OpenbaseShape ceiling(List<OpenbaseVec3DDouble> ceiling) {
    this.ceiling = ceiling;
    return this;
  }

  public OpenbaseShape addCeilingItem(OpenbaseVec3DDouble ceilingItem) {
    if (this.ceiling == null) {
      this.ceiling = new ArrayList<OpenbaseVec3DDouble>();
    }
    this.ceiling.add(ceilingItem);
    return this;
  }

  /**
   * Get ceiling
   * @return ceiling
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbaseVec3DDouble> getCeiling() {
    return ceiling;
  }

  public void setCeiling(List<OpenbaseVec3DDouble> ceiling) {
    this.ceiling = ceiling;
  }

  public OpenbaseShape floor(List<OpenbaseVec3DDouble> floor) {
    this.floor = floor;
    return this;
  }

  public OpenbaseShape addFloorItem(OpenbaseVec3DDouble floorItem) {
    if (this.floor == null) {
      this.floor = new ArrayList<OpenbaseVec3DDouble>();
    }
    this.floor.add(floorItem);
    return this;
  }

  /**
   * Get floor
   * @return floor
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbaseVec3DDouble> getFloor() {
    return floor;
  }

  public void setFloor(List<OpenbaseVec3DDouble> floor) {
    this.floor = floor;
  }

  public OpenbaseShape floorCeilingEdge(List<OpenbaseFloorCeilingEdgeIndices> floorCeilingEdge) {
    this.floorCeilingEdge = floorCeilingEdge;
    return this;
  }

  public OpenbaseShape addFloorCeilingEdgeItem(OpenbaseFloorCeilingEdgeIndices floorCeilingEdgeItem) {
    if (this.floorCeilingEdge == null) {
      this.floorCeilingEdge = new ArrayList<OpenbaseFloorCeilingEdgeIndices>();
    }
    this.floorCeilingEdge.add(floorCeilingEdgeItem);
    return this;
  }

  /**
   * Get floorCeilingEdge
   * @return floorCeilingEdge
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbaseFloorCeilingEdgeIndices> getFloorCeilingEdge() {
    return floorCeilingEdge;
  }

  public void setFloorCeilingEdge(List<OpenbaseFloorCeilingEdgeIndices> floorCeilingEdge) {
    this.floorCeilingEdge = floorCeilingEdge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseShape openbaseShape = (OpenbaseShape) o;
    return Objects.equals(this.boundingBox, openbaseShape.boundingBox) &&
        Objects.equals(this.ceiling, openbaseShape.ceiling) &&
        Objects.equals(this.floor, openbaseShape.floor) &&
        Objects.equals(this.floorCeilingEdge, openbaseShape.floorCeilingEdge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boundingBox, ceiling, floor, floorCeilingEdge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseShape {\n");
    
    sb.append("    boundingBox: ").append(toIndentedString(boundingBox)).append("\n");
    sb.append("    ceiling: ").append(toIndentedString(ceiling)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
    sb.append("    floorCeilingEdge: ").append(toIndentedString(floorCeilingEdge)).append("\n");
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
