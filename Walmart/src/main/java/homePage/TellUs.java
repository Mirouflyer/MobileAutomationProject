package homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TellUs {

    @FindBy(id ="com.walmart.android:id/button")
    public WebElement tellUs;

    @FindBy(id= "com.walmart.android:id/app_feedback_comments")
    public WebElement leaveComment;

    public WebElement getTellUs() {
        return tellUs;
    }

    public WebElement getLeaveCommentBox() {
        return leaveComment;
    }

    public void clickOnTellUs(){
        getTellUs().click();
    }

    public void typeOnLeaveCommentBox(){
        getLeaveCommentBox().sendKeys("Your app is Awsome !!!!!!!");
    }

    public void leaveAfeedBack(){
        clickOnTellUs();
        typeOnLeaveCommentBox();
    }
}
