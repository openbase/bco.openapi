package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseLocationConfig.LocationType
 */
public enum OpenbaseLocationConfigLocationType {
  
  ZONE("ZONE"),
  
  REGION("REGION"),
  
  TILE("TILE");

  private String value;

  OpenbaseLocationConfigLocationType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseLocationConfigLocationType fromValue(String value) {
    for (OpenbaseLocationConfigLocationType b : OpenbaseLocationConfigLocationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
