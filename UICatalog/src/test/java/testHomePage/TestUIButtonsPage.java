package testHomePage;


import base.MobileAPI;
import homePage.UIButtonsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;


public class TestUIButtonsPage extends MobileAPI {

    @Test
    public void testClickOnUiButtons(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        UIButtonsPage uiButtonsPage = PageFactory.initElements(ad, UIButtonsPage.class);
        uiButtonsPage.clickOnButtons();
    }

    @Test
    public void testUiButtonsText(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        UIButtonsPage uiButtonsPage = PageFactory.initElements(ad, UIButtonsPage.class);
        uiButtonsPage.getTextAndCheck();
    }
}
