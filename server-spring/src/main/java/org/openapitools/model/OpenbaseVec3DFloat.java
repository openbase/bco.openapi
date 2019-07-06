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
 * OpenbaseVec3DFloat
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

public class OpenbaseVec3DFloat   {
  @JsonProperty("x")
  private Float x;

  @JsonProperty("y")
  private Float y;

  @JsonProperty("z")
  private Float z;

  public OpenbaseVec3DFloat x(Float x) {
    this.x = x;
    return this;
  }

  /**
   * Get x
   * @return x
  */
  @ApiModelProperty(value = "")


  public Float getX() {
    return x;
  }

  public void setX(Float x) {
    this.x = x;
  }

  public OpenbaseVec3DFloat y(Float y) {
    this.y = y;
    return this;
  }

  /**
   * Get y
   * @return y
  */
  @ApiModelProperty(value = "")


  public Float getY() {
    return y;
  }

  public void setY(Float y) {
    this.y = y;
  }

  public OpenbaseVec3DFloat z(Float z) {
    this.z = z;
    return this;
  }

  /**
   * Get z
   * @return z
  */
  @ApiModelProperty(value = "")


  public Float getZ() {
    return z;
  }

  public void setZ(Float z) {
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
    OpenbaseVec3DFloat openbaseVec3DFloat = (OpenbaseVec3DFloat) o;
    return Objects.equals(this.x, openbaseVec3DFloat.x) &&
        Objects.equals(this.y, openbaseVec3DFloat.y) &&
        Objects.equals(this.z, openbaseVec3DFloat.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseVec3DFloat {\n");
    
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

