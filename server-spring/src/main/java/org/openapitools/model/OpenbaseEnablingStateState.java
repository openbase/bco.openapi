package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseEnablingState.State
 */
public enum OpenbaseEnablingStateState {
  
  DISABLED("DISABLED"),
  
  ENABLED("ENABLED");

  private String value;

  OpenbaseEnablingStateState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseEnablingStateState fromValue(String value) {
    for (OpenbaseEnablingStateState b : OpenbaseEnablingStateState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

