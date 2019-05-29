package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseTamperState.State
 */
public enum OpenbaseTamperStateState {
  
  NO_TAMPER("NO_TAMPER"),
  
  TAMPER("TAMPER");

  private String value;

  OpenbaseTamperStateState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseTamperStateState fromValue(String value) {
    for (OpenbaseTamperStateState b : OpenbaseTamperStateState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

