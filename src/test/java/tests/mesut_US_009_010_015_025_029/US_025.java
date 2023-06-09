package tests.mesut_US_009_010_015_025_029;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TawUserDashboard;
import pages.TawUserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_025 {
    /*
        Package ödemesi tamamlandıktan sonra kullanıcı sayfasında
         payment historyden ödememi kontrol edebildiğimi doğrulayabilmeliyim
     */
    TawUserDashboard tawUserDashboard;
    TawUserHomePage tawUserHomePage;
    private JavascriptExecutor jsExecutor;

    String expectedPackageTitle = null;
    String actualPackageTitle = null;
    String expectedTotalPaid = null;
    String actualTotalPaid = null;

    @Test
    public void tc_01() {
        // 1- http://qa.tripandway.com sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));
        tawUserDashboard = new TawUserDashboard();
        tawUserHomePage = new TawUserHomePage();
        ReusableMethods.wait(1);
        tawUserHomePage.websiteUsesCookiesButton.click();
        // 2- Kullanıcı login olmamış ise login olmalıdır
        tawUserHomePage.userLoginElement.click();
        // Girilecek textbox ve button elemenlerinin gözükmesi için sayfa belirli konuma gelir
        jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("window.scrollTo(0, 2000);");
        // User kullanıcı adı ve şifre girilerek login butonuna basılır
        tawUserHomePage.tawUserAccountLogin();

        // 3- Package Sayfasına gidilir ve bir paket 7 Days Istanbul paketine tıklanır
        tawUserHomePage.packageElement.click();
        jsExecutor.executeScript("window.scrollTo(0, 500);");
        ReusableMethods.wait(1);
        tawUserHomePage.istanbulIn7DaysPackageElement.click();

        // 4- Istanbul paketinde kisi sayisi belirienir ve BookYourSeatButton butonuna tiklanir
        jsExecutor.executeScript("window.scrollTo(0, 500);");
        WebElement dropdownMenuElementi = Driver.getDriver().findElement(By.xpath("//*[@id='numberPerson']"));
        Select select = new Select(dropdownMenuElementi);
        ReusableMethods.wait(1);
        select.selectByValue("3");
        tawUserHomePage.paymentBookYourSeatButton.click();

        // 5- Tur adı ve fiyat bilgisinin değerleri okunur ve kredi kart ödeme butonuna basilir
        ReusableMethods.wait(1);
        jsExecutor.executeScript("window.scrollTo(0, 500);");
        // Tur paket adı ismi okunur
        expectedPackageTitle = tawUserHomePage.bookinDetailPackageName.getText();
        System.out.println(expectedPackageTitle);
        // Tur Toplam fiyat bilgisi okunur
        expectedTotalPaid = tawUserHomePage.bookingDetailTotalPaidUsd.getText();
        System.out.println(expectedTotalPaid);
        jsExecutor.executeScript("window.scrollTo(0, 500);");
        ReusableMethods.wait(1);
        // 6- Kart ile ödeme işlemi gerçeşetirmek için butona basılır
        tawUserHomePage.payWithCardButton.click();

        // 7- Kart bilgileri girilir ve Pay butonuna basilir
        ReusableMethods.wait(1);
        Actions actions = new Actions(Driver.getDriver());
        // Kart bilgilerini girmek için Iframe'e geçiş yapmak gerekiyor.
        WebElement frameElementi = Driver.getDriver().findElement(By.name("stripe_checkout_app"));
        Driver.getDriver().switchTo().frame(frameElementi);
        String creditCardNumber = "4242 4242 4242 4242"; // Tam kredi kartı numarası
        String script = "arguments[0].value='" + creditCardNumber + "';";
        ((JavascriptExecutor) Driver.getDriver()).executeScript(script, tawUserHomePage.creditCardNumber);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(ConfigReader.getProperty("creditCardExpNumber")).sendKeys(Keys.TAB).perform();
        actions.sendKeys(ConfigReader.getProperty("creditCardCvcNumber")).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Driver.getDriver().switchTo().defaultContent(); // Iframe' den cikis
        ReusableMethods.wait(5);
        Assert.assertTrue(tawUserHomePage.paymentSuccesfulMesssage.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void tc_02() {

        // 1- http://qa.tripandway.com sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));
        tawUserDashboard = new TawUserDashboard();
        tawUserHomePage = new TawUserHomePage();
        ReusableMethods.wait(1);
        tawUserHomePage.websiteUsesCookiesButton.click();
        // 2- Kullanıcı login olmamış ise login olmalıdır
        tawUserHomePage.userLoginElement.click();
        // Girilecek textbox ve button elemenlerinin gözükmesi için sayfa belirli konuma gelir
        jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("window.scrollTo(0, 2000);");
        // User kullanıcı adı ve şifre girilerek login butonuna basılır
        tawUserHomePage.tawUserAccountLogin();
        // 3- Dashboard sayfasında, "Payment History" linki olduğu doğrulanmalı ve tıklanmalıdır
        Assert.assertTrue(tawUserDashboard.paymetHistorysElement.isDisplayed());
        tawUserDashboard.paymetHistorysElement.click();
        // 4- View All Payments bölümünün açıldığı görülmelidir.
        ReusableMethods.wait(2);
        Assert.assertTrue(tawUserDashboard.viewAllPaymenstTitle.isDisplayed());
        //List<WebElement> satirElementleriList = Driver.getDriver().findElements(By.xpath("//tbody/tr[2]"));

        // 5- Packaged Title isminin satın alına form bilgileri ile
        // payment history tablosundaki bilgiler ile eşleşmesi kontrol ediliyor
        System.out.println("============================");
        ReusableMethods.wait(2);
        actualPackageTitle = tawUserDashboard.paymentHistoryPagePackageName.getText();
        Assert.assertTrue(actualPackageTitle.contains(expectedPackageTitle));
        System.out.println(expectedPackageTitle + " ---Expected Package Title");
        System.out.println(actualPackageTitle + " ---Actual Package Title");

        // Package ismi eşlesiyorsa Action butonuna basarak Order Detail sayfasında bulunan
        // Toplam fiyat bilgisinin eşlemesi ve ödeme bilgisinin Complate olduğu doğrulanıyor
        tawUserDashboard.viewAllPaymentsActionButton.click();
        ReusableMethods.wait(1);
        jsExecutor.executeScript("window.scrollTo(0, 200);");
        //List<WebElement> orderDetailList = Driver.getDriver().findElements(By.xpath("//tbody/tr/td[2]"));
        actualTotalPaid = tawUserDashboard.orderDetailPaidAmountElement.getText();
        System.out.println(expectedTotalPaid + " ---Expected Total paid");
        System.out.println(actualTotalPaid + " --- Actual Total paid");
        String expectedPaymentStatus = "Completed";
        String actualPaymentsStatus = tawUserDashboard.orderDetailPaymentStatusElement.getText();
        Assert.assertEquals(actualTotalPaid,expectedTotalPaid);
        Assert.assertEquals(actualPaymentsStatus,expectedPaymentStatus);
        System.out.println(expectedPaymentStatus + " ---Expected Payment Status");
        System.out.println(actualPaymentsStatus + " ---Actual Payment Status");
        Driver.quitDriver();
    }
}