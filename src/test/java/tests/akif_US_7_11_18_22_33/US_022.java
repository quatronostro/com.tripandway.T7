package tests.akif_US_7_11_18_22_33;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class US_022 extends TestBaseReport {

    //US_022>>>> Kullanıcı olarak şifremi değiştirebildiğimi ve şifremi unuttum bağlantısı ile yeni şifre alabildiğimi doğrulamalıyım
    @Test
    public void YeniSifreAlmaTesti() throws InterruptedException {

        extentTest = extentReports.createTest("GizlilikPolitikasıTesti");


        //tripandway anasayfasına git.

        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));

        extentTest.info("Kullanıcı tripandway.com anasayfasına gider");

        //Login butonuna tıklayarak giriş sayfasını gelir.

        WebElement AnasayfaLoginButonu=Driver.getDriver().findElement(By.xpath("//i[@class=\"fas fa-lock\"]"));
        AnasayfaLoginButonu.click();
        extentTest.info("Kullanıcı login sayfasına girer.");
        Thread.sleep(500);

        //email ve şifre bölümlerini girerek login olur.
        WebElement eMailBox=Driver.getDriver().findElement(By.xpath("(//input[@class='form-control'])[1]"));
        WebElement sifreBox=Driver.getDriver().findElement(By.xpath("(//input[@class='form-control'])[2]"));
        WebElement GirisSayfasiLogin=Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));

        eMailBox.sendKeys("akfsn07@gmail.com");
        sifreBox.sendKeys("Akif.1903");
        Thread.sleep(500);
        GirisSayfasiLogin.click();

        extentTest.info("Kullanıcı adı ve şifre girilerek giriş yapılır");


        //update password bağlantısına tıklayarak şifre değiştirme ekranına gidilir.

        WebElement updatePasswordButonu=Driver.getDriver().findElement(By.xpath("//a[text()='Update Password']"));
        updatePasswordButonu.click();

        extentTest.info("Şifre güncelleme ekranına gidilir");
        Thread.sleep(500);



        //Yeni şifre girilerek şifrenin güncellendiği doğrulanır.

        WebElement newPasswordBox=Driver.getDriver().findElement(By.className("form-control"));
        WebElement updateButonu=Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        newPasswordBox.sendKeys("Team.113");
        updateButonu.click();
        Thread.sleep(400);


        WebElement ParolaBasariylaguncellendi=Driver.getDriver().findElement(By.xpath("//div[@class='toast-message']"));
        String actualIcerik=ParolaBasariylaguncellendi.getText();
        String expectedIcerik="Password is updated";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualIcerik.contains(expectedIcerik));
        extentTest.info("Yeni şifre girilerek şifrenin güncellendiği kontrol edilir.");

        softAssert.assertAll();
        extentTest.pass("Soft assert ile yapılan testlerin sonucunu raporlar");

        //Driveri kapat

        Driver.quitDriver();

    }



        @Test
        public void sifremiUnuttumTesti(){
        extentTest = extentReports.createTest("GizlilikPolitikasıTesti");


            //tripandway anasayfasına git.
            Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));

            extentTest.info("Kullanıcı tripandway.com anasayfasına gider");


            //Login butonuna tıklayarak giriş sayfasını gelir.

            WebElement AnasayfaLoginButonu=Driver.getDriver().findElement(By.xpath("//i[@class=\"fas fa-lock\"]"));
            AnasayfaLoginButonu.click();
            extentTest.info("Kullanıcı login sayfasına girer.");



            //Şifremi unuttum butonuna tıklar

            WebElement SifremiUnuttumButonu=Driver.getDriver().findElement(By.className("forget-password-link"));
            SifremiUnuttumButonu.click();

            extentTest.info("Şifre resetleme ekranına giriş yapılır");



        //email kutusuna e-mailini girerek submit butonuna tıklayıp resetleme maili gönderildi uyarısının verildiğini doğrula

            WebElement SifremiUnuttumEmailBox=Driver.getDriver().findElement(By.xpath("//input[@class='form-control']"));
            WebElement SifremiUnuttumSubmitButonu=Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));

            SifremiUnuttumEmailBox.sendKeys("akfsn07@gmail.com");
            SifremiUnuttumSubmitButonu.click();

            WebElement emailKontrolUayriAlert=Driver.getDriver().findElement(By.xpath("//div[@class='toast-message']"));
            String actualAlert=emailKontrolUayriAlert.getText();
            String expectedAlert="Please check your email";


            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(actualAlert.contains(expectedAlert));
            extentTest.info("Email girilerek şifre resetleme için email gönderildiğini doğrular.");


            softAssert.assertAll();
            extentTest.pass("Soft assert ile yapılan testlerin sonucunu raporlar");


            //Driveri kapatır

            Driver.quitDriver();

            extentTest.info("Sayfayı kapatır");












    }

}
