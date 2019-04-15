package homePage;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class UIControlPage extends MobileAPI {

    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Controls\"]")
    public WebElement uiControls;

    @FindBy(xpath ="//XCUIElementTypeSwitch[@name=\"Standard\"]")
    public WebElement standardSwitch;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Standard Switch\"]")
    public WebElement standardSwitchText;


    public WebElement getUiControls() {
        return uiControls;
    }

    public WebElement getStandardSwitch() {
        return standardSwitch;
    }

    public WebElement getStandardSwitchText() {
        return standardSwitchText;
    }
        public void clickOnUiControls(){
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getUiControls().click();
            sleepFor(2);
            System.out.println("UIControlPage clicked");
        }

        public void getTextAndCheck(){
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            String text = getUiControls().getText();
            Assert.assertEquals(text,"Controls");
        }

        public void clickOnStandardSwitch(){
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getUiControls().click();
            getStandardSwitch().click();

        }

    public void getTextAndCheck1(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getUiControls().click();
        String text = getStandardSwitchText().getText();
        Assert.assertEquals(text,"Standard Switch");
    }

}
