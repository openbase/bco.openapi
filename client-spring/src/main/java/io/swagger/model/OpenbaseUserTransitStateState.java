package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
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
  public static OpenbaseUserTransitStateState fromValue(String text) {
    for (OpenbaseUserTransitStateState b : OpenbaseUserTransitStateState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
