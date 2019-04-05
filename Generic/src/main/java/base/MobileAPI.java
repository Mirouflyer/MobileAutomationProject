package base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.Optional;
import reporting.ExtentManager;
import reporting.ExtentTestManager;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.Key;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class MobileAPI {

    public static ExtentReports extent;
    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }
    @BeforeMethod
    public void startExtent(Method method) {
        String className = convertCamelCase(method.getDeclaringClass().getSimpleName());
        String methodName = convertCamelCase(method.getName()).toLowerCase();
        ExtentTestManager.startTest( methodName );
        ExtentTestManager.getTest().assignCategory(className);
    }
    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }
    @Parameters({"appName"})
    @AfterMethod
    public void afterEachTestMethod(@Optional("") String appName, ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));
        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }
        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }
        ExtentTestManager.endTest();
        extent.flush();
        if (result.getStatus() == ITestResult.FAILURE) {
            captureScreenShot(result.getName(),ad);
        }
        ad.removeApp(appName);
        ad.quit();
    }
    @AfterSuite
    public void generateReport() {
        extent.close();
    }

    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }

    public static AppiumDriver ad = null;
    public String OS = null;
    public String deviceName = null;
    public String deviceType = null;
    public String appType = null;
    public String version = null;
    public File appDirectory = null;
    public File findApp = null;
    public DesiredCapabilities cap = null;

    @Parameters({"OS","appType","deviceType", "deviceName","version"})
    @BeforeMethod
    public void setUp(String OS,String appType,String deviceType,String deviceName,
                      String version)throws IOException,InterruptedException{

        if(OS.equalsIgnoreCase("ios")){
            if(appType.contains("iPhone")){
                appDirectory = new File("/Users/mirouflyer/Desktop/MobileAutomation/Team10MobileAutomation/UICatalog/src/app/UICatalog6.1.app.zip");
                findApp = new File(appDirectory,"UICatalog6.1.app.zip");
                if(deviceType.equalsIgnoreCase("RealDevice")){
                    cap = new DesiredCapabilities();
                    cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
                    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
                    cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                    cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                    cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                    ad = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                    ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                }else if (deviceType.equalsIgnoreCase("Simulator")){
                    cap = new DesiredCapabilities();
                    cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
                    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
                    cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                    cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                    cap.setCapability(MobileCapabilityType.APP, appDirectory);//findApp.getAbsolutePath()
                    ad = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                    ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                }


            }else if(appType.equalsIgnoreCase("iPad 2")){
                appDirectory = new File("IOS/src/app");
                findApp = new File(appDirectory,"UICatalog6.1.app.zip");
                if(deviceType.contains("RealDevice")){
                    cap = new DesiredCapabilities();
                    cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
                    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
                    cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                    cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                    cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                    ad = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                    ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                }else if (deviceType.equalsIgnoreCase("Simulator")){
                    cap = new DesiredCapabilities();
                    cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
                    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
                    cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                    cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                    cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                    ad = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                    ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                }
            }

        }else if(OS.contains("Android")){
            if(appType.contains("Phone")){
                appDirectory = new File("/Users/mirouflyer/Desktop/MobileAutomation/Team10MobileAutomation/Walmart/src/app");
                findApp = new File(appDirectory,"Walmart.apk");
                if(deviceType.equalsIgnoreCase("RealDevice")){
                    cap = new DesiredCapabilities();
                    cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
                    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
                    cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                    cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                    ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                    ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                }else if (deviceType.equalsIgnoreCase("Emulator")){

                    cap = new DesiredCapabilities();
                    cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
                    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
                    cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                    cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                    ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                    ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                }

            }else if(OS.equalsIgnoreCase("Tablets")){
                if(deviceType.equalsIgnoreCase("RealDevice")){
                    cap = new DesiredCapabilities();
                    cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
                    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
                    cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                    cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                    ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                    ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                }else if (deviceType.equalsIgnoreCase("Emulator")){

                    cap = new DesiredCapabilities();
                    cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
                    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
                    cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                    cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                    ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                    ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                }

            }

        }
    }

    @AfterMethod
    public void cleanUpApp(){
        ad.quit();
    }

    public void clickByXpath(String locator){
        ad.findElement(By.xpath(locator)).click();
    }
    public void clickByXpathWebElement(WebElement locator){
        locator.click();
    }
    public void sleep(int sec)throws InterruptedException{
        Thread.sleep(1000 * sec);
    }

    public void typeByXpath(String locator, String value, Keys key){
        ad.findElement(By.xpath(locator)).sendKeys(value);
    }
    public void typeByXpath(String locator, String value){
        ad.findElement(By.xpath(locator)).sendKeys(value);
    }
    public List<String> getTexts(List<WebElement> elements){
        List<String> text = new ArrayList<String>();
        for(WebElement element:elements){
            text.add(element.getText());
        }

        return text;
    }
    public static void scrollKeys(AppiumDriver driver, String[] list, String parent) {
        System.out.println("Starting the process");
        for (int i = 0; i < list.length; i++) {
            MobileElement we = (MobileElement) driver.findElementByXPath(parent+"/UIAPickerWheel["+(i+1)+"]");
            we.sendKeys(list[i]);
        }
        System.out.println("Ending Process");
    }
    public void scrollToElement(AppiumDriver driver, String text){
        MobileElement we = (MobileElement) driver.findElementByXPath(text);
        driver.scrollTo(we.getText());
    }
    public void alertAccept(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,5);
        try{
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
        }catch (Exception e){
            System.err.println("No alert visible in 5 seconds");
        }
    }
    public void scrollAndClickByName(String locator){
        ad.scrollTo(locator).click();
    }

    public void sleepFor(int time) {
        try {
            Thread.sleep(1000 * time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //*****************************//Spliting String Method//*****************************//
    public static String convertToString(String st) {
        String splitString = "";
        splitString = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(st), ' ');
        return splitString;
    }

    //*****************************//Cpature ScreenShot Method//*****************************//
    public void captureScreenShot(String className, AppiumDriver ad) {
        String destDir = "";
        File scrFile = ((TakesScreenshot) ad).getScreenshotAs(OutputType.FILE);
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
        destDir = "screenshots/BaseLine";
        new File(destDir).mkdirs();
        String destFile = className + ".png";
        try {
            FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //*****************************//Convert To CameCase Method//*****************************//
    private String convertCamelCase(String words){
        return StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(words), ' ');
    }

    //****************************//click Method//********************************************//
    //clickWhenClickable
    public void clickWhenClickable(AppiumDriver ad, String locator) {
        WebDriverWait wait = new WebDriverWait(ad, 45);
        wait.until(ExpectedConditions.elementToBeClickable(By.id(locator))).click();
    }

    //clickOnElement
    public void clickOnElement(AppiumDriver ad, String locator) {
        locateElement(ad, locator).click();

    }
    //***************************//locate Element Method//**********************************************//
    private static final List<Function<String, By>> resolvers = Arrays.asList(By::id, By::className, By::xpath);
    public WebElement locateElement(AppiumDriver ad, String locator) {
        WebElement el = null;
        for (Function<String, By> resolver : resolvers) {
            try {
                el = ad.findElement(resolver.apply(locator));
                if (el != null) {
                    break;
                }
            } catch (Exception e) {
                if (locator == null) {
                    System.out.println("Ensure getResource() is fetching a valid resource in the locator resource file");
                }
                System.out.println(e + "Locator: " + locator);
            }
        }
        return el;
    }

    public void typeByXpath(String locator, String value, Key key){
        ad.findElement(By.xpath(locator)).sendKeys(value);
    }
}
