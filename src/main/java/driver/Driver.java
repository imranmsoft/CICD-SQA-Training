package driver;

import constants.FrameworkConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ReadProperties;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class Driver {
    private Driver(){}
   //public static WebDriver driver;
    //initliza the driver
    public static void initDriver() throws Exception {
        System.out.println(("Driver is inializing"));
        //check the driver null check using java utls
        if(Objects.isNull(DriverManager.getDriver())){
            //lets cut the code from Base class whre driver is initilized
            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());

            //need to use WebDriver as global variable to access all methods

            WebDriver driver = new ChromeDriver();
           //set the driver with driver reference

           DriverManager.setDriver(driver);
           DriverManager.getDriver().get(ReadProperties.getValue("url"));
            //Mazimize current window
            driver.manage().window().maximize();
            Thread.sleep(10000);
            DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),10);
            //wait.until(ExpectedConditions.visibilityOfElementLocated((By) DriverManager.getDriver().findElement(By.xpath("//*[@id=\"docs-internal-guid-e609898d-7fff-f564-7c52-b4a2029e0bb9\"][contains(text(),'Online currency exchange')]"))));
        }


    }

    //quit the Driver
    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
           DriverManager.getDriver().quit();
           DriverManager.unload();

        }
    }
}
