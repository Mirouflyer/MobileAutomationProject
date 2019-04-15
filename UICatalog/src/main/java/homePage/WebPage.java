package homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class WebPage {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Web\"]\n")
    public WebElement web;

    public WebElement getWeb() {
        return web;
    }

    public void clickOnWeb(){
        getWeb().click();
        System.out.println("Web clicked");
    }

    public void getTextAndCheck(){
        String text = getWeb().getText();
        Assert.assertEquals(text,"Web");
    }
}
