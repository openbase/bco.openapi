package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseConnectionState.State
 */
public enum OpenbaseConnectionStateState {
  CONNECTING("CONNECTING"),
    CONNECTED("CONNECTED"),
    DISCONNECTED("DISCONNECTED"),
    RECONNECTING("RECONNECTING"),
    REINITIALIZING("REINITIALIZING");

  private String value;

  OpenbaseConnectionStateState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseConnectionStateState fromValue(String text) {
    for (OpenbaseConnectionStateState b : OpenbaseConnectionStateState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
