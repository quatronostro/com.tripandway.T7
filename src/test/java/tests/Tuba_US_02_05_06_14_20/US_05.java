package tests.Tuba_US_02_05_06_14_20;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TawUserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US_05 {
    TawUserHomePage tawUserHomePage;
    @Test
    public void TC_01(){

        tawUserHomePage=new TawUserHomePage();

    //1) https://ga.tripandway.com adresine gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tawUrl"));

    //2) Sitenin footer kısmındaki Latest Packages bölümünün öğelerinin görüntülenebilir ve aktif oldukları doğrulanır
        JSUtilities.scrollToElement(Driver.getDriver(), tawUserHomePage.latestPacageTest);
        ReusableMethods.wait(2);
        Assert.assertTrue(tawUserHomePage.latestPacageTest.isDisplayed());

        Assert.assertTrue(tawUserHomePage.latestPacagesBirinciElement.isDisplayed());
        Assert.assertTrue(tawUserHomePage.latestPacagesBirinciElement.isEnabled());

        Assert.assertTrue(tawUserHomePage.latestPacagesIkinciElement.isDisplayed());
        Assert.assertTrue(tawUserHomePage.latestPacagesIkinciElement.isEnabled());

        Assert.assertTrue(tawUserHomePage.latestPacagesUcuncuElement.isDisplayed());
        Assert.assertTrue(tawUserHomePage.latestPacagesUcuncuElement.isEnabled());

        Assert.assertTrue(tawUserHomePage.latestPacagesDorduncuElement.isDisplayed());
        Assert.assertTrue(tawUserHomePage.latestPacagesDorduncuElement.isEnabled());

        Assert.assertTrue(tawUserHomePage.latestPacagesBesinciElement.isDisplayed());
        Assert.assertTrue(tawUserHomePage.latestPacagesBesinciElement.isEnabled());


        Driver.closeDriver();



    }










}
