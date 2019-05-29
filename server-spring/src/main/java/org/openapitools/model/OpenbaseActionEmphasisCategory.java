package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseActionEmphasis.Category
 */
public enum OpenbaseActionEmphasisCategory {
  
  SAFETY("SAFETY"),
  
  SECURITY("SECURITY"),
  
  ECONOMY("ECONOMY"),
  
  COMFORT("COMFORT");

  private String value;

  OpenbaseActionEmphasisCategory(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseActionEmphasisCategory fromValue(String value) {
    for (OpenbaseActionEmphasisCategory b : OpenbaseActionEmphasisCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

