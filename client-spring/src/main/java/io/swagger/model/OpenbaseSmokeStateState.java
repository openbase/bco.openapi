package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
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
  public static OpenbaseSmokeStateState fromValue(String text) {
    for (OpenbaseSmokeStateState b : OpenbaseSmokeStateState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
