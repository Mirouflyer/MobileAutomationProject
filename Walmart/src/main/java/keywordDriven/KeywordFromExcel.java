package keywordDriven;

import base.MobileAPI;
import datasources.ExcelReader;
import io.appium.java_client.AppiumDriver;
import reporting.TestLogger;
import java.io.IOException;

public class KeywordFromExcel extends MobileAPI {

    public void createAnAccount() {
     clickByXpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");
     clickByXpath("com.walmart.android:id/notification_item_time");
     clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button");
    }

    public void signIn() {

    }

    public void select(String featureName, AppiumDriver ad1) throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        switch (featureName) {
            case "createAnAccount":
                createAnAccount();
                break;
            case "signIn":
                signIn();
                break;
            default:
                //throw new  InvalidArgumentException ("Invali Selection");
        }
    }

    public void selectFeatures(AppiumDriver ad1) throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ExcelReader excelReader = new ExcelReader();
        String[] testSteps = excelReader.getKeywordFromExcel();
        for (int i = 1; i < testSteps.length; i++) {
            select(testSteps[i], ad1);
        }
    }

}
