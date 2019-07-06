package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseServiceTemplate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegistryTemplateContainsServiceTemplateValues
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T12:28:09.254670+02:00[Europe/Berlin]")

public class RegistryTemplateContainsServiceTemplateValues   {
  @JsonProperty("valueType")
  private String valueType;

  @JsonProperty("value")
  private OpenbaseServiceTemplate value = null;

  public RegistryTemplateContainsServiceTemplateValues valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * Get valueType
   * @return valueType
  */
  @ApiModelProperty(value = "")


  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  public RegistryTemplateContainsServiceTemplateValues value(OpenbaseServiceTemplate value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseServiceTemplate getValue() {
    return value;
  }

  public void setValue(OpenbaseServiceTemplate value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistryTemplateContainsServiceTemplateValues registryTemplateContainsServiceTemplateValues = (RegistryTemplateContainsServiceTemplateValues) o;
    return Objects.equals(this.valueType, registryTemplateContainsServiceTemplateValues.valueType) &&
        Objects.equals(this.value, registryTemplateContainsServiceTemplateValues.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valueType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistryTemplateContainsServiceTemplateValues {\n");
    
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

