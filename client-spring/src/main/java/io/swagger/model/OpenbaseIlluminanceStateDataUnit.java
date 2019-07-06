package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
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
  public static OpenbaseIlluminanceStateDataUnit fromValue(String text) {
    for (OpenbaseIlluminanceStateDataUnit b : OpenbaseIlluminanceStateDataUnit.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
