package pages;

import constants.FrameworkConstants;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public final class CountryCurrency {
    private final By clickCountry= By.xpath(FrameworkConstants.getCountryClick());
    private final By selectDropDown= By.xpath(FrameworkConstants.getCountryDropDown());
    private final By clickCurrency= By.xpath(FrameworkConstants.getClickCurrency());

    //method to click country
    public void clickCountryMethod() throws InterruptedException {
        //Thread.sleep(15000);
        DriverManager.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        DriverManager.getDriver().findElement(clickCountry).click();
    }

    //method to select dropdown
    public void clickDropDown() throws InterruptedException {
        Thread.sleep(15000);
        DriverManager.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        DriverManager.getDriver().findElement(selectDropDown).click();
    }

    //method to click currency
    public void selectCurrency() throws InterruptedException {
        //Thread.sleep(15000);
        DriverManager.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        DriverManager.getDriver().findElement(clickCurrency).click();
        System.out.println("waiting start");
        Thread.sleep(15000);
        DriverManager.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Waiting finsihed!!!!");

        //DriverManager.getDriver().switchTo().frame(0);
        //link is present or not

        List<WebElement> dynamicElement = DriverManager.getDriver().findElements(By.xpath(FrameworkConstants.getElementPresent()));

        if(dynamicElement.size() != 0)
            //If list size is non-zero, element is present
            System.out.println("Uk Country is selected, is present : " + dynamicElement);
         else
            //Else if size is 0, then element is not present
            System.out.println("Element not present");
        }

    }




