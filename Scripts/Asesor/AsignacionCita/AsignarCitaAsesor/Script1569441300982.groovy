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

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Objetos_AL_Asesor/CitaAsesor/button_Asignar CitaAsesor'), 30)

WebUI.click(findTestObject('Objetos_AL_Asesor/CitaAsesor/button_Asignar CitaAsesor'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Objetos_AL_Asesor/CitaAsesor/select_TipoDocumento'), '1', true)

WebUI.setText(findTestObject('Objetos_AL_Asesor/CitaAsesor/input_NmeroDocumento'), '71745533')

WebUI.setText(findTestObject('Objetos_AL_Asesor/CitaAsesor/input_E-mail _emailRegister'), 'aa@aa.aa')

WebUI.click(findTestObject('Objetos_AL_Asesor/CitaAsesor/label_Empresa'))

WebUI.waitForPageLoad(10)

WebUI.selectOptionByValue(findTestObject('Objetos_AL_Asesor/CitaAsesor/select_DIRECCIN TCNICA DE CONSTRUCCIONES SAS'), 'N811006031', 
    true)

WebUI.click(findTestObject('Objetos_AL_Asesor/CitaAsesor/button_Guardar'))

