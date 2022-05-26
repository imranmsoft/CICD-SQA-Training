package constants;

public class FrameworkConstants {

    //create a private constructor. this is used for configure related things
    private FrameworkConstants(){}


    private static final String CHROMEDRIVERPATH=System.getProperty("user.dir")+"/src/test/resources/chromedriver";
    private static final String CONFIGFILERPATH=System.getProperty("user.dir")+ "/src/test/resources/config/config.properties";
    private static final String SELLSETTEXT= "//body/main[1]/article[1]/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]";
    private static final String BUYEMPTYTEXT="//body/main[1]/article[1]/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/input[1]";
    private static final String CLICKCOUNTRY= "//body/footer[1]/div[2]/div[1]/div[1]/div[2]/div[1]/span[1]/span[2]";
    private static final String SELECTDROPDOWN="//button[@id='countries-dropdown']";
    private static final String CLICKCURRENCY= "//li[8]//a[1][@href=\"https://www.paysera.com/v2/en-GB/fees/currency-conversion-calculator\"]";
    private static final String ELEMENTMATCH= "//body/footer[1]/div[2]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]";

    //use getter and use static so that we can use it directly from the method
  // make the method as static so that this method can be called from FristTEst.java class
    public static String getChromeDriverPath() {
        return CHROMEDRIVERPATH;
    }

    public static String getConfigFilePath() {
        return CONFIGFILERPATH;
    }

    public static String getSellsettext() {
        return SELLSETTEXT;
    }
    public static String buyEmptyText() {
        return BUYEMPTYTEXT;
    }
    public static String getCountryClick() {
        return CLICKCOUNTRY;
    }
    public static String getCountryDropDown() {
        return SELECTDROPDOWN;
    }
    public static String getClickCurrency() {
        return CLICKCURRENCY;
    }
    public static String getElementPresent() {
        return ELEMENTMATCH;
    }
}
