<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>ViewChannels</name>
   <tag></tag>
   <elementGuidId>4c895342-dc9e-4e0c-85bd-b04bf2d7d66c</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Cookie</name>
      <type>Main</type>
      <value>${Cookie}</value>
   </httpHeaderProperties>
   <katalonVersion>7.5.2</katalonVersion>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${url}/api/v4/teams/${ChannelID}/channels?page=0&amp;per_page=100</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.BaseUrl</defaultValue>
      <description></description>
      <id>94abc4cb-f193-4e48-b731-2657ae288d83</id>
      <masked>false</masked>
      <name>url</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.CloudCookies</defaultValue>
      <description></description>
      <id>679fa1bb-f4f6-45ec-9fcc-3d868e068f47</id>
      <masked>false</masked>
      <name>Cookie</name>
   </variables>
   <variables>
      <defaultValue>'xk8r4ndcsir5teei56918o7inc'</defaultValue>
      <description></description>
      <id>dcc4a696-c339-4275-8942-fa2086952e77</id>
      <masked>false</masked>
      <name>ChannelID</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
