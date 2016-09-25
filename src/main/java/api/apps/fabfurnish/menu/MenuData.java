package api.apps.fabfurnish.menu;

import java.util.ArrayList;

/**
 * Created by Rameez on 9/25/2016.
 */
public class MenuData {
    private ArrayList<String> catArray=new ArrayList<>();
    private ArrayList<String> cat1Array=new ArrayList<>();
    private ArrayList<String> subCatArray=new ArrayList<>();
    private ArrayList<String> tagArray=new ArrayList<>();

    void setCatArray(){}
    void setCat1Array(){}
    void setSubCatArray(){}
    void setTagArray(){}

    ArrayList<String> getCatArray(){return catArray;}
    ArrayList<String> getCat1Array(){return cat1Array;}
    ArrayList<String> getSubCatArray(){return subCatArray;}
    ArrayList<String> getTagArray(){return tagArray;}
}