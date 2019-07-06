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
import org.openapitools.model.OpenbaseActionReference;
import org.openapitools.model.OpenbaseActionState;
import org.openapitools.model.OpenbaseLabel;
import org.openapitools.model.OpenbaseMultiLanguageText;
import org.openapitools.model.OpenbaseServiceStateDescription;
import org.openapitools.model.OpenbaseTimestamp;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseActionDescription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

public class OpenbaseActionDescription   {
  @JsonProperty("action_cause")
  @Valid
  private List<OpenbaseActionReference> actionCause = null;

  @JsonProperty("action_impact")
  @Valid
  private List<OpenbaseActionReference> actionImpact = null;

  @JsonProperty("action_initiator")
  private OpenbaseActionInitiator actionInitiator = null;

  @JsonProperty("action_state")
  private OpenbaseActionState actionState = null;

  @JsonProperty("cancel")
  private Boolean cancel;

  @JsonProperty("category")
  @Valid
  private List<OpenbaseActionEmphasisCategory> category = null;

  @JsonProperty("description")
  private OpenbaseMultiLanguageText description = null;

  @JsonProperty("execution_time_period")
  private Long executionTimePeriod;

  @JsonProperty("extend")
  private Boolean extend;

  @JsonProperty("id")
  private String id;

  @JsonProperty("intermediary")
  private Boolean intermediary;

  @JsonProperty("interruptible")
  private Boolean interruptible;

  @JsonProperty("label")
  private OpenbaseLabel label = null;

  @JsonProperty("last_extension_timestamp")
  private OpenbaseTimestamp lastExtensionTimestamp = null;

  @JsonProperty("priority")
  private OpenbaseActionPriorityPriority priority;

  @JsonProperty("schedulable")
  private Boolean schedulable;

  @JsonProperty("service_state_description")
  private OpenbaseServiceStateDescription serviceStateDescription = null;

  @JsonProperty("termination_timestamp")
  private OpenbaseTimestamp terminationTimestamp = null;

  @JsonProperty("timestamp")
  private OpenbaseTimestamp timestamp = null;

  public OpenbaseActionDescription actionCause(List<OpenbaseActionReference> actionCause) {
    this.actionCause = actionCause;
    return this;
  }

  public OpenbaseActionDescription addActionCauseItem(OpenbaseActionReference actionCauseItem) {
    if (this.actionCause == null) {
      this.actionCause = new ArrayList<>();
    }
    this.actionCause.add(actionCauseItem);
    return this;
  }

  /**
   * Get actionCause
   * @return actionCause
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseActionReference> getActionCause() {
    return actionCause;
  }

  public void setActionCause(List<OpenbaseActionReference> actionCause) {
    this.actionCause = actionCause;
  }

  public OpenbaseActionDescription actionImpact(List<OpenbaseActionReference> actionImpact) {
    this.actionImpact = actionImpact;
    return this;
  }

  public OpenbaseActionDescription addActionImpactItem(OpenbaseActionReference actionImpactItem) {
    if (this.actionImpact == null) {
      this.actionImpact = new ArrayList<>();
    }
    this.actionImpact.add(actionImpactItem);
    return this;
  }

  /**
   * Get actionImpact
   * @return actionImpact
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseActionReference> getActionImpact() {
    return actionImpact;
  }

  public void setActionImpact(List<OpenbaseActionReference> actionImpact) {
    this.actionImpact = actionImpact;
  }

  public OpenbaseActionDescription actionInitiator(OpenbaseActionInitiator actionInitiator) {
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

  public OpenbaseActionDescription actionState(OpenbaseActionState actionState) {
    this.actionState = actionState;
    return this;
  }

  /**
   * Get actionState
   * @return actionState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseActionState getActionState() {
    return actionState;
  }

  public void setActionState(OpenbaseActionState actionState) {
    this.actionState = actionState;
  }

  public OpenbaseActionDescription cancel(Boolean cancel) {
    this.cancel = cancel;
    return this;
  }

  /**
   * Get cancel
   * @return cancel
  */
  @ApiModelProperty(value = "")


  public Boolean getCancel() {
    return cancel;
  }

  public void setCancel(Boolean cancel) {
    this.cancel = cancel;
  }

  public OpenbaseActionDescription category(List<OpenbaseActionEmphasisCategory> category) {
    this.category = category;
    return this;
  }

  public OpenbaseActionDescription addCategoryItem(OpenbaseActionEmphasisCategory categoryItem) {
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

  public OpenbaseActionDescription description(OpenbaseMultiLanguageText description) {
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

  public OpenbaseActionDescription executionTimePeriod(Long executionTimePeriod) {
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

  public OpenbaseActionDescription extend(Boolean extend) {
    this.extend = extend;
    return this;
  }

  /**
   * Get extend
   * @return extend
  */
  @ApiModelProperty(value = "")


  public Boolean getExtend() {
    return extend;
  }

  public void setExtend(Boolean extend) {
    this.extend = extend;
  }

  public OpenbaseActionDescription id(String id) {
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

  public OpenbaseActionDescription intermediary(Boolean intermediary) {
    this.intermediary = intermediary;
    return this;
  }

  /**
   * Get intermediary
   * @return intermediary
  */
  @ApiModelProperty(value = "")


  public Boolean getIntermediary() {
    return intermediary;
  }

  public void setIntermediary(Boolean intermediary) {
    this.intermediary = intermediary;
  }

  public OpenbaseActionDescription interruptible(Boolean interruptible) {
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

  public OpenbaseActionDescription label(OpenbaseLabel label) {
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

  public OpenbaseActionDescription lastExtensionTimestamp(OpenbaseTimestamp lastExtensionTimestamp) {
    this.lastExtensionTimestamp = lastExtensionTimestamp;
    return this;
  }

  /**
   * Get lastExtensionTimestamp
   * @return lastExtensionTimestamp
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTimestamp getLastExtensionTimestamp() {
    return lastExtensionTimestamp;
  }

  public void setLastExtensionTimestamp(OpenbaseTimestamp lastExtensionTimestamp) {
    this.lastExtensionTimestamp = lastExtensionTimestamp;
  }

  public OpenbaseActionDescription priority(OpenbaseActionPriorityPriority priority) {
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

  public OpenbaseActionDescription schedulable(Boolean schedulable) {
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

  public OpenbaseActionDescription serviceStateDescription(OpenbaseServiceStateDescription serviceStateDescription) {
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

  public OpenbaseActionDescription terminationTimestamp(OpenbaseTimestamp terminationTimestamp) {
    this.terminationTimestamp = terminationTimestamp;
    return this;
  }

  /**
   * Get terminationTimestamp
   * @return terminationTimestamp
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTimestamp getTerminationTimestamp() {
    return terminationTimestamp;
  }

  public void setTerminationTimestamp(OpenbaseTimestamp terminationTimestamp) {
    this.terminationTimestamp = terminationTimestamp;
  }

  public OpenbaseActionDescription timestamp(OpenbaseTimestamp timestamp) {
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
    OpenbaseActionDescription openbaseActionDescription = (OpenbaseActionDescription) o;
    return Objects.equals(this.actionCause, openbaseActionDescription.actionCause) &&
        Objects.equals(this.actionImpact, openbaseActionDescription.actionImpact) &&
        Objects.equals(this.actionInitiator, openbaseActionDescription.actionInitiator) &&
        Objects.equals(this.actionState, openbaseActionDescription.actionState) &&
        Objects.equals(this.cancel, openbaseActionDescription.cancel) &&
        Objects.equals(this.category, openbaseActionDescription.category) &&
        Objects.equals(this.description, openbaseActionDescription.description) &&
        Objects.equals(this.executionTimePeriod, openbaseActionDescription.executionTimePeriod) &&
        Objects.equals(this.extend, openbaseActionDescription.extend) &&
        Objects.equals(this.id, openbaseActionDescription.id) &&
        Objects.equals(this.intermediary, openbaseActionDescription.intermediary) &&
        Objects.equals(this.interruptible, openbaseActionDescription.interruptible) &&
        Objects.equals(this.label, openbaseActionDescription.label) &&
        Objects.equals(this.lastExtensionTimestamp, openbaseActionDescription.lastExtensionTimestamp) &&
        Objects.equals(this.priority, openbaseActionDescription.priority) &&
        Objects.equals(this.schedulable, openbaseActionDescription.schedulable) &&
        Objects.equals(this.serviceStateDescription, openbaseActionDescription.serviceStateDescription) &&
        Objects.equals(this.terminationTimestamp, openbaseActionDescription.terminationTimestamp) &&
        Objects.equals(this.timestamp, openbaseActionDescription.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionCause, actionImpact, actionInitiator, actionState, cancel, category, description, executionTimePeriod, extend, id, intermediary, interruptible, label, lastExtensionTimestamp, priority, schedulable, serviceStateDescription, terminationTimestamp, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseActionDescription {\n");
    
    sb.append("    actionCause: ").append(toIndentedString(actionCause)).append("\n");
    sb.append("    actionImpact: ").append(toIndentedString(actionImpact)).append("\n");
    sb.append("    actionInitiator: ").append(toIndentedString(actionInitiator)).append("\n");
    sb.append("    actionState: ").append(toIndentedString(actionState)).append("\n");
    sb.append("    cancel: ").append(toIndentedString(cancel)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    executionTimePeriod: ").append(toIndentedString(executionTimePeriod)).append("\n");
    sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    intermediary: ").append(toIndentedString(intermediary)).append("\n");
    sb.append("    interruptible: ").append(toIndentedString(interruptible)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    lastExtensionTimestamp: ").append(toIndentedString(lastExtensionTimestamp)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    schedulable: ").append(toIndentedString(schedulable)).append("\n");
    sb.append("    serviceStateDescription: ").append(toIndentedString(serviceStateDescription)).append("\n");
    sb.append("    terminationTimestamp: ").append(toIndentedString(terminationTimestamp)).append("\n");
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

