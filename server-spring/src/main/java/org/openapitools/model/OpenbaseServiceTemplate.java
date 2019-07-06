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
import org.openapitools.model.OpenbaseServiceCommunicationTypeCommunicationType;
import org.openapitools.model.OpenbaseServiceTemplateServiceType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseServiceTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

public class OpenbaseServiceTemplate   {
  @JsonProperty("communication_type")
  private OpenbaseServiceCommunicationTypeCommunicationType communicationType;

  @JsonProperty("id")
  private String id;

  @JsonProperty("label")
  private OpenbaseLabel label = null;

  @JsonProperty("meta_config")
  private OpenbaseMetaConfig metaConfig = null;

  @JsonProperty("service_type")
  private OpenbaseServiceTemplateServiceType serviceType;

  @JsonProperty("super_type")
  @Valid
  private List<OpenbaseServiceTemplateServiceType> superType = null;

  public OpenbaseServiceTemplate communicationType(OpenbaseServiceCommunicationTypeCommunicationType communicationType) {
    this.communicationType = communicationType;
    return this;
  }

  /**
   * Get communicationType
   * @return communicationType
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseServiceCommunicationTypeCommunicationType getCommunicationType() {
    return communicationType;
  }

  public void setCommunicationType(OpenbaseServiceCommunicationTypeCommunicationType communicationType) {
    this.communicationType = communicationType;
  }

  public OpenbaseServiceTemplate id(String id) {
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

  public OpenbaseServiceTemplate label(OpenbaseLabel label) {
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

  public OpenbaseServiceTemplate metaConfig(OpenbaseMetaConfig metaConfig) {
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

  public OpenbaseServiceTemplate serviceType(OpenbaseServiceTemplateServiceType serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Get serviceType
   * @return serviceType
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseServiceTemplateServiceType getServiceType() {
    return serviceType;
  }

  public void setServiceType(OpenbaseServiceTemplateServiceType serviceType) {
    this.serviceType = serviceType;
  }

  public OpenbaseServiceTemplate superType(List<OpenbaseServiceTemplateServiceType> superType) {
    this.superType = superType;
    return this;
  }

  public OpenbaseServiceTemplate addSuperTypeItem(OpenbaseServiceTemplateServiceType superTypeItem) {
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

  public List<OpenbaseServiceTemplateServiceType> getSuperType() {
    return superType;
  }

  public void setSuperType(List<OpenbaseServiceTemplateServiceType> superType) {
    this.superType = superType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseServiceTemplate openbaseServiceTemplate = (OpenbaseServiceTemplate) o;
    return Objects.equals(this.communicationType, openbaseServiceTemplate.communicationType) &&
        Objects.equals(this.id, openbaseServiceTemplate.id) &&
        Objects.equals(this.label, openbaseServiceTemplate.label) &&
        Objects.equals(this.metaConfig, openbaseServiceTemplate.metaConfig) &&
        Objects.equals(this.serviceType, openbaseServiceTemplate.serviceType) &&
        Objects.equals(this.superType, openbaseServiceTemplate.superType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(communicationType, id, label, metaConfig, serviceType, superType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseServiceTemplate {\n");
    
    sb.append("    communicationType: ").append(toIndentedString(communicationType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    metaConfig: ").append(toIndentedString(metaConfig)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    superType: ").append(toIndentedString(superType)).append("\n");
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

