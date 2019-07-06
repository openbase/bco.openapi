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
 * OpenbaseTimestamp
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbaseTimestamp   {
  @JsonProperty("time")
  private Long time;

  public OpenbaseTimestamp time(Long time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @ApiModelProperty(value = "")


  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseTimestamp openbaseTimestamp = (OpenbaseTimestamp) o;
    return Objects.equals(this.time, openbaseTimestamp.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseTimestamp {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

