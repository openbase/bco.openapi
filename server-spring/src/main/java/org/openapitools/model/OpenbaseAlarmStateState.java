package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseAlarmState.State
 */
public enum OpenbaseAlarmStateState {
  
  NO_ALARM("NO_ALARM"),
  
  ALARM("ALARM");

  private String value;

  OpenbaseAlarmStateState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseAlarmStateState fromValue(String value) {
    for (OpenbaseAlarmStateState b : OpenbaseAlarmStateState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

