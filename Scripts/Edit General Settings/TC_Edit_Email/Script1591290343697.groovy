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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

@com.kms.katalon.core.annotation.SetUp
def Setup() {
	WebUI.openBrowser('http://192.168.1.10:8065/login')
}


'Call login functions'
WebUI.callTestCase(findTestCase('Test Cases/Login/login_function'), [('var_user') : 'tlvietdanh@gmail.com', ('var_password') : '13101998'],
	FailureHandling.STOP_ON_FAILURE)


WebUI.click(findTestObject('Object Repository/Page_Town Square-Mattermost_Homepage/span-mainmenu'))

WebUI.click(findTestObject('Object Repository/Page_Town Square-Mattermost_Homepage/span_Account Settings'))

WebUI.click(findTestObject('Object Repository/Page_Town Square-Mattermost_Homepage/button_General'))

WebUI.click(findTestObject('Object Repository/Page_Town Square-Mattermost_Homepage/span_Edit_Email'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square-Mattermost_Homepage/input_New Email_primaryEmail'), var_newemail)

WebUI.setText(findTestObject('Object Repository/Page_Town Square-Mattermost_Homepage/input_Confirm Email_confirmEmail'), var_confirmemail)

WebUI.setText(findTestObject('Object Repository/Page_Town Square-Mattermost_Homepage/input_Current Password_currentPassword'), var_currentpassword)

WebUI.click(findTestObject('Object Repository/Page_Town Square-Mattermost_Homepage/span_Save_Email'))

Thread.sleep(4000)

'Get status expected test case result'
switch(var_statusExpectedResult.toString())
{
	case 'new email is empty':
		'Verify when expected test case edit with new email is empty'
		def errorMess = WebUI.getText(findTestObject('Object Repository/Page_Town Square-Mattermost_Homepage/label_edit_email_status'))
		WebUI.verifyEqual(errorMess.contains('Please enter a valid email address'), true)
		break;
	case 'confirm email is not correct':
		'Verify when expected test case edit with confirm email is not correct'
		def errorMess = WebUI.getText(findTestObject('Object Repository/Page_Town Square-Mattermost_Homepage/label_edit_email_status'))
		WebUI.verifyEqual(errorMess.contains('The new emails you entered do not match.'), true)
		break;
	case 'current password is empty':
		'Verify when expected test case edit with password is empty'
		def errorMess = WebUI.getText(findTestObject('Object Repository/Page_Town Square-Mattermost_Homepage/label_edit_email_status'))
		WebUI.verifyEqual(errorMess.contains('Please enter your current password.'), true)
		break;
	case 'current password is not correct':
		'Verify when expected test case edit with password is not correct'
		def errorMess = WebUI.getText(findTestObject('Object Repository/Page_Town Square-Mattermost_Homepage/label_edit_email_status'))
		WebUI.verifyEqual(errorMess.contains('Your password is incorrect.'), true)
		break;
}

@com.kms.katalon.core.annotation.TearDown
def Teardown() {
	WebUI.closeBrowser()
}