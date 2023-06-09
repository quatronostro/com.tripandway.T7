package tests.mesut_US_009_010_015_025_029;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TawAdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_029 {

    /*
        Admin girişi yaptıktan sonra Blog Section bölümüne Blog kısmına
        yeni blog yazısı ekleyip eklediğim blog yazısının düzenlenebildiğini
        ve silinebildiğini sırayla doğrulayabilmeliyim
     */

    TawAdminPage tawAdminPage;

    @Test
    public void TC_01() {
        tawAdminPage = new TawAdminPage();
        //1. Webdriver çalıştırılarak "https://qa.tripandway.com/admin" sayfasına gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tawAdminUrl"));
        // 2- Admin kullanıcı bilgileri girilir ve login olunur
        TawAdminPage.tawAdminAccountGiris();
        // 3- Blog Section bölümüne tıklanır ve açılan menüde Blogs linkine tıklanır
        tawAdminPage.blogSectionMenu.click();
        tawAdminPage.blogsElement.click();
        // 4- Blogs sayfasında Add New butonuna tıklanır
        tawAdminPage.blogsAddNewButton.click();
        // 5- Eklenecek blog bilgileri ilgli alanlara girilir
        String herkesteFarkliOlan = System.getProperty("user.dir");
        String herkesteAyniOlan = "/src/test/java/utilities/filesForUpload/board-361516_640.jpg";
        String dosyaYolu= herkesteFarkliOlan+herkesteAyniOlan;
        tawAdminPage.blogChooseFileButton.sendKeys(dosyaYolu);
        Actions actions = new Actions(Driver.getDriver());
        actions.click(tawAdminPage.addBlogNameTextBox)
                .sendKeys(ConfigReader.getProperty("addBlogNameTextBox"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("addBlogSlugTextBox"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("addBlogContentTextBox"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("addShortContentTextBox"))
                .sendKeys(Keys.TAB) // Dosya yüklemeyi önden yaptığımız için tab diyerek geçiyoruz
                .sendKeys(Keys.TAB) // Category istedğimiz seçenekte.Dilernirse Keys.ARROW_DOWN ile değiştirilebilir
                .sendKeys(Keys.TAB) // Show Comment seçenekte.Dilernirse Keys.ARROW_DOWN ile değiştirilebilir
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("addSeoInformationTitleTextBox"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("addSeoInformationMetaDescriptionTextBox")).perform();
                //.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform(); // Submit butonuna basıyoruz
        // 6- Submit butonuna basılır
        tawAdminPage.blogAddSubmitButton.click();
        ReusableMethods.wait(2);
        // 7- Blog sayfasının başarı ile kaydedildiği mesajının görünürlüğü doğrulanmalıdır
        Assert.assertTrue(tawAdminPage.newBlogAddSuccessfulyMessage.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void test02(){

        tawAdminPage = new TawAdminPage();
        //1. Webdriver çalıştırılarak "https://qa.tripandway.com/admin" sayfasına gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tawAdminUrl"));
        // 2- Admin kullanıcı bilgileri girilir ve login olunur
        TawAdminPage.tawAdminAccountGiris();
        // 3- Blog Section bölümüne tıklanır ve açılan menüde Blogs linkine tıklanır
        tawAdminPage.blogSectionMenu.click();
        tawAdminPage.blogsElement.click();
        // 4- Search Textbox'a düzenlenecek blog adı yazılır
        tawAdminPage.blogsSearchTextBox.sendKeys(ConfigReader.getProperty("addBlogNameTextBox"));
        ReusableMethods.wait(1);
        // 5- Düzenlenecek Blog'un  Edit butonuna tıklanır
        tawAdminPage.packageEditButton.click();
        Assert.assertTrue(tawAdminPage.blogEditPageViewTitle.isDisplayed());
        // 6- Düzenlenecek blog bilgileri ilgli alanlara girilir
        String herkesteFarkliOlan = System.getProperty("user.dir");
        String herkesteAyniOlan = "/src/test/java/utilities/filesForUpload/board-361516_640 - Copy.jpg";
        String dosyaYolu= herkesteFarkliOlan+herkesteAyniOlan;
        tawAdminPage.blogChooseFileButton.sendKeys(dosyaYolu);
        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.wait(1);
        actions.click(tawAdminPage.addBlogNameTextBox)
                .keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
                .sendKeys(ConfigReader.getProperty("editBlogNameTextBox"))
                .sendKeys(Keys.TAB)
                .keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
                .sendKeys(ConfigReader.getProperty("editBlogSlugTextBox"))
                .sendKeys(Keys.TAB)
                .keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
                .sendKeys(ConfigReader.getProperty("editBlogContentTextBox"))
                .sendKeys(Keys.TAB)
                .keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
                .sendKeys(ConfigReader.getProperty("editShortContentTextBox"))
                .sendKeys(Keys.TAB) // Dosya yüklemeyi önden yaptığımız için tab diyerek geçiyoruz
                .sendKeys(Keys.TAB) // Category istedğimiz seçenekte.Dilernirse Keys.ARROW_DOWN ile değiştirilebilir
                .sendKeys(Keys.TAB) // Show Comment seçenekte.Dilernirse Keys.ARROW_DOWN ile değiştirilebilir
                .sendKeys(Keys.TAB)
                .keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
                .sendKeys(ConfigReader.getProperty("editSeoInformationTitleTextBox"))
                .sendKeys(Keys.TAB)
                .keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
                .sendKeys(ConfigReader.getProperty("editSeoInformationMetaDescriptionTextBox")).perform();
        ReusableMethods.wait(1);
        //.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform(); // Submit butonuna basıyoruz

        // 7- Submit butonuna basılır
        tawAdminPage.blogAddSubmitButton.click();
        ReusableMethods.wait(1);
        // 8- Blog sayfasının başarı ile kaydedildiği mesajının görünürlüğü doğrulanmalıdır
        Assert.assertTrue(tawAdminPage.newBlogAddSuccessfulyMessage.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void test03(){

        tawAdminPage = new TawAdminPage();
        //1. Webdriver çalıştırılarak "https://qa.tripandway.com/admin" sayfasına gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tawAdminUrl"));
        // 2- Admin kullanıcı bilgileri girilir ve login olunur
        TawAdminPage.tawAdminAccountGiris();
        // 3- Blog Section bölümüne tıklanır ve açılan menüde Blogs linkine tıklanır
        tawAdminPage.blogSectionMenu.click();
        tawAdminPage.blogsElement.click();
        // 4- Search Textbox'a düzenlenecek blog adı yazılır
        tawAdminPage.blogsSearchTextBox.sendKeys(ConfigReader.getProperty("editBlogNameTextBox"));
        ReusableMethods.wait(1);
        // 5- Silinecek blog'un Delete butonuna tıklanır
        tawAdminPage.blogDeleteButton.click();
        // 6- Çıkan uyarı mesajında Tamam butonuna basılır
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
        // 7- Blog sayfasının başarı ile silindiği mesajının görünürlüğü doğrulanır
        Assert.assertTrue(tawAdminPage.newPackagesOnay.isDisplayed());

        Driver.closeDriver();
    }
}