package api.apps.fabfurnish.wishlist;

import api.android.Android;
import api.apps.fabfurnish.cart.Cart;
import api.apps.fabfurnish.share.Share;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by Rameez on 8/31/2016.
 */
public class Wishlist {
    public WishlistUiObjects uiObject = new WishlistUiObjects();

    public String getProductName(){
        try{
            MyLogger.log.info("Getting Product Name");
            return uiObject.product_name().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Product Name, element absent or blocked");
        }
    }
    public String getSku(){
        try{
            MyLogger.log.info("Getting Sku");
            return uiObject.sku().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Sku, element absent or blocked");
        }
    }
    public String getCutPrice(){
        try{
            MyLogger.log.info("Getting Cut Price");
            return uiObject.cut_price().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Cut Price, element absent or blocked");
        }
    }
    public String getSpecialPrice(){
        try{
            MyLogger.log.info("Getting Special Price");
            return uiObject.special_price().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Special Price, element absent or blocked");
        }
    }
    public Cart tapBuyNow(){

        try{
            MyLogger.log.info("Tapping Buy Now");
            uiObject.buy_now().tap();
            return Android.app.fabfurnish.cart;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Buy Now, element absent or blocked");
        }
    }
    public Share tapShare(){

        try{
            MyLogger.log.info("Tapping Share");
            uiObject.share().tap();
            return Android.app.fabfurnish.share;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Share, element absent or blocked");
        }
    }
    public Wishlist tapRemove(){

        try{
            MyLogger.log.info("Tapping Remove");
            uiObject.remove().tap();
            return Android.app.fabfurnish.wishlist;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Remove, element absent or blocked");
        }
    }
}
