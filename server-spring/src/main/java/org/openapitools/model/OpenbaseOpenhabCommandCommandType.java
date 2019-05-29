package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseOpenhabCommand.CommandType
 */
public enum OpenbaseOpenhabCommandCommandType {
  
  HSB("HSB"),
  
  DECIMAL("DECIMAL"),
  
  INCREASEDECREASE("INCREASEDECREASE"),
  
  ONOFF("ONOFF"),
  
  OPENCLOSED("OPENCLOSED"),
  
  PERCENT("PERCENT"),
  
  STOPMOVE("STOPMOVE"),
  
  STRING("STRING"),
  
  UPDOWN("UPDOWN");

  private String value;

  OpenbaseOpenhabCommandCommandType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseOpenhabCommandCommandType fromValue(String value) {
    for (OpenbaseOpenhabCommandCommandType b : OpenbaseOpenhabCommandCommandType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

