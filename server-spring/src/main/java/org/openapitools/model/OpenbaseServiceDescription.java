package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseMetaConfig;
import org.openapitools.model.OpenbaseServiceTemplateServicePattern;
import org.openapitools.model.OpenbaseServiceTemplateServiceType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseServiceDescription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseServiceDescription   {
  @JsonProperty("aggregated")
  private Boolean aggregated;

  @JsonProperty("meta_config")
  private OpenbaseMetaConfig metaConfig = null;

  @JsonProperty("pattern")
  private OpenbaseServiceTemplateServicePattern pattern;

  @JsonProperty("service_template_id")
  private String serviceTemplateId;

  @JsonProperty("service_type")
  private OpenbaseServiceTemplateServiceType serviceType;

  public OpenbaseServiceDescription aggregated(Boolean aggregated) {
    this.aggregated = aggregated;
    return this;
  }

  /**
   * Get aggregated
   * @return aggregated
  */
  @ApiModelProperty(value = "")


  public Boolean getAggregated() {
    return aggregated;
  }

  public void setAggregated(Boolean aggregated) {
    this.aggregated = aggregated;
  }

  public OpenbaseServiceDescription metaConfig(OpenbaseMetaConfig metaConfig) {
    this.metaConfig = metaConfig;
    return this;
  }

  /**
   * Get metaConfig
   * @return metaConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseMetaConfig getMetaConfig() {
    return metaConfig;
  }

  public void setMetaConfig(OpenbaseMetaConfig metaConfig) {
    this.metaConfig = metaConfig;
  }

  public OpenbaseServiceDescription pattern(OpenbaseServiceTemplateServicePattern pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * Get pattern
   * @return pattern
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseServiceTemplateServicePattern getPattern() {
    return pattern;
  }

  public void setPattern(OpenbaseServiceTemplateServicePattern pattern) {
    this.pattern = pattern;
  }

  public OpenbaseServiceDescription serviceTemplateId(String serviceTemplateId) {
    this.serviceTemplateId = serviceTemplateId;
    return this;
  }

  /**
   * Get serviceTemplateId
   * @return serviceTemplateId
  */
  @ApiModelProperty(value = "")


  public String getServiceTemplateId() {
    return serviceTemplateId;
  }

  public void setServiceTemplateId(String serviceTemplateId) {
    this.serviceTemplateId = serviceTemplateId;
  }

  public OpenbaseServiceDescription serviceType(OpenbaseServiceTemplateServiceType serviceType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseServiceDescription openbaseServiceDescription = (OpenbaseServiceDescription) o;
    return Objects.equals(this.aggregated, openbaseServiceDescription.aggregated) &&
        Objects.equals(this.metaConfig, openbaseServiceDescription.metaConfig) &&
        Objects.equals(this.pattern, openbaseServiceDescription.pattern) &&
        Objects.equals(this.serviceTemplateId, openbaseServiceDescription.serviceTemplateId) &&
        Objects.equals(this.serviceType, openbaseServiceDescription.serviceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregated, metaConfig, pattern, serviceTemplateId, serviceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseServiceDescription {\n");
    
    sb.append("    aggregated: ").append(toIndentedString(aggregated)).append("\n");
    sb.append("    metaConfig: ").append(toIndentedString(metaConfig)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    serviceTemplateId: ").append(toIndentedString(serviceTemplateId)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
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

