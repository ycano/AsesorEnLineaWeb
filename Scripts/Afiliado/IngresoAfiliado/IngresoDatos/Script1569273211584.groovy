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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://webasesorenlineaqa.azurewebsites.net/Affiliate/LoginAffiliate#!/')

WebUI.selectOptionByValue(findTestObject('Objetos_AL_Afiliado/Login/select_Seleccione el Tipo de AsesoriaAF'), '9', false)

WebUI.selectOptionByValue(findTestObject('Objetos_AL_Afiliado/Login/select_Seleccione el Tipo de DocumentoAF'), '1', true)

WebUI.setText(findTestObject('Objetos_AL_Afiliado/Login/input_CONTINUE_NumeroIdentificacionAF'), '1020483076')

WebUI.doubleClick(findTestObject('Objetos_AL_Afiliado/Login/div_CONTINUE_form-groupAF'))

WebUI.setText(findTestObject('Objetos_AL_Afiliado/Login/input_CONTINUE_EmailAF'), 'aa@aa.aa')

WebUI.click(findTestObject('Objetos_AL_Afiliado/Login/button_CONTINUEAF'))

WebUI.delay(10)

WebUI.selectOptionByValue(findTestObject('Objetos_AL_Afiliado/Login/select_Seleccione la EmpresaAF'), 'N900693655', true)

WebUI.click(findTestObject('Objetos_AL_Afiliado/Login/button_INGRESEAF'))

