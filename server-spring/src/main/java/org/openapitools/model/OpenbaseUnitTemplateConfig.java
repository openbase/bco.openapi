package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseLabel;
import org.openapitools.model.OpenbaseMetaConfig;
import org.openapitools.model.OpenbaseServiceTemplateConfig;
import org.openapitools.model.OpenbaseUnitTemplateUnitType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseUnitTemplateConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

public class OpenbaseUnitTemplateConfig   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("label")
  private OpenbaseLabel label = null;

  @JsonProperty("meta_config")
  private OpenbaseMetaConfig metaConfig = null;

  @JsonProperty("service_template_config")
  @Valid
  private List<OpenbaseServiceTemplateConfig> serviceTemplateConfig = null;

  @JsonProperty("unit_type")
  private OpenbaseUnitTemplateUnitType unitType;

  public OpenbaseUnitTemplateConfig id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OpenbaseUnitTemplateConfig label(OpenbaseLabel label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseLabel getLabel() {
    return label;
  }

  public void setLabel(OpenbaseLabel label) {
    this.label = label;
  }

  public OpenbaseUnitTemplateConfig metaConfig(OpenbaseMetaConfig metaConfig) {
    this.metaConfig = metaConfig;
    return this;
  }

  /**
   * Get metaConfig
   * @return metaConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseMetaConfig getMetaConfig() {
    return metaConfig;
  }

  public void setMetaConfig(OpenbaseMetaConfig metaConfig) {
    this.metaConfig = metaConfig;
  }

  public OpenbaseUnitTemplateConfig serviceTemplateConfig(List<OpenbaseServiceTemplateConfig> serviceTemplateConfig) {
    this.serviceTemplateConfig = serviceTemplateConfig;
    return this;
  }

  public OpenbaseUnitTemplateConfig addServiceTemplateConfigItem(OpenbaseServiceTemplateConfig serviceTemplateConfigItem) {
    if (this.serviceTemplateConfig == null) {
      this.serviceTemplateConfig = new ArrayList<>();
    }
    this.serviceTemplateConfig.add(serviceTemplateConfigItem);
    return this;
  }

  /**
   * Get serviceTemplateConfig
   * @return serviceTemplateConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseServiceTemplateConfig> getServiceTemplateConfig() {
    return serviceTemplateConfig;
  }

  public void setServiceTemplateConfig(List<OpenbaseServiceTemplateConfig> serviceTemplateConfig) {
    this.serviceTemplateConfig = serviceTemplateConfig;
  }

  public OpenbaseUnitTemplateConfig unitType(OpenbaseUnitTemplateUnitType unitType) {
    this.unitType = unitType;
    return this;
  }

  /**
   * Get unitType
   * @return unitType
  */
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
    OpenbaseUnitTemplateConfig openbaseUnitTemplateConfig = (OpenbaseUnitTemplateConfig) o;
    return Objects.equals(this.id, openbaseUnitTemplateConfig.id) &&
        Objects.equals(this.label, openbaseUnitTemplateConfig.label) &&
        Objects.equals(this.metaConfig, openbaseUnitTemplateConfig.metaConfig) &&
        Objects.equals(this.serviceTemplateConfig, openbaseUnitTemplateConfig.serviceTemplateConfig) &&
        Objects.equals(this.unitType, openbaseUnitTemplateConfig.unitType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, metaConfig, serviceTemplateConfig, unitType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseUnitTemplateConfig {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    metaConfig: ").append(toIndentedString(metaConfig)).append("\n");
    sb.append("    serviceTemplateConfig: ").append(toIndentedString(serviceTemplateConfig)).append("\n");
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

