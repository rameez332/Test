package api.apps.fabfurnish.pdp;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by Rameez on 8/31/2016.
 */
public class PdpUiObjects {
    private UiObject
            productName,
            ratingStar,
            totalReviews,
            mrpText,
            dPriceText,
            maxPrice,
            maxPrice1,
            discountPrice,
            dPercentage,
            buyNow,
            dotIndicator,
            wishlist,
            share,
            checkPincode,
            editTextPincode,
            titleShipCharge,
            valueShipCharge,
            promise,
            promiseDetail,
            textLeft,
            textRight,
            more,
            recentlyViewed,
            recentNameRight,
            recentPrice,
            recentName,
            recentPriceRight,
            specialPrice,
            specialPriceRight,
            textLeftHeading,
            moreIcon;


    public UiObject productName(){
        if(productName== null) productName=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/name").makeUiObject();
        return productName;
    }

    public UiObject ratingStar(){
        if(ratingStar== null) ratingStar=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/ratingStar").makeUiObject();
        return ratingStar;
    }

    public UiObject totalReviews(){
        if(totalReviews== null) totalReviews=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/tvTotalReviews").makeUiObject();
        return totalReviews;
    }

    public UiObject mrpText(){
        if(mrpText== null) mrpText=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/mrp").makeUiObject();
        return mrpText;
    }

    public UiObject dPriceText(){
        if(dPriceText== null) dPriceText=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/DiscountPrice").makeUiObject();
        return dPriceText;
    }

    public UiObject maxPrice(){
        if(maxPrice== null) maxPrice=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/max_price").makeUiObject();
        return maxPrice;
    }

    public UiObject maxPrice1(){
        if(maxPrice1== null) maxPrice1=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/max_price1").makeUiObject();
        return maxPrice1;
    }

    public UiObject discountPrice(){
        if(discountPrice== null) discountPrice=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/discount_price").makeUiObject();
        return discountPrice;
    }

    public UiObject dPercentage(){
        if(dPercentage== null) dPercentage=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/discount_perc").makeUiObject();
        return dPercentage;
    }

    public UiObject buyNow(){
        if(buyNow== null) buyNow=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/buy").makeUiObject();
        return buyNow;
    }

    public UiObject dotIndicator(){
        if(dotIndicator== null) dotIndicator=new UiSelector().text(".").makeUiObject();
        return dotIndicator;
    }

    public UiObject wishlist(){
       if(wishlist== null) wishlist=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/shortlist_txt_new").makeUiObject();
        return wishlist;
    }

    public UiObject share(){
       if(share== null) share=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/share_txt_new").makeUiObject();
        return share;
    }

    public UiObject editTextPincode(){
       if(editTextPincode== null) editTextPincode=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/edtPincode").makeUiObject();
        return editTextPincode;
    }

    public UiObject checkPincode(){
       if(checkPincode== null) checkPincode=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/btnCheckPincode").makeUiObject();
        return checkPincode;
    }

    public UiObject titleShipCharge(){
       if(titleShipCharge== null) titleShipCharge=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/titleShipCharge").makeUiObject();
        return titleShipCharge;
    }

    public UiObject valueShipCharge(){
       if(valueShipCharge== null) valueShipCharge=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/valueShipCharge").makeUiObject();
        return valueShipCharge;
    }

    public UiObject promise(){
       if(promise== null) promise=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/tvOurPromise").makeUiObject();
        return promise;
    }

    public UiObject promiseDetail(){
       if(promiseDetail== null) promiseDetail=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/tvOurPromiseDetail").makeUiObject();
        return promiseDetail;
    }

    public UiObject textLeft(){
       if(textLeft== null) textLeft=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/text_left").makeUiObject();
        return textLeft;
    }

    public UiObject textRight(){
       if(textRight== null) textRight=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/text_right").makeUiObject();
        return textRight;
    }

    public UiObject more(){
       if(more== null) more=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/more").makeUiObject();
        return more;
    }

    public UiObject recentlyViewed(){
        if(recentlyViewed== null) recentlyViewed=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/recentlyViewed").makeUiObject();
        return recentlyViewed;
    }

    public UiObject recentName(){
        if(recentName== null) recentName=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/recent_name").makeUiObject();
        return recentName;
    }

    public UiObject recentNameRight(){
        if(recentNameRight== null) recentNameRight=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/recent_name_right").makeUiObject();
        return recentNameRight;
    }
    public UiObject recentPrice(){
        if(recentPrice== null) recentPrice=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/recent_price1").makeUiObject();
        return recentPrice;
    }

    public UiObject recentPriceRight(){
        if(recentPriceRight== null) recentPriceRight=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/recent_price1_right").makeUiObject();
        return recentPriceRight;
    }

    public UiObject specialPrice(){
        if(specialPrice== null) specialPrice=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/special_price").makeUiObject();
        return specialPrice;
    }

    public UiObject specialPriceRight(){
        if(specialPriceRight== null) specialPriceRight=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/special_price_right").makeUiObject();
        return specialPriceRight;
    }

    public UiObject textLeftHeading(){
        if(textLeftHeading== null) textLeftHeading=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/text_left_heading").makeUiObject();
        return textLeftHeading;
    }
    public UiObject moreIcon(){
        if(moreIcon== null) moreIcon=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/more_icon").makeUiObject();
        return moreIcon;
    }

}

