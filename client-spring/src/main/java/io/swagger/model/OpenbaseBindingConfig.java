package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseMetaConfig;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseBindingConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseBindingConfig   {
  @JsonProperty("binding_id")
  private String bindingId = null;

  @JsonProperty("meta_config")
  private OpenbaseMetaConfig metaConfig = null;

  public OpenbaseBindingConfig bindingId(String bindingId) {
    this.bindingId = bindingId;
    return this;
  }

  /**
   * Get bindingId
   * @return bindingId
  **/
  @ApiModelProperty(value = "")

  public String getBindingId() {
    return bindingId;
  }

  public void setBindingId(String bindingId) {
    this.bindingId = bindingId;
  }

  public OpenbaseBindingConfig metaConfig(OpenbaseMetaConfig metaConfig) {
    this.metaConfig = metaConfig;
    return this;
  }

  /**
   * Get metaConfig
   * @return metaConfig
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseMetaConfig getMetaConfig() {
    return metaConfig;
  }

  public void setMetaConfig(OpenbaseMetaConfig metaConfig) {
    this.metaConfig = metaConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseBindingConfig openbaseBindingConfig = (OpenbaseBindingConfig) o;
    return Objects.equals(this.bindingId, openbaseBindingConfig.bindingId) &&
        Objects.equals(this.metaConfig, openbaseBindingConfig.metaConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindingId, metaConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseBindingConfig {\n");
    
    sb.append("    bindingId: ").append(toIndentedString(bindingId)).append("\n");
    sb.append("    metaConfig: ").append(toIndentedString(metaConfig)).append("\n");
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
