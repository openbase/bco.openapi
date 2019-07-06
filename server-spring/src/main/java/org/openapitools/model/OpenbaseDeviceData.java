package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseActionDescription;
import org.openapitools.model.OpenbaseAudioSourceData;
import org.openapitools.model.OpenbaseBatteryData;
import org.openapitools.model.OpenbaseButtonData;
import org.openapitools.model.OpenbaseColorableLightData;
import org.openapitools.model.OpenbaseDimmableLightData;
import org.openapitools.model.OpenbaseDimmerData;
import org.openapitools.model.OpenbaseDisplayData;
import org.openapitools.model.OpenbaseHandleData;
import org.openapitools.model.OpenbaseLightData;
import org.openapitools.model.OpenbaseLightSensorData;
import org.openapitools.model.OpenbaseMonitorData;
import org.openapitools.model.OpenbaseMotionDetectorData;
import org.openapitools.model.OpenbasePowerConsumptionSensorData;
import org.openapitools.model.OpenbasePowerSwitchData;
import org.openapitools.model.OpenbaseRFIDData;
import org.openapitools.model.OpenbaseReedContactData;
import org.openapitools.model.OpenbaseRollerShutterData;
import org.openapitools.model.OpenbaseSmokeDetectorData;
import org.openapitools.model.OpenbaseSwitchData;
import org.openapitools.model.OpenbaseTamperDetectorData;
import org.openapitools.model.OpenbaseTelevisionData;
import org.openapitools.model.OpenbaseTemperatureControllerData;
import org.openapitools.model.OpenbaseTemperatureSensorData;
import org.openapitools.model.OpenbaseVideoDepthSourceData;
import org.openapitools.model.OpenbaseVideoRgbSourceData;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseDeviceData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseDeviceData   {
  @JsonProperty("action")
  @Valid
  private List<OpenbaseActionDescription> action = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("id")
  private String id;

  @JsonProperty("transaction_id")
  private Long transactionId;

  @JsonProperty("unit_audio_source_data")
  @Valid
  private List<OpenbaseAudioSourceData> unitAudioSourceData = null;

  @JsonProperty("unit_battery_data")
  @Valid
  private List<OpenbaseBatteryData> unitBatteryData = null;

  @JsonProperty("unit_button_data")
  @Valid
  private List<OpenbaseButtonData> unitButtonData = null;

  @JsonProperty("unit_colorable_light_data")
  @Valid
  private List<OpenbaseColorableLightData> unitColorableLightData = null;

  @JsonProperty("unit_dimmable_light_data")
  @Valid
  private List<OpenbaseDimmableLightData> unitDimmableLightData = null;

  @JsonProperty("unit_dimmer_data")
  @Valid
  private List<OpenbaseDimmerData> unitDimmerData = null;

  @JsonProperty("unit_display_data")
  @Valid
  private List<OpenbaseDisplayData> unitDisplayData = null;

  @JsonProperty("unit_handle_data")
  @Valid
  private List<OpenbaseHandleData> unitHandleData = null;

  @JsonProperty("unit_light_data")
  @Valid
  private List<OpenbaseLightData> unitLightData = null;

  @JsonProperty("unit_light_sensor_data")
  @Valid
  private List<OpenbaseLightSensorData> unitLightSensorData = null;

  @JsonProperty("unit_monitor_data")
  @Valid
  private List<OpenbaseMonitorData> unitMonitorData = null;

  @JsonProperty("unit_motion_detector_data")
  @Valid
  private List<OpenbaseMotionDetectorData> unitMotionDetectorData = null;

  @JsonProperty("unit_power_consumption_sensor_data")
  @Valid
  private List<OpenbasePowerConsumptionSensorData> unitPowerConsumptionSensorData = null;

  @JsonProperty("unit_power_switch_data")
  @Valid
  private List<OpenbasePowerSwitchData> unitPowerSwitchData = null;

  @JsonProperty("unit_reed_contact_data")
  @Valid
  private List<OpenbaseReedContactData> unitReedContactData = null;

  @JsonProperty("unit_rfid_data")
  @Valid
  private List<OpenbaseRFIDData> unitRfidData = null;

  @JsonProperty("unit_roller_shutter_data")
  @Valid
  private List<OpenbaseRollerShutterData> unitRollerShutterData = null;

  @JsonProperty("unit_smoke_detector_data")
  @Valid
  private List<OpenbaseSmokeDetectorData> unitSmokeDetectorData = null;

  @JsonProperty("unit_switch_data")
  @Valid
  private List<OpenbaseSwitchData> unitSwitchData = null;

  @JsonProperty("unit_tamper_detector_data")
  @Valid
  private List<OpenbaseTamperDetectorData> unitTamperDetectorData = null;

  @JsonProperty("unit_television_data")
  @Valid
  private List<OpenbaseTelevisionData> unitTelevisionData = null;

  @JsonProperty("unit_temperature_controller_data")
  @Valid
  private List<OpenbaseTemperatureControllerData> unitTemperatureControllerData = null;

  @JsonProperty("unit_temperature_sensor_data")
  @Valid
  private List<OpenbaseTemperatureSensorData> unitTemperatureSensorData = null;

  @JsonProperty("unit_video_depth_source_data")
  @Valid
  private List<OpenbaseVideoDepthSourceData> unitVideoDepthSourceData = null;

  @JsonProperty("unit_video_rgb_source_data")
  @Valid
  private List<OpenbaseVideoRgbSourceData> unitVideoRgbSourceData = null;

  public OpenbaseDeviceData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbaseDeviceData addActionItem(OpenbaseActionDescription actionItem) {
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

  public OpenbaseDeviceData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseDeviceData addAliasItem(String aliasItem) {
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

  public OpenbaseDeviceData id(String id) {
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

  public OpenbaseDeviceData transactionId(Long transactionId) {
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

  public OpenbaseDeviceData unitAudioSourceData(List<OpenbaseAudioSourceData> unitAudioSourceData) {
    this.unitAudioSourceData = unitAudioSourceData;
    return this;
  }

  public OpenbaseDeviceData addUnitAudioSourceDataItem(OpenbaseAudioSourceData unitAudioSourceDataItem) {
    if (this.unitAudioSourceData == null) {
      this.unitAudioSourceData = new ArrayList<>();
    }
    this.unitAudioSourceData.add(unitAudioSourceDataItem);
    return this;
  }

  /**
   * Get unitAudioSourceData
   * @return unitAudioSourceData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseAudioSourceData> getUnitAudioSourceData() {
    return unitAudioSourceData;
  }

  public void setUnitAudioSourceData(List<OpenbaseAudioSourceData> unitAudioSourceData) {
    this.unitAudioSourceData = unitAudioSourceData;
  }

  public OpenbaseDeviceData unitBatteryData(List<OpenbaseBatteryData> unitBatteryData) {
    this.unitBatteryData = unitBatteryData;
    return this;
  }

  public OpenbaseDeviceData addUnitBatteryDataItem(OpenbaseBatteryData unitBatteryDataItem) {
    if (this.unitBatteryData == null) {
      this.unitBatteryData = new ArrayList<>();
    }
    this.unitBatteryData.add(unitBatteryDataItem);
    return this;
  }

  /**
   * Get unitBatteryData
   * @return unitBatteryData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseBatteryData> getUnitBatteryData() {
    return unitBatteryData;
  }

  public void setUnitBatteryData(List<OpenbaseBatteryData> unitBatteryData) {
    this.unitBatteryData = unitBatteryData;
  }

  public OpenbaseDeviceData unitButtonData(List<OpenbaseButtonData> unitButtonData) {
    this.unitButtonData = unitButtonData;
    return this;
  }

  public OpenbaseDeviceData addUnitButtonDataItem(OpenbaseButtonData unitButtonDataItem) {
    if (this.unitButtonData == null) {
      this.unitButtonData = new ArrayList<>();
    }
    this.unitButtonData.add(unitButtonDataItem);
    return this;
  }

  /**
   * Get unitButtonData
   * @return unitButtonData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseButtonData> getUnitButtonData() {
    return unitButtonData;
  }

  public void setUnitButtonData(List<OpenbaseButtonData> unitButtonData) {
    this.unitButtonData = unitButtonData;
  }

  public OpenbaseDeviceData unitColorableLightData(List<OpenbaseColorableLightData> unitColorableLightData) {
    this.unitColorableLightData = unitColorableLightData;
    return this;
  }

  public OpenbaseDeviceData addUnitColorableLightDataItem(OpenbaseColorableLightData unitColorableLightDataItem) {
    if (this.unitColorableLightData == null) {
      this.unitColorableLightData = new ArrayList<>();
    }
    this.unitColorableLightData.add(unitColorableLightDataItem);
    return this;
  }

  /**
   * Get unitColorableLightData
   * @return unitColorableLightData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseColorableLightData> getUnitColorableLightData() {
    return unitColorableLightData;
  }

  public void setUnitColorableLightData(List<OpenbaseColorableLightData> unitColorableLightData) {
    this.unitColorableLightData = unitColorableLightData;
  }

  public OpenbaseDeviceData unitDimmableLightData(List<OpenbaseDimmableLightData> unitDimmableLightData) {
    this.unitDimmableLightData = unitDimmableLightData;
    return this;
  }

  public OpenbaseDeviceData addUnitDimmableLightDataItem(OpenbaseDimmableLightData unitDimmableLightDataItem) {
    if (this.unitDimmableLightData == null) {
      this.unitDimmableLightData = new ArrayList<>();
    }
    this.unitDimmableLightData.add(unitDimmableLightDataItem);
    return this;
  }

  /**
   * Get unitDimmableLightData
   * @return unitDimmableLightData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseDimmableLightData> getUnitDimmableLightData() {
    return unitDimmableLightData;
  }

  public void setUnitDimmableLightData(List<OpenbaseDimmableLightData> unitDimmableLightData) {
    this.unitDimmableLightData = unitDimmableLightData;
  }

  public OpenbaseDeviceData unitDimmerData(List<OpenbaseDimmerData> unitDimmerData) {
    this.unitDimmerData = unitDimmerData;
    return this;
  }

  public OpenbaseDeviceData addUnitDimmerDataItem(OpenbaseDimmerData unitDimmerDataItem) {
    if (this.unitDimmerData == null) {
      this.unitDimmerData = new ArrayList<>();
    }
    this.unitDimmerData.add(unitDimmerDataItem);
    return this;
  }

  /**
   * Get unitDimmerData
   * @return unitDimmerData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseDimmerData> getUnitDimmerData() {
    return unitDimmerData;
  }

  public void setUnitDimmerData(List<OpenbaseDimmerData> unitDimmerData) {
    this.unitDimmerData = unitDimmerData;
  }

  public OpenbaseDeviceData unitDisplayData(List<OpenbaseDisplayData> unitDisplayData) {
    this.unitDisplayData = unitDisplayData;
    return this;
  }

  public OpenbaseDeviceData addUnitDisplayDataItem(OpenbaseDisplayData unitDisplayDataItem) {
    if (this.unitDisplayData == null) {
      this.unitDisplayData = new ArrayList<>();
    }
    this.unitDisplayData.add(unitDisplayDataItem);
    return this;
  }

  /**
   * Get unitDisplayData
   * @return unitDisplayData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseDisplayData> getUnitDisplayData() {
    return unitDisplayData;
  }

  public void setUnitDisplayData(List<OpenbaseDisplayData> unitDisplayData) {
    this.unitDisplayData = unitDisplayData;
  }

  public OpenbaseDeviceData unitHandleData(List<OpenbaseHandleData> unitHandleData) {
    this.unitHandleData = unitHandleData;
    return this;
  }

  public OpenbaseDeviceData addUnitHandleDataItem(OpenbaseHandleData unitHandleDataItem) {
    if (this.unitHandleData == null) {
      this.unitHandleData = new ArrayList<>();
    }
    this.unitHandleData.add(unitHandleDataItem);
    return this;
  }

  /**
   * Get unitHandleData
   * @return unitHandleData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseHandleData> getUnitHandleData() {
    return unitHandleData;
  }

  public void setUnitHandleData(List<OpenbaseHandleData> unitHandleData) {
    this.unitHandleData = unitHandleData;
  }

  public OpenbaseDeviceData unitLightData(List<OpenbaseLightData> unitLightData) {
    this.unitLightData = unitLightData;
    return this;
  }

  public OpenbaseDeviceData addUnitLightDataItem(OpenbaseLightData unitLightDataItem) {
    if (this.unitLightData == null) {
      this.unitLightData = new ArrayList<>();
    }
    this.unitLightData.add(unitLightDataItem);
    return this;
  }

  /**
   * Get unitLightData
   * @return unitLightData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseLightData> getUnitLightData() {
    return unitLightData;
  }

  public void setUnitLightData(List<OpenbaseLightData> unitLightData) {
    this.unitLightData = unitLightData;
  }

  public OpenbaseDeviceData unitLightSensorData(List<OpenbaseLightSensorData> unitLightSensorData) {
    this.unitLightSensorData = unitLightSensorData;
    return this;
  }

  public OpenbaseDeviceData addUnitLightSensorDataItem(OpenbaseLightSensorData unitLightSensorDataItem) {
    if (this.unitLightSensorData == null) {
      this.unitLightSensorData = new ArrayList<>();
    }
    this.unitLightSensorData.add(unitLightSensorDataItem);
    return this;
  }

  /**
   * Get unitLightSensorData
   * @return unitLightSensorData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseLightSensorData> getUnitLightSensorData() {
    return unitLightSensorData;
  }

  public void setUnitLightSensorData(List<OpenbaseLightSensorData> unitLightSensorData) {
    this.unitLightSensorData = unitLightSensorData;
  }

  public OpenbaseDeviceData unitMonitorData(List<OpenbaseMonitorData> unitMonitorData) {
    this.unitMonitorData = unitMonitorData;
    return this;
  }

  public OpenbaseDeviceData addUnitMonitorDataItem(OpenbaseMonitorData unitMonitorDataItem) {
    if (this.unitMonitorData == null) {
      this.unitMonitorData = new ArrayList<>();
    }
    this.unitMonitorData.add(unitMonitorDataItem);
    return this;
  }

  /**
   * Get unitMonitorData
   * @return unitMonitorData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseMonitorData> getUnitMonitorData() {
    return unitMonitorData;
  }

  public void setUnitMonitorData(List<OpenbaseMonitorData> unitMonitorData) {
    this.unitMonitorData = unitMonitorData;
  }

  public OpenbaseDeviceData unitMotionDetectorData(List<OpenbaseMotionDetectorData> unitMotionDetectorData) {
    this.unitMotionDetectorData = unitMotionDetectorData;
    return this;
  }

  public OpenbaseDeviceData addUnitMotionDetectorDataItem(OpenbaseMotionDetectorData unitMotionDetectorDataItem) {
    if (this.unitMotionDetectorData == null) {
      this.unitMotionDetectorData = new ArrayList<>();
    }
    this.unitMotionDetectorData.add(unitMotionDetectorDataItem);
    return this;
  }

  /**
   * Get unitMotionDetectorData
   * @return unitMotionDetectorData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseMotionDetectorData> getUnitMotionDetectorData() {
    return unitMotionDetectorData;
  }

  public void setUnitMotionDetectorData(List<OpenbaseMotionDetectorData> unitMotionDetectorData) {
    this.unitMotionDetectorData = unitMotionDetectorData;
  }

  public OpenbaseDeviceData unitPowerConsumptionSensorData(List<OpenbasePowerConsumptionSensorData> unitPowerConsumptionSensorData) {
    this.unitPowerConsumptionSensorData = unitPowerConsumptionSensorData;
    return this;
  }

  public OpenbaseDeviceData addUnitPowerConsumptionSensorDataItem(OpenbasePowerConsumptionSensorData unitPowerConsumptionSensorDataItem) {
    if (this.unitPowerConsumptionSensorData == null) {
      this.unitPowerConsumptionSensorData = new ArrayList<>();
    }
    this.unitPowerConsumptionSensorData.add(unitPowerConsumptionSensorDataItem);
    return this;
  }

  /**
   * Get unitPowerConsumptionSensorData
   * @return unitPowerConsumptionSensorData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbasePowerConsumptionSensorData> getUnitPowerConsumptionSensorData() {
    return unitPowerConsumptionSensorData;
  }

  public void setUnitPowerConsumptionSensorData(List<OpenbasePowerConsumptionSensorData> unitPowerConsumptionSensorData) {
    this.unitPowerConsumptionSensorData = unitPowerConsumptionSensorData;
  }

  public OpenbaseDeviceData unitPowerSwitchData(List<OpenbasePowerSwitchData> unitPowerSwitchData) {
    this.unitPowerSwitchData = unitPowerSwitchData;
    return this;
  }

  public OpenbaseDeviceData addUnitPowerSwitchDataItem(OpenbasePowerSwitchData unitPowerSwitchDataItem) {
    if (this.unitPowerSwitchData == null) {
      this.unitPowerSwitchData = new ArrayList<>();
    }
    this.unitPowerSwitchData.add(unitPowerSwitchDataItem);
    return this;
  }

  /**
   * Get unitPowerSwitchData
   * @return unitPowerSwitchData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbasePowerSwitchData> getUnitPowerSwitchData() {
    return unitPowerSwitchData;
  }

  public void setUnitPowerSwitchData(List<OpenbasePowerSwitchData> unitPowerSwitchData) {
    this.unitPowerSwitchData = unitPowerSwitchData;
  }

  public OpenbaseDeviceData unitReedContactData(List<OpenbaseReedContactData> unitReedContactData) {
    this.unitReedContactData = unitReedContactData;
    return this;
  }

  public OpenbaseDeviceData addUnitReedContactDataItem(OpenbaseReedContactData unitReedContactDataItem) {
    if (this.unitReedContactData == null) {
      this.unitReedContactData = new ArrayList<>();
    }
    this.unitReedContactData.add(unitReedContactDataItem);
    return this;
  }

  /**
   * Get unitReedContactData
   * @return unitReedContactData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseReedContactData> getUnitReedContactData() {
    return unitReedContactData;
  }

  public void setUnitReedContactData(List<OpenbaseReedContactData> unitReedContactData) {
    this.unitReedContactData = unitReedContactData;
  }

  public OpenbaseDeviceData unitRfidData(List<OpenbaseRFIDData> unitRfidData) {
    this.unitRfidData = unitRfidData;
    return this;
  }

  public OpenbaseDeviceData addUnitRfidDataItem(OpenbaseRFIDData unitRfidDataItem) {
    if (this.unitRfidData == null) {
      this.unitRfidData = new ArrayList<>();
    }
    this.unitRfidData.add(unitRfidDataItem);
    return this;
  }

  /**
   * Get unitRfidData
   * @return unitRfidData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseRFIDData> getUnitRfidData() {
    return unitRfidData;
  }

  public void setUnitRfidData(List<OpenbaseRFIDData> unitRfidData) {
    this.unitRfidData = unitRfidData;
  }

  public OpenbaseDeviceData unitRollerShutterData(List<OpenbaseRollerShutterData> unitRollerShutterData) {
    this.unitRollerShutterData = unitRollerShutterData;
    return this;
  }

  public OpenbaseDeviceData addUnitRollerShutterDataItem(OpenbaseRollerShutterData unitRollerShutterDataItem) {
    if (this.unitRollerShutterData == null) {
      this.unitRollerShutterData = new ArrayList<>();
    }
    this.unitRollerShutterData.add(unitRollerShutterDataItem);
    return this;
  }

  /**
   * Get unitRollerShutterData
   * @return unitRollerShutterData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseRollerShutterData> getUnitRollerShutterData() {
    return unitRollerShutterData;
  }

  public void setUnitRollerShutterData(List<OpenbaseRollerShutterData> unitRollerShutterData) {
    this.unitRollerShutterData = unitRollerShutterData;
  }

  public OpenbaseDeviceData unitSmokeDetectorData(List<OpenbaseSmokeDetectorData> unitSmokeDetectorData) {
    this.unitSmokeDetectorData = unitSmokeDetectorData;
    return this;
  }

  public OpenbaseDeviceData addUnitSmokeDetectorDataItem(OpenbaseSmokeDetectorData unitSmokeDetectorDataItem) {
    if (this.unitSmokeDetectorData == null) {
      this.unitSmokeDetectorData = new ArrayList<>();
    }
    this.unitSmokeDetectorData.add(unitSmokeDetectorDataItem);
    return this;
  }

  /**
   * Get unitSmokeDetectorData
   * @return unitSmokeDetectorData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseSmokeDetectorData> getUnitSmokeDetectorData() {
    return unitSmokeDetectorData;
  }

  public void setUnitSmokeDetectorData(List<OpenbaseSmokeDetectorData> unitSmokeDetectorData) {
    this.unitSmokeDetectorData = unitSmokeDetectorData;
  }

  public OpenbaseDeviceData unitSwitchData(List<OpenbaseSwitchData> unitSwitchData) {
    this.unitSwitchData = unitSwitchData;
    return this;
  }

  public OpenbaseDeviceData addUnitSwitchDataItem(OpenbaseSwitchData unitSwitchDataItem) {
    if (this.unitSwitchData == null) {
      this.unitSwitchData = new ArrayList<>();
    }
    this.unitSwitchData.add(unitSwitchDataItem);
    return this;
  }

  /**
   * Get unitSwitchData
   * @return unitSwitchData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseSwitchData> getUnitSwitchData() {
    return unitSwitchData;
  }

  public void setUnitSwitchData(List<OpenbaseSwitchData> unitSwitchData) {
    this.unitSwitchData = unitSwitchData;
  }

  public OpenbaseDeviceData unitTamperDetectorData(List<OpenbaseTamperDetectorData> unitTamperDetectorData) {
    this.unitTamperDetectorData = unitTamperDetectorData;
    return this;
  }

  public OpenbaseDeviceData addUnitTamperDetectorDataItem(OpenbaseTamperDetectorData unitTamperDetectorDataItem) {
    if (this.unitTamperDetectorData == null) {
      this.unitTamperDetectorData = new ArrayList<>();
    }
    this.unitTamperDetectorData.add(unitTamperDetectorDataItem);
    return this;
  }

  /**
   * Get unitTamperDetectorData
   * @return unitTamperDetectorData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseTamperDetectorData> getUnitTamperDetectorData() {
    return unitTamperDetectorData;
  }

  public void setUnitTamperDetectorData(List<OpenbaseTamperDetectorData> unitTamperDetectorData) {
    this.unitTamperDetectorData = unitTamperDetectorData;
  }

  public OpenbaseDeviceData unitTelevisionData(List<OpenbaseTelevisionData> unitTelevisionData) {
    this.unitTelevisionData = unitTelevisionData;
    return this;
  }

  public OpenbaseDeviceData addUnitTelevisionDataItem(OpenbaseTelevisionData unitTelevisionDataItem) {
    if (this.unitTelevisionData == null) {
      this.unitTelevisionData = new ArrayList<>();
    }
    this.unitTelevisionData.add(unitTelevisionDataItem);
    return this;
  }

  /**
   * Get unitTelevisionData
   * @return unitTelevisionData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseTelevisionData> getUnitTelevisionData() {
    return unitTelevisionData;
  }

  public void setUnitTelevisionData(List<OpenbaseTelevisionData> unitTelevisionData) {
    this.unitTelevisionData = unitTelevisionData;
  }

  public OpenbaseDeviceData unitTemperatureControllerData(List<OpenbaseTemperatureControllerData> unitTemperatureControllerData) {
    this.unitTemperatureControllerData = unitTemperatureControllerData;
    return this;
  }

  public OpenbaseDeviceData addUnitTemperatureControllerDataItem(OpenbaseTemperatureControllerData unitTemperatureControllerDataItem) {
    if (this.unitTemperatureControllerData == null) {
      this.unitTemperatureControllerData = new ArrayList<>();
    }
    this.unitTemperatureControllerData.add(unitTemperatureControllerDataItem);
    return this;
  }

  /**
   * Get unitTemperatureControllerData
   * @return unitTemperatureControllerData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseTemperatureControllerData> getUnitTemperatureControllerData() {
    return unitTemperatureControllerData;
  }

  public void setUnitTemperatureControllerData(List<OpenbaseTemperatureControllerData> unitTemperatureControllerData) {
    this.unitTemperatureControllerData = unitTemperatureControllerData;
  }

  public OpenbaseDeviceData unitTemperatureSensorData(List<OpenbaseTemperatureSensorData> unitTemperatureSensorData) {
    this.unitTemperatureSensorData = unitTemperatureSensorData;
    return this;
  }

  public OpenbaseDeviceData addUnitTemperatureSensorDataItem(OpenbaseTemperatureSensorData unitTemperatureSensorDataItem) {
    if (this.unitTemperatureSensorData == null) {
      this.unitTemperatureSensorData = new ArrayList<>();
    }
    this.unitTemperatureSensorData.add(unitTemperatureSensorDataItem);
    return this;
  }

  /**
   * Get unitTemperatureSensorData
   * @return unitTemperatureSensorData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseTemperatureSensorData> getUnitTemperatureSensorData() {
    return unitTemperatureSensorData;
  }

  public void setUnitTemperatureSensorData(List<OpenbaseTemperatureSensorData> unitTemperatureSensorData) {
    this.unitTemperatureSensorData = unitTemperatureSensorData;
  }

  public OpenbaseDeviceData unitVideoDepthSourceData(List<OpenbaseVideoDepthSourceData> unitVideoDepthSourceData) {
    this.unitVideoDepthSourceData = unitVideoDepthSourceData;
    return this;
  }

  public OpenbaseDeviceData addUnitVideoDepthSourceDataItem(OpenbaseVideoDepthSourceData unitVideoDepthSourceDataItem) {
    if (this.unitVideoDepthSourceData == null) {
      this.unitVideoDepthSourceData = new ArrayList<>();
    }
    this.unitVideoDepthSourceData.add(unitVideoDepthSourceDataItem);
    return this;
  }

  /**
   * Get unitVideoDepthSourceData
   * @return unitVideoDepthSourceData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseVideoDepthSourceData> getUnitVideoDepthSourceData() {
    return unitVideoDepthSourceData;
  }

  public void setUnitVideoDepthSourceData(List<OpenbaseVideoDepthSourceData> unitVideoDepthSourceData) {
    this.unitVideoDepthSourceData = unitVideoDepthSourceData;
  }

  public OpenbaseDeviceData unitVideoRgbSourceData(List<OpenbaseVideoRgbSourceData> unitVideoRgbSourceData) {
    this.unitVideoRgbSourceData = unitVideoRgbSourceData;
    return this;
  }

  public OpenbaseDeviceData addUnitVideoRgbSourceDataItem(OpenbaseVideoRgbSourceData unitVideoRgbSourceDataItem) {
    if (this.unitVideoRgbSourceData == null) {
      this.unitVideoRgbSourceData = new ArrayList<>();
    }
    this.unitVideoRgbSourceData.add(unitVideoRgbSourceDataItem);
    return this;
  }

  /**
   * Get unitVideoRgbSourceData
   * @return unitVideoRgbSourceData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseVideoRgbSourceData> getUnitVideoRgbSourceData() {
    return unitVideoRgbSourceData;
  }

  public void setUnitVideoRgbSourceData(List<OpenbaseVideoRgbSourceData> unitVideoRgbSourceData) {
    this.unitVideoRgbSourceData = unitVideoRgbSourceData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseDeviceData openbaseDeviceData = (OpenbaseDeviceData) o;
    return Objects.equals(this.action, openbaseDeviceData.action) &&
        Objects.equals(this.alias, openbaseDeviceData.alias) &&
        Objects.equals(this.id, openbaseDeviceData.id) &&
        Objects.equals(this.transactionId, openbaseDeviceData.transactionId) &&
        Objects.equals(this.unitAudioSourceData, openbaseDeviceData.unitAudioSourceData) &&
        Objects.equals(this.unitBatteryData, openbaseDeviceData.unitBatteryData) &&
        Objects.equals(this.unitButtonData, openbaseDeviceData.unitButtonData) &&
        Objects.equals(this.unitColorableLightData, openbaseDeviceData.unitColorableLightData) &&
        Objects.equals(this.unitDimmableLightData, openbaseDeviceData.unitDimmableLightData) &&
        Objects.equals(this.unitDimmerData, openbaseDeviceData.unitDimmerData) &&
        Objects.equals(this.unitDisplayData, openbaseDeviceData.unitDisplayData) &&
        Objects.equals(this.unitHandleData, openbaseDeviceData.unitHandleData) &&
        Objects.equals(this.unitLightData, openbaseDeviceData.unitLightData) &&
        Objects.equals(this.unitLightSensorData, openbaseDeviceData.unitLightSensorData) &&
        Objects.equals(this.unitMonitorData, openbaseDeviceData.unitMonitorData) &&
        Objects.equals(this.unitMotionDetectorData, openbaseDeviceData.unitMotionDetectorData) &&
        Objects.equals(this.unitPowerConsumptionSensorData, openbaseDeviceData.unitPowerConsumptionSensorData) &&
        Objects.equals(this.unitPowerSwitchData, openbaseDeviceData.unitPowerSwitchData) &&
        Objects.equals(this.unitReedContactData, openbaseDeviceData.unitReedContactData) &&
        Objects.equals(this.unitRfidData, openbaseDeviceData.unitRfidData) &&
        Objects.equals(this.unitRollerShutterData, openbaseDeviceData.unitRollerShutterData) &&
        Objects.equals(this.unitSmokeDetectorData, openbaseDeviceData.unitSmokeDetectorData) &&
        Objects.equals(this.unitSwitchData, openbaseDeviceData.unitSwitchData) &&
        Objects.equals(this.unitTamperDetectorData, openbaseDeviceData.unitTamperDetectorData) &&
        Objects.equals(this.unitTelevisionData, openbaseDeviceData.unitTelevisionData) &&
        Objects.equals(this.unitTemperatureControllerData, openbaseDeviceData.unitTemperatureControllerData) &&
        Objects.equals(this.unitTemperatureSensorData, openbaseDeviceData.unitTemperatureSensorData) &&
        Objects.equals(this.unitVideoDepthSourceData, openbaseDeviceData.unitVideoDepthSourceData) &&
        Objects.equals(this.unitVideoRgbSourceData, openbaseDeviceData.unitVideoRgbSourceData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, alias, id, transactionId, unitAudioSourceData, unitBatteryData, unitButtonData, unitColorableLightData, unitDimmableLightData, unitDimmerData, unitDisplayData, unitHandleData, unitLightData, unitLightSensorData, unitMonitorData, unitMotionDetectorData, unitPowerConsumptionSensorData, unitPowerSwitchData, unitReedContactData, unitRfidData, unitRollerShutterData, unitSmokeDetectorData, unitSwitchData, unitTamperDetectorData, unitTelevisionData, unitTemperatureControllerData, unitTemperatureSensorData, unitVideoDepthSourceData, unitVideoRgbSourceData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseDeviceData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    unitAudioSourceData: ").append(toIndentedString(unitAudioSourceData)).append("\n");
    sb.append("    unitBatteryData: ").append(toIndentedString(unitBatteryData)).append("\n");
    sb.append("    unitButtonData: ").append(toIndentedString(unitButtonData)).append("\n");
    sb.append("    unitColorableLightData: ").append(toIndentedString(unitColorableLightData)).append("\n");
    sb.append("    unitDimmableLightData: ").append(toIndentedString(unitDimmableLightData)).append("\n");
    sb.append("    unitDimmerData: ").append(toIndentedString(unitDimmerData)).append("\n");
    sb.append("    unitDisplayData: ").append(toIndentedString(unitDisplayData)).append("\n");
    sb.append("    unitHandleData: ").append(toIndentedString(unitHandleData)).append("\n");
    sb.append("    unitLightData: ").append(toIndentedString(unitLightData)).append("\n");
    sb.append("    unitLightSensorData: ").append(toIndentedString(unitLightSensorData)).append("\n");
    sb.append("    unitMonitorData: ").append(toIndentedString(unitMonitorData)).append("\n");
    sb.append("    unitMotionDetectorData: ").append(toIndentedString(unitMotionDetectorData)).append("\n");
    sb.append("    unitPowerConsumptionSensorData: ").append(toIndentedString(unitPowerConsumptionSensorData)).append("\n");
    sb.append("    unitPowerSwitchData: ").append(toIndentedString(unitPowerSwitchData)).append("\n");
    sb.append("    unitReedContactData: ").append(toIndentedString(unitReedContactData)).append("\n");
    sb.append("    unitRfidData: ").append(toIndentedString(unitRfidData)).append("\n");
    sb.append("    unitRollerShutterData: ").append(toIndentedString(unitRollerShutterData)).append("\n");
    sb.append("    unitSmokeDetectorData: ").append(toIndentedString(unitSmokeDetectorData)).append("\n");
    sb.append("    unitSwitchData: ").append(toIndentedString(unitSwitchData)).append("\n");
    sb.append("    unitTamperDetectorData: ").append(toIndentedString(unitTamperDetectorData)).append("\n");
    sb.append("    unitTelevisionData: ").append(toIndentedString(unitTelevisionData)).append("\n");
    sb.append("    unitTemperatureControllerData: ").append(toIndentedString(unitTemperatureControllerData)).append("\n");
    sb.append("    unitTemperatureSensorData: ").append(toIndentedString(unitTemperatureSensorData)).append("\n");
    sb.append("    unitVideoDepthSourceData: ").append(toIndentedString(unitVideoDepthSourceData)).append("\n");
    sb.append("    unitVideoRgbSourceData: ").append(toIndentedString(unitVideoRgbSourceData)).append("\n");
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

