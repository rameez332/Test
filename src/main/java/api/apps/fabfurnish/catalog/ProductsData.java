package api.apps.fabfurnish.catalog;

import java.util.ArrayList;

/**
 * Created by Rameez on 9/22/2016.
 */
public class ProductsData {
    String name;
    private ArrayList<String> pdtnamearray=new ArrayList<>();
   /* private ArrayList<String> maxpricearray=new ArrayList<>();
    private ArrayList<String> discountedpricearray=new ArrayList<>();*/

   public void setProductData(String pdtname) //String maxprice, String discountedprice)
    {

        this.name=pdtname;
        /* if(!this.pdtnamearray.contains(pdtname)){
            this.pdtnamearray.add(pdtname);
            this.maxpricearray.add(maxprice);
            this.discountedpricearray.add(discountedprice);
        }
        else System.out.println("Product Already Exists in the Array");
    }*/

    public ArrayList<String> getProductName(){

      // if(!pdtnamearray.isEmpty())
        pdtnamearray.add(name);
        return pdtnamearray;
       // else throw new AssertionError("No products Found or Array is not Set");

    }

    /*public ArrayList<String > getMaxPrice() {
        //if(!this.maxpricearray.isEmpty())
        return maxpricearray;

       // else throw new AssertionError("No products Found or Array is not Set");

    }

    public ArrayList<String> getDiscountedPrice() {
        //if(!this.discountedpricearray.isEmpty())
        return discountedpricearray;

        //else throw new AssertionError("No products Found or Array is not Set");

    }

}*/
