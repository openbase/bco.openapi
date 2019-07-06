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
 * OpenbaseRotation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseRotation   {
  @JsonProperty("frame_id")
  private String frameId;

  @JsonProperty("qw")
  private Double qw;

  @JsonProperty("qx")
  private Double qx;

  @JsonProperty("qy")
  private Double qy;

  @JsonProperty("qz")
  private Double qz;

  public OpenbaseRotation frameId(String frameId) {
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

  public OpenbaseRotation qw(Double qw) {
    this.qw = qw;
    return this;
  }

  /**
   * Get qw
   * @return qw
  */
  @ApiModelProperty(value = "")


  public Double getQw() {
    return qw;
  }

  public void setQw(Double qw) {
    this.qw = qw;
  }

  public OpenbaseRotation qx(Double qx) {
    this.qx = qx;
    return this;
  }

  /**
   * Get qx
   * @return qx
  */
  @ApiModelProperty(value = "")


  public Double getQx() {
    return qx;
  }

  public void setQx(Double qx) {
    this.qx = qx;
  }

  public OpenbaseRotation qy(Double qy) {
    this.qy = qy;
    return this;
  }

  /**
   * Get qy
   * @return qy
  */
  @ApiModelProperty(value = "")


  public Double getQy() {
    return qy;
  }

  public void setQy(Double qy) {
    this.qy = qy;
  }

  public OpenbaseRotation qz(Double qz) {
    this.qz = qz;
    return this;
  }

  /**
   * Get qz
   * @return qz
  */
  @ApiModelProperty(value = "")


  public Double getQz() {
    return qz;
  }

  public void setQz(Double qz) {
    this.qz = qz;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseRotation openbaseRotation = (OpenbaseRotation) o;
    return Objects.equals(this.frameId, openbaseRotation.frameId) &&
        Objects.equals(this.qw, openbaseRotation.qw) &&
        Objects.equals(this.qx, openbaseRotation.qx) &&
        Objects.equals(this.qy, openbaseRotation.qy) &&
        Objects.equals(this.qz, openbaseRotation.qz);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frameId, qw, qx, qy, qz);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseRotation {\n");
    
    sb.append("    frameId: ").append(toIndentedString(frameId)).append("\n");
    sb.append("    qw: ").append(toIndentedString(qw)).append("\n");
    sb.append("    qx: ").append(toIndentedString(qx)).append("\n");
    sb.append("    qy: ").append(toIndentedString(qy)).append("\n");
    sb.append("    qz: ").append(toIndentedString(qz)).append("\n");
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

