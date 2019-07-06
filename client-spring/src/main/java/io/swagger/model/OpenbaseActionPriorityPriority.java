package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseActionPriority.Priority
 */
public enum OpenbaseActionPriorityPriority {
  NO("NO"),
    LOW("LOW"),
    NORMAL("NORMAL"),
    HIGH("HIGH"),
    URGENT("URGENT"),
    EMERGENCY("EMERGENCY");

  private String value;

  OpenbaseActionPriorityPriority(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseActionPriorityPriority fromValue(String text) {
    for (OpenbaseActionPriorityPriority b : OpenbaseActionPriorityPriority.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
