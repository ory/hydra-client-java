/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v1.10.6
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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * OAuth2Client
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-28T19:08:35.723495922Z[Etc/UTC]")
public class OAuth2Client {
  public static final String SERIALIZED_NAME_ALLOWED_CORS_ORIGINS = "allowed_cors_origins";
  @SerializedName(SERIALIZED_NAME_ALLOWED_CORS_ORIGINS)
  private List<String> allowedCorsOrigins = null;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private List<String> audience = null;

  public static final String SERIALIZED_NAME_BACKCHANNEL_LOGOUT_SESSION_REQUIRED = "backchannel_logout_session_required";
  @SerializedName(SERIALIZED_NAME_BACKCHANNEL_LOGOUT_SESSION_REQUIRED)
  private Boolean backchannelLogoutSessionRequired;

  public static final String SERIALIZED_NAME_BACKCHANNEL_LOGOUT_URI = "backchannel_logout_uri";
  @SerializedName(SERIALIZED_NAME_BACKCHANNEL_LOGOUT_URI)
  private String backchannelLogoutUri;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "client_name";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "client_secret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public static final String SERIALIZED_NAME_CLIENT_SECRET_EXPIRES_AT = "client_secret_expires_at";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET_EXPIRES_AT)
  private Long clientSecretExpiresAt;

  public static final String SERIALIZED_NAME_CLIENT_URI = "client_uri";
  @SerializedName(SERIALIZED_NAME_CLIENT_URI)
  private String clientUri;

  public static final String SERIALIZED_NAME_CONTACTS = "contacts";
  @SerializedName(SERIALIZED_NAME_CONTACTS)
  private List<String> contacts = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_FRONTCHANNEL_LOGOUT_SESSION_REQUIRED = "frontchannel_logout_session_required";
  @SerializedName(SERIALIZED_NAME_FRONTCHANNEL_LOGOUT_SESSION_REQUIRED)
  private Boolean frontchannelLogoutSessionRequired;

  public static final String SERIALIZED_NAME_FRONTCHANNEL_LOGOUT_URI = "frontchannel_logout_uri";
  @SerializedName(SERIALIZED_NAME_FRONTCHANNEL_LOGOUT_URI)
  private String frontchannelLogoutUri;

  public static final String SERIALIZED_NAME_GRANT_TYPES = "grant_types";
  @SerializedName(SERIALIZED_NAME_GRANT_TYPES)
  private List<String> grantTypes = null;

  public static final String SERIALIZED_NAME_JWKS = "jwks";
  @SerializedName(SERIALIZED_NAME_JWKS)
  private Object jwks;

  public static final String SERIALIZED_NAME_JWKS_URI = "jwks_uri";
  @SerializedName(SERIALIZED_NAME_JWKS_URI)
  private String jwksUri;

  public static final String SERIALIZED_NAME_LOGO_URI = "logo_uri";
  @SerializedName(SERIALIZED_NAME_LOGO_URI)
  private String logoUri;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_POLICY_URI = "policy_uri";
  @SerializedName(SERIALIZED_NAME_POLICY_URI)
  private String policyUri;

  public static final String SERIALIZED_NAME_POST_LOGOUT_REDIRECT_URIS = "post_logout_redirect_uris";
  @SerializedName(SERIALIZED_NAME_POST_LOGOUT_REDIRECT_URIS)
  private List<String> postLogoutRedirectUris = null;

  public static final String SERIALIZED_NAME_REDIRECT_URIS = "redirect_uris";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URIS)
  private List<String> redirectUris = null;

  public static final String SERIALIZED_NAME_REQUEST_OBJECT_SIGNING_ALG = "request_object_signing_alg";
  @SerializedName(SERIALIZED_NAME_REQUEST_OBJECT_SIGNING_ALG)
  private String requestObjectSigningAlg;

  public static final String SERIALIZED_NAME_REQUEST_URIS = "request_uris";
  @SerializedName(SERIALIZED_NAME_REQUEST_URIS)
  private List<String> requestUris = null;

  public static final String SERIALIZED_NAME_RESPONSE_TYPES = "response_types";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TYPES)
  private List<String> responseTypes = null;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_SECTOR_IDENTIFIER_URI = "sector_identifier_uri";
  @SerializedName(SERIALIZED_NAME_SECTOR_IDENTIFIER_URI)
  private String sectorIdentifierUri;

  public static final String SERIALIZED_NAME_SUBJECT_TYPE = "subject_type";
  @SerializedName(SERIALIZED_NAME_SUBJECT_TYPE)
  private String subjectType;

  public static final String SERIALIZED_NAME_TOKEN_ENDPOINT_AUTH_METHOD = "token_endpoint_auth_method";
  @SerializedName(SERIALIZED_NAME_TOKEN_ENDPOINT_AUTH_METHOD)
  private String tokenEndpointAuthMethod;

  public static final String SERIALIZED_NAME_TOKEN_ENDPOINT_AUTH_SIGNING_ALG = "token_endpoint_auth_signing_alg";
  @SerializedName(SERIALIZED_NAME_TOKEN_ENDPOINT_AUTH_SIGNING_ALG)
  private String tokenEndpointAuthSigningAlg;

  public static final String SERIALIZED_NAME_TOS_URI = "tos_uri";
  @SerializedName(SERIALIZED_NAME_TOS_URI)
  private String tosUri;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_USERINFO_SIGNED_RESPONSE_ALG = "userinfo_signed_response_alg";
  @SerializedName(SERIALIZED_NAME_USERINFO_SIGNED_RESPONSE_ALG)
  private String userinfoSignedResponseAlg;


  public OAuth2Client allowedCorsOrigins(List<String> allowedCorsOrigins) {
    
    this.allowedCorsOrigins = allowedCorsOrigins;
    return this;
  }

  public OAuth2Client addAllowedCorsOriginsItem(String allowedCorsOriginsItem) {
    if (this.allowedCorsOrigins == null) {
      this.allowedCorsOrigins = new ArrayList<>();
    }
    this.allowedCorsOrigins.add(allowedCorsOriginsItem);
    return this;
  }

   /**
   * Get allowedCorsOrigins
   * @return allowedCorsOrigins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAllowedCorsOrigins() {
    return allowedCorsOrigins;
  }


  public void setAllowedCorsOrigins(List<String> allowedCorsOrigins) {
    this.allowedCorsOrigins = allowedCorsOrigins;
  }


  public OAuth2Client audience(List<String> audience) {
    
    this.audience = audience;
    return this;
  }

  public OAuth2Client addAudienceItem(String audienceItem) {
    if (this.audience == null) {
      this.audience = new ArrayList<>();
    }
    this.audience.add(audienceItem);
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAudience() {
    return audience;
  }


  public void setAudience(List<String> audience) {
    this.audience = audience;
  }


  public OAuth2Client backchannelLogoutSessionRequired(Boolean backchannelLogoutSessionRequired) {
    
    this.backchannelLogoutSessionRequired = backchannelLogoutSessionRequired;
    return this;
  }

   /**
   * Boolean value specifying whether the RP requires that a sid (session ID) Claim be included in the Logout Token to identify the RP session with the OP when the backchannel_logout_uri is used. If omitted, the default value is false.
   * @return backchannelLogoutSessionRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean value specifying whether the RP requires that a sid (session ID) Claim be included in the Logout Token to identify the RP session with the OP when the backchannel_logout_uri is used. If omitted, the default value is false.")

  public Boolean getBackchannelLogoutSessionRequired() {
    return backchannelLogoutSessionRequired;
  }


  public void setBackchannelLogoutSessionRequired(Boolean backchannelLogoutSessionRequired) {
    this.backchannelLogoutSessionRequired = backchannelLogoutSessionRequired;
  }


  public OAuth2Client backchannelLogoutUri(String backchannelLogoutUri) {
    
    this.backchannelLogoutUri = backchannelLogoutUri;
    return this;
  }

   /**
   * RP URL that will cause the RP to log itself out when sent a Logout Token by the OP.
   * @return backchannelLogoutUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RP URL that will cause the RP to log itself out when sent a Logout Token by the OP.")

  public String getBackchannelLogoutUri() {
    return backchannelLogoutUri;
  }


  public void setBackchannelLogoutUri(String backchannelLogoutUri) {
    this.backchannelLogoutUri = backchannelLogoutUri;
  }


  public OAuth2Client clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * ID  is the id for this client.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID  is the id for this client.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public OAuth2Client clientName(String clientName) {
    
    this.clientName = clientName;
    return this;
  }

   /**
   * Name is the human-readable string name of the client to be presented to the end-user during authorization.
   * @return clientName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name is the human-readable string name of the client to be presented to the end-user during authorization.")

  public String getClientName() {
    return clientName;
  }


  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public OAuth2Client clientSecret(String clientSecret) {
    
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Secret is the client&#39;s secret. The secret will be included in the create request as cleartext, and then never again. The secret is stored using BCrypt so it is impossible to recover it. Tell your users that they need to write the secret down as it will not be made available again.
   * @return clientSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secret is the client's secret. The secret will be included in the create request as cleartext, and then never again. The secret is stored using BCrypt so it is impossible to recover it. Tell your users that they need to write the secret down as it will not be made available again.")

  public String getClientSecret() {
    return clientSecret;
  }


  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public OAuth2Client clientSecretExpiresAt(Long clientSecretExpiresAt) {
    
    this.clientSecretExpiresAt = clientSecretExpiresAt;
    return this;
  }

   /**
   * SecretExpiresAt is an integer holding the time at which the client secret will expire or 0 if it will not expire. The time is represented as the number of seconds from 1970-01-01T00:00:00Z as measured in UTC until the date/time of expiration.  This feature is currently not supported and it&#39;s value will always be set to 0.
   * @return clientSecretExpiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SecretExpiresAt is an integer holding the time at which the client secret will expire or 0 if it will not expire. The time is represented as the number of seconds from 1970-01-01T00:00:00Z as measured in UTC until the date/time of expiration.  This feature is currently not supported and it's value will always be set to 0.")

  public Long getClientSecretExpiresAt() {
    return clientSecretExpiresAt;
  }


  public void setClientSecretExpiresAt(Long clientSecretExpiresAt) {
    this.clientSecretExpiresAt = clientSecretExpiresAt;
  }


  public OAuth2Client clientUri(String clientUri) {
    
    this.clientUri = clientUri;
    return this;
  }

   /**
   * ClientURI is an URL string of a web page providing information about the client. If present, the server SHOULD display this URL to the end-user in a clickable fashion.
   * @return clientUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ClientURI is an URL string of a web page providing information about the client. If present, the server SHOULD display this URL to the end-user in a clickable fashion.")

  public String getClientUri() {
    return clientUri;
  }


  public void setClientUri(String clientUri) {
    this.clientUri = clientUri;
  }


  public OAuth2Client contacts(List<String> contacts) {
    
    this.contacts = contacts;
    return this;
  }

  public OAuth2Client addContactsItem(String contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * Get contacts
   * @return contacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getContacts() {
    return contacts;
  }


  public void setContacts(List<String> contacts) {
    this.contacts = contacts;
  }


  public OAuth2Client createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * CreatedAt returns the timestamp of the client&#39;s creation.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CreatedAt returns the timestamp of the client's creation.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public OAuth2Client frontchannelLogoutSessionRequired(Boolean frontchannelLogoutSessionRequired) {
    
    this.frontchannelLogoutSessionRequired = frontchannelLogoutSessionRequired;
    return this;
  }

   /**
   * Boolean value specifying whether the RP requires that iss (issuer) and sid (session ID) query parameters be included to identify the RP session with the OP when the frontchannel_logout_uri is used. If omitted, the default value is false.
   * @return frontchannelLogoutSessionRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean value specifying whether the RP requires that iss (issuer) and sid (session ID) query parameters be included to identify the RP session with the OP when the frontchannel_logout_uri is used. If omitted, the default value is false.")

  public Boolean getFrontchannelLogoutSessionRequired() {
    return frontchannelLogoutSessionRequired;
  }


  public void setFrontchannelLogoutSessionRequired(Boolean frontchannelLogoutSessionRequired) {
    this.frontchannelLogoutSessionRequired = frontchannelLogoutSessionRequired;
  }


  public OAuth2Client frontchannelLogoutUri(String frontchannelLogoutUri) {
    
    this.frontchannelLogoutUri = frontchannelLogoutUri;
    return this;
  }

   /**
   * RP URL that will cause the RP to log itself out when rendered in an iframe by the OP. An iss (issuer) query parameter and a sid (session ID) query parameter MAY be included by the OP to enable the RP to validate the request and to determine which of the potentially multiple sessions is to be logged out; if either is included, both MUST be.
   * @return frontchannelLogoutUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RP URL that will cause the RP to log itself out when rendered in an iframe by the OP. An iss (issuer) query parameter and a sid (session ID) query parameter MAY be included by the OP to enable the RP to validate the request and to determine which of the potentially multiple sessions is to be logged out; if either is included, both MUST be.")

  public String getFrontchannelLogoutUri() {
    return frontchannelLogoutUri;
  }


  public void setFrontchannelLogoutUri(String frontchannelLogoutUri) {
    this.frontchannelLogoutUri = frontchannelLogoutUri;
  }


  public OAuth2Client grantTypes(List<String> grantTypes) {
    
    this.grantTypes = grantTypes;
    return this;
  }

  public OAuth2Client addGrantTypesItem(String grantTypesItem) {
    if (this.grantTypes == null) {
      this.grantTypes = new ArrayList<>();
    }
    this.grantTypes.add(grantTypesItem);
    return this;
  }

   /**
   * Get grantTypes
   * @return grantTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getGrantTypes() {
    return grantTypes;
  }


  public void setGrantTypes(List<String> grantTypes) {
    this.grantTypes = grantTypes;
  }


  public OAuth2Client jwks(Object jwks) {
    
    this.jwks = jwks;
    return this;
  }

   /**
   * Get jwks
   * @return jwks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getJwks() {
    return jwks;
  }


  public void setJwks(Object jwks) {
    this.jwks = jwks;
  }


  public OAuth2Client jwksUri(String jwksUri) {
    
    this.jwksUri = jwksUri;
    return this;
  }

   /**
   * URL for the Client&#39;s JSON Web Key Set [JWK] document. If the Client signs requests to the Server, it contains the signing key(s) the Server uses to validate signatures from the Client. The JWK Set MAY also contain the Client&#39;s encryption keys(s), which are used by the Server to encrypt responses to the Client. When both signing and encryption keys are made available, a use (Key Use) parameter value is REQUIRED for all keys in the referenced JWK Set to indicate each key&#39;s intended usage. Although some algorithms allow the same key to be used for both signatures and encryption, doing so is NOT RECOMMENDED, as it is less secure. The JWK x5c parameter MAY be used to provide X.509 representations of keys provided. When used, the bare key values MUST still be present and MUST match those in the certificate.
   * @return jwksUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL for the Client's JSON Web Key Set [JWK] document. If the Client signs requests to the Server, it contains the signing key(s) the Server uses to validate signatures from the Client. The JWK Set MAY also contain the Client's encryption keys(s), which are used by the Server to encrypt responses to the Client. When both signing and encryption keys are made available, a use (Key Use) parameter value is REQUIRED for all keys in the referenced JWK Set to indicate each key's intended usage. Although some algorithms allow the same key to be used for both signatures and encryption, doing so is NOT RECOMMENDED, as it is less secure. The JWK x5c parameter MAY be used to provide X.509 representations of keys provided. When used, the bare key values MUST still be present and MUST match those in the certificate.")

  public String getJwksUri() {
    return jwksUri;
  }


  public void setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
  }


  public OAuth2Client logoUri(String logoUri) {
    
    this.logoUri = logoUri;
    return this;
  }

   /**
   * LogoURI is an URL string that references a logo for the client.
   * @return logoUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LogoURI is an URL string that references a logo for the client.")

  public String getLogoUri() {
    return logoUri;
  }


  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }


  public OAuth2Client metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public OAuth2Client owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Owner is a string identifying the owner of the OAuth 2.0 Client.
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Owner is a string identifying the owner of the OAuth 2.0 Client.")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public OAuth2Client policyUri(String policyUri) {
    
    this.policyUri = policyUri;
    return this;
  }

   /**
   * PolicyURI is a URL string that points to a human-readable privacy policy document that describes how the deployment organization collects, uses, retains, and discloses personal data.
   * @return policyUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PolicyURI is a URL string that points to a human-readable privacy policy document that describes how the deployment organization collects, uses, retains, and discloses personal data.")

  public String getPolicyUri() {
    return policyUri;
  }


  public void setPolicyUri(String policyUri) {
    this.policyUri = policyUri;
  }


  public OAuth2Client postLogoutRedirectUris(List<String> postLogoutRedirectUris) {
    
    this.postLogoutRedirectUris = postLogoutRedirectUris;
    return this;
  }

  public OAuth2Client addPostLogoutRedirectUrisItem(String postLogoutRedirectUrisItem) {
    if (this.postLogoutRedirectUris == null) {
      this.postLogoutRedirectUris = new ArrayList<>();
    }
    this.postLogoutRedirectUris.add(postLogoutRedirectUrisItem);
    return this;
  }

   /**
   * Get postLogoutRedirectUris
   * @return postLogoutRedirectUris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPostLogoutRedirectUris() {
    return postLogoutRedirectUris;
  }


  public void setPostLogoutRedirectUris(List<String> postLogoutRedirectUris) {
    this.postLogoutRedirectUris = postLogoutRedirectUris;
  }


  public OAuth2Client redirectUris(List<String> redirectUris) {
    
    this.redirectUris = redirectUris;
    return this;
  }

  public OAuth2Client addRedirectUrisItem(String redirectUrisItem) {
    if (this.redirectUris == null) {
      this.redirectUris = new ArrayList<>();
    }
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

   /**
   * Get redirectUris
   * @return redirectUris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRedirectUris() {
    return redirectUris;
  }


  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }


  public OAuth2Client requestObjectSigningAlg(String requestObjectSigningAlg) {
    
    this.requestObjectSigningAlg = requestObjectSigningAlg;
    return this;
  }

   /**
   * JWS [JWS] alg algorithm [JWA] that MUST be used for signing Request Objects sent to the OP. All Request Objects from this Client MUST be rejected, if not signed with this algorithm.
   * @return requestObjectSigningAlg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "JWS [JWS] alg algorithm [JWA] that MUST be used for signing Request Objects sent to the OP. All Request Objects from this Client MUST be rejected, if not signed with this algorithm.")

  public String getRequestObjectSigningAlg() {
    return requestObjectSigningAlg;
  }


  public void setRequestObjectSigningAlg(String requestObjectSigningAlg) {
    this.requestObjectSigningAlg = requestObjectSigningAlg;
  }


  public OAuth2Client requestUris(List<String> requestUris) {
    
    this.requestUris = requestUris;
    return this;
  }

  public OAuth2Client addRequestUrisItem(String requestUrisItem) {
    if (this.requestUris == null) {
      this.requestUris = new ArrayList<>();
    }
    this.requestUris.add(requestUrisItem);
    return this;
  }

   /**
   * Get requestUris
   * @return requestUris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRequestUris() {
    return requestUris;
  }


  public void setRequestUris(List<String> requestUris) {
    this.requestUris = requestUris;
  }


  public OAuth2Client responseTypes(List<String> responseTypes) {
    
    this.responseTypes = responseTypes;
    return this;
  }

  public OAuth2Client addResponseTypesItem(String responseTypesItem) {
    if (this.responseTypes == null) {
      this.responseTypes = new ArrayList<>();
    }
    this.responseTypes.add(responseTypesItem);
    return this;
  }

   /**
   * Get responseTypes
   * @return responseTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getResponseTypes() {
    return responseTypes;
  }


  public void setResponseTypes(List<String> responseTypes) {
    this.responseTypes = responseTypes;
  }


  public OAuth2Client scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Scope is a string containing a space-separated list of scope values (as described in Section 3.3 of OAuth 2.0 [RFC6749]) that the client can use when requesting access tokens.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Scope is a string containing a space-separated list of scope values (as described in Section 3.3 of OAuth 2.0 [RFC6749]) that the client can use when requesting access tokens.")

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public OAuth2Client sectorIdentifierUri(String sectorIdentifierUri) {
    
    this.sectorIdentifierUri = sectorIdentifierUri;
    return this;
  }

   /**
   * URL using the https scheme to be used in calculating Pseudonymous Identifiers by the OP. The URL references a file with a single JSON array of redirect_uri values.
   * @return sectorIdentifierUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL using the https scheme to be used in calculating Pseudonymous Identifiers by the OP. The URL references a file with a single JSON array of redirect_uri values.")

  public String getSectorIdentifierUri() {
    return sectorIdentifierUri;
  }


  public void setSectorIdentifierUri(String sectorIdentifierUri) {
    this.sectorIdentifierUri = sectorIdentifierUri;
  }


  public OAuth2Client subjectType(String subjectType) {
    
    this.subjectType = subjectType;
    return this;
  }

   /**
   * SubjectType requested for responses to this Client. The subject_types_supported Discovery parameter contains a list of the supported subject_type values for this server. Valid types include &#x60;pairwise&#x60; and &#x60;public&#x60;.
   * @return subjectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SubjectType requested for responses to this Client. The subject_types_supported Discovery parameter contains a list of the supported subject_type values for this server. Valid types include `pairwise` and `public`.")

  public String getSubjectType() {
    return subjectType;
  }


  public void setSubjectType(String subjectType) {
    this.subjectType = subjectType;
  }


  public OAuth2Client tokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
    
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
    return this;
  }

   /**
   * Requested Client Authentication method for the Token Endpoint. The options are client_secret_post, client_secret_basic, private_key_jwt, and none.
   * @return tokenEndpointAuthMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requested Client Authentication method for the Token Endpoint. The options are client_secret_post, client_secret_basic, private_key_jwt, and none.")

  public String getTokenEndpointAuthMethod() {
    return tokenEndpointAuthMethod;
  }


  public void setTokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
  }


  public OAuth2Client tokenEndpointAuthSigningAlg(String tokenEndpointAuthSigningAlg) {
    
    this.tokenEndpointAuthSigningAlg = tokenEndpointAuthSigningAlg;
    return this;
  }

   /**
   * Requested Client Authentication signing algorithm for the Token Endpoint.
   * @return tokenEndpointAuthSigningAlg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requested Client Authentication signing algorithm for the Token Endpoint.")

  public String getTokenEndpointAuthSigningAlg() {
    return tokenEndpointAuthSigningAlg;
  }


  public void setTokenEndpointAuthSigningAlg(String tokenEndpointAuthSigningAlg) {
    this.tokenEndpointAuthSigningAlg = tokenEndpointAuthSigningAlg;
  }


  public OAuth2Client tosUri(String tosUri) {
    
    this.tosUri = tosUri;
    return this;
  }

   /**
   * TermsOfServiceURI is a URL string that points to a human-readable terms of service document for the client that describes a contractual relationship between the end-user and the client that the end-user accepts when authorizing the client.
   * @return tosUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TermsOfServiceURI is a URL string that points to a human-readable terms of service document for the client that describes a contractual relationship between the end-user and the client that the end-user accepts when authorizing the client.")

  public String getTosUri() {
    return tosUri;
  }


  public void setTosUri(String tosUri) {
    this.tosUri = tosUri;
  }


  public OAuth2Client updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * UpdatedAt returns the timestamp of the last update.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UpdatedAt returns the timestamp of the last update.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public OAuth2Client userinfoSignedResponseAlg(String userinfoSignedResponseAlg) {
    
    this.userinfoSignedResponseAlg = userinfoSignedResponseAlg;
    return this;
  }

   /**
   * JWS alg algorithm [JWA] REQUIRED for signing UserInfo Responses. If this is specified, the response will be JWT [JWT] serialized, and signed using JWS. The default, if omitted, is for the UserInfo Response to return the Claims as a UTF-8 encoded JSON object using the application/json content-type.
   * @return userinfoSignedResponseAlg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "JWS alg algorithm [JWA] REQUIRED for signing UserInfo Responses. If this is specified, the response will be JWT [JWT] serialized, and signed using JWS. The default, if omitted, is for the UserInfo Response to return the Claims as a UTF-8 encoded JSON object using the application/json content-type.")

  public String getUserinfoSignedResponseAlg() {
    return userinfoSignedResponseAlg;
  }


  public void setUserinfoSignedResponseAlg(String userinfoSignedResponseAlg) {
    this.userinfoSignedResponseAlg = userinfoSignedResponseAlg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2Client oAuth2Client = (OAuth2Client) o;
    return Objects.equals(this.allowedCorsOrigins, oAuth2Client.allowedCorsOrigins) &&
        Objects.equals(this.audience, oAuth2Client.audience) &&
        Objects.equals(this.backchannelLogoutSessionRequired, oAuth2Client.backchannelLogoutSessionRequired) &&
        Objects.equals(this.backchannelLogoutUri, oAuth2Client.backchannelLogoutUri) &&
        Objects.equals(this.clientId, oAuth2Client.clientId) &&
        Objects.equals(this.clientName, oAuth2Client.clientName) &&
        Objects.equals(this.clientSecret, oAuth2Client.clientSecret) &&
        Objects.equals(this.clientSecretExpiresAt, oAuth2Client.clientSecretExpiresAt) &&
        Objects.equals(this.clientUri, oAuth2Client.clientUri) &&
        Objects.equals(this.contacts, oAuth2Client.contacts) &&
        Objects.equals(this.createdAt, oAuth2Client.createdAt) &&
        Objects.equals(this.frontchannelLogoutSessionRequired, oAuth2Client.frontchannelLogoutSessionRequired) &&
        Objects.equals(this.frontchannelLogoutUri, oAuth2Client.frontchannelLogoutUri) &&
        Objects.equals(this.grantTypes, oAuth2Client.grantTypes) &&
        Objects.equals(this.jwks, oAuth2Client.jwks) &&
        Objects.equals(this.jwksUri, oAuth2Client.jwksUri) &&
        Objects.equals(this.logoUri, oAuth2Client.logoUri) &&
        Objects.equals(this.metadata, oAuth2Client.metadata) &&
        Objects.equals(this.owner, oAuth2Client.owner) &&
        Objects.equals(this.policyUri, oAuth2Client.policyUri) &&
        Objects.equals(this.postLogoutRedirectUris, oAuth2Client.postLogoutRedirectUris) &&
        Objects.equals(this.redirectUris, oAuth2Client.redirectUris) &&
        Objects.equals(this.requestObjectSigningAlg, oAuth2Client.requestObjectSigningAlg) &&
        Objects.equals(this.requestUris, oAuth2Client.requestUris) &&
        Objects.equals(this.responseTypes, oAuth2Client.responseTypes) &&
        Objects.equals(this.scope, oAuth2Client.scope) &&
        Objects.equals(this.sectorIdentifierUri, oAuth2Client.sectorIdentifierUri) &&
        Objects.equals(this.subjectType, oAuth2Client.subjectType) &&
        Objects.equals(this.tokenEndpointAuthMethod, oAuth2Client.tokenEndpointAuthMethod) &&
        Objects.equals(this.tokenEndpointAuthSigningAlg, oAuth2Client.tokenEndpointAuthSigningAlg) &&
        Objects.equals(this.tosUri, oAuth2Client.tosUri) &&
        Objects.equals(this.updatedAt, oAuth2Client.updatedAt) &&
        Objects.equals(this.userinfoSignedResponseAlg, oAuth2Client.userinfoSignedResponseAlg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedCorsOrigins, audience, backchannelLogoutSessionRequired, backchannelLogoutUri, clientId, clientName, clientSecret, clientSecretExpiresAt, clientUri, contacts, createdAt, frontchannelLogoutSessionRequired, frontchannelLogoutUri, grantTypes, jwks, jwksUri, logoUri, metadata, owner, policyUri, postLogoutRedirectUris, redirectUris, requestObjectSigningAlg, requestUris, responseTypes, scope, sectorIdentifierUri, subjectType, tokenEndpointAuthMethod, tokenEndpointAuthSigningAlg, tosUri, updatedAt, userinfoSignedResponseAlg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2Client {\n");
    sb.append("    allowedCorsOrigins: ").append(toIndentedString(allowedCorsOrigins)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    backchannelLogoutSessionRequired: ").append(toIndentedString(backchannelLogoutSessionRequired)).append("\n");
    sb.append("    backchannelLogoutUri: ").append(toIndentedString(backchannelLogoutUri)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    clientSecretExpiresAt: ").append(toIndentedString(clientSecretExpiresAt)).append("\n");
    sb.append("    clientUri: ").append(toIndentedString(clientUri)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    frontchannelLogoutSessionRequired: ").append(toIndentedString(frontchannelLogoutSessionRequired)).append("\n");
    sb.append("    frontchannelLogoutUri: ").append(toIndentedString(frontchannelLogoutUri)).append("\n");
    sb.append("    grantTypes: ").append(toIndentedString(grantTypes)).append("\n");
    sb.append("    jwks: ").append(toIndentedString(jwks)).append("\n");
    sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    policyUri: ").append(toIndentedString(policyUri)).append("\n");
    sb.append("    postLogoutRedirectUris: ").append(toIndentedString(postLogoutRedirectUris)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    requestObjectSigningAlg: ").append(toIndentedString(requestObjectSigningAlg)).append("\n");
    sb.append("    requestUris: ").append(toIndentedString(requestUris)).append("\n");
    sb.append("    responseTypes: ").append(toIndentedString(responseTypes)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    sectorIdentifierUri: ").append(toIndentedString(sectorIdentifierUri)).append("\n");
    sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
    sb.append("    tokenEndpointAuthMethod: ").append(toIndentedString(tokenEndpointAuthMethod)).append("\n");
    sb.append("    tokenEndpointAuthSigningAlg: ").append(toIndentedString(tokenEndpointAuthSigningAlg)).append("\n");
    sb.append("    tosUri: ").append(toIndentedString(tosUri)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    userinfoSignedResponseAlg: ").append(toIndentedString(userinfoSignedResponseAlg)).append("\n");
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

