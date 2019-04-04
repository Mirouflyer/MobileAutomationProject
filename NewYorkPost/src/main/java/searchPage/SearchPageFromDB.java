package searchPage;

import base.MobileAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageFromDB extends MobileAPI {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open menu\"]\n")
    public WebElement burgerButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView")
    public WebElement searchButton;

    @FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewAnimator/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText\n")
    public WebElement searchField;

    @FindBy(id ="br.com.golmobile.nypost:id/container")
    public WebElement enterButton;

    public WebElement getBurgerButton() {
        return burgerButton;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getSearchField() {
        return searchField;
    }
    public WebElement getEnterButton() {
        return enterButton;
    }

    public void clickOnBurgerButton(){
        getBurgerButton().click();
    }

    public void clickOnSearch(){
        getSearchButton().click();
    }

    public void typeOnSearchField(){
        typeByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewAnimator/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText\n","politics");
        getEnterButton().click();
        sleepFor(2);
    }

    public void search(){
        clickOnBurgerButton();
        clickOnSearch();
        typeOnSearchField();
    }
}
