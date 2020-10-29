/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v1.9.0-alpha.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.hydra.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PluginDevice plugin device
 */
@ApiModel(description = "PluginDevice plugin device")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-29T17:18:58.591596Z[GMT]")
public class PluginDevice {
  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PATH = "Path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_SETTABLE = "Settable";
  @SerializedName(SERIALIZED_NAME_SETTABLE)
  private List<String> settable = new ArrayList<String>();


  public PluginDevice description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PluginDevice name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PluginDevice path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * path
   * @return path
  **/
  @ApiModelProperty(required = true, value = "path")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public PluginDevice settable(List<String> settable) {
    
    this.settable = settable;
    return this;
  }

  public PluginDevice addSettableItem(String settableItem) {
    this.settable.add(settableItem);
    return this;
  }

   /**
   * settable
   * @return settable
  **/
  @ApiModelProperty(required = true, value = "settable")

  public List<String> getSettable() {
    return settable;
  }


  public void setSettable(List<String> settable) {
    this.settable = settable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginDevice pluginDevice = (PluginDevice) o;
    return Objects.equals(this.description, pluginDevice.description) &&
        Objects.equals(this.name, pluginDevice.name) &&
        Objects.equals(this.path, pluginDevice.path) &&
        Objects.equals(this.settable, pluginDevice.settable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, path, settable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginDevice {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    settable: ").append(toIndentedString(settable)).append("\n");
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

