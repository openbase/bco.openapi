package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseState.Aspect
 */
public enum OpenbaseStateAspect {
  
  POSITION_2D("ASPECT_POSITION_2D"),
  
  POSITION_3D("ASPECT_POSITION_3D"),
  
  AXIS_ALIGNED_BOUNDING_BOX_2D("ASPECT_AXIS_ALIGNED_BOUNDING_BOX_2D"),
  
  AXIS_ALIGNED_BOUNDING_BOX_3D("ASPECT_AXIS_ALIGNED_BOUNDING_BOX_3D"),
  
  BOUNDING_BOX_2D("ASPECT_BOUNDING_BOX_2D"),
  
  BOUNDING_BOX_3D("ASPECT_BOUNDING_BOX_3D"),
  
  CONTOUR("ASPECT_CONTOUR"),
  
  POSTURE_2D("ASPECT_POSTURE_2D"),
  
  POSTURE_3D("ASPECT_POSTURE_3D");

  private String value;

  OpenbaseStateAspect(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseStateAspect fromValue(String value) {
    for (OpenbaseStateAspect b : OpenbaseStateAspect.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

