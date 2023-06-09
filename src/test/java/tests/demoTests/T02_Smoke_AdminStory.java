package tests.demoTests;

import org.testng.annotations.Test;
import pages.TawAdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class T02_Smoke_AdminStory extends TestBaseReport {

    @Test
    public void TC_01(){
        TawAdminPage tawAdminPage = new TawAdminPage();

        Driver.getDriver().get(ConfigReader.getProperty("tawAdminUrl"));

        //Admin bilgileri ile hesabına giriş yapar
        TawAdminPage.tawAdminAccountGiris();

        //Sol Panelde "Order" butonuna tıklar
        tawAdminPage.orderButton.click();

        //Açılan listede en son siparişi görüntüler
        tawAdminPage.orderPageSLButton.click();

        ///???

    }
}
