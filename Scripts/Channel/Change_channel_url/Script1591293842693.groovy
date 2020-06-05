import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

@com.kms.katalon.core.annotation.SetUp
def Setup() {
	WebUI.openBrowser('http://192.168.1.10:8065/login')
}


'Call login functions'
WebUI.callTestCase(findTestCase('Test Cases/Login/login_function'), [('var_user') : 'tlvietdanh@gmail.com', ('var_password') : '13101998'],
	FailureHandling.STOP_ON_FAILURE)




WebUI.waitForElementVisible(findTestObject('Object Repository/Rename_channel/span_Town Square'), 2)


def url = WebUI.getUrl().substring(7);

String[] arr = url.split("/");

arr[arr.length - 1] = channel_url;

def newUrl = "";

for(int i = 0; i < arr.length; i++) {
	newUrl += arr[i] + '/';
}

printf(newUrl);

WebUI.navigateToUrl('http://' + newUrl);

if(WebUI.verifyElementPresent(findTestObject('Object Repository/Rename_channel/span_Town Square'), 1, FailureHandling.OPTIONAL)) {

	WebUI.click(findTestObject('Object Repository/Rename_channel/span_Town Square'));
	
	WebUI.click(findTestObject('Object Repository/Rename_channel/span_Rename Channel'));
	
	def status = WebUI.getText(findTestObject('Object Repository/Rename_channel/label_URL - Cannot be changed for the default channel'))
	if(!status.contains('Cannot be changed for the default channel')) {
		WebUI.setText(findTestObject('Object Repository/Rename_channel/input_http192108065testchannels_channel_name'), newChannelUrl)
	}
	
	WebUI.click(findTestObject('Object Repository/Rename_channel/button_Save'));
		
}


@com.kms.katalon.core.annotation.TearDown
def Teardown() {
	WebUI.closeBrowser()
}


