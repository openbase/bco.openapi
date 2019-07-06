package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbasePermission;
import io.swagger.model.OpenbasePermissionConfigMapFieldEntry;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbasePermissionConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbasePermissionConfig   {
  @JsonProperty("group_permission")
  @Valid
  private List<OpenbasePermissionConfigMapFieldEntry> groupPermission = null;

  @JsonProperty("other_permission")
  private OpenbasePermission otherPermission = null;

  @JsonProperty("owner_id")
  private String ownerId = null;

  @JsonProperty("owner_permission")
  private OpenbasePermission ownerPermission = null;

  public OpenbasePermissionConfig groupPermission(List<OpenbasePermissionConfigMapFieldEntry> groupPermission) {
    this.groupPermission = groupPermission;
    return this;
  }

  public OpenbasePermissionConfig addGroupPermissionItem(OpenbasePermissionConfigMapFieldEntry groupPermissionItem) {
    if (this.groupPermission == null) {
      this.groupPermission = new ArrayList<OpenbasePermissionConfigMapFieldEntry>();
    }
    this.groupPermission.add(groupPermissionItem);
    return this;
  }

  /**
   * Get groupPermission
   * @return groupPermission
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbasePermissionConfigMapFieldEntry> getGroupPermission() {
    return groupPermission;
  }

  public void setGroupPermission(List<OpenbasePermissionConfigMapFieldEntry> groupPermission) {
    this.groupPermission = groupPermission;
  }

  public OpenbasePermissionConfig otherPermission(OpenbasePermission otherPermission) {
    this.otherPermission = otherPermission;
    return this;
  }

  /**
   * Get otherPermission
   * @return otherPermission
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbasePermission getOtherPermission() {
    return otherPermission;
  }

  public void setOtherPermission(OpenbasePermission otherPermission) {
    this.otherPermission = otherPermission;
  }

  public OpenbasePermissionConfig ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
  **/
  @ApiModelProperty(value = "")

  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public OpenbasePermissionConfig ownerPermission(OpenbasePermission ownerPermission) {
    this.ownerPermission = ownerPermission;
    return this;
  }

  /**
   * Get ownerPermission
   * @return ownerPermission
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbasePermission getOwnerPermission() {
    return ownerPermission;
  }

  public void setOwnerPermission(OpenbasePermission ownerPermission) {
    this.ownerPermission = ownerPermission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbasePermissionConfig openbasePermissionConfig = (OpenbasePermissionConfig) o;
    return Objects.equals(this.groupPermission, openbasePermissionConfig.groupPermission) &&
        Objects.equals(this.otherPermission, openbasePermissionConfig.otherPermission) &&
        Objects.equals(this.ownerId, openbasePermissionConfig.ownerId) &&
        Objects.equals(this.ownerPermission, openbasePermissionConfig.ownerPermission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupPermission, otherPermission, ownerId, ownerPermission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbasePermissionConfig {\n");
    
    sb.append("    groupPermission: ").append(toIndentedString(groupPermission)).append("\n");
    sb.append("    otherPermission: ").append(toIndentedString(otherPermission)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    ownerPermission: ").append(toIndentedString(ownerPermission)).append("\n");
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
