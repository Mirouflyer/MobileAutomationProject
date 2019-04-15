package testHomePage;

import base.MobileAPI;
import homePage.SegmentsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestSegmentsPage extends MobileAPI {

    @Test
    public void testClickOnSegments(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SegmentsPage segmentsPage = PageFactory.initElements(ad,SegmentsPage.class);
        segmentsPage.clickOnSegments();
    }

    @Test
    public void tesTextSegments(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SegmentsPage segmentsPage = PageFactory.initElements(ad,SegmentsPage.class);
        segmentsPage.getTextAndCheck();
    }

    @Test
    public void testclickOnUISegmentedControl(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SegmentsPage segmentsPage = PageFactory.initElements(ad,SegmentsPage.class);
        segmentsPage.clickOnUISegmentedControl();
    }

    @Test
    public void testTextAndCheckUISegmentedControl(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SegmentsPage segmentsPage = PageFactory.initElements(ad,SegmentsPage.class);
        segmentsPage.getTextAndCheckUISegmentedControl();
    }

    @Test
    public void testclickOnUISegmentedControlStyleBordered(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SegmentsPage segmentsPage = PageFactory.initElements(ad,SegmentsPage.class);
        segmentsPage.clickOnUISegmentedControlStyleBordered();
    }

    @Test
    public void testTextUISegmentedControlStyleBordered(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SegmentsPage segmentsPage = PageFactory.initElements(ad,SegmentsPage.class);
        segmentsPage.getTextUISegmentedControlStyleBordered();
    }

    @Test
    public void testclickOnUISegmentedStyleBar(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SegmentsPage segmentsPage = PageFactory.initElements(ad,SegmentsPage.class);
        segmentsPage.clickOnUISegmentedStyleBar();
    }

    @Test
    public void testTextUISegmentedStyleBar(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SegmentsPage segmentsPage = PageFactory.initElements(ad,SegmentsPage.class);
        segmentsPage.getTextUISegmentedStyleBar();
    }

    @Test
    public void testclickOnUISegmentedControlStyleBarTint(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SegmentsPage segmentsPage = PageFactory.initElements(ad,SegmentsPage.class);
        segmentsPage.clickOnUISegmentedControlStyleBarTint();
    }

    @Test
    public void testTextUISegmentedControlStyleBarTint(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SegmentsPage segmentsPage = PageFactory.initElements(ad,SegmentsPage.class);
        segmentsPage.getTextUISegmentedControlStyleBarTint();
    }

    @Test
    public void testclickOnUISegmentedControlStyleBarImage(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SegmentsPage segmentsPage = PageFactory.initElements(ad,SegmentsPage.class);
        segmentsPage.clickOnUISegmentedControlStyleBarImage();
    }

    @Test
    public void testTextUISegmentedControlStyleBarImage(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SegmentsPage segmentsPage = PageFactory.initElements(ad,SegmentsPage.class);
        segmentsPage.getTextUISegmentedControlStyleBarImage();
    }


}
