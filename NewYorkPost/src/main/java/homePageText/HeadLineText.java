package homePageText;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HeadLineText {

    @FindBy(id = "br.com.golmobile.nypost:id/headline_text_view")
    public WebElement latestStrory;

    public WebElement getLatestStrory() {
        return latestStrory;
    }

    public void clickOnHeadLine(){
        String title = getLatestStrory().getText();
        System.out.println(title);
        Assert.assertEquals(title,"Britney Spears checks into mental health facility amid dad’s illness");
    }
}
