package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseDoorState.State
 */
public enum OpenbaseDoorStateState {
  CLOSED("CLOSED"),
    IN_BETWEEN("IN_BETWEEN"),
    OPEN("OPEN");

  private String value;

  OpenbaseDoorStateState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseDoorStateState fromValue(String text) {
    for (OpenbaseDoorStateState b : OpenbaseDoorStateState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
