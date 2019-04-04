package homePage;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class AlertsNotificationsSelection extends MobileAPI {

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Turn On Notifications\"]")
    public WebElement alertsButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.Switch\n")
    public WebElement breakingNewsSwitch;

    @FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.Switch")
    public WebElement newYorkMetroSwitch;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.view.ViewGroup/android.widget.Switch")
    public WebElement sportSwitch;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.view.ViewGroup/android.widget.Switch")
    public WebElement editorsPicksSwitch;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.view.ViewGroup/android.widget.Switch")
    public WebElement pageSixSwitch;

    public WebElement getAlertsButton() {
        return alertsButton;
    }

    public WebElement getBreakingNewsSwitch() {
        return breakingNewsSwitch;
    }

    public WebElement getNewYorkMetroSwitch() {
        return newYorkMetroSwitch;
    }

    public WebElement getSportSwitch() {
        return sportSwitch;
    }

    public WebElement getEditorsPicksSwitch() {
        return editorsPicksSwitch;
    }

    public WebElement getPageSixSwitch() {
        return pageSixSwitch;
    }

    public void selectBreakingNewsAlerts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAlertsButton().click();
        getBreakingNewsSwitch().click();
    }

    public void selectNewYorkMetroAlerts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAlertsButton().click();
        getNewYorkMetroSwitch().click();
    }

    public void selectSportAlerts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAlertsButton().click();
        getSportSwitch().click();
    }

    public void selectEditorsPicksAlerts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAlertsButton().click();
        getEditorsPicksSwitch().click();
    }

    public void selectPageSixAlerts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAlertsButton().click();
        getPageSixSwitch().click();
    }

    public void selectAllAlerts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAlertsButton().click();
        getBreakingNewsSwitch().click();
        getNewYorkMetroSwitch().click();
        getSportSwitch().click();
        getEditorsPicksSwitch().click();
        getPageSixSwitch().click();
    }


}
