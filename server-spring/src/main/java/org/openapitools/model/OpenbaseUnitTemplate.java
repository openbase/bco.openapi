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
import org.openapitools.model.OpenbaseServiceDescription;
import org.openapitools.model.OpenbaseUnitTemplateUnitType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseUnitTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbaseUnitTemplate   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("label")
  private OpenbaseLabel label = null;

  @JsonProperty("meta_config")
  private OpenbaseMetaConfig metaConfig = null;

  @JsonProperty("service_description")
  @Valid
  private List<OpenbaseServiceDescription> serviceDescription = null;

  @JsonProperty("super_type")
  @Valid
  private List<OpenbaseUnitTemplateUnitType> superType = null;

  @JsonProperty("unit_type")
  private OpenbaseUnitTemplateUnitType unitType;

  public OpenbaseUnitTemplate id(String id) {
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

  public OpenbaseUnitTemplate label(OpenbaseLabel label) {
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

  public OpenbaseUnitTemplate metaConfig(OpenbaseMetaConfig metaConfig) {
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

  public OpenbaseUnitTemplate serviceDescription(List<OpenbaseServiceDescription> serviceDescription) {
    this.serviceDescription = serviceDescription;
    return this;
  }

  public OpenbaseUnitTemplate addServiceDescriptionItem(OpenbaseServiceDescription serviceDescriptionItem) {
    if (this.serviceDescription == null) {
      this.serviceDescription = new ArrayList<>();
    }
    this.serviceDescription.add(serviceDescriptionItem);
    return this;
  }

  /**
   * Get serviceDescription
   * @return serviceDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseServiceDescription> getServiceDescription() {
    return serviceDescription;
  }

  public void setServiceDescription(List<OpenbaseServiceDescription> serviceDescription) {
    this.serviceDescription = serviceDescription;
  }

  public OpenbaseUnitTemplate superType(List<OpenbaseUnitTemplateUnitType> superType) {
    this.superType = superType;
    return this;
  }

  public OpenbaseUnitTemplate addSuperTypeItem(OpenbaseUnitTemplateUnitType superTypeItem) {
    if (this.superType == null) {
      this.superType = new ArrayList<>();
    }
    this.superType.add(superTypeItem);
    return this;
  }

  /**
   * Get superType
   * @return superType
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseUnitTemplateUnitType> getSuperType() {
    return superType;
  }

  public void setSuperType(List<OpenbaseUnitTemplateUnitType> superType) {
    this.superType = superType;
  }

  public OpenbaseUnitTemplate unitType(OpenbaseUnitTemplateUnitType unitType) {
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
    OpenbaseUnitTemplate openbaseUnitTemplate = (OpenbaseUnitTemplate) o;
    return Objects.equals(this.id, openbaseUnitTemplate.id) &&
        Objects.equals(this.label, openbaseUnitTemplate.label) &&
        Objects.equals(this.metaConfig, openbaseUnitTemplate.metaConfig) &&
        Objects.equals(this.serviceDescription, openbaseUnitTemplate.serviceDescription) &&
        Objects.equals(this.superType, openbaseUnitTemplate.superType) &&
        Objects.equals(this.unitType, openbaseUnitTemplate.unitType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, metaConfig, serviceDescription, superType, unitType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseUnitTemplate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    metaConfig: ").append(toIndentedString(metaConfig)).append("\n");
    sb.append("    serviceDescription: ").append(toIndentedString(serviceDescription)).append("\n");
    sb.append("    superType: ").append(toIndentedString(superType)).append("\n");
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

