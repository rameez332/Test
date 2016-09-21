package api.apps.fabfurnish.catalog;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by Rameez on 8/31/2016.
 */
public class CatalogUiObjects {
    private static UiObject
    header,
    sort,
    product_img,
    product_name,
    shortlist,
    max_price,
    discounted_price,
    color_family,
    imageViewonDisplay,
    filter,
    changeView;

    public UiObject header(){
        if(header == null) header = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/header").makeUiObject();
        return header;
    }
    public UiObject sort(){
        if(sort == null) sort = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/btn_sort_dialog").makeUiObject();
        return sort;
    }
    public UiObject product_img(){
        if(product_img == null) product_img = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/product_img").makeUiObject();
        return product_img;
    }

    public UiObject product_name() {
        if (product_name == null)
            product_name = new UiSelector().resourceId(Android.app.fabfurnish.packageID() + ":id/product_name").makeUiObject();
        return product_name;
    }
    public UiObject shortlist(){
        if(shortlist == null) shortlist = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/shortlist_icon").makeUiObject();
        return shortlist;
    }
    public UiObject max_price(){
        if(max_price == null) max_price = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/max_price").makeUiObject();
        return max_price;
    }
    public UiObject discounted_price(){
        if(discounted_price == null) discounted_price = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/discount_price").makeUiObject();
        return discounted_price;
    }
    public UiObject color_family(){
        if(color_family == null) color_family = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/coloroption_tex").makeUiObject();
        return color_family;
    }
    public UiObject imageViewonDisplay(){
        if(imageViewonDisplay == null) imageViewonDisplay = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/imgViewOnDisplay").makeUiObject();
        return imageViewonDisplay;
    }
    public UiObject filter(){
        if(filter == null) filter = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/FloatingView").makeUiObject();
        return filter;
    }
    public UiObject changeView(){
        if(changeView == null) changeView = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/img_layout_type").makeUiObject();
        return changeView;
    }


}
