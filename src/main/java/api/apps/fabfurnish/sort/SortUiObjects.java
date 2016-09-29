package api.apps.fabfurnish.sort;

import core.UiObject;
import core.UiSelector;

/**
 * Created by Rameez on 9/14/2016.
 */
public class SortUiObjects {
    private UiObject
            checkable,
            sortTitle;

    public UiObject checkedTextView(){
        if(checkable==null) checkable=new UiSelector().className("android.widget.CheckedTextView").makeUiObject();
        return checkable;
    }
    public UiObject sortTitle(){
        if(sortTitle==null) sortTitle=new UiSelector().resourceId("android:id/alertTitle").makeUiObject();
        return sortTitle;
    }
}
