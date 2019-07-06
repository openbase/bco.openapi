package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseAgentConfig;
import org.openapitools.model.OpenbaseAppConfig;
import org.openapitools.model.OpenbaseAuthorizationGroupConfig;
import org.openapitools.model.OpenbaseConnectionConfig;
import org.openapitools.model.OpenbaseDeviceConfig;
import org.openapitools.model.OpenbaseEnablingState;
import org.openapitools.model.OpenbaseLabel;
import org.openapitools.model.OpenbaseLocationConfig;
import org.openapitools.model.OpenbaseMetaConfig;
import org.openapitools.model.OpenbaseMultiLanguageText;
import org.openapitools.model.OpenbaseObjectConfig;
import org.openapitools.model.OpenbasePermissionConfig;
import org.openapitools.model.OpenbasePlacementConfig;
import org.openapitools.model.OpenbaseSceneConfig;
import org.openapitools.model.OpenbaseScope;
import org.openapitools.model.OpenbaseServiceConfig;
import org.openapitools.model.OpenbaseUnitGroupConfig;
import org.openapitools.model.OpenbaseUnitTemplateUnitType;
import org.openapitools.model.OpenbaseUserConfig;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseUnitConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbaseUnitConfig   {
  @JsonProperty("agent_config")
  private OpenbaseAgentConfig agentConfig = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("app_config")
  private OpenbaseAppConfig appConfig = null;

  @JsonProperty("authorization_group_config")
  private OpenbaseAuthorizationGroupConfig authorizationGroupConfig = null;

  @JsonProperty("bound_to_unit_host")
  private Boolean boundToUnitHost;

  @JsonProperty("connection_config")
  private OpenbaseConnectionConfig connectionConfig = null;

  @JsonProperty("description")
  private OpenbaseMultiLanguageText description = null;

  @JsonProperty("device_config")
  private OpenbaseDeviceConfig deviceConfig = null;

  @JsonProperty("enabling_state")
  private OpenbaseEnablingState enablingState = null;

  @JsonProperty("id")
  private String id;

  @JsonProperty("label")
  private OpenbaseLabel label = null;

  @JsonProperty("location_config")
  private OpenbaseLocationConfig locationConfig = null;

  @JsonProperty("meta_config")
  private OpenbaseMetaConfig metaConfig = null;

  @JsonProperty("object_config")
  private OpenbaseObjectConfig objectConfig = null;

  @JsonProperty("permission_config")
  private OpenbasePermissionConfig permissionConfig = null;

  @JsonProperty("placement_config")
  private OpenbasePlacementConfig placementConfig = null;

  @JsonProperty("scene_config")
  private OpenbaseSceneConfig sceneConfig = null;

  @JsonProperty("scope")
  private OpenbaseScope scope = null;

  @JsonProperty("service_config")
  @Valid
  private List<OpenbaseServiceConfig> serviceConfig = null;

  @JsonProperty("unit_group_config")
  private OpenbaseUnitGroupConfig unitGroupConfig = null;

  @JsonProperty("unit_host_id")
  private String unitHostId;

  @JsonProperty("unit_template_config_id")
  private String unitTemplateConfigId;

  @JsonProperty("unit_type")
  private OpenbaseUnitTemplateUnitType unitType;

  @JsonProperty("user_config")
  private OpenbaseUserConfig userConfig = null;

  public OpenbaseUnitConfig agentConfig(OpenbaseAgentConfig agentConfig) {
    this.agentConfig = agentConfig;
    return this;
  }

  /**
   * Get agentConfig
   * @return agentConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseAgentConfig getAgentConfig() {
    return agentConfig;
  }

  public void setAgentConfig(OpenbaseAgentConfig agentConfig) {
    this.agentConfig = agentConfig;
  }

  public OpenbaseUnitConfig alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseUnitConfig addAliasItem(String aliasItem) {
    if (this.alias == null) {
      this.alias = new ArrayList<>();
    }
    this.alias.add(aliasItem);
    return this;
  }

  /**
   * Get alias
   * @return alias
  */
  @ApiModelProperty(value = "")


  public List<String> getAlias() {
    return alias;
  }

  public void setAlias(List<String> alias) {
    this.alias = alias;
  }

  public OpenbaseUnitConfig appConfig(OpenbaseAppConfig appConfig) {
    this.appConfig = appConfig;
    return this;
  }

  /**
   * Get appConfig
   * @return appConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseAppConfig getAppConfig() {
    return appConfig;
  }

  public void setAppConfig(OpenbaseAppConfig appConfig) {
    this.appConfig = appConfig;
  }

  public OpenbaseUnitConfig authorizationGroupConfig(OpenbaseAuthorizationGroupConfig authorizationGroupConfig) {
    this.authorizationGroupConfig = authorizationGroupConfig;
    return this;
  }

  /**
   * Get authorizationGroupConfig
   * @return authorizationGroupConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseAuthorizationGroupConfig getAuthorizationGroupConfig() {
    return authorizationGroupConfig;
  }

  public void setAuthorizationGroupConfig(OpenbaseAuthorizationGroupConfig authorizationGroupConfig) {
    this.authorizationGroupConfig = authorizationGroupConfig;
  }

  public OpenbaseUnitConfig boundToUnitHost(Boolean boundToUnitHost) {
    this.boundToUnitHost = boundToUnitHost;
    return this;
  }

  /**
   * Get boundToUnitHost
   * @return boundToUnitHost
  */
  @ApiModelProperty(value = "")


  public Boolean getBoundToUnitHost() {
    return boundToUnitHost;
  }

  public void setBoundToUnitHost(Boolean boundToUnitHost) {
    this.boundToUnitHost = boundToUnitHost;
  }

  public OpenbaseUnitConfig connectionConfig(OpenbaseConnectionConfig connectionConfig) {
    this.connectionConfig = connectionConfig;
    return this;
  }

  /**
   * Get connectionConfig
   * @return connectionConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseConnectionConfig getConnectionConfig() {
    return connectionConfig;
  }

  public void setConnectionConfig(OpenbaseConnectionConfig connectionConfig) {
    this.connectionConfig = connectionConfig;
  }

  public OpenbaseUnitConfig description(OpenbaseMultiLanguageText description) {
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

  public OpenbaseUnitConfig deviceConfig(OpenbaseDeviceConfig deviceConfig) {
    this.deviceConfig = deviceConfig;
    return this;
  }

  /**
   * Get deviceConfig
   * @return deviceConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseDeviceConfig getDeviceConfig() {
    return deviceConfig;
  }

  public void setDeviceConfig(OpenbaseDeviceConfig deviceConfig) {
    this.deviceConfig = deviceConfig;
  }

  public OpenbaseUnitConfig enablingState(OpenbaseEnablingState enablingState) {
    this.enablingState = enablingState;
    return this;
  }

  /**
   * Get enablingState
   * @return enablingState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseEnablingState getEnablingState() {
    return enablingState;
  }

  public void setEnablingState(OpenbaseEnablingState enablingState) {
    this.enablingState = enablingState;
  }

  public OpenbaseUnitConfig id(String id) {
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

  public OpenbaseUnitConfig label(OpenbaseLabel label) {
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

  public OpenbaseUnitConfig locationConfig(OpenbaseLocationConfig locationConfig) {
    this.locationConfig = locationConfig;
    return this;
  }

  /**
   * Get locationConfig
   * @return locationConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseLocationConfig getLocationConfig() {
    return locationConfig;
  }

  public void setLocationConfig(OpenbaseLocationConfig locationConfig) {
    this.locationConfig = locationConfig;
  }

  public OpenbaseUnitConfig metaConfig(OpenbaseMetaConfig metaConfig) {
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

  public OpenbaseUnitConfig objectConfig(OpenbaseObjectConfig objectConfig) {
    this.objectConfig = objectConfig;
    return this;
  }

  /**
   * Get objectConfig
   * @return objectConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseObjectConfig getObjectConfig() {
    return objectConfig;
  }

  public void setObjectConfig(OpenbaseObjectConfig objectConfig) {
    this.objectConfig = objectConfig;
  }

  public OpenbaseUnitConfig permissionConfig(OpenbasePermissionConfig permissionConfig) {
    this.permissionConfig = permissionConfig;
    return this;
  }

  /**
   * Get permissionConfig
   * @return permissionConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePermissionConfig getPermissionConfig() {
    return permissionConfig;
  }

  public void setPermissionConfig(OpenbasePermissionConfig permissionConfig) {
    this.permissionConfig = permissionConfig;
  }

  public OpenbaseUnitConfig placementConfig(OpenbasePlacementConfig placementConfig) {
    this.placementConfig = placementConfig;
    return this;
  }

  /**
   * Get placementConfig
   * @return placementConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePlacementConfig getPlacementConfig() {
    return placementConfig;
  }

  public void setPlacementConfig(OpenbasePlacementConfig placementConfig) {
    this.placementConfig = placementConfig;
  }

  public OpenbaseUnitConfig sceneConfig(OpenbaseSceneConfig sceneConfig) {
    this.sceneConfig = sceneConfig;
    return this;
  }

  /**
   * Get sceneConfig
   * @return sceneConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseSceneConfig getSceneConfig() {
    return sceneConfig;
  }

  public void setSceneConfig(OpenbaseSceneConfig sceneConfig) {
    this.sceneConfig = sceneConfig;
  }

  public OpenbaseUnitConfig scope(OpenbaseScope scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseScope getScope() {
    return scope;
  }

  public void setScope(OpenbaseScope scope) {
    this.scope = scope;
  }

  public OpenbaseUnitConfig serviceConfig(List<OpenbaseServiceConfig> serviceConfig) {
    this.serviceConfig = serviceConfig;
    return this;
  }

  public OpenbaseUnitConfig addServiceConfigItem(OpenbaseServiceConfig serviceConfigItem) {
    if (this.serviceConfig == null) {
      this.serviceConfig = new ArrayList<>();
    }
    this.serviceConfig.add(serviceConfigItem);
    return this;
  }

  /**
   * Get serviceConfig
   * @return serviceConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseServiceConfig> getServiceConfig() {
    return serviceConfig;
  }

  public void setServiceConfig(List<OpenbaseServiceConfig> serviceConfig) {
    this.serviceConfig = serviceConfig;
  }

  public OpenbaseUnitConfig unitGroupConfig(OpenbaseUnitGroupConfig unitGroupConfig) {
    this.unitGroupConfig = unitGroupConfig;
    return this;
  }

  /**
   * Get unitGroupConfig
   * @return unitGroupConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseUnitGroupConfig getUnitGroupConfig() {
    return unitGroupConfig;
  }

  public void setUnitGroupConfig(OpenbaseUnitGroupConfig unitGroupConfig) {
    this.unitGroupConfig = unitGroupConfig;
  }

  public OpenbaseUnitConfig unitHostId(String unitHostId) {
    this.unitHostId = unitHostId;
    return this;
  }

  /**
   * Get unitHostId
   * @return unitHostId
  */
  @ApiModelProperty(value = "")


  public String getUnitHostId() {
    return unitHostId;
  }

  public void setUnitHostId(String unitHostId) {
    this.unitHostId = unitHostId;
  }

  public OpenbaseUnitConfig unitTemplateConfigId(String unitTemplateConfigId) {
    this.unitTemplateConfigId = unitTemplateConfigId;
    return this;
  }

  /**
   * Get unitTemplateConfigId
   * @return unitTemplateConfigId
  */
  @ApiModelProperty(value = "")


  public String getUnitTemplateConfigId() {
    return unitTemplateConfigId;
  }

  public void setUnitTemplateConfigId(String unitTemplateConfigId) {
    this.unitTemplateConfigId = unitTemplateConfigId;
  }

  public OpenbaseUnitConfig unitType(OpenbaseUnitTemplateUnitType unitType) {
    this.unitType = unitType;
    return this;
  }

  /**
   * Get unitType
   * @return unitType
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseUnitTemplateUnitType getUnitType() {
    return unitType;
  }

  public void setUnitType(OpenbaseUnitTemplateUnitType unitType) {
    this.unitType = unitType;
  }

  public OpenbaseUnitConfig userConfig(OpenbaseUserConfig userConfig) {
    this.userConfig = userConfig;
    return this;
  }

  /**
   * Get userConfig
   * @return userConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseUserConfig getUserConfig() {
    return userConfig;
  }

  public void setUserConfig(OpenbaseUserConfig userConfig) {
    this.userConfig = userConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseUnitConfig openbaseUnitConfig = (OpenbaseUnitConfig) o;
    return Objects.equals(this.agentConfig, openbaseUnitConfig.agentConfig) &&
        Objects.equals(this.alias, openbaseUnitConfig.alias) &&
        Objects.equals(this.appConfig, openbaseUnitConfig.appConfig) &&
        Objects.equals(this.authorizationGroupConfig, openbaseUnitConfig.authorizationGroupConfig) &&
        Objects.equals(this.boundToUnitHost, openbaseUnitConfig.boundToUnitHost) &&
        Objects.equals(this.connectionConfig, openbaseUnitConfig.connectionConfig) &&
        Objects.equals(this.description, openbaseUnitConfig.description) &&
        Objects.equals(this.deviceConfig, openbaseUnitConfig.deviceConfig) &&
        Objects.equals(this.enablingState, openbaseUnitConfig.enablingState) &&
        Objects.equals(this.id, openbaseUnitConfig.id) &&
        Objects.equals(this.label, openbaseUnitConfig.label) &&
        Objects.equals(this.locationConfig, openbaseUnitConfig.locationConfig) &&
        Objects.equals(this.metaConfig, openbaseUnitConfig.metaConfig) &&
        Objects.equals(this.objectConfig, openbaseUnitConfig.objectConfig) &&
        Objects.equals(this.permissionConfig, openbaseUnitConfig.permissionConfig) &&
        Objects.equals(this.placementConfig, openbaseUnitConfig.placementConfig) &&
        Objects.equals(this.sceneConfig, openbaseUnitConfig.sceneConfig) &&
        Objects.equals(this.scope, openbaseUnitConfig.scope) &&
        Objects.equals(this.serviceConfig, openbaseUnitConfig.serviceConfig) &&
        Objects.equals(this.unitGroupConfig, openbaseUnitConfig.unitGroupConfig) &&
        Objects.equals(this.unitHostId, openbaseUnitConfig.unitHostId) &&
        Objects.equals(this.unitTemplateConfigId, openbaseUnitConfig.unitTemplateConfigId) &&
        Objects.equals(this.unitType, openbaseUnitConfig.unitType) &&
        Objects.equals(this.userConfig, openbaseUnitConfig.userConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentConfig, alias, appConfig, authorizationGroupConfig, boundToUnitHost, connectionConfig, description, deviceConfig, enablingState, id, label, locationConfig, metaConfig, objectConfig, permissionConfig, placementConfig, sceneConfig, scope, serviceConfig, unitGroupConfig, unitHostId, unitTemplateConfigId, unitType, userConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseUnitConfig {\n");
    
    sb.append("    agentConfig: ").append(toIndentedString(agentConfig)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    appConfig: ").append(toIndentedString(appConfig)).append("\n");
    sb.append("    authorizationGroupConfig: ").append(toIndentedString(authorizationGroupConfig)).append("\n");
    sb.append("    boundToUnitHost: ").append(toIndentedString(boundToUnitHost)).append("\n");
    sb.append("    connectionConfig: ").append(toIndentedString(connectionConfig)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deviceConfig: ").append(toIndentedString(deviceConfig)).append("\n");
    sb.append("    enablingState: ").append(toIndentedString(enablingState)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    locationConfig: ").append(toIndentedString(locationConfig)).append("\n");
    sb.append("    metaConfig: ").append(toIndentedString(metaConfig)).append("\n");
    sb.append("    objectConfig: ").append(toIndentedString(objectConfig)).append("\n");
    sb.append("    permissionConfig: ").append(toIndentedString(permissionConfig)).append("\n");
    sb.append("    placementConfig: ").append(toIndentedString(placementConfig)).append("\n");
    sb.append("    sceneConfig: ").append(toIndentedString(sceneConfig)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    serviceConfig: ").append(toIndentedString(serviceConfig)).append("\n");
    sb.append("    unitGroupConfig: ").append(toIndentedString(unitGroupConfig)).append("\n");
    sb.append("    unitHostId: ").append(toIndentedString(unitHostId)).append("\n");
    sb.append("    unitTemplateConfigId: ").append(toIndentedString(unitTemplateConfigId)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    userConfig: ").append(toIndentedString(userConfig)).append("\n");
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

