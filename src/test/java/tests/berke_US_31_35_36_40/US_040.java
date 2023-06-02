package tests.berke_US_31_35_36_40;

import org.testng.annotations.Test;
import pages.TawAdminPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_040 {

    @Test
    public void TC_01(){
        //1. Webdriver çalıştırılarak "https://qa.tripandway.com/admin" sayfasına gidilir ve admin hesap bilgileri ile giriş yapılır
        Driver.getDriver().get(ConfigReader.getProperty("tawAdminUrl"));

        //2. Sol tarafta bulunan panelin alt kısmında ok işaretli butona tıklanır
        TawAdminPage tawAdminPage = new TawAdminPage();
        tawAdminPage.accordionButton.click();
        //3. Panelin kapalı hale geldiği doğrulanır
    }
}
