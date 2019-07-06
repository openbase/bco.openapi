package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseServiceTemplateServiceType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject124
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class InlineObject124   {
  @JsonProperty("arg0")
  @Valid
  private List<OpenbaseServiceTemplateServiceType> arg0 = null;

  public InlineObject124 arg0(List<OpenbaseServiceTemplateServiceType> arg0) {
    this.arg0 = arg0;
    return this;
  }

  public InlineObject124 addArg0Item(OpenbaseServiceTemplateServiceType arg0Item) {
    if (this.arg0 == null) {
      this.arg0 = new ArrayList<>();
    }
    this.arg0.add(arg0Item);
    return this;
  }

  /**
   * Get arg0
   * @return arg0
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseServiceTemplateServiceType> getArg0() {
    return arg0;
  }

  public void setArg0(List<OpenbaseServiceTemplateServiceType> arg0) {
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
    InlineObject124 inlineObject124 = (InlineObject124) o;
    return Objects.equals(this.arg0, inlineObject124.arg0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arg0);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject124 {\n");
    
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

