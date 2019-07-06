package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseServiceTemplateServicePattern;
import io.swagger.model.OpenbaseServiceTemplateServiceType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Body
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class Body   {
  @JsonProperty("serviceType")
  private OpenbaseServiceTemplateServiceType serviceType = null;

  @JsonProperty("servicePattern")
  private OpenbaseServiceTemplateServicePattern servicePattern = null;

  public Body serviceType(OpenbaseServiceTemplateServiceType serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Get serviceType
   * @return serviceType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseServiceTemplateServiceType getServiceType() {
    return serviceType;
  }

  public void setServiceType(OpenbaseServiceTemplateServiceType serviceType) {
    this.serviceType = serviceType;
  }

  public Body servicePattern(OpenbaseServiceTemplateServicePattern servicePattern) {
    this.servicePattern = servicePattern;
    return this;
  }

  /**
   * Get servicePattern
   * @return servicePattern
  **/
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
    Body body = (Body) o;
    return Objects.equals(this.serviceType, body.serviceType) &&
        Objects.equals(this.servicePattern, body.servicePattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceType, servicePattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body {\n");
    
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
