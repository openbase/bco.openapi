package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseActionDescription;
import io.swagger.model.OpenbaseTimestamp;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseGlobalPositionState
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseGlobalPositionState   {
  @JsonProperty("elevation")
  private Double elevation = null;

  @JsonProperty("latitude")
  private Double latitude = null;

  @JsonProperty("longitude")
  private Double longitude = null;

  @JsonProperty("responsible_action")
  private OpenbaseActionDescription responsibleAction = null;

  @JsonProperty("timestamp")
  private OpenbaseTimestamp timestamp = null;

  public OpenbaseGlobalPositionState elevation(Double elevation) {
    this.elevation = elevation;
    return this;
  }

  /**
   * Get elevation
   * @return elevation
  **/
  @ApiModelProperty(value = "")

  public Double getElevation() {
    return elevation;
  }

  public void setElevation(Double elevation) {
    this.elevation = elevation;
  }

  public OpenbaseGlobalPositionState latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "")

  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public OpenbaseGlobalPositionState longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "")

  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public OpenbaseGlobalPositionState responsibleAction(OpenbaseActionDescription responsibleAction) {
    this.responsibleAction = responsibleAction;
    return this;
  }

  /**
   * Get responsibleAction
   * @return responsibleAction
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseActionDescription getResponsibleAction() {
    return responsibleAction;
  }

  public void setResponsibleAction(OpenbaseActionDescription responsibleAction) {
    this.responsibleAction = responsibleAction;
  }

  public OpenbaseGlobalPositionState timestamp(OpenbaseTimestamp timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseTimestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OpenbaseTimestamp timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseGlobalPositionState openbaseGlobalPositionState = (OpenbaseGlobalPositionState) o;
    return Objects.equals(this.elevation, openbaseGlobalPositionState.elevation) &&
        Objects.equals(this.latitude, openbaseGlobalPositionState.latitude) &&
        Objects.equals(this.longitude, openbaseGlobalPositionState.longitude) &&
        Objects.equals(this.responsibleAction, openbaseGlobalPositionState.responsibleAction) &&
        Objects.equals(this.timestamp, openbaseGlobalPositionState.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elevation, latitude, longitude, responsibleAction, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseGlobalPositionState {\n");
    
    sb.append("    elevation: ").append(toIndentedString(elevation)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    responsibleAction: ").append(toIndentedString(responsibleAction)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
