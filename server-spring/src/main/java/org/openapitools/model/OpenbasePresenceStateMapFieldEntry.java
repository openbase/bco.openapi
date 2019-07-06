package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbasePresenceStateState;
import org.openapitools.model.OpenbaseTimestamp;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbasePresenceStateMapFieldEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbasePresenceStateMapFieldEntry   {
  @JsonProperty("key")
  private OpenbasePresenceStateState key;

  @JsonProperty("value")
  private OpenbaseTimestamp value = null;

  public OpenbasePresenceStateMapFieldEntry key(OpenbasePresenceStateState key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePresenceStateState getKey() {
    return key;
  }

  public void setKey(OpenbasePresenceStateState key) {
    this.key = key;
  }

  public OpenbasePresenceStateMapFieldEntry value(OpenbaseTimestamp value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTimestamp getValue() {
    return value;
  }

  public void setValue(OpenbaseTimestamp value) {
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
    OpenbasePresenceStateMapFieldEntry openbasePresenceStateMapFieldEntry = (OpenbasePresenceStateMapFieldEntry) o;
    return Objects.equals(this.key, openbasePresenceStateMapFieldEntry.key) &&
        Objects.equals(this.value, openbasePresenceStateMapFieldEntry.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbasePresenceStateMapFieldEntry {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

