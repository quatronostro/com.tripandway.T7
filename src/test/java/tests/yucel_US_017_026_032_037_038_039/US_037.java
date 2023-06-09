package tests.yucel_US_017_026_032_037_038_039;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TawAdminPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_037 {

    TawAdminPage tawAdminPage;

    @Test
    public void TC_01(){
        tawAdminPage = new TawAdminPage();

        //1. Webdriver çalıştırılarak "https://qa.tripandway.com/admin" sayfasına gidilir ve admin hesap bilgileri ile giriş yapılır
        Driver.getDriver().get(ConfigReader.getProperty("tawAdminUrl"));

        TawAdminPage.tawAdminAccountGiris();

        //2. Admin ana sayfasında sağ üst köşede bulunan admin profil resmine tıklanır
        tawAdminPage.dropDownAdminProfile.click();

        //3. Tıklama işleminden sonra drop down menünün görünür olduğunu doğrulanır
        Assert.assertTrue(tawAdminPage.dropDownMenuAdminProfile.isDisplayed());

        Driver.closeDriver();

    }
}
