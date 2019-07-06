package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseServiceTemplate.ServiceType
 */
public enum OpenbaseServiceTemplateServiceType {
  ACTIVATION_STATE_SERVICE("ACTIVATION_STATE_SERVICE"),
    BATTERY_STATE_SERVICE("BATTERY_STATE_SERVICE"),
    BRIGHTNESS_STATE_SERVICE("BRIGHTNESS_STATE_SERVICE"),
    BUTTON_STATE_SERVICE("BUTTON_STATE_SERVICE"),
    SWITCH_STATE_SERVICE("SWITCH_STATE_SERVICE"),
    COLOR_STATE_SERVICE("COLOR_STATE_SERVICE"),
    HANDLE_STATE_SERVICE("HANDLE_STATE_SERVICE"),
    MOTION_STATE_SERVICE("MOTION_STATE_SERVICE"),
    POWER_CONSUMPTION_STATE_SERVICE("POWER_CONSUMPTION_STATE_SERVICE"),
    POWER_STATE_SERVICE("POWER_STATE_SERVICE"),
    CONTACT_STATE_SERVICE("CONTACT_STATE_SERVICE"),
    BLIND_STATE_SERVICE("BLIND_STATE_SERVICE"),
    TAMPER_STATE_SERVICE("TAMPER_STATE_SERVICE"),
    TARGET_TEMPERATURE_STATE_SERVICE("TARGET_TEMPERATURE_STATE_SERVICE"),
    TEMPERATURE_STATE_SERVICE("TEMPERATURE_STATE_SERVICE"),
    STANDBY_STATE_SERVICE("STANDBY_STATE_SERVICE"),
    SMOKE_ALARM_STATE_SERVICE("SMOKE_ALARM_STATE_SERVICE"),
    TEMPERATURE_ALARM_STATE_SERVICE("TEMPERATURE_ALARM_STATE_SERVICE"),
    SMOKE_STATE_SERVICE("SMOKE_STATE_SERVICE"),
    WATER_ALARM_STATE_SERVICE("WATER_ALARM_STATE_SERVICE"),
    FIRE_ALARM_STATE_SERVICE("FIRE_ALARM_STATE_SERVICE"),
    TEMPEST_ALARM_STATE_SERVICE("TEMPEST_ALARM_STATE_SERVICE"),
    EARTHQUAKE_ALARM_STATE_SERVICE("EARTHQUAKE_ALARM_STATE_SERVICE"),
    INTRUSION_ALARM_STATE_SERVICE("INTRUSION_ALARM_STATE_SERVICE"),
    MEDICAL_EMERGENCY_ALARM_STATE_SERVICE("MEDICAL_EMERGENCY_ALARM_STATE_SERVICE"),
    DOOR_STATE_SERVICE("DOOR_STATE_SERVICE"),
    WINDOW_STATE_SERVICE("WINDOW_STATE_SERVICE"),
    PASSAGE_STATE_SERVICE("PASSAGE_STATE_SERVICE"),
    RFID_STATE_SERVICE("RFID_STATE_SERVICE"),
    PRESENCE_STATE_SERVICE("PRESENCE_STATE_SERVICE"),
    ILLUMINANCE_STATE_SERVICE("ILLUMINANCE_STATE_SERVICE"),
    USER_TRANSIT_STATE_SERVICE("USER_TRANSIT_STATE_SERVICE"),
    ACTIVITY_MULTI_STATE_SERVICE("ACTIVITY_MULTI_STATE_SERVICE"),
    EMPHASIS_STATE_SERVICE("EMPHASIS_STATE_SERVICE"),
    LOCAL_POSITION_STATE_SERVICE("LOCAL_POSITION_STATE_SERVICE"),
    GLOBAL_POSITION_STATE_SERVICE("GLOBAL_POSITION_STATE_SERVICE");

  private String value;

  OpenbaseServiceTemplateServiceType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseServiceTemplateServiceType fromValue(String text) {
    for (OpenbaseServiceTemplateServiceType b : OpenbaseServiceTemplateServiceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
