package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OpenbaseTimestamp;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenbaseFourierDescriptor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

public class OpenbaseFourierDescriptor   {
  @JsonProperty("a")
  @Valid
  private List<Double> a = null;

  @JsonProperty("b")
  @Valid
  private List<Double> b = null;

  @JsonProperty("c")
  @Valid
  private List<Double> c = null;

  @JsonProperty("d")
  @Valid
  private List<Double> d = null;

  @JsonProperty("time")
  private OpenbaseTimestamp time = null;

  public OpenbaseFourierDescriptor a(List<Double> a) {
    this.a = a;
    return this;
  }

  public OpenbaseFourierDescriptor addAItem(Double aItem) {
    if (this.a == null) {
      this.a = new ArrayList<>();
    }
    this.a.add(aItem);
    return this;
  }

  /**
   * Get a
   * @return a
  */
  @ApiModelProperty(value = "")


  public List<Double> getA() {
    return a;
  }

  public void setA(List<Double> a) {
    this.a = a;
  }

  public OpenbaseFourierDescriptor b(List<Double> b) {
    this.b = b;
    return this;
  }

  public OpenbaseFourierDescriptor addBItem(Double bItem) {
    if (this.b == null) {
      this.b = new ArrayList<>();
    }
    this.b.add(bItem);
    return this;
  }

  /**
   * Get b
   * @return b
  */
  @ApiModelProperty(value = "")


  public List<Double> getB() {
    return b;
  }

  public void setB(List<Double> b) {
    this.b = b;
  }

  public OpenbaseFourierDescriptor c(List<Double> c) {
    this.c = c;
    return this;
  }

  public OpenbaseFourierDescriptor addCItem(Double cItem) {
    if (this.c == null) {
      this.c = new ArrayList<>();
    }
    this.c.add(cItem);
    return this;
  }

  /**
   * Get c
   * @return c
  */
  @ApiModelProperty(value = "")


  public List<Double> getC() {
    return c;
  }

  public void setC(List<Double> c) {
    this.c = c;
  }

  public OpenbaseFourierDescriptor d(List<Double> d) {
    this.d = d;
    return this;
  }

  public OpenbaseFourierDescriptor addDItem(Double dItem) {
    if (this.d == null) {
      this.d = new ArrayList<>();
    }
    this.d.add(dItem);
    return this;
  }

  /**
   * Get d
   * @return d
  */
  @ApiModelProperty(value = "")


  public List<Double> getD() {
    return d;
  }

  public void setD(List<Double> d) {
    this.d = d;
  }

  public OpenbaseFourierDescriptor time(OpenbaseTimestamp time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @ApiModelProperty(value = "")

  @Valid

  public OpenbaseTimestamp getTime() {
    return time;
  }

  public void setTime(OpenbaseTimestamp time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseFourierDescriptor openbaseFourierDescriptor = (OpenbaseFourierDescriptor) o;
    return Objects.equals(this.a, openbaseFourierDescriptor.a) &&
        Objects.equals(this.b, openbaseFourierDescriptor.b) &&
        Objects.equals(this.c, openbaseFourierDescriptor.c) &&
        Objects.equals(this.d, openbaseFourierDescriptor.d) &&
        Objects.equals(this.time, openbaseFourierDescriptor.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(a, b, c, d, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseFourierDescriptor {\n");
    
    sb.append("    a: ").append(toIndentedString(a)).append("\n");
    sb.append("    b: ").append(toIndentedString(b)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    d: ").append(toIndentedString(d)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

