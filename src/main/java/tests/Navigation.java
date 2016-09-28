package tests;

import api.android.Android;
import api.apps.fabfurnish.FabFurnish;
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

   @Test
   public void test1(){
       testInfo.id("test1").name("Verifying that Everything is right");
       fabFurnish.commanTab.tapCart();
       System.out.print("The Wishlist Count is: "+fabFurnish.commanTab.getWishlishtCount());
       System.out.print("The Cart Count is: "+fabFurnish.commanTab.getCartCount());
       Assert.assertTrue(fabFurnish.commanTab.uiObject.home().exists());
       Assert.assertTrue(fabFurnish.commanTab.uiObject.search().exists());
       Assert.assertTrue(fabFurnish.commanTab.uiObject.wishlist().exists());
       Assert.assertTrue(fabFurnish.commanTab.uiObject.cart().exists());
       Assert.assertTrue(fabFurnish.commanTab.uiObject.scanqr().exists());
       Assert.assertTrue(fabFurnish.commanTab.uiObject.menuright().exists());
       Assert.assertTrue(fabFurnish.commanTab.uiObject.menu().exists());

     }

}
