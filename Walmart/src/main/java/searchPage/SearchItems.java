package searchPage;

import base.MobileAPI;

import datasources.DataBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class SearchItems extends MobileAPI {

    DataBase dataBase = new DataBase();

    @FindBy(id = "com.walmart.android:id/search_src_text")
    public WebElement searchField;

    @FindBy(xpath= "//android.widget.Button[@content-desc=\"Browse all departments.\"]")
    public WebElement allDepartmentsSearch;

    public WebElement getSearchField() {
        return searchField;
    }
    public WebElement getAllDepartmentsSearch() {
        return allDepartmentsSearch;
    }

    public void typeOnSearchField(String value){
        getSearchField().sendKeys(value);
    }
    public void clickOnAllDepartmentSearch(){
        getSearchField().click();
    }
    public void clearSearch(){
        getSearchField().clear();
    }

    public void searchItemAndSubmitButton() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        List<String> list = dataBase.getItemListFromDB();
        for (int i = 0; i < list.size(); i++) {
            typeOnSearchField(list.get(i));
           clickOnAllDepartmentSearch();
            clearSearch();
        }
    }
}
