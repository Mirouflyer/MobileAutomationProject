package testHomePage;

import base.MobileAPI;
import homePage.UIControlPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestUIControlPage extends MobileAPI {

    @Test
    public void testUiControlClick(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        UIControlPage uiControlPage = PageFactory.initElements(ad, UIControlPage.class);
        uiControlPage.clickOnUiControls();
    }

    @Test
    public void testUiControlText(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        UIControlPage uiControlPage = PageFactory.initElements(ad, UIControlPage.class);
        uiControlPage.getTextAndCheck();
    }

    @Test
    public void testStandardSwitchClick(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        UIControlPage uiControlPage = PageFactory.initElements(ad, UIControlPage.class);
        uiControlPage.clickOnStandardSwitch();
    }

    @Test
    public void testStandardSwitchText(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        UIControlPage uiControlPage = PageFactory.initElements(ad, UIControlPage.class);
        uiControlPage.getTextAndCheck1();
    }
}
