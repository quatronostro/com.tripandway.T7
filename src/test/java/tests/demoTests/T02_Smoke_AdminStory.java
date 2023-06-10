package tests.demoTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TawAdminPage;
import utilities.*;

import java.util.Set;

public class T02_Smoke_AdminStory extends TestBaseReport {

    @Test
    public void TC_01(){
        TawAdminPage tawAdminPage = new TawAdminPage();
        extentTest= extentReports.createTest("TripAndWay Smoke Test Admin Story",
                "Admin bilgileri ile giriş yaptıktan sonra Order bölümüne girerek son yapılan siparişi görüntülenebildiğini doğrulayabilmeli, faturayı print edebilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("tawAdminUrl"));
        extentTest.info("Admin TripAndWay'in admin giriş sayfasına gider");
        ReusableMethods.wait(2);
        //Admin bilgileri ile hesabına giriş yapar
        TawAdminPage.tawAdminAccountGiris();
        extentTest.info("Admin bilgilerini girerek hesabına giriş yapar");
        ReusableMethods.wait(2);

        //Sol Panelde "Order" butonuna tıklar
        tawAdminPage.orderButton.click();
        extentTest.info("Sol panelde bulunan Order butonuna tıklar");
        String ilkSayfaWHD= Driver.getDriver().getWindowHandle();
        ReusableMethods.wait(2);
        //Açılan listede en son siparişi görüntüler
        tawAdminPage.orderPageSLButton.click();
        extentTest.info("Filtrelemeden en son siparişi getirir");
        ReusableMethods.wait(2);

        ///Siparişin "See Detail" butonuna tıklar
        tawAdminPage.seeDetailButton.click();
        extentTest.info("Siparişin See Deatil butonuna tıklar");
        ReusableMethods.wait(2);

        //Yeni sekmeye geçer
        Set<String> whDegerleriSet = Driver.getDriver().getWindowHandles();
        String ikinciWindowWHD= "";

        for (String eachWhd: whDegerleriSet
        ) {

            if (!eachWhd.equals(ilkSayfaWHD)){
                ikinciWindowWHD = eachWhd;
            }
        }
        Driver.getDriver().switchTo().window(ikinciWindowWHD);
        extentTest.info("Yeni sekmeye geçiş yapar");
        ReusableMethods.wait(2);
        //Siparişi veren kişinin "Berke Baramuk" olduğunu doğrular

        Assert.assertTrue(tawAdminPage.berkeBaramukText.isDisplayed());
        extentTest.info("Sipariş bilgilerini doğrular");
        ReusableMethods.wait(2);

        //Geri sipariş listesi sayfasına döner
        Driver.getDriver().switchTo().window(ilkSayfaWHD);
        extentTest.info("Bir önceki sekmeye döner");
        ReusableMethods.wait(2);
        //"Invoice" butonuna tıklar
        tawAdminPage.invoiceButton.click();
        extentTest.info("Siparişin Invoice(Fatura) butonuna tıklar");
        ReusableMethods.wait(2);
        Set<String> whDegerleriSet2 = Driver.getDriver().getWindowHandles();
        String ucuncuWindowWHD= "";

        for (String eachWhd: whDegerleriSet2
        ) {

            if (!eachWhd.equals(ilkSayfaWHD)){
                ucuncuWindowWHD = eachWhd;
            }
        }

        Driver.getDriver().switchTo().window(ucuncuWindowWHD);
        extentTest.info("Faturanın açıldığı sekmeye gider");
        ReusableMethods.wait(2);
        //Yeni sekmeye geçip "Print Invoice" butonuna tıklar

        tawAdminPage.printInvoiceButton.click();
        extentTest.info("Print Invoice butonuna tıklar");
        ReusableMethods.wait(2);

        //Açılan pencerede faturanın çıktısını almak için print butonuna tıklar
        Set<String> whDegerleriSet3 = Driver.getDriver().getWindowHandles();
        String printWindowWHD= "";

        for (String eachWhd: whDegerleriSet3
        ) {

            if (!eachWhd.equals(ilkSayfaWHD)){
                printWindowWHD = eachWhd;
            }
        }
        Driver.getDriver().switchTo().window(printWindowWHD);
        ReusableMethods.wait(2);

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER).perform();
        extentTest.info("Print butonuna tıklar");
        ReusableMethods.wait(2);

        Driver.quitDriver();



    }
}
