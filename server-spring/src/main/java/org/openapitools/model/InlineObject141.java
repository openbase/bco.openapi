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
 * InlineObject141
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class InlineObject141   {
  @JsonProperty("arg2")
  private Boolean arg2;

  @JsonProperty("arg1")
  private OpenbaseUnitTemplateUnitType arg1;

  @JsonProperty("arg0")
  private String arg0;

  public InlineObject141 arg2(Boolean arg2) {
    this.arg2 = arg2;
    return this;
  }

  /**
   * Get arg2
   * @return arg2
  */
  @ApiModelProperty(value = "")


  public Boolean getArg2() {
    return arg2;
  }

  public void setArg2(Boolean arg2) {
    this.arg2 = arg2;
  }

  public InlineObject141 arg1(OpenbaseUnitTemplateUnitType arg1) {
    this.arg1 = arg1;
    return this;
  }

  /**
   * Get arg1
   * @return arg1
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseUnitTemplateUnitType getArg1() {
    return arg1;
  }

  public void setArg1(OpenbaseUnitTemplateUnitType arg1) {
    this.arg1 = arg1;
  }

  public InlineObject141 arg0(String arg0) {
    this.arg0 = arg0;
    return this;
  }

  /**
   * Get arg0
   * @return arg0
  */
  @ApiModelProperty(value = "")


  public String getArg0() {
    return arg0;
  }

  public void setArg0(String arg0) {
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
    InlineObject141 inlineObject141 = (InlineObject141) o;
    return Objects.equals(this.arg2, inlineObject141.arg2) &&
        Objects.equals(this.arg1, inlineObject141.arg1) &&
        Objects.equals(this.arg0, inlineObject141.arg0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arg2, arg1, arg0);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject141 {\n");
    
    sb.append("    arg2: ").append(toIndentedString(arg2)).append("\n");
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

