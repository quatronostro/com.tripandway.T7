package tests.mustafa_US_16_23_27_30;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TawAdminPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class US_30 {
    TawAdminPage tawAdminPage;

    @Test(priority = 1)
    public void test01() {
        tawAdminPage = new TawAdminPage();

        //1. Webdriver çalıştırılarak  "https://qa.tripandway.com/admin"  sayfasına gidilir ve admin hesap bilgileri ile giriş yapılır
        Driver.getDriver().get(ConfigReader.getProperty("tawAdminUrl"));

        TawAdminPage.tawAdminAccountGiris();

        //2. Admin ana sayfasında sol panelde bulunan listede Destinations'a tıklanır
        tawAdminPage.destinationsButton.click();

        //3. Açılan sayfada "Add New" butonuna tıklanır.
        tawAdminPage.destinationsAddNewButton.click();

        // 4. Açılan sayfada ilgili tüm alanları doldurulur ve ardından sayfanın alt kısmında bulunan "Submit" butonuna tıklayanır.
        String fileWay = System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\filesForUpload\\board-361516_640.jpg";

        Actions actions = new Actions(Driver.getDriver());

        actions.click(tawAdminPage.destinationsNameBox)
                .sendKeys(ConfigReader.getProperty("newDestinationsName"))
                .sendKeys(Keys.TAB).sendKeys("Example slug")
                .sendKeys(Keys.TAB).sendKeys("Example  Heading")
                .sendKeys(Keys.TAB).sendKeys("Example  Description")
                .sendKeys(Keys.TAB).sendKeys("Example  Package Heading")
                .sendKeys(Keys.TAB).sendKeys("Example  Package Subheading")
                .sendKeys(Keys.TAB).sendKeys("Example  Detail Heading")
                .sendKeys(Keys.TAB).sendKeys("Example  Detail Subheading").perform();

        tawAdminPage.destinationsChooseFileButton.sendKeys(fileWay);

        actions.click(tawAdminPage.destinationsIntroductionBox)
                .sendKeys("Example Introduction")
                .sendKeys(Keys.TAB).sendKeys("Example Experience")
                .sendKeys(Keys.TAB).sendKeys("Example Weather")
                .sendKeys(Keys.TAB).sendKeys("Example Hotel")
                .sendKeys(Keys.TAB).sendKeys("Example Transportation")
                .sendKeys(Keys.TAB).sendKeys("Example Culture")
                .sendKeys(Keys.TAB).sendKeys("Example Title")
                .sendKeys(Keys.TAB).sendKeys("Example Meta Description").perform();

        actions.click(tawAdminPage.destinationsSubmitButton).perform();


        // 5."Destination added successfully" alertini görerek yapılan işlem doğrulanır.
        Assert.assertTrue(tawAdminPage.destinationsAddedSuccessfully.isDisplayed());

        Driver.closeDriver();
    }

    @Test(priority = 2)
    public void Test02() {
        tawAdminPage = new TawAdminPage();
        Actions actions = new Actions(Driver.getDriver());


        //1. Webdriver çalıştırılarak  "https://qa.tripandway.com/admin"  sayfasına gidilir ve admin hesap bilgileri ile giriş yapılır
        Driver.getDriver().get(ConfigReader.getProperty("tawAdminUrl"));

        TawAdminPage.tawAdminAccountGiris();

        //2- Admin paneldeki Destinations'a tıklanır.
        tawAdminPage.destinationsButton.click();

        //3. Daha önce eklenen destinations'un sağ tarafında bulunan "edit" butonu tıklanır.
        List<WebElement> list = tawAdminPage.bodyElement;
        for (WebElement each : list) {
            if (each.getText().contains(ConfigReader.getProperty("newDestinationsName"))) {
                WebElement edit = Driver.getDriver().findElement(RelativeLocator.with(By.tagName("i")).toRightOf(each));
                edit.click();
            }
        }

        //4. Açılan sayfada gerekli değişiklikller ve düzenlemeler yapılır.Sonrasında sayfanın alt kısmında bulunan "submit" butonuna tıklanır.

        String fileWay = System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\filesForUpload\\board-361516_640 - Copy.jpg";
        actions.click(tawAdminPage.destinationsEditNameBox)
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.SPACE)
                .sendKeys(ConfigReader.getProperty("editDestinationsName"))
                .sendKeys(Keys.TAB).sendKeys("Edit slug")
                .sendKeys(Keys.TAB).sendKeys("Edit  Heading")
                .sendKeys(Keys.TAB).sendKeys("Edit  Description")
                .sendKeys(Keys.TAB).sendKeys("Edit  Package Heading")
                .sendKeys(Keys.TAB).sendKeys("Edit  Package Subheading")
                .sendKeys(Keys.TAB).sendKeys("Edit  Detail Heading")
                .sendKeys(Keys.TAB).sendKeys("Edit  Detail Subheading").perform();
        tawAdminPage.destinationsChooseFileButton.sendKeys(fileWay);

        actions.click(tawAdminPage.destinationsIntroductionBox)
                .sendKeys("Edit Introduction").sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys("Edit Experience")
                .sendKeys(Keys.TAB).sendKeys("Edit Weather")
                .sendKeys(Keys.TAB).sendKeys("Edit Hotel")
                .sendKeys(Keys.TAB).sendKeys("Edit Transportation")
                .sendKeys(Keys.TAB).sendKeys("Edit Culture")
                .sendKeys(Keys.TAB).sendKeys("Edit Title")
                .sendKeys(Keys.TAB).sendKeys("Edit Meta Description")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

        //5. "destination is updated successfully" alertini görülerek yapılan işlem doğrulanır.
        Assert.assertTrue(tawAdminPage.destinationsEditSuccessfully.isDisplayed());

        Driver.closeDriver();

    }
}
