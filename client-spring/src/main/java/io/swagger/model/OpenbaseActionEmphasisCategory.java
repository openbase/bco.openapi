package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
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
  public static OpenbaseActionEmphasisCategory fromValue(String text) {
    for (OpenbaseActionEmphasisCategory b : OpenbaseActionEmphasisCategory.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
