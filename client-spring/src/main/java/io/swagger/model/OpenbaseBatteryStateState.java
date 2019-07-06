package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseBatteryState.State
 */
public enum OpenbaseBatteryStateState {
  OK("OK"),
    CRITICAL("CRITICAL"),
    INSUFFICIENT("INSUFFICIENT");

  private String value;

  OpenbaseBatteryStateState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseBatteryStateState fromValue(String text) {
    for (OpenbaseBatteryStateState b : OpenbaseBatteryStateState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
