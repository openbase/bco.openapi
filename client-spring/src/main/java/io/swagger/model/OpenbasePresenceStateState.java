package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbasePresenceState.State
 */
public enum OpenbasePresenceStateState {
  ABSENT("ABSENT"),
    PRESENT("PRESENT");

  private String value;

  OpenbasePresenceStateState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbasePresenceStateState fromValue(String text) {
    for (OpenbasePresenceStateState b : OpenbasePresenceStateState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
