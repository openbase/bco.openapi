package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseActionDescription;
import org.openapitools.model.OpenbaseContactState;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseReedContactData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseReedContactData   {
  @JsonProperty("action")
  @Valid
  private List<OpenbaseActionDescription> action = null;

  @JsonProperty("alias")
  @Valid
  private List<String> alias = null;

  @JsonProperty("contact_state")
  private OpenbaseContactState contactState = null;

  @JsonProperty("contact_state_last")
  private OpenbaseContactState contactStateLast = null;

  @JsonProperty("id")
  private String id;

  @JsonProperty("transaction_id")
  private Long transactionId;

  public OpenbaseReedContactData action(List<OpenbaseActionDescription> action) {
    this.action = action;
    return this;
  }

  public OpenbaseReedContactData addActionItem(OpenbaseActionDescription actionItem) {
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

  public OpenbaseReedContactData alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public OpenbaseReedContactData addAliasItem(String aliasItem) {
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

  public OpenbaseReedContactData contactState(OpenbaseContactState contactState) {
    this.contactState = contactState;
    return this;
  }

  /**
   * Get contactState
   * @return contactState
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseContactState getContactState() {
    return contactState;
  }

  public void setContactState(OpenbaseContactState contactState) {
    this.contactState = contactState;
  }

  public OpenbaseReedContactData contactStateLast(OpenbaseContactState contactStateLast) {
    this.contactStateLast = contactStateLast;
    return this;
  }

  /**
   * Get contactStateLast
   * @return contactStateLast
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseContactState getContactStateLast() {
    return contactStateLast;
  }

  public void setContactStateLast(OpenbaseContactState contactStateLast) {
    this.contactStateLast = contactStateLast;
  }

  public OpenbaseReedContactData id(String id) {
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

  public OpenbaseReedContactData transactionId(Long transactionId) {
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
    OpenbaseReedContactData openbaseReedContactData = (OpenbaseReedContactData) o;
    return Objects.equals(this.action, openbaseReedContactData.action) &&
        Objects.equals(this.alias, openbaseReedContactData.alias) &&
        Objects.equals(this.contactState, openbaseReedContactData.contactState) &&
        Objects.equals(this.contactStateLast, openbaseReedContactData.contactStateLast) &&
        Objects.equals(this.id, openbaseReedContactData.id) &&
        Objects.equals(this.transactionId, openbaseReedContactData.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, alias, contactState, contactStateLast, id, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseReedContactData {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    contactState: ").append(toIndentedString(contactState)).append("\n");
    sb.append("    contactStateLast: ").append(toIndentedString(contactStateLast)).append("\n");
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

