package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseServiceTemplateServiceType;
import io.swagger.model.OpenbaseUnitTemplateUnitType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseServiceStateDescription
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseServiceStateDescription   {
  @JsonProperty("service_state")
  private String serviceState = null;

  @JsonProperty("service_state_class_name")
  private String serviceStateClassName = null;

  @JsonProperty("service_type")
  private OpenbaseServiceTemplateServiceType serviceType = null;

  @JsonProperty("unit_id")
  private String unitId = null;

  @JsonProperty("unit_type")
  private OpenbaseUnitTemplateUnitType unitType = null;

  public OpenbaseServiceStateDescription serviceState(String serviceState) {
    this.serviceState = serviceState;
    return this;
  }

  /**
   * Get serviceState
   * @return serviceState
  **/
  @ApiModelProperty(value = "")

  public String getServiceState() {
    return serviceState;
  }

  public void setServiceState(String serviceState) {
    this.serviceState = serviceState;
  }

  public OpenbaseServiceStateDescription serviceStateClassName(String serviceStateClassName) {
    this.serviceStateClassName = serviceStateClassName;
    return this;
  }

  /**
   * Get serviceStateClassName
   * @return serviceStateClassName
  **/
  @ApiModelProperty(value = "")

  public String getServiceStateClassName() {
    return serviceStateClassName;
  }

  public void setServiceStateClassName(String serviceStateClassName) {
    this.serviceStateClassName = serviceStateClassName;
  }

  public OpenbaseServiceStateDescription serviceType(OpenbaseServiceTemplateServiceType serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Get serviceType
   * @return serviceType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseServiceTemplateServiceType getServiceType() {
    return serviceType;
  }

  public void setServiceType(OpenbaseServiceTemplateServiceType serviceType) {
    this.serviceType = serviceType;
  }

  public OpenbaseServiceStateDescription unitId(String unitId) {
    this.unitId = unitId;
    return this;
  }

  /**
   * Get unitId
   * @return unitId
  **/
  @ApiModelProperty(value = "")

  public String getUnitId() {
    return unitId;
  }

  public void setUnitId(String unitId) {
    this.unitId = unitId;
  }

  public OpenbaseServiceStateDescription unitType(OpenbaseUnitTemplateUnitType unitType) {
    this.unitType = unitType;
    return this;
  }

  /**
   * Get unitType
   * @return unitType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseUnitTemplateUnitType getUnitType() {
    return unitType;
  }

  public void setUnitType(OpenbaseUnitTemplateUnitType unitType) {
    this.unitType = unitType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseServiceStateDescription openbaseServiceStateDescription = (OpenbaseServiceStateDescription) o;
    return Objects.equals(this.serviceState, openbaseServiceStateDescription.serviceState) &&
        Objects.equals(this.serviceStateClassName, openbaseServiceStateDescription.serviceStateClassName) &&
        Objects.equals(this.serviceType, openbaseServiceStateDescription.serviceType) &&
        Objects.equals(this.unitId, openbaseServiceStateDescription.unitId) &&
        Objects.equals(this.unitType, openbaseServiceStateDescription.unitType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceState, serviceStateClassName, serviceType, unitId, unitType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseServiceStateDescription {\n");
    
    sb.append("    serviceState: ").append(toIndentedString(serviceState)).append("\n");
    sb.append("    serviceStateClassName: ").append(toIndentedString(serviceStateClassName)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
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
