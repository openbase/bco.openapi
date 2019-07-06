package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseWindowState.State
 */
public enum OpenbaseWindowStateState {
  CLOSED("CLOSED"),
    OPEN("OPEN"),
    TILTED("TILTED");

  private String value;

  OpenbaseWindowStateState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseWindowStateState fromValue(String text) {
    for (OpenbaseWindowStateState b : OpenbaseWindowStateState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
