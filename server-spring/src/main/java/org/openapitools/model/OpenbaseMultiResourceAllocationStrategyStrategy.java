package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseMultiResourceAllocationStrategy.Strategy
 */
public enum OpenbaseMultiResourceAllocationStrategyStrategy {
  
  AT_LEAST_ONE("AT_LEAST_ONE"),
  
  ALL_OR_NOTHING("ALL_OR_NOTHING");

  private String value;

  OpenbaseMultiResourceAllocationStrategyStrategy(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseMultiResourceAllocationStrategyStrategy fromValue(String value) {
    for (OpenbaseMultiResourceAllocationStrategyStrategy b : OpenbaseMultiResourceAllocationStrategyStrategy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

