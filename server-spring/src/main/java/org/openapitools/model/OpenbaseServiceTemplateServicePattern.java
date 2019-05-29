package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseServiceTemplate.ServicePattern
 */
public enum OpenbaseServiceTemplateServicePattern {
  
  PROVIDER("PROVIDER"),
  
  OPERATION("OPERATION"),
  
  CONSUMER("CONSUMER"),
  
  STREAM("STREAM");

  private String value;

  OpenbaseServiceTemplateServicePattern(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseServiceTemplateServicePattern fromValue(String value) {
    for (OpenbaseServiceTemplateServicePattern b : OpenbaseServiceTemplateServicePattern.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

