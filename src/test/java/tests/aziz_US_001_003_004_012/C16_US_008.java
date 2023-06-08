package tests.aziz_US_001_003_004_012;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TawUserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C16_US_008 {

    // Bir ziyaretçi olarak footer bölümünde firma iletişim
    // bilgilerinin görüntülenebilir durumda olduğunu doğrulayabilmeliyim


    @Test(priority = 1)
    public void us_008_tc_01(){
        // 1. browser'ı aç
        // 2. https://qa.tripandway.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));
        Actions actions = new Actions(Driver.getDriver());
        TawUserHomePage tawUserHomePage = new TawUserHomePage();

        // 3. sayfayı en alta kadar indir
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.wait(1);

        // 4. başlığının "Address" olduğunu ve görünür olduğunu doğrula
        String expectedBaslik = ConfigReader.getProperty("footerAddressTitle");
        String actualTitle = tawUserHomePage.labelFooterAddressBaslikTexti.getText();

        Assert.assertEquals(expectedBaslik,actualTitle);
        Assert.assertTrue(tawUserHomePage.labelFooterAddressBaslikTexti.isDisplayed());

        // 5. birinci satırının "34, Edd Lane, NYC, 22335" olduğunu ve göründüğünü doğrula
        String expectedBirinciText = ConfigReader.getProperty("footerAddresBirinciSaitir");
        String actualBirinciText = tawUserHomePage.labelFooterAddressBirinciSatirTexti.getText();

        Assert.assertEquals(expectedBirinciText,actualBirinciText);
        Assert.assertTrue(tawUserHomePage.labelFooterAddressBirinciSatirTexti.isDisplayed());

        // 6. ikinci satırnın "202-456-3789" olduğunu ve göründüğünü doğrula
        String expectedIkinciText = ConfigReader.getProperty("footerAddresIkinciSaitir");
        String actualIkinciText = tawUserHomePage.labelFooterAddressIkinciSatirTexti.getText();

        Assert.assertEquals(expectedIkinciText,actualIkinciText);
        Assert.assertTrue(tawUserHomePage.labelFooterAddressIkinciSatirTexti.isDisplayed());

        // 7. üçüncü satırının "info@tripandway.com" olduğunu ve göründüğünü doğrula
        String expectedUcuncuText = ConfigReader.getProperty("footerAddresUcuncuSaitir");
        String actualUcuncuText = tawUserHomePage.labelFooterAddressUcuncuSatirTexti.getText();

        Assert.assertEquals(expectedUcuncuText,actualUcuncuText);
        Assert.assertTrue(tawUserHomePage.labelFooterAddressUcuncuSatirTexti.isDisplayed());

        Driver.quitDriver();
    }
}
