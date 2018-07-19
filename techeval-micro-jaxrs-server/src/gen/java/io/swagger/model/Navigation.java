/*
 * SES Content Service API
 * This is the Content Service
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;

/**
 * Navigation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-13T12:11:03.902Z")
public class Navigation   {
  /**
   * The identifier used for this workflow item type
   */
  public enum TypeEnum {
    TOP("top"),
    
    BOTTOM("bottom");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("index")
  private BigDecimal index = null;

  @JsonProperty("page_id")
  private String pageId = null;

  public Navigation type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The identifier used for this workflow item type
   * @return type
   **/
  @JsonProperty("type")
  @ApiModelProperty(required = true, value = "The identifier used for this workflow item type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Navigation title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title as it should be displayed on the page
   * @return title
   **/
  @JsonProperty("title")
  @ApiModelProperty(required = true, value = "The title as it should be displayed on the page")
  @NotNull
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Navigation index(BigDecimal index) {
    this.index = index;
    return this;
  }

  /**
   * The order in which to display the navigation entry
   * @return index
   **/
  @JsonProperty("index")
  @ApiModelProperty(value = "The order in which to display the navigation entry")
  public BigDecimal getIndex() {
    return index;
  }

  public void setIndex(BigDecimal index) {
    this.index = index;
  }

  public Navigation pageId(String pageId) {
    this.pageId = pageId;
    return this;
  }

  /**
   * Reference to the page Id that is to be displayed when the link is clicked.
   * @return pageId
   **/
  @JsonProperty("page_id")
  @ApiModelProperty(value = "Reference to the page Id that is to be displayed when the link is clicked.")
  public String getPageId() {
    return pageId;
  }

  public void setPageId(String pageId) {
    this.pageId = pageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Navigation navigation = (Navigation) o;
    return Objects.equals(this.type, navigation.type) &&
        Objects.equals(this.title, navigation.title) &&
        Objects.equals(this.index, navigation.index) &&
        Objects.equals(this.pageId, navigation.pageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, index, pageId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Navigation {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
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

