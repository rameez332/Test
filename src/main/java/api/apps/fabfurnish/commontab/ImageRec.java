package api.apps.fabfurnish.commontab;

import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Rameez on 10/2/2016.
 */
public class ImageRec {
    /*@Test(dataProvider = "search")
    public void eventsSearch(String data) throws InterruptedException, IOException {
        Thread.sleep(2000);
        boolean status = false;

        //WebElement img = driver.findElementByClassName("android.widget.ImageView");

        //take screen shot
        File screen = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);


        // for (String event : events) {
        driver.findElementById("your id")
                .sendKeys(data);
        driver.hideKeyboard();
        List<WebElement> list = driver
                .findElementsByXPath("/*//*[@class='android.widget.TextView' and @index='1']");
        System.out.println(list.size());


        int i = 0;
        for (WebElement el : list) {
            String eventList = el.getText();
            System.out.println("events" + " " + eventList);
            if (eventList.equals("gg")) {
                status = true;
                break;
            }

            i++;
        }


        //capture image of searched contact icon
        List<WebElement> imageList = driver.findElementsByXPath("/*//*[@class='android.widget.ImageView' and @index='0']");
        System.out.println(imageList.size());

        System.out.println(i);
        WebElement image = imageList.get(1);
        Point point = image.getLocation();

        //get element dimension
        int width = image.getSize().getWidth();
        int height = image.getSize().getHeight();

        BufferedImage img = ImageIO.read(screen);
        BufferedImage dest = img.getSubimage(point.getX(), point.getY(), width,
                height);
        ImageIO.write(dest, "png", screen);
        File file = new File("Menu.png");
        FileUtils.copyFile(screen, file);

        //verify images
        verifyImage("Menu.png", "Menu.png" );
        //Assert.assertTrue(status, "FAIL Event doesn't match" + data);
    }

    @DataProvider(name = "search")
    public Object[][] searchData() {

        return new Object[][] { { "gg" } };
    }


    public void verifyImage(String image1, String image2) throws IOException{
        File fileInput = new File(image1);
        File fileOutPut = new File(image2);

        BufferedImage bufileInput = ImageIO.read(fileInput);
        DataBuffer dafileInput = bufileInput.getData().getDataBuffer();
        int sizefileInput = dafileInput.getSize();
        BufferedImage bufileOutPut = ImageIO.read(fileOutPut);
        DataBuffer dafileOutPut = bufileOutPut.getData().getDataBuffer();
        int sizefileOutPut = dafileOutPut.getSize();
        Boolean matchFlag = true;
        if(sizefileInput == sizefileOutPut) {
            for(int j=0; j<sizefileInput; j++) {
                if(dafileInput.getElem(j) != dafileOutPut.getElem(j)) {
                    matchFlag = false;
                    break;
                }
            }
        }
        else
            matchFlag = false;
        Assert.assertTrue(matchFlag, "Images are not same");
    }*/
}
