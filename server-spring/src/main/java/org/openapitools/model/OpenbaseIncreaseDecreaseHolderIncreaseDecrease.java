package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
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
  public static OpenbaseIncreaseDecreaseHolderIncreaseDecrease fromValue(String value) {
    for (OpenbaseIncreaseDecreaseHolderIncreaseDecrease b : OpenbaseIncreaseDecreaseHolderIncreaseDecrease.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

