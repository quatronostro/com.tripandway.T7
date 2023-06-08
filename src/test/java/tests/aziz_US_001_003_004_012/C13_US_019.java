package tests.aziz_US_001_003_004_012;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TawUserHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class C13_US_019 {

    // Bir kullanici olarak siteye kaydoldugum email ve password
    // bilgilerimle login olabildiğimi ve site
    // anasayfasına gidebildiğimi doğrulayabilmeliyim

    @Test(priority = 1)
    public void us_019_tc_01(){
        // 1. browser'ı aç
        // 2. https://qa.tripandway.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));
        TawUserHomePage tawUserHomePage = new TawUserHomePage();
        Actions actions = new Actions(Driver.getDriver());

        // 4. Header kısmındaki login buttonuna tıkla
        tawUserHomePage.buttonHeaderLoginButtonu.click();

        // 5. kullanıcı adını ve şifreni gir username : "aziz.aziz@gmail.com" password : "Aziz123456789."
        tawUserHomePage.loginPageEmailAdressTextBox.sendKeys(ConfigReader.getProperty("loginEmail"));
        tawUserHomePage.loginPagePasswordTextBox.sendKeys(ConfigReader.getProperty("loginpass"));
        // 6. ikinci login buttonuna tıkla
        tawUserHomePage.buttonLoginPageLoginButtonu.click();

        // 7. giriş yatığını doğrulamak için "Dashboard" kısmının görünür ve erişilebilir olduğunu doğrula
        Assert.assertTrue(tawUserHomePage.buttonUserDashboardDashboardButtonu.isDisplayed());
        Assert.assertTrue(tawUserHomePage.buttonUserDashboardDashboardButtonu.isEnabled());

        // 8. header kısmındaki tripandway logosuna tıkla
        tawUserHomePage.logoUserDashboardTripAndWayLogosu.click();

        // 9. açılan sayfanın title'ının "Tripandway" olduğunu doğrula
        String expectedTitle = ConfigReader.getProperty("homePageTitle");
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

        Driver.quitDriver();
    }
}
