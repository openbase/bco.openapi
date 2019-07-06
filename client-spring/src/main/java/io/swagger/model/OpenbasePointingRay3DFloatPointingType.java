package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbasePointingRay3DFloat.PointingType
 */
public enum OpenbasePointingRay3DFloatPointingType {
  FOREARM("FOREARM"),
    HAND("HAND"),
    HEAD_HAND("HEAD_HAND"),
    HEAD_FINGERTIP("HEAD_FINGERTIP"),
    SHOULDER_HAND("SHOULDER_HAND"),
    OTHER("OTHER");

  private String value;

  OpenbasePointingRay3DFloatPointingType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbasePointingRay3DFloatPointingType fromValue(String text) {
    for (OpenbasePointingRay3DFloatPointingType b : OpenbasePointingRay3DFloatPointingType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
