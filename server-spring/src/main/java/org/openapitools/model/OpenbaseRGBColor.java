package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseRGBColor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

public class OpenbaseRGBColor   {
  @JsonProperty("blue")
  private Integer blue;

  @JsonProperty("green")
  private Integer green;

  @JsonProperty("red")
  private Integer red;

  public OpenbaseRGBColor blue(Integer blue) {
    this.blue = blue;
    return this;
  }

  /**
   * Get blue
   * @return blue
  */
  @ApiModelProperty(value = "")


  public Integer getBlue() {
    return blue;
  }

  public void setBlue(Integer blue) {
    this.blue = blue;
  }

  public OpenbaseRGBColor green(Integer green) {
    this.green = green;
    return this;
  }

  /**
   * Get green
   * @return green
  */
  @ApiModelProperty(value = "")


  public Integer getGreen() {
    return green;
  }

  public void setGreen(Integer green) {
    this.green = green;
  }

  public OpenbaseRGBColor red(Integer red) {
    this.red = red;
    return this;
  }

  /**
   * Get red
   * @return red
  */
  @ApiModelProperty(value = "")


  public Integer getRed() {
    return red;
  }

  public void setRed(Integer red) {
    this.red = red;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseRGBColor openbaseRGBColor = (OpenbaseRGBColor) o;
    return Objects.equals(this.blue, openbaseRGBColor.blue) &&
        Objects.equals(this.green, openbaseRGBColor.green) &&
        Objects.equals(this.red, openbaseRGBColor.red);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blue, green, red);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseRGBColor {\n");
    
    sb.append("    blue: ").append(toIndentedString(blue)).append("\n");
    sb.append("    green: ").append(toIndentedString(green)).append("\n");
    sb.append("    red: ").append(toIndentedString(red)).append("\n");
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

