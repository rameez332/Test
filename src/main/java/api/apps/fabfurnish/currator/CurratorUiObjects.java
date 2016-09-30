package api.apps.fabfurnish.currator;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by Rameez on 9/29/2016.
 */
public class CurratorUiObjects {

    private static UiObject
            designerName,
            designerDetails,
            share;

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
}