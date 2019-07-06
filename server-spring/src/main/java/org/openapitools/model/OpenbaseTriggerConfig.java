package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenbaseOntologyChange;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseTriggerConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

public class OpenbaseTriggerConfig   {
  @JsonProperty("depending_ontology_change")
  private OpenbaseOntologyChange dependingOntologyChange = null;

  @JsonProperty("label")
  private String label;

  @JsonProperty("query")
  private String query;

  public OpenbaseTriggerConfig dependingOntologyChange(OpenbaseOntologyChange dependingOntologyChange) {
    this.dependingOntologyChange = dependingOntologyChange;
    return this;
  }

  /**
   * Get dependingOntologyChange
   * @return dependingOntologyChange
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseOntologyChange getDependingOntologyChange() {
    return dependingOntologyChange;
  }

  public void setDependingOntologyChange(OpenbaseOntologyChange dependingOntologyChange) {
    this.dependingOntologyChange = dependingOntologyChange;
  }

  public OpenbaseTriggerConfig label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  */
  @ApiModelProperty(value = "")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public OpenbaseTriggerConfig query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
  */
  @ApiModelProperty(value = "")


  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseTriggerConfig openbaseTriggerConfig = (OpenbaseTriggerConfig) o;
    return Objects.equals(this.dependingOntologyChange, openbaseTriggerConfig.dependingOntologyChange) &&
        Objects.equals(this.label, openbaseTriggerConfig.label) &&
        Objects.equals(this.query, openbaseTriggerConfig.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependingOntologyChange, label, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseTriggerConfig {\n");
    
    sb.append("    dependingOntologyChange: ").append(toIndentedString(dependingOntologyChange)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

