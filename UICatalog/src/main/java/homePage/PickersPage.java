package homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class PickersPage {

    @FindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Pickers\"]\n")
    public WebElement pickers;

    public WebElement getPickers() {
        return pickers;
    }

    public void clickOnPickers(){
        getPickers().click();
        System.out.println("Pickers clicked");
    }

    public void getTextAndCheck(){
        String text = getPickers().getText();
        Assert.assertEquals(text,"Pickers");
    }
}
