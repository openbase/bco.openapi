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
 * OpenbaseVec3DDouble
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

public class OpenbaseVec3DDouble   {
  @JsonProperty("x")
  private Double x;

  @JsonProperty("y")
  private Double y;

  @JsonProperty("z")
  private Double z;

  public OpenbaseVec3DDouble x(Double x) {
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

  public OpenbaseVec3DDouble y(Double y) {
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

  public OpenbaseVec3DDouble z(Double z) {
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
    OpenbaseVec3DDouble openbaseVec3DDouble = (OpenbaseVec3DDouble) o;
    return Objects.equals(this.x, openbaseVec3DDouble.x) &&
        Objects.equals(this.y, openbaseVec3DDouble.y) &&
        Objects.equals(this.z, openbaseVec3DDouble.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseVec3DDouble {\n");
    
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

