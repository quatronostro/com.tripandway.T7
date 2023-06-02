package tests.aziz_US_001_003_004_012;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TawUserHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_003_HomePageSlider {
    // US_003 >>> Bir ziyaretçi olarak Home page sayfasının body bölümündeki fonksiyonların
    // görünür ve aktif olduğunu görüntüleyebildiğimi doğrulayabilmeliyim

    @Test(priority = 1)
    public void us_003_tc_01(){
        // 1. browse'ı aç
        // 2. https://qa.tripandway.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));

        // 3.Slider kısmının görünür olduğunu doğrula

        TawUserHomePage tawUserHomePage = new TawUserHomePage();

        Assert.assertTrue(tawUserHomePage.slider.isDisplayed());

        Driver.quitDriver();
    }

    @Test(priority = 2)
    public void us_003_tc_02(){
        // 1. browser'ı aç
        // 2. https://qa.tripandway.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));

        // 3.Slider kısmının sağa kaydır ve sola kaydır buttonlarının görünür ve erişilebilir olduğunu doğrula
        TawUserHomePage tawUserHomePage = new TawUserHomePage();
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(tawUserHomePage.sliderSagaKaydirButton.isDisplayed());
        softAssert.assertTrue(tawUserHomePage.sliderSagaKaydirButton.isEnabled());
        softAssert.assertTrue(tawUserHomePage.sliderSolaKaydirButton.isDisplayed());
        softAssert.assertTrue(tawUserHomePage.sliderSolaKaydirButton.isEnabled());

        // 4.Slider kısmının alt tarafındaki radio buttonlarının görünür ve erişilebilir olduğunu doğrula

        for (WebElement each : tawUserHomePage.radioButtonSliderButunButtonlar){
            softAssert.assertTrue(each.isDisplayed());
            softAssert.assertTrue(each.isEnabled());
        }

        softAssert.assertAll();

        Driver.quitDriver();
    }

    @Test(priority = 3)
    public void us_003_tc_03(){
        // 1. browser'ı aç
        // 2. https://qa.tripandway.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));

        // 3.Slider kısmındaki ilk tanıtımın görünür olduğunu, başlık ve açıklama text'inin görünür olduğunu doğrula
        TawUserHomePage tawUserHomePage = new TawUserHomePage();

        Assert.assertTrue(tawUserHomePage.imageBackgroundSliderBirinciBackground.isDisplayed());
        Assert.assertTrue(tawUserHomePage.labelSliderBirinciTanitimBaslikTexti.isDisplayed());
        Assert.assertTrue(tawUserHomePage.labelSliderBirinciTanitimAciklamaTexti.isDisplayed());

        // 4.Slider kısmındaki ilk tanıtımın read more buttonunun görünür ve erişilebilir olduğunu doğrula

        Assert.assertTrue(tawUserHomePage.sliderIlkTanitimReadMoreButton.isDisplayed());
        Assert.assertTrue(tawUserHomePage.sliderIlkTanitimReadMoreButton.isEnabled());

        // 5. read more buttonuna tıklandığına gidilen sayfanın title'ının "3 days in Bangkok" olduğunu doğrula
        tawUserHomePage.sliderIlkTanitimReadMoreButton.click();
        String expectedTitle = ConfigReader.getProperty("3daysInBangkogPageTitle");
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

        Driver.quitDriver();
    }
}
