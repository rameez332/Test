import api.android.Android;
import api.apps.fabfurnish.FabFurnish;
import api.apps.fabfurnish.catalog.Catalog;
import core.MyLogger;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Level;
import org.apache.xpath.operations.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by Rameez on 7/20/2016.
 */
public class Runner {
    private static FabFurnish fabFurnish=new FabFurnish();

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
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

        cap.setCapability("platformName", "Android");
        cap.setCapability("appPackage", Android.app.fabfurnish.packageID());
        cap.setCapability("appActivity", Android.app.fabfurnish.activityID());

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);

        //driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        Android.driver= driver;
        //driver.wait(10);
        fabFurnish.commanTab.tapMenu();
        fabFurnish.menuMain.productiveRandom("FABDESIGNS","SALE");
        fabFurnish.menuMain.printBreadCrum();
         //fabFurnish.menuMain.randomSimple();
        /*Android.driver.findElementByName("LUGGAGE & BAGS").click();
        Android.driver.findElementByName("Backpacks").click();
        Android.driver.findElementByName("School Bags").click();*/
        fabFurnish.catalogMain.random();
        //fabFurnish.commanTab.tapCart();
        //fabFurnish.cart.setAllProdcuts();
        //System.out.println("Product Name Array size : "+fabFurnish.cart.getAllProductsname().size());
       /* Android.driver.findElementByName("LUGGAGE & BAGS").click();
        Android.driver.findElementByName("Backpacks").click();
        Android.driver.findElementByName("School Bags").click();*/
        //Android.driver.findElementByName("Coffee Tables").click();
        //MyLogger.log.info("Setting the Product Instance");
        //fabFurnish.catalog.tapGridView();
    /*    fabFurnish.catalog.setAllPdts();
        //System.out.println("size: "+fabFurnish.catalog.getAllProductsName().size());
       System.out.println("All Products in the Category: "+fabFurnish.catalog.getHeaderName());
      for(int i=0;i<fabFurnish.catalog.getAllProductsName().size();i++)
      {
          System.out.println(i+1+": Product's Name: "+fabFurnish.catalog.getAllProductsName().get(i)+
                  " ,Max Price: "+fabFurnish.catalog.getAllMaxPrice().get(i)+
                  " ,Discounted Price: "+fabFurnish.catalog.getAllDiscountedPrice().get(i));

      }*/
        //fabFurnish.catalog.getMultiple();
       /* System.out.println(fabFurnish.catalog.getHeader());
        System.out.println(fabFurnish.catalog.getHeaderName());
        System.out.println(fabFurnish.catalog.getPdtCount());*/
        //driver.quit();

    }
}