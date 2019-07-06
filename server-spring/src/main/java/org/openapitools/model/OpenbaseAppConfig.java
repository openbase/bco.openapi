package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseAppConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbaseAppConfig   {
  @JsonProperty("app_class_id")
  private String appClassId;

  @JsonProperty("autostart")
  private Boolean autostart;

  @JsonProperty("unit_id")
  @Valid
  private List<String> unitId = null;

  public OpenbaseAppConfig appClassId(String appClassId) {
    this.appClassId = appClassId;
    return this;
  }

  /**
   * Get appClassId
   * @return appClassId
  */
  @ApiModelProperty(value = "")


  public String getAppClassId() {
    return appClassId;
  }

  public void setAppClassId(String appClassId) {
    this.appClassId = appClassId;
  }

  public OpenbaseAppConfig autostart(Boolean autostart) {
    this.autostart = autostart;
    return this;
  }

  /**
   * Get autostart
   * @return autostart
  */
  @ApiModelProperty(value = "")


  public Boolean getAutostart() {
    return autostart;
  }

  public void setAutostart(Boolean autostart) {
    this.autostart = autostart;
  }

  public OpenbaseAppConfig unitId(List<String> unitId) {
    this.unitId = unitId;
    return this;
  }

  public OpenbaseAppConfig addUnitIdItem(String unitIdItem) {
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
    OpenbaseAppConfig openbaseAppConfig = (OpenbaseAppConfig) o;
    return Objects.equals(this.appClassId, openbaseAppConfig.appClassId) &&
        Objects.equals(this.autostart, openbaseAppConfig.autostart) &&
        Objects.equals(this.unitId, openbaseAppConfig.unitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appClassId, autostart, unitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseAppConfig {\n");
    
    sb.append("    appClassId: ").append(toIndentedString(appClassId)).append("\n");
    sb.append("    autostart: ").append(toIndentedString(autostart)).append("\n");
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

