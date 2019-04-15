package homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchBarPage {

    @FindBy(xpath ="//XCUIElementTypeStaticText[@name=\"SearchBar\"]\n")
    public WebElement searchBar;

    public WebElement getSearchBar() {
        return searchBar;
    }

    public void clickOnSearchBar(){
        getSearchBar().click();
        System.out.println("searchBar clicked");
    }

    public void getTextAndCheck(){
        String text = getSearchBar().getText();
        Assert.assertEquals(text,"SearchBar");
    }
}
