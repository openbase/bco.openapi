package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseAuthorizationTokenPermissionRule;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseAuthorizationToken
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseAuthorizationToken   {
  @JsonProperty("permission_rule")
  @Valid
  private List<OpenbaseAuthorizationTokenPermissionRule> permissionRule = null;

  @JsonProperty("user_id")
  private String userId = null;

  public OpenbaseAuthorizationToken permissionRule(List<OpenbaseAuthorizationTokenPermissionRule> permissionRule) {
    this.permissionRule = permissionRule;
    return this;
  }

  public OpenbaseAuthorizationToken addPermissionRuleItem(OpenbaseAuthorizationTokenPermissionRule permissionRuleItem) {
    if (this.permissionRule == null) {
      this.permissionRule = new ArrayList<OpenbaseAuthorizationTokenPermissionRule>();
    }
    this.permissionRule.add(permissionRuleItem);
    return this;
  }

  /**
   * Get permissionRule
   * @return permissionRule
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbaseAuthorizationTokenPermissionRule> getPermissionRule() {
    return permissionRule;
  }

  public void setPermissionRule(List<OpenbaseAuthorizationTokenPermissionRule> permissionRule) {
    this.permissionRule = permissionRule;
  }

  public OpenbaseAuthorizationToken userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseAuthorizationToken openbaseAuthorizationToken = (OpenbaseAuthorizationToken) o;
    return Objects.equals(this.permissionRule, openbaseAuthorizationToken.permissionRule) &&
        Objects.equals(this.userId, openbaseAuthorizationToken.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionRule, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseAuthorizationToken {\n");
    
    sb.append("    permissionRule: ").append(toIndentedString(permissionRule)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
