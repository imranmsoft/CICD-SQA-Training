package tests;

import constants.FrameworkConstants;
import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    //driver initlialization and quting
    // create protected constructor to access with the package

    protected BaseTest(){}
    //WebDriver driver;

   @BeforeTest
    //START UP -Tear UP and cut the system properotry from FristTest class
    public void startUp() throws Exception {
      // System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());

       //need to use WebDriver as global variable to access all methods

      // driver=new ChromeDriver();
       Driver.initDriver();

    }

    //Tear Down
    @AfterTest
    public void tearDown(){
       //driver.quit();
   // move this code to Driver class to make it more generic
        Driver.quitDriver();
    }
}
