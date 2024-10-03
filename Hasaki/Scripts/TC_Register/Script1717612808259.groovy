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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hasaki.vn/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Login/button_Yes_KhuyenMai'))

WebUI.click(findTestObject('Page_Login/img_Page'))

WebUI.click(findTestObject('Page_Register/Link_Register'))

WebUI.setText(findTestObject('Page_Register/input_email_or_St'), username)

WebUI.click(findTestObject('Page_Register/button_layma'))

WebUI.setText(findTestObject('Page_Register/input_nhapma'), InsertCode)

WebUI.setEncryptedText(findTestObject('Page_Register/input_password'), password)

WebUI.setText(findTestObject('Page_Register/input_fullname'), fullname)

WebUI.click(findTestObject('Page_Register/input_genderNu'))

WebUI.selectOptionByValue(findTestObject('Page_Register/select_Ngay                                                                                                    1                                                                                                    2'), 
    day, false)

WebUI.selectOptionByValue(findTestObject('Page_Register/select_Thang                                                                                                    1                                                                                                    2'), 
    month, false)

WebUI.selectOptionByValue(findTestObject('Page_Register/select_Nam                                                                                                    2008                                                                                                    2007'), 
    year, false)

WebUI.click(findTestObject('Page_Register/button_register'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Register/Expected'), Expected)

WebUI.closeBrowser()

