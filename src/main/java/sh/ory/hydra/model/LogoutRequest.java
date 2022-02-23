/*
 * Ory Oathkeeper API
 * Documentation for all of Ory Oathkeeper's APIs. 
 *
 * The version of the OpenAPI document: v1.11.7
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
import sh.ory.hydra.model.OAuth2Client;

/**
 * LogoutRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-23T10:50:09.124006076Z[Etc/UTC]")
public class LogoutRequest {
  public static final String SERIALIZED_NAME_CHALLENGE = "challenge";
  @SerializedName(SERIALIZED_NAME_CHALLENGE)
  private String challenge;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private OAuth2Client client;

  public static final String SERIALIZED_NAME_REQUEST_URL = "request_url";
  @SerializedName(SERIALIZED_NAME_REQUEST_URL)
  private String requestUrl;

  public static final String SERIALIZED_NAME_RP_INITIATED = "rp_initiated";
  @SerializedName(SERIALIZED_NAME_RP_INITIATED)
  private Boolean rpInitiated;

  public static final String SERIALIZED_NAME_SID = "sid";
  @SerializedName(SERIALIZED_NAME_SID)
  private String sid;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public LogoutRequest() { 
  }

  public LogoutRequest challenge(String challenge) {
    
    this.challenge = challenge;
    return this;
  }

   /**
   * Challenge is the identifier (\&quot;logout challenge\&quot;) of the logout authentication request. It is used to identify the session.
   * @return challenge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Challenge is the identifier (\"logout challenge\") of the logout authentication request. It is used to identify the session.")

  public String getChallenge() {
    return challenge;
  }


  public void setChallenge(String challenge) {
    this.challenge = challenge;
  }


  public LogoutRequest client(OAuth2Client client) {
    
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OAuth2Client getClient() {
    return client;
  }


  public void setClient(OAuth2Client client) {
    this.client = client;
  }


  public LogoutRequest requestUrl(String requestUrl) {
    
    this.requestUrl = requestUrl;
    return this;
  }

   /**
   * RequestURL is the original Logout URL requested.
   * @return requestUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RequestURL is the original Logout URL requested.")

  public String getRequestUrl() {
    return requestUrl;
  }


  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }


  public LogoutRequest rpInitiated(Boolean rpInitiated) {
    
    this.rpInitiated = rpInitiated;
    return this;
  }

   /**
   * RPInitiated is set to true if the request was initiated by a Relying Party (RP), also known as an OAuth 2.0 Client.
   * @return rpInitiated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RPInitiated is set to true if the request was initiated by a Relying Party (RP), also known as an OAuth 2.0 Client.")

  public Boolean getRpInitiated() {
    return rpInitiated;
  }


  public void setRpInitiated(Boolean rpInitiated) {
    this.rpInitiated = rpInitiated;
  }


  public LogoutRequest sid(String sid) {
    
    this.sid = sid;
    return this;
  }

   /**
   * SessionID is the login session ID that was requested to log out.
   * @return sid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SessionID is the login session ID that was requested to log out.")

  public String getSid() {
    return sid;
  }


  public void setSid(String sid) {
    this.sid = sid;
  }


  public LogoutRequest subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Subject is the user for whom the logout was request.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subject is the user for whom the logout was request.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogoutRequest logoutRequest = (LogoutRequest) o;
    return Objects.equals(this.challenge, logoutRequest.challenge) &&
        Objects.equals(this.client, logoutRequest.client) &&
        Objects.equals(this.requestUrl, logoutRequest.requestUrl) &&
        Objects.equals(this.rpInitiated, logoutRequest.rpInitiated) &&
        Objects.equals(this.sid, logoutRequest.sid) &&
        Objects.equals(this.subject, logoutRequest.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challenge, client, requestUrl, rpInitiated, sid, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogoutRequest {\n");
    sb.append("    challenge: ").append(toIndentedString(challenge)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
    sb.append("    rpInitiated: ").append(toIndentedString(rpInitiated)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

}

