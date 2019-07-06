package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseFloorModuleStateFloorSegmentState;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseFloorModuleState
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseFloorModuleState   {
  @JsonProperty("position_col")
  private Integer positionCol = null;

  @JsonProperty("position_row")
  private Integer positionRow = null;

  @JsonProperty("segment")
  @Valid
  private List<OpenbaseFloorModuleStateFloorSegmentState> segment = null;

  public OpenbaseFloorModuleState positionCol(Integer positionCol) {
    this.positionCol = positionCol;
    return this;
  }

  /**
   * Get positionCol
   * @return positionCol
  **/
  @ApiModelProperty(value = "")

  public Integer getPositionCol() {
    return positionCol;
  }

  public void setPositionCol(Integer positionCol) {
    this.positionCol = positionCol;
  }

  public OpenbaseFloorModuleState positionRow(Integer positionRow) {
    this.positionRow = positionRow;
    return this;
  }

  /**
   * Get positionRow
   * @return positionRow
  **/
  @ApiModelProperty(value = "")

  public Integer getPositionRow() {
    return positionRow;
  }

  public void setPositionRow(Integer positionRow) {
    this.positionRow = positionRow;
  }

  public OpenbaseFloorModuleState segment(List<OpenbaseFloorModuleStateFloorSegmentState> segment) {
    this.segment = segment;
    return this;
  }

  public OpenbaseFloorModuleState addSegmentItem(OpenbaseFloorModuleStateFloorSegmentState segmentItem) {
    if (this.segment == null) {
      this.segment = new ArrayList<OpenbaseFloorModuleStateFloorSegmentState>();
    }
    this.segment.add(segmentItem);
    return this;
  }

  /**
   * Get segment
   * @return segment
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbaseFloorModuleStateFloorSegmentState> getSegment() {
    return segment;
  }

  public void setSegment(List<OpenbaseFloorModuleStateFloorSegmentState> segment) {
    this.segment = segment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseFloorModuleState openbaseFloorModuleState = (OpenbaseFloorModuleState) o;
    return Objects.equals(this.positionCol, openbaseFloorModuleState.positionCol) &&
        Objects.equals(this.positionRow, openbaseFloorModuleState.positionRow) &&
        Objects.equals(this.segment, openbaseFloorModuleState.segment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionCol, positionRow, segment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseFloorModuleState {\n");
    
    sb.append("    positionCol: ").append(toIndentedString(positionCol)).append("\n");
    sb.append("    positionRow: ").append(toIndentedString(positionRow)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
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
