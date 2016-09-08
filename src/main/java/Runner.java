import api.android.Android;
import api.apps.fabfurnish.FabFurnish;
import api.apps.speedtest.home.Home;
import core.MyLogger;
import core.UiSelector;
import core.managers.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Level;
import org.junit.runner.JUnitCore;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.SystemClock;
import tests.TestPrimer;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
/**
 * Created by Rameez on 7/20/2016.
 */
public class Runner {
    private static FabFurnish fabFurnish=new FabFurnish();
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver;
        MyLogger.log.setLevel(Level.INFO);

         //  DriverManager.createDriver();
           /* MyLogger.log.info("Creating driver caps for device: "+1235cc57);
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", deviceID);
            caps.setCapability("platformName", "Android");
            caps.setCapability("app", "C:/unlock_apk-debug.apk");*/
           // File app = new File("D:\\Appium\\Amazon\\Amazon.apk");
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "1235cc57");
            cap.setCapability("platformVersion", "6.0");
            cap.setCapability("platformName", "Android");
           // cap.setCapability("app", app.getAbsolutePath());
            cap.setCapability("appPackage", Android.app.fabfurnish.packageID());
            cap.setCapability("appActivity", Android.app.fabfurnish.activityID());

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);

       // fabFurnish.open();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.fabfurnish.android:id/cart\")").click();

        Android.driver= driver;
        fabFurnish.commanTab.tapCart();
      //  System.out.println("The Wishlist Count is: "+fabFurnish.commanTab.getWishlishtCount());

        //System.out.println("The Cart Count is: " + fabFurnish.commanTab.getCartCount());
       // driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.fabfurnish.android:id/shortlist\")").click();
       // driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.fabfurnish.android:id/home\")").click();
       // driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.fabfurnish.android:id/shortlist\")").click();
       // System.out.println("The Wishlist Count is: "+fabFurnish.commanTab.getWishlishtCount());
        //fabFurnish.commanTab.tapMenuRight();
      // fabFurnish.commanTab.tapCart();
        //fabFurnish.cart.getShippingDaysText();
       // fabFurnish.commanTab.tapCart().getShippingDaysText();
        fabFurnish.cart.getChildCount();

        // JUnitCore.runClasses(TestPrimer.class);

        driver.quit();

        /*finally {
            DriverManager.killDriver();
        }*/
    }
}
