package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseMultiResourceAllocationStrategyStrategy;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseMultiResourceAllocationStrategy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbaseMultiResourceAllocationStrategy   {
  @JsonProperty("strategy")
  private OpenbaseMultiResourceAllocationStrategyStrategy strategy;

  public OpenbaseMultiResourceAllocationStrategy strategy(OpenbaseMultiResourceAllocationStrategyStrategy strategy) {
    this.strategy = strategy;
    return this;
  }

  /**
   * Get strategy
   * @return strategy
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseMultiResourceAllocationStrategyStrategy getStrategy() {
    return strategy;
  }

  public void setStrategy(OpenbaseMultiResourceAllocationStrategyStrategy strategy) {
    this.strategy = strategy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseMultiResourceAllocationStrategy openbaseMultiResourceAllocationStrategy = (OpenbaseMultiResourceAllocationStrategy) o;
    return Objects.equals(this.strategy, openbaseMultiResourceAllocationStrategy.strategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseMultiResourceAllocationStrategy {\n");
    
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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

