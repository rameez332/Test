package api.apps.fabfurnish.commontab;

import api.android.Android;
import api.apps.fabfurnish.cart.Cart;
import api.apps.fabfurnish.homepage.Homepage;
import api.apps.fabfurnish.menu.Menu;
import api.apps.fabfurnish.menuright.MenuRight;
import api.apps.fabfurnish.scanqr.ScanQr;
import api.apps.fabfurnish.search.Search;
import api.apps.fabfurnish.wishlist.Wishlist;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by Rameez on 9/5/2016.
 */
public class CommanTab  {
    
   public CommanTabUiObjects commanTabUiObjects=new CommanTabUiObjects();

    public MenuRight tapMenuRight() {

        try{
            MyLogger.log.info("Tapping Right Menu");
            commanTabUiObjects.menuright().tap();
            return Android.app.fabfurnish.menuRight;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Right Menu, element absent or blocked");
        }
    }

    public Menu tapMenu(){

        try{
            MyLogger.log.info("Tapping Menu");
            commanTabUiObjects.menu().tap();
            return Android.app.fabfurnish.menu;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Menu, element absent or blocked");
        }
    }

    public Wishlist tapWishlist(){

        try{
            MyLogger.log.info("Tapping Wishlist");
            commanTabUiObjects.wishlist().tap();
            return Android.app.fabfurnish.wishlist;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Wishlist, element absent or blocked");
        }
    }
    public Cart tapCart(){

        try{
            MyLogger.log.info("Tapping Cart");
            commanTabUiObjects.cart().tap();
            return Android.app.fabfurnish.cart;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Cart, element absent or blocked");
        }
    }
    public Homepage tapHome(){

        try{
            MyLogger.log.info("Tapping Home");
            commanTabUiObjects.home().tap();
            return Android.app.fabfurnish.homepage;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Home, element absent or blocked");
        }
    }
    public Search tapSearch(){

        try{
            MyLogger.log.info("Tapping Search");
            commanTabUiObjects.search().tap();
            return Android.app.fabfurnish.search;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Search, element absent or blocked");
        }
    }
    public ScanQr tapScanQr(){

        try{
            MyLogger.log.info("Tapping ScanQr");
            commanTabUiObjects.scanqr().tap();
            return Android.app.fabfurnish.scanQr;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Menu, element absent or blocked");
        }
    }
    public String getCartCount(){

        try{
            MyLogger.log.info("Getting Cart Count");
            return commanTabUiObjects.cart_count().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Cart Count, element absent or blocked");
        }
    }

    public String getWishlishtCount(){

        try{
            MyLogger.log.info("Getting Wishlist Count");
            return commanTabUiObjects.wishlist_count().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Wishlist Count, element absent or blocked");
        }
    }
    public void setSearch(String value){

        try{
            MyLogger.log.info("Sending: "+value+" in search");
            commanTabUiObjects.searchText().typeText(value);
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Send: "+value+" in search, element absent or blocked");
        }
    }
    public void tapCloseSearch(){

        try{
            MyLogger.log.info("Tapping Close Search");
            commanTabUiObjects.closeSearch().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Close Search, element absent or blocked");
        }
    }
    public void tapSearchQrScan(){

        try{
            MyLogger.log.info("Tapping Search Qr Scan");
            commanTabUiObjects.searchQrScan().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Search Qr Scan, element absent or blocked");
        }
    }
}
