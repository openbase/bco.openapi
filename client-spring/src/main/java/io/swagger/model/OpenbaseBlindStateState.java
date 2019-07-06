package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseBlindState.State
 */
public enum OpenbaseBlindStateState {
  DOWN("DOWN"),
    STOP("STOP"),
    UP("UP");

  private String value;

  OpenbaseBlindStateState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseBlindStateState fromValue(String text) {
    for (OpenbaseBlindStateState b : OpenbaseBlindStateState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
