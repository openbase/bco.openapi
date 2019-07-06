package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseActionDescription;
import io.swagger.model.OpenbaseBlindState;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseRollerShutterData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseRollerShutterData   {
  @JsonProperty("action")
  @Valid
  private List<OpenbaseActionDescription> action = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("blind_state")
  private OpenbaseBlindState blindState = null;

  @JsonProperty("blind_state_last")
  private OpenbaseBlindState blindStateLast = null;

  @JsonProperty("blind_state_requested")
  private OpenbaseBlindState blindStateRequested = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("transaction_id")
  private Long transactionId = null;

  public OpenbaseRollerShutterData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbaseRollerShutterData addActionItem(OpenbaseActionDescription actionItem) {
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

  public OpenbaseRollerShutterData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseRollerShutterData addAliasItem(String aliasItem) {
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

  public OpenbaseRollerShutterData blindState(OpenbaseBlindState blindState) {
    this.blindState = blindState;
    return this;
  }

  /**
   * Get blindState
   * @return blindState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseBlindState getBlindState() {
    return blindState;
  }

  public void setBlindState(OpenbaseBlindState blindState) {
    this.blindState = blindState;
  }

  public OpenbaseRollerShutterData blindStateLast(OpenbaseBlindState blindStateLast) {
    this.blindStateLast = blindStateLast;
    return this;
  }

  /**
   * Get blindStateLast
   * @return blindStateLast
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseBlindState getBlindStateLast() {
    return blindStateLast;
  }

  public void setBlindStateLast(OpenbaseBlindState blindStateLast) {
    this.blindStateLast = blindStateLast;
  }

  public OpenbaseRollerShutterData blindStateRequested(OpenbaseBlindState blindStateRequested) {
    this.blindStateRequested = blindStateRequested;
    return this;
  }

  /**
   * Get blindStateRequested
   * @return blindStateRequested
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseBlindState getBlindStateRequested() {
    return blindStateRequested;
  }

  public void setBlindStateRequested(OpenbaseBlindState blindStateRequested) {
    this.blindStateRequested = blindStateRequested;
  }

  public OpenbaseRollerShutterData id(String id) {
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

  public OpenbaseRollerShutterData transactionId(Long transactionId) {
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
    OpenbaseRollerShutterData openbaseRollerShutterData = (OpenbaseRollerShutterData) o;
    return Objects.equals(this.action, openbaseRollerShutterData.action) &&
        Objects.equals(this.alias, openbaseRollerShutterData.alias) &&
        Objects.equals(this.blindState, openbaseRollerShutterData.blindState) &&
        Objects.equals(this.blindStateLast, openbaseRollerShutterData.blindStateLast) &&
        Objects.equals(this.blindStateRequested, openbaseRollerShutterData.blindStateRequested) &&
        Objects.equals(this.id, openbaseRollerShutterData.id) &&
        Objects.equals(this.transactionId, openbaseRollerShutterData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, alias, blindState, blindStateLast, blindStateRequested, id, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseRollerShutterData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    blindState: ").append(toIndentedString(blindState)).append("\n");
    sb.append("    blindStateLast: ").append(toIndentedString(blindStateLast)).append("\n");
    sb.append("    blindStateRequested: ").append(toIndentedString(blindStateRequested)).append("\n");
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
