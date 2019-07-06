package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseKinectPostureJointJoint;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseKinectPostureJoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseKinectPostureJoint   {
  @JsonProperty("joint")
  private OpenbaseKinectPostureJointJoint joint;

  public OpenbaseKinectPostureJoint joint(OpenbaseKinectPostureJointJoint joint) {
    this.joint = joint;
    return this;
  }

  /**
   * Get joint
   * @return joint
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseKinectPostureJointJoint getJoint() {
    return joint;
  }

  public void setJoint(OpenbaseKinectPostureJointJoint joint) {
    this.joint = joint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseKinectPostureJoint openbaseKinectPostureJoint = (OpenbaseKinectPostureJoint) o;
    return Objects.equals(this.joint, openbaseKinectPostureJoint.joint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(joint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseKinectPostureJoint {\n");
    
    sb.append("    joint: ").append(toIndentedString(joint)).append("\n");
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

