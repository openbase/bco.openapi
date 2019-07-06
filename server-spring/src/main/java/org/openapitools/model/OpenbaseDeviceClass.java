package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseBindingConfig;
import org.openapitools.model.OpenbaseLabel;
import org.openapitools.model.OpenbaseMetaConfig;
import org.openapitools.model.OpenbaseMultiLanguageText;
import org.openapitools.model.OpenbaseShape;
import org.openapitools.model.OpenbaseUnitTemplateConfig;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseDeviceClass
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbaseDeviceClass   {
  @JsonProperty("binding_config")
  private OpenbaseBindingConfig bindingConfig = null;

  @JsonProperty("company")
  private String company;

  @JsonProperty("description")
  private OpenbaseMultiLanguageText description = null;

  @JsonProperty("id")
  private String id;

  @JsonProperty("label")
  private OpenbaseLabel label = null;

  @JsonProperty("meta_config")
  private OpenbaseMetaConfig metaConfig = null;

  @JsonProperty("product_number")
  private String productNumber;

  @JsonProperty("shape")
  private OpenbaseShape shape = null;

  @JsonProperty("unit_template_config")
  @Valid
  private List<OpenbaseUnitTemplateConfig> unitTemplateConfig = null;

  public OpenbaseDeviceClass bindingConfig(OpenbaseBindingConfig bindingConfig) {
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

  public OpenbaseDeviceClass company(String company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
  */
  @ApiModelProperty(value = "")


  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public OpenbaseDeviceClass description(OpenbaseMultiLanguageText description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseMultiLanguageText getDescription() {
    return description;
  }

  public void setDescription(OpenbaseMultiLanguageText description) {
    this.description = description;
  }

  public OpenbaseDeviceClass id(String id) {
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

  public OpenbaseDeviceClass label(OpenbaseLabel label) {
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

  public OpenbaseDeviceClass metaConfig(OpenbaseMetaConfig metaConfig) {
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

  public OpenbaseDeviceClass productNumber(String productNumber) {
    this.productNumber = productNumber;
    return this;
  }

  /**
   * Get productNumber
   * @return productNumber
  */
  @ApiModelProperty(value = "")


  public String getProductNumber() {
    return productNumber;
  }

  public void setProductNumber(String productNumber) {
    this.productNumber = productNumber;
  }

  public OpenbaseDeviceClass shape(OpenbaseShape shape) {
    this.shape = shape;
    return this;
  }

  /**
   * Get shape
   * @return shape
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseShape getShape() {
    return shape;
  }

  public void setShape(OpenbaseShape shape) {
    this.shape = shape;
  }

  public OpenbaseDeviceClass unitTemplateConfig(List<OpenbaseUnitTemplateConfig> unitTemplateConfig) {
    this.unitTemplateConfig = unitTemplateConfig;
    return this;
  }

  public OpenbaseDeviceClass addUnitTemplateConfigItem(OpenbaseUnitTemplateConfig unitTemplateConfigItem) {
    if (this.unitTemplateConfig == null) {
      this.unitTemplateConfig = new ArrayList<>();
    }
    this.unitTemplateConfig.add(unitTemplateConfigItem);
    return this;
  }

  /**
   * Get unitTemplateConfig
   * @return unitTemplateConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseUnitTemplateConfig> getUnitTemplateConfig() {
    return unitTemplateConfig;
  }

  public void setUnitTemplateConfig(List<OpenbaseUnitTemplateConfig> unitTemplateConfig) {
    this.unitTemplateConfig = unitTemplateConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseDeviceClass openbaseDeviceClass = (OpenbaseDeviceClass) o;
    return Objects.equals(this.bindingConfig, openbaseDeviceClass.bindingConfig) &&
        Objects.equals(this.company, openbaseDeviceClass.company) &&
        Objects.equals(this.description, openbaseDeviceClass.description) &&
        Objects.equals(this.id, openbaseDeviceClass.id) &&
        Objects.equals(this.label, openbaseDeviceClass.label) &&
        Objects.equals(this.metaConfig, openbaseDeviceClass.metaConfig) &&
        Objects.equals(this.productNumber, openbaseDeviceClass.productNumber) &&
        Objects.equals(this.shape, openbaseDeviceClass.shape) &&
        Objects.equals(this.unitTemplateConfig, openbaseDeviceClass.unitTemplateConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindingConfig, company, description, id, label, metaConfig, productNumber, shape, unitTemplateConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseDeviceClass {\n");
    
    sb.append("    bindingConfig: ").append(toIndentedString(bindingConfig)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    metaConfig: ").append(toIndentedString(metaConfig)).append("\n");
    sb.append("    productNumber: ").append(toIndentedString(productNumber)).append("\n");
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
    sb.append("    unitTemplateConfig: ").append(toIndentedString(unitTemplateConfig)).append("\n");
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

