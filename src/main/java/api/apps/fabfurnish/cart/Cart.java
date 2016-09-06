package api.apps.fabfurnish.cart;

import api.android.Android;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by Rameez on 8/31/2016.
 */
public class Cart {

    public CartUiObjects cartuiobjects =new CartUiObjects();



    public String getProductName(){

        try{
            MyLogger.log.info("Getting Product Name");
            return cartuiobjects.product_name().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Product Name, element absent or blocked");
        }
    }

    public String getMaxPrice(){

        try{
            MyLogger.log.info("Getting Max Price");
            return cartuiobjects.max_price().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Max Price, element absent or blocked");
        }
    }

    public String getQty(){

        try{
            MyLogger.log.info("Getting Qauntity of the Product");
            return cartuiobjects.qty().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Qauntity of the Product, element absent or blocked");
        }
    }
    public String getDeliveredDays(){

        try{
            MyLogger.log.info("Getting Delivered Days");
            return cartuiobjects.delivered_days().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Delivered Days, element absent or blocked");
        }
    }
    public Cart tappingRemove(){

        try{
            MyLogger.log.info("Getting Discounted Price");
            cartuiobjects.discounted_price().tap();
            return Android.app.fabfurnish.cart;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Discounted Price, element absent or blocked");
        }
    }
    public String getShippingText(){

        try{
            MyLogger.log.info("Getting Shipping Text");
            return cartuiobjects.shipping().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Shipping Text, element absent or blocked");
        }
    }
    public String getSubtotalText(){

        try{
            MyLogger.log.info("Getting Subtotal Text");
            return cartuiobjects.subtotal().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Subtotal Texte, element absent or blocked");
        }
    }
    public String getFinalOrderText(){

        try{
            MyLogger.log.info("Getting Final Order Text");
            return cartuiobjects.final_order().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Final Order Text, element absent or blocked");
        }
    }
    public String getShippingDaysText(){

        try{
            MyLogger.log.info("Getting Shipping Days Text");
            return cartuiobjects.shipping().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Shipping Days Text, element absent or blocked");
        }
    }

}



