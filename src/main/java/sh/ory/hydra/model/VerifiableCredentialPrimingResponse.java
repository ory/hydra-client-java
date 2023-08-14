/*
 * Ory Hydra API
 * Documentation for all of Ory Hydra's APIs. 
 *
 * The version of the OpenAPI document: v2.2.0-rc.3
 * Contact: hi@ory.sh
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.hydra.JSON;

/**
 * VerifiableCredentialPrimingResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-14T11:55:58.321871935Z[Etc/UTC]")
public class VerifiableCredentialPrimingResponse {
  public static final String SERIALIZED_NAME_C_NONCE = "c_nonce";
  @SerializedName(SERIALIZED_NAME_C_NONCE)
  private String cNonce;

  public static final String SERIALIZED_NAME_C_NONCE_EXPIRES_IN = "c_nonce_expires_in";
  @SerializedName(SERIALIZED_NAME_C_NONCE_EXPIRES_IN)
  private Long cNonceExpiresIn;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_ERROR_DEBUG = "error_debug";
  @SerializedName(SERIALIZED_NAME_ERROR_DEBUG)
  private String errorDebug;

  public static final String SERIALIZED_NAME_ERROR_DESCRIPTION = "error_description";
  @SerializedName(SERIALIZED_NAME_ERROR_DESCRIPTION)
  private String errorDescription;

  public static final String SERIALIZED_NAME_ERROR_HINT = "error_hint";
  @SerializedName(SERIALIZED_NAME_ERROR_HINT)
  private String errorHint;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Long statusCode;

  public VerifiableCredentialPrimingResponse() {
  }

  public VerifiableCredentialPrimingResponse cNonce(String cNonce) {
    
    this.cNonce = cNonce;
    return this;
  }

   /**
   * Get cNonce
   * @return cNonce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getcNonce() {
    return cNonce;
  }


  public void setcNonce(String cNonce) {
    this.cNonce = cNonce;
  }


  public VerifiableCredentialPrimingResponse cNonceExpiresIn(Long cNonceExpiresIn) {
    
    this.cNonceExpiresIn = cNonceExpiresIn;
    return this;
  }

   /**
   * Get cNonceExpiresIn
   * @return cNonceExpiresIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getcNonceExpiresIn() {
    return cNonceExpiresIn;
  }


  public void setcNonceExpiresIn(Long cNonceExpiresIn) {
    this.cNonceExpiresIn = cNonceExpiresIn;
  }


  public VerifiableCredentialPrimingResponse error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  public VerifiableCredentialPrimingResponse errorDebug(String errorDebug) {
    
    this.errorDebug = errorDebug;
    return this;
  }

   /**
   * Get errorDebug
   * @return errorDebug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorDebug() {
    return errorDebug;
  }


  public void setErrorDebug(String errorDebug) {
    this.errorDebug = errorDebug;
  }


  public VerifiableCredentialPrimingResponse errorDescription(String errorDescription) {
    
    this.errorDescription = errorDescription;
    return this;
  }

   /**
   * Get errorDescription
   * @return errorDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorDescription() {
    return errorDescription;
  }


  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  public VerifiableCredentialPrimingResponse errorHint(String errorHint) {
    
    this.errorHint = errorHint;
    return this;
  }

   /**
   * Get errorHint
   * @return errorHint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorHint() {
    return errorHint;
  }


  public void setErrorHint(String errorHint) {
    this.errorHint = errorHint;
  }


  public VerifiableCredentialPrimingResponse format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public VerifiableCredentialPrimingResponse statusCode(Long statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(Long statusCode) {
    this.statusCode = statusCode;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the VerifiableCredentialPrimingResponse instance itself
   */
  public VerifiableCredentialPrimingResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifiableCredentialPrimingResponse verifiableCredentialPrimingResponse = (VerifiableCredentialPrimingResponse) o;
    return Objects.equals(this.cNonce, verifiableCredentialPrimingResponse.cNonce) &&
        Objects.equals(this.cNonceExpiresIn, verifiableCredentialPrimingResponse.cNonceExpiresIn) &&
        Objects.equals(this.error, verifiableCredentialPrimingResponse.error) &&
        Objects.equals(this.errorDebug, verifiableCredentialPrimingResponse.errorDebug) &&
        Objects.equals(this.errorDescription, verifiableCredentialPrimingResponse.errorDescription) &&
        Objects.equals(this.errorHint, verifiableCredentialPrimingResponse.errorHint) &&
        Objects.equals(this.format, verifiableCredentialPrimingResponse.format) &&
        Objects.equals(this.statusCode, verifiableCredentialPrimingResponse.statusCode)&&
        Objects.equals(this.additionalProperties, verifiableCredentialPrimingResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cNonce, cNonceExpiresIn, error, errorDebug, errorDescription, errorHint, format, statusCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifiableCredentialPrimingResponse {\n");
    sb.append("    cNonce: ").append(toIndentedString(cNonce)).append("\n");
    sb.append("    cNonceExpiresIn: ").append(toIndentedString(cNonceExpiresIn)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDebug: ").append(toIndentedString(errorDebug)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    errorHint: ").append(toIndentedString(errorHint)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("c_nonce");
    openapiFields.add("c_nonce_expires_in");
    openapiFields.add("error");
    openapiFields.add("error_debug");
    openapiFields.add("error_description");
    openapiFields.add("error_hint");
    openapiFields.add("format");
    openapiFields.add("status_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VerifiableCredentialPrimingResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VerifiableCredentialPrimingResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VerifiableCredentialPrimingResponse is not found in the empty JSON string", VerifiableCredentialPrimingResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("c_nonce") != null && !jsonObj.get("c_nonce").isJsonNull()) && !jsonObj.get("c_nonce").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `c_nonce` to be a primitive type in the JSON string but got `%s`", jsonObj.get("c_nonce").toString()));
      }
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      if ((jsonObj.get("error_debug") != null && !jsonObj.get("error_debug").isJsonNull()) && !jsonObj.get("error_debug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_debug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_debug").toString()));
      }
      if ((jsonObj.get("error_description") != null && !jsonObj.get("error_description").isJsonNull()) && !jsonObj.get("error_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_description").toString()));
      }
      if ((jsonObj.get("error_hint") != null && !jsonObj.get("error_hint").isJsonNull()) && !jsonObj.get("error_hint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_hint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_hint").toString()));
      }
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VerifiableCredentialPrimingResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerifiableCredentialPrimingResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerifiableCredentialPrimingResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerifiableCredentialPrimingResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<VerifiableCredentialPrimingResponse>() {
           @Override
           public void write(JsonWriter out, VerifiableCredentialPrimingResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public VerifiableCredentialPrimingResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VerifiableCredentialPrimingResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VerifiableCredentialPrimingResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VerifiableCredentialPrimingResponse
  * @throws IOException if the JSON string is invalid with respect to VerifiableCredentialPrimingResponse
  */
  public static VerifiableCredentialPrimingResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerifiableCredentialPrimingResponse.class);
  }

 /**
  * Convert an instance of VerifiableCredentialPrimingResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

