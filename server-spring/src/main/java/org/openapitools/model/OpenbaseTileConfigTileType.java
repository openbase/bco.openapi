package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OpenbaseTileConfig.TileType
 */
public enum OpenbaseTileConfigTileType {
  
  OUTDOOR("OUTDOOR"),
  
  INDOOR("INDOOR");

  private String value;

  OpenbaseTileConfigTileType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OpenbaseTileConfigTileType fromValue(String value) {
    for (OpenbaseTileConfigTileType b : OpenbaseTileConfigTileType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

