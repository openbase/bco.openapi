package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseConnectionConfig.ConnectionType
 */
public enum OpenbaseConnectionConfigConnectionType {
  DOOR("DOOR"),
    WINDOW("WINDOW"),
    PASSAGE("PASSAGE");

  private String value;

  OpenbaseConnectionConfigConnectionType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseConnectionConfigConnectionType fromValue(String text) {
    for (OpenbaseConnectionConfigConnectionType b : OpenbaseConnectionConfigConnectionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
