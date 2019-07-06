package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseActionDescription;
import org.openapitools.model.OpenbaseHandleState;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseHandleData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbaseHandleData   {
  @JsonProperty("action")
  @Valid
  private List<OpenbaseActionDescription> action = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("handle_state")
  private OpenbaseHandleState handleState = null;

  @JsonProperty("handle_state_last")
  private OpenbaseHandleState handleStateLast = null;

  @JsonProperty("handle_state_requested")
  private OpenbaseHandleState handleStateRequested = null;

  @JsonProperty("id")
  private String id;

  @JsonProperty("transaction_id")
  private Long transactionId;

  public OpenbaseHandleData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbaseHandleData addActionItem(OpenbaseActionDescription actionItem) {
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

  public OpenbaseHandleData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseHandleData addAliasItem(String aliasItem) {
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

  public OpenbaseHandleData handleState(OpenbaseHandleState handleState) {
    this.handleState = handleState;
    return this;
  }

  /**
   * Get handleState
   * @return handleState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseHandleState getHandleState() {
    return handleState;
  }

  public void setHandleState(OpenbaseHandleState handleState) {
    this.handleState = handleState;
  }

  public OpenbaseHandleData handleStateLast(OpenbaseHandleState handleStateLast) {
    this.handleStateLast = handleStateLast;
    return this;
  }

  /**
   * Get handleStateLast
   * @return handleStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseHandleState getHandleStateLast() {
    return handleStateLast;
  }

  public void setHandleStateLast(OpenbaseHandleState handleStateLast) {
    this.handleStateLast = handleStateLast;
  }

  public OpenbaseHandleData handleStateRequested(OpenbaseHandleState handleStateRequested) {
    this.handleStateRequested = handleStateRequested;
    return this;
  }

  /**
   * Get handleStateRequested
   * @return handleStateRequested
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseHandleState getHandleStateRequested() {
    return handleStateRequested;
  }

  public void setHandleStateRequested(OpenbaseHandleState handleStateRequested) {
    this.handleStateRequested = handleStateRequested;
  }

  public OpenbaseHandleData id(String id) {
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

  public OpenbaseHandleData transactionId(Long transactionId) {
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
    OpenbaseHandleData openbaseHandleData = (OpenbaseHandleData) o;
    return Objects.equals(this.action, openbaseHandleData.action) &&
        Objects.equals(this.alias, openbaseHandleData.alias) &&
        Objects.equals(this.handleState, openbaseHandleData.handleState) &&
        Objects.equals(this.handleStateLast, openbaseHandleData.handleStateLast) &&
        Objects.equals(this.handleStateRequested, openbaseHandleData.handleStateRequested) &&
        Objects.equals(this.id, openbaseHandleData.id) &&
        Objects.equals(this.transactionId, openbaseHandleData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, alias, handleState, handleStateLast, handleStateRequested, id, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseHandleData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    handleState: ").append(toIndentedString(handleState)).append("\n");
    sb.append("    handleStateLast: ").append(toIndentedString(handleStateLast)).append("\n");
    sb.append("    handleStateRequested: ").append(toIndentedString(handleStateRequested)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

