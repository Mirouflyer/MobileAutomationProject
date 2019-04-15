package testHomePage;

import base.MobileAPI;
import homePage.SettingsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestSettingsPage extends MobileAPI {

    @Test
    public void testClickOnSettings(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SettingsPage settingsPage = PageFactory.initElements(ad,SettingsPage.class);
        settingsPage.clickOnSettings();
    }
}
