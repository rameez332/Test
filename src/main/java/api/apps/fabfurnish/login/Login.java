package api.apps.fabfurnish.login;

import api.android.Android;
import api.apps.fabfurnish.register.Register;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by Rameez on 8/31/2016.
 */
public class Login {

    public LoginUiObjects uiObject=new LoginUiObjects();
    public Login sendEmailId(String value){
        try{
            MyLogger.log.info("Sending: "+value+ "to email Id TextBox");
            uiObject.email_id().typeText(value);
            return Android.app.fabfurnish.login;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant send:" +value + "to Email Id textBox, element absent or blocked");
        }
    }
    public Login sendPassword(String value){
        try{
            MyLogger.log.info("Sending Password: "+value+ "to Password TextBox");
            uiObject.password().typeText(value);
            return Android.app.fabfurnish.login;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant send:" +value + "to Password textBox, element absent or blocked");
        }
    }
    public Login tapShowPassword(){
        try{
            MyLogger.log.info("Tapping Show Password Checkbox");
            uiObject.show_password().tap();
            return Android.app.fabfurnish.login;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Show Password Checkbox, element absent or blocked");
        }
    }
    public Login tapForgotPassword(){
        try{
            MyLogger.log.info("Tapping Forgot Password Checkbox");
            uiObject.forgot_password().tap();
            return Android.app.fabfurnish.login;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Forgot Password Checkbox, element absent or blocked");
        }
    }
    public Login tapLoginButton(){
        try{
            MyLogger.log.info("Tapping Login Button");
            uiObject.login_bttn().tap();
            return Android.app.fabfurnish.login;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Login Button, element absent or blocked");
        }
    }
    public Login tapLoginFb(){
        try{
            MyLogger.log.info("Tapping Login Fb Button");
            uiObject.login_fb().tap();
            return Android.app.fabfurnish.login;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Login Fb Button, element absent or blocked");
        }
    }
    public Login tapLoginGoogle(){
        try{
            MyLogger.log.info("Tapping Login Google Button");
            uiObject.login_google().tap();
            return Android.app.fabfurnish.login;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Login Google Button, element absent or blocked");
        }
    }
    public Login tapLoginTab(){
        try{
            MyLogger.log.info("Tapping Login Tab");
            uiObject.login_tab().tap();
            return Android.app.fabfurnish.login;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Login Tab, element absent or blocked");
        }
    }
    public Register tapSignupTab(){
        try{
            MyLogger.log.info("Tapping Signup Tab");
            uiObject.signup_tab().tap();
            return Android.app.fabfurnish.register;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Signup Tab, element absent or blocked");
        }
    }
}