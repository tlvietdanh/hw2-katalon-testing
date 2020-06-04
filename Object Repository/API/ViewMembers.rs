<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>ViewMembers</name>
   <tag></tag>
   <elementGuidId>6be3c285-b454-474a-b621-1a3071e4bd2a</elementGuidId>
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
   <restUrl>${url}/api/v4/users?in_channel=${channelID}&amp;page=0&amp;per_page=100&amp;sort=</restUrl>
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
      <id>1d78a678-aa66-437e-8050-f01a61757e48</id>
      <masked>false</masked>
      <name>url</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.CloudCookies</defaultValue>
      <description></description>
      <id>a27011b3-b7cd-43dd-8777-560af9113fd7</id>
      <masked>false</masked>
      <name>Cookie</name>
   </variables>
   <variables>
      <defaultValue>'osh9j8rzk3859xe4ajhgfy3pkh'</defaultValue>
      <description></description>
      <id>6409261c-33e0-4ce3-80ea-0e112108edda</id>
      <masked>false</masked>
      <name>channelID</name>
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
