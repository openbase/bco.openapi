package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseServiceStateDescription;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseSceneConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-29T22:47:43.327074+02:00[Europe/Berlin]")

public class OpenbaseSceneConfig   {
  @JsonProperty("optional_service_state_description")
  @Valid
  private List<OpenbaseServiceStateDescription> optionalServiceStateDescription = null;

  @JsonProperty("required_service_state_description")
  @Valid
  private List<OpenbaseServiceStateDescription> requiredServiceStateDescription = null;

  public OpenbaseSceneConfig optionalServiceStateDescription(List<OpenbaseServiceStateDescription> optionalServiceStateDescription) {
    this.optionalServiceStateDescription = optionalServiceStateDescription;
    return this;
  }

  public OpenbaseSceneConfig addOptionalServiceStateDescriptionItem(OpenbaseServiceStateDescription optionalServiceStateDescriptionItem) {
    if (this.optionalServiceStateDescription == null) {
      this.optionalServiceStateDescription = new ArrayList<>();
    }
    this.optionalServiceStateDescription.add(optionalServiceStateDescriptionItem);
    return this;
  }

  /**
   * Get optionalServiceStateDescription
   * @return optionalServiceStateDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseServiceStateDescription> getOptionalServiceStateDescription() {
    return optionalServiceStateDescription;
  }

  public void setOptionalServiceStateDescription(List<OpenbaseServiceStateDescription> optionalServiceStateDescription) {
    this.optionalServiceStateDescription = optionalServiceStateDescription;
  }

  public OpenbaseSceneConfig requiredServiceStateDescription(List<OpenbaseServiceStateDescription> requiredServiceStateDescription) {
    this.requiredServiceStateDescription = requiredServiceStateDescription;
    return this;
  }

  public OpenbaseSceneConfig addRequiredServiceStateDescriptionItem(OpenbaseServiceStateDescription requiredServiceStateDescriptionItem) {
    if (this.requiredServiceStateDescription == null) {
      this.requiredServiceStateDescription = new ArrayList<>();
    }
    this.requiredServiceStateDescription.add(requiredServiceStateDescriptionItem);
    return this;
  }

  /**
   * Get requiredServiceStateDescription
   * @return requiredServiceStateDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseServiceStateDescription> getRequiredServiceStateDescription() {
    return requiredServiceStateDescription;
  }

  public void setRequiredServiceStateDescription(List<OpenbaseServiceStateDescription> requiredServiceStateDescription) {
    this.requiredServiceStateDescription = requiredServiceStateDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseSceneConfig openbaseSceneConfig = (OpenbaseSceneConfig) o;
    return Objects.equals(this.optionalServiceStateDescription, openbaseSceneConfig.optionalServiceStateDescription) &&
        Objects.equals(this.requiredServiceStateDescription, openbaseSceneConfig.requiredServiceStateDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionalServiceStateDescription, requiredServiceStateDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseSceneConfig {\n");
    
    sb.append("    optionalServiceStateDescription: ").append(toIndentedString(optionalServiceStateDescription)).append("\n");
    sb.append("    requiredServiceStateDescription: ").append(toIndentedString(requiredServiceStateDescription)).append("\n");
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

