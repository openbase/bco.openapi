package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseFloorCeilingEdgeIndices
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseFloorCeilingEdgeIndices   {
  @JsonProperty("ceiling_index")
  private Long ceilingIndex = null;

  @JsonProperty("floor_index")
  private Long floorIndex = null;

  public OpenbaseFloorCeilingEdgeIndices ceilingIndex(Long ceilingIndex) {
    this.ceilingIndex = ceilingIndex;
    return this;
  }

  /**
   * Get ceilingIndex
   * @return ceilingIndex
  **/
  @ApiModelProperty(value = "")

  public Long getCeilingIndex() {
    return ceilingIndex;
  }

  public void setCeilingIndex(Long ceilingIndex) {
    this.ceilingIndex = ceilingIndex;
  }

  public OpenbaseFloorCeilingEdgeIndices floorIndex(Long floorIndex) {
    this.floorIndex = floorIndex;
    return this;
  }

  /**
   * Get floorIndex
   * @return floorIndex
  **/
  @ApiModelProperty(value = "")

  public Long getFloorIndex() {
    return floorIndex;
  }

  public void setFloorIndex(Long floorIndex) {
    this.floorIndex = floorIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseFloorCeilingEdgeIndices openbaseFloorCeilingEdgeIndices = (OpenbaseFloorCeilingEdgeIndices) o;
    return Objects.equals(this.ceilingIndex, openbaseFloorCeilingEdgeIndices.ceilingIndex) &&
        Objects.equals(this.floorIndex, openbaseFloorCeilingEdgeIndices.floorIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ceilingIndex, floorIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseFloorCeilingEdgeIndices {\n");
    
    sb.append("    ceilingIndex: ").append(toIndentedString(ceilingIndex)).append("\n");
    sb.append("    floorIndex: ").append(toIndentedString(floorIndex)).append("\n");
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