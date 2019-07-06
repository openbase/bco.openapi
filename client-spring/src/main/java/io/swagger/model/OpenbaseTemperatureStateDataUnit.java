package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
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
  public static OpenbaseTemperatureStateDataUnit fromValue(String text) {
    for (OpenbaseTemperatureStateDataUnit b : OpenbaseTemperatureStateDataUnit.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
