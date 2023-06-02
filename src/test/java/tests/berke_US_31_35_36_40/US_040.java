package tests.berke_US_31_35_36_40;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TawAdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;


public class US_040 {

    @Test
    public void TC_01(){


        TawAdminPage tawAdminPage = new TawAdminPage();
        //1. Webdriver çalıştırılarak "https://qa.tripandway.com/admin" sayfasına gidilir ve admin hesap bilgileri ile giriş yapılır
        Driver.getDriver().get(ConfigReader.getProperty("tawAdminUrl"));


        //Admin girişi
        tawAdminPage.adminEmailBox.sendKeys(ConfigReader.getProperty("adminEmail1"));
        tawAdminPage.adminPassBox.sendKeys(ConfigReader.getProperty("adminPass"));
        tawAdminPage.adminLoginButton.click();

        //2. Sol tarafta bulunan panelin alt kısmında ok işaretli butona tıklanır

        TawAdminPage tawAdminPage = new TawAdminPage();
        tawAdminPage.accordionButton.click();

        //3. Panelin kapalı hale geldiği doğrulanır


        Driver.closeDriver();
    }
}
