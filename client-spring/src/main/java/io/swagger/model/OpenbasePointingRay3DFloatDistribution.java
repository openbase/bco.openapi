package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbasePointingRay3DFloat;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbasePointingRay3DFloatDistribution
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbasePointingRay3DFloatDistribution   {
  @JsonProperty("ray")
  @Valid
  private List<OpenbasePointingRay3DFloat> ray = null;

  public OpenbasePointingRay3DFloatDistribution ray(List<OpenbasePointingRay3DFloat> ray) {
    this.ray = ray;
    return this;
  }

  public OpenbasePointingRay3DFloatDistribution addRayItem(OpenbasePointingRay3DFloat rayItem) {
    if (this.ray == null) {
      this.ray = new ArrayList<OpenbasePointingRay3DFloat>();
    }
    this.ray.add(rayItem);
    return this;
  }

  /**
   * Get ray
   * @return ray
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbasePointingRay3DFloat> getRay() {
    return ray;
  }

  public void setRay(List<OpenbasePointingRay3DFloat> ray) {
    this.ray = ray;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbasePointingRay3DFloatDistribution openbasePointingRay3DFloatDistribution = (OpenbasePointingRay3DFloatDistribution) o;
    return Objects.equals(this.ray, openbasePointingRay3DFloatDistribution.ray);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ray);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbasePointingRay3DFloatDistribution {\n");
    
    sb.append("    ray: ").append(toIndentedString(ray)).append("\n");
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
