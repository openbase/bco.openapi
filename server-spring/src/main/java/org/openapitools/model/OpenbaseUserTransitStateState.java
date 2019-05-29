package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseUserTransitState.State
 */
public enum OpenbaseUserTransitStateState {
  
  SOON_ABSENT("SOON_ABSENT"),
  
  SHORT_TERM_ABSENT("SHORT_TERM_ABSENT"),
  
  LONG_TERM_ABSENT("LONG_TERM_ABSENT"),
  
  SOON_PRESENT("SOON_PRESENT"),
  
  SHORT_TERM_PRESENT("SHORT_TERM_PRESENT"),
  
  LONG_TERM_PRESENT("LONG_TERM_PRESENT");

  private String value;

  OpenbaseUserTransitStateState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseUserTransitStateState fromValue(String value) {
    for (OpenbaseUserTransitStateState b : OpenbaseUserTransitStateState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

