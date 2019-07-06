package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseUnitProbability
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbaseUnitProbability   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("probability")
  private Float probability;

  public OpenbaseUnitProbability id(String id) {
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

  public OpenbaseUnitProbability probability(Float probability) {
    this.probability = probability;
    return this;
  }

  /**
   * Get probability
   * @return probability
  */
  @ApiModelProperty(value = "")


  public Float getProbability() {
    return probability;
  }

  public void setProbability(Float probability) {
    this.probability = probability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseUnitProbability openbaseUnitProbability = (OpenbaseUnitProbability) o;
    return Objects.equals(this.id, openbaseUnitProbability.id) &&
        Objects.equals(this.probability, openbaseUnitProbability.probability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, probability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseUnitProbability {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
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

