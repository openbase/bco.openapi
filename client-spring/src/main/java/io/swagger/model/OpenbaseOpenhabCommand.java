package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseHSB;
import io.swagger.model.OpenbaseIncreaseDecreaseHolder;
import io.swagger.model.OpenbaseOnOffHolder;
import io.swagger.model.OpenbaseOpenClosedHolder;
import io.swagger.model.OpenbaseOpenhabCommandCommandType;
import io.swagger.model.OpenbasePercent;
import io.swagger.model.OpenbaseStopMoveHolder;
import io.swagger.model.OpenbaseTimestamp;
import io.swagger.model.OpenbaseUpDownHolder;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseOpenhabCommand
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseOpenhabCommand   {
  @JsonProperty("binding_type")
  private String bindingType = null;

  @JsonProperty("decimal")
  private Double decimal = null;

  @JsonProperty("hsb")
  private OpenbaseHSB hsb = null;

  @JsonProperty("increase_decrease")
  private OpenbaseIncreaseDecreaseHolder increaseDecrease = null;

  @JsonProperty("item")
  private String item = null;

  @JsonProperty("item_binding_config")
  private String itemBindingConfig = null;

  @JsonProperty("on_off")
  private OpenbaseOnOffHolder onOff = null;

  @JsonProperty("open_closed")
  private OpenbaseOpenClosedHolder openClosed = null;

  @JsonProperty("percent")
  private OpenbasePercent percent = null;

  @JsonProperty("stop_move")
  private OpenbaseStopMoveHolder stopMove = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("timestamp")
  private OpenbaseTimestamp timestamp = null;

  @JsonProperty("type")
  private OpenbaseOpenhabCommandCommandType type = null;

  @JsonProperty("up_down")
  private OpenbaseUpDownHolder upDown = null;

  public OpenbaseOpenhabCommand bindingType(String bindingType) {
    this.bindingType = bindingType;
    return this;
  }

  /**
   * Get bindingType
   * @return bindingType
  **/
  @ApiModelProperty(value = "")

  public String getBindingType() {
    return bindingType;
  }

  public void setBindingType(String bindingType) {
    this.bindingType = bindingType;
  }

  public OpenbaseOpenhabCommand decimal(Double decimal) {
    this.decimal = decimal;
    return this;
  }

  /**
   * Get decimal
   * @return decimal
  **/
  @ApiModelProperty(value = "")

  public Double getDecimal() {
    return decimal;
  }

  public void setDecimal(Double decimal) {
    this.decimal = decimal;
  }

  public OpenbaseOpenhabCommand hsb(OpenbaseHSB hsb) {
    this.hsb = hsb;
    return this;
  }

  /**
   * Get hsb
   * @return hsb
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseHSB getHsb() {
    return hsb;
  }

  public void setHsb(OpenbaseHSB hsb) {
    this.hsb = hsb;
  }

  public OpenbaseOpenhabCommand increaseDecrease(OpenbaseIncreaseDecreaseHolder increaseDecrease) {
    this.increaseDecrease = increaseDecrease;
    return this;
  }

  /**
   * Get increaseDecrease
   * @return increaseDecrease
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseIncreaseDecreaseHolder getIncreaseDecrease() {
    return increaseDecrease;
  }

  public void setIncreaseDecrease(OpenbaseIncreaseDecreaseHolder increaseDecrease) {
    this.increaseDecrease = increaseDecrease;
  }

  public OpenbaseOpenhabCommand item(String item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   * @return item
  **/
  @ApiModelProperty(value = "")

  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public OpenbaseOpenhabCommand itemBindingConfig(String itemBindingConfig) {
    this.itemBindingConfig = itemBindingConfig;
    return this;
  }

  /**
   * Get itemBindingConfig
   * @return itemBindingConfig
  **/
  @ApiModelProperty(value = "")

  public String getItemBindingConfig() {
    return itemBindingConfig;
  }

  public void setItemBindingConfig(String itemBindingConfig) {
    this.itemBindingConfig = itemBindingConfig;
  }

  public OpenbaseOpenhabCommand onOff(OpenbaseOnOffHolder onOff) {
    this.onOff = onOff;
    return this;
  }

  /**
   * Get onOff
   * @return onOff
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseOnOffHolder getOnOff() {
    return onOff;
  }

  public void setOnOff(OpenbaseOnOffHolder onOff) {
    this.onOff = onOff;
  }

  public OpenbaseOpenhabCommand openClosed(OpenbaseOpenClosedHolder openClosed) {
    this.openClosed = openClosed;
    return this;
  }

  /**
   * Get openClosed
   * @return openClosed
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseOpenClosedHolder getOpenClosed() {
    return openClosed;
  }

  public void setOpenClosed(OpenbaseOpenClosedHolder openClosed) {
    this.openClosed = openClosed;
  }

  public OpenbaseOpenhabCommand percent(OpenbasePercent percent) {
    this.percent = percent;
    return this;
  }

  /**
   * Get percent
   * @return percent
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbasePercent getPercent() {
    return percent;
  }

  public void setPercent(OpenbasePercent percent) {
    this.percent = percent;
  }

  public OpenbaseOpenhabCommand stopMove(OpenbaseStopMoveHolder stopMove) {
    this.stopMove = stopMove;
    return this;
  }

  /**
   * Get stopMove
   * @return stopMove
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseStopMoveHolder getStopMove() {
    return stopMove;
  }

  public void setStopMove(OpenbaseStopMoveHolder stopMove) {
    this.stopMove = stopMove;
  }

  public OpenbaseOpenhabCommand text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public OpenbaseOpenhabCommand timestamp(OpenbaseTimestamp timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseTimestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OpenbaseTimestamp timestamp) {
    this.timestamp = timestamp;
  }

  public OpenbaseOpenhabCommand type(OpenbaseOpenhabCommandCommandType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseOpenhabCommandCommandType getType() {
    return type;
  }

  public void setType(OpenbaseOpenhabCommandCommandType type) {
    this.type = type;
  }

  public OpenbaseOpenhabCommand upDown(OpenbaseUpDownHolder upDown) {
    this.upDown = upDown;
    return this;
  }

  /**
   * Get upDown
   * @return upDown
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseUpDownHolder getUpDown() {
    return upDown;
  }

  public void setUpDown(OpenbaseUpDownHolder upDown) {
    this.upDown = upDown;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseOpenhabCommand openbaseOpenhabCommand = (OpenbaseOpenhabCommand) o;
    return Objects.equals(this.bindingType, openbaseOpenhabCommand.bindingType) &&
        Objects.equals(this.decimal, openbaseOpenhabCommand.decimal) &&
        Objects.equals(this.hsb, openbaseOpenhabCommand.hsb) &&
        Objects.equals(this.increaseDecrease, openbaseOpenhabCommand.increaseDecrease) &&
        Objects.equals(this.item, openbaseOpenhabCommand.item) &&
        Objects.equals(this.itemBindingConfig, openbaseOpenhabCommand.itemBindingConfig) &&
        Objects.equals(this.onOff, openbaseOpenhabCommand.onOff) &&
        Objects.equals(this.openClosed, openbaseOpenhabCommand.openClosed) &&
        Objects.equals(this.percent, openbaseOpenhabCommand.percent) &&
        Objects.equals(this.stopMove, openbaseOpenhabCommand.stopMove) &&
        Objects.equals(this.text, openbaseOpenhabCommand.text) &&
        Objects.equals(this.timestamp, openbaseOpenhabCommand.timestamp) &&
        Objects.equals(this.type, openbaseOpenhabCommand.type) &&
        Objects.equals(this.upDown, openbaseOpenhabCommand.upDown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindingType, decimal, hsb, increaseDecrease, item, itemBindingConfig, onOff, openClosed, percent, stopMove, text, timestamp, type, upDown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseOpenhabCommand {\n");
    
    sb.append("    bindingType: ").append(toIndentedString(bindingType)).append("\n");
    sb.append("    decimal: ").append(toIndentedString(decimal)).append("\n");
    sb.append("    hsb: ").append(toIndentedString(hsb)).append("\n");
    sb.append("    increaseDecrease: ").append(toIndentedString(increaseDecrease)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    itemBindingConfig: ").append(toIndentedString(itemBindingConfig)).append("\n");
    sb.append("    onOff: ").append(toIndentedString(onOff)).append("\n");
    sb.append("    openClosed: ").append(toIndentedString(openClosed)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    stopMove: ").append(toIndentedString(stopMove)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    upDown: ").append(toIndentedString(upDown)).append("\n");
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
