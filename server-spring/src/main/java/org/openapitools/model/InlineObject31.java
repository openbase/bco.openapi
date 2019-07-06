package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseAppClass;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject31
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

public class InlineObject31   {
  @JsonProperty("arg0")
  private OpenbaseAppClass arg0 = null;

  public InlineObject31 arg0(OpenbaseAppClass arg0) {
    this.arg0 = arg0;
    return this;
  }

  /**
   * Get arg0
   * @return arg0
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseAppClass getArg0() {
    return arg0;
  }

  public void setArg0(OpenbaseAppClass arg0) {
    this.arg0 = arg0;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject31 inlineObject31 = (InlineObject31) o;
    return Objects.equals(this.arg0, inlineObject31.arg0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arg0);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject31 {\n");
    
    sb.append("    arg0: ").append(toIndentedString(arg0)).append("\n");
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

