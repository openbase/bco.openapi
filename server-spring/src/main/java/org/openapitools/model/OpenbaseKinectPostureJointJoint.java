package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseKinectPostureJoint.Joint
 */
public enum OpenbaseKinectPostureJointJoint {
  
  SPINE_BASE("SPINE_BASE"),
  
  SPINE_MID("SPINE_MID"),
  
  NECK("NECK"),
  
  HEAD("HEAD"),
  
  SHOULDER_LEFT("SHOULDER_LEFT"),
  
  ELBOW_LEFT("ELBOW_LEFT"),
  
  WRIST_LEFT("WRIST_LEFT"),
  
  HAND_LEFT("HAND_LEFT"),
  
  SHOULDER_RIGHT("SHOULDER_RIGHT"),
  
  ELBOW_RIGHT("ELBOW_RIGHT"),
  
  WRIST_RIGHT("WRIST_RIGHT"),
  
  HAND_RIGHT("HAND_RIGHT"),
  
  HIP_LEFT("HIP_LEFT"),
  
  KNEE_LEFT("KNEE_LEFT"),
  
  ANKLE_LEFT("ANKLE_LEFT"),
  
  FOOT_LEFT("FOOT_LEFT"),
  
  HIP_RIGHT("HIP_RIGHT"),
  
  KNEE_RIGHT("KNEE_RIGHT"),
  
  ANKLE_RIGHT("ANKLE_RIGHT"),
  
  FOOT_RIGHT("FOOT_RIGHT"),
  
  SPINE_SHOULDER("SPINE_SHOULDER"),
  
  HAND_TIP_LEFT("HAND_TIP_LEFT"),
  
  THUMB_LEFT("THUMB_LEFT"),
  
  HAND_TIP_RIGHT("HAND_TIP_RIGHT"),
  
  THUMB_RIGHT("THUMB_RIGHT");

  private String value;

  OpenbaseKinectPostureJointJoint(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseKinectPostureJointJoint fromValue(String value) {
    for (OpenbaseKinectPostureJointJoint b : OpenbaseKinectPostureJointJoint.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

