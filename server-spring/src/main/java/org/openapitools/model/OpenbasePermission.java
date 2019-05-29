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
 * OpenbasePermission
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-29T22:47:43.327074+02:00[Europe/Berlin]")

public class OpenbasePermission   {
  @JsonProperty("access")
  private Boolean access;

  @JsonProperty("read")
  private Boolean read;

  @JsonProperty("write")
  private Boolean write;

  public OpenbasePermission access(Boolean access) {
    this.access = access;
    return this;
  }

  /**
   * Get access
   * @return access
  */
  @ApiModelProperty(value = "")


  public Boolean getAccess() {
    return access;
  }

  public void setAccess(Boolean access) {
    this.access = access;
  }

  public OpenbasePermission read(Boolean read) {
    this.read = read;
    return this;
  }

  /**
   * Get read
   * @return read
  */
  @ApiModelProperty(value = "")


  public Boolean getRead() {
    return read;
  }

  public void setRead(Boolean read) {
    this.read = read;
  }

  public OpenbasePermission write(Boolean write) {
    this.write = write;
    return this;
  }

  /**
   * Get write
   * @return write
  */
  @ApiModelProperty(value = "")


  public Boolean getWrite() {
    return write;
  }

  public void setWrite(Boolean write) {
    this.write = write;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbasePermission openbasePermission = (OpenbasePermission) o;
    return Objects.equals(this.access, openbasePermission.access) &&
        Objects.equals(this.read, openbasePermission.read) &&
        Objects.equals(this.write, openbasePermission.write);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, read, write);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbasePermission {\n");
    
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    write: ").append(toIndentedString(write)).append("\n");
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

