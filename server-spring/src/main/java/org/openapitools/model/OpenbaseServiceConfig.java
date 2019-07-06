package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseBindingConfig;
import org.openapitools.model.OpenbaseMetaConfig;
import org.openapitools.model.OpenbaseServiceDescription;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseServiceConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseServiceConfig   {
  @JsonProperty("binding_config")
  private OpenbaseBindingConfig bindingConfig = null;

  @JsonProperty("meta_config")
  private OpenbaseMetaConfig metaConfig = null;

  @JsonProperty("service_description")
  private OpenbaseServiceDescription serviceDescription = null;

  @JsonProperty("unit_id")
  private String unitId;

  public OpenbaseServiceConfig bindingConfig(OpenbaseBindingConfig bindingConfig) {
    this.bindingConfig = bindingConfig;
    return this;
  }

  /**
   * Get bindingConfig
   * @return bindingConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseBindingConfig getBindingConfig() {
    return bindingConfig;
  }

  public void setBindingConfig(OpenbaseBindingConfig bindingConfig) {
    this.bindingConfig = bindingConfig;
  }

  public OpenbaseServiceConfig metaConfig(OpenbaseMetaConfig metaConfig) {
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

  public OpenbaseServiceConfig serviceDescription(OpenbaseServiceDescription serviceDescription) {
    this.serviceDescription = serviceDescription;
    return this;
  }

  /**
   * Get serviceDescription
   * @return serviceDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseServiceDescription getServiceDescription() {
    return serviceDescription;
  }

  public void setServiceDescription(OpenbaseServiceDescription serviceDescription) {
    this.serviceDescription = serviceDescription;
  }

  public OpenbaseServiceConfig unitId(String unitId) {
    this.unitId = unitId;
    return this;
  }

  /**
   * Get unitId
   * @return unitId
  */
  @ApiModelProperty(value = "")


  public String getUnitId() {
    return unitId;
  }

  public void setUnitId(String unitId) {
    this.unitId = unitId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseServiceConfig openbaseServiceConfig = (OpenbaseServiceConfig) o;
    return Objects.equals(this.bindingConfig, openbaseServiceConfig.bindingConfig) &&
        Objects.equals(this.metaConfig, openbaseServiceConfig.metaConfig) &&
        Objects.equals(this.serviceDescription, openbaseServiceConfig.serviceDescription) &&
        Objects.equals(this.unitId, openbaseServiceConfig.unitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindingConfig, metaConfig, serviceDescription, unitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseServiceConfig {\n");
    
    sb.append("    bindingConfig: ").append(toIndentedString(bindingConfig)).append("\n");
    sb.append("    metaConfig: ").append(toIndentedString(metaConfig)).append("\n");
    sb.append("    serviceDescription: ").append(toIndentedString(serviceDescription)).append("\n");
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
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

