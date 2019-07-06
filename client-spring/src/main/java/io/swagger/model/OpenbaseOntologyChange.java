package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseOntologyChangeCategory;
import io.swagger.model.OpenbaseServiceTemplateServiceType;
import io.swagger.model.OpenbaseUnitTemplateUnitType;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseOntologyChange
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseOntologyChange   {
  @JsonProperty("category")
  @Valid
  private List<OpenbaseOntologyChangeCategory> category = null;

  @JsonProperty("service_type")
  @Valid
  private List<OpenbaseServiceTemplateServiceType> serviceType = null;

  @JsonProperty("unit_type")
  @Valid
  private List<OpenbaseUnitTemplateUnitType> unitType = null;

  public OpenbaseOntologyChange category(List<OpenbaseOntologyChangeCategory> category) {
    this.category = category;
    return this;
  }

  public OpenbaseOntologyChange addCategoryItem(OpenbaseOntologyChangeCategory categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<OpenbaseOntologyChangeCategory>();
    }
    this.category.add(categoryItem);
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbaseOntologyChangeCategory> getCategory() {
    return category;
  }

  public void setCategory(List<OpenbaseOntologyChangeCategory> category) {
    this.category = category;
  }

  public OpenbaseOntologyChange serviceType(List<OpenbaseServiceTemplateServiceType> serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  public OpenbaseOntologyChange addServiceTypeItem(OpenbaseServiceTemplateServiceType serviceTypeItem) {
    if (this.serviceType == null) {
      this.serviceType = new ArrayList<OpenbaseServiceTemplateServiceType>();
    }
    this.serviceType.add(serviceTypeItem);
    return this;
  }

  /**
   * Get serviceType
   * @return serviceType
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbaseServiceTemplateServiceType> getServiceType() {
    return serviceType;
  }

  public void setServiceType(List<OpenbaseServiceTemplateServiceType> serviceType) {
    this.serviceType = serviceType;
  }

  public OpenbaseOntologyChange unitType(List<OpenbaseUnitTemplateUnitType> unitType) {
    this.unitType = unitType;
    return this;
  }

  public OpenbaseOntologyChange addUnitTypeItem(OpenbaseUnitTemplateUnitType unitTypeItem) {
    if (this.unitType == null) {
      this.unitType = new ArrayList<OpenbaseUnitTemplateUnitType>();
    }
    this.unitType.add(unitTypeItem);
    return this;
  }

  /**
   * Get unitType
   * @return unitType
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbaseUnitTemplateUnitType> getUnitType() {
    return unitType;
  }

  public void setUnitType(List<OpenbaseUnitTemplateUnitType> unitType) {
    this.unitType = unitType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseOntologyChange openbaseOntologyChange = (OpenbaseOntologyChange) o;
    return Objects.equals(this.category, openbaseOntologyChange.category) &&
        Objects.equals(this.serviceType, openbaseOntologyChange.serviceType) &&
        Objects.equals(this.unitType, openbaseOntologyChange.unitType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, serviceType, unitType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseOntologyChange {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
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
