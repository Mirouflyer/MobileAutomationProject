package testHomePage;

import base.MobileAPI;
import homePage.PickersPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestPickersPage extends MobileAPI {

    @Test
    public void testClickOnPickers(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PickersPage pickersPage = PageFactory.initElements(ad,PickersPage.class);
        pickersPage.clickOnPickers();
    }

    @Test
    public void testTextPickers(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PickersPage pickersPage = PageFactory.initElements(ad,PickersPage.class);
        pickersPage.getTextAndCheck();
    }
}
