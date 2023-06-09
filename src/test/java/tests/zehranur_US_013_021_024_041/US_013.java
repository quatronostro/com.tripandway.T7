package tests.zehranur_US_013_021_024_041;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TawUserHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_013 {

    TawUserHomePage tawUserHomePage;
    SoftAssert softAssert;

    @Test
    public void TC_01(){
        tawUserHomePage = new TawUserHomePage();
        softAssert = new SoftAssert();

        //1. Webdriver çalıştırılarak "https://qa.tripandway.com/" sayfasına gidilir.
        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));

        //2. Tripandway anasayfasında header'daki DESTİNATİONS bağlantısının görünür erişilebilir olduğu doğrulanır.
        softAssert.assertTrue(tawUserHomePage.destinationsButton.isDisplayed());
        softAssert.assertTrue(tawUserHomePage.destinationsButton.isEnabled());

        //3. Tripandway anasayfasında header'daki DESTİNATİONS bağlantısına tıklanır.
        tawUserHomePage.destinationsButton.click();

        //4. Destinations sayfasına gidildiği doğrulanır.
        String expectedTitle = "Destinations";
        String actualTitle = Driver.getDriver().getTitle();
        softAssert.assertTrue(actualTitle.contains(expectedTitle));

        //5. Destinations'larının görünürlüğü ve aktifliği doğrulanır.
        softAssert.assertTrue(tawUserHomePage.destinationFirstButton.isDisplayed() && tawUserHomePage.destinationFirstButton.isEnabled());
        softAssert.assertTrue(tawUserHomePage.destinationSecondButton.isDisplayed() && tawUserHomePage.destinationSecondButton.isEnabled());
        softAssert.assertTrue(tawUserHomePage.destinationThirdButton.isDisplayed() && tawUserHomePage.destinationThirdButton.isEnabled());

        softAssert.assertAll();

        Driver.closeDriver();
    }

}
