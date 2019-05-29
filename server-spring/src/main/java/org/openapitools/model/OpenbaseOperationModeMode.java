package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseOperationMode.Mode
 */
public enum OpenbaseOperationModeMode {
  
  FORCE_OFF("FORCE_OFF"),
  
  AUTO("AUTO"),
  
  FORCE_ON("FORCE_ON");

  private String value;

  OpenbaseOperationModeMode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseOperationModeMode fromValue(String value) {
    for (OpenbaseOperationModeMode b : OpenbaseOperationModeMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

