package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseMultiLanguageText;
import org.openapitools.model.OpenbaseServiceStateDescription;
import org.openapitools.model.OpenbaseTimestamp;
import org.openapitools.model.OpenbaseUserMessageMessageType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseUserMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseUserMessage   {
  @JsonProperty("acknowledged")
  private Boolean acknowledged;

  @JsonProperty("condition")
  @Valid
  private List<OpenbaseServiceStateDescription> condition = null;

  @JsonProperty("message_type")
  private OpenbaseUserMessageMessageType messageType;

  @JsonProperty("recipient_id")
  private String recipientId;

  @JsonProperty("sender_id")
  private String senderId;

  @JsonProperty("text")
  private OpenbaseMultiLanguageText text = null;

  @JsonProperty("timestamp")
  private OpenbaseTimestamp timestamp = null;

  public OpenbaseUserMessage acknowledged(Boolean acknowledged) {
    this.acknowledged = acknowledged;
    return this;
  }

  /**
   * Get acknowledged
   * @return acknowledged
  */
  @ApiModelProperty(value = "")


  public Boolean getAcknowledged() {
    return acknowledged;
  }

  public void setAcknowledged(Boolean acknowledged) {
    this.acknowledged = acknowledged;
  }

  public OpenbaseUserMessage condition(List<OpenbaseServiceStateDescription> condition) {
    this.condition = condition;
    return this;
  }

  public OpenbaseUserMessage addConditionItem(OpenbaseServiceStateDescription conditionItem) {
    if (this.condition == null) {
      this.condition = new ArrayList<>();
    }
    this.condition.add(conditionItem);
    return this;
  }

  /**
   * Get condition
   * @return condition
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseServiceStateDescription> getCondition() {
    return condition;
  }

  public void setCondition(List<OpenbaseServiceStateDescription> condition) {
    this.condition = condition;
  }

  public OpenbaseUserMessage messageType(OpenbaseUserMessageMessageType messageType) {
    this.messageType = messageType;
    return this;
  }

  /**
   * Get messageType
   * @return messageType
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseUserMessageMessageType getMessageType() {
    return messageType;
  }

  public void setMessageType(OpenbaseUserMessageMessageType messageType) {
    this.messageType = messageType;
  }

  public OpenbaseUserMessage recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * Get recipientId
   * @return recipientId
  */
  @ApiModelProperty(value = "")


  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public OpenbaseUserMessage senderId(String senderId) {
    this.senderId = senderId;
    return this;
  }

  /**
   * Get senderId
   * @return senderId
  */
  @ApiModelProperty(value = "")


  public String getSenderId() {
    return senderId;
  }

  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }

  public OpenbaseUserMessage text(OpenbaseMultiLanguageText text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseMultiLanguageText getText() {
    return text;
  }

  public void setText(OpenbaseMultiLanguageText text) {
    this.text = text;
  }

  public OpenbaseUserMessage timestamp(OpenbaseTimestamp timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTimestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OpenbaseTimestamp timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseUserMessage openbaseUserMessage = (OpenbaseUserMessage) o;
    return Objects.equals(this.acknowledged, openbaseUserMessage.acknowledged) &&
        Objects.equals(this.condition, openbaseUserMessage.condition) &&
        Objects.equals(this.messageType, openbaseUserMessage.messageType) &&
        Objects.equals(this.recipientId, openbaseUserMessage.recipientId) &&
        Objects.equals(this.senderId, openbaseUserMessage.senderId) &&
        Objects.equals(this.text, openbaseUserMessage.text) &&
        Objects.equals(this.timestamp, openbaseUserMessage.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acknowledged, condition, messageType, recipientId, senderId, text, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseUserMessage {\n");
    
    sb.append("    acknowledged: ").append(toIndentedString(acknowledged)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

