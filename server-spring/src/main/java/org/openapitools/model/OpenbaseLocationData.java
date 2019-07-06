package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseActionDescription;
import org.openapitools.model.OpenbaseActivityState;
import org.openapitools.model.OpenbaseAlarmState;
import org.openapitools.model.OpenbaseBlindState;
import org.openapitools.model.OpenbaseBrightnessState;
import org.openapitools.model.OpenbaseColorState;
import org.openapitools.model.OpenbaseEmphasisState;
import org.openapitools.model.OpenbaseIlluminanceState;
import org.openapitools.model.OpenbaseMotionState;
import org.openapitools.model.OpenbasePowerConsumptionState;
import org.openapitools.model.OpenbasePowerState;
import org.openapitools.model.OpenbasePresenceState;
import org.openapitools.model.OpenbaseSmokeState;
import org.openapitools.model.OpenbaseStandbyState;
import org.openapitools.model.OpenbaseTamperState;
import org.openapitools.model.OpenbaseTemperatureState;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseLocationData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbaseLocationData   {
  @JsonProperty("action")
  @Valid
  private List<OpenbaseActionDescription> action = null;

  @JsonProperty("activity_state")
  @Valid
  private List<OpenbaseActivityState> activityState = null;

  @JsonProperty("activity_state_last")
  @Valid
  private List<OpenbaseActivityState> activityStateLast = null;

  @JsonProperty("activity_state_requested")
  @Valid
  private List<OpenbaseActivityState> activityStateRequested = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("blind_state")
  private OpenbaseBlindState blindState = null;

  @JsonProperty("blind_state_last")
  private OpenbaseBlindState blindStateLast = null;

  @JsonProperty("blind_state_requested")
  private OpenbaseBlindState blindStateRequested = null;

  @JsonProperty("brightness_state")
  private OpenbaseBrightnessState brightnessState = null;

  @JsonProperty("brightness_state_last")
  private OpenbaseBrightnessState brightnessStateLast = null;

  @JsonProperty("brightness_state_requested")
  private OpenbaseBrightnessState brightnessStateRequested = null;

  @JsonProperty("color_state")
  private OpenbaseColorState colorState = null;

  @JsonProperty("color_state_last")
  private OpenbaseColorState colorStateLast = null;

  @JsonProperty("color_state_requested")
  private OpenbaseColorState colorStateRequested = null;

  @JsonProperty("emphasis_state")
  private OpenbaseEmphasisState emphasisState = null;

  @JsonProperty("emphasis_state_last")
  private OpenbaseEmphasisState emphasisStateLast = null;

  @JsonProperty("emphasis_state_requested")
  private OpenbaseEmphasisState emphasisStateRequested = null;

  @JsonProperty("id")
  private String id;

  @JsonProperty("illuminance_state")
  private OpenbaseIlluminanceState illuminanceState = null;

  @JsonProperty("illuminance_state_last")
  private OpenbaseIlluminanceState illuminanceStateLast = null;

  @JsonProperty("motion_state")
  private OpenbaseMotionState motionState = null;

  @JsonProperty("motion_state_last")
  private OpenbaseMotionState motionStateLast = null;

  @JsonProperty("power_consumption_state")
  private OpenbasePowerConsumptionState powerConsumptionState = null;

  @JsonProperty("power_consumption_state_last")
  private OpenbasePowerConsumptionState powerConsumptionStateLast = null;

  @JsonProperty("power_state")
  private OpenbasePowerState powerState = null;

  @JsonProperty("power_state_last")
  private OpenbasePowerState powerStateLast = null;

  @JsonProperty("power_state_requested")
  private OpenbasePowerState powerStateRequested = null;

  @JsonProperty("presence_state")
  private OpenbasePresenceState presenceState = null;

  @JsonProperty("presence_state_last")
  private OpenbasePresenceState presenceStateLast = null;

  @JsonProperty("smoke_alarm_state")
  private OpenbaseAlarmState smokeAlarmState = null;

  @JsonProperty("smoke_alarm_state_last")
  private OpenbaseAlarmState smokeAlarmStateLast = null;

  @JsonProperty("smoke_state")
  private OpenbaseSmokeState smokeState = null;

  @JsonProperty("smoke_state_last")
  private OpenbaseSmokeState smokeStateLast = null;

  @JsonProperty("standby_state")
  private OpenbaseStandbyState standbyState = null;

  @JsonProperty("standby_state_last")
  private OpenbaseStandbyState standbyStateLast = null;

  @JsonProperty("standby_state_requested")
  private OpenbaseStandbyState standbyStateRequested = null;

  @JsonProperty("tamper_state")
  private OpenbaseTamperState tamperState = null;

  @JsonProperty("tamper_state_last")
  private OpenbaseTamperState tamperStateLast = null;

  @JsonProperty("target_temperature_state")
  private OpenbaseTemperatureState targetTemperatureState = null;

  @JsonProperty("target_temperature_state_last")
  private OpenbaseTemperatureState targetTemperatureStateLast = null;

  @JsonProperty("target_temperature_state_requested")
  private OpenbaseTemperatureState targetTemperatureStateRequested = null;

  @JsonProperty("temperature_alarm_state")
  private OpenbaseAlarmState temperatureAlarmState = null;

  @JsonProperty("temperature_alarm_state_last")
  private OpenbaseAlarmState temperatureAlarmStateLast = null;

  @JsonProperty("temperature_state")
  private OpenbaseTemperatureState temperatureState = null;

  @JsonProperty("temperature_state_last")
  private OpenbaseTemperatureState temperatureStateLast = null;

  @JsonProperty("temperature_state_requested")
  private OpenbaseTemperatureState temperatureStateRequested = null;

  @JsonProperty("transaction_id")
  private Long transactionId;

  public OpenbaseLocationData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbaseLocationData addActionItem(OpenbaseActionDescription actionItem) {
    if (this.action == null) {
      this.action = new ArrayList<>();
    }
    this.action.add(actionItem);
    return this;
  }

  /**
   * Get action
   * @return action
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseActionDescription> getAction() {
    return action;
  }

  public void setAction(List<OpenbaseActionDescription> action) {
    this.action = action;
  }

  public OpenbaseLocationData activityState(List<OpenbaseActivityState> activityState) {
    this.activityState = activityState;
    return this;
  }

  public OpenbaseLocationData addActivityStateItem(OpenbaseActivityState activityStateItem) {
    if (this.activityState == null) {
      this.activityState = new ArrayList<>();
    }
    this.activityState.add(activityStateItem);
    return this;
  }

  /**
   * Get activityState
   * @return activityState
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseActivityState> getActivityState() {
    return activityState;
  }

  public void setActivityState(List<OpenbaseActivityState> activityState) {
    this.activityState = activityState;
  }

  public OpenbaseLocationData activityStateLast(List<OpenbaseActivityState> activityStateLast) {
    this.activityStateLast = activityStateLast;
    return this;
  }

  public OpenbaseLocationData addActivityStateLastItem(OpenbaseActivityState activityStateLastItem) {
    if (this.activityStateLast == null) {
      this.activityStateLast = new ArrayList<>();
    }
    this.activityStateLast.add(activityStateLastItem);
    return this;
  }

  /**
   * Get activityStateLast
   * @return activityStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseActivityState> getActivityStateLast() {
    return activityStateLast;
  }

  public void setActivityStateLast(List<OpenbaseActivityState> activityStateLast) {
    this.activityStateLast = activityStateLast;
  }

  public OpenbaseLocationData activityStateRequested(List<OpenbaseActivityState> activityStateRequested) {
    this.activityStateRequested = activityStateRequested;
    return this;
  }

  public OpenbaseLocationData addActivityStateRequestedItem(OpenbaseActivityState activityStateRequestedItem) {
    if (this.activityStateRequested == null) {
      this.activityStateRequested = new ArrayList<>();
    }
    this.activityStateRequested.add(activityStateRequestedItem);
    return this;
  }

  /**
   * Get activityStateRequested
   * @return activityStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseActivityState> getActivityStateRequested() {
    return activityStateRequested;
  }

  public void setActivityStateRequested(List<OpenbaseActivityState> activityStateRequested) {
    this.activityStateRequested = activityStateRequested;
  }

  public OpenbaseLocationData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseLocationData addAliasItem(String aliasItem) {
    if (this.alias == null) {
      this.alias = new ArrayList<>();
    }
    this.alias.add(aliasItem);
    return this;
  }

  /**
   * Get alias
   * @return alias
  */
  @ApiModelProperty(value = "")


  public List<String> getAlias() {
    return alias;
  }

  public void setAlias(List<String> alias) {
    this.alias = alias;
  }

  public OpenbaseLocationData blindState(OpenbaseBlindState blindState) {
    this.blindState = blindState;
    return this;
  }

  /**
   * Get blindState
   * @return blindState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseBlindState getBlindState() {
    return blindState;
  }

  public void setBlindState(OpenbaseBlindState blindState) {
    this.blindState = blindState;
  }

  public OpenbaseLocationData blindStateLast(OpenbaseBlindState blindStateLast) {
    this.blindStateLast = blindStateLast;
    return this;
  }

  /**
   * Get blindStateLast
   * @return blindStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseBlindState getBlindStateLast() {
    return blindStateLast;
  }

  public void setBlindStateLast(OpenbaseBlindState blindStateLast) {
    this.blindStateLast = blindStateLast;
  }

  public OpenbaseLocationData blindStateRequested(OpenbaseBlindState blindStateRequested) {
    this.blindStateRequested = blindStateRequested;
    return this;
  }

  /**
   * Get blindStateRequested
   * @return blindStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseBlindState getBlindStateRequested() {
    return blindStateRequested;
  }

  public void setBlindStateRequested(OpenbaseBlindState blindStateRequested) {
    this.blindStateRequested = blindStateRequested;
  }

  public OpenbaseLocationData brightnessState(OpenbaseBrightnessState brightnessState) {
    this.brightnessState = brightnessState;
    return this;
  }

  /**
   * Get brightnessState
   * @return brightnessState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseBrightnessState getBrightnessState() {
    return brightnessState;
  }

  public void setBrightnessState(OpenbaseBrightnessState brightnessState) {
    this.brightnessState = brightnessState;
  }

  public OpenbaseLocationData brightnessStateLast(OpenbaseBrightnessState brightnessStateLast) {
    this.brightnessStateLast = brightnessStateLast;
    return this;
  }

  /**
   * Get brightnessStateLast
   * @return brightnessStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseBrightnessState getBrightnessStateLast() {
    return brightnessStateLast;
  }

  public void setBrightnessStateLast(OpenbaseBrightnessState brightnessStateLast) {
    this.brightnessStateLast = brightnessStateLast;
  }

  public OpenbaseLocationData brightnessStateRequested(OpenbaseBrightnessState brightnessStateRequested) {
    this.brightnessStateRequested = brightnessStateRequested;
    return this;
  }

  /**
   * Get brightnessStateRequested
   * @return brightnessStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseBrightnessState getBrightnessStateRequested() {
    return brightnessStateRequested;
  }

  public void setBrightnessStateRequested(OpenbaseBrightnessState brightnessStateRequested) {
    this.brightnessStateRequested = brightnessStateRequested;
  }

  public OpenbaseLocationData colorState(OpenbaseColorState colorState) {
    this.colorState = colorState;
    return this;
  }

  /**
   * Get colorState
   * @return colorState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseColorState getColorState() {
    return colorState;
  }

  public void setColorState(OpenbaseColorState colorState) {
    this.colorState = colorState;
  }

  public OpenbaseLocationData colorStateLast(OpenbaseColorState colorStateLast) {
    this.colorStateLast = colorStateLast;
    return this;
  }

  /**
   * Get colorStateLast
   * @return colorStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseColorState getColorStateLast() {
    return colorStateLast;
  }

  public void setColorStateLast(OpenbaseColorState colorStateLast) {
    this.colorStateLast = colorStateLast;
  }

  public OpenbaseLocationData colorStateRequested(OpenbaseColorState colorStateRequested) {
    this.colorStateRequested = colorStateRequested;
    return this;
  }

  /**
   * Get colorStateRequested
   * @return colorStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseColorState getColorStateRequested() {
    return colorStateRequested;
  }

  public void setColorStateRequested(OpenbaseColorState colorStateRequested) {
    this.colorStateRequested = colorStateRequested;
  }

  public OpenbaseLocationData emphasisState(OpenbaseEmphasisState emphasisState) {
    this.emphasisState = emphasisState;
    return this;
  }

  /**
   * Get emphasisState
   * @return emphasisState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseEmphasisState getEmphasisState() {
    return emphasisState;
  }

  public void setEmphasisState(OpenbaseEmphasisState emphasisState) {
    this.emphasisState = emphasisState;
  }

  public OpenbaseLocationData emphasisStateLast(OpenbaseEmphasisState emphasisStateLast) {
    this.emphasisStateLast = emphasisStateLast;
    return this;
  }

  /**
   * Get emphasisStateLast
   * @return emphasisStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseEmphasisState getEmphasisStateLast() {
    return emphasisStateLast;
  }

  public void setEmphasisStateLast(OpenbaseEmphasisState emphasisStateLast) {
    this.emphasisStateLast = emphasisStateLast;
  }

  public OpenbaseLocationData emphasisStateRequested(OpenbaseEmphasisState emphasisStateRequested) {
    this.emphasisStateRequested = emphasisStateRequested;
    return this;
  }

  /**
   * Get emphasisStateRequested
   * @return emphasisStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseEmphasisState getEmphasisStateRequested() {
    return emphasisStateRequested;
  }

  public void setEmphasisStateRequested(OpenbaseEmphasisState emphasisStateRequested) {
    this.emphasisStateRequested = emphasisStateRequested;
  }

  public OpenbaseLocationData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OpenbaseLocationData illuminanceState(OpenbaseIlluminanceState illuminanceState) {
    this.illuminanceState = illuminanceState;
    return this;
  }

  /**
   * Get illuminanceState
   * @return illuminanceState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseIlluminanceState getIlluminanceState() {
    return illuminanceState;
  }

  public void setIlluminanceState(OpenbaseIlluminanceState illuminanceState) {
    this.illuminanceState = illuminanceState;
  }

  public OpenbaseLocationData illuminanceStateLast(OpenbaseIlluminanceState illuminanceStateLast) {
    this.illuminanceStateLast = illuminanceStateLast;
    return this;
  }

  /**
   * Get illuminanceStateLast
   * @return illuminanceStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseIlluminanceState getIlluminanceStateLast() {
    return illuminanceStateLast;
  }

  public void setIlluminanceStateLast(OpenbaseIlluminanceState illuminanceStateLast) {
    this.illuminanceStateLast = illuminanceStateLast;
  }

  public OpenbaseLocationData motionState(OpenbaseMotionState motionState) {
    this.motionState = motionState;
    return this;
  }

  /**
   * Get motionState
   * @return motionState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseMotionState getMotionState() {
    return motionState;
  }

  public void setMotionState(OpenbaseMotionState motionState) {
    this.motionState = motionState;
  }

  public OpenbaseLocationData motionStateLast(OpenbaseMotionState motionStateLast) {
    this.motionStateLast = motionStateLast;
    return this;
  }

  /**
   * Get motionStateLast
   * @return motionStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseMotionState getMotionStateLast() {
    return motionStateLast;
  }

  public void setMotionStateLast(OpenbaseMotionState motionStateLast) {
    this.motionStateLast = motionStateLast;
  }

  public OpenbaseLocationData powerConsumptionState(OpenbasePowerConsumptionState powerConsumptionState) {
    this.powerConsumptionState = powerConsumptionState;
    return this;
  }

  /**
   * Get powerConsumptionState
   * @return powerConsumptionState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePowerConsumptionState getPowerConsumptionState() {
    return powerConsumptionState;
  }

  public void setPowerConsumptionState(OpenbasePowerConsumptionState powerConsumptionState) {
    this.powerConsumptionState = powerConsumptionState;
  }

  public OpenbaseLocationData powerConsumptionStateLast(OpenbasePowerConsumptionState powerConsumptionStateLast) {
    this.powerConsumptionStateLast = powerConsumptionStateLast;
    return this;
  }

  /**
   * Get powerConsumptionStateLast
   * @return powerConsumptionStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePowerConsumptionState getPowerConsumptionStateLast() {
    return powerConsumptionStateLast;
  }

  public void setPowerConsumptionStateLast(OpenbasePowerConsumptionState powerConsumptionStateLast) {
    this.powerConsumptionStateLast = powerConsumptionStateLast;
  }

  public OpenbaseLocationData powerState(OpenbasePowerState powerState) {
    this.powerState = powerState;
    return this;
  }

  /**
   * Get powerState
   * @return powerState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePowerState getPowerState() {
    return powerState;
  }

  public void setPowerState(OpenbasePowerState powerState) {
    this.powerState = powerState;
  }

  public OpenbaseLocationData powerStateLast(OpenbasePowerState powerStateLast) {
    this.powerStateLast = powerStateLast;
    return this;
  }

  /**
   * Get powerStateLast
   * @return powerStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePowerState getPowerStateLast() {
    return powerStateLast;
  }

  public void setPowerStateLast(OpenbasePowerState powerStateLast) {
    this.powerStateLast = powerStateLast;
  }

  public OpenbaseLocationData powerStateRequested(OpenbasePowerState powerStateRequested) {
    this.powerStateRequested = powerStateRequested;
    return this;
  }

  /**
   * Get powerStateRequested
   * @return powerStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePowerState getPowerStateRequested() {
    return powerStateRequested;
  }

  public void setPowerStateRequested(OpenbasePowerState powerStateRequested) {
    this.powerStateRequested = powerStateRequested;
  }

  public OpenbaseLocationData presenceState(OpenbasePresenceState presenceState) {
    this.presenceState = presenceState;
    return this;
  }

  /**
   * Get presenceState
   * @return presenceState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePresenceState getPresenceState() {
    return presenceState;
  }

  public void setPresenceState(OpenbasePresenceState presenceState) {
    this.presenceState = presenceState;
  }

  public OpenbaseLocationData presenceStateLast(OpenbasePresenceState presenceStateLast) {
    this.presenceStateLast = presenceStateLast;
    return this;
  }

  /**
   * Get presenceStateLast
   * @return presenceStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbasePresenceState getPresenceStateLast() {
    return presenceStateLast;
  }

  public void setPresenceStateLast(OpenbasePresenceState presenceStateLast) {
    this.presenceStateLast = presenceStateLast;
  }

  public OpenbaseLocationData smokeAlarmState(OpenbaseAlarmState smokeAlarmState) {
    this.smokeAlarmState = smokeAlarmState;
    return this;
  }

  /**
   * Get smokeAlarmState
   * @return smokeAlarmState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseAlarmState getSmokeAlarmState() {
    return smokeAlarmState;
  }

  public void setSmokeAlarmState(OpenbaseAlarmState smokeAlarmState) {
    this.smokeAlarmState = smokeAlarmState;
  }

  public OpenbaseLocationData smokeAlarmStateLast(OpenbaseAlarmState smokeAlarmStateLast) {
    this.smokeAlarmStateLast = smokeAlarmStateLast;
    return this;
  }

  /**
   * Get smokeAlarmStateLast
   * @return smokeAlarmStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseAlarmState getSmokeAlarmStateLast() {
    return smokeAlarmStateLast;
  }

  public void setSmokeAlarmStateLast(OpenbaseAlarmState smokeAlarmStateLast) {
    this.smokeAlarmStateLast = smokeAlarmStateLast;
  }

  public OpenbaseLocationData smokeState(OpenbaseSmokeState smokeState) {
    this.smokeState = smokeState;
    return this;
  }

  /**
   * Get smokeState
   * @return smokeState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseSmokeState getSmokeState() {
    return smokeState;
  }

  public void setSmokeState(OpenbaseSmokeState smokeState) {
    this.smokeState = smokeState;
  }

  public OpenbaseLocationData smokeStateLast(OpenbaseSmokeState smokeStateLast) {
    this.smokeStateLast = smokeStateLast;
    return this;
  }

  /**
   * Get smokeStateLast
   * @return smokeStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseSmokeState getSmokeStateLast() {
    return smokeStateLast;
  }

  public void setSmokeStateLast(OpenbaseSmokeState smokeStateLast) {
    this.smokeStateLast = smokeStateLast;
  }

  public OpenbaseLocationData standbyState(OpenbaseStandbyState standbyState) {
    this.standbyState = standbyState;
    return this;
  }

  /**
   * Get standbyState
   * @return standbyState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseStandbyState getStandbyState() {
    return standbyState;
  }

  public void setStandbyState(OpenbaseStandbyState standbyState) {
    this.standbyState = standbyState;
  }

  public OpenbaseLocationData standbyStateLast(OpenbaseStandbyState standbyStateLast) {
    this.standbyStateLast = standbyStateLast;
    return this;
  }

  /**
   * Get standbyStateLast
   * @return standbyStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseStandbyState getStandbyStateLast() {
    return standbyStateLast;
  }

  public void setStandbyStateLast(OpenbaseStandbyState standbyStateLast) {
    this.standbyStateLast = standbyStateLast;
  }

  public OpenbaseLocationData standbyStateRequested(OpenbaseStandbyState standbyStateRequested) {
    this.standbyStateRequested = standbyStateRequested;
    return this;
  }

  /**
   * Get standbyStateRequested
   * @return standbyStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseStandbyState getStandbyStateRequested() {
    return standbyStateRequested;
  }

  public void setStandbyStateRequested(OpenbaseStandbyState standbyStateRequested) {
    this.standbyStateRequested = standbyStateRequested;
  }

  public OpenbaseLocationData tamperState(OpenbaseTamperState tamperState) {
    this.tamperState = tamperState;
    return this;
  }

  /**
   * Get tamperState
   * @return tamperState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTamperState getTamperState() {
    return tamperState;
  }

  public void setTamperState(OpenbaseTamperState tamperState) {
    this.tamperState = tamperState;
  }

  public OpenbaseLocationData tamperStateLast(OpenbaseTamperState tamperStateLast) {
    this.tamperStateLast = tamperStateLast;
    return this;
  }

  /**
   * Get tamperStateLast
   * @return tamperStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTamperState getTamperStateLast() {
    return tamperStateLast;
  }

  public void setTamperStateLast(OpenbaseTamperState tamperStateLast) {
    this.tamperStateLast = tamperStateLast;
  }

  public OpenbaseLocationData targetTemperatureState(OpenbaseTemperatureState targetTemperatureState) {
    this.targetTemperatureState = targetTemperatureState;
    return this;
  }

  /**
   * Get targetTemperatureState
   * @return targetTemperatureState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTemperatureState getTargetTemperatureState() {
    return targetTemperatureState;
  }

  public void setTargetTemperatureState(OpenbaseTemperatureState targetTemperatureState) {
    this.targetTemperatureState = targetTemperatureState;
  }

  public OpenbaseLocationData targetTemperatureStateLast(OpenbaseTemperatureState targetTemperatureStateLast) {
    this.targetTemperatureStateLast = targetTemperatureStateLast;
    return this;
  }

  /**
   * Get targetTemperatureStateLast
   * @return targetTemperatureStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTemperatureState getTargetTemperatureStateLast() {
    return targetTemperatureStateLast;
  }

  public void setTargetTemperatureStateLast(OpenbaseTemperatureState targetTemperatureStateLast) {
    this.targetTemperatureStateLast = targetTemperatureStateLast;
  }

  public OpenbaseLocationData targetTemperatureStateRequested(OpenbaseTemperatureState targetTemperatureStateRequested) {
    this.targetTemperatureStateRequested = targetTemperatureStateRequested;
    return this;
  }

  /**
   * Get targetTemperatureStateRequested
   * @return targetTemperatureStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTemperatureState getTargetTemperatureStateRequested() {
    return targetTemperatureStateRequested;
  }

  public void setTargetTemperatureStateRequested(OpenbaseTemperatureState targetTemperatureStateRequested) {
    this.targetTemperatureStateRequested = targetTemperatureStateRequested;
  }

  public OpenbaseLocationData temperatureAlarmState(OpenbaseAlarmState temperatureAlarmState) {
    this.temperatureAlarmState = temperatureAlarmState;
    return this;
  }

  /**
   * Get temperatureAlarmState
   * @return temperatureAlarmState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseAlarmState getTemperatureAlarmState() {
    return temperatureAlarmState;
  }

  public void setTemperatureAlarmState(OpenbaseAlarmState temperatureAlarmState) {
    this.temperatureAlarmState = temperatureAlarmState;
  }

  public OpenbaseLocationData temperatureAlarmStateLast(OpenbaseAlarmState temperatureAlarmStateLast) {
    this.temperatureAlarmStateLast = temperatureAlarmStateLast;
    return this;
  }

  /**
   * Get temperatureAlarmStateLast
   * @return temperatureAlarmStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseAlarmState getTemperatureAlarmStateLast() {
    return temperatureAlarmStateLast;
  }

  public void setTemperatureAlarmStateLast(OpenbaseAlarmState temperatureAlarmStateLast) {
    this.temperatureAlarmStateLast = temperatureAlarmStateLast;
  }

  public OpenbaseLocationData temperatureState(OpenbaseTemperatureState temperatureState) {
    this.temperatureState = temperatureState;
    return this;
  }

  /**
   * Get temperatureState
   * @return temperatureState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTemperatureState getTemperatureState() {
    return temperatureState;
  }

  public void setTemperatureState(OpenbaseTemperatureState temperatureState) {
    this.temperatureState = temperatureState;
  }

  public OpenbaseLocationData temperatureStateLast(OpenbaseTemperatureState temperatureStateLast) {
    this.temperatureStateLast = temperatureStateLast;
    return this;
  }

  /**
   * Get temperatureStateLast
   * @return temperatureStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTemperatureState getTemperatureStateLast() {
    return temperatureStateLast;
  }

  public void setTemperatureStateLast(OpenbaseTemperatureState temperatureStateLast) {
    this.temperatureStateLast = temperatureStateLast;
  }

  public OpenbaseLocationData temperatureStateRequested(OpenbaseTemperatureState temperatureStateRequested) {
    this.temperatureStateRequested = temperatureStateRequested;
    return this;
  }

  /**
   * Get temperatureStateRequested
   * @return temperatureStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTemperatureState getTemperatureStateRequested() {
    return temperatureStateRequested;
  }

  public void setTemperatureStateRequested(OpenbaseTemperatureState temperatureStateRequested) {
    this.temperatureStateRequested = temperatureStateRequested;
  }

  public OpenbaseLocationData transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
  */
  @ApiModelProperty(value = "")


  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseLocationData openbaseLocationData = (OpenbaseLocationData) o;
    return Objects.equals(this.action, openbaseLocationData.action) &&
        Objects.equals(this.activityState, openbaseLocationData.activityState) &&
        Objects.equals(this.activityStateLast, openbaseLocationData.activityStateLast) &&
        Objects.equals(this.activityStateRequested, openbaseLocationData.activityStateRequested) &&
        Objects.equals(this.alias, openbaseLocationData.alias) &&
        Objects.equals(this.blindState, openbaseLocationData.blindState) &&
        Objects.equals(this.blindStateLast, openbaseLocationData.blindStateLast) &&
        Objects.equals(this.blindStateRequested, openbaseLocationData.blindStateRequested) &&
        Objects.equals(this.brightnessState, openbaseLocationData.brightnessState) &&
        Objects.equals(this.brightnessStateLast, openbaseLocationData.brightnessStateLast) &&
        Objects.equals(this.brightnessStateRequested, openbaseLocationData.brightnessStateRequested) &&
        Objects.equals(this.colorState, openbaseLocationData.colorState) &&
        Objects.equals(this.colorStateLast, openbaseLocationData.colorStateLast) &&
        Objects.equals(this.colorStateRequested, openbaseLocationData.colorStateRequested) &&
        Objects.equals(this.emphasisState, openbaseLocationData.emphasisState) &&
        Objects.equals(this.emphasisStateLast, openbaseLocationData.emphasisStateLast) &&
        Objects.equals(this.emphasisStateRequested, openbaseLocationData.emphasisStateRequested) &&
        Objects.equals(this.id, openbaseLocationData.id) &&
        Objects.equals(this.illuminanceState, openbaseLocationData.illuminanceState) &&
        Objects.equals(this.illuminanceStateLast, openbaseLocationData.illuminanceStateLast) &&
        Objects.equals(this.motionState, openbaseLocationData.motionState) &&
        Objects.equals(this.motionStateLast, openbaseLocationData.motionStateLast) &&
        Objects.equals(this.powerConsumptionState, openbaseLocationData.powerConsumptionState) &&
        Objects.equals(this.powerConsumptionStateLast, openbaseLocationData.powerConsumptionStateLast) &&
        Objects.equals(this.powerState, openbaseLocationData.powerState) &&
        Objects.equals(this.powerStateLast, openbaseLocationData.powerStateLast) &&
        Objects.equals(this.powerStateRequested, openbaseLocationData.powerStateRequested) &&
        Objects.equals(this.presenceState, openbaseLocationData.presenceState) &&
        Objects.equals(this.presenceStateLast, openbaseLocationData.presenceStateLast) &&
        Objects.equals(this.smokeAlarmState, openbaseLocationData.smokeAlarmState) &&
        Objects.equals(this.smokeAlarmStateLast, openbaseLocationData.smokeAlarmStateLast) &&
        Objects.equals(this.smokeState, openbaseLocationData.smokeState) &&
        Objects.equals(this.smokeStateLast, openbaseLocationData.smokeStateLast) &&
        Objects.equals(this.standbyState, openbaseLocationData.standbyState) &&
        Objects.equals(this.standbyStateLast, openbaseLocationData.standbyStateLast) &&
        Objects.equals(this.standbyStateRequested, openbaseLocationData.standbyStateRequested) &&
        Objects.equals(this.tamperState, openbaseLocationData.tamperState) &&
        Objects.equals(this.tamperStateLast, openbaseLocationData.tamperStateLast) &&
        Objects.equals(this.targetTemperatureState, openbaseLocationData.targetTemperatureState) &&
        Objects.equals(this.targetTemperatureStateLast, openbaseLocationData.targetTemperatureStateLast) &&
        Objects.equals(this.targetTemperatureStateRequested, openbaseLocationData.targetTemperatureStateRequested) &&
        Objects.equals(this.temperatureAlarmState, openbaseLocationData.temperatureAlarmState) &&
        Objects.equals(this.temperatureAlarmStateLast, openbaseLocationData.temperatureAlarmStateLast) &&
        Objects.equals(this.temperatureState, openbaseLocationData.temperatureState) &&
        Objects.equals(this.temperatureStateLast, openbaseLocationData.temperatureStateLast) &&
        Objects.equals(this.temperatureStateRequested, openbaseLocationData.temperatureStateRequested) &&
        Objects.equals(this.transactionId, openbaseLocationData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, activityState, activityStateLast, activityStateRequested, alias, blindState, blindStateLast, blindStateRequested, brightnessState, brightnessStateLast, brightnessStateRequested, colorState, colorStateLast, colorStateRequested, emphasisState, emphasisStateLast, emphasisStateRequested, id, illuminanceState, illuminanceStateLast, motionState, motionStateLast, powerConsumptionState, powerConsumptionStateLast, powerState, powerStateLast, powerStateRequested, presenceState, presenceStateLast, smokeAlarmState, smokeAlarmStateLast, smokeState, smokeStateLast, standbyState, standbyStateLast, standbyStateRequested, tamperState, tamperStateLast, targetTemperatureState, targetTemperatureStateLast, targetTemperatureStateRequested, temperatureAlarmState, temperatureAlarmStateLast, temperatureState, temperatureStateLast, temperatureStateRequested, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseLocationData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    activityState: ").append(toIndentedString(activityState)).append("\n");
    sb.append("    activityStateLast: ").append(toIndentedString(activityStateLast)).append("\n");
    sb.append("    activityStateRequested: ").append(toIndentedString(activityStateRequested)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    blindState: ").append(toIndentedString(blindState)).append("\n");
    sb.append("    blindStateLast: ").append(toIndentedString(blindStateLast)).append("\n");
    sb.append("    blindStateRequested: ").append(toIndentedString(blindStateRequested)).append("\n");
    sb.append("    brightnessState: ").append(toIndentedString(brightnessState)).append("\n");
    sb.append("    brightnessStateLast: ").append(toIndentedString(brightnessStateLast)).append("\n");
    sb.append("    brightnessStateRequested: ").append(toIndentedString(brightnessStateRequested)).append("\n");
    sb.append("    colorState: ").append(toIndentedString(colorState)).append("\n");
    sb.append("    colorStateLast: ").append(toIndentedString(colorStateLast)).append("\n");
    sb.append("    colorStateRequested: ").append(toIndentedString(colorStateRequested)).append("\n");
    sb.append("    emphasisState: ").append(toIndentedString(emphasisState)).append("\n");
    sb.append("    emphasisStateLast: ").append(toIndentedString(emphasisStateLast)).append("\n");
    sb.append("    emphasisStateRequested: ").append(toIndentedString(emphasisStateRequested)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    illuminanceState: ").append(toIndentedString(illuminanceState)).append("\n");
    sb.append("    illuminanceStateLast: ").append(toIndentedString(illuminanceStateLast)).append("\n");
    sb.append("    motionState: ").append(toIndentedString(motionState)).append("\n");
    sb.append("    motionStateLast: ").append(toIndentedString(motionStateLast)).append("\n");
    sb.append("    powerConsumptionState: ").append(toIndentedString(powerConsumptionState)).append("\n");
    sb.append("    powerConsumptionStateLast: ").append(toIndentedString(powerConsumptionStateLast)).append("\n");
    sb.append("    powerState: ").append(toIndentedString(powerState)).append("\n");
    sb.append("    powerStateLast: ").append(toIndentedString(powerStateLast)).append("\n");
    sb.append("    powerStateRequested: ").append(toIndentedString(powerStateRequested)).append("\n");
    sb.append("    presenceState: ").append(toIndentedString(presenceState)).append("\n");
    sb.append("    presenceStateLast: ").append(toIndentedString(presenceStateLast)).append("\n");
    sb.append("    smokeAlarmState: ").append(toIndentedString(smokeAlarmState)).append("\n");
    sb.append("    smokeAlarmStateLast: ").append(toIndentedString(smokeAlarmStateLast)).append("\n");
    sb.append("    smokeState: ").append(toIndentedString(smokeState)).append("\n");
    sb.append("    smokeStateLast: ").append(toIndentedString(smokeStateLast)).append("\n");
    sb.append("    standbyState: ").append(toIndentedString(standbyState)).append("\n");
    sb.append("    standbyStateLast: ").append(toIndentedString(standbyStateLast)).append("\n");
    sb.append("    standbyStateRequested: ").append(toIndentedString(standbyStateRequested)).append("\n");
    sb.append("    tamperState: ").append(toIndentedString(tamperState)).append("\n");
    sb.append("    tamperStateLast: ").append(toIndentedString(tamperStateLast)).append("\n");
    sb.append("    targetTemperatureState: ").append(toIndentedString(targetTemperatureState)).append("\n");
    sb.append("    targetTemperatureStateLast: ").append(toIndentedString(targetTemperatureStateLast)).append("\n");
    sb.append("    targetTemperatureStateRequested: ").append(toIndentedString(targetTemperatureStateRequested)).append("\n");
    sb.append("    temperatureAlarmState: ").append(toIndentedString(temperatureAlarmState)).append("\n");
    sb.append("    temperatureAlarmStateLast: ").append(toIndentedString(temperatureAlarmStateLast)).append("\n");
    sb.append("    temperatureState: ").append(toIndentedString(temperatureState)).append("\n");
    sb.append("    temperatureStateLast: ").append(toIndentedString(temperatureStateLast)).append("\n");
    sb.append("    temperatureStateRequested: ").append(toIndentedString(temperatureStateRequested)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

