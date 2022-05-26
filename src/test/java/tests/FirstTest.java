package tests;

import constants.FrameworkConstants;
import driver.Driver;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.*;

import java.util.concurrent.TimeUnit;

public final class FirstTest extends BaseTest {
    @Test
    public void test1() throws InterruptedException {
        //initilize the chrome driver
        //WebDriver is removed so error occurs for 'driver'
        //extends this class to BaseTEst where WebDriver is initialized, now the driver error is gone

        // driver.get("https://google.com");
        if (DriverManager.getDriver() == null) {
            System.out.println("check driver manager found");
        }
        if (DriverManager.getDriver() != null) {
            System.out.println("driven manager found");
        }
        //clear the field
        DriverManager.getDriver().findElement(By.xpath(FrameworkConstants.getSellsettext())).clear();
      DriverManager.getDriver().findElement(By.xpath(FrameworkConstants.getSellsettext())).sendKeys("100");


        //WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),7);
        Thread.sleep(10000);
        DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }



    }
