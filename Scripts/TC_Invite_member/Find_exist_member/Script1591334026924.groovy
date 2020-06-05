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

WebUI.navigateToUrl('https://hw02-mattermast-webapp-master.herokuapp.com/login')

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5 (2)'), 'hien')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733 (2)'), 'rA93q8IMOz5QsFH+BfUENA==')

WebUI.sendKeys(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733 (2)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Find_exist_member/svg'))

WebUI.click(findTestObject('Find_exist_member/span_View Members'))

String[] data = ['taysat2211', 'baophamthien']

for(int i=0;i<data.length;i++){

WebUI.setText(findTestObject('Find_exist_member/input_Search users_searchUsersInput'), 
    data[i])

WebUI.click(findTestObject('Find_exist_member/img_Search users_Avatar Avatar-md'))
}

WebUI.click(findTestObject('Find_exist_member/span_'))

WebUI.closeBrowser()

