package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseActionState.State
 */
public enum OpenbaseActionStateState {
  INITIALIZED("INITIALIZED"),
    SCHEDULED("SCHEDULED"),
    INITIATING("INITIATING"),
    EXECUTING("EXECUTING"),
    EXECUTION_FAILED("EXECUTION_FAILED"),
    FINISHING("FINISHING"),
    FINISHED("FINISHED"),
    ABORTING("ABORTING"),
    ABORTED("ABORTED"),
    ABORTING_FAILED("ABORTING_FAILED"),
    REJECTED("REJECTED"),
    CANCELING("CANCELING"),
    CANCELED("CANCELED");

  private String value;

  OpenbaseActionStateState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseActionStateState fromValue(String text) {
    for (OpenbaseActionStateState b : OpenbaseActionStateState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
