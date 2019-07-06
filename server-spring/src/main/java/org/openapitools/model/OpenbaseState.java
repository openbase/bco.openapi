package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseStateAspect;
import org.openapitools.model.OpenbaseTrackingInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseState
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

public class OpenbaseState   {
  @JsonProperty("aspect")
  @Valid
  private List<OpenbaseStateAspect> aspect = null;

  @JsonProperty("info")
  private OpenbaseTrackingInfo info = null;

  public OpenbaseState aspect(List<OpenbaseStateAspect> aspect) {
    this.aspect = aspect;
    return this;
  }

  public OpenbaseState addAspectItem(OpenbaseStateAspect aspectItem) {
    if (this.aspect == null) {
      this.aspect = new ArrayList<>();
    }
    this.aspect.add(aspectItem);
    return this;
  }

  /**
   * Get aspect
   * @return aspect
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseStateAspect> getAspect() {
    return aspect;
  }

  public void setAspect(List<OpenbaseStateAspect> aspect) {
    this.aspect = aspect;
  }

  public OpenbaseState info(OpenbaseTrackingInfo info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTrackingInfo getInfo() {
    return info;
  }

  public void setInfo(OpenbaseTrackingInfo info) {
    this.info = info;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseState openbaseState = (OpenbaseState) o;
    return Objects.equals(this.aspect, openbaseState.aspect) &&
        Objects.equals(this.info, openbaseState.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspect, info);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseState {\n");
    
    sb.append("    aspect: ").append(toIndentedString(aspect)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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

