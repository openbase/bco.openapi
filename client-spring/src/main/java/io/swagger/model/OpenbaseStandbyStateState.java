package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseStandbyState.State
 */
public enum OpenbaseStandbyStateState {
  RUNNING("RUNNING"),
    STANDBY("STANDBY");

  private String value;

  OpenbaseStandbyStateState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseStandbyStateState fromValue(String text) {
    for (OpenbaseStandbyStateState b : OpenbaseStandbyStateState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
