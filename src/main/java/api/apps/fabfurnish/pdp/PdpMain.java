package api.apps.fabfurnish.pdp;

import api.apps.fabfurnish.commanactions.Swipe;
import core.UiSelector;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Rameez on 9/30/2016.
 */
public class PdpMain {
    Pdp pdp=new Pdp();
    PdpUiObjects uiObject=new PdpUiObjects();
    Swipe swipe=new Swipe();


    public void getProductInfo() throws InterruptedException{

        while (!(new UiSelector().text("SKU").makeUiObject().waitToAppearWithoutException(2).exists())){
            swipe.swipeDown(.9,.8);
        }

        Set<String> textL = new LinkedHashSet<>();
        Set<String> textR = new LinkedHashSet<>();
        HashMap<String, String> productDetails = new HashMap<>();
        do {
            List<WebElement> textLeft = uiObject.textLeft().multiple();

            for (WebElement e : textLeft) {
                textL.add(e.getText());
            }
            List<WebElement> more=uiObject.more().multiple();
            while(more.size())
            for(WebElement e:more){
                e.click();
                textR.add(uiObject.textRight().getText());
            }


            swipe.swipeDown(.9,.8);
        } while (!uiObject.recentlyViewed().waitToAppearWithoutException(2).exists());

    }
}
