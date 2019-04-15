package testHomePage;

import base.MobileAPI;
import homePage.ToolBarPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestToolbarPage extends MobileAPI {

    @Test
    public void testClickOnToolbar(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ToolBarPage toolBarPage = PageFactory.initElements(ad,ToolBarPage.class);
        toolBarPage.clickOnToolbar();
    }

    @Test
    public void testTextToolbar(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ToolBarPage toolBarPage = PageFactory.initElements(ad,ToolBarPage.class);
        toolBarPage.getTextAndCheck();
    }
}
