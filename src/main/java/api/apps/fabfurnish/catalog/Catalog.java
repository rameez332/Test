package api.apps.fabfurnish.catalog;

import api.android.Android;
import api.apps.fabfurnish.filter.Filter;
import api.apps.fabfurnish.pdp.Pdp;
import api.apps.fabfurnish.sort.Sort;
import api.apps.fabfurnish.wishlist.Wishlist;
import core.MyLogger;
import core.UiSelector;
import io.appium.java_client.android.AndroidElement;
import org.apache.xpath.operations.And;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Rameez on 8/31/2016.
 */
public class Catalog {
    private int i,size,count,headerCount;
    private String headerName;
    private List<WebElement> elements;
   /*public Catalog(String set){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the Instance for the Product");
        this.i=in.nextInt();
    }*/
    public CatalogUiObjects uiObject = new CatalogUiObjects();

    public String getProductName() {
        try {
            MyLogger.log.info("Getting Product Name");
            elements=uiObject.product_name().multiple();
            this.size=elements.size();
            return elements.get(i).getText();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant get Product Name, element absent or blocked");
        }
    }

    public String getMaxPrice() {

        try {
            MyLogger.log.info("Getting Max Price");
            elements=uiObject.max_price().multiple();
            this.size=elements.size();
            return elements.get(i).getText();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant get Max Price, element absent or blocked");
        }
    }

    public String getHeader() {
        try {
            MyLogger.log.info("Getting Header Name");
            return uiObject.header().getText();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant get Header Name, element absent or blocked");
        }
    }

    public String getDiscountedPrice() {

        try {
            MyLogger.log.info("Getting Discounted Price");
            elements=uiObject.discounted_price().multiple();
            this.size=elements.size();
            return elements.get(i).getText();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant get Discounted Price, element absent or blocked");
        }
    }

    public String getProductImg() {
        try {
            MyLogger.log.info("Getting Product Image");
            elements=uiObject.product_img().multiple();
            this.size=elements.size();
            return elements.get(i).getText();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant get Product Image, element absent or blocked");
        }
    }

    public Wishlist tapShortlist() {

        try {
            MyLogger.log.info("Tapping Shortlist");
            elements=uiObject.shortlist().multiple();
            elements.get(i).click();
            return Android.app.fabfurnish.wishlist;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant Tap Shortlist, element absent or blocked");
        }
    }

    public Sort tapSort() {

        try {
            MyLogger.log.info("Tapping Sort");
            uiObject.sort().tap();
            return Android.app.fabfurnish.sort;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant Tap Sort, element absent or blocked");
        }
    }

    public Filter tapFilter() {

        try {
            MyLogger.log.info("Tapping Filter");
            uiObject.filter().tap();
            return Android.app.fabfurnish.filter;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant Tap Filter, element absent or blocked");
        }
    }

    public Pdp tapProduct() {

        try {
            MyLogger.log.info("Tapping Product");
            elements=uiObject.product_name().multiple();
            elements.get(i).click();
            return Android.app.fabfurnish.pdp;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant Tap Product, element absent or blocked");
        }
    }
    public Catalog tapGridView() {

        try {
            MyLogger.log.info("Tapping Grid View");

            if(size==1) uiObject.changeView().tap();

            else System.out.println("It is Already Grid View, No need to set, OtherWise set for ListView");

            return Android.app.fabfurnish.catalog;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant Tap Product, element absent or blocked");
        }
    }
    public Catalog tapListView() {

        try {
            MyLogger.log.info("Tapping List View");

            if(size!=1)uiObject.changeView().tap();
            else System.out.println("It is Already List View, no need to set, otherwise set for GridView");

            return Android.app.fabfurnish.catalog;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant Tap Product, element absent or blocked");
        }
    }



    public Catalog getMultiple(){
        headerCount=getPdtCount();
        headerName=getHeaderName();
        MyLogger.log.info("Getting All products");
        for (int a=0;a<size;a++){
            this.i=a;
            count++;
            MyLogger.log.info("Product No.: "+count+" of Category: "+headerName+" ,with Count: "+headerCount+" ,Product Name: "+getProductName()+" ,Max Price: "+getMaxPrice()+" ,Discounted Price: "+getDiscountedPrice());

            }
        return this;
    }
    public String  getHeaderName(){
        String h=getHeader();
        int index=h.indexOf("(");
        String sub=h.substring(0,index);
        System.out.println(sub);
        return sub;
    }
    public int getPdtCount(){
        String h=getHeader();
        int len=h.trim().length();
        String result = "";

        for (int i = 0; i < len; i++) {
            Character character = h.charAt(i);
            if (Character.isDigit(character)) {
                result += character;
            }
        }
        //System.out.println("Product Count in String: "+result+" ,and in Int: "+Integer.parseInt(result));
        return Integer.parseInt(result);
    }

    public void swipingHorizontal() throws InterruptedException{
        //Get the size of screen.
        Dimension size = Android.driver.manage().window().getSize();
        //System.out.println(size);

        //Find swipe start and end point from screen's with and height.
        //Find startx point which is at right side of screen.
        int startx = (int) (size.width * 0.70);
        //Find endx point which is at left side of screen.
        int endx = (int) (size.width * 0.30);
        //Find vertical point where you wants to swipe. It is in middle of screen height.
        int starty = size.height / 2;
       // System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);

        //Swipe from Right to Left.
        Android.driver.swipe(startx, starty, endx, starty, 3000);

        //Swipe from Left to Right.
        Android.driver.swipe(endx, starty, startx, starty, 3000);

    }


    public void swipingVertical()throws InterruptedException {
        //Get the size of screen.
        Dimension size = Android.driver.manage().window().getSize();
        System.out.println(size);

        //Find swipe start and end point from screen's with and height.
        //Find starty point which is at bottom side of screen.
        //int starty = (int) (size.height * 0.80);
        int starty = (int) (size.height * 0.99);
        //Find endy point which is at top side of screen.
        //int endy = (int) (size.height * 0.20);
        int endy = (int) (size.height * 0.17);
        //Find horizontal point where you wants to swipe. It is in middle of screen width.
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

        //Swipe from Bottom to Top.
        Android.driver.swipe(startx, starty, startx, endy, 3000);
        Thread.sleep(2000);
        //Swipe from Top to Bottom.
       /* Android.driver.swipe(startx, endy, startx, starty, 3000);
        Thread.sleep(2000);*/
    }

    public Catalog gettingAllPdts()throws InterruptedException{
        int pdtcount=getPdtCount();

        for(int i=1;i<=pdtcount/4;i++)
        {
            getMultiple();
            swipingVertical();

        }
        System.out.println("All Products are Fetched");
        return Android.app.fabfurnish.catalog;
    }
}
