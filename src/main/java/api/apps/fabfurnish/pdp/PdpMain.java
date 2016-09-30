package api.apps.fabfurnish.pdp;

import api.apps.fabfurnish.commanactions.Swipe;
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


        while (uiObject.recentlyViewed().exists()){
            swipe.swipeDown(.9,.8);
        }


        HashMap<String,String> productDetails=new HashMap<>();

        List<WebElement> elements=uiObject.textLeft().multiple();
        Set<String> productData=new LinkedHashSet<>();

        for(WebElement e:elements){
            productData.add(e.getText());
        }


    }
}
