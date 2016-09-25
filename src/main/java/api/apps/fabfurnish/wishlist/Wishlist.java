package api.apps.fabfurnish.wishlist;

import api.android.Android;
import api.apps.fabfurnish.cart.Cart;
import api.apps.fabfurnish.share.Share;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Rameez on 8/31/2016.
 */
public class Wishlist {
    private int i;
    private List<WebElement> elements;
    public WishlistUiObjects uiObject = new WishlistUiObjects();

    public int getSize(){
        elements=uiObject.product_name().multiple();
        return elements.size();
    }
    public void setIndex(int index){this.i=index;}
    public String getProductName(){
        try{
            MyLogger.log.info("Getting Product Name");
            elements=uiObject.product_name().waitToAppearWithoutException(10).multiple();
            return elements.get(i).getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Product Name, element absent or blocked");
        }
    }
    public String getSku(){
        try{
            MyLogger.log.info("Getting Sku");
            elements=uiObject.sku().waitToAppearWithoutException(10).multiple();
            return elements.get(i).getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Sku, element absent or blocked");
        }
    }
    public String getCutPrice(){
        try{
            MyLogger.log.info("Getting Cut Price");
            elements=uiObject.cut_price().waitToAppearWithoutException(10).multiple();
            return elements.get(i).getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Cut Price, element absent or blocked");
        }
    }
    public String getSpecialPrice(){
        try{
            MyLogger.log.info("Getting Special Price");
            elements=uiObject.special_price().waitToAppearWithoutException(10).multiple();
            return elements.get(i).getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Special Price, element absent or blocked");
        }
    }
    public Cart tapBuyNow(){

        try{
            MyLogger.log.info("Tapping Buy Now");
            elements=uiObject.buy_now().waitToAppearWithoutException(10).multiple();
            elements.get(i).click();
            return Android.app.fabfurnish.cart;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Buy Now, element absent or blocked");
        }
    }
    public Share tapShare(){

        try{
            MyLogger.log.info("Tapping Share");
            elements=uiObject.share().waitToAppearWithoutException(10).multiple();
            elements.get(i).click();
            return Android.app.fabfurnish.share;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Share, element absent or blocked");
        }
    }
    public Wishlist tapRemove(){

        try{
            MyLogger.log.info("Tapping Remove");
            elements=uiObject.remove().waitToAppearWithoutException(10).multiple();
            elements.get(i).click();
            return Android.app.fabfurnish.wishlist;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Remove, element absent or blocked");
        }
    }
    public Wishlist tapProduct(){

        try{
            MyLogger.log.info("Tapping Product");
            elements=uiObject.product_name().waitToAppearWithoutException(10).multiple();
            elements.get(i).click();
            return Android.app.fabfurnish.wishlist;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Remove, element absent or blocked");
        }
    }
}
