package testSignUp;

import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;
import signUp.SignUp;

public class TestSignUp extends MobileAPI {

    @Test
    public void testSignUp(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SignUp signUp = PageFactory.initElements(ad,SignUp.class);
        signUp.createAnAccount("mirouflyer@hotmail.com","1234456");
    }
}
