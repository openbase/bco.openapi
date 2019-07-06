package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbasePanTiltAngle
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbasePanTiltAngle   {
  @JsonProperty("pan")
  private Float pan = null;

  @JsonProperty("tilt")
  private Float tilt = null;

  public OpenbasePanTiltAngle pan(Float pan) {
    this.pan = pan;
    return this;
  }

  /**
   * Get pan
   * @return pan
  **/
  @ApiModelProperty(value = "")

  public Float getPan() {
    return pan;
  }

  public void setPan(Float pan) {
    this.pan = pan;
  }

  public OpenbasePanTiltAngle tilt(Float tilt) {
    this.tilt = tilt;
    return this;
  }

  /**
   * Get tilt
   * @return tilt
  **/
  @ApiModelProperty(value = "")

  public Float getTilt() {
    return tilt;
  }

  public void setTilt(Float tilt) {
    this.tilt = tilt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbasePanTiltAngle openbasePanTiltAngle = (OpenbasePanTiltAngle) o;
    return Objects.equals(this.pan, openbasePanTiltAngle.pan) &&
        Objects.equals(this.tilt, openbasePanTiltAngle.tilt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pan, tilt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbasePanTiltAngle {\n");
    
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
    sb.append("    tilt: ").append(toIndentedString(tilt)).append("\n");
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
