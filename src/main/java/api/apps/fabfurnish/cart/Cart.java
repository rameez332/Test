package api.apps.fabfurnish.cart;

import api.android.Android;
import api.apps.fabfurnish.commanactions.Swipe;
import api.apps.fabfurnish.commontab.CommanTab;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rameez on 8/31/2016.
 */
public class Cart {
private List<WebElement> elements;
    private int i;
    public CartUiObjects uiObject =new CartUiObjects();
    private CartData cartData=new CartData();
    public CommanTab comman=new CommanTab();
    public Swipe swipe=new Swipe();

    public void setIndex(int index){this.i=index;}

    public String getProductName(){
        try{
            MyLogger.log.info("Getting Product Name");
            elements=uiObject.product_name().multiple();
            return elements.get(i).getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Product Name, element absent or blocked");
        }
    }

    public String getMaxPrice(){

        try{
            MyLogger.log.info("Getting Max Price");
            elements=uiObject.max_price().multiple();
            return elements.get(i).getText();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Max Price, element absent or blocked");
        }
    }
    public String getDiscountedPrice(){

        try{
            MyLogger.log.info("Getting Discounted Price");
            elements=uiObject.discounted_price().multiple();
            return elements.get(i).getText();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Discounted Price, element absent or blocked");
        }
    }
    public String getQty(){

        try{
            MyLogger.log.info("Getting Qauntity of the Product");
            elements=uiObject.qty().multiple();
            return elements.get(i).getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Qauntity of the Product, element absent or blocked");
        }
    }
    public String getDeliveredDays(){

        try{
            MyLogger.log.info("Getting Delivered Days");
            elements=uiObject.delivered_days().multiple();
            return elements.get(i).getText();
        }catch (NoSuchElementException e){

            throw new AssertionError("Cant get Delivered Days, element absent or blocked");
        }
    }
    public Cart tapRemove(){

        try{
            MyLogger.log.info("Getting Discounted Price");
            elements=uiObject.remove().multiple();
            elements.get(i).click();
            return Android.app.fabfurnish.cart;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Discounted Price, element absent or blocked");
        }
    }
    public String getShippingText(){

        try{
            MyLogger.log.info("Getting Shipping Text");
            return uiObject.shipping().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Shipping Text, element absent or blocked");
        }
    }
    public String getSubtotalText(){

        try{
            MyLogger.log.info("Getting Subtotal Text");
            return uiObject.subtotal().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Subtotal Texte, element absent or blocked");
        }
    }
    public String getFinalOrderText(){

        try{
            MyLogger.log.info("Getting Final Order Text");
            return uiObject.final_order().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Final Order Text, element absent or blocked");
        }
    }
    public String getShippingDaysText(){

        try{
            MyLogger.log.info("Getting Shipping Days Text");
            return uiObject.shipping().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Shipping Days Text, element absent or blocked");
        }
    }
    public Cart tapContinueShopping(){

        try{
            MyLogger.log.info("Tapping Continue Shopping");
            uiObject.continue_shopping().tap();
            return Android.app.fabfurnish.cart;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Continue Shopping, element absent or blocked");
        }
    }
    public Cart tapOrderNow(){

        try{
            MyLogger.log.info("Tapping Order Now");
            uiObject.order_now().tap();
            return Android.app.fabfurnish.cart;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Order Now Button, element absent or blocked");
        }
    }
    public Cart tapProduct(){
        try{
            MyLogger.log.info("Tapping Order Now");
            elements=uiObject.product_name().multiple();
            elements.get(i).click();
            return Android.app.fabfurnish.cart;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Order Now Button, element absent or blocked");
        }
    }

    public int getSize(){
        elements=uiObject.product_name().multiple();
        return elements.size();
    }
    /*private void setProducts()
    {
        List<WebElement> max=uiObject.max_price().multiple();

        for(int a=0;a<max.size();a++)
        {
            this.i=a;
            cartData.setProductName(getProductName());
            cartData.setMaxPrice(getMaxPrice());
            cartData.seDiscountedPrice(getDiscountedPrice());
            if(dflag==0)cartData.setDeliveredDays(getDeliveredDays());
            else System.out.println("Delivered Days is Absent");
            cartData.setQty(getQty());
        }
    }*/

    /*public void setAllProdcuts()throws InterruptedException
    {
     *//*   int b=0;
        List<WebElement> qtyel=uiObject.qty().multiple();

        System.out.println("Getting Cart Count");
        int count= Integer.parseInt(comman.getCartCount());
        System.out.println("Cart Count is: "+count);
        for(int a=count;a>=0;a--){
            for(int c=0;c<qtyel.size();c++) {
                System.out.println("Qty is: "+qtyel.get(b).getText());
                a = a - Integer.parseInt(qtyel.get(b).getText());
                setProducts();
                b++;
            }
            swipe.cartSwipe();

        }*//*
        *//*if(!uiObject.order_now().exists()){
            setProducts();
            swipe.cartSwipe();
        }*//*
       *//* for(int a=0;a<3;a++){
            setProducts();
            swipe.cartSwipe();
        }*//*
       int count =comman.getCartCount();
        if(count!=0) {
            do {
                setProducts();
                swipe.cartSwipe();
            } while (!uiObject.order_now().waitToAppearWithoutException(10).exists());
        }
        else System.out.println("There is not Item inside Cart");
    }

    public ArrayList<String> getAllProductsname()
    {
        return cartData.getProductName();
    }
    public ArrayList<String> getAllMaxPrice()
    {
        return cartData.getMaxPrice();
    }
    public ArrayList<String> getAllDiscountedPrice()
    {
        return cartData.getDiscountedPrice();
    }
    public ArrayList<String> getAllDeliveredDays()
    {
        return cartData.getDeliveredDays();
    }
    public ArrayList<String> getAllQty()
    {
        return cartData.getQty();
    }
*/
}