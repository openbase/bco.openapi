package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseServiceTemplateServicePattern;
import org.openapitools.model.OpenbaseServiceTemplateServiceType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class InlineObject   {
  @JsonProperty("serviceType")
  private OpenbaseServiceTemplateServiceType serviceType;

  @JsonProperty("servicePattern")
  private OpenbaseServiceTemplateServicePattern servicePattern;

  public InlineObject serviceType(OpenbaseServiceTemplateServiceType serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Get serviceType
   * @return serviceType
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseServiceTemplateServiceType getServiceType() {
    return serviceType;
  }

  public void setServiceType(OpenbaseServiceTemplateServiceType serviceType) {
    this.serviceType = serviceType;
  }

  public InlineObject servicePattern(OpenbaseServiceTemplateServicePattern servicePattern) {
    this.servicePattern = servicePattern;
    return this;
  }

  /**
   * Get servicePattern
   * @return servicePattern
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseServiceTemplateServicePattern getServicePattern() {
    return servicePattern;
  }

  public void setServicePattern(OpenbaseServiceTemplateServicePattern servicePattern) {
    this.servicePattern = servicePattern;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject inlineObject = (InlineObject) o;
    return Objects.equals(this.serviceType, inlineObject.serviceType) &&
        Objects.equals(this.servicePattern, inlineObject.servicePattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceType, servicePattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject {\n");
    
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    servicePattern: ").append(toIndentedString(servicePattern)).append("\n");
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

