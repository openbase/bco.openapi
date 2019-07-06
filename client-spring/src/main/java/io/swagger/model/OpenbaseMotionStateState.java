package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseMotionState.State
 */
public enum OpenbaseMotionStateState {
  NO_MOTION("NO_MOTION"),
    MOTION("MOTION");

  private String value;

  OpenbaseMotionStateState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseMotionStateState fromValue(String text) {
    for (OpenbaseMotionStateState b : OpenbaseMotionStateState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
