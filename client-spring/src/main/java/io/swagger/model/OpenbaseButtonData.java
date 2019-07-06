package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseActionDescription;
import io.swagger.model.OpenbaseButtonState;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseButtonData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseButtonData   {
  @JsonProperty("action")
  @Valid
  private List<OpenbaseActionDescription> action = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("button_state")
  private OpenbaseButtonState buttonState = null;

  @JsonProperty("button_state_last")
  private OpenbaseButtonState buttonStateLast = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("transaction_id")
  private Long transactionId = null;

  public OpenbaseButtonData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbaseButtonData addActionItem(OpenbaseActionDescription actionItem) {
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

  public OpenbaseButtonData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseButtonData addAliasItem(String aliasItem) {
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

  public OpenbaseButtonData buttonState(OpenbaseButtonState buttonState) {
    this.buttonState = buttonState;
    return this;
  }

  /**
   * Get buttonState
   * @return buttonState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseButtonState getButtonState() {
    return buttonState;
  }

  public void setButtonState(OpenbaseButtonState buttonState) {
    this.buttonState = buttonState;
  }

  public OpenbaseButtonData buttonStateLast(OpenbaseButtonState buttonStateLast) {
    this.buttonStateLast = buttonStateLast;
    return this;
  }

  /**
   * Get buttonStateLast
   * @return buttonStateLast
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseButtonState getButtonStateLast() {
    return buttonStateLast;
  }

  public void setButtonStateLast(OpenbaseButtonState buttonStateLast) {
    this.buttonStateLast = buttonStateLast;
  }

  public OpenbaseButtonData id(String id) {
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

  public OpenbaseButtonData transactionId(Long transactionId) {
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
    OpenbaseButtonData openbaseButtonData = (OpenbaseButtonData) o;
    return Objects.equals(this.action, openbaseButtonData.action) &&
        Objects.equals(this.alias, openbaseButtonData.alias) &&
        Objects.equals(this.buttonState, openbaseButtonData.buttonState) &&
        Objects.equals(this.buttonStateLast, openbaseButtonData.buttonStateLast) &&
        Objects.equals(this.id, openbaseButtonData.id) &&
        Objects.equals(this.transactionId, openbaseButtonData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, alias, buttonState, buttonStateLast, id, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseButtonData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    buttonState: ").append(toIndentedString(buttonState)).append("\n");
    sb.append("    buttonStateLast: ").append(toIndentedString(buttonStateLast)).append("\n");
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
