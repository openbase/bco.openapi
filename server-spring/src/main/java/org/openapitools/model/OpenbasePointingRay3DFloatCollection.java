package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbasePointingRay3DFloat;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbasePointingRay3DFloatCollection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbasePointingRay3DFloatCollection   {
  @JsonProperty("element")
  @Valid
  private List<OpenbasePointingRay3DFloat> element = null;

  public OpenbasePointingRay3DFloatCollection element(List<OpenbasePointingRay3DFloat> element) {
    this.element = element;
    return this;
  }

  public OpenbasePointingRay3DFloatCollection addElementItem(OpenbasePointingRay3DFloat elementItem) {
    if (this.element == null) {
      this.element = new ArrayList<>();
    }
    this.element.add(elementItem);
    return this;
  }

  /**
   * Get element
   * @return element
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbasePointingRay3DFloat> getElement() {
    return element;
  }

  public void setElement(List<OpenbasePointingRay3DFloat> element) {
    this.element = element;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbasePointingRay3DFloatCollection openbasePointingRay3DFloatCollection = (OpenbasePointingRay3DFloatCollection) o;
    return Objects.equals(this.element, openbasePointingRay3DFloatCollection.element);
  }

  @Override
  public int hashCode() {
    return Objects.hash(element);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbasePointingRay3DFloatCollection {\n");
    
    sb.append("    element: ").append(toIndentedString(element)).append("\n");
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

