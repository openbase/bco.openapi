package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseActionEmphasisCategory;
import io.swagger.model.OpenbaseActionPriorityPriority;
import io.swagger.model.OpenbaseBindingConfig;
import io.swagger.model.OpenbaseLabel;
import io.swagger.model.OpenbaseMetaConfig;
import io.swagger.model.OpenbaseMultiLanguageText;
import io.swagger.model.OpenbaseUnitTemplateConfig;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseAppClass
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseAppClass   {
  @JsonProperty("binding_config")
  private OpenbaseBindingConfig bindingConfig = null;

  @JsonProperty("category")
  @Valid
  private List<OpenbaseActionEmphasisCategory> category = null;

  @JsonProperty("description")
  private OpenbaseMultiLanguageText description = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("label")
  private OpenbaseLabel label = null;

  @JsonProperty("meta_config")
  private OpenbaseMetaConfig metaConfig = null;

  @JsonProperty("priority")
  private OpenbaseActionPriorityPriority priority = null;

  @JsonProperty("unit_template_config")
  @Valid
  private List<OpenbaseUnitTemplateConfig> unitTemplateConfig = null;

  public OpenbaseAppClass bindingConfig(OpenbaseBindingConfig bindingConfig) {
    this.bindingConfig = bindingConfig;
    return this;
  }

  /**
   * Get bindingConfig
   * @return bindingConfig
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseBindingConfig getBindingConfig() {
    return bindingConfig;
  }

  public void setBindingConfig(OpenbaseBindingConfig bindingConfig) {
    this.bindingConfig = bindingConfig;
  }

  public OpenbaseAppClass category(List<OpenbaseActionEmphasisCategory> category) {
    this.category = category;
    return this;
  }

  public OpenbaseAppClass addCategoryItem(OpenbaseActionEmphasisCategory categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<OpenbaseActionEmphasisCategory>();
    }
    this.category.add(categoryItem);
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbaseActionEmphasisCategory> getCategory() {
    return category;
  }

  public void setCategory(List<OpenbaseActionEmphasisCategory> category) {
    this.category = category;
  }

  public OpenbaseAppClass description(OpenbaseMultiLanguageText description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseMultiLanguageText getDescription() {
    return description;
  }

  public void setDescription(OpenbaseMultiLanguageText description) {
    this.description = description;
  }

  public OpenbaseAppClass id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OpenbaseAppClass label(OpenbaseLabel label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseLabel getLabel() {
    return label;
  }

  public void setLabel(OpenbaseLabel label) {
    this.label = label;
  }

  public OpenbaseAppClass metaConfig(OpenbaseMetaConfig metaConfig) {
    this.metaConfig = metaConfig;
    return this;
  }

  /**
   * Get metaConfig
   * @return metaConfig
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseMetaConfig getMetaConfig() {
    return metaConfig;
  }

  public void setMetaConfig(OpenbaseMetaConfig metaConfig) {
    this.metaConfig = metaConfig;
  }

  public OpenbaseAppClass priority(OpenbaseActionPriorityPriority priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseActionPriorityPriority getPriority() {
    return priority;
  }

  public void setPriority(OpenbaseActionPriorityPriority priority) {
    this.priority = priority;
  }

  public OpenbaseAppClass unitTemplateConfig(List<OpenbaseUnitTemplateConfig> unitTemplateConfig) {
    this.unitTemplateConfig = unitTemplateConfig;
    return this;
  }

  public OpenbaseAppClass addUnitTemplateConfigItem(OpenbaseUnitTemplateConfig unitTemplateConfigItem) {
    if (this.unitTemplateConfig == null) {
      this.unitTemplateConfig = new ArrayList<OpenbaseUnitTemplateConfig>();
    }
    this.unitTemplateConfig.add(unitTemplateConfigItem);
    return this;
  }

  /**
   * Get unitTemplateConfig
   * @return unitTemplateConfig
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbaseUnitTemplateConfig> getUnitTemplateConfig() {
    return unitTemplateConfig;
  }

  public void setUnitTemplateConfig(List<OpenbaseUnitTemplateConfig> unitTemplateConfig) {
    this.unitTemplateConfig = unitTemplateConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseAppClass openbaseAppClass = (OpenbaseAppClass) o;
    return Objects.equals(this.bindingConfig, openbaseAppClass.bindingConfig) &&
        Objects.equals(this.category, openbaseAppClass.category) &&
        Objects.equals(this.description, openbaseAppClass.description) &&
        Objects.equals(this.id, openbaseAppClass.id) &&
        Objects.equals(this.label, openbaseAppClass.label) &&
        Objects.equals(this.metaConfig, openbaseAppClass.metaConfig) &&
        Objects.equals(this.priority, openbaseAppClass.priority) &&
        Objects.equals(this.unitTemplateConfig, openbaseAppClass.unitTemplateConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindingConfig, category, description, id, label, metaConfig, priority, unitTemplateConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseAppClass {\n");
    
    sb.append("    bindingConfig: ").append(toIndentedString(bindingConfig)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    metaConfig: ").append(toIndentedString(metaConfig)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    unitTemplateConfig: ").append(toIndentedString(unitTemplateConfig)).append("\n");
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
