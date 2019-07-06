package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpenbaseMetaConfig;
import io.swagger.model.OpenbaseTileConfigTileType;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseTileConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
public class OpenbaseTileConfig   {
  @JsonProperty("connection_id")
  @Valid
  private List<String> connectionId = null;

  @JsonProperty("meta_config")
  private OpenbaseMetaConfig metaConfig = null;

  @JsonProperty("tile_type")
  private OpenbaseTileConfigTileType tileType = null;

  public OpenbaseTileConfig connectionId(List<String> connectionId) {
    this.connectionId = connectionId;
    return this;
  }

  public OpenbaseTileConfig addConnectionIdItem(String connectionIdItem) {
    if (this.connectionId == null) {
      this.connectionId = new ArrayList<String>();
    }
    this.connectionId.add(connectionIdItem);
    return this;
  }

  /**
   * Get connectionId
   * @return connectionId
  **/
  @ApiModelProperty(value = "")

  public List<String> getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(List<String> connectionId) {
    this.connectionId = connectionId;
  }

  public OpenbaseTileConfig metaConfig(OpenbaseMetaConfig metaConfig) {
    this.metaConfig = metaConfig;
    return this;
  }

  /**
   * Get metaConfig
   * @return metaConfig
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseMetaConfig getMetaConfig() {
    return metaConfig;
  }

  public void setMetaConfig(OpenbaseMetaConfig metaConfig) {
    this.metaConfig = metaConfig;
  }

  public OpenbaseTileConfig tileType(OpenbaseTileConfigTileType tileType) {
    this.tileType = tileType;
    return this;
  }

  /**
   * Get tileType
   * @return tileType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OpenbaseTileConfigTileType getTileType() {
    return tileType;
  }

  public void setTileType(OpenbaseTileConfigTileType tileType) {
    this.tileType = tileType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseTileConfig openbaseTileConfig = (OpenbaseTileConfig) o;
    return Objects.equals(this.connectionId, openbaseTileConfig.connectionId) &&
        Objects.equals(this.metaConfig, openbaseTileConfig.metaConfig) &&
        Objects.equals(this.tileType, openbaseTileConfig.tileType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, metaConfig, tileType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseTileConfig {\n");
    
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    metaConfig: ").append(toIndentedString(metaConfig)).append("\n");
    sb.append("    tileType: ").append(toIndentedString(tileType)).append("\n");
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
