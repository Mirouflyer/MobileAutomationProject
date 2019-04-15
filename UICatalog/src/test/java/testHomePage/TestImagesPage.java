package testHomePage;

import base.MobileAPI;
import homePage.ImagesPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestImagesPage extends MobileAPI {

    @Test
    public void testClickOnImages(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ImagesPage imagesPage = PageFactory.initElements(ad,ImagesPage.class);
        imagesPage.clickOnImages();
    }

    @Test
    public void testTextImages(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ImagesPage imagesPage = PageFactory.initElements(ad,ImagesPage.class);
        imagesPage.getTextAndCheck();
    }
}
