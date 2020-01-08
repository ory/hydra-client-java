

# Name

Name Name Name Name represents an X.509 distinguished name. This only includes the common elements of a DN. When parsing, all elements are stored in Names and non-standard elements can be extracted from there. When marshaling, elements in ExtraNames are appended and override other values with the same OID.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **List&lt;String&gt;** | country |  [optional]
**extraNames** | [**List&lt;AttributeTypeAndValue&gt;**](AttributeTypeAndValue.md) | extra names |  [optional]
**locality** | **List&lt;String&gt;** | locality |  [optional]
**names** | [**List&lt;AttributeTypeAndValue&gt;**](AttributeTypeAndValue.md) | names |  [optional]
**serialNumber** | **String** | serial number |  [optional]
**streetAddress** | **List&lt;String&gt;** | street address |  [optional]



