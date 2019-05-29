package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseUpDownHolder.UpDown
 */
public enum OpenbaseUpDownHolderUpDown {
  
  DOWN("DOWN"),
  
  UP("UP");

  private String value;

  OpenbaseUpDownHolderUpDown(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseUpDownHolderUpDown fromValue(String value) {
    for (OpenbaseUpDownHolderUpDown b : OpenbaseUpDownHolderUpDown.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

