package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbasePermission;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbasePermissionConfigMapFieldEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

public class OpenbasePermissionConfigMapFieldEntry   {
  @JsonProperty("group_id")
  private String groupId;

  @JsonProperty("permission")
  private OpenbasePermission permission = null;

  public OpenbasePermissionConfigMapFieldEntry groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
  */
  @ApiModelProperty(value = "")


  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public OpenbasePermissionConfigMapFieldEntry permission(OpenbasePermission permission) {
    this.permission = permission;
    return this;
  }

  /**
   * Get permission
   * @return permission
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePermission getPermission() {
    return permission;
  }

  public void setPermission(OpenbasePermission permission) {
    this.permission = permission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbasePermissionConfigMapFieldEntry openbasePermissionConfigMapFieldEntry = (OpenbasePermissionConfigMapFieldEntry) o;
    return Objects.equals(this.groupId, openbasePermissionConfigMapFieldEntry.groupId) &&
        Objects.equals(this.permission, openbasePermissionConfigMapFieldEntry.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, permission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbasePermissionConfigMapFieldEntry {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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

