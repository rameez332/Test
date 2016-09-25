package api.apps.fabfurnish.menuright;

import api.android.Android;
import api.apps.fabfurnish.contactus.ContactUs;
import api.apps.fabfurnish.login.Login;
import api.apps.fabfurnish.myorder.MyOrder;
import api.apps.fabfurnish.scanqr.ScanQr;
import api.apps.fabfurnish.share.Share;
import api.apps.fabfurnish.trackorder.TrackOrder;
import api.apps.fabfurnish.tutorials.Tutorials;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by Rameez on 8/31/2016.
 */
public class MenuRight {
    public MenuRightUiObjects uiObject=new MenuRightUiObjects();

    public Login tapLogin(){
        try{
            MyLogger.log.info("Tapping Login");
            uiObject.login().tap();
            return Android.app.fabfurnish.login;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Login, element absent or blocked");
        }
    }

    public MenuRight tapLocation(){
        try{
            MyLogger.log.info("Tapping Location");
            uiObject.location().tap();
            return Android.app.fabfurnish.menuRight;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Location, element absent or blocked");
        }
    }

    public ScanQr tapScanQRCode(){
        try{
            MyLogger.log.info("Tapping Scan QR Code");
            uiObject.scan_QR_Code().tap();
            return Android.app.fabfurnish.scanQr;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Scan QR Code, element absent or blocked");
        }
    }
    public MenuRight tapMyScanList(){
        try{
            MyLogger.log.info("Tapping My Scan List");
            uiObject.my_Scan_List().tap();
            return Android.app.fabfurnish.menuRight;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap My Scan List, element absent or blocked");
        }
    }
    public TrackOrder tapTrackOrder(){
        try{
            MyLogger.log.info("Tapping Track Order");
            uiObject.track_Order().tap();
            return Android.app.fabfurnish.trackOrder;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Track Order, element absent or blocked");
        }
    }
    public MyOrder tapMyOrder(){
        try{
            MyLogger.log.info("Tapping My Order");
            uiObject.my_Order().tap();
            return Android.app.fabfurnish.myOrder;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap My Order, element absent or blocked");
        }
    }
    public Tutorials tapTutorial(){
        try{
            MyLogger.log.info("Tapping Tutorial");
            uiObject.tutorial().tap();
            return Android.app.fabfurnish.tutorials;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Tutorial, element absent or blocked");
        }
    }
    public Share tapShareApp(){
        try{
            MyLogger.log.info("Tapping Share App");
            uiObject.share_App().tap();
            return Android.app.fabfurnish.share;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Share App, element absent or blocked");
        }
    }
    public ContactUs tapContactUs(){
        try{
            MyLogger.log.info("Tapping Contact Us");
            uiObject.contact_Us().tap();
            return Android.app.fabfurnish.contactUs;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Contact Us, element absent or blocked");
        }
    }
}
