package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseServiceTemplateServicePattern;
import org.openapitools.model.OpenbaseServiceTemplateServiceType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject7
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class InlineObject7   {
  @JsonProperty("arg1")
  private OpenbaseServiceTemplateServicePattern arg1;

  @JsonProperty("arg0")
  private OpenbaseServiceTemplateServiceType arg0;

  public InlineObject7 arg1(OpenbaseServiceTemplateServicePattern arg1) {
    this.arg1 = arg1;
    return this;
  }

  /**
   * Get arg1
   * @return arg1
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseServiceTemplateServicePattern getArg1() {
    return arg1;
  }

  public void setArg1(OpenbaseServiceTemplateServicePattern arg1) {
    this.arg1 = arg1;
  }

  public InlineObject7 arg0(OpenbaseServiceTemplateServiceType arg0) {
    this.arg0 = arg0;
    return this;
  }

  /**
   * Get arg0
   * @return arg0
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseServiceTemplateServiceType getArg0() {
    return arg0;
  }

  public void setArg0(OpenbaseServiceTemplateServiceType arg0) {
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
    InlineObject7 inlineObject7 = (InlineObject7) o;
    return Objects.equals(this.arg1, inlineObject7.arg1) &&
        Objects.equals(this.arg0, inlineObject7.arg0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arg1, arg0);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject7 {\n");
    
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

