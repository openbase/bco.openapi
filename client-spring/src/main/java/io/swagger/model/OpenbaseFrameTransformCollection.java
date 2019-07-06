package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseFrameTransform;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseFrameTransformCollection
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseFrameTransformCollection   {
  @JsonProperty("transforms")
  @Valid
  private List<OpenbaseFrameTransform> transforms = null;

  public OpenbaseFrameTransformCollection transforms(List<OpenbaseFrameTransform> transforms) {
    this.transforms = transforms;
    return this;
  }

  public OpenbaseFrameTransformCollection addTransformsItem(OpenbaseFrameTransform transformsItem) {
    if (this.transforms == null) {
      this.transforms = new ArrayList<OpenbaseFrameTransform>();
    }
    this.transforms.add(transformsItem);
    return this;
  }

  /**
   * Get transforms
   * @return transforms
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbaseFrameTransform> getTransforms() {
    return transforms;
  }

  public void setTransforms(List<OpenbaseFrameTransform> transforms) {
    this.transforms = transforms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseFrameTransformCollection openbaseFrameTransformCollection = (OpenbaseFrameTransformCollection) o;
    return Objects.equals(this.transforms, openbaseFrameTransformCollection.transforms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transforms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseFrameTransformCollection {\n");
    
    sb.append("    transforms: ").append(toIndentedString(transforms)).append("\n");
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
