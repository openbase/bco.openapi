package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseLabel;
import org.openapitools.model.OpenbaseLauncherDataLauncherState;
import org.openapitools.model.OpenbaseTimestamp;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseLauncherData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbaseLauncherData   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("label")
  private OpenbaseLabel label = null;

  @JsonProperty("launch_time")
  private OpenbaseTimestamp launchTime = null;

  @JsonProperty("launcher_state")
  private OpenbaseLauncherDataLauncherState launcherState;

  @JsonProperty("verified")
  private Boolean verified;

  public OpenbaseLauncherData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OpenbaseLauncherData label(OpenbaseLabel label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseLabel getLabel() {
    return label;
  }

  public void setLabel(OpenbaseLabel label) {
    this.label = label;
  }

  public OpenbaseLauncherData launchTime(OpenbaseTimestamp launchTime) {
    this.launchTime = launchTime;
    return this;
  }

  /**
   * Get launchTime
   * @return launchTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTimestamp getLaunchTime() {
    return launchTime;
  }

  public void setLaunchTime(OpenbaseTimestamp launchTime) {
    this.launchTime = launchTime;
  }

  public OpenbaseLauncherData launcherState(OpenbaseLauncherDataLauncherState launcherState) {
    this.launcherState = launcherState;
    return this;
  }

  /**
   * Get launcherState
   * @return launcherState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseLauncherDataLauncherState getLauncherState() {
    return launcherState;
  }

  public void setLauncherState(OpenbaseLauncherDataLauncherState launcherState) {
    this.launcherState = launcherState;
  }

  public OpenbaseLauncherData verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  /**
   * Get verified
   * @return verified
  */
  @ApiModelProperty(value = "")


  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseLauncherData openbaseLauncherData = (OpenbaseLauncherData) o;
    return Objects.equals(this.id, openbaseLauncherData.id) &&
        Objects.equals(this.label, openbaseLauncherData.label) &&
        Objects.equals(this.launchTime, openbaseLauncherData.launchTime) &&
        Objects.equals(this.launcherState, openbaseLauncherData.launcherState) &&
        Objects.equals(this.verified, openbaseLauncherData.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, launchTime, launcherState, verified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseLauncherData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    launchTime: ").append(toIndentedString(launchTime)).append("\n");
    sb.append("    launcherState: ").append(toIndentedString(launcherState)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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

