package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseUnitTemplateUnitType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject22
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

public class InlineObject22   {
  @JsonProperty("arg0")
  private OpenbaseUnitTemplateUnitType arg0;

  public InlineObject22 arg0(OpenbaseUnitTemplateUnitType arg0) {
    this.arg0 = arg0;
    return this;
  }

  /**
   * Get arg0
   * @return arg0
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseUnitTemplateUnitType getArg0() {
    return arg0;
  }

  public void setArg0(OpenbaseUnitTemplateUnitType arg0) {
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
    InlineObject22 inlineObject22 = (InlineObject22) o;
    return Objects.equals(this.arg0, inlineObject22.arg0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arg0);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject22 {\n");
    
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

