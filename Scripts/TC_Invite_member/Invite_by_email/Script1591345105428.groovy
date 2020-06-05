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

String[] data = ['ngochien96pt@gmail.com', 'ngochien2211@gmail.com']

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5 (8)'), 'hien')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733 (8)'), 'rA93q8IMOz5QsFH+BfUENA==')

WebUI.sendKeys(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733 (8)'), Keys.chord(Keys.ENTER))

for (int i = 0; i < data.length; i++) {
    WebUI.click(findTestObject('Page_Town Square - asdasd Mattermost/svg (1)'))

    WebUI.click(findTestObject('Page_Town Square - asdasd Mattermost/span_Invite People (1)'))

    WebUI.click(findTestObject('Page_Town Square - asdasd Mattermost/div_Add members (1)'))

    WebUI.setText(findTestObject('Page_Town Square - asdasd Mattermost/input_Add members_react-select-2-input (1)'), 'ngochien96pt@gmail.com')

    WebUI.click(findTestObject('Object Repository/Page_Town Square - asdasd Mattermost/div_taysat2211'))

    WebUI.click(findTestObject('Page_Town Square - asdasd Mattermost/button_Invite Members (1)'))

    WebUI.click(findTestObject('Page_Town Square - asdasd Mattermost/button_Done (1)'))

    WebUI.click(findTestObject('Object Repository/Page_Town Square - asdasd Mattermost/span'))
}

WebUI.closeBrowser()

