package api.apps.fabfurnish.cart;

import api.android.Android;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Rameez on 8/31/2016.
 */
public class Cart {
List<WebElement> elements;
    private int i;
    public CartUiObjects uiObject =new CartUiObjects();

    private String getProductName(){
        try{
            MyLogger.log.info("Getting Product Name");
            elements=uiObject.product_name().multiple();
            return elements.get(i).getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Product Name, element absent or blocked");
        }
    }

    private String getMaxPrice(){

        try{
            MyLogger.log.info("Getting Max Price");
            elements=uiObject.max_price().multiple();
            return elements.get(i).getText();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Max Price, element absent or blocked");
        }
    }
    private String getDiscountedPrice(){

        try{
            MyLogger.log.info("Getting Discounted Price");
            elements=uiObject.discounted_price().multiple();
            return elements.get(i).getText();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Discounted Price, element absent or blocked");
        }
    }
    private String getQty(){

        try{
            MyLogger.log.info("Getting Qauntity of the Product");
            elements=uiObject.qty().multiple();
            return elements.get(i).getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Qauntity of the Product, element absent or blocked");
        }
    }
    private String getDeliveredDays(){

        try{
            MyLogger.log.info("Getting Delivered Days");
            elements=uiObject.delivered_days().multiple();
            return elements.get(i).getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Delivered Days, element absent or blocked");
        }
    }
    private Cart tapRemove(){

        try{
            MyLogger.log.info("Getting Discounted Price");
            elements=uiObject.remove().multiple();
            elements.get(i).click();
            return Android.app.fabfurnish.cart;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Discounted Price, element absent or blocked");
        }
    }
    public String getShippingText(){

        try{
            MyLogger.log.info("Getting Shipping Text");
            return uiObject.shipping().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Shipping Text, element absent or blocked");
        }
    }
    public String getSubtotalText(){

        try{
            MyLogger.log.info("Getting Subtotal Text");
            return uiObject.subtotal().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Subtotal Texte, element absent or blocked");
        }
    }
    public String getFinalOrderText(){

        try{
            MyLogger.log.info("Getting Final Order Text");
            return uiObject.final_order().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Final Order Text, element absent or blocked");
        }
    }
    public String getShippingDaysText(){

        try{
            MyLogger.log.info("Getting Shipping Days Text");
            return uiObject.shipping().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Shipping Days Text, element absent or blocked");
        }
    }
    public Cart tapContinueShopping(){

        try{
            MyLogger.log.info("Tapping Continue Shopping");
            uiObject.continue_shopping().tap();
            return Android.app.fabfurnish.cart;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Continue Shopping, element absent or blocked");
        }
    }
    public Cart tapOrderNow(){

        try{
            MyLogger.log.info("Tapping Order Now");
            uiObject.order_now().tap();
            return Android.app.fabfurnish.cart;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Order Now Button, element absent or blocked");
        }
    }

}



