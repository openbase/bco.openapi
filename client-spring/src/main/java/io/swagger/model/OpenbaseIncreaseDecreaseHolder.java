package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseIncreaseDecreaseHolderIncreaseDecrease;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseIncreaseDecreaseHolder
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseIncreaseDecreaseHolder   {
  @JsonProperty("state")
  private OpenbaseIncreaseDecreaseHolderIncreaseDecrease state = null;

  public OpenbaseIncreaseDecreaseHolder state(OpenbaseIncreaseDecreaseHolderIncreaseDecrease state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseIncreaseDecreaseHolderIncreaseDecrease getState() {
    return state;
  }

  public void setState(OpenbaseIncreaseDecreaseHolderIncreaseDecrease state) {
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
    OpenbaseIncreaseDecreaseHolder openbaseIncreaseDecreaseHolder = (OpenbaseIncreaseDecreaseHolder) o;
    return Objects.equals(this.state, openbaseIncreaseDecreaseHolder.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseIncreaseDecreaseHolder {\n");
    
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