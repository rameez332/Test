package api.apps.fabfurnish.menu;

import api.apps.fabfurnish.commanactions.Swipe;
import core.MyLogger;
import core.UiObject;
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
    private int index,size;
    private List<WebElement> cat, subCat, cat1, tag;
    private String cat_name, subcat_name, tag_name, cat1_name;
    private ArrayList<String> categories = new ArrayList<>();
    private ArrayList<String> subArray = new ArrayList<>();
    private ArrayList<String> tag1Array = new ArrayList<>();
    private ArrayList<String> tag2Array = new ArrayList<>();
    private ArrayList<String> catArray=new ArrayList<>();
    public Menu menu = new Menu();
    public MenuUiObjects uiObject = new MenuUiObjects();
    private MenuData menuData = new MenuData();
    private Swipe swipe = new Swipe();
    double starty = .97, endy = .8;

    public void productiveRandom(String current,String next) throws InterruptedException{

        if(new UiSelector().text(current).makeUiObject().exists()){
            cat=menu.getTextViewElement();
            size=cat.size();
            for(int i=0;i<size;i++)
            {
                if(cat.get(i).getText().contains(current))
                {index=i;break;}
            }
            for(int i=index;i<size;i++)
            {

                catArray.add(cat.get(i).getText());
            }







            do {
                cat=menu.getTextViewElement();
                for (int i = 0; i < cat.size(); i++) {
                    if (!(cat.get(i).getText()).equals(next)||i!=0)
                        catArray.add(cat.get(i).getText());
                    else break;
                }
                if (!(new UiSelector().text(next).makeUiObject().exists()))
                    swipe.swipeDown(starty, endy);
            } while (!(new UiSelector().text(next).makeUiObject().exists()));
            ind = randomAll(catArray.size() - 1);
            this.categories.add(catArray.get(ind));
            while (!(new UiSelector().text(catArray.get(ind)).makeUiObject().exists())) ;
            {
                swipe.swipeUp(starty, endy);
            }
            MyLogger.log.info("Tapping : "+cat.get(ind).getText());
            current=catArray.get(ind);
            next=catArray.get(ind+1);
            new UiSelector().text(catArray.get(ind)).makeUiObject().tap();
        }


    }
    /*public void random() throws InterruptedException {
        //For Main Category L1
        cat = menu.getCatNameElement();

        if (cat != null) {
            ind = randomAll(cat.size() - 1);
            if (ind == 0 || ind == 1) {
                MyLogger.log.info("It's on the: " + cat.get(ind).getText() + " ,I am Working on it");
                random();
            }
            this.categories.add(cat.get(ind).getText());
            MyLogger.log.info("Tapping L1: "+cat.get(ind).getText());
            cat.get(ind).click();
            //For Sub Category L2

            if (cat.get(ind).isDisplayed()) {
                do {
                    subCat = menu.getSubCatNameElement();
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
                MyLogger.log.info("Tapping L2: "+subCat.get(ind).getText());
                String next1=subCat.get(ind+1).getText();
                new UiSelector().text(subArray.get(ind)).makeUiObject().tap();
                //For Tag Category L3

                if (subCat.get(ind).isDisplayed()) {

                    do {
                        tag = menu.getTagNameElement();
                        for (int i = 0; i <= tag.size(); i++) {
                            tag1Array.add(tag.get(i).getText());
                        }
                        if (!(new UiSelector().text(next1).makeUiObject().exists()))
                            swipe.swipeDown(starty, endy);
                    } while (!(new UiSelector().text(next1).makeUiObject().exists()));
                    ind = randomAll(tag1Array.size() - 1);
                    this.categories.add(tag1Array.get(ind));
                    while (!(new UiSelector().text(tag1Array.get(ind)).makeUiObject().exists())) ;
                    {
                        swipe.swipeUp(starty, endy);
                    }
                    String next2=tag.get(ind+1).getText();
                    MyLogger.log.info("Tapping L3: "+tag.get(ind).getText());
                    String next3=tag.get(ind+1).getText();
                    new UiSelector().text(tag1Array.get(ind)).makeUiObject().tap();

                    //For Tag Category L4

                    if (tag.get(ind).isDisplayed()) {

                        do {
                            tag = menu.getTagNameElement();
                            for (int i = 0; i <= tag.size(); i++) {
                                if (!(tag.get(i).getText()).equals(next2)||i!=0)
                                    tag2Array.add(tag.get(i).getText());
                                else break;
                            }
                            if (!(new UiSelector().text(next3).makeUiObject().exists()))
                                swipe.swipeDown(starty, endy);
                        } while (!(new UiSelector().text(next3).makeUiObject().exists()));
                        ind = randomAll(tag2Array.size() - 1);
                        this.categories.add(tag2Array.get(ind));
                        while (!(new UiSelector().text(tag2Array.get(ind)).makeUiObject().exists())) ;
                        {
                            swipe.swipeUp(starty, endy);
                        }
                        MyLogger.log.info("Tapping L4: "+tag.get(ind).getText());
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

    *//* public void randomSimple(){

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
     }*//*
    public ArrayList<String> categories(){
        if (!categories.isEmpty())return categories;
        else throw new AssertionError("No category was get");
    }

    public void randomSimple() {
        cat = menu.getCatNameElement();


        ind = randomAll(cat.size() - 1);

        if (ind == 0 || ind == 1) {
            MyLogger.log.info("It's on the: " + cat.get(ind).getText() + " ,I am Working on it");
            randomSimple();
        }
        this.categories.add(cat.get(ind).getText());
        MyLogger.log.info("Tapping L1: "+cat.get(ind).getText());
        cat.get(ind).click();
        //SubCategories

        subCat = menu.getSubCatNameElement();
        ind = randomAll(subCat.size() - 1);
        this.categories.add(subCat.get(ind).getText());
        MyLogger.log.info("Tapping L2: "+subCat.get(ind).getText());
        subCat.get(ind).click();
        //Tag Categories1 Level 1


        if (!subCat.get(ind).isDisplayed()) {
            MyLogger.log.info("It does Not Contains L3 Category");
        }
        else {
            tag = menu.getTagNameElement();

            ind = randomAll(tag.size() - 1);

            this.categories.add(tag.get(ind).getText());
            MyLogger.log.info("Tapping L3: "+tag.get(ind).getText());
            String next=tag.get(ind+1).getText();
            tag.get(ind).click();
            //Tag Categories Level 2


            if (!tag.get(ind).isDisplayed()) {
                MyLogger.log.info("It does Not Contains L4 Category");
            }
            else {
                tag = menu.getTagNameElement();
                for (int i = 0; i < tag.size(); i++) {
                    if (!(tag.get(i).getText()).equals(next)||i!=0){
                        tag2Array.add(tag.get(i).getText());}
                    else break;
                }
                ind = randomAll(tag2Array.size() - 1);
                this.categories.add(tag2Array.get(ind));
                MyLogger.log.info("Tapping L4: "+tag.get(ind).getText());
                new UiSelector().text(tag2Array.get(ind)).makeUiObject().tap();
            }
        }
    }

    public void userDefForL1L2(String L1,String L2)throws InterruptedException{
        subCat=menu.getSubCatNameElement();
        tag = menu.getTagNameElement();
        this.categories.add(L1);
        UiObject l1=new UiSelector().textContains(L1.toUpperCase()).makeUiObject();
        if(l1.exists()){l1.tap();}
        else throw new AssertionError(L1+" ,Category does not present or check the Category");
        this.categories.add(L2);
        UiObject l2=new UiSelector().textContains(L2.toUpperCase()).makeUiObject();

        do{
            for(int i=0;i<subCat.size();i++)
            {
                if(subCat.get(i).getText().equalsIgnoreCase(L2)) {ind=i; break;}
            }
            if(!l2.exists())
            swipe.swipeDown(starty,endy);
            if(!(l2.exists())&&
                    new UiSelector().textContains("SALE").makeUiObject().exists())
                throw new AssertionError(L2+ " ,Category does not present or check the category");
        }while(!l2.exists());
        l2.tap();
        if(tag!=null){
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
            if(tag!=null){
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
            }
            else MyLogger.log.info("It does not contains the L4 Category");
        }
        else MyLogger.log.info("It does not contains the L3 Category");
    }
    //Not Implemented yet
    public void userDefForL1(String L1)throws InterruptedException {
        cat=menu.getCatNameElement();
        subCat = menu.getSubCatNameElement();
        tag = menu.getTagNameElement();
        this.categories.add(L1);
        UiObject l1 = new UiSelector().textContains(L1.toUpperCase()).makeUiObject();
        if (l1.exists()) {
            l1.tap();
        } else throw new AssertionError(L1 + " ,Category does not present or check the Category");
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
                } else MyLogger.log.info("It does not contains the L4 Category");
            } else MyLogger.log.info("It does not contains the L3 Category");
        }
    }*/
}

