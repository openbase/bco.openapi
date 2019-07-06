package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseActivityTemplate.ActivityType
 */
public enum OpenbaseActivityTemplateActivityType {
  OTHER("OTHER"),
    RELAXING("RELAXING"),
    SLEEPING("SLEEPING"),
    WORKING("WORKING"),
    EATING("EATING"),
    COOKING("COOKING"),
    CLEANING("CLEANING"),
    CELEBRATING("CELEBRATING");

  private String value;

  OpenbaseActivityTemplateActivityType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseActivityTemplateActivityType fromValue(String text) {
    for (OpenbaseActivityTemplateActivityType b : OpenbaseActivityTemplateActivityType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
