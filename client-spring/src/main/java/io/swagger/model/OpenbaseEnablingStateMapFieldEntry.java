package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseEnablingStateState;
import io.swagger.model.OpenbaseTimestamp;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseEnablingStateMapFieldEntry
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseEnablingStateMapFieldEntry   {
  @JsonProperty("key")
  private OpenbaseEnablingStateState key = null;

  @JsonProperty("value")
  private OpenbaseTimestamp value = null;

  public OpenbaseEnablingStateMapFieldEntry key(OpenbaseEnablingStateState key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseEnablingStateState getKey() {
    return key;
  }

  public void setKey(OpenbaseEnablingStateState key) {
    this.key = key;
  }

  public OpenbaseEnablingStateMapFieldEntry value(OpenbaseTimestamp value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
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
    OpenbaseEnablingStateMapFieldEntry openbaseEnablingStateMapFieldEntry = (OpenbaseEnablingStateMapFieldEntry) o;
    return Objects.equals(this.key, openbaseEnablingStateMapFieldEntry.key) &&
        Objects.equals(this.value, openbaseEnablingStateMapFieldEntry.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseEnablingStateMapFieldEntry {\n");
    
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
