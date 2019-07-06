package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbasePosture3DFloat;
import io.swagger.model.OpenbaseTrackingInfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseTrackedPosture3DFloat
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseTrackedPosture3DFloat   {
  @JsonProperty("confidence")
  @Valid
  private List<Float> confidence = null;

  @JsonProperty("info")
  private OpenbaseTrackingInfo info = null;

  @JsonProperty("posture")
  private OpenbasePosture3DFloat posture = null;

  public OpenbaseTrackedPosture3DFloat confidence(List<Float> confidence) {
    this.confidence = confidence;
    return this;
  }

  public OpenbaseTrackedPosture3DFloat addConfidenceItem(Float confidenceItem) {
    if (this.confidence == null) {
      this.confidence = new ArrayList<Float>();
    }
    this.confidence.add(confidenceItem);
    return this;
  }

  /**
   * Get confidence
   * @return confidence
  **/
  @ApiModelProperty(value = "")

  public List<Float> getConfidence() {
    return confidence;
  }

  public void setConfidence(List<Float> confidence) {
    this.confidence = confidence;
  }

  public OpenbaseTrackedPosture3DFloat info(OpenbaseTrackingInfo info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseTrackingInfo getInfo() {
    return info;
  }

  public void setInfo(OpenbaseTrackingInfo info) {
    this.info = info;
  }

  public OpenbaseTrackedPosture3DFloat posture(OpenbasePosture3DFloat posture) {
    this.posture = posture;
    return this;
  }

  /**
   * Get posture
   * @return posture
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbasePosture3DFloat getPosture() {
    return posture;
  }

  public void setPosture(OpenbasePosture3DFloat posture) {
    this.posture = posture;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseTrackedPosture3DFloat openbaseTrackedPosture3DFloat = (OpenbaseTrackedPosture3DFloat) o;
    return Objects.equals(this.confidence, openbaseTrackedPosture3DFloat.confidence) &&
        Objects.equals(this.info, openbaseTrackedPosture3DFloat.info) &&
        Objects.equals(this.posture, openbaseTrackedPosture3DFloat.posture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidence, info, posture);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseTrackedPosture3DFloat {\n");
    
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    posture: ").append(toIndentedString(posture)).append("\n");
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
