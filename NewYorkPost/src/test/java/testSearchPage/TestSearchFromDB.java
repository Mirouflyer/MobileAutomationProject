package testSearchPage;

import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import searchPage.SearchPageFromDB;

public class TestSearchFromDB extends MobileAPI {

    @Test
    public void searchPageFromDB(){
        SearchPageFromDB searchPageFromDB = PageFactory.initElements(ad,SearchPageFromDB.class);
        searchPageFromDB.search();
    }
}
