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
 * OpenbaseTranslation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-29T22:47:43.327074+02:00[Europe/Berlin]")

public class OpenbaseTranslation   {
  @JsonProperty("frame_id")
  private String frameId;

  @JsonProperty("x")
  private Double x;

  @JsonProperty("y")
  private Double y;

  @JsonProperty("z")
  private Double z;

  public OpenbaseTranslation frameId(String frameId) {
    this.frameId = frameId;
    return this;
  }

  /**
   * Get frameId
   * @return frameId
  */
  @ApiModelProperty(value = "")


  public String getFrameId() {
    return frameId;
  }

  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  public OpenbaseTranslation x(Double x) {
    this.x = x;
    return this;
  }

  /**
   * Get x
   * @return x
  */
  @ApiModelProperty(value = "")


  public Double getX() {
    return x;
  }

  public void setX(Double x) {
    this.x = x;
  }

  public OpenbaseTranslation y(Double y) {
    this.y = y;
    return this;
  }

  /**
   * Get y
   * @return y
  */
  @ApiModelProperty(value = "")


  public Double getY() {
    return y;
  }

  public void setY(Double y) {
    this.y = y;
  }

  public OpenbaseTranslation z(Double z) {
    this.z = z;
    return this;
  }

  /**
   * Get z
   * @return z
  */
  @ApiModelProperty(value = "")


  public Double getZ() {
    return z;
  }

  public void setZ(Double z) {
    this.z = z;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseTranslation openbaseTranslation = (OpenbaseTranslation) o;
    return Objects.equals(this.frameId, openbaseTranslation.frameId) &&
        Objects.equals(this.x, openbaseTranslation.x) &&
        Objects.equals(this.y, openbaseTranslation.y) &&
        Objects.equals(this.z, openbaseTranslation.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frameId, x, y, z);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseTranslation {\n");
    
    sb.append("    frameId: ").append(toIndentedString(frameId)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
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

