package homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ImagesPage {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Images\"]")
    public WebElement images;

    public WebElement getImages() {
        return images;
    }

    public void clickOnImages(){
        getImages().click();
        System.out.println("images clicked");
    }

    public void getTextAndCheck(){
        String text = getImages().getText();
        Assert.assertEquals(text,"Images");
    }
}
