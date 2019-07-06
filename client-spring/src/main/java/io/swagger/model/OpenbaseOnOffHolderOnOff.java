package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseOnOffHolder.OnOff
 */
public enum OpenbaseOnOffHolderOnOff {
  OFF("OFF"),
    ON("ON");

  private String value;

  OpenbaseOnOffHolderOnOff(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseOnOffHolderOnOff fromValue(String text) {
    for (OpenbaseOnOffHolderOnOff b : OpenbaseOnOffHolderOnOff.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
