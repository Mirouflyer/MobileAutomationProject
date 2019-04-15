package homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SegmentsPage {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Segments\"]\n")
    public WebElement segments;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[1]")
    public WebElement UISegmentedControl;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UISegmentedControl:\"]")
    public WebElement UISegmentedControlText;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[2]")
    public WebElement UISegmentedControlStyleBordered;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UISegmentControlStyleBordered:\"]\n")
    public WebElement UISegmentedControlStyleBorderedText;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[3]")
    public WebElement UISegmentedStyleBar;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UISegmentControlStyleBar:\"]\n")
    public WebElement UISegmentedStyleBarText;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[4]")
    public WebElement UISegmentedControlStyleBarTint;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UISegmentControlStyleBar: tint\"]")
    public WebElement UISegmentedControlStyleBarTintText;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[5]")
    public WebElement UISegmentedControlStyleBarImage;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UISegmentControlStyleBar: image\"]")
    public WebElement UISegmentedControlStyleBarImageText;

    public WebElement getSegments() {
        return segments;
    }

    public WebElement getUISegmentedControl() {
        return UISegmentedControl;
    }

    public WebElement getUISegmentedControlText() {
        return UISegmentedControlText;
    }

    public WebElement getUISegmentedControlStyleBordered() {
        return UISegmentedControlStyleBordered;
    }

    public WebElement getUISegmentedControlStyleBorderedText() {
        return UISegmentedControlStyleBorderedText;
    }

    public WebElement getUISegmentedStyleBar() {
        return UISegmentedStyleBar;
    }

    public WebElement getUISegmentedStyleBarText() {
        return UISegmentedStyleBarText;
    }

    public WebElement getUISegmentedControlStyleBarTint() {
        return UISegmentedControlStyleBarTint;
    }

    public WebElement getUISegmentedControlStyleBarTintText() {
        return UISegmentedControlStyleBarTintText;
    }

    public WebElement getUISegmentedControlStyleBarImage() {
        return UISegmentedControlStyleBarImage;
    }

    public WebElement getUISegmentedControlStyleBarImageText() {
        return UISegmentedControlStyleBarImageText;
    }

    public void clickOnSegments(){
        getSegments().click();
        System.out.println("Segments clicked");
    }

    public void getTextAndCheck(){
        String text = getSegments().getText();
        Assert.assertEquals(text,"Segments");
    }
    public void clickOnUISegmentedControl(){
        getSegments().click();
        getUISegmentedControl().click();
        System.out.println("UISegmentedControl clicked");
    }

    public void getTextAndCheckUISegmentedControl(){
        getSegments().click();
        String text = getUISegmentedControlText().getText();
        Assert.assertEquals(text,"UISegmentedControl:");
    }

    public void clickOnUISegmentedControlStyleBordered(){
        getSegments().click();
        getUISegmentedControlStyleBordered().click();
        System.out.println("UISegmentedControlStyleBordered clicked");
    }

    public void getTextUISegmentedControlStyleBordered(){
        getSegments().click();
        String text = getUISegmentedControlStyleBorderedText().getText();
        Assert.assertEquals(text,"UISegmentControlStyleBordered:");
    }

    public void clickOnUISegmentedStyleBar(){
        getSegments().click();
        getUISegmentedStyleBar().click();
        System.out.println("UISegmentedStyleBar clicked");
    }

    public void getTextUISegmentedStyleBar(){
        getSegments().click();
        String text = getUISegmentedStyleBarText().getText();
        Assert.assertEquals(text,"UISegmentControlStyleBar:");
    }

    public void clickOnUISegmentedControlStyleBarTint(){
        getSegments().click();
        getUISegmentedControlStyleBarTint().click();
        System.out.println("UISegmentedControlStyleBarTint clicked");
    }

    public void getTextUISegmentedControlStyleBarTint(){
        getSegments().click();
        String text = getUISegmentedControlStyleBarTintText().getText();
        Assert.assertEquals(text,"UISegmentControlStyleBar: tint");
    }

    public void clickOnUISegmentedControlStyleBarImage(){
        getSegments().click();
        getUISegmentedControlStyleBarImage().click();
        System.out.println("UISegmentedControlStyleBarImage clicked");
    }

    public void getTextUISegmentedControlStyleBarImage(){
        getSegments().click();
        String text = getUISegmentedControlStyleBarImageText().getText();
        Assert.assertEquals(text,"UISegmentControlStyleBar: image");
    }
}
