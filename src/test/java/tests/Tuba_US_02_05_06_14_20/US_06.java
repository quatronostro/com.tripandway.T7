package tests.Tuba_US_02_05_06_14_20;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TawUserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US_06 {
    TawUserHomePage tawUserHomePage;

    @Test
    public void TC_01(){
        SoftAssert softAssert=new SoftAssert();
        tawUserHomePage=new TawUserHomePage();

        //1)https://qa.tripandway.com/ adresine gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));

        //2) Sitenin footer kısmındaki "Recent Post" bölümünün tüm öğelerinin görünür ve aktif oldukları doğrulanabildi

        JSUtilities.scrollToElement(Driver.getDriver(), tawUserHomePage.RecentPostTest);
        ReusableMethods.wait(2);
        softAssert.assertTrue(tawUserHomePage.RecentPostTest.isDisplayed());


        softAssert.assertTrue(tawUserHomePage.recentPostBirinciElement.isDisplayed());
        softAssert.assertTrue(tawUserHomePage.recentPostBirinciElement.isEnabled());


        softAssert.assertTrue(tawUserHomePage.recentPostIkinciElement.isDisplayed());
        softAssert.assertTrue(tawUserHomePage.recentPostIkinciElement.isEnabled());


        softAssert.assertTrue(tawUserHomePage.recentPostUcuncuElement.isDisplayed());
        softAssert.assertTrue(tawUserHomePage.recentPostUcuncuElement.isEnabled());


        softAssert.assertTrue(tawUserHomePage.recentPostDorduncuElemnt.isDisplayed());
        softAssert.assertTrue(tawUserHomePage.recentPostDorduncuElemnt.isEnabled());


        softAssert.assertTrue(tawUserHomePage.recentPostBesinciElement.isDisplayed());
        softAssert.assertTrue(tawUserHomePage.recentPostBesinciElement.isEnabled());

        softAssert.assertAll();
        Driver.closeDriver();



    }







}
