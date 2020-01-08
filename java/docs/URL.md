

# URL

The general form represented is:  [scheme:][//[userinfo@]host][/]path[?query][#fragment]  URLs that do not start with a slash after the scheme are interpreted as:  scheme:opaque[?query][#fragment]  Note that the Path field is stored in decoded form: /%47%6f%2f becomes /Go/. A consequence is that it is impossible to tell which slashes in the Path were slashes in the raw URL and which were %2f. This distinction is rarely important, but when it is, the code should use RawPath, an optional field which only gets set if the default encoding is different from Path.  URL's String method uses the EscapedPath method to obtain the path. See the EscapedPath method for more details.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**forceQuery** | **Boolean** | force query |  [optional]
**fragment** | **String** | fragment |  [optional]
**host** | **String** | host |  [optional]
**opaque** | **String** | opaque |  [optional]
**path** | **String** | path |  [optional]
**rawPath** | **String** | raw path |  [optional]
**rawQuery** | **String** | raw query |  [optional]
**scheme** | **String** | scheme |  [optional]
**user** | [**Object**](.md) | Userinfo Userinfo Userinfo The Userinfo type is an immutable encapsulation of username and password details for a URL. An existing Userinfo value is guaranteed to have a username set (potentially empty, as allowed by RFC 2396), and optionally a password. |  [optional]



