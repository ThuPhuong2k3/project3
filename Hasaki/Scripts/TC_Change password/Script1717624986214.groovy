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

WebUI.click(findTestObject('Page_Login/Link_Login'))

WebUI.setText(findTestObject('Page_Login/input_username'), 'thuphuongtot@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Login/input_password'), Current_Password)

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.click(findTestObject('Page_Change password/Page_Hasaki.vn  M Phm  Clinic/img_icon_account'))

WebUI.click(findTestObject('Page_Change password/Page_Hasaki.vn  M Phm  Clinic/Link_account'))

WebUI.click(findTestObject('Page_Change password/Page_Ti khon ca ti  Hasaki.vn/Link_ThongTinTaiKhoan'))

WebUI.click(findTestObject('Page_Change password/Page_Thng Tin Ti khon  Hasaki.vn/Button_DoiMatKhau_CapNhat'))

WebUI.setEncryptedText(findTestObject('Page_Change password/Page_Thay i mt khu  Hasaki.vn/input_passwordOld'), Current_Password)

WebUI.setEncryptedText(findTestObject('Page_Change password/Page_Thay i mt khu  Hasaki.vn/input_passwordNew'), New_Password)

WebUI.setEncryptedText(findTestObject('Page_Change password/Page_Thay i mt khu  Hasaki.vn/input_passwordConfirm'), Retype)

WebUI.click(findTestObject('Page_Change password/Page/button_CapNhat'))

WebUI.verifyElementPresent(findTestObject('Page_Change password/Page_Thng Tin Ti khon  Hasaki.vn/Expected_Matkhaucuabanuocthaydoithanhcong'), 
    0)

WebUI.closeBrowser()

