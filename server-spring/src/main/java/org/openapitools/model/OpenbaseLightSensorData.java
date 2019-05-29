package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseActionDescription;
import org.openapitools.model.OpenbaseIlluminanceState;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseLightSensorData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-29T22:47:43.327074+02:00[Europe/Berlin]")

public class OpenbaseLightSensorData   {
  @JsonProperty("action")
  @Valid
  private List<OpenbaseActionDescription> action = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("id")
  private String id;

  @JsonProperty("illuminance_state")
  private OpenbaseIlluminanceState illuminanceState = null;

  @JsonProperty("illuminance_state_last")
  private OpenbaseIlluminanceState illuminanceStateLast = null;

  @JsonProperty("illuminance_state_requested")
  private OpenbaseIlluminanceState illuminanceStateRequested = null;

  @JsonProperty("transaction_id")
  private Long transactionId;

  public OpenbaseLightSensorData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbaseLightSensorData addActionItem(OpenbaseActionDescription actionItem) {
    if (this.action == null) {
      this.action = new ArrayList<>();
    }
    this.action.add(actionItem);
    return this;
  }

  /**
   * Get action
   * @return action
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseActionDescription> getAction() {
    return action;
  }

  public void setAction(List<OpenbaseActionDescription> action) {
    this.action = action;
  }

  public OpenbaseLightSensorData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseLightSensorData addAliasItem(String aliasItem) {
    if (this.alias == null) {
      this.alias = new ArrayList<>();
    }
    this.alias.add(aliasItem);
    return this;
  }

  /**
   * Get alias
   * @return alias
  */
  @ApiModelProperty(value = "")


  public List<String> getAlias() {
    return alias;
  }

  public void setAlias(List<String> alias) {
    this.alias = alias;
  }

  public OpenbaseLightSensorData id(String id) {
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

  public OpenbaseLightSensorData illuminanceState(OpenbaseIlluminanceState illuminanceState) {
    this.illuminanceState = illuminanceState;
    return this;
  }

  /**
   * Get illuminanceState
   * @return illuminanceState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseIlluminanceState getIlluminanceState() {
    return illuminanceState;
  }

  public void setIlluminanceState(OpenbaseIlluminanceState illuminanceState) {
    this.illuminanceState = illuminanceState;
  }

  public OpenbaseLightSensorData illuminanceStateLast(OpenbaseIlluminanceState illuminanceStateLast) {
    this.illuminanceStateLast = illuminanceStateLast;
    return this;
  }

  /**
   * Get illuminanceStateLast
   * @return illuminanceStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseIlluminanceState getIlluminanceStateLast() {
    return illuminanceStateLast;
  }

  public void setIlluminanceStateLast(OpenbaseIlluminanceState illuminanceStateLast) {
    this.illuminanceStateLast = illuminanceStateLast;
  }

  public OpenbaseLightSensorData illuminanceStateRequested(OpenbaseIlluminanceState illuminanceStateRequested) {
    this.illuminanceStateRequested = illuminanceStateRequested;
    return this;
  }

  /**
   * Get illuminanceStateRequested
   * @return illuminanceStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseIlluminanceState getIlluminanceStateRequested() {
    return illuminanceStateRequested;
  }

  public void setIlluminanceStateRequested(OpenbaseIlluminanceState illuminanceStateRequested) {
    this.illuminanceStateRequested = illuminanceStateRequested;
  }

  public OpenbaseLightSensorData transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
  */
  @ApiModelProperty(value = "")


  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseLightSensorData openbaseLightSensorData = (OpenbaseLightSensorData) o;
    return Objects.equals(this.action, openbaseLightSensorData.action) &&
        Objects.equals(this.alias, openbaseLightSensorData.alias) &&
        Objects.equals(this.id, openbaseLightSensorData.id) &&
        Objects.equals(this.illuminanceState, openbaseLightSensorData.illuminanceState) &&
        Objects.equals(this.illuminanceStateLast, openbaseLightSensorData.illuminanceStateLast) &&
        Objects.equals(this.illuminanceStateRequested, openbaseLightSensorData.illuminanceStateRequested) &&
        Objects.equals(this.transactionId, openbaseLightSensorData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, alias, id, illuminanceState, illuminanceStateLast, illuminanceStateRequested, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseLightSensorData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    illuminanceState: ").append(toIndentedString(illuminanceState)).append("\n");
    sb.append("    illuminanceStateLast: ").append(toIndentedString(illuminanceStateLast)).append("\n");
    sb.append("    illuminanceStateRequested: ").append(toIndentedString(illuminanceStateRequested)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

