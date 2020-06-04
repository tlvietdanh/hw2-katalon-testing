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
	WebUI.openBrowser('https://hw02-mattermast-webapp-master.herokuapp.com/login')
}

'Call login functions'
WebUI.callTestCase(findTestCase('Test Cases/Login/login_function'), [('var_user') : var_email, ('var_password') : var_password],
	FailureHandling.STOP_ON_FAILURE)

def errorMess = WebUI.getText(findTestObject('Object Repository/Page_Mattermost_login/label_status_login'))

		WebUI.verifyEqual(errorMess.contains('Enter a valid email or username and/or password.'), true)



@com.kms.katalon.core.annotation.TearDown
def Teardown() {
	WebUI.closeBrowser()
}