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
    //Main Methods
    public Swipe swipeDown(double sy,double ey)throws InterruptedException{
        Dimension size = Android.driver.manage().window().getSize();
        int starty = (int) (size.height * sy);
        int endy = (int) (size.height * ey);
        int startx = size.width / 2;
        Android.driver.swipe(startx, starty, startx, endy, 3000);
        Thread.sleep(2000);
        return this;
    }

    public Swipe swipeDownIndex(int index, double sy,double ey)throws InterruptedException{
        Dimension size = Android.driver.manage().window().getSize();
        int starty = (int) (size.height * sy);
        int endy = (int) (size.height * ey);
        int startx = size.width / 2;
        for(int i=0;i<index;i++) {
            Android.driver.swipe(startx, starty, startx, endy, 3000);
            Thread.sleep(2000);
        }
        return this;
    }

    public Swipe swipeUp(double sy,double ey)throws InterruptedException{
        Dimension size = Android.driver.manage().window().getSize();
        int starty = (int) (size.height * sy);
        int endy = (int) (size.height * ey);
        int startx = size.width / 2;
        Android.driver.swipe(startx, endy, startx, starty, 3000);
        Thread.sleep(2000);
        return this;
    }
    public Swipe swipeUpIndex(int index, double sy,double ey)throws InterruptedException{
        Dimension size = Android.driver.manage().window().getSize();
        int starty = (int) (size.height * sy);
        int endy = (int) (size.height * ey);
        int startx = size.width / 2;
        for (int i=0;i<index;i++) {
            Android.driver.swipe(startx, endy, startx, starty, 3000);
            Thread.sleep(2000);
        }
        return this;
    }
}