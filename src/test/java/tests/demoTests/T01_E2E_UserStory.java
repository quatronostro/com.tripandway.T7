package tests.demoTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TawUserDashboard;
import pages.TawUserHomePage;
import utilities.*;

public class T01_E2E_UserStory extends TestBaseReport {


    @Test
    public void TC_01(){
        extentTest= extentReports.createTest("TripAndWay E2E Test User Story",
                "Bir kullanıcı olarak login olduktan sonra herhangi package seçip ödeme yapabildiğini doğrulayabilmeli");
        TawUserDashboard tawUserDashboard = new TawUserDashboard();
        TawUserHomePage tawUserHomePage = new TawUserHomePage();

        //Kullanıcı kendi bilgileri ile hesabına giriş yapar
        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));
        extentTest.info("Kullanici TripAndWay anasayfasına gider");
        ReusableMethods.wait(2);

        tawUserDashboard.userLoginButton.click();
        extentTest.info("Login Buton'a tıklar");
        ReusableMethods.wait(2);
        TawUserDashboard.tawUserAccountLogin();
        extentTest.info("Kendi bilgilerini girerek hesabına giriş yapar");
        ReusableMethods.wait(2);
        //Packages sayfasına gider
        tawUserDashboard.headerPackagesButton.click();
        extentTest.info("Header'da bulunan Packages butonuna tıklar");
        ReusableMethods.wait(2);

        //Herhangi bir package'ı seçer
        tawUserDashboard.somePackageButton.click();
        extentTest.info("Açılan sayfada bir package seçer");
        ReusableMethods.wait(2);

        //Package bilgilerinin olduğu sayfada "Book Your Seat" butonuna tıklar
        tawUserDashboard.packagesBookYourSeatButton.click();
        extentTest.info("Book Your Seat butonuna tıklar");
        ReusableMethods.wait(2);

        //Booking Detail sayfasında "Pay with Card" butonuna tıklar
        ReusableMethods.wait(2);
        JSUtilities.clickWithJS(Driver.getDriver(), tawUserDashboard.packagesPaymentPayWithCardButton);
        extentTest.info("Pay with Card butonuna tıklar");
        ReusableMethods.wait(2);

        //Kart bilgilerini girip ödeme butonuna basar
        WebElement iframeElement = Driver.getDriver().findElement(By.xpath("/html/body/iframe"));
        Driver.getDriver().switchTo().frame(iframeElement);
        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.wait(2);
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        String creditCardNumber = "4242 4242 4242 4242"; // Tam kredi kartı numarası
        String script = "arguments[0].value='" + creditCardNumber + "';";
        executor.executeScript(script, tawUserDashboard.cardNumberBox);
        actions.sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("creditCardExpNumber"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("creditCardCvcNumber"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();
        extentTest.info("Kart bilgilerini girerek ödemeyi gerçekleştirir.");

        Driver.getDriver().switchTo().defaultContent();
        Assert.assertTrue(tawUserHomePage.alertOnay.isDisplayed());
        extentTest.info("Ödemenin onaylandığını Alert ile onaylar");

        ReusableMethods.wait(3);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.wait(2);
        //Ödeme işleminin ardından User Dashboard'a gider
        tawUserHomePage.dashboardElement.click();
        extentTest.info("User Dashboard sayfasına gider");
        ReusableMethods.wait(3);
        //Payment history kısmında ilgili ödemesini gördüğünü doğrularü
        tawUserDashboard.paymetHistorysElement.click();
        extentTest.info("Payment History sekmesine tıklar");
        ReusableMethods.wait(3);
        Assert.assertTrue(tawUserDashboard.paymentDashboardTableFirstRow.isDisplayed());
        extentTest.info("Açılan listede satın aldığı package'ı görüntüler");

        tawUserHomePage.loginPageLogoutButton.click();
        extentTest.info("Hesabından çıkış yapar.");

        ReusableMethods.wait(3);
        Driver.closeDriver();



    }
}
