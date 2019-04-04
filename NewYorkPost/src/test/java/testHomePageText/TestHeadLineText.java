package testHomePageText;

import base.MobileAPI;
import homePageText.HeadLineText;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;


public class TestHeadLineText extends MobileAPI {

    @Test
    public void headLineText(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HeadLineText headLineText = PageFactory.initElements(ad,HeadLineText.class);
        headLineText.clickOnHeadLine();
    }
}
