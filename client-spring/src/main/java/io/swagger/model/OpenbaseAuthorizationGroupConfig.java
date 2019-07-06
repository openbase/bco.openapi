package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseAuthorizationGroupConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseAuthorizationGroupConfig   {
  @JsonProperty("member_id")
  @Valid
  private List<String> memberId = null;

  public OpenbaseAuthorizationGroupConfig memberId(List<String> memberId) {
    this.memberId = memberId;
    return this;
  }

  public OpenbaseAuthorizationGroupConfig addMemberIdItem(String memberIdItem) {
    if (this.memberId == null) {
      this.memberId = new ArrayList<String>();
    }
    this.memberId.add(memberIdItem);
    return this;
  }

  /**
   * Get memberId
   * @return memberId
  **/
  @ApiModelProperty(value = "")

  public List<String> getMemberId() {
    return memberId;
  }

  public void setMemberId(List<String> memberId) {
    this.memberId = memberId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseAuthorizationGroupConfig openbaseAuthorizationGroupConfig = (OpenbaseAuthorizationGroupConfig) o;
    return Objects.equals(this.memberId, openbaseAuthorizationGroupConfig.memberId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseAuthorizationGroupConfig {\n");
    
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
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