package homePage;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class AlertsPage extends MobileAPI {

    @FindBy(xpath ="//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[11]\n")
    public WebElement alerts;

    @FindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Various uses of UIAlertView, UIActionSheet\"]")
    public WebElement alertsText;

    public WebElement getAlerts() {
        return alerts;
    }

    public WebElement getAlertsText() {
        return alertsText;
    }

    public void clickOnAlerts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAlerts().click();
        sleepFor(2);
        System.out.println("alerts clicked");
    }

    public void getTextAndCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getAlertsText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"Various uses of UIAlertView, UIActionSheet");
    }
}


