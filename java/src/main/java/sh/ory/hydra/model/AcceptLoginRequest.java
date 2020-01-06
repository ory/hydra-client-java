/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.20
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AcceptLoginRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T21:05:15.907675Z[GMT]")
public class AcceptLoginRequest {
  public static final String SERIALIZED_NAME_ACR = "acr";
  @SerializedName(SERIALIZED_NAME_ACR)
  private String acr;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private Map<String, Object> context = null;

  public static final String SERIALIZED_NAME_FORCE_SUBJECT_IDENTIFIER = "force_subject_identifier";
  @SerializedName(SERIALIZED_NAME_FORCE_SUBJECT_IDENTIFIER)
  private String forceSubjectIdentifier;

  public static final String SERIALIZED_NAME_REMEMBER = "remember";
  @SerializedName(SERIALIZED_NAME_REMEMBER)
  private Boolean remember;

  public static final String SERIALIZED_NAME_REMEMBER_FOR = "remember_for";
  @SerializedName(SERIALIZED_NAME_REMEMBER_FOR)
  private Long rememberFor;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;


  public AcceptLoginRequest acr(String acr) {
    
    this.acr = acr;
    return this;
  }

   /**
   * ACR sets the Authentication AuthorizationContext Class Reference value for this authentication session. You can use it to express that, for example, a user authenticated using two factor authentication.
   * @return acr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ACR sets the Authentication AuthorizationContext Class Reference value for this authentication session. You can use it to express that, for example, a user authenticated using two factor authentication.")

  public String getAcr() {
    return acr;
  }


  public void setAcr(String acr) {
    this.acr = acr;
  }


  public AcceptLoginRequest context(Map<String, Object> context) {
    
    this.context = context;
    return this;
  }

  public AcceptLoginRequest putContextItem(String key, Object contextItem) {
    if (this.context == null) {
      this.context = new HashMap<String, Object>();
    }
    this.context.put(key, contextItem);
    return this;
  }

   /**
   * Context is an optional object which can hold arbitrary data. The data will be made available when fetching the consent request under the \&quot;context\&quot; field. This is useful in scenarios where login and consent endpoints share data.
   * @return context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Context is an optional object which can hold arbitrary data. The data will be made available when fetching the consent request under the \"context\" field. This is useful in scenarios where login and consent endpoints share data.")

  public Map<String, Object> getContext() {
    return context;
  }


  public void setContext(Map<String, Object> context) {
    this.context = context;
  }


  public AcceptLoginRequest forceSubjectIdentifier(String forceSubjectIdentifier) {
    
    this.forceSubjectIdentifier = forceSubjectIdentifier;
    return this;
  }

   /**
   * ForceSubjectIdentifier forces the \&quot;pairwise\&quot; user ID of the end-user that authenticated. The \&quot;pairwise\&quot; user ID refers to the (Pairwise Identifier Algorithm)[http://openid.net/specs/openid-connect-core-1_0.html#PairwiseAlg] of the OpenID Connect specification. It allows you to set an obfuscated subject (\&quot;user\&quot;) identifier that is unique to the client.  Please note that this changes the user ID on endpoint /userinfo and sub claim of the ID Token. It does not change the sub claim in the OAuth 2.0 Introspection.  Per default, ORY Hydra handles this value with its own algorithm. In case you want to set this yourself you can use this field. Please note that setting this field has no effect if &#x60;pairwise&#x60; is not configured in ORY Hydra or the OAuth 2.0 Client does not expect a pairwise identifier (set via &#x60;subject_type&#x60; key in the client&#39;s configuration).  Please also be aware that ORY Hydra is unable to properly compute this value during authentication. This implies that you have to compute this value on every authentication process (probably depending on the client ID or some other unique value).  If you fail to compute the proper value, then authentication processes which have id_token_hint set might fail.
   * @return forceSubjectIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ForceSubjectIdentifier forces the \"pairwise\" user ID of the end-user that authenticated. The \"pairwise\" user ID refers to the (Pairwise Identifier Algorithm)[http://openid.net/specs/openid-connect-core-1_0.html#PairwiseAlg] of the OpenID Connect specification. It allows you to set an obfuscated subject (\"user\") identifier that is unique to the client.  Please note that this changes the user ID on endpoint /userinfo and sub claim of the ID Token. It does not change the sub claim in the OAuth 2.0 Introspection.  Per default, ORY Hydra handles this value with its own algorithm. In case you want to set this yourself you can use this field. Please note that setting this field has no effect if `pairwise` is not configured in ORY Hydra or the OAuth 2.0 Client does not expect a pairwise identifier (set via `subject_type` key in the client's configuration).  Please also be aware that ORY Hydra is unable to properly compute this value during authentication. This implies that you have to compute this value on every authentication process (probably depending on the client ID or some other unique value).  If you fail to compute the proper value, then authentication processes which have id_token_hint set might fail.")

  public String getForceSubjectIdentifier() {
    return forceSubjectIdentifier;
  }


  public void setForceSubjectIdentifier(String forceSubjectIdentifier) {
    this.forceSubjectIdentifier = forceSubjectIdentifier;
  }


  public AcceptLoginRequest remember(Boolean remember) {
    
    this.remember = remember;
    return this;
  }

   /**
   * Remember, if set to true, tells ORY Hydra to remember this user by telling the user agent (browser) to store a cookie with authentication data. If the same user performs another OAuth 2.0 Authorization Request, he/she will not be asked to log in again.
   * @return remember
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Remember, if set to true, tells ORY Hydra to remember this user by telling the user agent (browser) to store a cookie with authentication data. If the same user performs another OAuth 2.0 Authorization Request, he/she will not be asked to log in again.")

  public Boolean getRemember() {
    return remember;
  }


  public void setRemember(Boolean remember) {
    this.remember = remember;
  }


  public AcceptLoginRequest rememberFor(Long rememberFor) {
    
    this.rememberFor = rememberFor;
    return this;
  }

   /**
   * RememberFor sets how long the authentication should be remembered for in seconds. If set to &#x60;0&#x60;, the authorization will be remembered for the duration of the browser session (using a session cookie).
   * @return rememberFor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RememberFor sets how long the authentication should be remembered for in seconds. If set to `0`, the authorization will be remembered for the duration of the browser session (using a session cookie).")

  public Long getRememberFor() {
    return rememberFor;
  }


  public void setRememberFor(Long rememberFor) {
    this.rememberFor = rememberFor;
  }


  public AcceptLoginRequest subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Subject is the user ID of the end-user that authenticated.
   * @return subject
  **/
  @ApiModelProperty(required = true, value = "Subject is the user ID of the end-user that authenticated.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcceptLoginRequest acceptLoginRequest = (AcceptLoginRequest) o;
    return Objects.equals(this.acr, acceptLoginRequest.acr) &&
        Objects.equals(this.context, acceptLoginRequest.context) &&
        Objects.equals(this.forceSubjectIdentifier, acceptLoginRequest.forceSubjectIdentifier) &&
        Objects.equals(this.remember, acceptLoginRequest.remember) &&
        Objects.equals(this.rememberFor, acceptLoginRequest.rememberFor) &&
        Objects.equals(this.subject, acceptLoginRequest.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acr, context, forceSubjectIdentifier, remember, rememberFor, subject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceptLoginRequest {\n");
    sb.append("    acr: ").append(toIndentedString(acr)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    forceSubjectIdentifier: ").append(toIndentedString(forceSubjectIdentifier)).append("\n");
    sb.append("    remember: ").append(toIndentedString(remember)).append("\n");
    sb.append("    rememberFor: ").append(toIndentedString(rememberFor)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

