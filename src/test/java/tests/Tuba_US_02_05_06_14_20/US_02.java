package tests.Tuba_US_02_05_06_14_20;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TawUserHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_02 {
  TawUserHomePage tawUserHomePage;


    @Test
    public void TC_01(){
        SoftAssert softAssert=new SoftAssert();
        tawUserHomePage=new TawUserHomePage();

       //1) http://qa.tripandway.com sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));

        //2)Home Page kısmında header bölümündeki "HOME" menüsünün görünür ve aktif olduğu doğrulanır
        softAssert.assertTrue(tawUserHomePage.homeButon.isDisplayed());
        softAssert.assertTrue(tawUserHomePage.homeButon.isEnabled());

        //3) Home Page kısmında header bölümündeki "SERVICES" menüsünün görünür ve aktif olduğu doğrulanır
        softAssert.assertTrue(tawUserHomePage.servicesButon.isDisplayed());
        softAssert.assertTrue(tawUserHomePage.servicesButon.isEnabled());


        //4) Home Page kısmında header bölümündeki "DESTINATIONS" menüsünün görünür ve aktif olduğu doğrulanır
        softAssert.assertTrue(tawUserHomePage.destinationsButon.isDisplayed());
        softAssert.assertTrue(tawUserHomePage.destinationsButon.isEnabled());


        //5)  Home Page kısmında header bölümündeki "PACKAGES" menüsünün görünür veaktif olduğu doğrulanabilmeli
        softAssert.assertTrue(tawUserHomePage.packagesButon.isDisplayed());
        softAssert.assertTrue(tawUserHomePage.packagesButon.isEnabled());


        //6) Home Page kısmında header bölümündeki "ABOUT US" menüsünün görünür ve aktif olduğu doğrulanabilmeli
        softAssert.assertTrue(tawUserHomePage.aboutUsButon.isDisplayed());
        softAssert.assertTrue(tawUserHomePage.aboutUsButon.isEnabled());


        //7) Home Page kısmında header bölümündeki "FAQ" menüsünün görünür ve aktif olduğu doğrulanabilmeli
        softAssert.assertTrue(tawUserHomePage.faqButon.isDisplayed());
        softAssert.assertTrue(tawUserHomePage.faqButon.isEnabled());


        //8) Home Page kısmında header bölümündeki "BLOG" menüsünün görünür ve aktif olduğu doğrulanabilmeli
        softAssert.assertTrue(tawUserHomePage.blogButon.isDisplayed());
        softAssert.assertTrue(tawUserHomePage.blogButon.isEnabled());


        //9) Home Page kısmında header bölümündeki "CONTACT" menüsünün görünür ve aktif olduğu doğrulanabilmeli
        softAssert.assertTrue(tawUserHomePage.contactButon.isDisplayed());
        softAssert.assertTrue(tawUserHomePage.contactButon.isEnabled());


        //10) Home Page kısmında header bölümündeki telefon numarasının ve e-mail adresinin görünür olduğu doğrulanabilmeli
        softAssert.assertTrue(tawUserHomePage.telNo.isDisplayed());


        //11) Home Page kısmında logonun görünür ve aktif olduğu doğrulanabilmeli
        softAssert.assertTrue(tawUserHomePage.emailAddress.isDisplayed());

        softAssert.assertAll();
        Driver.closeDriver();










    }









}
