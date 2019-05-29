package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseBrightnessState.DataUnit
 */
public enum OpenbaseBrightnessStateDataUnit {
  
  PERCENT("PERCENT");

  private String value;

  OpenbaseBrightnessStateDataUnit(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseBrightnessStateDataUnit fromValue(String value) {
    for (OpenbaseBrightnessStateDataUnit b : OpenbaseBrightnessStateDataUnit.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

