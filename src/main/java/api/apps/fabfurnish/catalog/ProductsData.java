package api.apps.fabfurnish.catalog;

import java.util.ArrayList;

/**
 * Created by Rameez on 9/22/2016.
 */
public class ProductsData {
    private int flag;
    private ArrayList<String> pdtnamearray=new ArrayList<>();
    private ArrayList<String> maxpricearray=new ArrayList<>();
    private ArrayList<String> discountedpricearray=new ArrayList<>();


    void setProductName(String productName)
    {
        flag=0;
        if(!this.pdtnamearray.contains(productName)) this.pdtnamearray.add(productName);

        else {System.out.println("Product already exists"); flag=1;}
    }

   void setMaxPrice(String maxPrice)
    {
        if(flag==0)this.maxpricearray.add(maxPrice);
        else System.out.println("Product already exists");

    }

    void seDiscountedPrice(String dprice)
    {
        if(flag==0) this.discountedpricearray.add(dprice);

        else System.out.println("Product already exists");
    }

    ArrayList<String> getProductName() {

        if(!pdtnamearray.isEmpty()) return pdtnamearray;

        else throw new AssertionError("No Product Name Found");
    }

    ArrayList<String > getMaxPrice() {
        if(!this.maxpricearray.isEmpty()) return maxpricearray;

        else throw new AssertionError("No Max Price Found");
    }

    ArrayList<String> getDiscountedPrice() {
        if(!this.discountedpricearray.isEmpty()) return discountedpricearray;

        else throw new AssertionError("No Discounted Price Found");
    }

}
