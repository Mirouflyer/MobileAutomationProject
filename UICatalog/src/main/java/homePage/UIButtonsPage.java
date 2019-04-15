package homePage;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class UIButtonsPage extends MobileAPI {

@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Various uses of UIButton\"]\n")
public WebElement uiButtons;

    public WebElement getuiButtons() {
        return uiButtons;
    }

    public void clickOnButtons(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getuiButtons().click();
        sleepFor(2);
        System.out.println("button clicked");
    }

    public void getTextAndCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getuiButtons().getText();
        Assert.assertEquals(text,"Various uses of UIButton");
    }
}
