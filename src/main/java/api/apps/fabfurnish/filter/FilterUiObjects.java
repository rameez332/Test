package api.apps.fabfurnish.filter;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by Rameez on 9/14/2016.
 */
public class FilterUiObjects {

    private static UiObject
    actionTitle,
    attributeName,
    attributes,
    clearAllBtn,
    applyBtn;

    public UiObject actionTitle(){
        if(actionTitle==null) actionTitle=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/action_bar_title").makeUiObject();
        return actionTitle;
    }
    public UiObject attributeName(){
        if(attributeName==null) attributeName=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/tvMenu_Name").makeUiObject();
        return attributeName;
    }

    public UiObject attributes(){
        if(attributes==null) attributes=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/tvMenu_Name").makeUiObject();
        return attributes;
    }

    public UiObject clearAllBtn(){
        if(clearAllBtn==null) clearAllBtn=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/btn_clear").makeUiObject();
        return clearAllBtn;
    }

    public UiObject applyBtn(){
        if(applyBtn==null) applyBtn=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/btn_apply").makeUiObject();
        return applyBtn;
    }
}
