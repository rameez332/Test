package api.apps.fabfurnish.menu;

import api.android.Android;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Rameez on 8/31/2016.
 */
public class Menu {
    public MenuUiObjects uiObject=new MenuUiObjects();
    private List<WebElement> elements;
    private int i;
    public void setIndex(int index){
        this.i=index;
    }
    public int getCatNameSize(){elements=uiObject.cat_name().multiple();return elements.size();}
    public int getCat1NameSize(){elements=uiObject.cat1_name().multiple();return elements.size();}
    public int getSubCatNameSize(){elements=uiObject.subcat_name().multiple();return elements.size();}
    public int getTagNameSize(){elements=uiObject.tag_name().multiple();return elements.size();}

    public String cat_name(){
        try{
            MyLogger.log.info("Tapping Category");
            elements=uiObject.cat_name().multiple();
            return elements.get(i).getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Category, element absent or blocked");
        }

    }
    public String cat1_name(){

        try{
            MyLogger.log.info("Tapping Category1");
            elements=uiObject.cat1_name().multiple();
            return elements.get(i).getText() ;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Category1, element absent or blocked");
        }

    }
    public String subcat_name(){

        try{
            MyLogger.log.info("Tapping Sub Category");
            elements=uiObject.subcat_name().multiple();
            return elements.get(i).getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Sub Category, element absent or blocked");
        }

    }
    public String tag_name(){

        try{
            MyLogger.log.info("Tapping Tag Name Category");
            elements=uiObject.tag_name().multiple();
            return elements.get(i).getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Tag Name Category, element absent or blocked");
        }
    }


    public Menu tapCat_name(){
        try{
            MyLogger.log.info("Tapping Category");
            elements=uiObject.cat_name().multiple();
            elements.get(i).click();
            return Android.app.fabfurnish.menu;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Category, element absent or blocked");
        }

    }
    public Menu tapCat1_name(){

        try{
            MyLogger.log.info("Tapping Category1");
            elements=uiObject.cat1_name().multiple();
            elements.get(i).click();
            return Android.app.fabfurnish.menu ;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Category1, element absent or blocked");
        }

    }
    public Menu tapSubcat_name(){

        try{
            MyLogger.log.info("Tapping Sub Category");
            elements=uiObject.subcat_name().multiple();
            elements.get(i).click();
            return Android.app.fabfurnish.menu;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Sub Category, element absent or blocked");
        }

    }
    public Menu tapTag_name(){

        try{
            MyLogger.log.info("Tapping Tag Name Category");
            elements=uiObject.tag_name().multiple();
            elements.get(i).click();
            return Android.app.fabfurnish.menu;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Tag Name Category, element absent or blocked");
        }
    }
}