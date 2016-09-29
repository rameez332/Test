package api.apps.fabfurnish.homepage;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by Rameez on 8/31/2016.
 */
public class HomepageUiObjects {
    private UiObject
            optionImage,
            indicator;

    public UiObject optionImage(){
        if(optionImage==null)optionImage=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+"option_image").makeUiObject();
        return optionImage;
    }
    public UiObject indicator(){
        if(indicator==null)indicator=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+"indicator").makeUiObject();
        return indicator;
    }
}
