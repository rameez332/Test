package api.apps.fabfurnish.menu;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by Rameez on 8/31/2016.
 */
public class MenuUiObjects {
    public static UiObject
            cat_name,
            cat1_name,
            subcat_name,
            tag_name;


    public UiObject cat_name() {
        if (cat_name == null)
            cat_name = new UiSelector().resourceId(Android.app.fabfurnish.packageID() + ":id/cat_name").makeUiObject();
        return cat_name;
    }
    public UiObject cat1_name() {
        if (cat1_name == null)
            cat1_name = new UiSelector().resourceId(Android.app.fabfurnish.packageID() + ":id/cat1_name").makeUiObject();
        return cat1_name;

    }
    public UiObject subcat_name() {
        if (subcat_name == null)
            subcat_name = new UiSelector().resourceId(Android.app.fabfurnish.packageID() + ":id/subcat_name").makeUiObject();
        return subcat_name;
    }
    public UiObject tag_name() {
        if (tag_name == null)
            tag_name = new UiSelector().resourceId(Android.app.fabfurnish.packageID() + ":id/tag_name").makeUiObject();
        return tag_name;
    }
}