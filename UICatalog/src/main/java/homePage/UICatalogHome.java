package homePage;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class UICatalogHome extends MobileAPI {

@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Various uses of UIButton\"]\n")
public WebElement Buttons;

    public WebElement getButtons() {
        return Buttons;
    }

    public void clickOnButtons(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getButtons().click();
        sleepFor(2);
        System.out.println("button clicked");

    }
}
