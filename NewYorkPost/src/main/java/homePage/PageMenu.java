package homePage;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class PageMenu extends MobileAPI {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open menu\"]")
    public WebElement burgerButton;

    public WebElement getBurgerButton() {
        return burgerButton;
    }

    public void getMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getBurgerButton().click();
    }

    String mainMenuArr[] = {"NEWS","SAVED ARTICLES","METRO","PAGE SIX","SPORTS","BUSINESS","OPINION","ENTERTAINMENT","FASHION","LIVING","MEDIA","TECH","REAL ESTATE","PHOTOS","VIDEO"};


    public void getNews(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMenu();
        scrollAndClickByName(mainMenuArr[0]);
        sleepFor(2);
    }

    public void getSavedArticles(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMenu();
        scrollAndClickByName(mainMenuArr[1]);
        sleepFor(2);
    }

    public void getMetro(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMenu();
        scrollAndClickByName(mainMenuArr[2]);
    }

    public void getPageSix(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMenu();
        scrollAndClickByName(mainMenuArr[3]);
    }

    public void getSports(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMenu();
        scrollAndClickByName(mainMenuArr[4]);
    }

    public void getBusiness(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMenu();
        scrollAndClickByName(mainMenuArr[5]);
    }

    public void getOpinion(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMenu();
        scrollAndClickByName(mainMenuArr[6]);
    }

    public void getEntertainment(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMenu();
        scrollAndClickByName(mainMenuArr[7]);
    }

    public void getFashion(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMenu();
        scrollAndClickByName(mainMenuArr[8]);
    }

    public void getLiving(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMenu();
        scrollAndClickByName(mainMenuArr[9]);
    }

    public void getMedia(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMenu();
        scrollAndClickByName(mainMenuArr[10]);
    }

    public void getTech(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMenu();
        scrollAndClickByName(mainMenuArr[11]);
    }

    public void getRealEstate(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMenu();
        scrollAndClickByName(mainMenuArr[12]);
    }

    public void getPhotos(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMenu();
        scrollAndClickByName(mainMenuArr[13]);
    }

    public void getVideo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMenu();
        scrollAndClickByName(mainMenuArr[14]);
    }

}
