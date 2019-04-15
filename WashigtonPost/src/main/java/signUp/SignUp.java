package signUp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp {

    @FindBy(id ="com.washingtonpost.android:id/action_settings")
    public WebElement settings;

    @FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.RelativeLayout/android.widget.TextView\n")
    public WebElement logInOrCreateAnAccount;

    @FindBy(xpath ="//android.view.View[@content-desc=\"Create one today\"]")
    public WebElement createOneToday;

    @FindBy(xpath ="//android.widget.EditText[@content-desc=\"Enter your e-mail address\"]")
    public WebElement enterYourEmail;

    @FindBy(xpath ="//android.webkit.WebView[@content-desc=\"Washington Post\"]/android.view.View[2]/android.widget.EditText[2]\n")
    public WebElement choosePassword;

    @FindBy(xpath ="//android.webkit.WebView[@content-desc=\"Washington Post\"]/android.view.View[2]/android.widget.EditText[3]\n")
    public WebElement confirmPassword;

    @FindBy(xpath = "//android.widget.CheckBox[@content-desc=\"I have read and agree to the Terms of Serviceand Privacy Policy.\"]\n")
    public WebElement checkBoxTerms;

    @FindBy(xpath ="//android.widget.Button[@content-desc=\"Sign Up\"]")
    public WebElement signUp;

    public WebElement getSettings() {
        return settings;
    }
    public WebElement getLogInOrCreateAnAccount() {
        return logInOrCreateAnAccount;
    }

    public WebElement getCreateOneToday() {
        return createOneToday;
    }

    public WebElement getEnterYourEmail() {
        return enterYourEmail;
    }

    public WebElement getChoosePassword() {
        return choosePassword;
    }

    public WebElement getConfirmPassword() {
        return confirmPassword;
    }

    public WebElement getCheckBoxTerms() {
        return checkBoxTerms;
    }

    public WebElement getSignUp() {
        return signUp;
    }

    public void clickOnSettings(){
        getSettings().click();
    }

    public void clickOnLogInOrCreateAnAccount(){
        getLogInOrCreateAnAccount().click();
    }

    public void clickOnCreateOneToday(){
        getCreateOneToday().click();
    }

    public void typeYourEmail(String email){
        getEnterYourEmail().sendKeys(email);
    }

    public void typeYourPassWord(String password){
        getChoosePassword().sendKeys(password);
    }

    public void confirmYourPassword(String password){
        getConfirmPassword().sendKeys(password);
    }

    public void checkBoxTerms(){
        getCheckBoxTerms().click();
    }

    public void clickOnSignUp(){
        getSignUp().click();
    }

    public void createAnAccount(String email,String password) {
        clickOnSettings();
        clickOnLogInOrCreateAnAccount();
        clickOnCreateOneToday();
        typeYourEmail(email);
        typeYourPassWord(password);
        confirmYourPassword(password);
        checkBoxTerms();
        clickOnSignUp();
    }
}
