package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
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
  public static OpenbaseOnOffHolderOnOff fromValue(String value) {
    for (OpenbaseOnOffHolderOnOff b : OpenbaseOnOffHolderOnOff.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

