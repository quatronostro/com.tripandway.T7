package tests.akif_US_7_11_18_22_33;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class US_018 extends TestBaseReport {

    Faker faker;

    //US_018>>>> "Kullanıcı olarak siteye kayıt olabilmeliyim ve Girdiğim bilgiler gerekli kriterleri sağlamazsa gerekli uyarıları alabilmeliyim"

    @Test
    public void TC_01() throws InterruptedException {
        faker = new Faker();

        extentTest =extentReports.createTest("GizlilikPolitikasıTesti");



        //tripandway anasayfasına git.

        Driver.getDriver().get("https://qa.tripandway.com/");

        extentTest.info("Kullanıcı tripandway.com anasayfasına gider");

        //registration bağlantısına tıkla

        WebElement registration=Driver.getDriver().findElement(By.xpath("//a[@href=\"https://qa.tripandway.com/traveller/register\"]"));
        registration.click();
        extentTest.info("Registration sayfasına gidilir");

        //Girilen sayfanın registration sayfası olduğunu doğrula

        SoftAssert softAssert = new SoftAssert();

        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Registration";

        softAssert.assertEquals(actualTitle,expectedTitle);
        extentTest.info("Sayfanın Registration sayfası oldugu doğrulanır");



        WebElement isim=Driver.getDriver().findElement(By.xpath("(//input[@class='form-control'])[1]"));
        WebElement eMail=Driver.getDriver().findElement(By.xpath("(//input[@class='form-control'])[2]"));
        WebElement sifre=Driver.getDriver().findElement(By.xpath("(//input[@class='form-control'])[3]"));
        WebElement loginButonu=Driver.getDriver().findElement(By.xpath("//button[text()='Make Registration']"));

        // Geçersiz kullanıcı bilgileri kayıt olunmaya çalışılıp kayıt olunamadığı doğrulanır.

        isim.sendKeys("Akif Sen");
        eMail.sendKeys("akif.gmail.com");
        sifre.sendKeys("Team.113");
        loginButonu.click();

        softAssert.assertTrue(eMail.isEnabled());

        extentTest.info("Geçersiz bilgiler girerek giriş yapılamadığı doğrulanır");



        //Geçerli kullanıcı bilgileri girerek kayıt olunabildiği doğrulanır.

        isim.sendKeys(faker.name().fullName());
        eMail.sendKeys(faker.internet().emailAddress());
        sifre.sendKeys(faker.internet().password());
        loginButonu.click();
        Thread.sleep(500);

        WebElement basariliGirisUyarisi=Driver.getDriver().findElement(By.xpath("//div[@class='toast toast-success']"));

        String actualText= basariliGirisUyarisi.getText();
        String ecpectedText="Registration is completed";

        softAssert.assertTrue(actualText.contains(ecpectedText));

        extentTest.info("Geçerli bilgiler girilerek kaydın gerçekleştiği doğrulanır");



        softAssert.assertAll();
        extentTest.pass("Soft assert ile yapılan testlerin sonucunu raporlar");


        //Sayfayı kapatır
        Driver.quitDriver();
        extentTest.info("Sayfayı Kapatır");






    }
}
