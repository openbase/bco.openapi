package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PowerState;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LightData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class LightData   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("power_state")
  private PowerState powerState = null;

  public LightData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LightData powerState(PowerState powerState) {
    this.powerState = powerState;
    return this;
  }

  /**
   * Get powerState
   * @return powerState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public PowerState getPowerState() {
    return powerState;
  }

  public void setPowerState(PowerState powerState) {
    this.powerState = powerState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LightData lightData = (LightData) o;
    return Objects.equals(this.id, lightData.id) &&
        Objects.equals(this.powerState, lightData.powerState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, powerState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LightData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    powerState: ").append(toIndentedString(powerState)).append("\n");
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
