package tests.akif_US_7_11_18_22_33;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.TestBaseReport;

public class US_011  extends TestBaseReport {

    //US_011>>>>>Bir ziyaretçi olarak  sitenin gizlilik politikaları sayfasının görüntüleyebildiğimi doğrulayabilmeliyim.


    @Test
    public void PrivayPolicyGoruntulemeTesti() throws InterruptedException {

        extentTest =extentReports.createTest("GizlilikPolitikasıTesti");



        //tripandway anasayfasına git.

        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));

        extentTest.info("Kullanıcı tripandway.com anasayfasına gider");



        //Privacy Policy bağlantısına tıkla

        WebElement privacyPolicy=Driver.getDriver().findElement(By.xpath("//a[text()='Privacy Policy']"));

        JSUtilities.scrollToElement(Driver.getDriver(),privacyPolicy);
        Thread.sleep(1000);
        JSUtilities.clickWithJS(Driver.getDriver(),privacyPolicy);

        extentTest.info("Privacy policy bağlantısına tıklayarak gizlilik politikaları sayfasını açar");




        //Başlığın Pravacy Policy olduğunu doğrula.

        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Privacy Policy";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle);

        extentTest.info("Açılan sayfanın Privacy Policy sayfası oldugunu doğrular");


        softAssert.assertAll();
        extentTest.pass("Soft assert ile yapılan testlerin sonucunu raporlar");



        //Driveri kapat.
        Driver.closeDriver();
        extentTest.info("sayfayı kapatır");





    }
}
