package tests.mustafa_US_16_23_27_30;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TawUserHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_16 {
    TawUserHomePage tawUserHomePage;

    @Test
    public void Test01() throws InterruptedException {
        tawUserHomePage = new TawUserHomePage();
        Actions actions = new Actions(Driver.getDriver());

        //1.Webdriver çalıştırılarak https://www.tripandway.com/qa/ sayfasına gidilir.
        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));

        //2.Anasayfada header bölümündeki FAQ linkinin görünürlüğü doğrulanır.
        Assert.assertTrue(tawUserHomePage.homePageFAQLink.isDisplayed());


        //3.Anasayfada header bölümündeki FAQ linki tıklanır.
        tawUserHomePage.homePageFAQLink.click();
        tawUserHomePage.cookyElement.click();


        //4.Açılan sayfadaki başlık bilgisi kontrol edilir ve FAQ sayfasında olunduğu doğrulanır.
        String expectedContain = "faq";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedContain));


        //5.Açılan sayfadaki öğelerin görünür olduğu kontrol edilir.
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(tawUserHomePage.FAQPageOge1.isEnabled());
        tawUserHomePage.FAQPageOge1.click();
        Thread.sleep(2000);
        softAssert.assertTrue(tawUserHomePage.FAQPageParagraf1.isDisplayed(), "1.paragraf acılmadı !");

        softAssert.assertTrue(tawUserHomePage.FAQPageOge2.isEnabled());
        tawUserHomePage.FAQPageOge2.click();
        Thread.sleep(2000);
        softAssert.assertTrue(tawUserHomePage.FAQPageParagraf2.isDisplayed(), "2.paragraf acılmadı !");

        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        softAssert.assertTrue(tawUserHomePage.FAQPageOge3.isEnabled());
        tawUserHomePage.FAQPageOge3.click();
        Thread.sleep(2000);
        softAssert.assertTrue(tawUserHomePage.FAQPageParagraf3.isDisplayed(), "3.paragraf acılmadı !");

        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        softAssert.assertTrue(tawUserHomePage.FAQPageOge4.isEnabled());
        tawUserHomePage.FAQPageOge4.click();
        Thread.sleep(2000);
        softAssert.assertTrue(tawUserHomePage.FAQPageParagraf4.isDisplayed(), "4.paragraf acılmadı !");

        softAssert.assertTrue(tawUserHomePage.FAQPageOge5.isEnabled());
        tawUserHomePage.FAQPageOge5.click();
        Thread.sleep(2000);
        softAssert.assertTrue(tawUserHomePage.FAQPageParagraf5.isDisplayed(), "5.paragraf acılmadı !");

        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        softAssert.assertTrue(tawUserHomePage.FAQPageOge6.isEnabled());
        tawUserHomePage.FAQPageOge6.click();
        Thread.sleep(2000);
        softAssert.assertTrue(tawUserHomePage.FAQPageParagraf6.isDisplayed(), "6.paragraf acılmadı !");

        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        softAssert.assertTrue(tawUserHomePage.FAQPageOge7.isEnabled());
        tawUserHomePage.FAQPageOge7.click();
        Thread.sleep(2000);
        softAssert.assertTrue(tawUserHomePage.FAQPageParagraf7.isDisplayed(), "7.paragraf acılmadı !");

        softAssert.assertTrue(tawUserHomePage.FAQPageOge8.isEnabled());
        tawUserHomePage.FAQPageOge8.click();
        Thread.sleep(2000);
        softAssert.assertTrue(tawUserHomePage.FAQPageParagraf8.isDisplayed(), "8.paragraf acılmadı !");

        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        softAssert.assertTrue(tawUserHomePage.FAQPageOge9.isEnabled());
        tawUserHomePage.FAQPageOge9.click();
        Thread.sleep(2000);
        softAssert.assertTrue(tawUserHomePage.FAQPageParagraf9.isDisplayed(), "9.paragraf acılmadı !");

        softAssert.assertTrue(tawUserHomePage.FAQPageOge10.isEnabled());
        tawUserHomePage.FAQPageOge10.click();
        Thread.sleep(2000);
        softAssert.assertTrue(tawUserHomePage.FAQPageParagraf10.isDisplayed(), "10.paragraf acılmadı !");

        softAssert.assertAll();

        Driver.closeDriver();
    }

}