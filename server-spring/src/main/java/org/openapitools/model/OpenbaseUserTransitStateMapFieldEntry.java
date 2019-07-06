package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseTimestamp;
import org.openapitools.model.OpenbaseUserTransitStateState;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseUserTransitStateMapFieldEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbaseUserTransitStateMapFieldEntry   {
  @JsonProperty("key")
  private OpenbaseUserTransitStateState key;

  @JsonProperty("value")
  private OpenbaseTimestamp value = null;

  public OpenbaseUserTransitStateMapFieldEntry key(OpenbaseUserTransitStateState key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseUserTransitStateState getKey() {
    return key;
  }

  public void setKey(OpenbaseUserTransitStateState key) {
    this.key = key;
  }

  public OpenbaseUserTransitStateMapFieldEntry value(OpenbaseTimestamp value) {
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
    OpenbaseUserTransitStateMapFieldEntry openbaseUserTransitStateMapFieldEntry = (OpenbaseUserTransitStateMapFieldEntry) o;
    return Objects.equals(this.key, openbaseUserTransitStateMapFieldEntry.key) &&
        Objects.equals(this.value, openbaseUserTransitStateMapFieldEntry.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseUserTransitStateMapFieldEntry {\n");
    
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

