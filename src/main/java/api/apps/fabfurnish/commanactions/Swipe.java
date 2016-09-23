package api.apps.fabfurnish.commanactions;

import api.android.Android;
import org.openqa.selenium.Dimension;

/**
 * Created by Rameez on 9/23/2016.
 */
public class Swipe {
    public void swipingHorizontal() throws InterruptedException{

        Dimension size = Android.driver.manage().window().getSize();

        int startx = (int) (size.width * 0.70);

        int endx = (int) (size.width * 0.30);

        int starty = size.height / 2;
        // System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);
        Android.driver.swipe(startx, starty, endx, starty, 3000);
        Thread.sleep(2000);

    }


    public void catalogSwipe()throws InterruptedException {

        Dimension size = Android.driver.manage().window().getSize();
        //int starty = (int) (size.height * 0.80);
        int starty = (int) (size.height * 0.99);
        //int endy = (int) (size.height * 0.20);
        int endy = (int) (size.height * 0.18);
        int startx = size.width / 2;
        //System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);
        Android.driver.swipe(startx, starty, startx, endy, 3000);
        Thread.sleep(2000);
        /* Android.driver.swipe(startx, endy, startx, starty, 3000);
        Thread.sleep(2000);*/
    }
}
