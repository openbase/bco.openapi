package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseServiceDescription;
import org.openapitools.model.OpenbaseUnitTemplateUnitType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseUnitGroupConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseUnitGroupConfig   {
  @JsonProperty("member_id")
  @Valid
  private List<String> memberId = null;

  @JsonProperty("service_description")
  @Valid
  private List<OpenbaseServiceDescription> serviceDescription = null;

  @JsonProperty("unit_type")
  private OpenbaseUnitTemplateUnitType unitType;

  public OpenbaseUnitGroupConfig memberId(List<String> memberId) {
    this.memberId = memberId;
    return this;
  }

  public OpenbaseUnitGroupConfig addMemberIdItem(String memberIdItem) {
    if (this.memberId == null) {
      this.memberId = new ArrayList<>();
    }
    this.memberId.add(memberIdItem);
    return this;
  }

  /**
   * Get memberId
   * @return memberId
  */
  @ApiModelProperty(value = "")


  public List<String> getMemberId() {
    return memberId;
  }

  public void setMemberId(List<String> memberId) {
    this.memberId = memberId;
  }

  public OpenbaseUnitGroupConfig serviceDescription(List<OpenbaseServiceDescription> serviceDescription) {
    this.serviceDescription = serviceDescription;
    return this;
  }

  public OpenbaseUnitGroupConfig addServiceDescriptionItem(OpenbaseServiceDescription serviceDescriptionItem) {
    if (this.serviceDescription == null) {
      this.serviceDescription = new ArrayList<>();
    }
    this.serviceDescription.add(serviceDescriptionItem);
    return this;
  }

  /**
   * Get serviceDescription
   * @return serviceDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseServiceDescription> getServiceDescription() {
    return serviceDescription;
  }

  public void setServiceDescription(List<OpenbaseServiceDescription> serviceDescription) {
    this.serviceDescription = serviceDescription;
  }

  public OpenbaseUnitGroupConfig unitType(OpenbaseUnitTemplateUnitType unitType) {
    this.unitType = unitType;
    return this;
  }

  /**
   * Get unitType
   * @return unitType
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseUnitTemplateUnitType getUnitType() {
    return unitType;
  }

  public void setUnitType(OpenbaseUnitTemplateUnitType unitType) {
    this.unitType = unitType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseUnitGroupConfig openbaseUnitGroupConfig = (OpenbaseUnitGroupConfig) o;
    return Objects.equals(this.memberId, openbaseUnitGroupConfig.memberId) &&
        Objects.equals(this.serviceDescription, openbaseUnitGroupConfig.serviceDescription) &&
        Objects.equals(this.unitType, openbaseUnitGroupConfig.unitType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, serviceDescription, unitType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseUnitGroupConfig {\n");
    
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    serviceDescription: ").append(toIndentedString(serviceDescription)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
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

