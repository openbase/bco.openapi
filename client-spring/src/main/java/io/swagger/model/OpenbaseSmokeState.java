package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseActionDescription;
import io.swagger.model.OpenbaseSmokeStateMapFieldEntry;
import io.swagger.model.OpenbaseSmokeStateState;
import io.swagger.model.OpenbaseTimestamp;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseSmokeState
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseSmokeState   {
  @JsonProperty("last_value_occurrence")
  @Valid
  private List<OpenbaseSmokeStateMapFieldEntry> lastValueOccurrence = null;

  @JsonProperty("responsible_action")
  private OpenbaseActionDescription responsibleAction = null;

  @JsonProperty("smoke_level")
  private Double smokeLevel = null;

  @JsonProperty("timestamp")
  private OpenbaseTimestamp timestamp = null;

  @JsonProperty("value")
  private OpenbaseSmokeStateState value = null;

  public OpenbaseSmokeState lastValueOccurrence(List<OpenbaseSmokeStateMapFieldEntry> lastValueOccurrence) {
    this.lastValueOccurrence = lastValueOccurrence;
    return this;
  }

  public OpenbaseSmokeState addLastValueOccurrenceItem(OpenbaseSmokeStateMapFieldEntry lastValueOccurrenceItem) {
    if (this.lastValueOccurrence == null) {
      this.lastValueOccurrence = new ArrayList<OpenbaseSmokeStateMapFieldEntry>();
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
  public List<OpenbaseSmokeStateMapFieldEntry> getLastValueOccurrence() {
    return lastValueOccurrence;
  }

  public void setLastValueOccurrence(List<OpenbaseSmokeStateMapFieldEntry> lastValueOccurrence) {
    this.lastValueOccurrence = lastValueOccurrence;
  }

  public OpenbaseSmokeState responsibleAction(OpenbaseActionDescription responsibleAction) {
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

  public OpenbaseSmokeState smokeLevel(Double smokeLevel) {
    this.smokeLevel = smokeLevel;
    return this;
  }

  /**
   * Get smokeLevel
   * @return smokeLevel
  **/
  @ApiModelProperty(value = "")

  public Double getSmokeLevel() {
    return smokeLevel;
  }

  public void setSmokeLevel(Double smokeLevel) {
    this.smokeLevel = smokeLevel;
  }

  public OpenbaseSmokeState timestamp(OpenbaseTimestamp timestamp) {
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

  public OpenbaseSmokeState value(OpenbaseSmokeStateState value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseSmokeStateState getValue() {
    return value;
  }

  public void setValue(OpenbaseSmokeStateState value) {
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
    OpenbaseSmokeState openbaseSmokeState = (OpenbaseSmokeState) o;
    return Objects.equals(this.lastValueOccurrence, openbaseSmokeState.lastValueOccurrence) &&
        Objects.equals(this.responsibleAction, openbaseSmokeState.responsibleAction) &&
        Objects.equals(this.smokeLevel, openbaseSmokeState.smokeLevel) &&
        Objects.equals(this.timestamp, openbaseSmokeState.timestamp) &&
        Objects.equals(this.value, openbaseSmokeState.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastValueOccurrence, responsibleAction, smokeLevel, timestamp, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseSmokeState {\n");
    
    sb.append("    lastValueOccurrence: ").append(toIndentedString(lastValueOccurrence)).append("\n");
    sb.append("    responsibleAction: ").append(toIndentedString(responsibleAction)).append("\n");
    sb.append("    smokeLevel: ").append(toIndentedString(smokeLevel)).append("\n");
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
