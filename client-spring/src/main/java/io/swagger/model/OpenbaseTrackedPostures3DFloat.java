package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseTrackedPosture3DFloat;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseTrackedPostures3DFloat
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseTrackedPostures3DFloat   {
  @JsonProperty("posture")
  @Valid
  private List<OpenbaseTrackedPosture3DFloat> posture = null;

  public OpenbaseTrackedPostures3DFloat posture(List<OpenbaseTrackedPosture3DFloat> posture) {
    this.posture = posture;
    return this;
  }

  public OpenbaseTrackedPostures3DFloat addPostureItem(OpenbaseTrackedPosture3DFloat postureItem) {
    if (this.posture == null) {
      this.posture = new ArrayList<OpenbaseTrackedPosture3DFloat>();
    }
    this.posture.add(postureItem);
    return this;
  }

  /**
   * Get posture
   * @return posture
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbaseTrackedPosture3DFloat> getPosture() {
    return posture;
  }

  public void setPosture(List<OpenbaseTrackedPosture3DFloat> posture) {
    this.posture = posture;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseTrackedPostures3DFloat openbaseTrackedPostures3DFloat = (OpenbaseTrackedPostures3DFloat) o;
    return Objects.equals(this.posture, openbaseTrackedPostures3DFloat.posture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(posture);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseTrackedPostures3DFloat {\n");
    
    sb.append("    posture: ").append(toIndentedString(posture)).append("\n");
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
