package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseUpDownHolder.UpDown
 */
public enum OpenbaseUpDownHolderUpDown {
  DOWN("DOWN"),
    UP("UP");

  private String value;

  OpenbaseUpDownHolderUpDown(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseUpDownHolderUpDown fromValue(String text) {
    for (OpenbaseUpDownHolderUpDown b : OpenbaseUpDownHolderUpDown.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
