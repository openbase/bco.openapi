package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseIncreaseDecreaseHolder.IncreaseDecrease
 */
public enum OpenbaseIncreaseDecreaseHolderIncreaseDecrease {
  DECREASE("DECREASE"),
    INCREASE("INCREASE");

  private String value;

  OpenbaseIncreaseDecreaseHolderIncreaseDecrease(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseIncreaseDecreaseHolderIncreaseDecrease fromValue(String text) {
    for (OpenbaseIncreaseDecreaseHolderIncreaseDecrease b : OpenbaseIncreaseDecreaseHolderIncreaseDecrease.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
