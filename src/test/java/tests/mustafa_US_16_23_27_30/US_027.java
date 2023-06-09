package tests.mustafa_US_16_23_27_30;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TawAdminPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_027 {
    TawAdminPage tawAdminPage;

    @Test
    public void Test01(){

        tawAdminPage = new TawAdminPage();
        Actions actions = new Actions(Driver.getDriver());
        SoftAssert softAssert = new SoftAssert();

        //1.Webdriver çalıştırılarak https://www.tripandway.com/qa/admin/login sayfasına gidilir. Kullanıcı bilgileri ile giriş yapılır.
        Driver.getDriver().get(ConfigReader.getProperty("tawAdminUrl"));

        TawAdminPage.tawAdminAccountGiris();

        //2.Admin paneldeki Genereal Settings linkinin görünürlüğü doğrulanır.
        softAssert.assertTrue(tawAdminPage.destinationsGeneralSettingLink.isDisplayed(),"General Setting linki görünmüyor !");

        //3.Admin paneldeki Genereal Settings linkine tıklanır.
        tawAdminPage.destinationsGeneralSettingLink.click();

        //4.Açılan sayfanın General Settings sayfası olduğu doğrulanır.
        softAssert.assertTrue(tawAdminPage.destinationsGenSetPage.isDisplayed(),"General Settings sayfasına ulaşılmıyor !");

        softAssert.assertAll();

        Driver.closeDriver();

    }


    @Test
    public void Test02(){
        tawAdminPage = new TawAdminPage();
        Actions actions = new Actions(Driver.getDriver());
        SoftAssert softAssert = new SoftAssert();

        //1.Webdriver çalıştırılarak https://www.tripandway.com/qa/admin/login sayfasına gidilir. Kullanıcı bilgileri ile giriş yapılır.
        Driver.getDriver().get(ConfigReader.getProperty("tawAdminUrl"));

        TawAdminPage.tawAdminAccountGiris();

        //2.Admin paneldeki Page Settings linkinin görünürlüğü doğrulanır.
        softAssert.assertTrue(tawAdminPage.destinationsPageSettingLink.isDisplayed(),"General Setting linki görünmüyor !");

        //3.Admin paneldeki Page Settings linkine tıklanır.
        tawAdminPage.destinationsPageSettingLink.click();

        //4.Açılan sayfanın Page Settings sayfası olduğu doğrulanır.
        softAssert.assertTrue(tawAdminPage.destinationsPageSetPage.isDisplayed(),"General Settings sayfasına ulaşılmıyor !");

        softAssert.assertAll();

        Driver.closeDriver();
    }


    @Test
    public void Test03(){
        tawAdminPage = new TawAdminPage();
        Actions actions = new Actions(Driver.getDriver());
        SoftAssert softAssert = new SoftAssert();

        //1.Webdriver çalıştırılarak https://www.tripandway.com/qa/admin/login sayfasına gidilir. Kullanıcı bilgileri ile giriş yapılır.
        Driver.getDriver().get(ConfigReader.getProperty("tawAdminUrl"));

        TawAdminPage.tawAdminAccountGiris();

        //2.Admin paneldeki Payment Settings linkinin görünürlüğü doğrulanır.
        softAssert.assertTrue(tawAdminPage.destinationsGeneralSettingLink.isDisplayed(),"Payment Settings linki görünmüyor !");

        //3.Admin paneldeki Payment Settings linkine tıklanır.
        tawAdminPage.destinationsGeneralSettingLink.click();

        //4.Açılan sayfanın Payment Settings sayfası olduğu doğrulanır.
        softAssert.assertTrue(tawAdminPage.destinationsGenSetPage.isDisplayed(),"Payment Settings sayfasına ulaşılmıyor !");

        softAssert.assertAll();

        Driver.closeDriver();
    }


    @Test
    public void Test04(){
        tawAdminPage = new TawAdminPage();
        Actions actions = new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("tawAdminUrl"));
        SoftAssert softAssert = new SoftAssert();

        TawAdminPage.tawAdminAccountGiris();

        //1.Webdriver çalıştırılarak https://www.tripandway.com/qa/admin/login sayfasına gidilir. Kullanıcı bilgileri ile giriş yapılır.

        //2.Admin paneldeki Dynamic Pages linkinin görünürlüğü doğrulanır.
        softAssert.assertTrue(tawAdminPage.destinationsDynamicPageLink.isDisplayed(),"Dynamic Pages linki görünmüyor !");

        //3.Admin paneldeki Dynamic Pages linkine tıklanır.
        tawAdminPage.destinationsDynamicPageLink.click();

        //4.Açılan sayfanın Dynamic Pages sayfası olduğu doğrulanır.
        String ecpectedContain ="dynamic-page";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(ecpectedContain),"Dynamic Pages sayfasına ulaşılmıyor !");

        softAssert.assertAll();

        Driver.closeDriver();
    }


    @Test
    public void Test05(){
        tawAdminPage = new TawAdminPage();
        Actions actions = new Actions(Driver.getDriver());
        SoftAssert softAssert = new SoftAssert();

        //1.Webdriver çalıştırılarak https://www.tripandway.com/qa/admin/login sayfasına gidilir. Kullanıcı bilgileri ile giriş yapılır.
        Driver.getDriver().get(ConfigReader.getProperty("tawAdminUrl"));

        TawAdminPage.tawAdminAccountGiris();

        //2.Admin paneldeki Language linkinin görünürlüğü doğrulanır.
        softAssert.assertTrue(tawAdminPage.destinationsLanguagePageLink.isDisplayed(),"Language linki görünmüyor !");

        //3.Admin paneldeki Language linkine tıklanır.
        tawAdminPage.destinationsLanguagePageLink.click();

        //4.Açılan sayfanın Language sayfası olduğu doğrulanır.
        String ecpectedContain ="language";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(ecpectedContain),"Language Pages sayfasına ulaşılmıyor !");
        softAssert.assertAll();

        Driver.closeDriver();
    }


    @Test
    public void Test06(){
        tawAdminPage = new TawAdminPage();
        Actions actions = new Actions(Driver.getDriver());
        SoftAssert softAssert = new SoftAssert();

        //1.Webdriver çalıştırılarak https://www.tripandway.com/qa/admin/login sayfasına gidilir. Kullanıcı bilgileri ile giriş yapılır.
        Driver.getDriver().get(ConfigReader.getProperty("tawAdminUrl"));

        TawAdminPage.tawAdminAccountGiris();

        //2.Admin paneldeki Web Site Section linkinin görünürlüğü doğrulanır.
        softAssert.assertTrue(tawAdminPage.destinationsWebSitSectionLink.isDisplayed(),"Web Site Section linki görünmüyor !");

        //3.Admin paneldeki Web Site Section linkine tıklanır.
        tawAdminPage.destinationsWebSitSectionLink.click();

        //4.Açılan sayfanın Web Site Section sayfası olduğu doğrulanır.
        softAssert.assertTrue(tawAdminPage.destinationsWebSitSecPage.isDisplayed(),"Web Site Section sayfasına ulaşılmıyor !");

        softAssert.assertAll();

        Driver.closeDriver();
    }


    @Test
    public void Test07(){
        tawAdminPage = new TawAdminPage();
        Actions actions = new Actions(Driver.getDriver());
        SoftAssert softAssert = new SoftAssert();

        //1.Webdriver çalıştırılarak https://www.tripandway.com/qa/admin/login sayfasına gidilir. Kullanıcı bilgileri ile giriş yapılır.
        Driver.getDriver().get(ConfigReader.getProperty("tawAdminUrl"));

        TawAdminPage.tawAdminAccountGiris();

        //2.Admin paneldeki Email Template linkinin görünürlüğü doğrulanır.
        softAssert.assertTrue(tawAdminPage.destinationsEmailTempLink.isDisplayed(),"Email Template linki görünmüyor !");

        //3.Admin paneldeki Email Template linkine tıklanır.
        tawAdminPage.destinationsEmailTempLink.click();

        //4.Açılan sayfanın Email Template sayfası olduğu doğrulanır.
        String ecpectedContain ="email-template";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(ecpectedContain),"Email Template sayfasına ulaşılmıyor !");

        softAssert.assertAll();

        Driver.closeDriver();
    }

}
