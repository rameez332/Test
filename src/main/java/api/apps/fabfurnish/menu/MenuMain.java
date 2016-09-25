package api.apps.fabfurnish.menu;

import api.apps.fabfurnish.commanactions.Swipe;
import core.MyLogger;
import core.UiSelector;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Rameez on 9/25/2016.
 */
public class MenuMain {
    private ArrayList<Integer> index;
    private List<WebElement> cat,subCat,cat1,tag;
    private String cat_name,subcat_name,tag_name,cat1_name;
    private ArrayList<String> categories=new ArrayList<>();
    public Menu menu=new Menu();
    public MenuUiObjects uiObject=new MenuUiObjects();
    private MenuData menuData=new MenuData();
    private Swipe swipe=new Swipe();
    double starty=.9,endy=.1;

    public void random()throws InterruptedException{
        index.add(randomAll(menu.getCatNameSize()-1));
        cat=uiObject.cat_name().multiple();
        subCat=uiObject.subcat_name().multiple();
        tag=uiObject.tag_name().multiple();
        menu.setIndex(index.get(0));
        if (menu.cat_name().contains("FABDESIGNS")&&menu.cat_name().contains("NEW")) {
            MyLogger.log.info("It's on the: "+menu.cat_name()+" ,I am Working on it");
            random();
        }
        this.categories.add(menu.cat_name());
        menu.tapCat_name();
        do {
            menuData.setSubCatArray();
            swipe.swipeDown(starty,endy);

        }while (cat.get(index.get(0)+1).isDisplayed());

        index.add(randomAll(menuData.getSubCatArray().size()-1));
        subcat_name=menuData.getSubCatArray().get(index.get(1));
        this.categories.add(subcat_name);
        while (!(new UiSelector().textContains(subcat_name).makeUiObject().exists()))
        {
            swipe.swipeUp(starty,endy);
        }
        new UiSelector().textContains(subcat_name).makeUiObject().tap();

        index.add(randomAll(menu.getSubCatNameSize())-1);
        do{

        }while (subCat.get(index.get(1)+1).isDisplayed());
    }

    private int randomAll(int index)
    {
        Random random=new Random();
        return random.nextInt(index);
    }
}

