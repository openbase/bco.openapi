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
 * OpenbaseHSBColor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseHSBColor   {
  @JsonProperty("brightness")
  private Double brightness;

  @JsonProperty("hue")
  private Double hue;

  @JsonProperty("saturation")
  private Double saturation;

  public OpenbaseHSBColor brightness(Double brightness) {
    this.brightness = brightness;
    return this;
  }

  /**
   * Get brightness
   * @return brightness
  */
  @ApiModelProperty(value = "")


  public Double getBrightness() {
    return brightness;
  }

  public void setBrightness(Double brightness) {
    this.brightness = brightness;
  }

  public OpenbaseHSBColor hue(Double hue) {
    this.hue = hue;
    return this;
  }

  /**
   * Get hue
   * @return hue
  */
  @ApiModelProperty(value = "")


  public Double getHue() {
    return hue;
  }

  public void setHue(Double hue) {
    this.hue = hue;
  }

  public OpenbaseHSBColor saturation(Double saturation) {
    this.saturation = saturation;
    return this;
  }

  /**
   * Get saturation
   * @return saturation
  */
  @ApiModelProperty(value = "")


  public Double getSaturation() {
    return saturation;
  }

  public void setSaturation(Double saturation) {
    this.saturation = saturation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseHSBColor openbaseHSBColor = (OpenbaseHSBColor) o;
    return Objects.equals(this.brightness, openbaseHSBColor.brightness) &&
        Objects.equals(this.hue, openbaseHSBColor.hue) &&
        Objects.equals(this.saturation, openbaseHSBColor.saturation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brightness, hue, saturation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseHSBColor {\n");
    
    sb.append("    brightness: ").append(toIndentedString(brightness)).append("\n");
    sb.append("    hue: ").append(toIndentedString(hue)).append("\n");
    sb.append("    saturation: ").append(toIndentedString(saturation)).append("\n");
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

