package tests.akif_US_7_11_18_22_33;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

import java.util.Set;

public class US_033 extends TestBaseReport {


    @Test
    public void SiparisDetaylariTesti() throws InterruptedException {

        extentTest = extentReports.createTest("SiparisDetaylariTesti");


        //tripandway admin paneli sayfasına git.

        Driver.getDriver().get("https://qa.tripandway.com/admin/login");

        extentTest.info("Kullanıcı tripandway.com admin paneline giriş sayfasına gider");
        Thread.sleep(500);



        //Kullanacı adı ve sifre girerek panele giriş yap
        WebElement adminGirisMailBox=Driver.getDriver().findElement(By.xpath("//input[@id='email']"));

        WebElement adminGirisPasswordBox=Driver.getDriver().findElement(By.xpath("//input[@id='password']"));

        WebElement adminGirisSubmitButonu=Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));

        adminGirisMailBox.sendKeys("admin21@tripandway.com");
        adminGirisPasswordBox.sendKeys("123123123");
        Thread.sleep(500);
        adminGirisSubmitButonu.click();

        extentTest.info("Admin Paneline giriş yapılır.");


        //Order bağlantısına tıklayıp açılan sayfada siprişlerin görüntülendiği doğrula.

        Driver.getDriver().findElement(By.xpath("(//a[@class='nav-link'])[6]")).click();

        String actualIcerik=Driver.getDriver().findElement(By.xpath("//h6[text()='View Orders']")).getText();
        String expectedIcerik="Orders";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualIcerik.contains(expectedIcerik));
        extentTest.info("Girilen sayfada siparişlerin görüntülendiği doğrulanır.");

        //Herhangi bir siparişin details bölümüne tıklayıp siparişe ait detayların görüntülendiğini doğrula.

        String ilkSayfaWHD=Driver.getDriver().getWindowHandle();
        String ilksayfaorderno=Driver.getDriver().findElement(By.xpath("//td[text()='60be1688d5d14']")).getText();


        Driver.getDriver().findElement(By.xpath("(//a[@target='_blank'])[5]")).click();
        Set<String> whDegerleriSet = Driver.getDriver().getWindowHandles();
        String ikinciWindowWHD = "";

        for (String eachWhd : whDegerleriSet
        ) {

            if (!eachWhd.equals(ilkSayfaWHD)) {
                ikinciWindowWHD = eachWhd;
            }
        }
        Driver.getDriver().switchTo().window(ikinciWindowWHD);

        String ikincisayfaorderno=Driver.getDriver().findElement(By.xpath("//td[text()='60be1688d5d14']")).getText();

        softAssert.assertEquals(ikincisayfaorderno,ilksayfaorderno);

        extentTest.info("ilk sayfada cıkan sipariş no ile 2 sayfaki sipariş numarasının aynı oldugu doğrulanır");



        softAssert.assertAll();
        extentTest.pass("Soft assert ile yapılan testlerin sonucunu raporlar");


        //Driver'i kapat
        Driver.quitDriver();
        extentTest.info("SAyfayı kapatır");






    }
}
