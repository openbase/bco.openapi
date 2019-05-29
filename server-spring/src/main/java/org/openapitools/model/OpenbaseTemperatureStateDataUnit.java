package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseTemperatureState.DataUnit
 */
public enum OpenbaseTemperatureStateDataUnit {
  
  CELSIUS("CELSIUS"),
  
  KELVIN("KELVIN"),
  
  FAHRENHEIT("FAHRENHEIT");

  private String value;

  OpenbaseTemperatureStateDataUnit(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseTemperatureStateDataUnit fromValue(String value) {
    for (OpenbaseTemperatureStateDataUnit b : OpenbaseTemperatureStateDataUnit.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

