package api.apps.fabfurnish.commontab;

import api.android.Android;
import api.apps.fabfurnish.cart.Cart;
import api.apps.fabfurnish.homepage.Homepage;
import api.apps.fabfurnish.menu.Menu;
import api.apps.fabfurnish.menuright.MenuRight;
import api.apps.fabfurnish.scanqr.ScanQr;
import api.apps.fabfurnish.search.Search;
import api.apps.fabfurnish.wishlist.Wishlist;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;
import java.util.concurrent.TimeUnit;
/**
 * Created by Rameez on 9/5/2016.
 */
public class CommanTab implements Activity {

   public CommanTabUiObjects uiObject=new CommanTabUiObjects();
    public MenuRight tapMenuRight() {

        try{

            MyLogger.log.info("Tapping Right Menu");
            uiObject.menuright().tap();
            return Android.app.fabfurnish.menuRight;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Right Menu, element absent or blocked");
        }
    }

    public Menu tapMenu(){
        try{
            MyLogger.log.info("Tapping Menu");
            uiObject.menu().waitToAppear(10).tap();
            return Android.app.fabfurnish.menu;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Menu, element absent or blocked");
        }
    }

    public Wishlist tapWishlist(){

        try{
            MyLogger.log.info("Tapping Wishlist");
            uiObject.wishlist().tap();
            return Android.app.fabfurnish.wishlist;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Wishlist, element absent or blocked");
        }
    }
    public Cart tapCart(){


       try{
            MyLogger.log.info("Tapping Cart");
            uiObject.cart().waitToAppear(20).tap();
            return Android.app.fabfurnish.cart;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Cart, element absent or blocked");
        }
    }
    public Homepage tapHome(){

        try{
            MyLogger.log.info("Tapping Home");
            uiObject.home().tap();
            return Android.app.fabfurnish.homepage;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Home, element absent or blocked");
        }
    }
    public Search tapSearch(){

        try{
            MyLogger.log.info("Tapping Search");
            uiObject.search().tap();
            return Android.app.fabfurnish.search;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Search, element absent or blocked");
        }
    }
    public ScanQr tapScanQr(){

        try{
            MyLogger.log.info("Tapping ScanQr");
            uiObject.scanqr().tap();
            return Android.app.fabfurnish.scanQr;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Menu, element absent or blocked");
        }
    }
    public int getCartCount(){


       try{
            MyLogger.log.info("Getting Cart Count");
           //Need to be updated
           Android.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
           return Integer.parseInt(uiObject.cart_count().getText());
        }catch (NoSuchElementException e){
           // throw new AssertionError("Cant get Cart Count, element absent or blocked");
            return 0;
        }
    }

    public int getWishlishtCount(){

        try{
            MyLogger.log.info("Getting Wishlist Count");
            return Integer.parseInt(uiObject.wishlist_count().getText());
        }catch (NoSuchElementException e){
            return 0;
           //throw new AssertionError("Cant get Wishlist Count, element absent or blocked");
        }
    }

    //Need to do something about it
    public Search setSearch(String value){

        try{
            MyLogger.log.info("Sending: "+value+" in search");
            uiObject.searchText().typeText(value);
            return Android.app.fabfurnish.search;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Send: "+value+" in search, element absent or blocked");
        }
    }
    public CommanTab tapCloseSearch(){

        try{
            MyLogger.log.info("Tapping Close Search");
            uiObject.closeSearch().tap();
            return Android.app.fabfurnish.commanTab;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Close Search, element absent or blocked");
        }
    }
    public CommanTab tapSearchQrScan(){

        try{
            MyLogger.log.info("Tapping Search Qr Scan");
            uiObject.searchQrScan().tap();
            return Android.app.fabfurnish.commanTab;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Search Qr Scan, element absent or blocked");
        }
    }

    public Object waitToLoad() {
        try{
            MyLogger.log.info("Waiting for CommanTab Activity");
            uiObject.cart().waitToAppear(10);
            return Android.app.fabfurnish.commanTab;
        }catch (AssertionError e){
            throw new AssertionError("Comman Tab activity failed to load/open");
        }
    }
}
