package homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ToolBarPage {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Toolbar\"]")
    public WebElement toolbar;

    public WebElement getToolbar() {
        return toolbar;
    }

    public void clickOnToolbar(){
        getToolbar().click();
        System.out.println("ToolBar clicked");
    }

    public void getTextAndCheck(){
        String text = getToolbar().getText();
        Assert.assertEquals(text,"Toolbar");
    }
}
