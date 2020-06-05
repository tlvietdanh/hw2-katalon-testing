<<<<<<< HEAD
// importing some libraries we need
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.Cookie as Cookie
// open the default web browser at the base url provided
WebUI.openBrowser(GlobalVariable.BaseUrl)
// find the LoginEmail test object and set the text in it to the value in the global variable called "Username"
WebUI.setText(findTestObject('Object Repository/API/MatterMost_page/input_All team communication in one place searchable and accessible anywhere_loginId'), GlobalVariable.loginId)
// find the LoginPassword test object and set the text in it to the value in the global variable called "Password"
WebUI.setMaskedText(findTestObject('Object Repository/API/MatterMost_page/input_All team communication in one place searchable and accessible anywhere_password'), GlobalVariable.Password)
// find the form object and submit it
WebUI.submit(findTestObject('Object Repository/API/MatterMost_page/span_Sign in'))
// wait for the response (if it doesnt load then stop the test and fail)
WebUI.delay(5);
// assert that the title of the page returned is what we would expect
titleWindow = WebUI.getWindowTitle()
// get a reference to the web driver
WebDriver driver = DriverFactory.getWebDriver()
// create a temp variable to store the cookies
String cookieString = ''
// get all the cookies
Set<Cookie> cookieCollection = driver.manage().getCookies()
for (Cookie currentCookie : cookieCollection) {
	cookieString += (((currentCookie.getName() + '=') + currentCookie.getValue()) + '; ')
	print(cookieString)

}
// print the cookies for debugging
// set the cookies to our global variable. This is the most important bit!
GlobalVariable.CloudCookies = cookieString
// done! close the browser
WebUI.closeBrowser()
=======
// importing some libraries we need
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.Cookie as Cookie
// open the default web browser at the base url provided
WebUI.openBrowser(GlobalVariable.BaseUrl)
// find the LoginEmail test object and set the text in it to the value in the global variable called "Username"
WebUI.setText(findTestObject('Object Repository/API/MatterMost_page/input_All team communication in one place searchable and accessible anywhere_loginId'), GlobalVariable.loginId)
// find the LoginPassword test object and set the text in it to the value in the global variable called "Password"
WebUI.setMaskedText(findTestObject('Object Repository/API/MatterMost_page/input_All team communication in one place searchable and accessible anywhere_password'), GlobalVariable.Password)
// find the form object and submit it
WebUI.submit(findTestObject('Object Repository/API/MatterMost_page/span_Sign in'))
// wait for the response (if it doesnt load then stop the test and fail)
WebUI.delay(5);
// assert that the title of the page returned is what we would expect
titleWindow = WebUI.getWindowTitle()
// get a reference to the web driver
WebDriver driver = DriverFactory.getWebDriver()
// create a temp variable to store the cookies
String cookieString = ''
// get all the cookies
Set<Cookie> cookieCollection = driver.manage().getCookies()
for (Cookie currentCookie : cookieCollection) {
	cookieString += (((currentCookie.getName() + '=') + currentCookie.getValue()) + '; ')
	print(cookieString)

}
// print the cookies for debugging
println(cookieString)
// set the cookies to our global variable. This is the most important bit!
GlobalVariable.CloudCookies = cookieString
// done! close the browser
WebUI.closeBrowser()
WebUI.closeBrowser()
>>>>>>> ee2b10112d4030ebf980d1dc0b692e58b7be3439
