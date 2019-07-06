package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseVec3DFloat;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseRay3DFloat
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbaseRay3DFloat   {
  @JsonProperty("direction")
  private OpenbaseVec3DFloat direction = null;

  @JsonProperty("origin")
  private OpenbaseVec3DFloat origin = null;

  public OpenbaseRay3DFloat direction(OpenbaseVec3DFloat direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseVec3DFloat getDirection() {
    return direction;
  }

  public void setDirection(OpenbaseVec3DFloat direction) {
    this.direction = direction;
  }

  public OpenbaseRay3DFloat origin(OpenbaseVec3DFloat origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Get origin
   * @return origin
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseVec3DFloat getOrigin() {
    return origin;
  }

  public void setOrigin(OpenbaseVec3DFloat origin) {
    this.origin = origin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseRay3DFloat openbaseRay3DFloat = (OpenbaseRay3DFloat) o;
    return Objects.equals(this.direction, openbaseRay3DFloat.direction) &&
        Objects.equals(this.origin, openbaseRay3DFloat.origin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, origin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseRay3DFloat {\n");
    
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
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

