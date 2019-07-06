package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseTimestamp;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseInterval
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

public class OpenbaseInterval   {
  @JsonProperty("begin")
  private OpenbaseTimestamp begin = null;

  @JsonProperty("end")
  private OpenbaseTimestamp end = null;

  public OpenbaseInterval begin(OpenbaseTimestamp begin) {
    this.begin = begin;
    return this;
  }

  /**
   * Get begin
   * @return begin
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTimestamp getBegin() {
    return begin;
  }

  public void setBegin(OpenbaseTimestamp begin) {
    this.begin = begin;
  }

  public OpenbaseInterval end(OpenbaseTimestamp end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTimestamp getEnd() {
    return end;
  }

  public void setEnd(OpenbaseTimestamp end) {
    this.end = end;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseInterval openbaseInterval = (OpenbaseInterval) o;
    return Objects.equals(this.begin, openbaseInterval.begin) &&
        Objects.equals(this.end, openbaseInterval.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(begin, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseInterval {\n");
    
    sb.append("    begin: ").append(toIndentedString(begin)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

