package testHomePage;

import base.MobileAPI;
import homePage.AlertsNotifications;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestAlertsNotifiactions extends MobileAPI {

    @Test
    public void alertsNotifications(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AlertsNotifications alertsNotifications = PageFactory.initElements(ad,AlertsNotifications.class);
        alertsNotifications.clickOnAlertsButton();
    }
}
