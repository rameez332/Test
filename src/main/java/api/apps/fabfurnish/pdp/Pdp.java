package api.apps.fabfurnish.pdp;

import api.android.Android;
import core.MyLogger;
import org.apache.xpath.operations.And;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by Rameez on 8/31/2016.
 */
public class Pdp {
    private PdpUiObjects uiObject = new PdpUiObjects();


    public String getProductName() {
        MyLogger.log.info("Getting Product Name");
        try {
            return uiObject.productName().getText();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant get Product Name, element absent or blocked");
        }
    }

    public String getRatingStar() {
        MyLogger.log.info("Getting Rating Star");
        try {
            return uiObject.ratingStar().getText();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant get Rating Star, element absent or blocked");
        }
    }

    public String getRatingReviews() {
        MyLogger.log.info("Getting Rating Review");
        try {
            return uiObject.totalReviews().getText();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant get Rating Review, element absent or blocked");
        }
    }

    public String getProductPrice() {
        MyLogger.log.info("Getting Product Price");
        try {
            return uiObject.maxPrice().getText();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant get Product Price, element absent or blocked");
        }
    }

    public String getDiscountedPrice() {
        MyLogger.log.info("Getting Discounted Price");
        try {
            return uiObject.discountPrice().getText();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant get Discounted Price, element absent or blocked");
        }
    }

    public String getDiscountedPercentange() {
        MyLogger.log.info("Getting Discounted Percentage");
        try {
            return uiObject.dPercentage().getText();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant get Discounted Percentage, element absent or blocked");
        }
    }

    public Pdp tapBuyNow() {
        MyLogger.log.info("Tapping Buy Now");
        try {
            uiObject.buyNow().tap();
            return Android.app.fabfurnish.pdp;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Buy Now, element absent or blocked");
        }
    }

    public Pdp tapDotIndicator() {
        MyLogger.log.info("Tapping Dot Indicator");
        try {
            uiObject.buyNow().tap();
            return Android.app.fabfurnish.pdp;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Buy Now, element absent or blocked");
        }
    }

    public Pdp tapRateIt() {
        MyLogger.log.info("Tapping Rate It");
        try {
            uiObject.totalReviews().tap();
            return Android.app.fabfurnish.pdp;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Rate It, element absent or blocked");
        }
    }

    public Pdp tapWishlist() {
        MyLogger.log.info("Tapping Wishlist");
        try {
            uiObject.wishlist().tap();
            return Android.app.fabfurnish.pdp;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Wishlist, element absent or blocked");
        }
    }

    public Pdp tapShare() {
        MyLogger.log.info("Tapping Share");
        try {
            uiObject.share().tap();
            return Android.app.fabfurnish.pdp;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Share, element absent or blocked");
        }
    }

    public Pdp tapCheckPincode() {
        MyLogger.log.info("Tapping Check Pincode Button");
        try {
            uiObject.checkPincode().tap();
            return Android.app.fabfurnish.pdp;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Check Pincode Button, element absent or blocked");
        }
    }

    public String getPromiseText() {
        MyLogger.log.info("Getting Promise Details");
        try {
            return uiObject.promiseDetail().getText();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant Get Promise Details, element absent or blocked");
        }
    }


}
