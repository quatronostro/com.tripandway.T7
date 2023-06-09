package tests.zehranur_US_013_021_024_041;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TawUserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US_021 {
    TawUserDashboard tawUserDashboard;

    @Test
    public void TC_01(){
        tawUserDashboard = new TawUserDashboard();
        //SoftAssert softAssert = new SoftAssert();

        //1. Webdriver çalıştırılarak "https://qa.tripandway.com/" sayfasına gidilir.
        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));

        //2. Home page sağ üst köşedeki Login'e tıklanır.
        tawUserDashboard.userLoginButton.click();

        //3. Üye bilgileri girilerek Login butonuna tıklanır.
        TawUserDashboard.tawUserAccountLogin();

        //4. Login olduktan sonra Traveller Dashboard sayfasının açıldığı doğrulanır.
        String expectedTitle = "Traveller Panel";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        //5. Soldaki panelde Payment History'ye tıklanır.
        tawUserDashboard.paymetHistorysElement.click();

        //6. Payment History Tıklandıktan sonra View All Payments texti ve
        // altındaki tabloda Serial Order No Price Currency Package Destination Payment Status Action bilgileri görülebilmelidir.
        ReusableMethods.wait(2);
        Assert.assertTrue(tawUserDashboard.viewAllPaymenstTitle.isDisplayed());

        Assert.assertTrue(tawUserDashboard.paymentDashboardTableFirstRow.isDisplayed());

        //softAssert.assertAll();

        Driver.closeDriver();

    }
}
