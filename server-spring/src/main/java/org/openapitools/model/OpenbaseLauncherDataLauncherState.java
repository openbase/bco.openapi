package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseLauncherData.LauncherState
 */
public enum OpenbaseLauncherDataLauncherState {
  
  INITALIZING("INITALIZING"),
  
  LAUNCHING("LAUNCHING"),
  
  RUNNING("RUNNING"),
  
  STOPPING("STOPPING"),
  
  STOPPED("STOPPED"),
  
  ERROR("ERROR");

  private String value;

  OpenbaseLauncherDataLauncherState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseLauncherDataLauncherState fromValue(String value) {
    for (OpenbaseLauncherDataLauncherState b : OpenbaseLauncherDataLauncherState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

