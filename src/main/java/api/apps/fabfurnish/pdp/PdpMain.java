package api.apps.fabfurnish.pdp;

import api.apps.fabfurnish.commanactions.Swipe;
import core.MyLogger;
import core.UiSelector;
import org.openqa.selenium.WebElement;

import java.util.*;

/**
 * Created by Rameez on 9/30/2016.
 */
public class PdpMain {
    Pdp pdp=new Pdp();
    PdpUiObjects uiObject=new PdpUiObjects();
    Swipe swipe=new Swipe();
    private Set<String> textL = new LinkedHashSet<>();
    private Set<String> textR = new LinkedHashSet<>();


    public void getProductInfo() throws InterruptedException{

        while (!(new UiSelector().text("SKU").makeUiObject().waitToAppearWithoutException(2).exists())){
            swipe.swipeDown(.9,.6);
        }



        do {
            List<WebElement> textLeft = uiObject.textLeft().multiple();
            MyLogger.log.info("Getting text Left");
            for (WebElement e : textLeft) {
                this.textL.add(e.getText());
            }
            MyLogger.log.info("Getting Tapping More");
            while (new UiSelector().text(" + ").makeUiObject().waitToAppearWithoutException(10).exists());
            {
               List<WebElement> e= new UiSelector().text(" + ").makeUiObject().multiple();
                e.get(0).click();
            }

            List<WebElement> textRight = uiObject.textRight().multiple();
            MyLogger.log.info("Getting text Right");
            for (WebElement e : textRight) {
                this.textR.add(e.getText());
            }

            swipe.swipeDown(.9,.72);
        } while (!uiObject.recentlyViewed().waitToAppearWithoutException(2).exists()&&!(new UiSelector().text(" + ").makeUiObject().exists()));

    }

    public void printData(){
        MyLogger.log.info("Product Data");
        ArrayList<String> a1=new ArrayList<>(textL);
        ArrayList<String> a2=new ArrayList<>(textR);
        for(int i=0;i<a1.size();i++){
            MyLogger.log.info(a1.get(i)+" : "+a2.get(i));
        }

        MyLogger.log.info("Getting Set Data");
        for(int i=0;i<textL.size();i++){
            MyLogger.log.info(textL+" : "+textR);
        }
    }
}
