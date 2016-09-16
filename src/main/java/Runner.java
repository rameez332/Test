import api.android.Android;
import api.apps.fabfurnish.FabFurnish;
import api.apps.fabfurnish.catalog.Catalog;
import core.MyLogger;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Level;
import org.apache.xpath.operations.And;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Rameez on 7/20/2016.
 */
public class Runner {
    private static FabFurnish fabFurnish=new FabFurnish();
    public static void main(String[] args) throws MalformedURLException {
        MyLogger.log.setLevel(Level.INFO);
       /* try{
        DriverManager.createDriver();
        fabFurnish.open();
        }
        finally {
            DriverManager.killDriver();
        }*/

        AndroidDriver driver;
        MyLogger.log.info("Creating driver caps for device: 1235cc57");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "1235cc57");
        MyLogger.log.info("Creating driver 1");
        cap.setCapability("platformName", "Android");
        cap.setCapability("appPackage", Android.app.fabfurnish.packageID());
        cap.setCapability("appActivity", Android.app.fabfurnish.activityID());
        MyLogger.log.info("Creating driver 3");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        MyLogger.log.info("Creating driver 4");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Android.driver= driver;
        fabFurnish.commanTab.tapMenu();
        Android.driver.findElementByName("FURNITURE").click();
        Android.driver.findElementByName("Living Room Furniture").click();
        Android.driver.findElementByName("Tables").click();
        Android.driver.findElementByName("Coffee Tables").click();
        MyLogger.log.info("Setting the Product Instance");
        Catalog catalog=new Catalog("set");
        MyLogger.log.info("Getting Count");
        MyLogger.log.info(catalog.getHeader());
        MyLogger.log.info(catalog.getProductName());
        MyLogger.log.info(catalog.getDiscountedPrice());
        MyLogger.log.info(catalog.getMaxPrice());
        catalog.tapProduct();
        //driver.quit();


    }
}
