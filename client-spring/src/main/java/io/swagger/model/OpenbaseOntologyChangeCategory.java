package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseOntologyChange.Category
 */
public enum OpenbaseOntologyChangeCategory {
  AGGREGATION("AGGREGATION");

  private String value;

  OpenbaseOntologyChangeCategory(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseOntologyChangeCategory fromValue(String text) {
    for (OpenbaseOntologyChangeCategory b : OpenbaseOntologyChangeCategory.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
