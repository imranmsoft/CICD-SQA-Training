package tests;

import org.testng.annotations.Test;
import pages.CountryCurrency;

public final class CurrencyTest extends BaseTest {
    private CurrencyTest(){}

    @Test
    public void currencyTest() throws InterruptedException {
        CountryCurrency cc=new CountryCurrency();
        cc.clickCountryMethod();
        cc.clickDropDown();
        cc.selectCurrency();
    }

}
