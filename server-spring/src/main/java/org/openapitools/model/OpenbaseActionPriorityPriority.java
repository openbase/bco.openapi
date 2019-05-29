package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseActionPriority.Priority
 */
public enum OpenbaseActionPriorityPriority {
  
  NO("NO"),
  
  LOW("LOW"),
  
  NORMAL("NORMAL"),
  
  HIGH("HIGH"),
  
  URGENT("URGENT"),
  
  EMERGENCY("EMERGENCY");

  private String value;

  OpenbaseActionPriorityPriority(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseActionPriorityPriority fromValue(String value) {
    for (OpenbaseActionPriorityPriority b : OpenbaseActionPriorityPriority.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

