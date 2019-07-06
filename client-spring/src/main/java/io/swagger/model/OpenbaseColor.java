package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseColorType;
import io.swagger.model.OpenbaseHSBColor;
import io.swagger.model.OpenbaseRGBColor;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseColor
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseColor   {
  @JsonProperty("hsb_color")
  private OpenbaseHSBColor hsbColor = null;

  @JsonProperty("rgb_color")
  private OpenbaseRGBColor rgbColor = null;

  @JsonProperty("type")
  private OpenbaseColorType type = null;

  public OpenbaseColor hsbColor(OpenbaseHSBColor hsbColor) {
    this.hsbColor = hsbColor;
    return this;
  }

  /**
   * Get hsbColor
   * @return hsbColor
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseHSBColor getHsbColor() {
    return hsbColor;
  }

  public void setHsbColor(OpenbaseHSBColor hsbColor) {
    this.hsbColor = hsbColor;
  }

  public OpenbaseColor rgbColor(OpenbaseRGBColor rgbColor) {
    this.rgbColor = rgbColor;
    return this;
  }

  /**
   * Get rgbColor
   * @return rgbColor
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseRGBColor getRgbColor() {
    return rgbColor;
  }

  public void setRgbColor(OpenbaseRGBColor rgbColor) {
    this.rgbColor = rgbColor;
  }

  public OpenbaseColor type(OpenbaseColorType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseColorType getType() {
    return type;
  }

  public void setType(OpenbaseColorType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseColor openbaseColor = (OpenbaseColor) o;
    return Objects.equals(this.hsbColor, openbaseColor.hsbColor) &&
        Objects.equals(this.rgbColor, openbaseColor.rgbColor) &&
        Objects.equals(this.type, openbaseColor.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hsbColor, rgbColor, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseColor {\n");
    
    sb.append("    hsbColor: ").append(toIndentedString(hsbColor)).append("\n");
    sb.append("    rgbColor: ").append(toIndentedString(rgbColor)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
