package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseLocationConfigLocationType;
import org.openapitools.model.OpenbaseVec3DDouble;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject84
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

public class InlineObject84   {
  @JsonProperty("arg1")
  private OpenbaseLocationConfigLocationType arg1;

  @JsonProperty("arg0")
  private OpenbaseVec3DDouble arg0 = null;

  public InlineObject84 arg1(OpenbaseLocationConfigLocationType arg1) {
    this.arg1 = arg1;
    return this;
  }

  /**
   * Get arg1
   * @return arg1
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseLocationConfigLocationType getArg1() {
    return arg1;
  }

  public void setArg1(OpenbaseLocationConfigLocationType arg1) {
    this.arg1 = arg1;
  }

  public InlineObject84 arg0(OpenbaseVec3DDouble arg0) {
    this.arg0 = arg0;
    return this;
  }

  /**
   * Get arg0
   * @return arg0
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseVec3DDouble getArg0() {
    return arg0;
  }

  public void setArg0(OpenbaseVec3DDouble arg0) {
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
    InlineObject84 inlineObject84 = (InlineObject84) o;
    return Objects.equals(this.arg1, inlineObject84.arg1) &&
        Objects.equals(this.arg0, inlineObject84.arg0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arg1, arg0);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject84 {\n");
    
    sb.append("    arg1: ").append(toIndentedString(arg1)).append("\n");
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
