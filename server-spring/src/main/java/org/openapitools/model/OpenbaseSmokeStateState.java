package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseSmokeState.State
 */
public enum OpenbaseSmokeStateState {
  
  NO_SMOKE("NO_SMOKE"),
  
  SOME_SMOKE("SOME_SMOKE"),
  
  SMOKE("SMOKE");

  private String value;

  OpenbaseSmokeStateState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseSmokeStateState fromValue(String value) {
    for (OpenbaseSmokeStateState b : OpenbaseSmokeStateState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

