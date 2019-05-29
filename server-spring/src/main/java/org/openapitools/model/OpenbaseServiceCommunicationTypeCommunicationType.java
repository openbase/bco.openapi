package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseServiceCommunicationType.CommunicationType
 */
public enum OpenbaseServiceCommunicationTypeCommunicationType {
  
  ACTIVATION_STATE("ACTIVATION_STATE"),
  
  ALARM_STATE("ALARM_STATE"),
  
  BATTERY_STATE("BATTERY_STATE"),
  
  BLIND_STATE("BLIND_STATE"),
  
  BRIGHTNESS_STATE("BRIGHTNESS_STATE"),
  
  BUTTON_STATE("BUTTON_STATE"),
  
  COLOR_STATE("COLOR_STATE"),
  
  CONTACT_STATE("CONTACT_STATE"),
  
  DOOR_STATE("DOOR_STATE"),
  
  HANDLE_STATE("HANDLE_STATE"),
  
  ILLUMINANCE_STATE("ILLUMINANCE_STATE"),
  
  MOTION_STATE("MOTION_STATE"),
  
  PASSAGE_STATE("PASSAGE_STATE"),
  
  POWER_CONSUMPTION_STATE("POWER_CONSUMPTION_STATE"),
  
  POWER_STATE("POWER_STATE"),
  
  PRESENCE_STATE("PRESENCE_STATE"),
  
  RFID_STATE("RFID_STATE"),
  
  SMOKE_STATE("SMOKE_STATE"),
  
  STANDBY_STATE("STANDBY_STATE"),
  
  SWITCH_STATE("SWITCH_STATE"),
  
  TAMPER_STATE("TAMPER_STATE"),
  
  TEMPERATURE_STATE("TEMPERATURE_STATE"),
  
  ACTIVITY_STATE("ACTIVITY_STATE"),
  
  ACTIVITY_MULTI_STATE("ACTIVITY_MULTI_STATE"),
  
  USER_TRANSIT_STATE("USER_TRANSIT_STATE"),
  
  WINDOW_STATE("WINDOW_STATE"),
  
  EMPHASIS_STATE("EMPHASIS_STATE"),
  
  LOCAL_POSITION_STATE("LOCAL_POSITION_STATE"),
  
  GLOBAL_POSITION_STATE("GLOBAL_POSITION_STATE");

  private String value;

  OpenbaseServiceCommunicationTypeCommunicationType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseServiceCommunicationTypeCommunicationType fromValue(String value) {
    for (OpenbaseServiceCommunicationTypeCommunicationType b : OpenbaseServiceCommunicationTypeCommunicationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

