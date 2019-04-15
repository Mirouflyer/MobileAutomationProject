package testHomePage;

import base.MobileAPI;
import homePage.TextViewPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestTextViewPage extends MobileAPI {

    @Test
    public void testClickOnTextFields(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TextViewPage textViewPage = PageFactory.initElements(ad,TextViewPage.class);
        textViewPage.clickOnTextView();
    }

    @Test
    public void testTextTextFields(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TextViewPage textViewPage = PageFactory.initElements(ad,TextViewPage.class);
        textViewPage.getTextAndCheck();
    }
}
