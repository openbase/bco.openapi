package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseAgentClass;
import org.openapitools.model.OpenbaseAppClass;
import org.openapitools.model.OpenbaseDeviceClass;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseClassRegistryData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

public class OpenbaseClassRegistryData   {
  @JsonProperty("agent_class")
  @Valid
  private List<OpenbaseAgentClass> agentClass = null;

  @JsonProperty("agent_class_registry_consistent")
  private Boolean agentClassRegistryConsistent;

  @JsonProperty("agent_class_registry_read_only")
  private Boolean agentClassRegistryReadOnly;

  @JsonProperty("app_class")
  @Valid
  private List<OpenbaseAppClass> appClass = null;

  @JsonProperty("app_class_registry_consistent")
  private Boolean appClassRegistryConsistent;

  @JsonProperty("app_class_registry_read_only")
  private Boolean appClassRegistryReadOnly;

  @JsonProperty("device_class")
  @Valid
  private List<OpenbaseDeviceClass> deviceClass = null;

  @JsonProperty("device_class_registry_consistent")
  private Boolean deviceClassRegistryConsistent;

  @JsonProperty("device_class_registry_read_only")
  private Boolean deviceClassRegistryReadOnly;

  @JsonProperty("label")
  private String label;

  @JsonProperty("transaction_id")
  private Long transactionId;

  public OpenbaseClassRegistryData agentClass(List<OpenbaseAgentClass> agentClass) {
    this.agentClass = agentClass;
    return this;
  }

  public OpenbaseClassRegistryData addAgentClassItem(OpenbaseAgentClass agentClassItem) {
    if (this.agentClass == null) {
      this.agentClass = new ArrayList<>();
    }
    this.agentClass.add(agentClassItem);
    return this;
  }

  /**
   * Get agentClass
   * @return agentClass
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseAgentClass> getAgentClass() {
    return agentClass;
  }

  public void setAgentClass(List<OpenbaseAgentClass> agentClass) {
    this.agentClass = agentClass;
  }

  public OpenbaseClassRegistryData agentClassRegistryConsistent(Boolean agentClassRegistryConsistent) {
    this.agentClassRegistryConsistent = agentClassRegistryConsistent;
    return this;
  }

  /**
   * Get agentClassRegistryConsistent
   * @return agentClassRegistryConsistent
  */
  @ApiModelProperty(value = "")


  public Boolean getAgentClassRegistryConsistent() {
    return agentClassRegistryConsistent;
  }

  public void setAgentClassRegistryConsistent(Boolean agentClassRegistryConsistent) {
    this.agentClassRegistryConsistent = agentClassRegistryConsistent;
  }

  public OpenbaseClassRegistryData agentClassRegistryReadOnly(Boolean agentClassRegistryReadOnly) {
    this.agentClassRegistryReadOnly = agentClassRegistryReadOnly;
    return this;
  }

  /**
   * Get agentClassRegistryReadOnly
   * @return agentClassRegistryReadOnly
  */
  @ApiModelProperty(value = "")


  public Boolean getAgentClassRegistryReadOnly() {
    return agentClassRegistryReadOnly;
  }

  public void setAgentClassRegistryReadOnly(Boolean agentClassRegistryReadOnly) {
    this.agentClassRegistryReadOnly = agentClassRegistryReadOnly;
  }

  public OpenbaseClassRegistryData appClass(List<OpenbaseAppClass> appClass) {
    this.appClass = appClass;
    return this;
  }

  public OpenbaseClassRegistryData addAppClassItem(OpenbaseAppClass appClassItem) {
    if (this.appClass == null) {
      this.appClass = new ArrayList<>();
    }
    this.appClass.add(appClassItem);
    return this;
  }

  /**
   * Get appClass
   * @return appClass
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseAppClass> getAppClass() {
    return appClass;
  }

  public void setAppClass(List<OpenbaseAppClass> appClass) {
    this.appClass = appClass;
  }

  public OpenbaseClassRegistryData appClassRegistryConsistent(Boolean appClassRegistryConsistent) {
    this.appClassRegistryConsistent = appClassRegistryConsistent;
    return this;
  }

  /**
   * Get appClassRegistryConsistent
   * @return appClassRegistryConsistent
  */
  @ApiModelProperty(value = "")


  public Boolean getAppClassRegistryConsistent() {
    return appClassRegistryConsistent;
  }

  public void setAppClassRegistryConsistent(Boolean appClassRegistryConsistent) {
    this.appClassRegistryConsistent = appClassRegistryConsistent;
  }

  public OpenbaseClassRegistryData appClassRegistryReadOnly(Boolean appClassRegistryReadOnly) {
    this.appClassRegistryReadOnly = appClassRegistryReadOnly;
    return this;
  }

  /**
   * Get appClassRegistryReadOnly
   * @return appClassRegistryReadOnly
  */
  @ApiModelProperty(value = "")


  public Boolean getAppClassRegistryReadOnly() {
    return appClassRegistryReadOnly;
  }

  public void setAppClassRegistryReadOnly(Boolean appClassRegistryReadOnly) {
    this.appClassRegistryReadOnly = appClassRegistryReadOnly;
  }

  public OpenbaseClassRegistryData deviceClass(List<OpenbaseDeviceClass> deviceClass) {
    this.deviceClass = deviceClass;
    return this;
  }

  public OpenbaseClassRegistryData addDeviceClassItem(OpenbaseDeviceClass deviceClassItem) {
    if (this.deviceClass == null) {
      this.deviceClass = new ArrayList<>();
    }
    this.deviceClass.add(deviceClassItem);
    return this;
  }

  /**
   * Get deviceClass
   * @return deviceClass
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseDeviceClass> getDeviceClass() {
    return deviceClass;
  }

  public void setDeviceClass(List<OpenbaseDeviceClass> deviceClass) {
    this.deviceClass = deviceClass;
  }

  public OpenbaseClassRegistryData deviceClassRegistryConsistent(Boolean deviceClassRegistryConsistent) {
    this.deviceClassRegistryConsistent = deviceClassRegistryConsistent;
    return this;
  }

  /**
   * Get deviceClassRegistryConsistent
   * @return deviceClassRegistryConsistent
  */
  @ApiModelProperty(value = "")


  public Boolean getDeviceClassRegistryConsistent() {
    return deviceClassRegistryConsistent;
  }

  public void setDeviceClassRegistryConsistent(Boolean deviceClassRegistryConsistent) {
    this.deviceClassRegistryConsistent = deviceClassRegistryConsistent;
  }

  public OpenbaseClassRegistryData deviceClassRegistryReadOnly(Boolean deviceClassRegistryReadOnly) {
    this.deviceClassRegistryReadOnly = deviceClassRegistryReadOnly;
    return this;
  }

  /**
   * Get deviceClassRegistryReadOnly
   * @return deviceClassRegistryReadOnly
  */
  @ApiModelProperty(value = "")


  public Boolean getDeviceClassRegistryReadOnly() {
    return deviceClassRegistryReadOnly;
  }

  public void setDeviceClassRegistryReadOnly(Boolean deviceClassRegistryReadOnly) {
    this.deviceClassRegistryReadOnly = deviceClassRegistryReadOnly;
  }

  public OpenbaseClassRegistryData label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  */
  @ApiModelProperty(value = "")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public OpenbaseClassRegistryData transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
  */
  @ApiModelProperty(value = "")


  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseClassRegistryData openbaseClassRegistryData = (OpenbaseClassRegistryData) o;
    return Objects.equals(this.agentClass, openbaseClassRegistryData.agentClass) &&
        Objects.equals(this.agentClassRegistryConsistent, openbaseClassRegistryData.agentClassRegistryConsistent) &&
        Objects.equals(this.agentClassRegistryReadOnly, openbaseClassRegistryData.agentClassRegistryReadOnly) &&
        Objects.equals(this.appClass, openbaseClassRegistryData.appClass) &&
        Objects.equals(this.appClassRegistryConsistent, openbaseClassRegistryData.appClassRegistryConsistent) &&
        Objects.equals(this.appClassRegistryReadOnly, openbaseClassRegistryData.appClassRegistryReadOnly) &&
        Objects.equals(this.deviceClass, openbaseClassRegistryData.deviceClass) &&
        Objects.equals(this.deviceClassRegistryConsistent, openbaseClassRegistryData.deviceClassRegistryConsistent) &&
        Objects.equals(this.deviceClassRegistryReadOnly, openbaseClassRegistryData.deviceClassRegistryReadOnly) &&
        Objects.equals(this.label, openbaseClassRegistryData.label) &&
        Objects.equals(this.transactionId, openbaseClassRegistryData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentClass, agentClassRegistryConsistent, agentClassRegistryReadOnly, appClass, appClassRegistryConsistent, appClassRegistryReadOnly, deviceClass, deviceClassRegistryConsistent, deviceClassRegistryReadOnly, label, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseClassRegistryData {\n");
    
    sb.append("    agentClass: ").append(toIndentedString(agentClass)).append("\n");
    sb.append("    agentClassRegistryConsistent: ").append(toIndentedString(agentClassRegistryConsistent)).append("\n");
    sb.append("    agentClassRegistryReadOnly: ").append(toIndentedString(agentClassRegistryReadOnly)).append("\n");
    sb.append("    appClass: ").append(toIndentedString(appClass)).append("\n");
    sb.append("    appClassRegistryConsistent: ").append(toIndentedString(appClassRegistryConsistent)).append("\n");
    sb.append("    appClassRegistryReadOnly: ").append(toIndentedString(appClassRegistryReadOnly)).append("\n");
    sb.append("    deviceClass: ").append(toIndentedString(deviceClass)).append("\n");
    sb.append("    deviceClassRegistryConsistent: ").append(toIndentedString(deviceClassRegistryConsistent)).append("\n");
    sb.append("    deviceClassRegistryReadOnly: ").append(toIndentedString(deviceClassRegistryReadOnly)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

