package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseActionStateMapFieldEntry;
import io.swagger.model.OpenbaseActionStateState;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseActionState
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseActionState   {
  @JsonProperty("last_value_occurrence")
  @Valid
  private List<OpenbaseActionStateMapFieldEntry> lastValueOccurrence = null;

  @JsonProperty("value")
  private OpenbaseActionStateState value = null;

  public OpenbaseActionState lastValueOccurrence(List<OpenbaseActionStateMapFieldEntry> lastValueOccurrence) {
    this.lastValueOccurrence = lastValueOccurrence;
    return this;
  }

  public OpenbaseActionState addLastValueOccurrenceItem(OpenbaseActionStateMapFieldEntry lastValueOccurrenceItem) {
    if (this.lastValueOccurrence == null) {
      this.lastValueOccurrence = new ArrayList<OpenbaseActionStateMapFieldEntry>();
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
  public List<OpenbaseActionStateMapFieldEntry> getLastValueOccurrence() {
    return lastValueOccurrence;
  }

  public void setLastValueOccurrence(List<OpenbaseActionStateMapFieldEntry> lastValueOccurrence) {
    this.lastValueOccurrence = lastValueOccurrence;
  }

  public OpenbaseActionState value(OpenbaseActionStateState value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseActionStateState getValue() {
    return value;
  }

  public void setValue(OpenbaseActionStateState value) {
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
    OpenbaseActionState openbaseActionState = (OpenbaseActionState) o;
    return Objects.equals(this.lastValueOccurrence, openbaseActionState.lastValueOccurrence) &&
        Objects.equals(this.value, openbaseActionState.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastValueOccurrence, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseActionState {\n");
    
    sb.append("    lastValueOccurrence: ").append(toIndentedString(lastValueOccurrence)).append("\n");
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
