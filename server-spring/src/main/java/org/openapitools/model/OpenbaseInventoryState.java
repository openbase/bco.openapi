package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseInventoryStateMapFieldEntry;
import org.openapitools.model.OpenbaseInventoryStateState;
import org.openapitools.model.OpenbaseTimestamp;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseInventoryState
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

public class OpenbaseInventoryState   {
  @JsonProperty("borrower_id")
  private String borrowerId;

  @JsonProperty("last_value_occurrence")
  @Valid
  private List<OpenbaseInventoryStateMapFieldEntry> lastValueOccurrence = null;

  @JsonProperty("location_id")
  private String locationId;

  @JsonProperty("timestamp")
  private OpenbaseTimestamp timestamp = null;

  @JsonProperty("value")
  private OpenbaseInventoryStateState value;

  public OpenbaseInventoryState borrowerId(String borrowerId) {
    this.borrowerId = borrowerId;
    return this;
  }

  /**
   * Get borrowerId
   * @return borrowerId
  */
  @ApiModelProperty(value = "")


  public String getBorrowerId() {
    return borrowerId;
  }

  public void setBorrowerId(String borrowerId) {
    this.borrowerId = borrowerId;
  }

  public OpenbaseInventoryState lastValueOccurrence(List<OpenbaseInventoryStateMapFieldEntry> lastValueOccurrence) {
    this.lastValueOccurrence = lastValueOccurrence;
    return this;
  }

  public OpenbaseInventoryState addLastValueOccurrenceItem(OpenbaseInventoryStateMapFieldEntry lastValueOccurrenceItem) {
    if (this.lastValueOccurrence == null) {
      this.lastValueOccurrence = new ArrayList<>();
    }
    this.lastValueOccurrence.add(lastValueOccurrenceItem);
    return this;
  }

  /**
   * Get lastValueOccurrence
   * @return lastValueOccurrence
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OpenbaseInventoryStateMapFieldEntry> getLastValueOccurrence() {
    return lastValueOccurrence;
  }

  public void setLastValueOccurrence(List<OpenbaseInventoryStateMapFieldEntry> lastValueOccurrence) {
    this.lastValueOccurrence = lastValueOccurrence;
  }

  public OpenbaseInventoryState locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   * @return locationId
  */
  @ApiModelProperty(value = "")


  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public OpenbaseInventoryState timestamp(OpenbaseTimestamp timestamp) {
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

  public OpenbaseInventoryState value(OpenbaseInventoryStateState value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseInventoryStateState getValue() {
    return value;
  }

  public void setValue(OpenbaseInventoryStateState value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseInventoryState openbaseInventoryState = (OpenbaseInventoryState) o;
    return Objects.equals(this.borrowerId, openbaseInventoryState.borrowerId) &&
        Objects.equals(this.lastValueOccurrence, openbaseInventoryState.lastValueOccurrence) &&
        Objects.equals(this.locationId, openbaseInventoryState.locationId) &&
        Objects.equals(this.timestamp, openbaseInventoryState.timestamp) &&
        Objects.equals(this.value, openbaseInventoryState.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(borrowerId, lastValueOccurrence, locationId, timestamp, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseInventoryState {\n");
    
    sb.append("    borrowerId: ").append(toIndentedString(borrowerId)).append("\n");
    sb.append("    lastValueOccurrence: ").append(toIndentedString(lastValueOccurrence)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

