package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseActivityConfigMapFieldEntry;
import org.openapitools.model.OpenbaseLabel;
import org.openapitools.model.OpenbaseMetaConfig;
import org.openapitools.model.OpenbaseMultiLanguageText;
import org.openapitools.model.OpenbaseServiceStateDescription;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseActivityConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseActivityConfig   {
  @JsonProperty("activity_template_id")
  private String activityTemplateId;

  @JsonProperty("description")
  private OpenbaseMultiLanguageText description = null;

  @JsonProperty("id")
  private String id;

  @JsonProperty("individual_service_state_description")
  @Valid
  private List<OpenbaseActivityConfigMapFieldEntry> individualServiceStateDescription = null;

  @JsonProperty("label")
  private OpenbaseLabel label = null;

  @JsonProperty("meta_config")
  private OpenbaseMetaConfig metaConfig = null;

  @JsonProperty("service_state_description")
  @Valid
  private List<OpenbaseServiceStateDescription> serviceStateDescription = null;

  public OpenbaseActivityConfig activityTemplateId(String activityTemplateId) {
    this.activityTemplateId = activityTemplateId;
    return this;
  }

  /**
   * Get activityTemplateId
   * @return activityTemplateId
  */
  @ApiModelProperty(value = "")


  public String getActivityTemplateId() {
    return activityTemplateId;
  }

  public void setActivityTemplateId(String activityTemplateId) {
    this.activityTemplateId = activityTemplateId;
  }

  public OpenbaseActivityConfig description(OpenbaseMultiLanguageText description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseMultiLanguageText getDescription() {
    return description;
  }

  public void setDescription(OpenbaseMultiLanguageText description) {
    this.description = description;
  }

  public OpenbaseActivityConfig id(String id) {
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

  public OpenbaseActivityConfig individualServiceStateDescription(List<OpenbaseActivityConfigMapFieldEntry> individualServiceStateDescription) {
    this.individualServiceStateDescription = individualServiceStateDescription;
    return this;
  }

  public OpenbaseActivityConfig addIndividualServiceStateDescriptionItem(OpenbaseActivityConfigMapFieldEntry individualServiceStateDescriptionItem) {
    if (this.individualServiceStateDescription == null) {
      this.individualServiceStateDescription = new ArrayList<>();
    }
    this.individualServiceStateDescription.add(individualServiceStateDescriptionItem);
    return this;
  }

  /**
   * Get individualServiceStateDescription
   * @return individualServiceStateDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseActivityConfigMapFieldEntry> getIndividualServiceStateDescription() {
    return individualServiceStateDescription;
  }

  public void setIndividualServiceStateDescription(List<OpenbaseActivityConfigMapFieldEntry> individualServiceStateDescription) {
    this.individualServiceStateDescription = individualServiceStateDescription;
  }

  public OpenbaseActivityConfig label(OpenbaseLabel label) {
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

  public OpenbaseActivityConfig metaConfig(OpenbaseMetaConfig metaConfig) {
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

  public OpenbaseActivityConfig serviceStateDescription(List<OpenbaseServiceStateDescription> serviceStateDescription) {
    this.serviceStateDescription = serviceStateDescription;
    return this;
  }

  public OpenbaseActivityConfig addServiceStateDescriptionItem(OpenbaseServiceStateDescription serviceStateDescriptionItem) {
    if (this.serviceStateDescription == null) {
      this.serviceStateDescription = new ArrayList<>();
    }
    this.serviceStateDescription.add(serviceStateDescriptionItem);
    return this;
  }

  /**
   * Get serviceStateDescription
   * @return serviceStateDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseServiceStateDescription> getServiceStateDescription() {
    return serviceStateDescription;
  }

  public void setServiceStateDescription(List<OpenbaseServiceStateDescription> serviceStateDescription) {
    this.serviceStateDescription = serviceStateDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseActivityConfig openbaseActivityConfig = (OpenbaseActivityConfig) o;
    return Objects.equals(this.activityTemplateId, openbaseActivityConfig.activityTemplateId) &&
        Objects.equals(this.description, openbaseActivityConfig.description) &&
        Objects.equals(this.id, openbaseActivityConfig.id) &&
        Objects.equals(this.individualServiceStateDescription, openbaseActivityConfig.individualServiceStateDescription) &&
        Objects.equals(this.label, openbaseActivityConfig.label) &&
        Objects.equals(this.metaConfig, openbaseActivityConfig.metaConfig) &&
        Objects.equals(this.serviceStateDescription, openbaseActivityConfig.serviceStateDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityTemplateId, description, id, individualServiceStateDescription, label, metaConfig, serviceStateDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseActivityConfig {\n");
    
    sb.append("    activityTemplateId: ").append(toIndentedString(activityTemplateId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    individualServiceStateDescription: ").append(toIndentedString(individualServiceStateDescription)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    metaConfig: ").append(toIndentedString(metaConfig)).append("\n");
    sb.append("    serviceStateDescription: ").append(toIndentedString(serviceStateDescription)).append("\n");
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

