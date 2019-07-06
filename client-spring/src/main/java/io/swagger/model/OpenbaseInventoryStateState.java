package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseInventoryState.State
 */
public enum OpenbaseInventoryStateState {
  ORDERED("ORDERED"),
    INSTALLED("INSTALLED"),
    IN_STOCK("IN_STOCK"),
    BORROWED("BORROWED"),
    LOST("LOST");

  private String value;

  OpenbaseInventoryStateState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseInventoryStateState fromValue(String text) {
    for (OpenbaseInventoryStateState b : OpenbaseInventoryStateState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
