package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseUnitConfig;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseUnitRegistryData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseUnitRegistryData   {
  @JsonProperty("agent_unit_config")
  @Valid
  private List<OpenbaseUnitConfig> agentUnitConfig = null;

  @JsonProperty("agent_unit_config_registry_consistent")
  private Boolean agentUnitConfigRegistryConsistent;

  @JsonProperty("agent_unit_config_registry_read_only")
  private Boolean agentUnitConfigRegistryReadOnly;

  @JsonProperty("app_unit_config")
  @Valid
  private List<OpenbaseUnitConfig> appUnitConfig = null;

  @JsonProperty("app_unit_config_registry_consistent")
  private Boolean appUnitConfigRegistryConsistent;

  @JsonProperty("app_unit_config_registry_read_only")
  private Boolean appUnitConfigRegistryReadOnly;

  @JsonProperty("authorization_group_unit_config")
  @Valid
  private List<OpenbaseUnitConfig> authorizationGroupUnitConfig = null;

  @JsonProperty("authorization_group_unit_config_registry_consistent")
  private Boolean authorizationGroupUnitConfigRegistryConsistent;

  @JsonProperty("authorization_group_unit_config_registry_read_only")
  private Boolean authorizationGroupUnitConfigRegistryReadOnly;

  @JsonProperty("connection_unit_config")
  @Valid
  private List<OpenbaseUnitConfig> connectionUnitConfig = null;

  @JsonProperty("connection_unit_config_registry_consistent")
  private Boolean connectionUnitConfigRegistryConsistent;

  @JsonProperty("connection_unit_config_registry_read_only")
  private Boolean connectionUnitConfigRegistryReadOnly;

  @JsonProperty("dal_unit_config")
  @Valid
  private List<OpenbaseUnitConfig> dalUnitConfig = null;

  @JsonProperty("dal_unit_config_registry_consistent")
  private Boolean dalUnitConfigRegistryConsistent;

  @JsonProperty("dal_unit_config_registry_read_only")
  private Boolean dalUnitConfigRegistryReadOnly;

  @JsonProperty("device_unit_config")
  @Valid
  private List<OpenbaseUnitConfig> deviceUnitConfig = null;

  @JsonProperty("device_unit_config_registry_consistent")
  private Boolean deviceUnitConfigRegistryConsistent;

  @JsonProperty("device_unit_config_registry_read_only")
  private Boolean deviceUnitConfigRegistryReadOnly;

  @JsonProperty("label")
  private String label;

  @JsonProperty("location_unit_config")
  @Valid
  private List<OpenbaseUnitConfig> locationUnitConfig = null;

  @JsonProperty("location_unit_config_registry_consistent")
  private Boolean locationUnitConfigRegistryConsistent;

  @JsonProperty("location_unit_config_registry_read_only")
  private Boolean locationUnitConfigRegistryReadOnly;

  @JsonProperty("object_unit_config")
  @Valid
  private List<OpenbaseUnitConfig> objectUnitConfig = null;

  @JsonProperty("object_unit_config_registry_consistent")
  private Boolean objectUnitConfigRegistryConsistent;

  @JsonProperty("object_unit_config_registry_read_only")
  private Boolean objectUnitConfigRegistryReadOnly;

  @JsonProperty("scene_unit_config")
  @Valid
  private List<OpenbaseUnitConfig> sceneUnitConfig = null;

  @JsonProperty("scene_unit_config_registry_consistent")
  private Boolean sceneUnitConfigRegistryConsistent;

  @JsonProperty("scene_unit_config_registry_read_only")
  private Boolean sceneUnitConfigRegistryReadOnly;

  @JsonProperty("transaction_id")
  private Long transactionId;

  @JsonProperty("unit_config_registry_consistent")
  private Boolean unitConfigRegistryConsistent;

  @JsonProperty("unit_config_registry_read_only")
  private Boolean unitConfigRegistryReadOnly;

  @JsonProperty("unit_group_unit_config")
  @Valid
  private List<OpenbaseUnitConfig> unitGroupUnitConfig = null;

  @JsonProperty("unit_group_unit_config_registry_consistent")
  private Boolean unitGroupUnitConfigRegistryConsistent;

  @JsonProperty("unit_group_unit_config_registry_read_only")
  private Boolean unitGroupUnitConfigRegistryReadOnly;

  @JsonProperty("user_unit_config")
  @Valid
  private List<OpenbaseUnitConfig> userUnitConfig = null;

  @JsonProperty("user_unit_config_registry_consistent")
  private Boolean userUnitConfigRegistryConsistent;

  @JsonProperty("user_unit_config_registry_read_only")
  private Boolean userUnitConfigRegistryReadOnly;

  public OpenbaseUnitRegistryData agentUnitConfig(List<OpenbaseUnitConfig> agentUnitConfig) {
    this.agentUnitConfig = agentUnitConfig;
    return this;
  }

  public OpenbaseUnitRegistryData addAgentUnitConfigItem(OpenbaseUnitConfig agentUnitConfigItem) {
    if (this.agentUnitConfig == null) {
      this.agentUnitConfig = new ArrayList<>();
    }
    this.agentUnitConfig.add(agentUnitConfigItem);
    return this;
  }

  /**
   * Get agentUnitConfig
   * @return agentUnitConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseUnitConfig> getAgentUnitConfig() {
    return agentUnitConfig;
  }

  public void setAgentUnitConfig(List<OpenbaseUnitConfig> agentUnitConfig) {
    this.agentUnitConfig = agentUnitConfig;
  }

  public OpenbaseUnitRegistryData agentUnitConfigRegistryConsistent(Boolean agentUnitConfigRegistryConsistent) {
    this.agentUnitConfigRegistryConsistent = agentUnitConfigRegistryConsistent;
    return this;
  }

  /**
   * Get agentUnitConfigRegistryConsistent
   * @return agentUnitConfigRegistryConsistent
  */
  @ApiModelProperty(value = "")


  public Boolean getAgentUnitConfigRegistryConsistent() {
    return agentUnitConfigRegistryConsistent;
  }

  public void setAgentUnitConfigRegistryConsistent(Boolean agentUnitConfigRegistryConsistent) {
    this.agentUnitConfigRegistryConsistent = agentUnitConfigRegistryConsistent;
  }

  public OpenbaseUnitRegistryData agentUnitConfigRegistryReadOnly(Boolean agentUnitConfigRegistryReadOnly) {
    this.agentUnitConfigRegistryReadOnly = agentUnitConfigRegistryReadOnly;
    return this;
  }

  /**
   * Get agentUnitConfigRegistryReadOnly
   * @return agentUnitConfigRegistryReadOnly
  */
  @ApiModelProperty(value = "")


  public Boolean getAgentUnitConfigRegistryReadOnly() {
    return agentUnitConfigRegistryReadOnly;
  }

  public void setAgentUnitConfigRegistryReadOnly(Boolean agentUnitConfigRegistryReadOnly) {
    this.agentUnitConfigRegistryReadOnly = agentUnitConfigRegistryReadOnly;
  }

  public OpenbaseUnitRegistryData appUnitConfig(List<OpenbaseUnitConfig> appUnitConfig) {
    this.appUnitConfig = appUnitConfig;
    return this;
  }

  public OpenbaseUnitRegistryData addAppUnitConfigItem(OpenbaseUnitConfig appUnitConfigItem) {
    if (this.appUnitConfig == null) {
      this.appUnitConfig = new ArrayList<>();
    }
    this.appUnitConfig.add(appUnitConfigItem);
    return this;
  }

  /**
   * Get appUnitConfig
   * @return appUnitConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseUnitConfig> getAppUnitConfig() {
    return appUnitConfig;
  }

  public void setAppUnitConfig(List<OpenbaseUnitConfig> appUnitConfig) {
    this.appUnitConfig = appUnitConfig;
  }

  public OpenbaseUnitRegistryData appUnitConfigRegistryConsistent(Boolean appUnitConfigRegistryConsistent) {
    this.appUnitConfigRegistryConsistent = appUnitConfigRegistryConsistent;
    return this;
  }

  /**
   * Get appUnitConfigRegistryConsistent
   * @return appUnitConfigRegistryConsistent
  */
  @ApiModelProperty(value = "")


  public Boolean getAppUnitConfigRegistryConsistent() {
    return appUnitConfigRegistryConsistent;
  }

  public void setAppUnitConfigRegistryConsistent(Boolean appUnitConfigRegistryConsistent) {
    this.appUnitConfigRegistryConsistent = appUnitConfigRegistryConsistent;
  }

  public OpenbaseUnitRegistryData appUnitConfigRegistryReadOnly(Boolean appUnitConfigRegistryReadOnly) {
    this.appUnitConfigRegistryReadOnly = appUnitConfigRegistryReadOnly;
    return this;
  }

  /**
   * Get appUnitConfigRegistryReadOnly
   * @return appUnitConfigRegistryReadOnly
  */
  @ApiModelProperty(value = "")


  public Boolean getAppUnitConfigRegistryReadOnly() {
    return appUnitConfigRegistryReadOnly;
  }

  public void setAppUnitConfigRegistryReadOnly(Boolean appUnitConfigRegistryReadOnly) {
    this.appUnitConfigRegistryReadOnly = appUnitConfigRegistryReadOnly;
  }

  public OpenbaseUnitRegistryData authorizationGroupUnitConfig(List<OpenbaseUnitConfig> authorizationGroupUnitConfig) {
    this.authorizationGroupUnitConfig = authorizationGroupUnitConfig;
    return this;
  }

  public OpenbaseUnitRegistryData addAuthorizationGroupUnitConfigItem(OpenbaseUnitConfig authorizationGroupUnitConfigItem) {
    if (this.authorizationGroupUnitConfig == null) {
      this.authorizationGroupUnitConfig = new ArrayList<>();
    }
    this.authorizationGroupUnitConfig.add(authorizationGroupUnitConfigItem);
    return this;
  }

  /**
   * Get authorizationGroupUnitConfig
   * @return authorizationGroupUnitConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseUnitConfig> getAuthorizationGroupUnitConfig() {
    return authorizationGroupUnitConfig;
  }

  public void setAuthorizationGroupUnitConfig(List<OpenbaseUnitConfig> authorizationGroupUnitConfig) {
    this.authorizationGroupUnitConfig = authorizationGroupUnitConfig;
  }

  public OpenbaseUnitRegistryData authorizationGroupUnitConfigRegistryConsistent(Boolean authorizationGroupUnitConfigRegistryConsistent) {
    this.authorizationGroupUnitConfigRegistryConsistent = authorizationGroupUnitConfigRegistryConsistent;
    return this;
  }

  /**
   * Get authorizationGroupUnitConfigRegistryConsistent
   * @return authorizationGroupUnitConfigRegistryConsistent
  */
  @ApiModelProperty(value = "")


  public Boolean getAuthorizationGroupUnitConfigRegistryConsistent() {
    return authorizationGroupUnitConfigRegistryConsistent;
  }

  public void setAuthorizationGroupUnitConfigRegistryConsistent(Boolean authorizationGroupUnitConfigRegistryConsistent) {
    this.authorizationGroupUnitConfigRegistryConsistent = authorizationGroupUnitConfigRegistryConsistent;
  }

  public OpenbaseUnitRegistryData authorizationGroupUnitConfigRegistryReadOnly(Boolean authorizationGroupUnitConfigRegistryReadOnly) {
    this.authorizationGroupUnitConfigRegistryReadOnly = authorizationGroupUnitConfigRegistryReadOnly;
    return this;
  }

  /**
   * Get authorizationGroupUnitConfigRegistryReadOnly
   * @return authorizationGroupUnitConfigRegistryReadOnly
  */
  @ApiModelProperty(value = "")


  public Boolean getAuthorizationGroupUnitConfigRegistryReadOnly() {
    return authorizationGroupUnitConfigRegistryReadOnly;
  }

  public void setAuthorizationGroupUnitConfigRegistryReadOnly(Boolean authorizationGroupUnitConfigRegistryReadOnly) {
    this.authorizationGroupUnitConfigRegistryReadOnly = authorizationGroupUnitConfigRegistryReadOnly;
  }

  public OpenbaseUnitRegistryData connectionUnitConfig(List<OpenbaseUnitConfig> connectionUnitConfig) {
    this.connectionUnitConfig = connectionUnitConfig;
    return this;
  }

  public OpenbaseUnitRegistryData addConnectionUnitConfigItem(OpenbaseUnitConfig connectionUnitConfigItem) {
    if (this.connectionUnitConfig == null) {
      this.connectionUnitConfig = new ArrayList<>();
    }
    this.connectionUnitConfig.add(connectionUnitConfigItem);
    return this;
  }

  /**
   * Get connectionUnitConfig
   * @return connectionUnitConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseUnitConfig> getConnectionUnitConfig() {
    return connectionUnitConfig;
  }

  public void setConnectionUnitConfig(List<OpenbaseUnitConfig> connectionUnitConfig) {
    this.connectionUnitConfig = connectionUnitConfig;
  }

  public OpenbaseUnitRegistryData connectionUnitConfigRegistryConsistent(Boolean connectionUnitConfigRegistryConsistent) {
    this.connectionUnitConfigRegistryConsistent = connectionUnitConfigRegistryConsistent;
    return this;
  }

  /**
   * Get connectionUnitConfigRegistryConsistent
   * @return connectionUnitConfigRegistryConsistent
  */
  @ApiModelProperty(value = "")


  public Boolean getConnectionUnitConfigRegistryConsistent() {
    return connectionUnitConfigRegistryConsistent;
  }

  public void setConnectionUnitConfigRegistryConsistent(Boolean connectionUnitConfigRegistryConsistent) {
    this.connectionUnitConfigRegistryConsistent = connectionUnitConfigRegistryConsistent;
  }

  public OpenbaseUnitRegistryData connectionUnitConfigRegistryReadOnly(Boolean connectionUnitConfigRegistryReadOnly) {
    this.connectionUnitConfigRegistryReadOnly = connectionUnitConfigRegistryReadOnly;
    return this;
  }

  /**
   * Get connectionUnitConfigRegistryReadOnly
   * @return connectionUnitConfigRegistryReadOnly
  */
  @ApiModelProperty(value = "")


  public Boolean getConnectionUnitConfigRegistryReadOnly() {
    return connectionUnitConfigRegistryReadOnly;
  }

  public void setConnectionUnitConfigRegistryReadOnly(Boolean connectionUnitConfigRegistryReadOnly) {
    this.connectionUnitConfigRegistryReadOnly = connectionUnitConfigRegistryReadOnly;
  }

  public OpenbaseUnitRegistryData dalUnitConfig(List<OpenbaseUnitConfig> dalUnitConfig) {
    this.dalUnitConfig = dalUnitConfig;
    return this;
  }

  public OpenbaseUnitRegistryData addDalUnitConfigItem(OpenbaseUnitConfig dalUnitConfigItem) {
    if (this.dalUnitConfig == null) {
      this.dalUnitConfig = new ArrayList<>();
    }
    this.dalUnitConfig.add(dalUnitConfigItem);
    return this;
  }

  /**
   * Get dalUnitConfig
   * @return dalUnitConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseUnitConfig> getDalUnitConfig() {
    return dalUnitConfig;
  }

  public void setDalUnitConfig(List<OpenbaseUnitConfig> dalUnitConfig) {
    this.dalUnitConfig = dalUnitConfig;
  }

  public OpenbaseUnitRegistryData dalUnitConfigRegistryConsistent(Boolean dalUnitConfigRegistryConsistent) {
    this.dalUnitConfigRegistryConsistent = dalUnitConfigRegistryConsistent;
    return this;
  }

  /**
   * Get dalUnitConfigRegistryConsistent
   * @return dalUnitConfigRegistryConsistent
  */
  @ApiModelProperty(value = "")


  public Boolean getDalUnitConfigRegistryConsistent() {
    return dalUnitConfigRegistryConsistent;
  }

  public void setDalUnitConfigRegistryConsistent(Boolean dalUnitConfigRegistryConsistent) {
    this.dalUnitConfigRegistryConsistent = dalUnitConfigRegistryConsistent;
  }

  public OpenbaseUnitRegistryData dalUnitConfigRegistryReadOnly(Boolean dalUnitConfigRegistryReadOnly) {
    this.dalUnitConfigRegistryReadOnly = dalUnitConfigRegistryReadOnly;
    return this;
  }

  /**
   * Get dalUnitConfigRegistryReadOnly
   * @return dalUnitConfigRegistryReadOnly
  */
  @ApiModelProperty(value = "")


  public Boolean getDalUnitConfigRegistryReadOnly() {
    return dalUnitConfigRegistryReadOnly;
  }

  public void setDalUnitConfigRegistryReadOnly(Boolean dalUnitConfigRegistryReadOnly) {
    this.dalUnitConfigRegistryReadOnly = dalUnitConfigRegistryReadOnly;
  }

  public OpenbaseUnitRegistryData deviceUnitConfig(List<OpenbaseUnitConfig> deviceUnitConfig) {
    this.deviceUnitConfig = deviceUnitConfig;
    return this;
  }

  public OpenbaseUnitRegistryData addDeviceUnitConfigItem(OpenbaseUnitConfig deviceUnitConfigItem) {
    if (this.deviceUnitConfig == null) {
      this.deviceUnitConfig = new ArrayList<>();
    }
    this.deviceUnitConfig.add(deviceUnitConfigItem);
    return this;
  }

  /**
   * Get deviceUnitConfig
   * @return deviceUnitConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseUnitConfig> getDeviceUnitConfig() {
    return deviceUnitConfig;
  }

  public void setDeviceUnitConfig(List<OpenbaseUnitConfig> deviceUnitConfig) {
    this.deviceUnitConfig = deviceUnitConfig;
  }

  public OpenbaseUnitRegistryData deviceUnitConfigRegistryConsistent(Boolean deviceUnitConfigRegistryConsistent) {
    this.deviceUnitConfigRegistryConsistent = deviceUnitConfigRegistryConsistent;
    return this;
  }

  /**
   * Get deviceUnitConfigRegistryConsistent
   * @return deviceUnitConfigRegistryConsistent
  */
  @ApiModelProperty(value = "")


  public Boolean getDeviceUnitConfigRegistryConsistent() {
    return deviceUnitConfigRegistryConsistent;
  }

  public void setDeviceUnitConfigRegistryConsistent(Boolean deviceUnitConfigRegistryConsistent) {
    this.deviceUnitConfigRegistryConsistent = deviceUnitConfigRegistryConsistent;
  }

  public OpenbaseUnitRegistryData deviceUnitConfigRegistryReadOnly(Boolean deviceUnitConfigRegistryReadOnly) {
    this.deviceUnitConfigRegistryReadOnly = deviceUnitConfigRegistryReadOnly;
    return this;
  }

  /**
   * Get deviceUnitConfigRegistryReadOnly
   * @return deviceUnitConfigRegistryReadOnly
  */
  @ApiModelProperty(value = "")


  public Boolean getDeviceUnitConfigRegistryReadOnly() {
    return deviceUnitConfigRegistryReadOnly;
  }

  public void setDeviceUnitConfigRegistryReadOnly(Boolean deviceUnitConfigRegistryReadOnly) {
    this.deviceUnitConfigRegistryReadOnly = deviceUnitConfigRegistryReadOnly;
  }

  public OpenbaseUnitRegistryData label(String label) {
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

  public OpenbaseUnitRegistryData locationUnitConfig(List<OpenbaseUnitConfig> locationUnitConfig) {
    this.locationUnitConfig = locationUnitConfig;
    return this;
  }

  public OpenbaseUnitRegistryData addLocationUnitConfigItem(OpenbaseUnitConfig locationUnitConfigItem) {
    if (this.locationUnitConfig == null) {
      this.locationUnitConfig = new ArrayList<>();
    }
    this.locationUnitConfig.add(locationUnitConfigItem);
    return this;
  }

  /**
   * Get locationUnitConfig
   * @return locationUnitConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseUnitConfig> getLocationUnitConfig() {
    return locationUnitConfig;
  }

  public void setLocationUnitConfig(List<OpenbaseUnitConfig> locationUnitConfig) {
    this.locationUnitConfig = locationUnitConfig;
  }

  public OpenbaseUnitRegistryData locationUnitConfigRegistryConsistent(Boolean locationUnitConfigRegistryConsistent) {
    this.locationUnitConfigRegistryConsistent = locationUnitConfigRegistryConsistent;
    return this;
  }

  /**
   * Get locationUnitConfigRegistryConsistent
   * @return locationUnitConfigRegistryConsistent
  */
  @ApiModelProperty(value = "")


  public Boolean getLocationUnitConfigRegistryConsistent() {
    return locationUnitConfigRegistryConsistent;
  }

  public void setLocationUnitConfigRegistryConsistent(Boolean locationUnitConfigRegistryConsistent) {
    this.locationUnitConfigRegistryConsistent = locationUnitConfigRegistryConsistent;
  }

  public OpenbaseUnitRegistryData locationUnitConfigRegistryReadOnly(Boolean locationUnitConfigRegistryReadOnly) {
    this.locationUnitConfigRegistryReadOnly = locationUnitConfigRegistryReadOnly;
    return this;
  }

  /**
   * Get locationUnitConfigRegistryReadOnly
   * @return locationUnitConfigRegistryReadOnly
  */
  @ApiModelProperty(value = "")


  public Boolean getLocationUnitConfigRegistryReadOnly() {
    return locationUnitConfigRegistryReadOnly;
  }

  public void setLocationUnitConfigRegistryReadOnly(Boolean locationUnitConfigRegistryReadOnly) {
    this.locationUnitConfigRegistryReadOnly = locationUnitConfigRegistryReadOnly;
  }

  public OpenbaseUnitRegistryData objectUnitConfig(List<OpenbaseUnitConfig> objectUnitConfig) {
    this.objectUnitConfig = objectUnitConfig;
    return this;
  }

  public OpenbaseUnitRegistryData addObjectUnitConfigItem(OpenbaseUnitConfig objectUnitConfigItem) {
    if (this.objectUnitConfig == null) {
      this.objectUnitConfig = new ArrayList<>();
    }
    this.objectUnitConfig.add(objectUnitConfigItem);
    return this;
  }

  /**
   * Get objectUnitConfig
   * @return objectUnitConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseUnitConfig> getObjectUnitConfig() {
    return objectUnitConfig;
  }

  public void setObjectUnitConfig(List<OpenbaseUnitConfig> objectUnitConfig) {
    this.objectUnitConfig = objectUnitConfig;
  }

  public OpenbaseUnitRegistryData objectUnitConfigRegistryConsistent(Boolean objectUnitConfigRegistryConsistent) {
    this.objectUnitConfigRegistryConsistent = objectUnitConfigRegistryConsistent;
    return this;
  }

  /**
   * Get objectUnitConfigRegistryConsistent
   * @return objectUnitConfigRegistryConsistent
  */
  @ApiModelProperty(value = "")


  public Boolean getObjectUnitConfigRegistryConsistent() {
    return objectUnitConfigRegistryConsistent;
  }

  public void setObjectUnitConfigRegistryConsistent(Boolean objectUnitConfigRegistryConsistent) {
    this.objectUnitConfigRegistryConsistent = objectUnitConfigRegistryConsistent;
  }

  public OpenbaseUnitRegistryData objectUnitConfigRegistryReadOnly(Boolean objectUnitConfigRegistryReadOnly) {
    this.objectUnitConfigRegistryReadOnly = objectUnitConfigRegistryReadOnly;
    return this;
  }

  /**
   * Get objectUnitConfigRegistryReadOnly
   * @return objectUnitConfigRegistryReadOnly
  */
  @ApiModelProperty(value = "")


  public Boolean getObjectUnitConfigRegistryReadOnly() {
    return objectUnitConfigRegistryReadOnly;
  }

  public void setObjectUnitConfigRegistryReadOnly(Boolean objectUnitConfigRegistryReadOnly) {
    this.objectUnitConfigRegistryReadOnly = objectUnitConfigRegistryReadOnly;
  }

  public OpenbaseUnitRegistryData sceneUnitConfig(List<OpenbaseUnitConfig> sceneUnitConfig) {
    this.sceneUnitConfig = sceneUnitConfig;
    return this;
  }

  public OpenbaseUnitRegistryData addSceneUnitConfigItem(OpenbaseUnitConfig sceneUnitConfigItem) {
    if (this.sceneUnitConfig == null) {
      this.sceneUnitConfig = new ArrayList<>();
    }
    this.sceneUnitConfig.add(sceneUnitConfigItem);
    return this;
  }

  /**
   * Get sceneUnitConfig
   * @return sceneUnitConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseUnitConfig> getSceneUnitConfig() {
    return sceneUnitConfig;
  }

  public void setSceneUnitConfig(List<OpenbaseUnitConfig> sceneUnitConfig) {
    this.sceneUnitConfig = sceneUnitConfig;
  }

  public OpenbaseUnitRegistryData sceneUnitConfigRegistryConsistent(Boolean sceneUnitConfigRegistryConsistent) {
    this.sceneUnitConfigRegistryConsistent = sceneUnitConfigRegistryConsistent;
    return this;
  }

  /**
   * Get sceneUnitConfigRegistryConsistent
   * @return sceneUnitConfigRegistryConsistent
  */
  @ApiModelProperty(value = "")


  public Boolean getSceneUnitConfigRegistryConsistent() {
    return sceneUnitConfigRegistryConsistent;
  }

  public void setSceneUnitConfigRegistryConsistent(Boolean sceneUnitConfigRegistryConsistent) {
    this.sceneUnitConfigRegistryConsistent = sceneUnitConfigRegistryConsistent;
  }

  public OpenbaseUnitRegistryData sceneUnitConfigRegistryReadOnly(Boolean sceneUnitConfigRegistryReadOnly) {
    this.sceneUnitConfigRegistryReadOnly = sceneUnitConfigRegistryReadOnly;
    return this;
  }

  /**
   * Get sceneUnitConfigRegistryReadOnly
   * @return sceneUnitConfigRegistryReadOnly
  */
  @ApiModelProperty(value = "")


  public Boolean getSceneUnitConfigRegistryReadOnly() {
    return sceneUnitConfigRegistryReadOnly;
  }

  public void setSceneUnitConfigRegistryReadOnly(Boolean sceneUnitConfigRegistryReadOnly) {
    this.sceneUnitConfigRegistryReadOnly = sceneUnitConfigRegistryReadOnly;
  }

  public OpenbaseUnitRegistryData transactionId(Long transactionId) {
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

  public OpenbaseUnitRegistryData unitConfigRegistryConsistent(Boolean unitConfigRegistryConsistent) {
    this.unitConfigRegistryConsistent = unitConfigRegistryConsistent;
    return this;
  }

  /**
   * Get unitConfigRegistryConsistent
   * @return unitConfigRegistryConsistent
  */
  @ApiModelProperty(value = "")


  public Boolean getUnitConfigRegistryConsistent() {
    return unitConfigRegistryConsistent;
  }

  public void setUnitConfigRegistryConsistent(Boolean unitConfigRegistryConsistent) {
    this.unitConfigRegistryConsistent = unitConfigRegistryConsistent;
  }

  public OpenbaseUnitRegistryData unitConfigRegistryReadOnly(Boolean unitConfigRegistryReadOnly) {
    this.unitConfigRegistryReadOnly = unitConfigRegistryReadOnly;
    return this;
  }

  /**
   * Get unitConfigRegistryReadOnly
   * @return unitConfigRegistryReadOnly
  */
  @ApiModelProperty(value = "")


  public Boolean getUnitConfigRegistryReadOnly() {
    return unitConfigRegistryReadOnly;
  }

  public void setUnitConfigRegistryReadOnly(Boolean unitConfigRegistryReadOnly) {
    this.unitConfigRegistryReadOnly = unitConfigRegistryReadOnly;
  }

  public OpenbaseUnitRegistryData unitGroupUnitConfig(List<OpenbaseUnitConfig> unitGroupUnitConfig) {
    this.unitGroupUnitConfig = unitGroupUnitConfig;
    return this;
  }

  public OpenbaseUnitRegistryData addUnitGroupUnitConfigItem(OpenbaseUnitConfig unitGroupUnitConfigItem) {
    if (this.unitGroupUnitConfig == null) {
      this.unitGroupUnitConfig = new ArrayList<>();
    }
    this.unitGroupUnitConfig.add(unitGroupUnitConfigItem);
    return this;
  }

  /**
   * Get unitGroupUnitConfig
   * @return unitGroupUnitConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseUnitConfig> getUnitGroupUnitConfig() {
    return unitGroupUnitConfig;
  }

  public void setUnitGroupUnitConfig(List<OpenbaseUnitConfig> unitGroupUnitConfig) {
    this.unitGroupUnitConfig = unitGroupUnitConfig;
  }

  public OpenbaseUnitRegistryData unitGroupUnitConfigRegistryConsistent(Boolean unitGroupUnitConfigRegistryConsistent) {
    this.unitGroupUnitConfigRegistryConsistent = unitGroupUnitConfigRegistryConsistent;
    return this;
  }

  /**
   * Get unitGroupUnitConfigRegistryConsistent
   * @return unitGroupUnitConfigRegistryConsistent
  */
  @ApiModelProperty(value = "")


  public Boolean getUnitGroupUnitConfigRegistryConsistent() {
    return unitGroupUnitConfigRegistryConsistent;
  }

  public void setUnitGroupUnitConfigRegistryConsistent(Boolean unitGroupUnitConfigRegistryConsistent) {
    this.unitGroupUnitConfigRegistryConsistent = unitGroupUnitConfigRegistryConsistent;
  }

  public OpenbaseUnitRegistryData unitGroupUnitConfigRegistryReadOnly(Boolean unitGroupUnitConfigRegistryReadOnly) {
    this.unitGroupUnitConfigRegistryReadOnly = unitGroupUnitConfigRegistryReadOnly;
    return this;
  }

  /**
   * Get unitGroupUnitConfigRegistryReadOnly
   * @return unitGroupUnitConfigRegistryReadOnly
  */
  @ApiModelProperty(value = "")


  public Boolean getUnitGroupUnitConfigRegistryReadOnly() {
    return unitGroupUnitConfigRegistryReadOnly;
  }

  public void setUnitGroupUnitConfigRegistryReadOnly(Boolean unitGroupUnitConfigRegistryReadOnly) {
    this.unitGroupUnitConfigRegistryReadOnly = unitGroupUnitConfigRegistryReadOnly;
  }

  public OpenbaseUnitRegistryData userUnitConfig(List<OpenbaseUnitConfig> userUnitConfig) {
    this.userUnitConfig = userUnitConfig;
    return this;
  }

  public OpenbaseUnitRegistryData addUserUnitConfigItem(OpenbaseUnitConfig userUnitConfigItem) {
    if (this.userUnitConfig == null) {
      this.userUnitConfig = new ArrayList<>();
    }
    this.userUnitConfig.add(userUnitConfigItem);
    return this;
  }

  /**
   * Get userUnitConfig
   * @return userUnitConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseUnitConfig> getUserUnitConfig() {
    return userUnitConfig;
  }

  public void setUserUnitConfig(List<OpenbaseUnitConfig> userUnitConfig) {
    this.userUnitConfig = userUnitConfig;
  }

  public OpenbaseUnitRegistryData userUnitConfigRegistryConsistent(Boolean userUnitConfigRegistryConsistent) {
    this.userUnitConfigRegistryConsistent = userUnitConfigRegistryConsistent;
    return this;
  }

  /**
   * Get userUnitConfigRegistryConsistent
   * @return userUnitConfigRegistryConsistent
  */
  @ApiModelProperty(value = "")


  public Boolean getUserUnitConfigRegistryConsistent() {
    return userUnitConfigRegistryConsistent;
  }

  public void setUserUnitConfigRegistryConsistent(Boolean userUnitConfigRegistryConsistent) {
    this.userUnitConfigRegistryConsistent = userUnitConfigRegistryConsistent;
  }

  public OpenbaseUnitRegistryData userUnitConfigRegistryReadOnly(Boolean userUnitConfigRegistryReadOnly) {
    this.userUnitConfigRegistryReadOnly = userUnitConfigRegistryReadOnly;
    return this;
  }

  /**
   * Get userUnitConfigRegistryReadOnly
   * @return userUnitConfigRegistryReadOnly
  */
  @ApiModelProperty(value = "")


  public Boolean getUserUnitConfigRegistryReadOnly() {
    return userUnitConfigRegistryReadOnly;
  }

  public void setUserUnitConfigRegistryReadOnly(Boolean userUnitConfigRegistryReadOnly) {
    this.userUnitConfigRegistryReadOnly = userUnitConfigRegistryReadOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseUnitRegistryData openbaseUnitRegistryData = (OpenbaseUnitRegistryData) o;
    return Objects.equals(this.agentUnitConfig, openbaseUnitRegistryData.agentUnitConfig) &&
        Objects.equals(this.agentUnitConfigRegistryConsistent, openbaseUnitRegistryData.agentUnitConfigRegistryConsistent) &&
        Objects.equals(this.agentUnitConfigRegistryReadOnly, openbaseUnitRegistryData.agentUnitConfigRegistryReadOnly) &&
        Objects.equals(this.appUnitConfig, openbaseUnitRegistryData.appUnitConfig) &&
        Objects.equals(this.appUnitConfigRegistryConsistent, openbaseUnitRegistryData.appUnitConfigRegistryConsistent) &&
        Objects.equals(this.appUnitConfigRegistryReadOnly, openbaseUnitRegistryData.appUnitConfigRegistryReadOnly) &&
        Objects.equals(this.authorizationGroupUnitConfig, openbaseUnitRegistryData.authorizationGroupUnitConfig) &&
        Objects.equals(this.authorizationGroupUnitConfigRegistryConsistent, openbaseUnitRegistryData.authorizationGroupUnitConfigRegistryConsistent) &&
        Objects.equals(this.authorizationGroupUnitConfigRegistryReadOnly, openbaseUnitRegistryData.authorizationGroupUnitConfigRegistryReadOnly) &&
        Objects.equals(this.connectionUnitConfig, openbaseUnitRegistryData.connectionUnitConfig) &&
        Objects.equals(this.connectionUnitConfigRegistryConsistent, openbaseUnitRegistryData.connectionUnitConfigRegistryConsistent) &&
        Objects.equals(this.connectionUnitConfigRegistryReadOnly, openbaseUnitRegistryData.connectionUnitConfigRegistryReadOnly) &&
        Objects.equals(this.dalUnitConfig, openbaseUnitRegistryData.dalUnitConfig) &&
        Objects.equals(this.dalUnitConfigRegistryConsistent, openbaseUnitRegistryData.dalUnitConfigRegistryConsistent) &&
        Objects.equals(this.dalUnitConfigRegistryReadOnly, openbaseUnitRegistryData.dalUnitConfigRegistryReadOnly) &&
        Objects.equals(this.deviceUnitConfig, openbaseUnitRegistryData.deviceUnitConfig) &&
        Objects.equals(this.deviceUnitConfigRegistryConsistent, openbaseUnitRegistryData.deviceUnitConfigRegistryConsistent) &&
        Objects.equals(this.deviceUnitConfigRegistryReadOnly, openbaseUnitRegistryData.deviceUnitConfigRegistryReadOnly) &&
        Objects.equals(this.label, openbaseUnitRegistryData.label) &&
        Objects.equals(this.locationUnitConfig, openbaseUnitRegistryData.locationUnitConfig) &&
        Objects.equals(this.locationUnitConfigRegistryConsistent, openbaseUnitRegistryData.locationUnitConfigRegistryConsistent) &&
        Objects.equals(this.locationUnitConfigRegistryReadOnly, openbaseUnitRegistryData.locationUnitConfigRegistryReadOnly) &&
        Objects.equals(this.objectUnitConfig, openbaseUnitRegistryData.objectUnitConfig) &&
        Objects.equals(this.objectUnitConfigRegistryConsistent, openbaseUnitRegistryData.objectUnitConfigRegistryConsistent) &&
        Objects.equals(this.objectUnitConfigRegistryReadOnly, openbaseUnitRegistryData.objectUnitConfigRegistryReadOnly) &&
        Objects.equals(this.sceneUnitConfig, openbaseUnitRegistryData.sceneUnitConfig) &&
        Objects.equals(this.sceneUnitConfigRegistryConsistent, openbaseUnitRegistryData.sceneUnitConfigRegistryConsistent) &&
        Objects.equals(this.sceneUnitConfigRegistryReadOnly, openbaseUnitRegistryData.sceneUnitConfigRegistryReadOnly) &&
        Objects.equals(this.transactionId, openbaseUnitRegistryData.transactionId) &&
        Objects.equals(this.unitConfigRegistryConsistent, openbaseUnitRegistryData.unitConfigRegistryConsistent) &&
        Objects.equals(this.unitConfigRegistryReadOnly, openbaseUnitRegistryData.unitConfigRegistryReadOnly) &&
        Objects.equals(this.unitGroupUnitConfig, openbaseUnitRegistryData.unitGroupUnitConfig) &&
        Objects.equals(this.unitGroupUnitConfigRegistryConsistent, openbaseUnitRegistryData.unitGroupUnitConfigRegistryConsistent) &&
        Objects.equals(this.unitGroupUnitConfigRegistryReadOnly, openbaseUnitRegistryData.unitGroupUnitConfigRegistryReadOnly) &&
        Objects.equals(this.userUnitConfig, openbaseUnitRegistryData.userUnitConfig) &&
        Objects.equals(this.userUnitConfigRegistryConsistent, openbaseUnitRegistryData.userUnitConfigRegistryConsistent) &&
        Objects.equals(this.userUnitConfigRegistryReadOnly, openbaseUnitRegistryData.userUnitConfigRegistryReadOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentUnitConfig, agentUnitConfigRegistryConsistent, agentUnitConfigRegistryReadOnly, appUnitConfig, appUnitConfigRegistryConsistent, appUnitConfigRegistryReadOnly, authorizationGroupUnitConfig, authorizationGroupUnitConfigRegistryConsistent, authorizationGroupUnitConfigRegistryReadOnly, connectionUnitConfig, connectionUnitConfigRegistryConsistent, connectionUnitConfigRegistryReadOnly, dalUnitConfig, dalUnitConfigRegistryConsistent, dalUnitConfigRegistryReadOnly, deviceUnitConfig, deviceUnitConfigRegistryConsistent, deviceUnitConfigRegistryReadOnly, label, locationUnitConfig, locationUnitConfigRegistryConsistent, locationUnitConfigRegistryReadOnly, objectUnitConfig, objectUnitConfigRegistryConsistent, objectUnitConfigRegistryReadOnly, sceneUnitConfig, sceneUnitConfigRegistryConsistent, sceneUnitConfigRegistryReadOnly, transactionId, unitConfigRegistryConsistent, unitConfigRegistryReadOnly, unitGroupUnitConfig, unitGroupUnitConfigRegistryConsistent, unitGroupUnitConfigRegistryReadOnly, userUnitConfig, userUnitConfigRegistryConsistent, userUnitConfigRegistryReadOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseUnitRegistryData {\n");
    
    sb.append("    agentUnitConfig: ").append(toIndentedString(agentUnitConfig)).append("\n");
    sb.append("    agentUnitConfigRegistryConsistent: ").append(toIndentedString(agentUnitConfigRegistryConsistent)).append("\n");
    sb.append("    agentUnitConfigRegistryReadOnly: ").append(toIndentedString(agentUnitConfigRegistryReadOnly)).append("\n");
    sb.append("    appUnitConfig: ").append(toIndentedString(appUnitConfig)).append("\n");
    sb.append("    appUnitConfigRegistryConsistent: ").append(toIndentedString(appUnitConfigRegistryConsistent)).append("\n");
    sb.append("    appUnitConfigRegistryReadOnly: ").append(toIndentedString(appUnitConfigRegistryReadOnly)).append("\n");
    sb.append("    authorizationGroupUnitConfig: ").append(toIndentedString(authorizationGroupUnitConfig)).append("\n");
    sb.append("    authorizationGroupUnitConfigRegistryConsistent: ").append(toIndentedString(authorizationGroupUnitConfigRegistryConsistent)).append("\n");
    sb.append("    authorizationGroupUnitConfigRegistryReadOnly: ").append(toIndentedString(authorizationGroupUnitConfigRegistryReadOnly)).append("\n");
    sb.append("    connectionUnitConfig: ").append(toIndentedString(connectionUnitConfig)).append("\n");
    sb.append("    connectionUnitConfigRegistryConsistent: ").append(toIndentedString(connectionUnitConfigRegistryConsistent)).append("\n");
    sb.append("    connectionUnitConfigRegistryReadOnly: ").append(toIndentedString(connectionUnitConfigRegistryReadOnly)).append("\n");
    sb.append("    dalUnitConfig: ").append(toIndentedString(dalUnitConfig)).append("\n");
    sb.append("    dalUnitConfigRegistryConsistent: ").append(toIndentedString(dalUnitConfigRegistryConsistent)).append("\n");
    sb.append("    dalUnitConfigRegistryReadOnly: ").append(toIndentedString(dalUnitConfigRegistryReadOnly)).append("\n");
    sb.append("    deviceUnitConfig: ").append(toIndentedString(deviceUnitConfig)).append("\n");
    sb.append("    deviceUnitConfigRegistryConsistent: ").append(toIndentedString(deviceUnitConfigRegistryConsistent)).append("\n");
    sb.append("    deviceUnitConfigRegistryReadOnly: ").append(toIndentedString(deviceUnitConfigRegistryReadOnly)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    locationUnitConfig: ").append(toIndentedString(locationUnitConfig)).append("\n");
    sb.append("    locationUnitConfigRegistryConsistent: ").append(toIndentedString(locationUnitConfigRegistryConsistent)).append("\n");
    sb.append("    locationUnitConfigRegistryReadOnly: ").append(toIndentedString(locationUnitConfigRegistryReadOnly)).append("\n");
    sb.append("    objectUnitConfig: ").append(toIndentedString(objectUnitConfig)).append("\n");
    sb.append("    objectUnitConfigRegistryConsistent: ").append(toIndentedString(objectUnitConfigRegistryConsistent)).append("\n");
    sb.append("    objectUnitConfigRegistryReadOnly: ").append(toIndentedString(objectUnitConfigRegistryReadOnly)).append("\n");
    sb.append("    sceneUnitConfig: ").append(toIndentedString(sceneUnitConfig)).append("\n");
    sb.append("    sceneUnitConfigRegistryConsistent: ").append(toIndentedString(sceneUnitConfigRegistryConsistent)).append("\n");
    sb.append("    sceneUnitConfigRegistryReadOnly: ").append(toIndentedString(sceneUnitConfigRegistryReadOnly)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    unitConfigRegistryConsistent: ").append(toIndentedString(unitConfigRegistryConsistent)).append("\n");
    sb.append("    unitConfigRegistryReadOnly: ").append(toIndentedString(unitConfigRegistryReadOnly)).append("\n");
    sb.append("    unitGroupUnitConfig: ").append(toIndentedString(unitGroupUnitConfig)).append("\n");
    sb.append("    unitGroupUnitConfigRegistryConsistent: ").append(toIndentedString(unitGroupUnitConfigRegistryConsistent)).append("\n");
    sb.append("    unitGroupUnitConfigRegistryReadOnly: ").append(toIndentedString(unitGroupUnitConfigRegistryReadOnly)).append("\n");
    sb.append("    userUnitConfig: ").append(toIndentedString(userUnitConfig)).append("\n");
    sb.append("    userUnitConfigRegistryConsistent: ").append(toIndentedString(userUnitConfigRegistryConsistent)).append("\n");
    sb.append("    userUnitConfigRegistryReadOnly: ").append(toIndentedString(userUnitConfigRegistryReadOnly)).append("\n");
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

