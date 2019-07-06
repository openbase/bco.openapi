package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseKinectPostureJoint;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseKinectPostureJointPair
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseKinectPostureJointPair   {
  @JsonProperty("first")
  private OpenbaseKinectPostureJoint first = null;

  @JsonProperty("second")
  private OpenbaseKinectPostureJoint second = null;

  public OpenbaseKinectPostureJointPair first(OpenbaseKinectPostureJoint first) {
    this.first = first;
    return this;
  }

  /**
   * Get first
   * @return first
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseKinectPostureJoint getFirst() {
    return first;
  }

  public void setFirst(OpenbaseKinectPostureJoint first) {
    this.first = first;
  }

  public OpenbaseKinectPostureJointPair second(OpenbaseKinectPostureJoint second) {
    this.second = second;
    return this;
  }

  /**
   * Get second
   * @return second
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseKinectPostureJoint getSecond() {
    return second;
  }

  public void setSecond(OpenbaseKinectPostureJoint second) {
    this.second = second;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseKinectPostureJointPair openbaseKinectPostureJointPair = (OpenbaseKinectPostureJointPair) o;
    return Objects.equals(this.first, openbaseKinectPostureJointPair.first) &&
        Objects.equals(this.second, openbaseKinectPostureJointPair.second);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, second);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseKinectPostureJointPair {\n");
    
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    second: ").append(toIndentedString(second)).append("\n");
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
