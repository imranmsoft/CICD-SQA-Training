package driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {
    private DriverManager(){}
    private static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();

    //first method get driver
    public static WebDriver getDriver(){
       return dr.get();
    }
    //2nd method setDriver
    public static void setDriver(WebDriver driverRef){
        dr.set(driverRef);
    }

    //third driver
    public static void unload(){
        dr.remove();

    }
}
