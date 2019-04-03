package homePage;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class AlertsNotifications extends MobileAPI {

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Turn On Notifications\"]\n")
    public WebElement alertsButton;

    public WebElement getAlertsButton() {
        return alertsButton;
    }

    public void clickOnAlertsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAlertsButton().click();
        sleepFor(2);
        System.out.println("Alerts Button clicked");
    }
}
