package api.apps.fabfurnish.register;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by Rameez on 8/31/2016.
 */
public class RegisterUiObjects {
    public static UiObject
            login_tab,
            signup_tab,
            create_email,
            create_password,
            enter_mobile,
            newsletter,
            create_account;


    public UiObject login_tab() {
        if (login_tab == null)
            login_tab = new UiSelector().resourceId(Android.app.fabfurnish.packageID() + ":id/login").makeUiObject();
        return login_tab;

    }

    public UiObject signup_tab() {
        if (signup_tab == null)
            signup_tab = new UiSelector().resourceId(Android.app.fabfurnish.packageID() + ":id/signup").makeUiObject();
        return signup_tab;

    }
    public UiObject create_email() {
        if (create_email == null)
            create_email = new UiSelector().resourceId(Android.app.fabfurnish.packageID() + ":id/email").makeUiObject();
        return create_email;

    }

    public UiObject create_password() {
        if (create_password == null)
            create_password = new UiSelector().resourceId(Android.app.fabfurnish.packageID() + ":id/password").makeUiObject();
        return create_password;

    }

    public UiObject enter_mobile() {
        if (enter_mobile == null)
            enter_mobile = new UiSelector().resourceId(Android.app.fabfurnish.packageID() + ":id/mobile_number").makeUiObject();
        return enter_mobile;

    }
    public UiObject newsletter() {
        if (newsletter == null)
            newsletter = new UiSelector().resourceId(Android.app.fabfurnish.packageID() + ":id/offers").makeUiObject();
        return newsletter;

    }

    public UiObject create_account_button() {
        if (create_account == null)
            create_account = new UiSelector().resourceId(Android.app.fabfurnish.packageID() + ":id/create_account").makeUiObject();
        return create_account;

    }


}
