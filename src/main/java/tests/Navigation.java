package tests;

import api.android.Android;
import api.apps.fabfurnish.FabFurnish;
import api.apps.speedtest.Speedtest;
import core.managers.TestManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Rameez on 7/20/2016.
 */
public class Navigation extends TestManager {

    //private static Speedtest speedtest = Android.app.speedtest;
    private static FabFurnish fabFurnish=new FabFurnish();

    @BeforeClass
    public static void beforeClass(){
        fabFurnish.open();
    }

    @Before
    public void before(){
        testInfo.suite("Navigation");
    }

   /* @Test
    public void test1(){
        testInfo.id("test1").name("Verify that Home Activity has all the elements");
        Assert.assertTrue(speedtest.home.uiObject.ping().exists());
        Assert.assertTrue(speedtest.home.uiObject.pingSpeed().exists());
        Assert.assertTrue(speedtest.home.uiObject.download().exists());
        Assert.assertTrue(speedtest.home.uiObject.downloadSpeed().exists());
        Assert.assertTrue(speedtest.home.uiObject.upload().exists());
        Assert.assertTrue(speedtest.home.uiObject.uploadSpeed().exists());
        Assert.assertTrue(speedtest.home.uiObject.shareButton().exists());
        Assert.assertTrue(speedtest.home.uiObject.removeAdsButton().exists());
        Assert.assertTrue(speedtest.home.uiObject.testAgainButton().exists());
        Assert.assertTrue(speedtest.home.uiObject.logo().exists());
    }

    @Test
    public void test2(){
        testInfo.id("test2").name("Verify that Results has sorting buttons");
        speedtest.menu.tapResults();
        Assert.assertTrue(speedtest.results.uiObject.toolsButton().exists());
        Assert.assertTrue(speedtest.results.uiObject.resultsLabel().exists());
        Assert.assertTrue(speedtest.results.uiObject.sortByDownload().exists());
        Assert.assertTrue(speedtest.results.uiObject.sortByPing().exists());
        Assert.assertTrue(speedtest.results.uiObject.sortByTime().exists());
        Assert.assertTrue(speedtest.results.uiObject.sortByType().exists());
        Assert.assertTrue(speedtest.results.uiObject.sortByUpload().exists());
        Assert.assertTrue(speedtest.results.uiObject.logo().exists());
    }

    @Test
    public void test3(){
        testInfo.id("test3").name("Verify that About activity has PP & ToU links");
        speedtest.menu.tapAbout();
        Assert.assertTrue(speedtest.about.uiObject.privacyPolicy().exists());
        Assert.assertTrue(speedtest.about.uiObject.termsOfUse().exists());
    }*/

   @Test
   public void test1(){
       testInfo.id("test1").name("Verify that Everything is right");
       fabFurnish.commanTab.tapCart();
       System.out.print("The Wishlist Count is: "+fabFurnish.commanTab.getWishlishtCount());
       System.out.print("The Cart Count is: "+fabFurnish.commanTab.getCartCount());
       Assert.assertTrue(fabFurnish.commanTab.commanTabUiObjects.home().exists());
       Assert.assertTrue(fabFurnish.commanTab.commanTabUiObjects.search().exists());
       Assert.assertTrue(fabFurnish.commanTab.commanTabUiObjects.wishlist().exists());
       Assert.assertTrue(fabFurnish.commanTab.commanTabUiObjects.cart().exists());
       Assert.assertTrue(fabFurnish.commanTab.commanTabUiObjects.scanqr().exists());
       Assert.assertTrue(fabFurnish.commanTab.commanTabUiObjects.menuright().exists());
       Assert.assertTrue(fabFurnish.commanTab.commanTabUiObjects.menu().exists());

       /*Assert.assertTrue(speedtest.results.uiObject.resultsLabel().exists());
       Assert.assertTrue(speedtest.results.uiObject.sortByDownload().exists());
       Assert.assertTrue(speedtest.results.uiObject.sortByPing().exists());
       Assert.assertTrue(speedtest.results.uiObject.sortByTime().exists());
       Assert.assertTrue(speedtest.results.uiObject.sortByType().exists());
       Assert.assertTrue(speedtest.results.uiObject.sortByUpload().exists());
       Assert.assertTrue(speedtest.results.uiObject.logo().exists());*/
   }

}
