package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseActionDescription;
import io.swagger.model.OpenbaseBrightnessStateDataUnit;
import io.swagger.model.OpenbaseTimestamp;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseBrightnessState
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseBrightnessState   {
  @JsonProperty("brightness")
  private Double brightness = null;

  @JsonProperty("brightness_data_unit")
  private OpenbaseBrightnessStateDataUnit brightnessDataUnit = null;

  @JsonProperty("responsible_action")
  private OpenbaseActionDescription responsibleAction = null;

  @JsonProperty("timestamp")
  private OpenbaseTimestamp timestamp = null;

  public OpenbaseBrightnessState brightness(Double brightness) {
    this.brightness = brightness;
    return this;
  }

  /**
   * Get brightness
   * @return brightness
  **/
  @ApiModelProperty(value = "")

  public Double getBrightness() {
    return brightness;
  }

  public void setBrightness(Double brightness) {
    this.brightness = brightness;
  }

  public OpenbaseBrightnessState brightnessDataUnit(OpenbaseBrightnessStateDataUnit brightnessDataUnit) {
    this.brightnessDataUnit = brightnessDataUnit;
    return this;
  }

  /**
   * Get brightnessDataUnit
   * @return brightnessDataUnit
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseBrightnessStateDataUnit getBrightnessDataUnit() {
    return brightnessDataUnit;
  }

  public void setBrightnessDataUnit(OpenbaseBrightnessStateDataUnit brightnessDataUnit) {
    this.brightnessDataUnit = brightnessDataUnit;
  }

  public OpenbaseBrightnessState responsibleAction(OpenbaseActionDescription responsibleAction) {
    this.responsibleAction = responsibleAction;
    return this;
  }

  /**
   * Get responsibleAction
   * @return responsibleAction
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseActionDescription getResponsibleAction() {
    return responsibleAction;
  }

  public void setResponsibleAction(OpenbaseActionDescription responsibleAction) {
    this.responsibleAction = responsibleAction;
  }

  public OpenbaseBrightnessState timestamp(OpenbaseTimestamp timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseTimestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OpenbaseTimestamp timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseBrightnessState openbaseBrightnessState = (OpenbaseBrightnessState) o;
    return Objects.equals(this.brightness, openbaseBrightnessState.brightness) &&
        Objects.equals(this.brightnessDataUnit, openbaseBrightnessState.brightnessDataUnit) &&
        Objects.equals(this.responsibleAction, openbaseBrightnessState.responsibleAction) &&
        Objects.equals(this.timestamp, openbaseBrightnessState.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brightness, brightnessDataUnit, responsibleAction, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseBrightnessState {\n");
    
    sb.append("    brightness: ").append(toIndentedString(brightness)).append("\n");
    sb.append("    brightnessDataUnit: ").append(toIndentedString(brightnessDataUnit)).append("\n");
    sb.append("    responsibleAction: ").append(toIndentedString(responsibleAction)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
