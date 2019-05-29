package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseLabelMapFieldEntry;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseLabel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-29T22:47:43.327074+02:00[Europe/Berlin]")

public class OpenbaseLabel   {
  @JsonProperty("entry")
  @Valid
  private List<OpenbaseLabelMapFieldEntry> entry = null;

  public OpenbaseLabel entry(List<OpenbaseLabelMapFieldEntry> entry) {
    this.entry = entry;
    return this;
  }

  public OpenbaseLabel addEntryItem(OpenbaseLabelMapFieldEntry entryItem) {
    if (this.entry == null) {
      this.entry = new ArrayList<>();
    }
    this.entry.add(entryItem);
    return this;
  }

  /**
   * Get entry
   * @return entry
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseLabelMapFieldEntry> getEntry() {
    return entry;
  }

  public void setEntry(List<OpenbaseLabelMapFieldEntry> entry) {
    this.entry = entry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseLabel openbaseLabel = (OpenbaseLabel) o;
    return Objects.equals(this.entry, openbaseLabel.entry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseLabel {\n");
    
    sb.append("    entry: ").append(toIndentedString(entry)).append("\n");
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

