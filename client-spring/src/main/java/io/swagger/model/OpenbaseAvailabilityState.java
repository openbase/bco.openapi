package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseActionDescription;
import io.swagger.model.OpenbaseAvailabilityStateMapFieldEntry;
import io.swagger.model.OpenbaseAvailabilityStateState;
import io.swagger.model.OpenbaseTimestamp;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseAvailabilityState
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseAvailabilityState   {
  @JsonProperty("last_value_occurrence")
  @Valid
  private List<OpenbaseAvailabilityStateMapFieldEntry> lastValueOccurrence = null;

  @JsonProperty("responsible_action")
  private OpenbaseActionDescription responsibleAction = null;

  @JsonProperty("timestamp")
  private OpenbaseTimestamp timestamp = null;

  @JsonProperty("value")
  private OpenbaseAvailabilityStateState value = null;

  public OpenbaseAvailabilityState lastValueOccurrence(List<OpenbaseAvailabilityStateMapFieldEntry> lastValueOccurrence) {
    this.lastValueOccurrence = lastValueOccurrence;
    return this;
  }

  public OpenbaseAvailabilityState addLastValueOccurrenceItem(OpenbaseAvailabilityStateMapFieldEntry lastValueOccurrenceItem) {
    if (this.lastValueOccurrence == null) {
      this.lastValueOccurrence = new ArrayList<OpenbaseAvailabilityStateMapFieldEntry>();
    }
    this.lastValueOccurrence.add(lastValueOccurrenceItem);
    return this;
  }

  /**
   * Get lastValueOccurrence
   * @return lastValueOccurrence
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbaseAvailabilityStateMapFieldEntry> getLastValueOccurrence() {
    return lastValueOccurrence;
  }

  public void setLastValueOccurrence(List<OpenbaseAvailabilityStateMapFieldEntry> lastValueOccurrence) {
    this.lastValueOccurrence = lastValueOccurrence;
  }

  public OpenbaseAvailabilityState responsibleAction(OpenbaseActionDescription responsibleAction) {
    this.responsibleAction = responsibleAction;
    return this;
  }

  /**
   * Get responsibleAction
   * @return responsibleAction
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseActionDescription getResponsibleAction() {
    return responsibleAction;
  }

  public void setResponsibleAction(OpenbaseActionDescription responsibleAction) {
    this.responsibleAction = responsibleAction;
  }

  public OpenbaseAvailabilityState timestamp(OpenbaseTimestamp timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseTimestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OpenbaseTimestamp timestamp) {
    this.timestamp = timestamp;
  }

  public OpenbaseAvailabilityState value(OpenbaseAvailabilityStateState value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseAvailabilityStateState getValue() {
    return value;
  }

  public void setValue(OpenbaseAvailabilityStateState value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseAvailabilityState openbaseAvailabilityState = (OpenbaseAvailabilityState) o;
    return Objects.equals(this.lastValueOccurrence, openbaseAvailabilityState.lastValueOccurrence) &&
        Objects.equals(this.responsibleAction, openbaseAvailabilityState.responsibleAction) &&
        Objects.equals(this.timestamp, openbaseAvailabilityState.timestamp) &&
        Objects.equals(this.value, openbaseAvailabilityState.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastValueOccurrence, responsibleAction, timestamp, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseAvailabilityState {\n");
    
    sb.append("    lastValueOccurrence: ").append(toIndentedString(lastValueOccurrence)).append("\n");
    sb.append("    responsibleAction: ").append(toIndentedString(responsibleAction)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
