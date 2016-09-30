package api.apps.fabfurnish.fabideas;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by Rameez on 9/29/2016.
 */
public class FabIdeasUiObjects {

    private UiObject
            designerName,
            ideabookPin,
            fabLike,
            fabLikeCount;
    public UiObject designerName(){
        if(designerName==null) designerName=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/designer_name").makeUiObject();
        return designerName;
    }
    public UiObject ideabookPin(){
        if(ideabookPin==null) ideabookPin=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/fabidea_imgView").makeUiObject();
        return ideabookPin;
    }
    public UiObject fabLike(){
        if(fabLike==null) fabLike=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/fab_like").makeUiObject();
        return fabLike;
    }
    public UiObject fabLikeCount(){
        if(fabLikeCount==null) fabLikeCount=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/fab_like_text").makeUiObject();
        return fabLikeCount;
    }
}