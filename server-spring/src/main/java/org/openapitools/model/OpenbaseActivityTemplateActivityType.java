package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
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
  public static OpenbaseActivityTemplateActivityType fromValue(String value) {
    for (OpenbaseActivityTemplateActivityType b : OpenbaseActivityTemplateActivityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

