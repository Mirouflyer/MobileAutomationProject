package testSearchPage;

import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import searchPage.SearchItems;

import java.io.IOException;
import java.sql.SQLException;

public class TestSearchItems extends MobileAPI {

    @Test
    public void searchItems() throws Exception, IOException, SQLException, ClassNotFoundException {
        SearchItems searchItems = PageFactory.initElements(ad,SearchItems.class);
        searchItems.searchItemAndSubmitButton();
    }
}
