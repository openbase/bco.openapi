package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseTamperState.State
 */
public enum OpenbaseTamperStateState {
  NO_TAMPER("NO_TAMPER"),
    TAMPER("TAMPER");

  private String value;

  OpenbaseTamperStateState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseTamperStateState fromValue(String text) {
    for (OpenbaseTamperStateState b : OpenbaseTamperStateState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
