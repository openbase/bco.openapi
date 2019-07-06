package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseStopMoveHolderStopMove;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseStopMoveHolder
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseStopMoveHolder   {
  @JsonProperty("state")
  private OpenbaseStopMoveHolderStopMove state = null;

  public OpenbaseStopMoveHolder state(OpenbaseStopMoveHolderStopMove state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseStopMoveHolderStopMove getState() {
    return state;
  }

  public void setState(OpenbaseStopMoveHolderStopMove state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseStopMoveHolder openbaseStopMoveHolder = (OpenbaseStopMoveHolder) o;
    return Objects.equals(this.state, openbaseStopMoveHolder.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseStopMoveHolder {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
