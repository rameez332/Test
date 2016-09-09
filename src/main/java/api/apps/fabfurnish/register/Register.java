package api.apps.fabfurnish.register;

import api.android.Android;
import api.apps.fabfurnish.login.Login;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by Rameez on 8/31/2016.
 */
public class Register {
    public RegisterUiObjects uiObject=new RegisterUiObjects();

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
    public Register sendEmailId(String value){
        try{
            MyLogger.log.info("Sending: "+value+ "to email Id TextBox");
            uiObject.create_email().typeText(value);
            return Android.app.fabfurnish.register;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant send:" +value + "to Email Id textBox, element absent or blocked");
        }
    }
    public Register sendPassword(String value){
        try{
            MyLogger.log.info("Sending Password: "+value+ "to Password TextBox");
            uiObject.create_password().typeText(value);
            return Android.app.fabfurnish.register;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant send:" +value + "to Password textBox, element absent or blocked");
        }
    }
    public Register sendMobileNumber(String value){
        try{
            MyLogger.log.info("Sending: "+value+ "to Mobile Number TextBox");
            uiObject.enter_mobile().typeText(value);
            return Android.app.fabfurnish.register;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant send:" +value + "to Mobile Numberss textBox, element absent or blocked");
        }
    }
    public Register tapNewsletter(){
        try{
            MyLogger.log.info("Tapping Newsletter Checkbox");
            uiObject.newsletter().tap();
            return Android.app.fabfurnish.register;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Newsletter Checkbox, element absent or blocked");
        }
    }
    public Register tapCreateAccountBttn(){
        try{
            MyLogger.log.info("Tapping Create Account Button");
            uiObject.create_account_button().tap();
            return Android.app.fabfurnish.register;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Create Account Button, element absent or blocked");
        }
    }
}
