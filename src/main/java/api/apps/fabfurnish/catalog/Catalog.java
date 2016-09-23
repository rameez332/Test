package api.apps.fabfurnish.catalog;

import api.android.Android;
import api.apps.fabfurnish.commanactions.Swipe;
import api.apps.fabfurnish.filter.Filter;
import api.apps.fabfurnish.pdp.Pdp;
import api.apps.fabfurnish.sort.Sort;
import api.apps.fabfurnish.wishlist.Wishlist;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rameez on 8/31/2016.
 */
public class Catalog {
    private int i,count;
    private String headerName;
    private List<WebElement> elements;

    private int setSize() {
        elements=uiObject.product_name().multiple();
        return elements.size();
    }
    private String headerText(){
        return uiObject.header().getText();
    }
    /*public Catalog(String set){
            Scanner in= new Scanner(System.in);
            System.out.println("Enter the Instance for the Product");
            this.i=in.nextInt();
        }*/
    public CatalogUiObjects uiObject = new CatalogUiObjects();
    public ProductsData productsData=new ProductsData();
    private Swipe swipe=new Swipe();
    public String getProductName() {
        try {
            MyLogger.log.info("Getting Product Name");
            elements=uiObject.product_name().multiple();
            return elements.get(i).getText();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant get Product Name, element absent or blocked");
        }
    }

    private String getMaxPrice() {

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

    private String getDiscountedPrice() {

        try {
            MyLogger.log.info("Getting Discounted Price");
            elements=uiObject.discounted_price().multiple();

            return elements.get(i).getText();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant get Discounted Price, element absent or blocked");
        }
    }

    private String getProductImg() {
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
            elements=uiObject.product_name().multiple();
            int setsize=elements.size();
            MyLogger.log.info("Tapping Grid View");

            if(setsize==1) uiObject.changeView().tap();

            else System.out.println("It is Already Grid View, No need to set, OtherWise set for ListView");

            return Android.app.fabfurnish.catalog;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant Tap Product, element absent or blocked");
        }
    }
    public Catalog tapListView() {

        try {
            elements=uiObject.product_name().multiple();
            int setsize=elements.size();
            MyLogger.log.info("Tapping List View");

            if(setSize()!=1)uiObject.changeView().tap();
            else System.out.println("It is Already List View, no need to set, otherwise set for GridView");

            return Android.app.fabfurnish.catalog;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant Tap Product, element absent or blocked");
        }
    }

    private void setProducts(){
       for (int a=0;a<setSize();a++){
            this.i=a;
            count++;
            productsData.setProductData(getProductName(),getMaxPrice(),getDiscountedPrice());
        }
    }

    public String  getHeaderName(){
        String h=headerText();
        int index=h.indexOf("(");
        String sub=h.substring(0,index);
        return sub;
    }

    public int getPdtCount(){
        String h=headerText();
        int len=h.trim().length();
        String result = "";
        for (int i = 0; i < len; i++) {
            Character character = h.charAt(i);
            if (Character.isDigit(character)) {
                result += character;
            }
        }
       return Integer.parseInt(result);
    }

    public Catalog setAllPdts()throws InterruptedException{
        int pdtcount=getPdtCount();

        for(int i=1;i<=pdtcount/4;i++)
        {
            setProducts();
            swipe.catalogSwipe();
        }
        System.out.println("All Products are Fetched");
        return Android.app.fabfurnish.catalog;
    }

    public ArrayList<String> getAllProductsName(){
    return productsData.getProductName();
    }

    public ArrayList<String> getAllMaxPrice(){
        return productsData.getMaxPrice();
    }

    public ArrayList<String> getAllDiscountedPrice(){
        return productsData.getDiscountedPrice();
    }
}