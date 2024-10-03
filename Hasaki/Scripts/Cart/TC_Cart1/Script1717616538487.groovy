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

WebUI.navigateToUrl('https://hasaki.vn/hang-moi-ve.html?sort=position')

WebUI.switchToWindowTitle('Hàng mới về | Hasaki.vn')

WebUI.click(findTestObject('Object Repository/Functional_Cart/Functional_Cart1/button_Yes_KhuyenMai'))

WebUI.click(findTestObject('Object Repository/Functional_Cart/Functional_Cart1/img_Project_KemTayLongVeetPure'))

WebUI.click(findTestObject('Object Repository/Functional_Cart/Functional_Cart1/button_GioHang'))

WebUI.click(findTestObject('Object Repository/Functional_Cart/Functional_Cart1/button_GioHang'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional_Cart/Functional_Cart1/span_2'), 0)

WebUI.closeBrowser()
