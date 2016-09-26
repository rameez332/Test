package api.apps.fabfurnish.menu;

import api.apps.fabfurnish.commanactions.Swipe;
import core.MyLogger;
import core.UiSelector;
import org.jcp.xml.dsig.internal.dom.DOMBase64Transform;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Rameez on 9/25/2016.
 */
public class MenuMain {
    private ArrayList<Integer> index;
    private int setIndex, ind;
    private List<WebElement> cat, subCat, cat1, tag;
    private String cat_name, subcat_name, tag_name, cat1_name;
    private ArrayList<String> categories = new ArrayList<>();
    private ArrayList<String> subArray = new ArrayList<>();
    private ArrayList<String> tag1Array = new ArrayList<>();
    private ArrayList<String> tag2Array = new ArrayList<>();
    public Menu menu = new Menu();
    public MenuUiObjects uiObject = new MenuUiObjects();
    private MenuData menuData = new MenuData();
    private Swipe swipe = new Swipe();
    double starty = .9, endy = .1;

    public void random() throws InterruptedException {
     /*   cat=uiObject.cat_name().multiple();
        ind=randomAll(cat.size()-1);
        subCat=uiObject.subcat_name().multiple();
        tag=uiObject.tag_name().multiple();
        if (menu.cat_name().contains("FABDESIGNS")&&menu.cat_name().contains("NEW")) {
            MyLogger.log.info("It's on the: "+cat.get(ind)+" ,I am Working on it");
            random();
        }
        this.categories.add(cat.get(ind).getText());
        cat.get(ind).click();
        //setting SubCategory Array
        do {
            menuData.setSubCatArray();
            //
            swipe.swipeDown(starty,endy);

        }while (cat.get(ind+1).isDisplayed());

        index.add(randomAll(menuData.getSubCatArray().size()-1));
        subcat_name=menuData.getSubCatArray().get(index.get(1));
        this.categories.add(subcat_name);
        while (!(new UiSelector().textContains(subcat_name).makeUiObject().exists()))
        {
            swipe.swipeUp(starty,endy);
        }
        for(int i=0;i<menu.getSubCatNameSize();i++) {
            if(subCat.get(i).getText().contains(subcat_name))
            {
                setIndex=i;
            }
        }
        menu.setIndex(setIndex);
        menu.tapSubcat_name();
        //Tapping done on SubCategory

       do{

        }while (subCat.get(setIndex+1).isDisplayed());*/

        //For Main Category L1
        cat = menu.getCatNameElement();
        subCat = menu.getSubCatNameElement();
        tag = menu.getTagNameElement();
        if (cat != null) {
            ind = randomAll(cat.size() - 1);
            if (ind == 0 || ind == 1) {
                MyLogger.log.info("It's on the: " + cat.get(ind).getText() + " ,I am Working on it");
                random();
            }
            this.categories.add(cat.get(ind).getText());
            cat.get(ind).click();
            //For Sub Category L2
            if (subCat != null) {
                do {
                    for (int i = 0; i < subCat.size(); i++) {
                        subArray.add(subCat.get(i).getText());
                    }
                    if (!(new UiSelector().text(cat.get(ind + 1).getText()).makeUiObject().exists()))
                        swipe.swipeDown(starty, endy);
                } while (!(new UiSelector().text(cat.get(ind + 1).getText()).makeUiObject().exists()));
                ind = randomAll(subArray.size() - 1);
                this.categories.add(subArray.get(ind));
                while (!(new UiSelector().text(subArray.get(ind)).makeUiObject().exists())) ;
                {
                    swipe.swipeUp(starty, endy);
                }
                new UiSelector().text(subArray.get(ind)).makeUiObject().tap();
                //For Tag Category L3
                if (tag != null) {
                    do {
                        for (int i = 0; i < tag.size(); i++) {
                            tag1Array.add(tag.get(i).getText());
                        }
                        if (!(new UiSelector().text(subCat.get(ind + 1).getText()).makeUiObject().exists()))
                            swipe.swipeDown(starty, endy);
                    } while (!(new UiSelector().text(subCat.get(ind + 1).getText()).makeUiObject().exists()));
                    ind = randomAll(tag1Array.size() - 1);
                    this.categories.add(tag1Array.get(ind));
                    while (!(new UiSelector().text(tag1Array.get(ind)).makeUiObject().exists())) ;
                    {
                        swipe.swipeUp(starty, endy);
                    }
                    new UiSelector().text(tag1Array.get(ind)).makeUiObject().tap();

                    //For Tag Category L4
                    if (tag != null) {
                        do {
                            for (int i = 1; i < tag.size(); i++) {
                                if (!(tag.get(i).getText()).equals(tag1Array.get(ind + 1)))
                                    tag2Array.add(tag.get(i).getText());
                                else break;
                            }
                            if (!(new UiSelector().text(tag.get(ind + 1).getText()).makeUiObject().exists()))
                                swipe.swipeDown(starty, endy);
                        } while (!(new UiSelector().text(tag.get(ind + 1).getText()).makeUiObject().exists()));
                        ind = randomAll(tag2Array.size() - 1);
                        this.categories.add(tag2Array.get(ind));
                        while (!(new UiSelector().text(tag2Array.get(ind)).makeUiObject().exists())) ;
                        {
                            swipe.swipeUp(starty, endy);
                        }
                        new UiSelector().text(tag2Array.get(ind)).makeUiObject().tap();
                    } else MyLogger.log.info("It Does not contains L4 Category");
                } else MyLogger.log.info("It Does not contains L3 Category");
            } else throw new AssertionError("L2 Category can not be Null");
        } else throw new AssertionError("L1 Category Not Found");
    }

    private int randomAll(int index1) {
        Random random = new Random();
        return random.nextInt(index1);
    }

    /* public void randomSimple(){

         ind=randomAll(menu.getCatNameSize()-1);
         menu.setIndex(ind);
         if (menu.cat_name().contains("FABDESIGNS")&&menu.cat_name().contains("NEW")) {
             MyLogger.log.info("It's on the: "+cat.get(ind)+" ,I am Working on it");
             randomSimple();
         }
         this.categories.add(menu.cat_name());
         menu.tapCat_name();
         //SubCategories
         ind=randomAll(menu.getSubCatNameSize()-1);
         menu.setIndex(ind);
         this.categories.add(menu.subcat_name());
         menu.tapSubcat_name();
         //Tag Categories1 Level 1
         if(!uiObject.tag_name().waitToAppear(5).exists()) {MyLogger.log.info("It does Not Contains any Tag Name Level 1");}
         else {
             ind = randomAll(menu.getTagNameSize() - 1);
             menu.setIndex(ind);
             this.categories.add(menu.tag_name());
             //Tag Categories Level 2
             if (!uiObject.tag_name().waitToAppear(5).exists()) {MyLogger.log.info("It does Not Contains any Tag Name Level 2");
             }
             else {

                     for (int i = 1; i < tag.size(); i++) {
                         if (!(tag.get(i).getText()).equals(tag1Array.get(ind + 1)))
                             tag2Array.add(tag.get(i).getText());
                         else break;
                     }
                 ind=randomAll(tag2Array.size()-1);
                 this.categories.add(tag2Array.get(ind));
                 new UiSelector().text(tag2Array.get(ind)).makeUiObject().tap();
             }
         }
     }*/

    public void randomSimple() {
        cat = menu.getCatNameElement();
        subCat = menu.getSubCatNameElement();
        tag = menu.getTagNameElement();
        ind = randomAll(cat.size() - 1);
        if (ind == 0 || ind == 1) {
            MyLogger.log.info("It's on the: " + cat.get(ind).getText() + " ,I am Working on it");
            randomSimple();
        }
        this.categories.add(cat.get(ind).getText());
        cat.get(ind).click();
        //SubCategories
        ind = randomAll(subCat.size() - 1);
        this.categories.add(subCat.get(ind).getText());
        subCat.get(ind).click();
        //Tag Categories1 Level 1
        if (tag == null) {
            MyLogger.log.info("It does Not Contains L3 Category");
        }
        else {
            ind = randomAll(tag.size() - 1);
            this.categories.add(tag.get(ind).getText());
            tag.get(ind).click();
            //Tag Categories Level 2
            if (tag == null) {
                MyLogger.log.info("It does Not Contains L4 Category");
            }
            else {

                for (int i = 1; i < tag.size(); i++) {
                    if (!(tag.get(i).getText()).equals(tag1Array.get(ind + 1)))
                        tag2Array.add(tag.get(i).getText());
                    else break;
                }
                ind = randomAll(tag2Array.size() - 1);
                this.categories.add(tag2Array.get(ind));
                new UiSelector().text(tag2Array.get(ind)).makeUiObject().tap();
            }
        }
    }
}

