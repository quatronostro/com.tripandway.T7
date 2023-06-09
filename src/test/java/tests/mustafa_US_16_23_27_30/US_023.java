package tests.mustafa_US_16_23_27_30;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TawUserHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_023 {
    TawUserHomePage tawUserHomePage;

    @Test
    public void Test01() {

        tawUserHomePage = new TawUserHomePage();
        Actions actions = new Actions(Driver.getDriver());

        //1.Webdriver çalıştırılarak https://www.tripandway.com/qa/ sayfasına gidilir ve login linki tıklanarak kullanıcı girişi yapılır.
        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));

        tawUserHomePage.homePageLoginLink.click();

        TawUserHomePage.tawHomePageAccountGiris();

        //2.Logout butonunun görünür olduğu doğrulanır.
        Assert.assertTrue(tawUserHomePage.loginPageLogoutButton.isDisplayed());

        //3.Logout butonu tıklanır.
        tawUserHomePage.loginPageLogoutButton.click();

        //4.Açılan yeni sayfanın "Dashboard" sayfası olmadığı, login sayfası olduğu doğrulanır.
        String ecpectedContain ="login";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(ecpectedContain),"Login sayfasında degilsiniz !");


        //5.Açılan sayfada Login butonunun aktif olduğu doğrulanır.
        Assert.assertTrue(tawUserHomePage.homePageLoginButton.isDisplayed());

        Driver.closeDriver();
    }
}
//m.taskiran1@outlook.com
// Mt7123489