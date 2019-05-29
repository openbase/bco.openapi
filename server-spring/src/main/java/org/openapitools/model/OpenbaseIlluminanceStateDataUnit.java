package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseIlluminanceState.DataUnit
 */
public enum OpenbaseIlluminanceStateDataUnit {
  
  LUX("LUX");

  private String value;

  OpenbaseIlluminanceStateDataUnit(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseIlluminanceStateDataUnit fromValue(String value) {
    for (OpenbaseIlluminanceStateDataUnit b : OpenbaseIlluminanceStateDataUnit.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

