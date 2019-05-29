package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseScope
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-29T22:47:43.327074+02:00[Europe/Berlin]")

public class OpenbaseScope   {
  @JsonProperty("component")
  @Valid
  private List<String> component = null;

  public OpenbaseScope component(List<String> component) {
    this.component = component;
    return this;
  }

  public OpenbaseScope addComponentItem(String componentItem) {
    if (this.component == null) {
      this.component = new ArrayList<>();
    }
    this.component.add(componentItem);
    return this;
  }

  /**
   * Get component
   * @return component
  */
  @ApiModelProperty(value = "")


  public List<String> getComponent() {
    return component;
  }

  public void setComponent(List<String> component) {
    this.component = component;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseScope openbaseScope = (OpenbaseScope) o;
    return Objects.equals(this.component, openbaseScope.component);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseScope {\n");
    
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
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

