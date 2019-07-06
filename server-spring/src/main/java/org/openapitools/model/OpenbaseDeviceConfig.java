package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseInventoryState;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseDeviceConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbaseDeviceConfig   {
  @JsonProperty("device_class_id")
  private String deviceClassId;

  @JsonProperty("inventory_state")
  private OpenbaseInventoryState inventoryState = null;

  @JsonProperty("serial_number")
  private String serialNumber;

  @JsonProperty("unit_id")
  @Valid
  private List<String> unitId = null;

  public OpenbaseDeviceConfig deviceClassId(String deviceClassId) {
    this.deviceClassId = deviceClassId;
    return this;
  }

  /**
   * Get deviceClassId
   * @return deviceClassId
  */
  @ApiModelProperty(value = "")


  public String getDeviceClassId() {
    return deviceClassId;
  }

  public void setDeviceClassId(String deviceClassId) {
    this.deviceClassId = deviceClassId;
  }

  public OpenbaseDeviceConfig inventoryState(OpenbaseInventoryState inventoryState) {
    this.inventoryState = inventoryState;
    return this;
  }

  /**
   * Get inventoryState
   * @return inventoryState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseInventoryState getInventoryState() {
    return inventoryState;
  }

  public void setInventoryState(OpenbaseInventoryState inventoryState) {
    this.inventoryState = inventoryState;
  }

  public OpenbaseDeviceConfig serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Get serialNumber
   * @return serialNumber
  */
  @ApiModelProperty(value = "")


  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public OpenbaseDeviceConfig unitId(List<String> unitId) {
    this.unitId = unitId;
    return this;
  }

  public OpenbaseDeviceConfig addUnitIdItem(String unitIdItem) {
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
    OpenbaseDeviceConfig openbaseDeviceConfig = (OpenbaseDeviceConfig) o;
    return Objects.equals(this.deviceClassId, openbaseDeviceConfig.deviceClassId) &&
        Objects.equals(this.inventoryState, openbaseDeviceConfig.inventoryState) &&
        Objects.equals(this.serialNumber, openbaseDeviceConfig.serialNumber) &&
        Objects.equals(this.unitId, openbaseDeviceConfig.unitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceClassId, inventoryState, serialNumber, unitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseDeviceConfig {\n");
    
    sb.append("    deviceClassId: ").append(toIndentedString(deviceClassId)).append("\n");
    sb.append("    inventoryState: ").append(toIndentedString(inventoryState)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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

