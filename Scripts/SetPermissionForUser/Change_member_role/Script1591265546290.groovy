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

@com.kms.katalon.core.annotation.SetUp
def Setup() {
	WebUI.openBrowser('http://192.168.1.10:8065/login')
}

def target_email_temp = 'tlvietdanh1@gmail.com'
def role_temp = 'admin' 

// login to admin account

'Call login functions'
WebUI.callTestCase(findTestCase('Test Cases/Login/login_function'), [('var_user') : 'tlvietdanh@gmail.com', ('var_password') : '13101998'],
	FailureHandling.STOP_ON_FAILURE)


WebUI.click(findTestObject('Object Repository/Page_User_Permission/1_menu_icon'))

WebUI.click(findTestObject('Object Repository/Page_User_Permission/2_system_control_tabs'))

WebUI.click(findTestObject('Object Repository/Page_User_Permission/users_tabs'))

WebUI.setText(findTestObject('Object Repository/Page_User_Permission/input_searchUsers'), target_email_temp);


if(!target_email_temp.toString().equals('') && WebUI.verifyElementPresent(findTestObject('Object Repository/Page_User_Permission/span_Email'), 2, FailureHandling.OPTIONAL)) {
	def email = WebUI.getText(findTestObject('Object Repository/Page_User_Permission/span_Email'))
	WebUI.verifyEqual(email.contains(target_email_temp), true)
	def button = WebUI.getText(findTestObject('Object Repository/Page_User_Permission/span_Member'))
	
	if(WebUI.verifyEqual(button.contains('Member'), true, FailureHandling.OPTIONAL)) {
		WebUI.click(findTestObject('Object Repository/Page_User_Permission/span_Member'))
		
		WebUI.click(findTestObject('Object Repository/Page_User_Permission/span_Manage Roles'))
		
		WebUI.click(findTestObject('Object Repository/Page_User_Permission/radio_button_systemadmin'))
		
		
		WebUI.click(findTestObject('Object Repository/Page_User_Permission/button_Save'))
	
	}
}

@com.kms.katalon.core.annotation.TearDown
def Teardown() {
	WebUI.closeBrowser()
}


