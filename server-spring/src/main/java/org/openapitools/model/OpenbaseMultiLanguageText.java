package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseMultiLanguageTextMapFieldEntry;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseMultiLanguageText
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-29T22:47:43.327074+02:00[Europe/Berlin]")

public class OpenbaseMultiLanguageText   {
  @JsonProperty("entry")
  @Valid
  private List<OpenbaseMultiLanguageTextMapFieldEntry> entry = null;

  public OpenbaseMultiLanguageText entry(List<OpenbaseMultiLanguageTextMapFieldEntry> entry) {
    this.entry = entry;
    return this;
  }

  public OpenbaseMultiLanguageText addEntryItem(OpenbaseMultiLanguageTextMapFieldEntry entryItem) {
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

  public List<OpenbaseMultiLanguageTextMapFieldEntry> getEntry() {
    return entry;
  }

  public void setEntry(List<OpenbaseMultiLanguageTextMapFieldEntry> entry) {
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
    OpenbaseMultiLanguageText openbaseMultiLanguageText = (OpenbaseMultiLanguageText) o;
    return Objects.equals(this.entry, openbaseMultiLanguageText.entry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseMultiLanguageText {\n");
    
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

