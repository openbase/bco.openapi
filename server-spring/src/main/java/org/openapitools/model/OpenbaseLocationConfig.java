package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseGlobalPositionState;
import org.openapitools.model.OpenbaseLocationConfigLocationType;
import org.openapitools.model.OpenbaseTileConfig;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseLocationConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseLocationConfig   {
  @JsonProperty("child_id")
  @Valid
  private List<String> childId = null;

  @JsonProperty("global_position")
  private OpenbaseGlobalPositionState globalPosition = null;

  @JsonProperty("location_type")
  private OpenbaseLocationConfigLocationType locationType;

  @JsonProperty("root")
  private Boolean root;

  @JsonProperty("tile_config")
  private OpenbaseTileConfig tileConfig = null;

  @JsonProperty("unit_id")
  @Valid
  private List<String> unitId = null;

  public OpenbaseLocationConfig childId(List<String> childId) {
    this.childId = childId;
    return this;
  }

  public OpenbaseLocationConfig addChildIdItem(String childIdItem) {
    if (this.childId == null) {
      this.childId = new ArrayList<>();
    }
    this.childId.add(childIdItem);
    return this;
  }

  /**
   * Get childId
   * @return childId
  */
  @ApiModelProperty(value = "")


  public List<String> getChildId() {
    return childId;
  }

  public void setChildId(List<String> childId) {
    this.childId = childId;
  }

  public OpenbaseLocationConfig globalPosition(OpenbaseGlobalPositionState globalPosition) {
    this.globalPosition = globalPosition;
    return this;
  }

  /**
   * Get globalPosition
   * @return globalPosition
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseGlobalPositionState getGlobalPosition() {
    return globalPosition;
  }

  public void setGlobalPosition(OpenbaseGlobalPositionState globalPosition) {
    this.globalPosition = globalPosition;
  }

  public OpenbaseLocationConfig locationType(OpenbaseLocationConfigLocationType locationType) {
    this.locationType = locationType;
    return this;
  }

  /**
   * Get locationType
   * @return locationType
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseLocationConfigLocationType getLocationType() {
    return locationType;
  }

  public void setLocationType(OpenbaseLocationConfigLocationType locationType) {
    this.locationType = locationType;
  }

  public OpenbaseLocationConfig root(Boolean root) {
    this.root = root;
    return this;
  }

  /**
   * Get root
   * @return root
  */
  @ApiModelProperty(value = "")


  public Boolean getRoot() {
    return root;
  }

  public void setRoot(Boolean root) {
    this.root = root;
  }

  public OpenbaseLocationConfig tileConfig(OpenbaseTileConfig tileConfig) {
    this.tileConfig = tileConfig;
    return this;
  }

  /**
   * Get tileConfig
   * @return tileConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTileConfig getTileConfig() {
    return tileConfig;
  }

  public void setTileConfig(OpenbaseTileConfig tileConfig) {
    this.tileConfig = tileConfig;
  }

  public OpenbaseLocationConfig unitId(List<String> unitId) {
    this.unitId = unitId;
    return this;
  }

  public OpenbaseLocationConfig addUnitIdItem(String unitIdItem) {
    if (this.unitId == null) {
      this.unitId = new ArrayList<>();
    }
    this.unitId.add(unitIdItem);
    return this;
  }

  /**
   * Get unitId
   * @return unitId
  */
  @ApiModelProperty(value = "")


  public List<String> getUnitId() {
    return unitId;
  }

  public void setUnitId(List<String> unitId) {
    this.unitId = unitId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseLocationConfig openbaseLocationConfig = (OpenbaseLocationConfig) o;
    return Objects.equals(this.childId, openbaseLocationConfig.childId) &&
        Objects.equals(this.globalPosition, openbaseLocationConfig.globalPosition) &&
        Objects.equals(this.locationType, openbaseLocationConfig.locationType) &&
        Objects.equals(this.root, openbaseLocationConfig.root) &&
        Objects.equals(this.tileConfig, openbaseLocationConfig.tileConfig) &&
        Objects.equals(this.unitId, openbaseLocationConfig.unitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childId, globalPosition, locationType, root, tileConfig, unitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseLocationConfig {\n");
    
    sb.append("    childId: ").append(toIndentedString(childId)).append("\n");
    sb.append("    globalPosition: ").append(toIndentedString(globalPosition)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    root: ").append(toIndentedString(root)).append("\n");
    sb.append("    tileConfig: ").append(toIndentedString(tileConfig)).append("\n");
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
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

