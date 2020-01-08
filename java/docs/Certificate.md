

# Certificate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorityKeyId** | **List&lt;Integer&gt;** | authority key Id |  [optional]
**basicConstraintsValid** | **Boolean** | BasicConstraintsValid indicates whether IsCA, MaxPathLen, and MaxPathLenZero are valid. |  [optional]
**crLDistributionPoints** | **List&lt;String&gt;** | CRL Distribution Points |  [optional]
**dnSNames** | **List&lt;String&gt;** | Subject Alternate Name values. (Note that these values may not be valid if invalid values were contained within a parsed certificate. For example, an element of DNSNames may not be a valid DNS domain name.) |  [optional]
**emailAddresses** | **List&lt;String&gt;** | email addresses |  [optional]
**excludedDNSDomains** | **List&lt;String&gt;** | excluded DNS domains |  [optional]
**excludedEmailAddresses** | **List&lt;String&gt;** | excluded email addresses |  [optional]
**excludedIPRanges** | [**List&lt;IPNet&gt;**](IPNet.md) | excluded IP ranges |  [optional]
**excludedURIDomains** | **List&lt;String&gt;** | excluded URI domains |  [optional]
**extKeyUsage** | **List&lt;Long&gt;** | ext key usage |  [optional]
**extensions** | [**List&lt;Extension&gt;**](Extension.md) | Extensions contains raw X.509 extensions. When parsing certificates, this can be used to extract non-critical extensions that are not parsed by this package. When marshaling certificates, the Extensions field is ignored, see ExtraExtensions. |  [optional]
**extraExtensions** | [**List&lt;Extension&gt;**](Extension.md) | ExtraExtensions contains extensions to be copied, raw, into any marshaled certificates. Values override any extensions that would otherwise be produced based on the other fields. The ExtraExtensions field is not populated when parsing certificates, see Extensions. |  [optional]
**ipAddresses** | [**List&lt;List&lt;Integer&gt;&gt;**](List.md) | IP addresses |  [optional]
**isCA** | **Boolean** | is c a |  [optional]
**issuer** | [**Name**](Name.md) |  |  [optional]
**issuingCertificateURL** | **List&lt;String&gt;** | issuing certificate URL |  [optional]
**keyUsage** | **Long** | KeyUsage KeyUsage KeyUsage KeyUsage represents the set of actions that are valid for a given key. It&#39;s a bitmap of the KeyUsage* constants. |  [optional]
**maxPathLen** | **Long** | MaxPathLen and MaxPathLenZero indicate the presence and value of the BasicConstraints&#39; \&quot;pathLenConstraint\&quot;.  When parsing a certificate, a positive non-zero MaxPathLen means that the field was specified, -1 means it was unset, and MaxPathLenZero being true mean that the field was explicitly set to zero. The case of MaxPathLen&#x3D;&#x3D;0 with MaxPathLenZero&#x3D;&#x3D;false should be treated equivalent to -1 (unset).  When generating a certificate, an unset pathLenConstraint can be requested with either MaxPathLen &#x3D;&#x3D; -1 or using the zero value for both MaxPathLen and MaxPathLenZero. |  [optional]
**maxPathLenZero** | **Boolean** | MaxPathLenZero indicates that BasicConstraintsValid&#x3D;&#x3D;true and MaxPathLen&#x3D;&#x3D;0 should be interpreted as an actual maximum path length of zero. Otherwise, that combination is interpreted as MaxPathLen not being set. |  [optional]
**notBefore** | [**OffsetDateTime**](OffsetDateTime.md) | not before Format: date-time Format: date-time Format: date-time |  [optional]
**ocSPServer** | **List&lt;String&gt;** | RFC 5280, 4.2.2.1 (Authority Information Access) |  [optional]
**permittedDNSDomains** | **List&lt;String&gt;** | permitted DNS domains |  [optional]
**permittedDNSDomainsCritical** | **Boolean** | Name constraints |  [optional]
**permittedEmailAddresses** | **List&lt;String&gt;** | permitted email addresses |  [optional]
**permittedIPRanges** | [**List&lt;IPNet&gt;**](IPNet.md) | permitted IP ranges |  [optional]
**permittedURIDomains** | **List&lt;String&gt;** | permitted URI domains |  [optional]
**policyIdentifiers** | [**List&lt;List&lt;Long&gt;&gt;**](List.md) | policy identifiers |  [optional]
**publicKey** | [**Object**](.md) | public key |  [optional]
**publicKeyAlgorithm** | **Long** | PublicKeyAlgorithm PublicKeyAlgorithm PublicKeyAlgorithm public key algorithm |  [optional]
**raw** | **List&lt;Integer&gt;** | raw |  [optional]
**rawIssuer** | **List&lt;Integer&gt;** | raw issuer |  [optional]
**rawSubject** | **List&lt;Integer&gt;** | raw subject |  [optional]
**rawSubjectPublicKeyInfo** | **List&lt;Integer&gt;** | raw subject public key info |  [optional]
**rawTBSCertificate** | **List&lt;Integer&gt;** | raw t b s certificate |  [optional]
**serialNumber** | [**Object**](.md) | Operations always take pointer arguments (*Int) rather than Int values, and each unique Int value requires its own unique *Int pointer. To \&quot;copy\&quot; an Int value, an existing (or newly allocated) Int must be set to a new value using the Int.Set method; shallow copies of Ints are not supported and may lead to errors. |  [optional]
**signature** | **List&lt;Integer&gt;** | signature |  [optional]
**signatureAlgorithm** | **Long** | SignatureAlgorithm SignatureAlgorithm SignatureAlgorithm signature algorithm |  [optional]
**subject** | [**Name**](Name.md) |  |  [optional]
**subjectKeyId** | **List&lt;Integer&gt;** | subject key Id |  [optional]
**urIs** | [**List&lt;URL&gt;**](URL.md) | u r is |  [optional]
**unhandledCriticalExtensions** | [**List&lt;List&lt;Long&gt;&gt;**](List.md) | UnhandledCriticalExtensions contains a list of extension IDs that were not (fully) processed when parsing. Verify will fail if this slice is non-empty, unless verification is delegated to an OS library which understands all the critical extensions.  Users can access these extensions using Extensions and can remove elements from this slice if they believe that they have been handled. |  [optional]
**unknownExtKeyUsage** | [**List&lt;List&lt;Long&gt;&gt;**](List.md) | unknown ext key usage |  [optional]
**version** | **Long** | version |  [optional]



