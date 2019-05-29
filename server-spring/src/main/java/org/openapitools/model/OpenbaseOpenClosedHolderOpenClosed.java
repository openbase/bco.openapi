package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseOpenClosedHolder.OpenClosed
 */
public enum OpenbaseOpenClosedHolderOpenClosed {
  
  CLOSED("CLOSED"),
  
  OPEN("OPEN");

  private String value;

  OpenbaseOpenClosedHolderOpenClosed(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseOpenClosedHolderOpenClosed fromValue(String value) {
    for (OpenbaseOpenClosedHolderOpenClosed b : OpenbaseOpenClosedHolderOpenClosed.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

