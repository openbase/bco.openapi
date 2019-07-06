package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbasePermission;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseAuthorizationTokenPermissionRule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseAuthorizationTokenPermissionRule   {
  @JsonProperty("filter")
  private Boolean filter = null;

  @JsonProperty("permission")
  private OpenbasePermission permission = null;

  @JsonProperty("service_template_id")
  private String serviceTemplateId = null;

  @JsonProperty("unit_id")
  private String unitId = null;

  @JsonProperty("unit_template_id")
  private String unitTemplateId = null;

  public OpenbaseAuthorizationTokenPermissionRule filter(Boolean filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(value = "")

  public Boolean isFilter() {
    return filter;
  }

  public void setFilter(Boolean filter) {
    this.filter = filter;
  }

  public OpenbaseAuthorizationTokenPermissionRule permission(OpenbasePermission permission) {
    this.permission = permission;
    return this;
  }

  /**
   * Get permission
   * @return permission
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbasePermission getPermission() {
    return permission;
  }

  public void setPermission(OpenbasePermission permission) {
    this.permission = permission;
  }

  public OpenbaseAuthorizationTokenPermissionRule serviceTemplateId(String serviceTemplateId) {
    this.serviceTemplateId = serviceTemplateId;
    return this;
  }

  /**
   * Get serviceTemplateId
   * @return serviceTemplateId
  **/
  @ApiModelProperty(value = "")

  public String getServiceTemplateId() {
    return serviceTemplateId;
  }

  public void setServiceTemplateId(String serviceTemplateId) {
    this.serviceTemplateId = serviceTemplateId;
  }

  public OpenbaseAuthorizationTokenPermissionRule unitId(String unitId) {
    this.unitId = unitId;
    return this;
  }

  /**
   * Get unitId
   * @return unitId
  **/
  @ApiModelProperty(value = "")

  public String getUnitId() {
    return unitId;
  }

  public void setUnitId(String unitId) {
    this.unitId = unitId;
  }

  public OpenbaseAuthorizationTokenPermissionRule unitTemplateId(String unitTemplateId) {
    this.unitTemplateId = unitTemplateId;
    return this;
  }

  /**
   * Get unitTemplateId
   * @return unitTemplateId
  **/
  @ApiModelProperty(value = "")

  public String getUnitTemplateId() {
    return unitTemplateId;
  }

  public void setUnitTemplateId(String unitTemplateId) {
    this.unitTemplateId = unitTemplateId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseAuthorizationTokenPermissionRule openbaseAuthorizationTokenPermissionRule = (OpenbaseAuthorizationTokenPermissionRule) o;
    return Objects.equals(this.filter, openbaseAuthorizationTokenPermissionRule.filter) &&
        Objects.equals(this.permission, openbaseAuthorizationTokenPermissionRule.permission) &&
        Objects.equals(this.serviceTemplateId, openbaseAuthorizationTokenPermissionRule.serviceTemplateId) &&
        Objects.equals(this.unitId, openbaseAuthorizationTokenPermissionRule.unitId) &&
        Objects.equals(this.unitTemplateId, openbaseAuthorizationTokenPermissionRule.unitTemplateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, permission, serviceTemplateId, unitId, unitTemplateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseAuthorizationTokenPermissionRule {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    serviceTemplateId: ").append(toIndentedString(serviceTemplateId)).append("\n");
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
    sb.append("    unitTemplateId: ").append(toIndentedString(unitTemplateId)).append("\n");
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