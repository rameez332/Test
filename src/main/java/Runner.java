import api.apps.fabfurnish.FabFurnish;
import api.apps.fabfurnish.catalog.CatalogUiObjects;
import api.apps.fabfurnish.homepage.HomepageUiObjects;
import core.MyLogger;
import core.managers.DriverManager;
import org.apache.log4j.Level;
import java.net.MalformedURLException;


/**
 * Created by Rameez on 7/20/2016.
 */
public class Runner {
    private static FabFurnish fabFurnish=new FabFurnish();

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        MyLogger.log.setLevel(Level.INFO);

       try{
        DriverManager.createDriver();
        fabFurnish.open();
           /*fabFurnish.commanTab.tapMenu();
           fabFurnish.menuMain.productiveRandom("FABDESIGNS","SALE");
           fabFurnish.menuMain.printBreadCrum();
           fabFurnish.catalogMain.random();*/
           new HomepageUiObjects().optionImage().waitToAppearWithoutException(20).tap();
           new CatalogUiObjects().product_name().waitToAppearWithoutException(20).tap();
           fabFurnish.pdpMain.getProductInfo();
           fabFurnish.pdpMain.printData();
        }
        finally {
            DriverManager.killDriver();
        }
    }
}