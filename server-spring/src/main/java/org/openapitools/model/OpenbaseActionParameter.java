package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseActionDescription;
import org.openapitools.model.OpenbaseActionEmphasisCategory;
import org.openapitools.model.OpenbaseActionInitiator;
import org.openapitools.model.OpenbaseActionPriorityPriority;
import org.openapitools.model.OpenbaseAuthToken;
import org.openapitools.model.OpenbaseLabel;
import org.openapitools.model.OpenbaseServiceStateDescription;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseActionParameter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseActionParameter   {
  @JsonProperty("action_initiator")
  private OpenbaseActionInitiator actionInitiator = null;

  @JsonProperty("auth_token")
  private OpenbaseAuthToken authToken = null;

  @JsonProperty("category")
  @Valid
  private List<OpenbaseActionEmphasisCategory> category = null;

  @JsonProperty("cause")
  private OpenbaseActionDescription cause = null;

  @JsonProperty("execution_time_period")
  private Long executionTimePeriod;

  @JsonProperty("interruptible")
  private Boolean interruptible;

  @JsonProperty("label")
  private OpenbaseLabel label = null;

  @JsonProperty("priority")
  private OpenbaseActionPriorityPriority priority;

  @JsonProperty("schedulable")
  private Boolean schedulable;

  @JsonProperty("service_state_description")
  private OpenbaseServiceStateDescription serviceStateDescription = null;

  public OpenbaseActionParameter actionInitiator(OpenbaseActionInitiator actionInitiator) {
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

  public OpenbaseActionParameter authToken(OpenbaseAuthToken authToken) {
    this.authToken = authToken;
    return this;
  }

  /**
   * Get authToken
   * @return authToken
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseAuthToken getAuthToken() {
    return authToken;
  }

  public void setAuthToken(OpenbaseAuthToken authToken) {
    this.authToken = authToken;
  }

  public OpenbaseActionParameter category(List<OpenbaseActionEmphasisCategory> category) {
    this.category = category;
    return this;
  }

  public OpenbaseActionParameter addCategoryItem(OpenbaseActionEmphasisCategory categoryItem) {
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

  public OpenbaseActionParameter cause(OpenbaseActionDescription cause) {
    this.cause = cause;
    return this;
  }

  /**
   * Get cause
   * @return cause
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseActionDescription getCause() {
    return cause;
  }

  public void setCause(OpenbaseActionDescription cause) {
    this.cause = cause;
  }

  public OpenbaseActionParameter executionTimePeriod(Long executionTimePeriod) {
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

  public OpenbaseActionParameter interruptible(Boolean interruptible) {
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

  public OpenbaseActionParameter label(OpenbaseLabel label) {
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

  public OpenbaseActionParameter priority(OpenbaseActionPriorityPriority priority) {
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

  public OpenbaseActionParameter schedulable(Boolean schedulable) {
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

  public OpenbaseActionParameter serviceStateDescription(OpenbaseServiceStateDescription serviceStateDescription) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseActionParameter openbaseActionParameter = (OpenbaseActionParameter) o;
    return Objects.equals(this.actionInitiator, openbaseActionParameter.actionInitiator) &&
        Objects.equals(this.authToken, openbaseActionParameter.authToken) &&
        Objects.equals(this.category, openbaseActionParameter.category) &&
        Objects.equals(this.cause, openbaseActionParameter.cause) &&
        Objects.equals(this.executionTimePeriod, openbaseActionParameter.executionTimePeriod) &&
        Objects.equals(this.interruptible, openbaseActionParameter.interruptible) &&
        Objects.equals(this.label, openbaseActionParameter.label) &&
        Objects.equals(this.priority, openbaseActionParameter.priority) &&
        Objects.equals(this.schedulable, openbaseActionParameter.schedulable) &&
        Objects.equals(this.serviceStateDescription, openbaseActionParameter.serviceStateDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionInitiator, authToken, category, cause, executionTimePeriod, interruptible, label, priority, schedulable, serviceStateDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseActionParameter {\n");
    
    sb.append("    actionInitiator: ").append(toIndentedString(actionInitiator)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    executionTimePeriod: ").append(toIndentedString(executionTimePeriod)).append("\n");
    sb.append("    interruptible: ").append(toIndentedString(interruptible)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    schedulable: ").append(toIndentedString(schedulable)).append("\n");
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

