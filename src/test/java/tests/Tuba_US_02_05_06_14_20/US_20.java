package tests.Tuba_US_02_05_06_14_20;

import net.bytebuddy.description.annotation.AnnotationSource;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TawUserDashboard;
import pages.TawUserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_20 {
    TawUserDashboard tawUserDashboard;
    TawUserHomePage tawUserHomePage;

    @Test
    public void TC_01(){

        tawUserDashboard =new TawUserDashboard();
        tawUserHomePage=new TawUserHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));


        //1)Kullanıcı login olduktan sonra "Update Profile" sekmesi görüntülenebilir ve aktif olduğu doğrulanır
        tawUserHomePage.userLoginElement.click();
        TawUserHomePage.tawUserAccountLogin();
        tawUserDashboard.updateProfilSekmesi.click();

        ReusableMethods.wait(2);
        Assert.assertTrue(tawUserDashboard.updateProfilTitle.isDisplayed());


        Assert.assertTrue(tawUserDashboard.updateButonu.isDisplayed());
        Assert.assertTrue(tawUserDashboard.updateButonu.isEnabled());

        //2)Update Profile sayfasındaki elementlerin görünür ve aktif olduğu doğrulanır

        Assert.assertTrue(tawUserDashboard.updateProfilCityTitle.isDisplayed());

        Assert.assertTrue(tawUserDashboard.updateProfilCityButonu.isDisplayed());
        Assert.assertTrue(tawUserDashboard.updateProfilCityButonu.isEnabled());

        Assert.assertTrue(tawUserDashboard.updateProfilCountryTitle.isDisplayed());

        Assert.assertTrue(tawUserDashboard.updateProfilCountryButonu.isDisplayed());
        Assert.assertTrue(tawUserDashboard.updateProfilCountryButonu.isEnabled());

        Assert.assertTrue(tawUserDashboard.updateProfileAdressTitle.isDisplayed());

        Assert.assertTrue(tawUserDashboard.updateProfileAdressButonu.isDisplayed());
        Assert.assertTrue(tawUserDashboard.updateProfileAdressButonu.isEnabled());

        Assert.assertTrue(tawUserDashboard.updateProfilEmailAddressTitle.isDisplayed());

        Assert.assertTrue(tawUserDashboard.updateProfilEmailAddressButonu.isDisplayed());
        Assert.assertTrue(tawUserDashboard.updateProfilEmailAddressButonu.isEnabled());


        Assert.assertTrue(tawUserDashboard.updateProfileNameTitle.isDisplayed());

        Assert.assertTrue(tawUserDashboard.updateProfileNameButonu.isDisplayed());
        Assert.assertTrue(tawUserDashboard.updateProfileNameButonu.isEnabled());

        Assert.assertTrue(tawUserDashboard.updateProfilePhoneTitle.isDisplayed());

        Assert.assertTrue(tawUserDashboard.updatepro.isDisplayed());
        Assert.assertTrue(tawUserDashboard.updatepro.isEnabled());

        Assert.assertTrue(tawUserDashboard.updateProfilStateTitle.isDisplayed());

        Assert.assertTrue(tawUserDashboard.updateProfilStateButonu.isDisplayed());
        Assert.assertTrue(tawUserDashboard.updateProfilStateButonu.isEnabled());

        Assert.assertTrue(tawUserDashboard.updateProfilZipCodeTitle.isDisplayed());

        Assert.assertTrue(tawUserDashboard.updateProfilZipCodeButonu.isDisplayed());
        Assert.assertTrue(tawUserDashboard.updateProfilZipCodeButonu.isEnabled());


        //3)İlgili sayfadaki görünürlüğü doğrulanan elementlere bilgi girişi yapılabildiği doğrulanır

        tawUserDashboard.updateProfileNameButonu.sendKeys("Tuba");
        tawUserDashboard.updatepro.sendKeys("05476897890");
        tawUserDashboard.updateProfileAdressButonu.sendKeys("Karacayır Mahallesi");
        tawUserDashboard.updateProfilCityButonu.sendKeys("Bolu");
        tawUserDashboard.updateProfilEmailAddressButonu.sendKeys("tub");
        tawUserDashboard.updateProfilCountryButonu.sendKeys("Türkiye");
        tawUserDashboard.updateProfilStateButonu.sendKeys("Merkez");
        tawUserDashboard.updateProfilZipCodeButonu.sendKeys("1400");



   //4)İlgili sayfada bilgiler doldurulduktan sonra "Update" butonu görüntülenebilir ve tıklanabilir olduğu doğrulanır

      Assert.assertTrue(tawUserDashboard.updateButonu.isDisplayed());
      Assert.assertTrue(tawUserDashboard.updateButonu.isEnabled());
      tawUserDashboard.updateButonu.click();

//5)Profil bilgilerinin düzenlenebildiğine dair yazının görünürlüğü doğrulanır
      Assert.assertTrue(tawUserHomePage.alertOnay.isDisplayed());


        Driver.closeDriver();

    }









}
