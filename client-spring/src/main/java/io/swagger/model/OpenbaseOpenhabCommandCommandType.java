package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
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
  public static OpenbaseOpenhabCommandCommandType fromValue(String text) {
    for (OpenbaseOpenhabCommandCommandType b : OpenbaseOpenhabCommandCommandType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
