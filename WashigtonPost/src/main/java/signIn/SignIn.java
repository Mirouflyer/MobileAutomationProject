package signIn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn {

    @FindBy(id ="com.washingtonpost.android:id/action_settings")
    public WebElement settings;

    @FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.RelativeLayout/android.widget.TextView\n")
    public WebElement logInOrCreateAnAccount;

    @FindBy(xpath ="//android.widget.Button[@content-desc=\"Sign in with your email\"]")
    public WebElement signInWithYourEmail;

    public WebElement getSettings() {
        return settings;
    }

    public WebElement getLogInOrCreateAnAccount() {
        return logInOrCreateAnAccount;
    }

    public WebElement getSignInWithYourEmail() {
        return signInWithYourEmail;
    }
}
