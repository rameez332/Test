package api.apps.fabfurnish.menuright;

import api.android.Android;
import api.apps.fabfurnish.login.Login;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by Rameez on 8/31/2016.
 */
public class MenuRight {
    public MenuRightUiObjects uiObject=new MenuRightUiObjects();

    public Login tapLogin(){
        try{
            MyLogger.log.info("Tapping Login");
            uiObject.login().tap();
            return Android.app.fabfurnish.login;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Tap Login, element absent or blocked");
        }
    }
}
