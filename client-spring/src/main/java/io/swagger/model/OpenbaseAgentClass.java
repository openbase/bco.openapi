package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseActionEmphasisCategory;
import io.swagger.model.OpenbaseActionPriorityPriority;
import io.swagger.model.OpenbaseLabel;
import io.swagger.model.OpenbaseMetaConfig;
import io.swagger.model.OpenbaseMultiLanguageText;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseAgentClass
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseAgentClass   {
  @JsonProperty("category")
  @Valid
  private List<OpenbaseActionEmphasisCategory> category = null;

  @JsonProperty("description")
  private OpenbaseMultiLanguageText description = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("interruptible")
  private Boolean interruptible = null;

  @JsonProperty("label")
  private OpenbaseLabel label = null;

  @JsonProperty("meta_config")
  private OpenbaseMetaConfig metaConfig = null;

  @JsonProperty("priority")
  private OpenbaseActionPriorityPriority priority = null;

  @JsonProperty("schedulable")
  private Boolean schedulable = null;

  public OpenbaseAgentClass category(List<OpenbaseActionEmphasisCategory> category) {
    this.category = category;
    return this;
  }

  public OpenbaseAgentClass addCategoryItem(OpenbaseActionEmphasisCategory categoryItem) {
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

  public OpenbaseAgentClass description(OpenbaseMultiLanguageText description) {
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

  public OpenbaseAgentClass id(String id) {
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

  public OpenbaseAgentClass interruptible(Boolean interruptible) {
    this.interruptible = interruptible;
    return this;
  }

  /**
   * Get interruptible
   * @return interruptible
  **/
  @ApiModelProperty(value = "")

  public Boolean isInterruptible() {
    return interruptible;
  }

  public void setInterruptible(Boolean interruptible) {
    this.interruptible = interruptible;
  }

  public OpenbaseAgentClass label(OpenbaseLabel label) {
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

  public OpenbaseAgentClass metaConfig(OpenbaseMetaConfig metaConfig) {
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

  public OpenbaseAgentClass priority(OpenbaseActionPriorityPriority priority) {
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

  public OpenbaseAgentClass schedulable(Boolean schedulable) {
    this.schedulable = schedulable;
    return this;
  }

  /**
   * Get schedulable
   * @return schedulable
  **/
  @ApiModelProperty(value = "")

  public Boolean isSchedulable() {
    return schedulable;
  }

  public void setSchedulable(Boolean schedulable) {
    this.schedulable = schedulable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseAgentClass openbaseAgentClass = (OpenbaseAgentClass) o;
    return Objects.equals(this.category, openbaseAgentClass.category) &&
        Objects.equals(this.description, openbaseAgentClass.description) &&
        Objects.equals(this.id, openbaseAgentClass.id) &&
        Objects.equals(this.interruptible, openbaseAgentClass.interruptible) &&
        Objects.equals(this.label, openbaseAgentClass.label) &&
        Objects.equals(this.metaConfig, openbaseAgentClass.metaConfig) &&
        Objects.equals(this.priority, openbaseAgentClass.priority) &&
        Objects.equals(this.schedulable, openbaseAgentClass.schedulable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, description, id, interruptible, label, metaConfig, priority, schedulable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseAgentClass {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interruptible: ").append(toIndentedString(interruptible)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    metaConfig: ").append(toIndentedString(metaConfig)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    schedulable: ").append(toIndentedString(schedulable)).append("\n");
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
