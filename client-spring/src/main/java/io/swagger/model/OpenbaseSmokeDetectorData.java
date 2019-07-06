package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseActionDescription;
import io.swagger.model.OpenbaseAlarmState;
import io.swagger.model.OpenbaseSmokeState;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseSmokeDetectorData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseSmokeDetectorData   {
  @JsonProperty("action")
  @Valid
  private List<OpenbaseActionDescription> action = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("smoke_alarm_state")
  private OpenbaseAlarmState smokeAlarmState = null;

  @JsonProperty("smoke_alarm_state_last")
  private OpenbaseAlarmState smokeAlarmStateLast = null;

  @JsonProperty("smoke_state")
  private OpenbaseSmokeState smokeState = null;

  @JsonProperty("smoke_state_last")
  private OpenbaseSmokeState smokeStateLast = null;

  @JsonProperty("transaction_id")
  private Long transactionId = null;

  public OpenbaseSmokeDetectorData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbaseSmokeDetectorData addActionItem(OpenbaseActionDescription actionItem) {
    if (this.action == null) {
      this.action = new ArrayList<OpenbaseActionDescription>();
    }
    this.action.add(actionItem);
    return this;
  }

  /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OpenbaseActionDescription> getAction() {
    return action;
  }

  public void setAction(List<OpenbaseActionDescription> action) {
    this.action = action;
  }

  public OpenbaseSmokeDetectorData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseSmokeDetectorData addAliasItem(String aliasItem) {
    if (this.alias == null) {
      this.alias = new ArrayList<String>();
    }
    this.alias.add(aliasItem);
    return this;
  }

  /**
   * Get alias
   * @return alias
  **/
  @ApiModelProperty(value = "")

  public List<String> getAlias() {
    return alias;
  }

  public void setAlias(List<String> alias) {
    this.alias = alias;
  }

  public OpenbaseSmokeDetectorData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OpenbaseSmokeDetectorData smokeAlarmState(OpenbaseAlarmState smokeAlarmState) {
    this.smokeAlarmState = smokeAlarmState;
    return this;
  }

  /**
   * Get smokeAlarmState
   * @return smokeAlarmState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseAlarmState getSmokeAlarmState() {
    return smokeAlarmState;
  }

  public void setSmokeAlarmState(OpenbaseAlarmState smokeAlarmState) {
    this.smokeAlarmState = smokeAlarmState;
  }

  public OpenbaseSmokeDetectorData smokeAlarmStateLast(OpenbaseAlarmState smokeAlarmStateLast) {
    this.smokeAlarmStateLast = smokeAlarmStateLast;
    return this;
  }

  /**
   * Get smokeAlarmStateLast
   * @return smokeAlarmStateLast
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseAlarmState getSmokeAlarmStateLast() {
    return smokeAlarmStateLast;
  }

  public void setSmokeAlarmStateLast(OpenbaseAlarmState smokeAlarmStateLast) {
    this.smokeAlarmStateLast = smokeAlarmStateLast;
  }

  public OpenbaseSmokeDetectorData smokeState(OpenbaseSmokeState smokeState) {
    this.smokeState = smokeState;
    return this;
  }

  /**
   * Get smokeState
   * @return smokeState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseSmokeState getSmokeState() {
    return smokeState;
  }

  public void setSmokeState(OpenbaseSmokeState smokeState) {
    this.smokeState = smokeState;
  }

  public OpenbaseSmokeDetectorData smokeStateLast(OpenbaseSmokeState smokeStateLast) {
    this.smokeStateLast = smokeStateLast;
    return this;
  }

  /**
   * Get smokeStateLast
   * @return smokeStateLast
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseSmokeState getSmokeStateLast() {
    return smokeStateLast;
  }

  public void setSmokeStateLast(OpenbaseSmokeState smokeStateLast) {
    this.smokeStateLast = smokeStateLast;
  }

  public OpenbaseSmokeDetectorData transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
  **/
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
    OpenbaseSmokeDetectorData openbaseSmokeDetectorData = (OpenbaseSmokeDetectorData) o;
    return Objects.equals(this.action, openbaseSmokeDetectorData.action) &&
        Objects.equals(this.alias, openbaseSmokeDetectorData.alias) &&
        Objects.equals(this.id, openbaseSmokeDetectorData.id) &&
        Objects.equals(this.smokeAlarmState, openbaseSmokeDetectorData.smokeAlarmState) &&
        Objects.equals(this.smokeAlarmStateLast, openbaseSmokeDetectorData.smokeAlarmStateLast) &&
        Objects.equals(this.smokeState, openbaseSmokeDetectorData.smokeState) &&
        Objects.equals(this.smokeStateLast, openbaseSmokeDetectorData.smokeStateLast) &&
        Objects.equals(this.transactionId, openbaseSmokeDetectorData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, alias, id, smokeAlarmState, smokeAlarmStateLast, smokeState, smokeStateLast, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseSmokeDetectorData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    smokeAlarmState: ").append(toIndentedString(smokeAlarmState)).append("\n");
    sb.append("    smokeAlarmStateLast: ").append(toIndentedString(smokeAlarmStateLast)).append("\n");
    sb.append("    smokeState: ").append(toIndentedString(smokeState)).append("\n");
    sb.append("    smokeStateLast: ").append(toIndentedString(smokeStateLast)).append("\n");
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
