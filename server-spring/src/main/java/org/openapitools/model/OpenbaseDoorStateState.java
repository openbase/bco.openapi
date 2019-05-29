package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseDoorState.State
 */
public enum OpenbaseDoorStateState {
  
  CLOSED("CLOSED"),
  
  IN_BETWEEN("IN_BETWEEN"),
  
  OPEN("OPEN");

  private String value;

  OpenbaseDoorStateState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseDoorStateState fromValue(String value) {
    for (OpenbaseDoorStateState b : OpenbaseDoorStateState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

