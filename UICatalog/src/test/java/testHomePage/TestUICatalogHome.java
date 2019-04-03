package testHomePage;


import base.MobileAPI;
import homePage.UICatalogHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;


public class TestUICatalogHome extends MobileAPI {

    @Test
    public void uICatalogHome(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        UICatalogHome uiCatalogHome = PageFactory.initElements(ad,UICatalogHome.class);
        uiCatalogHome.clickOnButtons();
    }
}
