package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseConnectionConfigConnectionType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseConnectionConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

public class OpenbaseConnectionConfig   {
  @JsonProperty("connection_type")
  private OpenbaseConnectionConfigConnectionType connectionType;

  @JsonProperty("tile_id")
  @Valid
  private List<String> tileId = null;

  @JsonProperty("unit_id")
  @Valid
  private List<String> unitId = null;

  public OpenbaseConnectionConfig connectionType(OpenbaseConnectionConfigConnectionType connectionType) {
    this.connectionType = connectionType;
    return this;
  }

  /**
   * Get connectionType
   * @return connectionType
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseConnectionConfigConnectionType getConnectionType() {
    return connectionType;
  }

  public void setConnectionType(OpenbaseConnectionConfigConnectionType connectionType) {
    this.connectionType = connectionType;
  }

  public OpenbaseConnectionConfig tileId(List<String> tileId) {
    this.tileId = tileId;
    return this;
  }

  public OpenbaseConnectionConfig addTileIdItem(String tileIdItem) {
    if (this.tileId == null) {
      this.tileId = new ArrayList<>();
    }
    this.tileId.add(tileIdItem);
    return this;
  }

  /**
   * Get tileId
   * @return tileId
  */
  @ApiModelProperty(value = "")


  public List<String> getTileId() {
    return tileId;
  }

  public void setTileId(List<String> tileId) {
    this.tileId = tileId;
  }

  public OpenbaseConnectionConfig unitId(List<String> unitId) {
    this.unitId = unitId;
    return this;
  }

  public OpenbaseConnectionConfig addUnitIdItem(String unitIdItem) {
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
    OpenbaseConnectionConfig openbaseConnectionConfig = (OpenbaseConnectionConfig) o;
    return Objects.equals(this.connectionType, openbaseConnectionConfig.connectionType) &&
        Objects.equals(this.tileId, openbaseConnectionConfig.tileId) &&
        Objects.equals(this.unitId, openbaseConnectionConfig.unitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionType, tileId, unitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseConnectionConfig {\n");
    
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("    tileId: ").append(toIndentedString(tileId)).append("\n");
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

