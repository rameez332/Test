package api.apps.fabfurnish.commontab;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by Rameez on 9/5/2016.
 */
public class CommanTabUiObjects {
    public static UiObject
            cart,
            wishlist,
            cart_count,
            wishlist_count,
            menuright,
            menu,
            home,
            scanqr,
            search,
            searchText,
            searchQrScan,
            closeSearch;

    public UiObject cart(){
        if(cart == null) cart = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/cart").makeUiObject();
        return cart;
    }
    public UiObject wishlist(){
        if(wishlist == null) wishlist = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/shortlist").makeUiObject();
        return wishlist;
    }
    public UiObject cart_count(){
        if(cart_count == null) cart_count = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/cart_tv").makeUiObject();
        return cart_count;
    }
    public UiObject wishlist_count(){
        if(wishlist_count == null) wishlist_count = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/shortlist_tv").makeUiObject();
        return wishlist_count;
    }
    public UiObject menuright(){
        if(menuright == null) menuright = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/leftmenu1").makeUiObject();
        return menuright;
    }
    public UiObject menu(){
        if(menu == null) menu = new UiSelector().resourceId("android:id/home").makeUiObject();
        return menu;
    }
    public UiObject home(){
        if(home == null) home = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/home").makeUiObject();
        return home;
    }
    public UiObject scanqr(){
        if(scanqr == null) scanqr = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/actionbar_qr_scan").makeUiObject();
        return scanqr;
    }
    public UiObject search(){
        if(search == null) search = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/top_search").makeUiObject();
        return search;
    }
    public UiObject searchText(){
        if(searchText == null) searchText = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/et_search_box").makeUiObject();
        return searchText;
    }
    public UiObject searchQrScan(){
        if(searchQrScan == null) searchQrScan = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/search_qr_scan").makeUiObject();
        return searchQrScan;
    }
    public UiObject closeSearch(){
        if(closeSearch == null) closeSearch = new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/et_search_box").makeUiObject();
        return closeSearch;
    }
}
