package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseTranslation;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseAxisAlignedBoundingBox3DFloat
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-29T22:47:43.327074+02:00[Europe/Berlin]")

public class OpenbaseAxisAlignedBoundingBox3DFloat   {
  @JsonProperty("depth")
  private Float depth;

  @JsonProperty("height")
  private Float height;

  @JsonProperty("left_front_bottom")
  private OpenbaseTranslation leftFrontBottom = null;

  @JsonProperty("width")
  private Float width;

  public OpenbaseAxisAlignedBoundingBox3DFloat depth(Float depth) {
    this.depth = depth;
    return this;
  }

  /**
   * Get depth
   * @return depth
  */
  @ApiModelProperty(value = "")


  public Float getDepth() {
    return depth;
  }

  public void setDepth(Float depth) {
    this.depth = depth;
  }

  public OpenbaseAxisAlignedBoundingBox3DFloat height(Float height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  */
  @ApiModelProperty(value = "")


  public Float getHeight() {
    return height;
  }

  public void setHeight(Float height) {
    this.height = height;
  }

  public OpenbaseAxisAlignedBoundingBox3DFloat leftFrontBottom(OpenbaseTranslation leftFrontBottom) {
    this.leftFrontBottom = leftFrontBottom;
    return this;
  }

  /**
   * Get leftFrontBottom
   * @return leftFrontBottom
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTranslation getLeftFrontBottom() {
    return leftFrontBottom;
  }

  public void setLeftFrontBottom(OpenbaseTranslation leftFrontBottom) {
    this.leftFrontBottom = leftFrontBottom;
  }

  public OpenbaseAxisAlignedBoundingBox3DFloat width(Float width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
  */
  @ApiModelProperty(value = "")


  public Float getWidth() {
    return width;
  }

  public void setWidth(Float width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseAxisAlignedBoundingBox3DFloat openbaseAxisAlignedBoundingBox3DFloat = (OpenbaseAxisAlignedBoundingBox3DFloat) o;
    return Objects.equals(this.depth, openbaseAxisAlignedBoundingBox3DFloat.depth) &&
        Objects.equals(this.height, openbaseAxisAlignedBoundingBox3DFloat.height) &&
        Objects.equals(this.leftFrontBottom, openbaseAxisAlignedBoundingBox3DFloat.leftFrontBottom) &&
        Objects.equals(this.width, openbaseAxisAlignedBoundingBox3DFloat.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depth, height, leftFrontBottom, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseAxisAlignedBoundingBox3DFloat {\n");
    
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    leftFrontBottom: ").append(toIndentedString(leftFrontBottom)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

