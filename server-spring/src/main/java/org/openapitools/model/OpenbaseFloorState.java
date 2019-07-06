package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseFloorModuleState;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseFloorState
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

public class OpenbaseFloorState   {
  @JsonProperty("floormodulestate")
  @Valid
  private List<OpenbaseFloorModuleState> floormodulestate = null;

  @JsonProperty("label")
  private String label;

  public OpenbaseFloorState floormodulestate(List<OpenbaseFloorModuleState> floormodulestate) {
    this.floormodulestate = floormodulestate;
    return this;
  }

  public OpenbaseFloorState addFloormodulestateItem(OpenbaseFloorModuleState floormodulestateItem) {
    if (this.floormodulestate == null) {
      this.floormodulestate = new ArrayList<>();
    }
    this.floormodulestate.add(floormodulestateItem);
    return this;
  }

  /**
   * Get floormodulestate
   * @return floormodulestate
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseFloorModuleState> getFloormodulestate() {
    return floormodulestate;
  }

  public void setFloormodulestate(List<OpenbaseFloorModuleState> floormodulestate) {
    this.floormodulestate = floormodulestate;
  }

  public OpenbaseFloorState label(String label) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseFloorState openbaseFloorState = (OpenbaseFloorState) o;
    return Objects.equals(this.floormodulestate, openbaseFloorState.floormodulestate) &&
        Objects.equals(this.label, openbaseFloorState.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(floormodulestate, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseFloorState {\n");
    
    sb.append("    floormodulestate: ").append(toIndentedString(floormodulestate)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

