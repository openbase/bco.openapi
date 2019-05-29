package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseBatteryState.State
 */
public enum OpenbaseBatteryStateState {
  
  OK("OK"),
  
  CRITICAL("CRITICAL"),
  
  INSUFFICIENT("INSUFFICIENT");

  private String value;

  OpenbaseBatteryStateState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseBatteryStateState fromValue(String value) {
    for (OpenbaseBatteryStateState b : OpenbaseBatteryStateState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

