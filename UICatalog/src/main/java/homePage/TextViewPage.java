package homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TextViewPage {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TextView\"]\n")
    public WebElement textView;

    public WebElement getTextView() {
        return textView;
    }

    public void clickOnTextView(){
        getTextView().click();
        System.out.println("TextView clicked");
    }

    public void getTextAndCheck(){
        String text = getTextView().getText();
        Assert.assertEquals(text,"TextView");
    }
}
