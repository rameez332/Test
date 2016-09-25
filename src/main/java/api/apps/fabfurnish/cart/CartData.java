package api.apps.fabfurnish.cart;

import java.util.ArrayList;

/**
 * Created by Rameez on 9/23/2016.
 */
public class CartData {
    private int flag;
    private ArrayList<String> pdtnamearray=new ArrayList<>();
    private ArrayList<String> maxpricearray=new ArrayList<>();
    private ArrayList<String> discountedpricearray=new ArrayList<>();
    private ArrayList<String> qtyarray=new ArrayList<>();
    private ArrayList<String> deliveredarray=new ArrayList<>();

    void setProductName(String productName)
    {
        flag=0;
        if(!this.pdtnamearray.contains(productName))
        this.pdtnamearray.add(productName);

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
    void setQty(String qty)
    {
        if(flag==0)this.qtyarray.add(qty);

        else System.out.println("Product already exists");
    }
    void setDeliveredDays(String deliveredDays)
    {
        if(flag==0) this.deliveredarray.add(deliveredDays);

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
    ArrayList<String> getQty() {
        if(!this.discountedpricearray.isEmpty()) return qtyarray;

        else throw new AssertionError("No Quantity Found");
    }

    ArrayList<String> getDeliveredDays() {
        if(!this.discountedpricearray.isEmpty()) return deliveredarray;

        else throw new AssertionError("No Delivered Days Found");
    }

}