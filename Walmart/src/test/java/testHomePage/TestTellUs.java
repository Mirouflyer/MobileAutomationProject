package testHomePage;

import base.MobileAPI;
import homePage.TellUs;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestTellUs extends MobileAPI {

    @Test
    public void searchItems() throws Exception, IOException, SQLException, ClassNotFoundException {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TellUs tellUs = PageFactory.initElements(ad,TellUs.class);
        tellUs.leaveAfeedBack();
    }
}
