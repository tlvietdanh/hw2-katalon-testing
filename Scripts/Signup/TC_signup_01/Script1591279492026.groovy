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
	WebUI.openBrowser('https://hw02-mattermast-webapp-master.herokuapp.com/signup_email')
	
}

'Call signup functions'

WebUI.callTestCase(findTestCase('Test Cases/Signup/signup_function'), [('var_email') : var_email ,('var_name') : var_name, ('var_password') : var_password], FailureHandling.STOP_ON_FAILURE)


'Get status expected test case result'
switch(var_statusExpectedResult.toString())
{
	case 'email is empty':
		'Verify when expected test case signup with email is empty'
		def errorMess = WebUI.getText(findTestObject('Object Repository/Page_Mattermost_Signup/label_status_email'))
		WebUI.verifyEqual(errorMess.contains('This field is required'), true)
		break;
	case 'email is not correct':
		'Verify when expected test case signup fail with email is not correct'
		def errorMess = WebUI.getText(findTestObject('Object Repository/Page_Mattermost_Signup/label_status_email'))
		WebUI.verifyEqual(errorMess.contains('Please enter a valid email address'), true)
		break;
}

@com.kms.katalon.core.annotation.TearDown
def Teardown() {
	WebUI.closeBrowser()
}
