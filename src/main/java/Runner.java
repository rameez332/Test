import api.apps.fabfurnish.FabFurnish;
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
           fabFurnish.commanTab.tapMenu();
           fabFurnish.menuMain.productiveRandom("FABDESIGNS","SALE");
           fabFurnish.menuMain.printBreadCrum();
           fabFurnish.catalogMain.random();
        }
        finally {
            DriverManager.killDriver();
        }
    }
}