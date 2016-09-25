package api.apps.fabfurnish.wishlist;

import api.apps.fabfurnish.cart.CartUiObjects;
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
public class WishlistMain {
    private int count,swipeIndex,index,size;
    private String pname,cutprice,specialprice;
    private final static double starty=0.98,endy=0.134;
    private CartUiObjects uiObject=new CartUiObjects();
    private Swipe swipe=new Swipe();
    private CommanTab comman=new CommanTab();
    public WishlistData wishlistData=new WishlistData();
    public Wishlist wishlist=new Wishlist();

    public void random()throws InterruptedException{
        Random random=new Random();
        if(comman.getWishlishtCount()!=0) {
            if(wishlist.getSize()!=0) {
                count=random.nextInt(comman.getWishlishtCount()/2);
                swipe.swipeDownIndex(count,starty,endy);
                index=random.nextInt(wishlist.getSize()-1);
                wishlist.setIndex(index);
                this.pname = wishlist.getProductName();
                this.cutprice = wishlist.getCutPrice();
                this.specialprice = wishlist.getSpecialPrice();
                wishlist.tapProduct();
            }
            else throw new AssertionError("Count of the Wishlist is: "+comman.getWishlishtCount()+" ,but it does not contains any Product");
        }
        else MyLogger.log.info("There is no Product Inside the Wishlist");

    }


    public void userDef(String productName) throws InterruptedException{
        List<WebElement> productNameElement;
        productNameElement=uiObject.product_name().multiple();
        if(comman.getCartCount()!=0) {
            if (wishlist.getSize() != 0) {
                while(!(new UiSelector().textContains(productName).makeUiObject().exists()))
                {
                    swipe.swipeDown(starty,endy);
                }
                for(int i=0;i<wishlist.getSize();i++) {
                    if(productNameElement.get(i).getText().contains(productName))
                    {
                        index=i;
                    }

                }
                wishlist.setIndex(index);
                this.pname = wishlist.getProductName();
                this.cutprice = wishlist.getCutPrice();
                this.specialprice = wishlist.getSpecialPrice();
                wishlist.tapProduct();
            }
            else throw new AssertionError("Count of the Wishlist is: "+comman.getWishlishtCount()+" ,but it does not contains any Product");
        }
        else MyLogger.log.info("There is no Product Inside the Wishlist");

    }
    public String getProductName(){return pname;}
    public String getCutprice(){return cutprice;}
    public String getSpecialpricePrice(){return specialprice;}


    public void setAllProducts()throws InterruptedException{
        int pdtcount=comman.getWishlishtCount();
        if(pdtcount!=0) {
            if(wishlist.getSize()!=0) {
                for (int i = 1; i <= pdtcount / 2; i++) {
                    for (int a = 0; a < wishlist.getSize(); a++) {
                        wishlist.setIndex(i);
                        count++;
                        wishlistData.setProductName(wishlist.getProductName());
                        wishlistData.setCutPrice(wishlist.getCutPrice());
                        wishlistData.setSpecialPrice(wishlist.getSpecialPrice());
                        wishlistData.setSKU(wishlist.getSku());
                    }
                    swipe.swipeDown(starty, endy);
                }
            }
            else throw new AssertionError("Count of the Wishlist is: "+comman.getWishlishtCount()+" ,but it does not contains any Product");
        }
        else System.out.println("There is no Product");
        MyLogger.log.info("All Products are Fetched");
    }

    public ArrayList<String> getAllProductsNames(){ return wishlistData.getProductName();}

    public ArrayList<String> getAllCutPrices() { return wishlistData.getCutPrice();}

    public ArrayList<String> getAllSpecialPrices(){return wishlistData.getSpecialPrice();}
}
