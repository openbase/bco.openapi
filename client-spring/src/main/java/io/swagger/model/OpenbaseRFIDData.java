package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseActionDescription;
import io.swagger.model.OpenbaseRFIDState;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseRFIDData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseRFIDData   {
  @JsonProperty("action")
  @Valid
  private List<OpenbaseActionDescription> action = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("rfid_state")
  private OpenbaseRFIDState rfidState = null;

  @JsonProperty("rfid_state_last")
  private OpenbaseRFIDState rfidStateLast = null;

  @JsonProperty("transaction_id")
  private Long transactionId = null;

  public OpenbaseRFIDData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbaseRFIDData addActionItem(OpenbaseActionDescription actionItem) {
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

  public OpenbaseRFIDData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseRFIDData addAliasItem(String aliasItem) {
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

  public OpenbaseRFIDData id(String id) {
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

  public OpenbaseRFIDData rfidState(OpenbaseRFIDState rfidState) {
    this.rfidState = rfidState;
    return this;
  }

  /**
   * Get rfidState
   * @return rfidState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseRFIDState getRfidState() {
    return rfidState;
  }

  public void setRfidState(OpenbaseRFIDState rfidState) {
    this.rfidState = rfidState;
  }

  public OpenbaseRFIDData rfidStateLast(OpenbaseRFIDState rfidStateLast) {
    this.rfidStateLast = rfidStateLast;
    return this;
  }

  /**
   * Get rfidStateLast
   * @return rfidStateLast
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseRFIDState getRfidStateLast() {
    return rfidStateLast;
  }

  public void setRfidStateLast(OpenbaseRFIDState rfidStateLast) {
    this.rfidStateLast = rfidStateLast;
  }

  public OpenbaseRFIDData transactionId(Long transactionId) {
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
    OpenbaseRFIDData openbaseRFIDData = (OpenbaseRFIDData) o;
    return Objects.equals(this.action, openbaseRFIDData.action) &&
        Objects.equals(this.alias, openbaseRFIDData.alias) &&
        Objects.equals(this.id, openbaseRFIDData.id) &&
        Objects.equals(this.rfidState, openbaseRFIDData.rfidState) &&
        Objects.equals(this.rfidStateLast, openbaseRFIDData.rfidStateLast) &&
        Objects.equals(this.transactionId, openbaseRFIDData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, alias, id, rfidState, rfidStateLast, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseRFIDData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rfidState: ").append(toIndentedString(rfidState)).append("\n");
    sb.append("    rfidStateLast: ").append(toIndentedString(rfidStateLast)).append("\n");
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
