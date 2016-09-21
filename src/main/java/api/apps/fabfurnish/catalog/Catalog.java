package api.apps.fabfurnish.catalog;

import api.android.Android;
import api.apps.fabfurnish.filter.Filter;
import api.apps.fabfurnish.sort.Sort;
import api.apps.fabfurnish.wishlist.Wishlist;
import core.MyLogger;
import core.UiSelector;
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
            System.out.println(elements.size());
            return elements.get(i).getText();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant get Product Name, element absent or blocked");
        }
    }

    public String getMaxPrice() {

        try {
            MyLogger.log.info("Getting Max Price");
            elements=uiObject.max_price().multiple();
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
            return elements.get(i).getText();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant get Discounted Price, element absent or blocked");
        }
    }

    public String getProductImg() {
        try {
            MyLogger.log.info("Getting Product Image");
            elements=uiObject.product_img().multiple();
            return elements.get(i).getText();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant get Product Image, element absent or blocked");
        }
    }

    public Wishlist tapShortlist() {

        try {
            MyLogger.log.info("Tapping Shortlist");
            uiObject.shortlist().tap();
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

    public void tapProduct() {

        try {
            MyLogger.log.info("Tapping Product");
            elements=uiObject.product_name().multiple();
            elements.get(i).click();
            //return Android.app.fabfurnish.catalog;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant Tap Product, element absent or blocked");
        }
    }
    public Catalog tapView() {

        try {
            MyLogger.log.info("Tapping View");
            uiObject.changeView().tap();
            elements=uiObject.product_name().multiple();
            int s=elements.size();
            if(s!=1){
                System.out.println("Its a Grid View");
            }
            else
            {
                System.out.println("Its a List View");
            }
            return Android.app.fabfurnish.catalog;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant Tap Product, element absent or blocked");
        }
    }

    public Catalog getMultiple(){
        headerCount=getPdtCount();
        headerName=getHeaderName();
        elements=uiObject.product_name().multiple();
        size=elements.size();
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
        System.out.println("Product Count in String: "+result+" ,and in Int: "+Integer.parseInt(result));
        return Integer.parseInt(result);
    }
}
