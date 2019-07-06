package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbasePointingRay3DFloatDistribution;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbasePointingRay3DFloatDistributionCollection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

public class OpenbasePointingRay3DFloatDistributionCollection   {
  @JsonProperty("element")
  @Valid
  private List<OpenbasePointingRay3DFloatDistribution> element = null;

  public OpenbasePointingRay3DFloatDistributionCollection element(List<OpenbasePointingRay3DFloatDistribution> element) {
    this.element = element;
    return this;
  }

  public OpenbasePointingRay3DFloatDistributionCollection addElementItem(OpenbasePointingRay3DFloatDistribution elementItem) {
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

  public List<OpenbasePointingRay3DFloatDistribution> getElement() {
    return element;
  }

  public void setElement(List<OpenbasePointingRay3DFloatDistribution> element) {
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
    OpenbasePointingRay3DFloatDistributionCollection openbasePointingRay3DFloatDistributionCollection = (OpenbasePointingRay3DFloatDistributionCollection) o;
    return Objects.equals(this.element, openbasePointingRay3DFloatDistributionCollection.element);
  }

  @Override
  public int hashCode() {
    return Objects.hash(element);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbasePointingRay3DFloatDistributionCollection {\n");
    
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

