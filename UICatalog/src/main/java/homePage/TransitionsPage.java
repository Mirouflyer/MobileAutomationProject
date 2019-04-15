package homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TransitionsPage {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transitions\"]\n")
    public WebElement transitions;

    public WebElement getTransitions() {
        return transitions;
    }

    public void clickOnTransitions(){
        getTransitions().click();
        System.out.println("Transitions clicked");
    }

    public void getTextAndCheck(){
        String text = getTransitions().getText();
        Assert.assertEquals(text,"Transitions");
    }
}
