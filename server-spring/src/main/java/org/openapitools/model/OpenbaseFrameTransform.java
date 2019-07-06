package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbasePose;
import org.openapitools.model.OpenbaseTimestamp;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseFrameTransform
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbaseFrameTransform   {
  @JsonProperty("frame_child")
  private String frameChild;

  @JsonProperty("frame_parent")
  private String frameParent;

  @JsonProperty("time")
  private OpenbaseTimestamp time = null;

  @JsonProperty("transform")
  private OpenbasePose transform = null;

  public OpenbaseFrameTransform frameChild(String frameChild) {
    this.frameChild = frameChild;
    return this;
  }

  /**
   * Get frameChild
   * @return frameChild
  */
  @ApiModelProperty(value = "")


  public String getFrameChild() {
    return frameChild;
  }

  public void setFrameChild(String frameChild) {
    this.frameChild = frameChild;
  }

  public OpenbaseFrameTransform frameParent(String frameParent) {
    this.frameParent = frameParent;
    return this;
  }

  /**
   * Get frameParent
   * @return frameParent
  */
  @ApiModelProperty(value = "")


  public String getFrameParent() {
    return frameParent;
  }

  public void setFrameParent(String frameParent) {
    this.frameParent = frameParent;
  }

  public OpenbaseFrameTransform time(OpenbaseTimestamp time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTimestamp getTime() {
    return time;
  }

  public void setTime(OpenbaseTimestamp time) {
    this.time = time;
  }

  public OpenbaseFrameTransform transform(OpenbasePose transform) {
    this.transform = transform;
    return this;
  }

  /**
   * Get transform
   * @return transform
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePose getTransform() {
    return transform;
  }

  public void setTransform(OpenbasePose transform) {
    this.transform = transform;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseFrameTransform openbaseFrameTransform = (OpenbaseFrameTransform) o;
    return Objects.equals(this.frameChild, openbaseFrameTransform.frameChild) &&
        Objects.equals(this.frameParent, openbaseFrameTransform.frameParent) &&
        Objects.equals(this.time, openbaseFrameTransform.time) &&
        Objects.equals(this.transform, openbaseFrameTransform.transform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frameChild, frameParent, time, transform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseFrameTransform {\n");
    
    sb.append("    frameChild: ").append(toIndentedString(frameChild)).append("\n");
    sb.append("    frameParent: ").append(toIndentedString(frameParent)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
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

