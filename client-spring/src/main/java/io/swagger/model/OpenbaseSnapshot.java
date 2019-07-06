package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseServiceStateDescription;
import io.swagger.model.OpenbaseTimestamp;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseSnapshot
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseSnapshot   {
  @JsonProperty("record_time")
  private OpenbaseTimestamp recordTime = null;

  @JsonProperty("service_state_description")
  @Valid
  private List<OpenbaseServiceStateDescription> serviceStateDescription = null;

  public OpenbaseSnapshot recordTime(OpenbaseTimestamp recordTime) {
    this.recordTime = recordTime;
    return this;
  }

  /**
   * Get recordTime
   * @return recordTime
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseTimestamp getRecordTime() {
    return recordTime;
  }

  public void setRecordTime(OpenbaseTimestamp recordTime) {
    this.recordTime = recordTime;
  }

  public OpenbaseSnapshot serviceStateDescription(List<OpenbaseServiceStateDescription> serviceStateDescription) {
    this.serviceStateDescription = serviceStateDescription;
    return this;
  }

  public OpenbaseSnapshot addServiceStateDescriptionItem(OpenbaseServiceStateDescription serviceStateDescriptionItem) {
    if (this.serviceStateDescription == null) {
      this.serviceStateDescription = new ArrayList<OpenbaseServiceStateDescription>();
    }
    this.serviceStateDescription.add(serviceStateDescriptionItem);
    return this;
  }

  /**
   * Get serviceStateDescription
   * @return serviceStateDescription
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbaseServiceStateDescription> getServiceStateDescription() {
    return serviceStateDescription;
  }

  public void setServiceStateDescription(List<OpenbaseServiceStateDescription> serviceStateDescription) {
    this.serviceStateDescription = serviceStateDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseSnapshot openbaseSnapshot = (OpenbaseSnapshot) o;
    return Objects.equals(this.recordTime, openbaseSnapshot.recordTime) &&
        Objects.equals(this.serviceStateDescription, openbaseSnapshot.serviceStateDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordTime, serviceStateDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseSnapshot {\n");
    
    sb.append("    recordTime: ").append(toIndentedString(recordTime)).append("\n");
    sb.append("    serviceStateDescription: ").append(toIndentedString(serviceStateDescription)).append("\n");
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
