package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseMultiLanguageTextMapFieldEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-29T22:47:43.327074+02:00[Europe/Berlin]")

public class OpenbaseMultiLanguageTextMapFieldEntry   {
  @JsonProperty("key")
  private String key;

  @JsonProperty("value")
  private String value;

  public OpenbaseMultiLanguageTextMapFieldEntry key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  */
  @ApiModelProperty(value = "")


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public OpenbaseMultiLanguageTextMapFieldEntry value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @ApiModelProperty(value = "")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
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
    OpenbaseMultiLanguageTextMapFieldEntry openbaseMultiLanguageTextMapFieldEntry = (OpenbaseMultiLanguageTextMapFieldEntry) o;
    return Objects.equals(this.key, openbaseMultiLanguageTextMapFieldEntry.key) &&
        Objects.equals(this.value, openbaseMultiLanguageTextMapFieldEntry.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseMultiLanguageTextMapFieldEntry {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

