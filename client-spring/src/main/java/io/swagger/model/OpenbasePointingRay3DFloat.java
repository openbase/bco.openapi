package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbasePointingRay3DFloatPointingType;
import io.swagger.model.OpenbaseRay3DFloat;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbasePointingRay3DFloat
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbasePointingRay3DFloat   {
  @JsonProperty("certainty")
  private Float certainty = null;

  @JsonProperty("ray")
  private OpenbaseRay3DFloat ray = null;

  @JsonProperty("right_hand_pointing")
  private Boolean rightHandPointing = null;

  @JsonProperty("type")
  private OpenbasePointingRay3DFloatPointingType type = null;

  public OpenbasePointingRay3DFloat certainty(Float certainty) {
    this.certainty = certainty;
    return this;
  }

  /**
   * Get certainty
   * @return certainty
  **/
  @ApiModelProperty(value = "")

  public Float getCertainty() {
    return certainty;
  }

  public void setCertainty(Float certainty) {
    this.certainty = certainty;
  }

  public OpenbasePointingRay3DFloat ray(OpenbaseRay3DFloat ray) {
    this.ray = ray;
    return this;
  }

  /**
   * Get ray
   * @return ray
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseRay3DFloat getRay() {
    return ray;
  }

  public void setRay(OpenbaseRay3DFloat ray) {
    this.ray = ray;
  }

  public OpenbasePointingRay3DFloat rightHandPointing(Boolean rightHandPointing) {
    this.rightHandPointing = rightHandPointing;
    return this;
  }

  /**
   * Get rightHandPointing
   * @return rightHandPointing
  **/
  @ApiModelProperty(value = "")

  public Boolean isRightHandPointing() {
    return rightHandPointing;
  }

  public void setRightHandPointing(Boolean rightHandPointing) {
    this.rightHandPointing = rightHandPointing;
  }

  public OpenbasePointingRay3DFloat type(OpenbasePointingRay3DFloatPointingType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbasePointingRay3DFloatPointingType getType() {
    return type;
  }

  public void setType(OpenbasePointingRay3DFloatPointingType type) {
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
    OpenbasePointingRay3DFloat openbasePointingRay3DFloat = (OpenbasePointingRay3DFloat) o;
    return Objects.equals(this.certainty, openbasePointingRay3DFloat.certainty) &&
        Objects.equals(this.ray, openbasePointingRay3DFloat.ray) &&
        Objects.equals(this.rightHandPointing, openbasePointingRay3DFloat.rightHandPointing) &&
        Objects.equals(this.type, openbasePointingRay3DFloat.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certainty, ray, rightHandPointing, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbasePointingRay3DFloat {\n");
    
    sb.append("    certainty: ").append(toIndentedString(certainty)).append("\n");
    sb.append("    ray: ").append(toIndentedString(ray)).append("\n");
    sb.append("    rightHandPointing: ").append(toIndentedString(rightHandPointing)).append("\n");
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
