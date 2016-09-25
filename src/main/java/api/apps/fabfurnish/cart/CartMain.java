package api.apps.fabfurnish.cart;

import api.apps.fabfurnish.commanactions.Swipe;
import api.apps.fabfurnish.commontab.CommanTab;
import core.MyLogger;
import core.UiSelector;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Rameez on 9/25/2016.
 */
public class CartMain {
    private int count,swipeIndex,index,size;
    private String pname,mprice,dprice;
    private final static double starty=0.9,endy=0.18;
    public Cart cart=new Cart();
    private CartUiObjects uiObject=new CartUiObjects();
    public CartData cartData=new CartData();
    private Swipe swipe=new Swipe();
    private CommanTab comman=new CommanTab();
    //Need to check if working
    public void random()throws InterruptedException{
        Random random=new Random();
        if(comman.getCartCount()!=0) {
            if(cart.getSize()!=0) {
                do {
                    size += cart.getSize();
                    swipe.swipeDown(starty, endy);

                } while (!uiObject.order_now().waitToAppearWithoutException(10).exists());
                count = random.nextInt(size / 2);
                swipe.swipeUpIndex(count, starty, endy);
                //To Do
                if(cart.getSize()==3)
                {
                    swipe.swipeUp(starty,endy);
                    if (cart.getSize() == 3) swipe.swipeDown(starty, endy);
                }
                index = random.nextInt(cart.getSize() - 1);
                cart.setIndex(index);
                this.pname = cart.getProductName();
                this.mprice = cart.getMaxPrice();
                this.dprice = cart.getDiscountedPrice();
                cart.tapProduct();
            }
            else throw new AssertionError("Count of the Cart is: "+comman.getCartCount()+" ,but it does not contains any Product");
        }
        else MyLogger.log.info("There is no Product Inside the Cart");

    }


    public void user(String productName) throws InterruptedException{
        List<WebElement> productNameElement;
        productNameElement=uiObject.product_name().multiple();
        if(comman.getCartCount()!=0) {
            if (cart.getSize() != 0) {
                while (!(new UiSelector().textContains(productName).makeUiObject().exists())) {
                    swipe.swipeDown(starty, endy);
                }
                if(cart.getSize()==3)swipe.swipeDown(starty,endy);
                for (int i = 0; i < cart.getSize(); i++) {
                    if (productNameElement.get(i).getText().contains(productName)) {
                        index = i;
                    }
                }
                cart.setIndex(index);
                this.pname = cart.getProductName();
                this.mprice = cart.getMaxPrice();
                this.dprice = cart.getDiscountedPrice();
                cart.tapProduct();
            }
            else throw new AssertionError("Count of the Cart is: "+comman.getCartCount()+" ,but it does not contains any Product");
        }
        else MyLogger.log.info("There is no Product Inside the Cart");

    }
    public String getProductName(){return pname;}
    public String getMaxPrice(){return mprice;}
    public String getDiscountedPrice(){return dprice;}


    public void setAllProdcuts()throws InterruptedException
    {
      int count =comman.getCartCount();
        List<WebElement> max=uiObject.max_price().multiple();
        if(count!=0) {
            if (cart.getSize() != 0) {
                do {
                    for(int a=0;a<max.size();a++)
                    {
                        cart.setIndex(a);
                        cartData.setProductName(cart.getProductName());
                        cartData.setMaxPrice(cart.getMaxPrice());
                        cartData.seDiscountedPrice(cart.getDiscountedPrice());
                        cartData.setDeliveredDays(cart.getDeliveredDays());
                        cartData.setQty(cart.getQty());
                    }
                    swipe.swipeDown(starty, endy);
                } while (!uiObject.order_now().waitToAppearWithoutException(10).exists());
            }
            else throw new AssertionError("Count of the Cart is: "+comman.getCartCount()+" ,but it does not contains any Product");
        }
        else MyLogger.log.info("There is no Product Inside the Cart");
    }

    public ArrayList<String> getAllProductsnames()
    {
        return cartData.getProductName();
    }
    public ArrayList<String> getAllMaxPrices()
    {
        return cartData.getMaxPrice();
    }
    public ArrayList<String> getAllDiscountedPrices()
    {
        return cartData.getDiscountedPrice();
    }
    public ArrayList<String> getAllDeliveredDays()
    {
        return cartData.getDeliveredDays();
    }
    public ArrayList<String> getAllQties()
    {
        return cartData.getQty();
    }


}
