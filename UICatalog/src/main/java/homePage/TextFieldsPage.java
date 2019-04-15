package homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TextFieldsPage {
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TextFields\"]\n")
    public WebElement textFields;

    public WebElement getTextFields() {
        return textFields;
    }

    public void clickOnTextFields(){
        getTextFields().click();
        System.out.println("TextFields clicked");
    }

    public void getTextAndCheck(){
        String text = getTextFields().getText();
        Assert.assertEquals(text,"TextFields");
    }
}
