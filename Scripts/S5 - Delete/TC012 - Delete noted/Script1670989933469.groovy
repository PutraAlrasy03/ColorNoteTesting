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

Mobile.startApplication('C:\\Users\\diana\\Downloads\\com.socialnmobile.dictapps.notepad.color.note_2022-10-26.apk', true)

Mobile.tap(findTestObject('Object Repository/S5 - Delete/TC012/android.widget.Button - SKIP (1)'), 0)

Mobile.tap(findTestObject('Object Repository/S5 - Delete/TC012/android.widget.FrameLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/S5 - Delete/TC012/android.widget.LinearLayout'), 0)

Mobile.setText(findTestObject('Object Repository/S5 - Delete/TC012/android.widget.EditText (1)'), 'Hello World', 0)

Mobile.tap(findTestObject('Object Repository/S5 - Delete/TC012/android.widget.ImageButton (2)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/S5 - Delete/TC012/android.widget.TextView - Hello World'), 0)

Mobile.tap(findTestObject('Object Repository/S5 - Delete/TC012/android.widget.ImageButton (3)'), 0)

Mobile.tap(findTestObject('Object Repository/S5 - Delete/TC012/android.widget.TextView - Delete (1)'), 0)

Mobile.tap(findTestObject('Object Repository/S5 - Delete/TC012/android.widget.Button - OK (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/S5 - Delete/TC012/android.widget.ListView'), 0)

Mobile.closeApplication()

