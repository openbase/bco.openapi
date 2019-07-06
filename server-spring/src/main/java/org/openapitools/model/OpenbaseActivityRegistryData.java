package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseActivityConfig;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseActivityRegistryData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbaseActivityRegistryData   {
  @JsonProperty("activity_config")
  @Valid
  private List<OpenbaseActivityConfig> activityConfig = null;

  @JsonProperty("activity_config_registry_consistent")
  private Boolean activityConfigRegistryConsistent;

  @JsonProperty("activity_config_registry_read_only")
  private Boolean activityConfigRegistryReadOnly;

  @JsonProperty("label")
  private String label;

  @JsonProperty("transaction_id")
  private Long transactionId;

  public OpenbaseActivityRegistryData activityConfig(List<OpenbaseActivityConfig> activityConfig) {
    this.activityConfig = activityConfig;
    return this;
  }

  public OpenbaseActivityRegistryData addActivityConfigItem(OpenbaseActivityConfig activityConfigItem) {
    if (this.activityConfig == null) {
      this.activityConfig = new ArrayList<>();
    }
    this.activityConfig.add(activityConfigItem);
    return this;
  }

  /**
   * Get activityConfig
   * @return activityConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseActivityConfig> getActivityConfig() {
    return activityConfig;
  }

  public void setActivityConfig(List<OpenbaseActivityConfig> activityConfig) {
    this.activityConfig = activityConfig;
  }

  public OpenbaseActivityRegistryData activityConfigRegistryConsistent(Boolean activityConfigRegistryConsistent) {
    this.activityConfigRegistryConsistent = activityConfigRegistryConsistent;
    return this;
  }

  /**
   * Get activityConfigRegistryConsistent
   * @return activityConfigRegistryConsistent
  */
  @ApiModelProperty(value = "")


  public Boolean getActivityConfigRegistryConsistent() {
    return activityConfigRegistryConsistent;
  }

  public void setActivityConfigRegistryConsistent(Boolean activityConfigRegistryConsistent) {
    this.activityConfigRegistryConsistent = activityConfigRegistryConsistent;
  }

  public OpenbaseActivityRegistryData activityConfigRegistryReadOnly(Boolean activityConfigRegistryReadOnly) {
    this.activityConfigRegistryReadOnly = activityConfigRegistryReadOnly;
    return this;
  }

  /**
   * Get activityConfigRegistryReadOnly
   * @return activityConfigRegistryReadOnly
  */
  @ApiModelProperty(value = "")


  public Boolean getActivityConfigRegistryReadOnly() {
    return activityConfigRegistryReadOnly;
  }

  public void setActivityConfigRegistryReadOnly(Boolean activityConfigRegistryReadOnly) {
    this.activityConfigRegistryReadOnly = activityConfigRegistryReadOnly;
  }

  public OpenbaseActivityRegistryData label(String label) {
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

  public OpenbaseActivityRegistryData transactionId(Long transactionId) {
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
    OpenbaseActivityRegistryData openbaseActivityRegistryData = (OpenbaseActivityRegistryData) o;
    return Objects.equals(this.activityConfig, openbaseActivityRegistryData.activityConfig) &&
        Objects.equals(this.activityConfigRegistryConsistent, openbaseActivityRegistryData.activityConfigRegistryConsistent) &&
        Objects.equals(this.activityConfigRegistryReadOnly, openbaseActivityRegistryData.activityConfigRegistryReadOnly) &&
        Objects.equals(this.label, openbaseActivityRegistryData.label) &&
        Objects.equals(this.transactionId, openbaseActivityRegistryData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityConfig, activityConfigRegistryConsistent, activityConfigRegistryReadOnly, label, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseActivityRegistryData {\n");
    
    sb.append("    activityConfig: ").append(toIndentedString(activityConfig)).append("\n");
    sb.append("    activityConfigRegistryConsistent: ").append(toIndentedString(activityConfigRegistryConsistent)).append("\n");
    sb.append("    activityConfigRegistryReadOnly: ").append(toIndentedString(activityConfigRegistryReadOnly)).append("\n");
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

