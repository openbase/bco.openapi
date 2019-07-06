package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseActionDescription;
import io.swagger.model.OpenbaseBlindStateMapFieldEntry;
import io.swagger.model.OpenbaseBlindStateState;
import io.swagger.model.OpenbaseTimestamp;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseBlindState
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseBlindState   {
  @JsonProperty("last_value_occurrence")
  @Valid
  private List<OpenbaseBlindStateMapFieldEntry> lastValueOccurrence = null;

  @JsonProperty("opening_ratio")
  private Double openingRatio = null;

  @JsonProperty("responsible_action")
  private OpenbaseActionDescription responsibleAction = null;

  @JsonProperty("timestamp")
  private OpenbaseTimestamp timestamp = null;

  @JsonProperty("value")
  private OpenbaseBlindStateState value = null;

  public OpenbaseBlindState lastValueOccurrence(List<OpenbaseBlindStateMapFieldEntry> lastValueOccurrence) {
    this.lastValueOccurrence = lastValueOccurrence;
    return this;
  }

  public OpenbaseBlindState addLastValueOccurrenceItem(OpenbaseBlindStateMapFieldEntry lastValueOccurrenceItem) {
    if (this.lastValueOccurrence == null) {
      this.lastValueOccurrence = new ArrayList<OpenbaseBlindStateMapFieldEntry>();
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
  public List<OpenbaseBlindStateMapFieldEntry> getLastValueOccurrence() {
    return lastValueOccurrence;
  }

  public void setLastValueOccurrence(List<OpenbaseBlindStateMapFieldEntry> lastValueOccurrence) {
    this.lastValueOccurrence = lastValueOccurrence;
  }

  public OpenbaseBlindState openingRatio(Double openingRatio) {
    this.openingRatio = openingRatio;
    return this;
  }

  /**
   * Get openingRatio
   * @return openingRatio
  **/
  @ApiModelProperty(value = "")

  public Double getOpeningRatio() {
    return openingRatio;
  }

  public void setOpeningRatio(Double openingRatio) {
    this.openingRatio = openingRatio;
  }

  public OpenbaseBlindState responsibleAction(OpenbaseActionDescription responsibleAction) {
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

  public OpenbaseBlindState timestamp(OpenbaseTimestamp timestamp) {
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

  public OpenbaseBlindState value(OpenbaseBlindStateState value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseBlindStateState getValue() {
    return value;
  }

  public void setValue(OpenbaseBlindStateState value) {
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
    OpenbaseBlindState openbaseBlindState = (OpenbaseBlindState) o;
    return Objects.equals(this.lastValueOccurrence, openbaseBlindState.lastValueOccurrence) &&
        Objects.equals(this.openingRatio, openbaseBlindState.openingRatio) &&
        Objects.equals(this.responsibleAction, openbaseBlindState.responsibleAction) &&
        Objects.equals(this.timestamp, openbaseBlindState.timestamp) &&
        Objects.equals(this.value, openbaseBlindState.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastValueOccurrence, openingRatio, responsibleAction, timestamp, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseBlindState {\n");
    
    sb.append("    lastValueOccurrence: ").append(toIndentedString(lastValueOccurrence)).append("\n");
    sb.append("    openingRatio: ").append(toIndentedString(openingRatio)).append("\n");
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
