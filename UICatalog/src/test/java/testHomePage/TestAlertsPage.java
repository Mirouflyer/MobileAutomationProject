package testHomePage;

import base.MobileAPI;
import homePage.AlertsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestAlertsPage extends MobileAPI {

    @Test
    public void testClickOnAlerts(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AlertsPage alertsPage = PageFactory.initElements(ad, AlertsPage.class);
        alertsPage.clickOnAlerts();
    }

    @Test
    public void testAlertsText(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AlertsPage alertsPage = PageFactory.initElements(ad, AlertsPage.class);
        alertsPage.getTextAndCheck();
    }
}
