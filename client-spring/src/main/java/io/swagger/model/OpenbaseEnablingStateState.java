package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
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
  public static OpenbaseEnablingStateState fromValue(String text) {
    for (OpenbaseEnablingStateState b : OpenbaseEnablingStateState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
