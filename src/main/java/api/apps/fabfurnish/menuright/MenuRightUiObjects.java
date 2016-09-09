package api.apps.fabfurnish.menuright;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by Rameez on 8/31/2016.
 */
public class MenuRightUiObjects {
    public static UiObject
            login,
            scan_QR_Code,
            my_Scan_List,
            track_Order,
            my_Order,
            tutorial,
            share_App,
            contact_Us;


    public UiObject login() {
        if (login == null)
            login = new UiSelector().textContains("Login").makeUiObject();
        return login;
    }

    public UiObject scan_QR_Code() {
        if (scan_QR_Code == null)
            scan_QR_Code = new UiSelector().textContains("Scan QR Code").makeUiObject();
        return scan_QR_Code;
    }

    public UiObject my_Scan_List() {
        if (my_Scan_List == null)
            my_Scan_List = new UiSelector().textContains("My Scan List").makeUiObject();
        return my_Scan_List;
    }
    public UiObject track_Order() {
        if (track_Order == null)
            track_Order = new UiSelector().textContains("Track Order").makeUiObject();
        return track_Order;
    }
    public UiObject my_Order() {
        if (my_Order == null)
            my_Order = new UiSelector().textContains("My Order").makeUiObject();
        return my_Order;
    }
    public UiObject tutorial() {
        if (tutorial == null)
            tutorial = new UiSelector().textContains("Tutorial").makeUiObject();
        return tutorial;
    }
    public UiObject share_App() {
        if (share_App == null)
            share_App = new UiSelector().textContains("Share App").makeUiObject();
        return share_App;
    }
    public UiObject contact_Us() {
        if (contact_Us == null)
            contact_Us = new UiSelector().textContains("Contact Us").makeUiObject();
        return contact_Us;
    }
}
