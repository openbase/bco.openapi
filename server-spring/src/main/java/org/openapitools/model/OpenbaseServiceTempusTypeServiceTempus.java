package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseServiceTempusType.ServiceTempus
 */
public enum OpenbaseServiceTempusTypeServiceTempus {
  
  CURRENT("CURRENT"),
  
  LAST("LAST"),
  
  REQUESTED("REQUESTED");

  private String value;

  OpenbaseServiceTempusTypeServiceTempus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseServiceTempusTypeServiceTempus fromValue(String value) {
    for (OpenbaseServiceTempusTypeServiceTempus b : OpenbaseServiceTempusTypeServiceTempus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

