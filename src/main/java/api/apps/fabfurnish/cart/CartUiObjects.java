package api.apps.fabfurnish.cart;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by Rameez on 8/31/2016.
 */
public class CartUiObjects {
    private static UiObject

    product_name,
    max_price,
    discounted_price,
    qty,
    delivered_days,
    remove,
    coupon_text,
    coupon_button,
    subtotal,
    final_order,
    continue_shopping,
    order_now,
    shipping;


    public UiObject product_name(){
        if(product_name == null) product_name = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/product_name").makeUiObject();
        return product_name;
    }
    public UiObject max_price(){
        if(max_price == null) max_price = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/max_price").makeUiObject();
        return max_price;
    }
    public UiObject qty(){
        if(qty == null) qty = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/qty_spinner").makeUiObject();
        return qty;
    }

    public UiObject delivered_days(){
        if(delivered_days == null) delivered_days = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/delivered_days").makeUiObject();
        return delivered_days;
    }
    public UiObject remove(){
        if(remove == null) remove = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/remove").makeUiObject();
        return remove;
    }
    public UiObject coupon_text(){
        if(coupon_text == null) coupon_text = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/coupon_et").makeUiObject();
        return coupon_text;
    }
    public UiObject discounted_price(){
        if(discounted_price == null) discounted_price = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/discount_price").makeUiObject();
        return discounted_price;
    }
    public UiObject coupon_button(){
        if(coupon_button == null) coupon_button = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/addCouponBtn").makeUiObject();
        return coupon_button;
    }
    public UiObject subtotal(){
        if(subtotal == null) subtotal = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/subtotal").makeUiObject();
        return subtotal;
    }
    public UiObject final_order(){
        if(final_order == null) final_order = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/net_amount").makeUiObject();
        return final_order;
    }
    public UiObject continue_shopping(){
        if(continue_shopping == null) continue_shopping = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/shopping").makeUiObject();
        return continue_shopping;
    }
    public UiObject order_now(){
        if(order_now == null) order_now = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/order").makeUiObject();
        return order_now;
    }
    public UiObject shipping(){
        if(shipping == null) shipping = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/right").makeUiObject();
        return shipping;
    }

}
