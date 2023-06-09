package tests.zehranur_US_013_021_024_041;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TawUserDashboard;
import pages.TawUserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US_024 {

    TawUserDashboard tawUserDashboard;
    TawUserHomePage tawUserHomePage;

    @Test
    public void TC_01(){

        tawUserDashboard = new TawUserDashboard();
        tawUserHomePage = new TawUserHomePage();

        //1. Webdriver çalıştırılarak "https://qa.tripandway.com/" sayfasına gidilir.
        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));

        //2. Home page sağ üst köşedeki Login'e tıklanır.
        tawUserDashboard.userLoginButton.click();

        //3. Üye bilgileri girilerek Login butonuna tıklanır.
        TawUserDashboard.tawUserAccountLogin();

        //4. Açılan sayfanın Traveller Dashboard sayfası olduğu doğrulanmalıdır.
        String expectedTitle = "Traveller Panel";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        //5. Login olduktan sonra açılan sayfada Header kısmındaki PACKAGES bağlantısı tıklanır.
        tawUserDashboard.headerPackagesButton.click();

        //6. PACKAGES bağlantısına tıklandıktan sonra açılan sayfanın Packages sayfası olduğu doğrulanır.
        expectedTitle = "Packages";
        actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        //7. Packages sayfasından herhangi bir package'a tıklanır.
        tawUserDashboard.somePackageButton.click();

        //8. Package'a erişildiğinde Tour Dates, Book Now, Total Price (per Person), Total Persons, Total Price textleri ve Package fiyatlarının görülebildiği doğrulanır.
        Assert.assertTrue(tawUserDashboard.packagesBodyText.isDisplayed());

        //9.Package'a erişildiğinde Book Your Seat butonun görülebilir ve tıklanabilir olduğu doğrulanır.
        Assert.assertTrue(tawUserDashboard.packagesBookYourSeatButton.isDisplayed() && tawUserDashboard.packagesBookYourSeatButton.isEnabled());

        //10. Book Your Seat butonu tıklanarak Payment sayfasına yönlendirildiği doğrulanır.
        tawUserDashboard.packagesBookYourSeatButton.click();

        expectedTitle = "Payment";
        actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        //11. Payment sayfasında Booking Detail, Make Payment ve Pay with Stripe textlerinin görülebilir olduğu doğrulanır.
        Assert.assertTrue(tawUserDashboard.packagesBodyText.isDisplayed());

        //12. Payment sayfasında Pay with Card butonunun görülebilir ve tıklanabilir olduğu doğrulanır.
        Assert.assertTrue(tawUserDashboard.packagesPaymentPayWithCardButton.isDisplayed() && tawUserDashboard.packagesPaymentPayWithCardButton.isEnabled());

        ReusableMethods.wait(2);
        JSUtilities.clickWithJS(Driver.getDriver(), tawUserDashboard.packagesPaymentPayWithCardButton);
        ReusableMethods.wait(2);
        //13. Pay with Card butonu tıklandığında ödeme penceresinin açılabildiği ve Card number, MM/YY, CVC bilgilerini girilir ve Pay $..,.. butonuna tıklanır
        WebElement iframeElement = Driver.getDriver().findElement(By.xpath("/html/body/iframe"));
        Driver.getDriver().switchTo().frame(iframeElement);
        Actions actions = new Actions(Driver.getDriver());

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


        Driver.getDriver().switchTo().defaultContent();
        //14. Ödemenin başarılı bir şekilde gerçekleştirildiği doğrulanır.

        Assert.assertTrue(tawUserHomePage.alertOnay.isDisplayed());

        Driver.closeDriver();


    }
}
