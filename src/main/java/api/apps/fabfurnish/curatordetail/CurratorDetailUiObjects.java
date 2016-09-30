package api.apps.fabfurnish.curatordetail;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by Rameez on 9/29/2016.
 */
public class CurratorDetailUiObjects {

    private static UiObject
            designerName,
            designerDetails,
            share,
            expand_collapse,
            tap_right,
            tap_left;

    public UiObject designerName(){
        if(designerName==null) designerName=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/tvDesgnerName").makeUiObject();
        return designerName;
    }

    public UiObject designerDetails(){
        if(designerDetails==null) designerDetails=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/detail").makeUiObject();
        return designerDetails;
    }

    public UiObject share(){
        if(share==null) share=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/imgViewShare").makeUiObject();
        return share;
    }
    public UiObject expand_collapse(){
        if(expand_collapse==null) expand_collapse=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/expand_collapse").makeUiObject();
        return expand_collapse;
    }
    public UiObject tap_right(){
        if(tap_right==null) tap_right=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/right_r").makeUiObject();
        return tap_right;
    }
    public UiObject tap_left(){
        if(tap_left==null) tap_left=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/left_r").makeUiObject();
        return tap_left;
    }
}
