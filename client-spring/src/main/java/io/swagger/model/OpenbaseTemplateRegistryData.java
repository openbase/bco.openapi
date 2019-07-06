package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseActivityTemplate;
import io.swagger.model.OpenbaseServiceTemplate;
import io.swagger.model.OpenbaseUnitTemplate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseTemplateRegistryData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseTemplateRegistryData   {
  @JsonProperty("activity_template")
  @Valid
  private List<OpenbaseActivityTemplate> activityTemplate = null;

  @JsonProperty("activity_template_registry_consistent")
  private Boolean activityTemplateRegistryConsistent = null;

  @JsonProperty("activity_template_registry_read_only")
  private Boolean activityTemplateRegistryReadOnly = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("service_template")
  @Valid
  private List<OpenbaseServiceTemplate> serviceTemplate = null;

  @JsonProperty("service_template_registry_consistent")
  private Boolean serviceTemplateRegistryConsistent = null;

  @JsonProperty("service_template_registry_read_only")
  private Boolean serviceTemplateRegistryReadOnly = null;

  @JsonProperty("transaction_id")
  private Long transactionId = null;

  @JsonProperty("unit_template")
  @Valid
  private List<OpenbaseUnitTemplate> unitTemplate = null;

  @JsonProperty("unit_template_registry_consistent")
  private Boolean unitTemplateRegistryConsistent = null;

  @JsonProperty("unit_template_registry_read_only")
  private Boolean unitTemplateRegistryReadOnly = null;

  public OpenbaseTemplateRegistryData activityTemplate(List<OpenbaseActivityTemplate> activityTemplate) {
    this.activityTemplate = activityTemplate;
    return this;
  }

  public OpenbaseTemplateRegistryData addActivityTemplateItem(OpenbaseActivityTemplate activityTemplateItem) {
    if (this.activityTemplate == null) {
      this.activityTemplate = new ArrayList<OpenbaseActivityTemplate>();
    }
    this.activityTemplate.add(activityTemplateItem);
    return this;
  }

  /**
   * Get activityTemplate
   * @return activityTemplate
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbaseActivityTemplate> getActivityTemplate() {
    return activityTemplate;
  }

  public void setActivityTemplate(List<OpenbaseActivityTemplate> activityTemplate) {
    this.activityTemplate = activityTemplate;
  }

  public OpenbaseTemplateRegistryData activityTemplateRegistryConsistent(Boolean activityTemplateRegistryConsistent) {
    this.activityTemplateRegistryConsistent = activityTemplateRegistryConsistent;
    return this;
  }

  /**
   * Get activityTemplateRegistryConsistent
   * @return activityTemplateRegistryConsistent
  **/
  @ApiModelProperty(value = "")

  public Boolean isActivityTemplateRegistryConsistent() {
    return activityTemplateRegistryConsistent;
  }

  public void setActivityTemplateRegistryConsistent(Boolean activityTemplateRegistryConsistent) {
    this.activityTemplateRegistryConsistent = activityTemplateRegistryConsistent;
  }

  public OpenbaseTemplateRegistryData activityTemplateRegistryReadOnly(Boolean activityTemplateRegistryReadOnly) {
    this.activityTemplateRegistryReadOnly = activityTemplateRegistryReadOnly;
    return this;
  }

  /**
   * Get activityTemplateRegistryReadOnly
   * @return activityTemplateRegistryReadOnly
  **/
  @ApiModelProperty(value = "")

  public Boolean isActivityTemplateRegistryReadOnly() {
    return activityTemplateRegistryReadOnly;
  }

  public void setActivityTemplateRegistryReadOnly(Boolean activityTemplateRegistryReadOnly) {
    this.activityTemplateRegistryReadOnly = activityTemplateRegistryReadOnly;
  }

  public OpenbaseTemplateRegistryData label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public OpenbaseTemplateRegistryData serviceTemplate(List<OpenbaseServiceTemplate> serviceTemplate) {
    this.serviceTemplate = serviceTemplate;
    return this;
  }

  public OpenbaseTemplateRegistryData addServiceTemplateItem(OpenbaseServiceTemplate serviceTemplateItem) {
    if (this.serviceTemplate == null) {
      this.serviceTemplate = new ArrayList<OpenbaseServiceTemplate>();
    }
    this.serviceTemplate.add(serviceTemplateItem);
    return this;
  }

  /**
   * Get serviceTemplate
   * @return serviceTemplate
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbaseServiceTemplate> getServiceTemplate() {
    return serviceTemplate;
  }

  public void setServiceTemplate(List<OpenbaseServiceTemplate> serviceTemplate) {
    this.serviceTemplate = serviceTemplate;
  }

  public OpenbaseTemplateRegistryData serviceTemplateRegistryConsistent(Boolean serviceTemplateRegistryConsistent) {
    this.serviceTemplateRegistryConsistent = serviceTemplateRegistryConsistent;
    return this;
  }

  /**
   * Get serviceTemplateRegistryConsistent
   * @return serviceTemplateRegistryConsistent
  **/
  @ApiModelProperty(value = "")

  public Boolean isServiceTemplateRegistryConsistent() {
    return serviceTemplateRegistryConsistent;
  }

  public void setServiceTemplateRegistryConsistent(Boolean serviceTemplateRegistryConsistent) {
    this.serviceTemplateRegistryConsistent = serviceTemplateRegistryConsistent;
  }

  public OpenbaseTemplateRegistryData serviceTemplateRegistryReadOnly(Boolean serviceTemplateRegistryReadOnly) {
    this.serviceTemplateRegistryReadOnly = serviceTemplateRegistryReadOnly;
    return this;
  }

  /**
   * Get serviceTemplateRegistryReadOnly
   * @return serviceTemplateRegistryReadOnly
  **/
  @ApiModelProperty(value = "")

  public Boolean isServiceTemplateRegistryReadOnly() {
    return serviceTemplateRegistryReadOnly;
  }

  public void setServiceTemplateRegistryReadOnly(Boolean serviceTemplateRegistryReadOnly) {
    this.serviceTemplateRegistryReadOnly = serviceTemplateRegistryReadOnly;
  }

  public OpenbaseTemplateRegistryData transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
  **/
  @ApiModelProperty(value = "")

  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  public OpenbaseTemplateRegistryData unitTemplate(List<OpenbaseUnitTemplate> unitTemplate) {
    this.unitTemplate = unitTemplate;
    return this;
  }

  public OpenbaseTemplateRegistryData addUnitTemplateItem(OpenbaseUnitTemplate unitTemplateItem) {
    if (this.unitTemplate == null) {
      this.unitTemplate = new ArrayList<OpenbaseUnitTemplate>();
    }
    this.unitTemplate.add(unitTemplateItem);
    return this;
  }

  /**
   * Get unitTemplate
   * @return unitTemplate
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbaseUnitTemplate> getUnitTemplate() {
    return unitTemplate;
  }

  public void setUnitTemplate(List<OpenbaseUnitTemplate> unitTemplate) {
    this.unitTemplate = unitTemplate;
  }

  public OpenbaseTemplateRegistryData unitTemplateRegistryConsistent(Boolean unitTemplateRegistryConsistent) {
    this.unitTemplateRegistryConsistent = unitTemplateRegistryConsistent;
    return this;
  }

  /**
   * Get unitTemplateRegistryConsistent
   * @return unitTemplateRegistryConsistent
  **/
  @ApiModelProperty(value = "")

  public Boolean isUnitTemplateRegistryConsistent() {
    return unitTemplateRegistryConsistent;
  }

  public void setUnitTemplateRegistryConsistent(Boolean unitTemplateRegistryConsistent) {
    this.unitTemplateRegistryConsistent = unitTemplateRegistryConsistent;
  }

  public OpenbaseTemplateRegistryData unitTemplateRegistryReadOnly(Boolean unitTemplateRegistryReadOnly) {
    this.unitTemplateRegistryReadOnly = unitTemplateRegistryReadOnly;
    return this;
  }

  /**
   * Get unitTemplateRegistryReadOnly
   * @return unitTemplateRegistryReadOnly
  **/
  @ApiModelProperty(value = "")

  public Boolean isUnitTemplateRegistryReadOnly() {
    return unitTemplateRegistryReadOnly;
  }

  public void setUnitTemplateRegistryReadOnly(Boolean unitTemplateRegistryReadOnly) {
    this.unitTemplateRegistryReadOnly = unitTemplateRegistryReadOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseTemplateRegistryData openbaseTemplateRegistryData = (OpenbaseTemplateRegistryData) o;
    return Objects.equals(this.activityTemplate, openbaseTemplateRegistryData.activityTemplate) &&
        Objects.equals(this.activityTemplateRegistryConsistent, openbaseTemplateRegistryData.activityTemplateRegistryConsistent) &&
        Objects.equals(this.activityTemplateRegistryReadOnly, openbaseTemplateRegistryData.activityTemplateRegistryReadOnly) &&
        Objects.equals(this.label, openbaseTemplateRegistryData.label) &&
        Objects.equals(this.serviceTemplate, openbaseTemplateRegistryData.serviceTemplate) &&
        Objects.equals(this.serviceTemplateRegistryConsistent, openbaseTemplateRegistryData.serviceTemplateRegistryConsistent) &&
        Objects.equals(this.serviceTemplateRegistryReadOnly, openbaseTemplateRegistryData.serviceTemplateRegistryReadOnly) &&
        Objects.equals(this.transactionId, openbaseTemplateRegistryData.transactionId) &&
        Objects.equals(this.unitTemplate, openbaseTemplateRegistryData.unitTemplate) &&
        Objects.equals(this.unitTemplateRegistryConsistent, openbaseTemplateRegistryData.unitTemplateRegistryConsistent) &&
        Objects.equals(this.unitTemplateRegistryReadOnly, openbaseTemplateRegistryData.unitTemplateRegistryReadOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityTemplate, activityTemplateRegistryConsistent, activityTemplateRegistryReadOnly, label, serviceTemplate, serviceTemplateRegistryConsistent, serviceTemplateRegistryReadOnly, transactionId, unitTemplate, unitTemplateRegistryConsistent, unitTemplateRegistryReadOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseTemplateRegistryData {\n");
    
    sb.append("    activityTemplate: ").append(toIndentedString(activityTemplate)).append("\n");
    sb.append("    activityTemplateRegistryConsistent: ").append(toIndentedString(activityTemplateRegistryConsistent)).append("\n");
    sb.append("    activityTemplateRegistryReadOnly: ").append(toIndentedString(activityTemplateRegistryReadOnly)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    serviceTemplate: ").append(toIndentedString(serviceTemplate)).append("\n");
    sb.append("    serviceTemplateRegistryConsistent: ").append(toIndentedString(serviceTemplateRegistryConsistent)).append("\n");
    sb.append("    serviceTemplateRegistryReadOnly: ").append(toIndentedString(serviceTemplateRegistryReadOnly)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    unitTemplate: ").append(toIndentedString(unitTemplate)).append("\n");
    sb.append("    unitTemplateRegistryConsistent: ").append(toIndentedString(unitTemplateRegistryConsistent)).append("\n");
    sb.append("    unitTemplateRegistryReadOnly: ").append(toIndentedString(unitTemplateRegistryReadOnly)).append("\n");
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
