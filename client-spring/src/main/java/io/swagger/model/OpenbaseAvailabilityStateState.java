package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseAvailabilityState.State
 */
public enum OpenbaseAvailabilityStateState {
  ACTIVATING("ACTIVATING"),
    ONLINE("ONLINE"),
    DEACTIVATING("DEACTIVATING"),
    OFFLINE("OFFLINE");

  private String value;

  OpenbaseAvailabilityStateState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseAvailabilityStateState fromValue(String text) {
    for (OpenbaseAvailabilityStateState b : OpenbaseAvailabilityStateState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
