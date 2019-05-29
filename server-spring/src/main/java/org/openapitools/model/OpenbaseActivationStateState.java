package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseActivationState.State
 */
public enum OpenbaseActivationStateState {
  
  DEACTIVE("DEACTIVE"),
  
  INACTIVE("INACTIVE"),
  
  ACTIVE("ACTIVE");

  private String value;

  OpenbaseActivationStateState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseActivationStateState fromValue(String value) {
    for (OpenbaseActivationStateState b : OpenbaseActivationStateState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

