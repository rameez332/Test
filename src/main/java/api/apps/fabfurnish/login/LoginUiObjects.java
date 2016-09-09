package api.apps.fabfurnish.login;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by Rameez on 8/31/2016.
 */
public class LoginUiObjects {
    public static UiObject
            login_tab,
            signup_tab,
            email_id,
            password,
            show_password,
            forgot_password,
            login_bttn,
            login_fb,
            login_google;


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

    public UiObject email_id() {
        if (email_id == null)
            email_id = new UiSelector().resourceId(Android.app.fabfurnish.packageID() + ":id/email_login").makeUiObject();
        return email_id;

    }

    public UiObject password() {
        if (password == null)
            password = new UiSelector().resourceId(Android.app.fabfurnish.packageID() + ":id/password_login").makeUiObject();
        return password;

    }

    public UiObject show_password() {
        if (show_password == null)
            show_password = new UiSelector().resourceId(Android.app.fabfurnish.packageID() + ":id/show_password").makeUiObject();
        return show_password;

    }

    public UiObject forgot_password() {
        if (forgot_password == null)
            forgot_password = new UiSelector().resourceId(Android.app.fabfurnish.packageID() + ":id/forgotcheck_btn").makeUiObject();
        return forgot_password;

    }

    public UiObject login_bttn() {
        if (login_bttn == null)
            login_bttn = new UiSelector().resourceId(Android.app.fabfurnish.packageID() + ":id/login_btn").makeUiObject();
        return login_bttn;

    }

    public UiObject login_fb() {
        if (login_fb == null)
            login_fb = new UiSelector().resourceId(Android.app.fabfurnish.packageID() + ":id/fb_login_button").makeUiObject();
        return login_fb;

    }

    public UiObject login_google() {
        if (login_google == null) login_google = new UiSelector().textContains("Sign in").makeUiObject();
        return login_google;

    }
}