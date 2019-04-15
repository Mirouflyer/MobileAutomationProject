package testHomePage;

import base.MobileAPI;
import homePage.TransitionsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestTransitionsPage extends MobileAPI {

    @Test
    public void testClickOnTransitions(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TransitionsPage transitionsPage = PageFactory.initElements(ad,TransitionsPage.class);
        transitionsPage.clickOnTransitions();
    }

    @Test
    public void testTextTransitions(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TransitionsPage transitionsPage = PageFactory.initElements(ad,TransitionsPage.class);
        transitionsPage.getTextAndCheck();
    }

}
