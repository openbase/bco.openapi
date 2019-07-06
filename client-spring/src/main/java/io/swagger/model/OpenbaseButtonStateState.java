package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseButtonState.State
 */
public enum OpenbaseButtonStateState {
  RELEASED("RELEASED"),
    PRESSED("PRESSED"),
    DOUBLE_PRESSED("DOUBLE_PRESSED");

  private String value;

  OpenbaseButtonStateState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseButtonStateState fromValue(String text) {
    for (OpenbaseButtonStateState b : OpenbaseButtonStateState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
