package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseStopMoveHolder.StopMove
 */
public enum OpenbaseStopMoveHolderStopMove {
  
  STOP("STOP"),
  
  MOVE("MOVE");

  private String value;

  OpenbaseStopMoveHolderStopMove(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseStopMoveHolderStopMove fromValue(String value) {
    for (OpenbaseStopMoveHolderStopMove b : OpenbaseStopMoveHolderStopMove.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

