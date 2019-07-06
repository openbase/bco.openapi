package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseRotation;
import io.swagger.model.OpenbaseTranslation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbasePose
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbasePose   {
  @JsonProperty("rotation")
  private OpenbaseRotation rotation = null;

  @JsonProperty("translation")
  private OpenbaseTranslation translation = null;

  public OpenbasePose rotation(OpenbaseRotation rotation) {
    this.rotation = rotation;
    return this;
  }

  /**
   * Get rotation
   * @return rotation
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseRotation getRotation() {
    return rotation;
  }

  public void setRotation(OpenbaseRotation rotation) {
    this.rotation = rotation;
  }

  public OpenbasePose translation(OpenbaseTranslation translation) {
    this.translation = translation;
    return this;
  }

  /**
   * Get translation
   * @return translation
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseTranslation getTranslation() {
    return translation;
  }

  public void setTranslation(OpenbaseTranslation translation) {
    this.translation = translation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbasePose openbasePose = (OpenbasePose) o;
    return Objects.equals(this.rotation, openbasePose.rotation) &&
        Objects.equals(this.translation, openbasePose.translation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rotation, translation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbasePose {\n");
    
    sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
    sb.append("    translation: ").append(toIndentedString(translation)).append("\n");
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
