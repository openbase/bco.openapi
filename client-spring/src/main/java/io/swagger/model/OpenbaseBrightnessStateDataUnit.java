package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
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
  public static OpenbaseBrightnessStateDataUnit fromValue(String text) {
    for (OpenbaseBrightnessStateDataUnit b : OpenbaseBrightnessStateDataUnit.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
