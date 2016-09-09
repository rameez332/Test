package api.apps.fabfurnish.wishlist;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by Rameez on 8/31/2016.
 */
public class WishlistUiObjects {
    private static UiObject

            product_name,
            sku,
            cut_price,
            special_price,
            buy_now,
            share,
            remove;


    public UiObject product_name(){
        if(product_name == null) product_name = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/name").makeUiObject();
        return product_name;
    }
    public UiObject sku(){
        if(sku == null) sku = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/sku").makeUiObject();
        return sku;
    }
    public UiObject cut_price(){
        if(cut_price == null) cut_price = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/cut_price").makeUiObject();
        return cut_price;
    }
    public UiObject special_price(){
        if(special_price == null) special_price = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/special_price").makeUiObject();
        return special_price;
    }
    //need to find some logic(xpath)
    public UiObject buy_now(){
        if(buy_now == null) buy_now = new UiSelector().textContains("BUY NOW").makeUiObject();
        return buy_now;
    }
    public UiObject share(){
        if(share == null) share = new UiSelector().textContains("SHARE").makeUiObject();
        return share;
    }
    public UiObject remove(){
        if(remove == null) remove = new UiSelector().textContains("REMOVE").makeUiObject();
        return remove;
    }
}