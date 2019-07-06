package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseActionEmphasisCategory;
import org.openapitools.model.OpenbaseActionInitiator;
import org.openapitools.model.OpenbaseActionPriorityPriority;
import org.openapitools.model.OpenbaseServiceStateDescription;
import org.openapitools.model.OpenbaseTimestamp;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseActionReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

public class OpenbaseActionReference   {
  @JsonProperty("action_id")
  private String actionId;

  @JsonProperty("action_initiator")
  private OpenbaseActionInitiator actionInitiator = null;

  @JsonProperty("category")
  @Valid
  private List<OpenbaseActionEmphasisCategory> category = null;

  @JsonProperty("execution_time_period")
  private Long executionTimePeriod;

  @JsonProperty("interruptible")
  private Boolean interruptible;

  @JsonProperty("priority")
  private OpenbaseActionPriorityPriority priority;

  @JsonProperty("schedulable")
  private Boolean schedulable;

  @JsonProperty("service_state_description")
  private OpenbaseServiceStateDescription serviceStateDescription = null;

  @JsonProperty("timestamp")
  private OpenbaseTimestamp timestamp = null;

  public OpenbaseActionReference actionId(String actionId) {
    this.actionId = actionId;
    return this;
  }

  /**
   * Get actionId
   * @return actionId
  */
  @ApiModelProperty(value = "")


  public String getActionId() {
    return actionId;
  }

  public void setActionId(String actionId) {
    this.actionId = actionId;
  }

  public OpenbaseActionReference actionInitiator(OpenbaseActionInitiator actionInitiator) {
    this.actionInitiator = actionInitiator;
    return this;
  }

  /**
   * Get actionInitiator
   * @return actionInitiator
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseActionInitiator getActionInitiator() {
    return actionInitiator;
  }

  public void setActionInitiator(OpenbaseActionInitiator actionInitiator) {
    this.actionInitiator = actionInitiator;
  }

  public OpenbaseActionReference category(List<OpenbaseActionEmphasisCategory> category) {
    this.category = category;
    return this;
  }

  public OpenbaseActionReference addCategoryItem(OpenbaseActionEmphasisCategory categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }
    this.category.add(categoryItem);
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseActionEmphasisCategory> getCategory() {
    return category;
  }

  public void setCategory(List<OpenbaseActionEmphasisCategory> category) {
    this.category = category;
  }

  public OpenbaseActionReference executionTimePeriod(Long executionTimePeriod) {
    this.executionTimePeriod = executionTimePeriod;
    return this;
  }

  /**
   * Get executionTimePeriod
   * @return executionTimePeriod
  */
  @ApiModelProperty(value = "")


  public Long getExecutionTimePeriod() {
    return executionTimePeriod;
  }

  public void setExecutionTimePeriod(Long executionTimePeriod) {
    this.executionTimePeriod = executionTimePeriod;
  }

  public OpenbaseActionReference interruptible(Boolean interruptible) {
    this.interruptible = interruptible;
    return this;
  }

  /**
   * Get interruptible
   * @return interruptible
  */
  @ApiModelProperty(value = "")


  public Boolean getInterruptible() {
    return interruptible;
  }

  public void setInterruptible(Boolean interruptible) {
    this.interruptible = interruptible;
  }

  public OpenbaseActionReference priority(OpenbaseActionPriorityPriority priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseActionPriorityPriority getPriority() {
    return priority;
  }

  public void setPriority(OpenbaseActionPriorityPriority priority) {
    this.priority = priority;
  }

  public OpenbaseActionReference schedulable(Boolean schedulable) {
    this.schedulable = schedulable;
    return this;
  }

  /**
   * Get schedulable
   * @return schedulable
  */
  @ApiModelProperty(value = "")


  public Boolean getSchedulable() {
    return schedulable;
  }

  public void setSchedulable(Boolean schedulable) {
    this.schedulable = schedulable;
  }

  public OpenbaseActionReference serviceStateDescription(OpenbaseServiceStateDescription serviceStateDescription) {
    this.serviceStateDescription = serviceStateDescription;
    return this;
  }

  /**
   * Get serviceStateDescription
   * @return serviceStateDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseServiceStateDescription getServiceStateDescription() {
    return serviceStateDescription;
  }

  public void setServiceStateDescription(OpenbaseServiceStateDescription serviceStateDescription) {
    this.serviceStateDescription = serviceStateDescription;
  }

  public OpenbaseActionReference timestamp(OpenbaseTimestamp timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTimestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OpenbaseTimestamp timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseActionReference openbaseActionReference = (OpenbaseActionReference) o;
    return Objects.equals(this.actionId, openbaseActionReference.actionId) &&
        Objects.equals(this.actionInitiator, openbaseActionReference.actionInitiator) &&
        Objects.equals(this.category, openbaseActionReference.category) &&
        Objects.equals(this.executionTimePeriod, openbaseActionReference.executionTimePeriod) &&
        Objects.equals(this.interruptible, openbaseActionReference.interruptible) &&
        Objects.equals(this.priority, openbaseActionReference.priority) &&
        Objects.equals(this.schedulable, openbaseActionReference.schedulable) &&
        Objects.equals(this.serviceStateDescription, openbaseActionReference.serviceStateDescription) &&
        Objects.equals(this.timestamp, openbaseActionReference.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionId, actionInitiator, category, executionTimePeriod, interruptible, priority, schedulable, serviceStateDescription, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseActionReference {\n");
    
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    actionInitiator: ").append(toIndentedString(actionInitiator)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    executionTimePeriod: ").append(toIndentedString(executionTimePeriod)).append("\n");
    sb.append("    interruptible: ").append(toIndentedString(interruptible)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    schedulable: ").append(toIndentedString(schedulable)).append("\n");
    sb.append("    serviceStateDescription: ").append(toIndentedString(serviceStateDescription)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

