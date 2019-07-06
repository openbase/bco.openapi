package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
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
  public static OpenbaseLocationConfigLocationType fromValue(String text) {
    for (OpenbaseLocationConfigLocationType b : OpenbaseLocationConfigLocationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
