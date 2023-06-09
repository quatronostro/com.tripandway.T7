package tests.akif_US_7_11_18_22_33;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.util.Set;

public class US_007 extends TestBaseReport {

    //US_007>>>>>Sitenin footer bölümünde bulunan Sosyal Medya ikonlarının görüntülenebilir ve aktif olduğunu ayrıca açılabildiğini doğrulayabilmeliyim.

    @Test

    public void TC_01_SMedyaIkonTest() throws InterruptedException {

        extentTest = extentReports.createTest("Sosyal Medya Ikonları Testi");
        //tripandway anasayfasına git.


        Driver.getDriver().get("https://qa.tripandway.com/");

        extentTest.info("Kullanıcı tripandway.com anasayfasına gider");


        WebElement SosyalMedyaScroll = Driver.getDriver().findElement(By.xpath("//ul[@class='footer-social']"));
        JSUtilities.scrollToElement(Driver.getDriver(), SosyalMedyaScroll);
        Thread.sleep(1000);


        SoftAssert softAssert = new SoftAssert();


        //Facebook ikonunun görüntülenebilir olduunu doğrula

        WebElement facebookIkon = Driver.getDriver().findElement(By.xpath("(//a[@target='_blank'])[38]"));

        softAssert.assertTrue(facebookIkon.isDisplayed(), "Facebook ikonu görünür olmalı");

        extentTest.info("Facebook ikonunun görünür oldugunu test eder");


        //Twitter ikonunun görüntülenebilir olduunu doğrula

        WebElement twitterIkon = Driver.getDriver().findElement(By.xpath("(//a[@target='_blank'])[39]"));

        softAssert.assertTrue(twitterIkon.isDisplayed(), "Twitter ikonu görünür olmalı");

        extentTest.info("Twitter ikonunun görünür olduğunu test eder");


        //Linkedin ikonunun görüntülenebilir olduunu doğrula

        WebElement linkedinIkon = Driver.getDriver().findElement(By.xpath("(//a[@target='_blank'])[40]"));

        softAssert.assertTrue(linkedinIkon.isDisplayed(), "Linked ikonu görünür olmalı");

        extentTest.info("LinkedIn ikonunun görünür olduğunu test eder");


        //Printerest ikonunun görüntülenebilir olduunu doğrula

        WebElement printerestIkon = Driver.getDriver().findElement(By.xpath("(//a[@target='_blank'])[41]"));

        softAssert.assertTrue(printerestIkon.isDisplayed(), "Printerest ikonu görünür olmalı");

        extentTest.info("Printerest ikonunun görünür olduğunu test eder");


        //Instagram ikonunun görüntülenebilir olduunu doğrula

        WebElement instagramIkon = Driver.getDriver().findElement(By.xpath("(//a[@target='_blank'])[42]"));

        softAssert.assertTrue(instagramIkon.isDisplayed(), "Instagram ikonu görünür olmalı");

        extentTest.info("Instagram ikonunun görünür olduğunu test eder");


        softAssert.assertAll();
        extentTest.pass("Soft assert ile yapılan testleri raporlar");

        //Driver'i kapat

        Driver.closeDriver();

        extentTest.info("Sayfayı kapatır");
    }


    @Test

    public void TC_02_facebookTest() throws InterruptedException {

        extentTest = extentReports.createTest("Facebook Bağlantı Testi");


        //Tripandway.com anasayfasına git.

        Driver.getDriver().get("https://qa.tripandway.com/");
        extentTest.info("Kullanıcı tripandway.com anasayfasına gider");

        String ilkSayfaWHD = Driver.getDriver().getWindowHandle();


        //Facebook ikonuna tıkla.

        WebElement facebookIkon = Driver.getDriver().findElement(By.xpath("(//a[@target='_blank'])[38]"));

        JSUtilities.scrollToElement(Driver.getDriver(), facebookIkon);
        Thread.sleep(1000);
        JSUtilities.clickWithJS(Driver.getDriver(), facebookIkon);

        extentTest.info("Facebook ikonuna tıklar");



        /*JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

        jse.executeScript("arguments[0].scrollIntoView();", facebookIkon);
        Thread.sleep(1000);

        jse.executeScript("arguments[0].click();", facebookIkon);

     */


        //Driver'ı yeni sekmede açılan sayfaya switch et.

        Set<String> whDegerleriSet = Driver.getDriver().getWindowHandles();
        String ikinciWindowWHD = "";

        for (String eachWhd : whDegerleriSet
        ) {

            if (!eachWhd.equals(ilkSayfaWHD)) {
                ikinciWindowWHD = eachWhd;
            }
        }
        Driver.getDriver().switchTo().window(ikinciWindowWHD);

        extentTest.info("Driver'ı yeni sekmede açılan sayfaya switch eder");


        //Açılan sayfanın başlığının facebook içerdiğini doğrula.

        SoftAssert softAssert = new SoftAssert();

        String actualUrl = Driver.getDriver().getCurrentUrl();

        String expectedUrl = "facebook.com";

        softAssert.assertTrue(actualUrl.contains(expectedUrl), "Facebook sayfası açılmalı");

        extentTest.info("Açılan sayfanın url'sinin facebook.com içerdiğini doğrular");


        softAssert.assertAll();

        extentTest.pass("soft assert ile yapılan testleri raporlar");


        //Dirver'ı kapat

        Driver.quitDriver();

        extentTest.info("Sayfayı kapatır");

    }


    @Test
    public void TC_03_twitterTest() throws InterruptedException {

        extentTest = extentReports.createTest("Twitter Bağlantı Testi");


        //Tripandway.com anasayfasına git.

        Driver.getDriver().get("https://qa.tripandway.com/");

        extentTest.info("Kullanıcı tripandway.com anasayfasına gider");
        String ilkSayfaWHD = Driver.getDriver().getWindowHandle();


        //Twitter ikonuna tıkla.

        WebElement twitterIkon = Driver.getDriver().findElement(By.xpath("(//a[@target='_blank'])[39]"));

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

        jse.executeScript("arguments[0].scrollIntoView();", twitterIkon);
        Thread.sleep(1000);

        jse.executeScript("arguments[0].click();", twitterIkon);

        extentTest.info("Tiwtter ikonuna tıklayıp twitter sayfasını yeni sekmede açar");


        //Driver'ı yeni sekmede açılan sayfaya switch et.

        Set<String> whDegerleriSet = Driver.getDriver().getWindowHandles();
        String ikinciWindowWHD = "";

        for (String eachWhd : whDegerleriSet
        ) {

            if (!eachWhd.equals(ilkSayfaWHD)) {
                ikinciWindowWHD = eachWhd;
            }
        }
        Driver.getDriver().switchTo().window(ikinciWindowWHD);

        extentTest.info("Driver'ı yeni sekmede açılan sayfaya switch eder");


        //Açılan sayfanın Url'sinin twitter.com içerdiğini doğrula.

        SoftAssert softAssert = new SoftAssert();

        String actualUrl = Driver.getDriver().getCurrentUrl();

        String expectedUrl = "twitter.com";

        softAssert.assertTrue(actualUrl.contains(expectedUrl), "Twiter sayfası açılmalı");

        extentTest.info("Yeni açılan sayfanın Url'sinin twitter.com içeridğini doğrular");


        softAssert.assertAll();
        extentTest.pass("soft assert ile yapılan testleri raporlar");


        //Driver'ı kapat.


        Driver.quitDriver();
        extentTest.info("sayfayı kapatır");

    }


    @Test
    public void TC_04_linkedinTest() throws InterruptedException {

        extentTest = extentReports.createTest("LinkedIn Bağlantı Testi");


        //Tripandway.com anasayfasına git.

        Driver.getDriver().get("https://qa.tripandway.com/");

        extentTest.info("Kullanıcı tripandway.com anasayfasına gider");
        String ilkSayfaWHD = Driver.getDriver().getWindowHandle();


        //Linkedin ikonuna tıkla.

        WebElement linkedinIkon = Driver.getDriver().findElement(By.xpath("(//a[@target='_blank'])[40]"));

        JSUtilities.scrollToElement(Driver.getDriver(), linkedinIkon);
        Thread.sleep(1000);
        JSUtilities.clickWithJS(Driver.getDriver(), linkedinIkon);

        extentTest.info("Linkedin ikonuna tıklayıp Linkedin sayfasını yeni sekmede açar");


        //Driver'ı yeni sekmede açılan sayfaya switch et.

        Set<String> whDegerleriSet = Driver.getDriver().getWindowHandles();
        String ikinciWindowWHD = "";

        for (String eachWhd : whDegerleriSet
        ) {

            if (!eachWhd.equals(ilkSayfaWHD)) {
                ikinciWindowWHD = eachWhd;
            }
        }

        Driver.getDriver().switchTo().window(ikinciWindowWHD);

        extentTest.info("Driver'ı yeni sekmede açılan sayfaya switch eder");


        //Açılan sayfanın url'sinin linkedin.com içerdiğini doğrula.

        SoftAssert softAssert = new SoftAssert();

        String actualUrl = Driver.getDriver().getCurrentUrl();

        String expectedUrl = "linkedin.com";

        softAssert.assertTrue(actualUrl.contains(expectedUrl), "Linkedin sayfası açılmalı");

        extentTest.info("Yeni açılan sayfanın başlığının Linkedin kelimesini içeridğini doğrular");


        softAssert.assertAll();

        extentTest.pass("soft assert ile yapılan testleri raporlar");


        //Driver'ı kapat.


        Driver.quitDriver();

        extentTest.info("sayfayı kapatır");
    }


    @Test
    public void TC_05_prinerestTest() throws InterruptedException {

        extentTest = extentReports.createTest("Printerest Bağlantı Testi");


        //Tripandway.com anasayfasına git.

        Driver.getDriver().get("https://qa.tripandway.com/");

        extentTest.info("Kullanıcı tripandway.com anasayfasına gider");
        String ilkSayfaWHD = Driver.getDriver().getWindowHandle();


        //Prinerest ikonuna tıkla.

        WebElement printerestIkon = Driver.getDriver().findElement(By.xpath("(//a[@target='_blank'])[41]"));

        JSUtilities.scrollToElement(Driver.getDriver(), printerestIkon);
        Thread.sleep(1000);
        JSUtilities.clickWithJS(Driver.getDriver(), printerestIkon);

        extentTest.info("Prinerest ikonuna tıklayıp Prinerest sayfasını yeni sekmede açar");


        //Driver'ı yeni sekmede açılan sayfaya switch et.

        Set<String> whDegerleriSet = Driver.getDriver().getWindowHandles();
        String ikinciWindowWHD = "";

        for (String eachWhd : whDegerleriSet
        ) {

            if (!eachWhd.equals(ilkSayfaWHD)) {
                ikinciWindowWHD = eachWhd;
            }
        }

        Driver.getDriver().switchTo().window(ikinciWindowWHD);

        extentTest.info("Driver'ı yeni sekmede açılan sayfaya switch eder");


        //Sayfa Url'sinin printerest.com içerdiğini doğrula.

        String actualUrl = Driver.getDriver().getCurrentUrl();

        String expectedUrl = "printerest.com";

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(actualUrl.contains(expectedUrl), "Prinerest sayfası açılmalı");

        extentTest.info("Yeni açılan sayfanın url'sinin prinerest.com içeridğini doğrular");


        softAssert.assertAll();

        extentTest.pass("soft assert ile yapılan testleri raporlar");


        //Driver'ı kapat.


        Driver.quitDriver();

        extentTest.info("sayfayı kapatır");


    }

    @Test
    public void TC_06_instagramTest() throws InterruptedException {

        extentTest = extentReports.createTest("Instagram Bağlantı Testi");


        //Tripandway.com anasayfasına git.

        Driver.getDriver().get("https://qa.tripandway.com/");

        extentTest.info("Kullanıcı tripandway.com anasayfasına gider");
        String ilkSayfaWHD = Driver.getDriver().getWindowHandle();


        //Instagram ikonuna tıkla.

        WebElement instagramIkon = Driver.getDriver().findElement(By.xpath("(//a[@target='_blank'])[42]"));

        JSUtilities.scrollToElement(Driver.getDriver(), instagramIkon);
        Thread.sleep(1000);
        JSUtilities.clickWithJS(Driver.getDriver(), instagramIkon);

        extentTest.info("Instagram ikonuna tıklayıp Instagram sayfasını yeni sekmede açar");


        //Driver'ı yeni sekmede açılan sayfaya switch et.

        Set<String> whDegerleriSet = Driver.getDriver().getWindowHandles();
        String ikinciWindowWHD = "";

        for (String eachWhd : whDegerleriSet
        ) {

            if (!eachWhd.equals(ilkSayfaWHD)) {
                ikinciWindowWHD = eachWhd;
            }
        }

        Driver.getDriver().switchTo().window(ikinciWindowWHD);

        extentTest.info("Driver'ı yeni sekmede açılan sayfaya switch eder");


        //Açılan sayfanın url'sinin insatgram.com içerdiğini doğrula.

        String actualUrl = Driver.getDriver().getCurrentUrl();

        String expectedUrl = "instagram.com";

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(actualUrl.contains(expectedUrl), "Instagram sayfası açılmmalı");

        extentTest.info("Yeni açılan sayfanın başlığının Instagram kelimesini içeridğini doğrular");


        softAssert.assertAll();

        extentTest.pass("soft assert ile yapılan testleri raporlar");


        //Driver'ı kapat.


        Driver.quitDriver();

        extentTest.info("sayfayı kapatır");


    }

}


