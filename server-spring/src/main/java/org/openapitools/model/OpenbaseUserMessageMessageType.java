package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseUserMessage.MessageType
 */
public enum OpenbaseUserMessageMessageType {
  
  INFO("INFO"),
  
  NOTIFICATION("NOTIFICATION"),
  
  WARNING("WARNING"),
  
  EMERGENCY("EMERGENCY");

  private String value;

  OpenbaseUserMessageMessageType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseUserMessageMessageType fromValue(String value) {
    for (OpenbaseUserMessageMessageType b : OpenbaseUserMessageMessageType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

