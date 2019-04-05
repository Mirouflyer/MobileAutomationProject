package testHomePage;

import base.MobileAPI;
import homePage.PageMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;


public class TestPageMenu extends MobileAPI {

    @Test
    public void getNewsTest(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PageMenu pageMenu = PageFactory.initElements(ad, PageMenu.class);
        pageMenu.getNews();
    }

    @Test
    public void getSavedArticlesTest(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PageMenu pageMenu = PageFactory.initElements(ad, PageMenu.class);
        pageMenu.getSavedArticles();
    }

    @Test
    public void getMetroTest(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PageMenu pageMenu = PageFactory.initElements(ad, PageMenu.class);
        pageMenu.getMetro();
    }

    @Test
    public void getPageSixTest(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PageMenu pageMenu = PageFactory.initElements(ad, PageMenu.class);
        pageMenu.getPageSix();
    }

    @Test
    public void getSportsTest(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PageMenu pageMenu = PageFactory.initElements(ad, PageMenu.class);
        pageMenu.getSports();
    }

    @Test
    public void getBusinessTest(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PageMenu pageMenu = PageFactory.initElements(ad, PageMenu.class);
        pageMenu.getBusiness();
    }

    @Test
    public void getOpinionTest(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PageMenu pageMenu = PageFactory.initElements(ad, PageMenu.class);
        pageMenu.getOpinion();
    }

    @Test
    public void getEntertainmentTest(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PageMenu pageMenu = PageFactory.initElements(ad, PageMenu.class);
        pageMenu.getEntertainment();
    }

    @Test
    public void getFashionTest(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PageMenu pageMenu = PageFactory.initElements(ad, PageMenu.class);
        pageMenu.getFashion();
    }

    @Test
    public void getLivingTest(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PageMenu pageMenu = PageFactory.initElements(ad, PageMenu.class);
        pageMenu.getLiving();
    }

    @Test
    public void getMediaTest(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PageMenu pageMenu = PageFactory.initElements(ad, PageMenu.class);
        pageMenu.getMedia();
    }

    @Test
    public void getTechTest(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PageMenu pageMenu = PageFactory.initElements(ad, PageMenu.class);
        pageMenu.getTech();
    }

    @Test
    public void getRealEstateTest(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PageMenu pageMenu = PageFactory.initElements(ad, PageMenu.class);
        pageMenu.getRealEstate();
    }

    @Test
    public void getPhotosTest(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PageMenu pageMenu = PageFactory.initElements(ad, PageMenu.class);
        pageMenu.getPhotos();
    }

    @Test
    public void getVideoTest(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PageMenu pageMenu = PageFactory.initElements(ad, PageMenu.class);
        pageMenu.getVideo();
    }

}
