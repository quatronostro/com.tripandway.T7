package tests.Tuba_US_02_05_06_14_20;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TawUserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import javax.swing.text.TabableView;

public class US_14 {
   // SoftAssert softAssert=new SoftAssert();
    TawUserHomePage tawUserHomePage;
     @Test
    public void TC_01(){
      tawUserHomePage=new TawUserHomePage();

        //Açılan browserda ziyaretçi "https://qa.tripandway.com" adresine erişebilmeli
        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));


        // Adresin anasayfasında "Packages" kısmını görebilmeli ve tıklayabilmeli
         ReusableMethods.wait(2);

         Assert.assertTrue(tawUserHomePage.packagesButon.isDisplayed());

         Assert.assertTrue(tawUserHomePage.packagesButon.isEnabled());


        // Erişilen yeni sekmedeki tüm elementler görüntülenebilmeli
        tawUserHomePage.packagesButon.click();

         ReusableMethods.wait(2);

         Assert.assertTrue(tawUserHomePage.packagesIcerikBirinciElement.isDisplayed());

         Assert.assertTrue(tawUserHomePage.packagesIcerikIkinciElement.isDisplayed());

         Assert.assertTrue(tawUserHomePage.packagesIcerikUcuncuElement.isDisplayed());

         Assert.assertTrue(tawUserHomePage.packagesIcerikDorduncuElement.isDisplayed());

         Assert.assertTrue(tawUserHomePage.packagesIcerikBesinciElement.isDisplayed());

         Assert.assertTrue(tawUserHomePage.packagesIcerikAltinciElement.isDisplayed());

         Assert.assertTrue(tawUserHomePage.packagesIcerikYedinciElement.isDisplayed());

        // Görüntülenebilir olan bu elementler tıklanabilmeli ve yeni bir sekmede açılabilmeli

         Assert.assertTrue(tawUserHomePage.packagesIcerikBirinciElement.isEnabled());

         Assert.assertTrue(tawUserHomePage.packagesIcerikIkinciElement.isEnabled());

         Assert.assertTrue(tawUserHomePage.packagesIcerikUcuncuElement.isEnabled());

         Assert.assertTrue(tawUserHomePage.packagesIcerikDorduncuElement.isEnabled());

         Assert.assertTrue(tawUserHomePage.packagesIcerikBesinciElement.isEnabled());

         Assert.assertTrue(tawUserHomePage.packagesIcerikAltinciElement.isEnabled());

        Driver.closeDriver();






    }









}
