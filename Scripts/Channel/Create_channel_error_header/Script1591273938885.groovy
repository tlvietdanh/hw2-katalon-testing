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

// create a team if not existed
WebUI.verifyEqual(WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create_New_Channel_Local/txt_error_duplicate'), 1), true)

// WebUI.navigateToUrl('https://hw02-mattermast-webapp-master.herokuapp.com/asdasd/channels/town-square')
WebUI.click(findTestObject('Object Repository/Page_Create_New_Channel_Local/btn_create_channel_local'))



'Checking create private channel or public channel'
if(is_private.toString().equals("0")) {
	WebUI.click(findTestObject('Object Repository/Page_Create_New_Channel_Local/rdb_private_channel'))
}
else {
	WebUI.click(findTestObject('Object Repository/Page_Create_New_Channel_Local/rdb_public_channel'))
}


WebUI.setText(findTestObject('Object Repository/Page_Create_New_Channel_Local/input_newChannelName'), name)

WebUI.setText(findTestObject('Object Repository/Page_Create_New_Channel_Local/textarea_(optional)_newChannelPurpose'), purpose)

WebUI.setText(findTestObject('Object Repository/Page_Create_New_Channel_Local/textarea_(optional)_newChannelHeader'), header)

WebUI.click(findTestObject('Page_Create_New_Channel_Local/btn_submit'))

if(name.toString().length() < 2) {
	def errorMess = WebUI.getText(findTestObject('Object Repository/Page_Create_New_Channel_Local/txt_errorLabel'))
	
	WebUI.verifyEqual(errorMess.contains('Display name must have at least 2 characters.'), true)
}

if(WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create_New_Channel_Local/txt_error_duplicate'), 2, FailureHandling.OPTIONAL) == true) {
	def dupErr = WebUI.getText(findTestObject('Object Repository/Page_Create_New_Channel_Local/txt_error_duplicate'));
	WebUI.verifyEqual(dupErr.contains('A channel with that name already exists on the same team'), true)
	WebUI.click(findTestObject('Object Repository/Page_Create_New_Channel_Local/button_Cancel_Create_Channel'))
}


@com.kms.katalon.core.annotation.TearDown
def Teardown() {
	WebUI.closeBrowser()
}


