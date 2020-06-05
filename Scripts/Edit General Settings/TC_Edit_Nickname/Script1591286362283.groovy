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

WebUI.click(findTestObject('Object Repository/Page_Town Square-Mattermost_Homepage/span_Edit_Nickname'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square-Mattermost_Homepage/input_Nickname_nickname'), var_nickname)


WebUI.click(findTestObject('Object Repository/Page_Town Square-Mattermost_Homepage/span_Save_Nickname'))

@com.kms.katalon.core.annotation.TearDown
def Teardown() {
	WebUI.closeBrowser()
}