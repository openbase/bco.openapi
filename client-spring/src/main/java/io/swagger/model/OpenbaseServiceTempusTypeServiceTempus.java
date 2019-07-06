package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
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
  public static OpenbaseServiceTempusTypeServiceTempus fromValue(String text) {
    for (OpenbaseServiceTempusTypeServiceTempus b : OpenbaseServiceTempusTypeServiceTempus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
