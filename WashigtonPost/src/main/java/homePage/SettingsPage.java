package homePage;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SettingsPage extends MobileAPI {

    @FindBy(id ="com.washingtonpost.android:id/action_settings")
    public WebElement settings;

    public WebElement getSettings() {
        return settings;
    }

    public void clickOnSettings(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSettings().click();
    }
}
