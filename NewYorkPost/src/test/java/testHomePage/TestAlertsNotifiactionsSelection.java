package testHomePage;

import base.MobileAPI;
import homePage.AlertsNotificationsSelection;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestAlertsNotifiactionsSelection extends MobileAPI {

    @Test
    public void breakingNewsAlerts(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AlertsNotificationsSelection alertsNotifications = PageFactory.initElements(ad, AlertsNotificationsSelection.class);
        alertsNotifications.selectBreakingNewsAlerts();
    }

    @Test
    public void newYorkMetroAlerts(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AlertsNotificationsSelection alertsNotifications = PageFactory.initElements(ad, AlertsNotificationsSelection.class);
        alertsNotifications.selectNewYorkMetroAlerts();
    }

    @Test
    public void sportAlerts(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AlertsNotificationsSelection alertsNotifications = PageFactory.initElements(ad, AlertsNotificationsSelection.class);
        alertsNotifications.selectSportAlerts();
    }

    @Test
    public void editorsPicksAlerts(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AlertsNotificationsSelection alertsNotifications = PageFactory.initElements(ad, AlertsNotificationsSelection.class);
        alertsNotifications.selectEditorsPicksAlerts();
    }

    @Test
    public void pageSixAlerts(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AlertsNotificationsSelection alertsNotifications = PageFactory.initElements(ad, AlertsNotificationsSelection.class);
        alertsNotifications.selectPageSixAlerts();
    }

    @Test
    public void allAlerts(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AlertsNotificationsSelection alertsNotifications = PageFactory.initElements(ad, AlertsNotificationsSelection.class);
        alertsNotifications.selectAllAlerts();
    }
}
