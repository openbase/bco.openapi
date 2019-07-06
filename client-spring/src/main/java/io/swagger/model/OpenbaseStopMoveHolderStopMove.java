package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
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
  public static OpenbaseStopMoveHolderStopMove fromValue(String text) {
    for (OpenbaseStopMoveHolderStopMove b : OpenbaseStopMoveHolderStopMove.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
