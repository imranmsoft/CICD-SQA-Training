package tests;

import constants.FrameworkConstants;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SecondTest extends BaseTest{
    @Test
    public void testFieldBlank() throws InterruptedException {
        if (DriverManager.getDriver() == null) {
            System.out.println("check driver manager null found for Second TEst");
        }
        // WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),5);
        Thread.sleep(7000);
        DriverManager.getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        WebElement inputBox = DriverManager.getDriver().findElement(By.xpath(FrameworkConstants.buyEmptyText()));

        String textInsideInputBox = inputBox.getAttribute("value");
        System.out.println("value print : " + textInsideInputBox);
        // Check whether input field is blank
        if(textInsideInputBox.isEmpty())
        {
            System.out.println("Input field is empty");
        }

    }
}
