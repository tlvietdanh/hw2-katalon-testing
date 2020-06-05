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

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5 (9)'), 'hien')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733 (9)'), 'rA93q8IMOz5QsFH+BfUENA==')

WebUI.sendKeys(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733 (9)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Town Square - asdasd Mattermost/svg (2)'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - asdasd Mattermost/span_Create a Team'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - asdasd Mattermost/input_Team Name_teamNameInput'), team_name)

WebUI.sendKeys(findTestObject('Object Repository/Page_Town Square - asdasd Mattermost/input_Team Name_teamNameInput'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - asdasd Mattermost/input_Team Name_teamNameInput'), 'button')

WebUI.sendKeys(findTestObject('Object Repository/Page_Town Square - asdasd Mattermost/input_httpshw02-mattermast-webapp-masterher_2efa41'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Town Square - button Mattermost/div_bu'))

WebUI.closeBrowser()

