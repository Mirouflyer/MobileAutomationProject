package testHomePage;

import base.MobileAPI;
import homePage.SearchBarPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestSearchBarPage extends MobileAPI {

    @Test
    public void testClickOnSearchBar(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchBarPage searchBarPage = PageFactory.initElements(ad,SearchBarPage.class);
        searchBarPage.clickOnSearchBar();
    }

    @Test
    public void testTextSearchBar(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchBarPage searchBarPage = PageFactory.initElements(ad,SearchBarPage.class);
        searchBarPage.getTextAndCheck();
    }
}
