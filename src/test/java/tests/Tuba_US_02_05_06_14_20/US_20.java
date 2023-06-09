package tests.Tuba_US_02_05_06_14_20;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TawUserDashboard;
import pages.TawUserHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_20 {
    TawUserDashboard tawUserDashboard;
    TawUserHomePage tawUserHomePage;

    @Test
    public void TC_01(){
        SoftAssert softAssert=new SoftAssert();
        tawUserDashboard =new TawUserDashboard();
        tawUserHomePage=new TawUserHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));


        //1)Kullanıcı login olduktan sonra "Update Profile" sekmesi görüntülenebilir ve aktif olduğu doğrulanır
        tawUserHomePage.userLoginElement.click();
        TawUserHomePage.tawUserAccountLogin();
        tawUserDashboard.updateButonu.click();


        Assert.assertTrue(tawUserDashboard.updateButonu.isDisplayed());
        softAssert.assertTrue(tawUserDashboard.updateButonu.isEnabled());

        //2)Update Profile sayfasındaki elementlerin görünür ve aktif olduğu doğrulanır

        softAssert.assertTrue(tawUserDashboard.updateProfilCityTitle.isDisplayed());

        softAssert.assertTrue(tawUserDashboard.updateProfilCityButonu.isDisplayed());
        softAssert.assertTrue(tawUserDashboard.updateProfilCityButonu.isEnabled());

        softAssert.assertTrue(tawUserDashboard.updateProfilCountryTitle.isDisplayed());

        softAssert.assertTrue(tawUserDashboard.updateProfilCountryButonu.isDisplayed());
        softAssert.assertTrue(tawUserDashboard.updateProfilCountryButonu.isEnabled());

        softAssert.assertTrue(tawUserDashboard.updateProfileAdressTitle.isDisplayed());

        softAssert.assertTrue(tawUserDashboard.updateProfileAdressButonu.isDisplayed());
        softAssert.assertTrue(tawUserDashboard.updateProfileAdressButonu.isEnabled());

        softAssert.assertTrue(tawUserDashboard.updateProfilEmailAddressTitle.isDisplayed());

        softAssert.assertTrue(tawUserDashboard.updateProfilEmailAddressButonu.isDisplayed());
        softAssert.assertTrue(tawUserDashboard.updateProfilEmailAddressButonu.isEnabled());


        softAssert.assertTrue(tawUserDashboard.updateProfileNameTitle.isDisplayed());

        softAssert.assertTrue(tawUserDashboard.updateProfileNameButonu.isDisplayed());
        softAssert.assertTrue(tawUserDashboard.updateProfileNameButonu.isEnabled());

        softAssert.assertTrue(tawUserDashboard.updateProfilePhoneTitle.isDisplayed());

        softAssert.assertTrue(tawUserDashboard.updatepro.isDisplayed());
        softAssert.assertTrue(tawUserDashboard.updatepro.isEnabled());

        softAssert.assertTrue(tawUserDashboard.updateProfilStateTitle.isDisplayed());

        softAssert.assertTrue(tawUserDashboard.updateProfilStateButonu.isDisplayed());
        softAssert.assertTrue(tawUserDashboard.updateProfilStateButonu.isEnabled());

        softAssert.assertTrue(tawUserDashboard.updateProfilZipCodeTitle.isDisplayed());

        softAssert.assertTrue(tawUserDashboard.updateProfilZipCodeButonu.isDisplayed());
        softAssert.assertTrue(tawUserDashboard.updateProfilZipCodeButonu.isEnabled());




//3)İlgili sayfadaki görünürlüğü doğrulanan elementlere bilgi girişi yapılabildiği doğrulanır

   tawUserDashboard.updateProfileNameButonu.sendKeys("Tuba");









//4)İlgili sayfada bilgiler doldurulduktan sonra "Update" butonu görüntülenebilir ve tıklanabilir olduğu doğrulanır

      softAssert.assertTrue(tawUserDashboard.updateButonu.isDisplayed());
      softAssert.assertTrue(tawUserDashboard.updateButonu.isEnabled());

//5)Profil bilgilerinin düzenlenebildiğine dair yazının görünürlüğü doğrulanır
      softAssert.assertTrue(tawUserDashboard.successfullyTitle.isDisplayed());

        softAssert.assertAll();
        Driver.closeDriver();

    }









}
