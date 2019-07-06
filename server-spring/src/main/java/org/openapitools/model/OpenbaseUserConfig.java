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
 * OpenbaseUserConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

public class OpenbaseUserConfig   {
  @JsonProperty("email")
  private String email;

  @JsonProperty("first_name")
  private String firstName;

  @JsonProperty("language")
  private String language;

  @JsonProperty("last_name")
  private String lastName;

  @JsonProperty("mobile_phone_number")
  private String mobilePhoneNumber;

  @JsonProperty("occupant")
  private Boolean occupant;

  @JsonProperty("system_user")
  private Boolean systemUser;

  @JsonProperty("user_name")
  private String userName;

  public OpenbaseUserConfig email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public OpenbaseUserConfig firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public OpenbaseUserConfig language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
  */
  @ApiModelProperty(value = "")


  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public OpenbaseUserConfig lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @ApiModelProperty(value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public OpenbaseUserConfig mobilePhoneNumber(String mobilePhoneNumber) {
    this.mobilePhoneNumber = mobilePhoneNumber;
    return this;
  }

  /**
   * Get mobilePhoneNumber
   * @return mobilePhoneNumber
  */
  @ApiModelProperty(value = "")


  public String getMobilePhoneNumber() {
    return mobilePhoneNumber;
  }

  public void setMobilePhoneNumber(String mobilePhoneNumber) {
    this.mobilePhoneNumber = mobilePhoneNumber;
  }

  public OpenbaseUserConfig occupant(Boolean occupant) {
    this.occupant = occupant;
    return this;
  }

  /**
   * Get occupant
   * @return occupant
  */
  @ApiModelProperty(value = "")


  public Boolean getOccupant() {
    return occupant;
  }

  public void setOccupant(Boolean occupant) {
    this.occupant = occupant;
  }

  public OpenbaseUserConfig systemUser(Boolean systemUser) {
    this.systemUser = systemUser;
    return this;
  }

  /**
   * Get systemUser
   * @return systemUser
  */
  @ApiModelProperty(value = "")


  public Boolean getSystemUser() {
    return systemUser;
  }

  public void setSystemUser(Boolean systemUser) {
    this.systemUser = systemUser;
  }

  public OpenbaseUserConfig userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  */
  @ApiModelProperty(value = "")


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbaseUserConfig openbaseUserConfig = (OpenbaseUserConfig) o;
    return Objects.equals(this.email, openbaseUserConfig.email) &&
        Objects.equals(this.firstName, openbaseUserConfig.firstName) &&
        Objects.equals(this.language, openbaseUserConfig.language) &&
        Objects.equals(this.lastName, openbaseUserConfig.lastName) &&
        Objects.equals(this.mobilePhoneNumber, openbaseUserConfig.mobilePhoneNumber) &&
        Objects.equals(this.occupant, openbaseUserConfig.occupant) &&
        Objects.equals(this.systemUser, openbaseUserConfig.systemUser) &&
        Objects.equals(this.userName, openbaseUserConfig.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, language, lastName, mobilePhoneNumber, occupant, systemUser, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbaseUserConfig {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    mobilePhoneNumber: ").append(toIndentedString(mobilePhoneNumber)).append("\n");
    sb.append("    occupant: ").append(toIndentedString(occupant)).append("\n");
    sb.append("    systemUser: ").append(toIndentedString(systemUser)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

