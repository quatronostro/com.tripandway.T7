package tests.demoTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.TawUserDashboard;
import pages.TawUserHomePage;
import utilities.*;

public class T01_E2E_UserStory extends TestBaseReport {

    @Test
    public void TC_01(){
        TawUserDashboard tawUserDashboard = new TawUserDashboard();
        TawUserHomePage tawUserHomePage = new TawUserHomePage();

        //Kullanıcı kendi bilgileri ile hesabına giriş yapar
        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));

        TawUserDashboard.tawUserAccountLogin();

        //Packages sayfasına gider
        tawUserDashboard.headerPackagesButton.click();

        //Herhangi bir package'ı seçer
        tawUserDashboard.somePackageButton.click();

        //Package bilgilerinin olduğu sayfada "Book Your Seat" butonuna tıklar
        tawUserDashboard.packagesBookYourSeatButton.click();

        //Booking Detail sayfasında "Pay with Card" butonuna tıklar
        ReusableMethods.wait(2);
        JSUtilities.clickWithJS(Driver.getDriver(), tawUserDashboard.packagesPaymentPayWithCardButton);
        ReusableMethods.wait(2);

        //Kart bilgilerini girip ödeme butonuna basar
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

        //Ödeme işleminin ardından User Dashboard'a gider
        tawUserHomePage.dashboardElement.click();

        //Payment history kısmında ilgili ödemesini gördüğünü doğrularü
        tawUserDashboard.paymetHistorysElement.click();



    }
}
