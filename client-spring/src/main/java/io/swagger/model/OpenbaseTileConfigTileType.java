package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
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
  public static OpenbaseTileConfigTileType fromValue(String text) {
    for (OpenbaseTileConfigTileType b : OpenbaseTileConfigTileType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
