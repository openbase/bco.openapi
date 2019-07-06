package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
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
  public static OpenbaseLauncherDataLauncherState fromValue(String text) {
    for (OpenbaseLauncherDataLauncherState b : OpenbaseLauncherDataLauncherState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
