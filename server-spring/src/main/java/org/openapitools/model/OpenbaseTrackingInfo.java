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
 * OpenbaseTrackingInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-29T22:47:43.327074+02:00[Europe/Berlin]")

public class OpenbaseTrackingInfo   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("persistent_id")
  private String persistentId;

  public OpenbaseTrackingInfo id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public OpenbaseTrackingInfo persistentId(String persistentId) {
    this.persistentId = persistentId;
    return this;
  }

  /**
   * Get persistentId
   * @return persistentId
  */
  @ApiModelProperty(value = "")


  public String getPersistentId() {
    return persistentId;
  }

  public void setPersistentId(String persistentId) {
    this.persistentId = persistentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseTrackingInfo openbaseTrackingInfo = (OpenbaseTrackingInfo) o;
    return Objects.equals(this.id, openbaseTrackingInfo.id) &&
        Objects.equals(this.persistentId, openbaseTrackingInfo.persistentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, persistentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseTrackingInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    persistentId: ").append(toIndentedString(persistentId)).append("\n");
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

