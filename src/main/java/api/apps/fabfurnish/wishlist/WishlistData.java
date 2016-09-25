package api.apps.fabfurnish.wishlist;

import java.util.ArrayList;

/**
 * Created by Rameez on 9/24/2016.
 */
public class WishlistData {
    private int flag;
    private ArrayList<String> pdtnamearray=new ArrayList<>();
    private ArrayList<String> cutpricearray=new ArrayList<>();
    private ArrayList<String> specialpricearray=new ArrayList<>();
    private ArrayList<String> skuarray=new ArrayList<>();

    void setProductName(String productName)
    {
        flag=0;
        if(!this.pdtnamearray.contains(productName))
            this.pdtnamearray.add(productName);

        else {System.out.println("Product already exists"); flag=1;}
    }
    void setSKU(String sku)
    {
        if(flag==0)this.skuarray.add(sku);

        else System.out.println("Product already exists");
    }
    void setCutPrice(String maxPrice)
    {
        if(flag==0)this.cutpricearray.add(maxPrice);

        else System.out.println("Product already exists");
    }

    void setSpecialPrice(String dprice)
    {
        if(flag==0) this.specialpricearray.add(dprice);

        else System.out.println("Product already exists");
    }
    ArrayList<String> getProductName() {
        if(!pdtnamearray.isEmpty()) return pdtnamearray;

        else throw new AssertionError("No Product Name Found");
    }
    ArrayList<String> getSku() {
        if (!this.skuarray.isEmpty()) return skuarray;

        else throw new AssertionError("SKU does not Found");
    }
    ArrayList<String > getCutPrice() {
        if(!this.cutpricearray.isEmpty()) return cutpricearray;

        else throw new AssertionError("No Cut Price Found");
    }
    ArrayList<String> getSpecialPrice() {
        if (!this.specialpricearray.isEmpty()) return specialpricearray;

        else throw new AssertionError("No Special Price Found");
    }
}