package testHomePage;

import base.MobileAPI;
import homePage.TextFieldsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestTextFieldsPage extends MobileAPI {


    @Test
    public void testClickOnTextFields(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TextFieldsPage textFieldsPage = PageFactory.initElements(ad,TextFieldsPage.class);
        textFieldsPage.clickOnTextFields();
    }

    @Test
    public void testTextTextFields(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TextFieldsPage textFieldsPage = PageFactory.initElements(ad,TextFieldsPage.class);
        textFieldsPage.getTextAndCheck();
    }
}
