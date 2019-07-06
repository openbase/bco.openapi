package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseInventoryState;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseObjectConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseObjectConfig   {
  @JsonProperty("inventory_state")
  private OpenbaseInventoryState inventoryState = null;

  public OpenbaseObjectConfig inventoryState(OpenbaseInventoryState inventoryState) {
    this.inventoryState = inventoryState;
    return this;
  }

  /**
   * Get inventoryState
   * @return inventoryState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseInventoryState getInventoryState() {
    return inventoryState;
  }

  public void setInventoryState(OpenbaseInventoryState inventoryState) {
    this.inventoryState = inventoryState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseObjectConfig openbaseObjectConfig = (OpenbaseObjectConfig) o;
    return Objects.equals(this.inventoryState, openbaseObjectConfig.inventoryState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseObjectConfig {\n");
    
    sb.append("    inventoryState: ").append(toIndentedString(inventoryState)).append("\n");
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
