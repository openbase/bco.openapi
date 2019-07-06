package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseRotation;
import io.swagger.model.OpenbaseTranslation;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbasePosture3DFloat
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbasePosture3DFloat   {
  @JsonProperty("name")
  @Valid
  private List<String> name = null;

  @JsonProperty("position")
  @Valid
  private List<OpenbaseTranslation> position = null;

  @JsonProperty("rotation")
  @Valid
  private List<OpenbaseRotation> rotation = null;

  public OpenbasePosture3DFloat name(List<String> name) {
    this.name = name;
    return this;
  }

  public OpenbasePosture3DFloat addNameItem(String nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<String>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")

  public List<String> getName() {
    return name;
  }

  public void setName(List<String> name) {
    this.name = name;
  }

  public OpenbasePosture3DFloat position(List<OpenbaseTranslation> position) {
    this.position = position;
    return this;
  }

  public OpenbasePosture3DFloat addPositionItem(OpenbaseTranslation positionItem) {
    if (this.position == null) {
      this.position = new ArrayList<OpenbaseTranslation>();
    }
    this.position.add(positionItem);
    return this;
  }

  /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbaseTranslation> getPosition() {
    return position;
  }

  public void setPosition(List<OpenbaseTranslation> position) {
    this.position = position;
  }

  public OpenbasePosture3DFloat rotation(List<OpenbaseRotation> rotation) {
    this.rotation = rotation;
    return this;
  }

  public OpenbasePosture3DFloat addRotationItem(OpenbaseRotation rotationItem) {
    if (this.rotation == null) {
      this.rotation = new ArrayList<OpenbaseRotation>();
    }
    this.rotation.add(rotationItem);
    return this;
  }

  /**
   * Get rotation
   * @return rotation
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbaseRotation> getRotation() {
    return rotation;
  }

  public void setRotation(List<OpenbaseRotation> rotation) {
    this.rotation = rotation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbasePosture3DFloat openbasePosture3DFloat = (OpenbasePosture3DFloat) o;
    return Objects.equals(this.name, openbasePosture3DFloat.name) &&
        Objects.equals(this.position, openbasePosture3DFloat.position) &&
        Objects.equals(this.rotation, openbasePosture3DFloat.rotation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, position, rotation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbasePosture3DFloat {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
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
