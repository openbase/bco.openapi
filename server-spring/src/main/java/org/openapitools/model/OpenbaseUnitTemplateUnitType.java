package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseUnitTemplate.UnitType
 */
public enum OpenbaseUnitTemplateUnitType {
  
  OBJECT("OBJECT"),
  
  COLORABLE_LIGHT("COLORABLE_LIGHT"),
  
  BATTERY("BATTERY"),
  
  BUTTON("BUTTON"),
  
  SWITCH("SWITCH"),
  
  DIMMER("DIMMER"),
  
  DIMMABLE_LIGHT("DIMMABLE_LIGHT"),
  
  HANDLE("HANDLE"),
  
  LIGHT("LIGHT"),
  
  LIGHT_SENSOR("LIGHT_SENSOR"),
  
  MOTION_DETECTOR("MOTION_DETECTOR"),
  
  POWER_CONSUMPTION_SENSOR("POWER_CONSUMPTION_SENSOR"),
  
  POWER_SWITCH("POWER_SWITCH"),
  
  REED_CONTACT("REED_CONTACT"),
  
  SMOKE_DETECTOR("SMOKE_DETECTOR"),
  
  TAMPER_DETECTOR("TAMPER_DETECTOR"),
  
  TEMPERATURE_CONTROLLER("TEMPERATURE_CONTROLLER"),
  
  TEMPERATURE_SENSOR("TEMPERATURE_SENSOR"),
  
  ROLLER_SHUTTER("ROLLER_SHUTTER"),
  
  MONITOR("MONITOR"),
  
  DISPLAY("DISPLAY"),
  
  TELEVISION("TELEVISION"),
  
  AUDIO_SOURCE("AUDIO_SOURCE"),
  
  AUDIO_SINK("AUDIO_SINK"),
  
  VIDEO_RGB_SOURCE("VIDEO_RGB_SOURCE"),
  
  VIDEO_DEPTH_SOURCE("VIDEO_DEPTH_SOURCE"),
  
  LOCATION("LOCATION"),
  
  CONNECTION("CONNECTION"),
  
  SCENE("SCENE"),
  
  AGENT("AGENT"),
  
  APP("APP"),
  
  DEVICE("DEVICE"),
  
  USER("USER"),
  
  AUTHORIZATION_GROUP("AUTHORIZATION_GROUP"),
  
  UNIT_GROUP("UNIT_GROUP"),
  
  RFID("RFID");

  private String value;

  OpenbaseUnitTemplateUnitType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseUnitTemplateUnitType fromValue(String value) {
    for (OpenbaseUnitTemplateUnitType b : OpenbaseUnitTemplateUnitType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

