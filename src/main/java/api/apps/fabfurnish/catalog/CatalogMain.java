package api.apps.fabfurnish.catalog;

import api.apps.fabfurnish.commanactions.Swipe;
import core.MyLogger;
import core.UiSelector;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Rameez on 9/24/2016.
 */
public class CatalogMain {
    private int count,swipeIndex,index;
    private String pname,mprice,dprice;
    private final static double starty=0.99,endy=0.18;
    private Catalog catalog=new Catalog();
    private CatalogUiObjects uiObject=new CatalogUiObjects();
    private Swipe swipe=new Swipe();
    private ProductsData productsData=new ProductsData();

    public void random()throws InterruptedException{
        catalog.tapGridView();
        count=catalog.getPdtCount();
        Random random=new Random();
        swipeIndex=random.nextInt(count/4);
        swipe.swipeDownIndex(swipeIndex,starty,endy);
        index=random.nextInt(catalog.getSize()-1);
        catalog.setIndex(index);
        MyLogger.log.info("ProductName is: "+catalog.getProductName());
        MyLogger.log.info("Max Price is: "+catalog.getMaxPrice());
        MyLogger.log.info("Discounted Price is: "+catalog.getDiscountedPrice());
        this.pname=catalog.getProductName();
        this.mprice=catalog.getMaxPrice();
        this.dprice=catalog.getDiscountedPrice();
        catalog.tapProduct();

    }


   public void userDef(String productName) throws InterruptedException{
       count=catalog.getPdtCount();
       catalog.tapGridView();
       List<WebElement> productNameElement;
       productNameElement=uiObject.product_name().multiple();
       while(!(new UiSelector().textContains(productName).makeUiObject().exists()))
       {
           swipe.swipeDown(starty,endy);
       }
       for(int i=0;i<catalog.getSize();i++) {
          if(productNameElement.get(i).getText().contains(productName))
          {
              index=i;
          }

       }
       catalog.setIndex(index);
       this.pname = catalog.getProductName();
       this.mprice = catalog.getMaxPrice();
       this.dprice = catalog.getDiscountedPrice();
       catalog.tapProduct();

   }
    public String getProductName(){return pname;}
    public String getMaxPrice(){return mprice;}
    public String getDiscountedPrice(){return dprice;}



    public void setAllProducts()throws InterruptedException{
        int pdtcount=catalog.getPdtCount();
        if(catalog.getSize()!=0) {
            for (int i = 1; i <= pdtcount / 4; i++) {
                for (int a = 0; a < catalog.getSize(); a++) {
                    catalog.setIndex(i);
                    count++;
                    productsData.setProductName(catalog.getProductName());
                    productsData.seDiscountedPrice(catalog.getMaxPrice());
                    productsData.setMaxPrice(catalog.getMaxPrice());
                    swipe.swipeDown(starty, endy);
                }
                System.out.println("All Products are Fetched");
            }
        }
        else System.out.println("There is no Product");
    }

    public ArrayList<String> getAllProductsNames(){ return productsData.getProductName();}

    public ArrayList<String> getAllMaxPrices() { return productsData.getMaxPrice();}

    public ArrayList<String> getAllDiscountedPrices(){return productsData.getDiscountedPrice();}


       /* public void randomWithArray() throws InterruptedException {
         catalog.setAllPdts();
         productname=catalog.getAllProductsName();
         count=catalog.getPdtCount();
         Random random=new Random();
         pNameEl=uiObjects.product_name().multiple();
         mPriceEl=uiObjects.product_name().multiple();
         dPriceEl=uiObjects.product_name().multiple();
         index=random.nextInt(productname.size());
         int i=(index+1)%4;
         if((count%4==1||count%4==2)&&(i==1||i==2)){
                 swipe.catalogSwipe(count/4+1);
                 if(pNameEl.contains(productname.get(index))) {
                     pdtname=pNameEl.get(index).getText();
                     dprice=dPriceEl.get(index).getText();
                     mprice=mPriceEl.get(index).getText();
                     pNameEl.get(i-1).click();
                 }

                 else System.out.println("Indexing is not proper");


         }
         else
         {
                 swipe.catalogSwipe(index/4);
                 if(pNameEl.contains(productname.get(index))) {
                     pdtname=pNameEl.get(index).getText();
                     dprice=dPriceEl.get(index).getText();
                     mprice=mPriceEl.get(index).getText();
                     pNameEl.get(i-1).click();
                 }

                 else System.out.println("Indexing is not proper");
         }

     }*/

}
