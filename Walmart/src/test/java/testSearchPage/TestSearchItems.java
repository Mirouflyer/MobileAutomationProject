package testSearchPage;

import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;
import searchPage.SearchItems;

import java.io.IOException;
import java.sql.SQLException;

public class TestSearchItems extends MobileAPI {

    @Test
    public void searchItems() throws Exception, IOException, SQLException, ClassNotFoundException {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchItems searchItems = PageFactory.initElements(ad,SearchItems.class);
        searchItems.searchItemAndSubmitButton();
    }
}
