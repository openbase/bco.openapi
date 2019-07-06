package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseAgentConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

public class OpenbaseAgentConfig   {
  @JsonProperty("agent_class_id")
  private String agentClassId;

  @JsonProperty("autostart")
  private Boolean autostart;

  public OpenbaseAgentConfig agentClassId(String agentClassId) {
    this.agentClassId = agentClassId;
    return this;
  }

  /**
   * Get agentClassId
   * @return agentClassId
  */
  @ApiModelProperty(value = "")


  public String getAgentClassId() {
    return agentClassId;
  }

  public void setAgentClassId(String agentClassId) {
    this.agentClassId = agentClassId;
  }

  public OpenbaseAgentConfig autostart(Boolean autostart) {
    this.autostart = autostart;
    return this;
  }

  /**
   * Get autostart
   * @return autostart
  */
  @ApiModelProperty(value = "")


  public Boolean getAutostart() {
    return autostart;
  }

  public void setAutostart(Boolean autostart) {
    this.autostart = autostart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseAgentConfig openbaseAgentConfig = (OpenbaseAgentConfig) o;
    return Objects.equals(this.agentClassId, openbaseAgentConfig.agentClassId) &&
        Objects.equals(this.autostart, openbaseAgentConfig.autostart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentClassId, autostart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseAgentConfig {\n");
    
    sb.append("    agentClassId: ").append(toIndentedString(agentClassId)).append("\n");
    sb.append("    autostart: ").append(toIndentedString(autostart)).append("\n");
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

