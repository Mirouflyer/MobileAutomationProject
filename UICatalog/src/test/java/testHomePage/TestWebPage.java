package testHomePage;

import base.MobileAPI;
import homePage.WebPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestWebPage extends MobileAPI {

    @Test
    public void testUiControlClick(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WebPage webPage = PageFactory.initElements(ad, WebPage.class);
        webPage.clickOnWeb();
    }

    @Test
    public void testUiControlText(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WebPage webPage = PageFactory.initElements(ad, WebPage.class);
        webPage.getTextAndCheck();
    }
}
