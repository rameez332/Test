package api.apps.fabfurnish.cart;

import java.util.ArrayList;

/**
 * Created by Rameez on 9/23/2016.
 */
public class CartData {
    String name;
    private ArrayList<String> pdtnamearray=new ArrayList<>();
    private ArrayList<String> maxpricearray=new ArrayList<>();
    private ArrayList<String> discountedpricearray=new ArrayList<>();
    private ArrayList<String> qtyarray=new ArrayList<>();
    private ArrayList<Cart> removearray=new ArrayList<>();

    public void setProductData(String pname, String mprice, String dprice, String qty, Cart remove)
    {
        if(!this.pdtnamearray.contains(pname)){
            this.pdtnamearray.add(pname);
            this.maxpricearray.add(mprice);
            this.discountedpricearray.add(dprice);
            this.qtyarray.add(qty);
            this.removearray.add(remove);
        }
        else System.out.println("Product Already Exists in the Array");
    }

    public ArrayList<String> getProductName() {

        // if(!pdtnamearray.isEmpty())
        return pdtnamearray;

        // else throw new AssertionError("No products Found or Array is not Set");

    }

    public ArrayList<String > getMaxPrice() {
        //if(!this.maxpricearray.isEmpty())
        return maxpricearray;

        // else throw new AssertionError("No products Found or Array is not Set");

    }

    public ArrayList<String> getDiscountedPrice() {
        //if(!this.discountedpricearray.isEmpty())
        return discountedpricearray;

        //else throw new AssertionError("No products Found or Array is not Set");

    }
    public ArrayList<String> getQty() {
        //if(!this.discountedpricearray.isEmpty())
        return qtyarray;

        //else throw new AssertionError("No products Found or Array is not Set");

    } public ArrayList<Cart> getRemoveIndex() {
        //if(!this.discountedpricearray.isEmpty())
        return removearray;

        //else throw new AssertionError("No products Found or Array is not Set");

    }


}
