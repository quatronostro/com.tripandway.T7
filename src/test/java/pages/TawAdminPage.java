package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TawAdminPage {

    public TawAdminPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static TawAdminPage tawAdminPage;

     //AdminPage >>> SideBar >>> AccordionButton
    @FindBy(id = "accordionSidebar")
    public WebElement accordionButton;


    //AdminPage >>> Login  >>> AdminEmailBox
    @FindBy(xpath = "//*[@*='email']")
    public WebElement adminEmailBox;

    //AdminPage >>> Login  >>> AdminPasswordBox
    @FindBy(xpath = "//*[@*='password']")
    public WebElement adminPassBox;

    //AdminPage >>> Login  >>> AdminLoginSubmitButton
    @FindBy(xpath = "//*[@*='submit']")
    public WebElement adminLoginButton;

    //AdminPage >>> DashBoard >>> VisitWebsiteButton
    @FindBy(xpath = "//*[@id=\"content\"]/nav/ul/li[1]/a")
    public WebElement visitWebsiteButton;

    //AdminPage >>> Dashboard >>> SideBarToggleButton
    @FindBy(id = "sidebarToggle")
    public WebElement sideBarToggleButton;

    //AdminPage >>> Dashboard >>> SideBarToggledLocate
    @FindBy(xpath = "//*[@*='sidebar-toggled']")
    public WebElement sideBarToggledLocate;

    public static void tawAdminAccountGiris(){

        tawAdminPage = new TawAdminPage();

        tawAdminPage.adminEmailBox.sendKeys(ConfigReader.getProperty("adminEmail1"));
        tawAdminPage.adminPassBox.sendKeys(ConfigReader.getProperty("adminPass"));
        tawAdminPage.adminLoginButton.click();
    }

    //AdminPage >>> SolPanelList >>> PackagesButton
    @FindBy(xpath = "//*[@id=\"accordionSidebar\"]/li[7]/a/i")
    public WebElement packagesButton;

    //AdminPage >>> SolPanelList >>> Packages >>> AddNewButton
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[1]/div/a")
    public WebElement packagesAddNewButton;

    //AdminPage >>> SolPanelList >>> Packages >>> AddNewButton >>> PackagesNameBox
    @FindBy(xpath = "//*[@*='p_name']")
    public WebElement packagesNameBox;

    //AdminPage >>> SolPanelList >>> Packages >>> AddNewPackagesPage >>> ChooseFileButton
    @FindBy(xpath = "//input[@*='p_photo']")
    public  WebElement packagesChooseFileButton;


    //AdminPage >>> BlogSection
    @FindBy(xpath = "//span[text()='Blog Section']")
    public WebElement buttonBlogSectionButton;

    //AdminPage >>> BlogSection >>> categories
    @FindBy(xpath = "//a[text()='Categories']")
    public WebElement buttonBlogSectionCategoriesButton;

    //AdminPage >>> BlogSection >>> categories >>> add new Button
    @FindBy(xpath = "//div[@class='float-right d-inline']")
    public WebElement getButtonBlogSectionCatagoriesAddNewButton;

    //AdminPage >>> BlogSection >>> categories >>> add category >>> category name
    @FindBy(xpath = "//input[@name='category_name']")
    public WebElement blogSectionCategoryCategoryName;

    //AdminPage >>> BlogSection >>> categories >>> search textbox
    @FindBy(xpath = "(//input[@type='search'])")
    public WebElement blogSectionCategorySearchTextBox;

    //AdminPage >>> BlogSection >>> categories >>> category title
    @FindBy(xpath = "//tbody/tr/td[2]")
    public WebElement blogSectionCategoryCategoryTitle;

    //AdminPage >>> BlogSection >>> categories >>> edit button
    @FindBy(xpath = "//i[@class='fas fa-edit']")
    public WebElement blogSectionCategoryEditButton;

    //AdminPage >>> BlogSection >>> categories >>> edi >>> update button
    @FindBy(xpath = "//button[text()='Update']")
    public WebElement blogSectionCategoryEditUpdateButton;

    //AdminPage >>> BlogSection >>> categories >>> update alert
    @FindBy(xpath = "//div[text()='Category is updated successfully!']")
    public WebElement blogSectionCategoryUpdateAlert;

    //AdminPage >>> BlogSection >>> categories >>> delete button
    @FindBy(xpath = "//i[@class='fas fa-trash-alt']")
    public  WebElement buttonblogSectionCategoryDeleteButton;

    //AdminPage >>> BlogSection >>> categories >>> delete alert
    @FindBy(xpath = "//div[text()='Category is deleted successfully!']")
    public WebElement blogSectionCategoryDeleteAlert;

    //AdminPage >>> Order >>> order button
    @FindBy(xpath = "//span[text()='Order']")
    public WebElement buttonOrderOrderButtonu;

    //AdminPage >>> Order >>> Order page
    public WebElement orderPageRandomDetailButtonXpath(WebDriver driver){


        WebElement sonelement;
        while (true){
            Random rnd = new Random();
            int randomSayi= rnd.nextInt(11);

            if (randomSayi>0){
                WebElement element = driver.findElement(By.xpath("//tbody/tr["+randomSayi+"]/td[11]/a[1]"));
                sonelement=element;
                break;
            }
        }

        return sonelement;
    }

    //AdminPage >>> Order >>> order page >> order detail title
    @FindBy(xpath = "//h1[text()='Order Detail']")
    public WebElement labelOrderOrderDetailTitleText;

    //AdminPage >>> Order >>> order page >> order detail >>bütün Fatura sayfası
    @FindBy(xpath = "//div[@class='row']")
    public WebElement orderOrderDetailButunFatura;

    //AdminPage >>> Order >>> order page >> order detail >>bütün Fatura baslik textleri
    public List<String> orderPageAllFaturaTitleText(WebDriver driver){

        List<WebElement> butunTitlelar = driver.findElements(By.xpath("//tbody//tr"));

        List<String> list = new ArrayList<>();

        int sayi = 1;

        for (int i = 0; i < butunTitlelar.size(); i++) {
            list.add("//tbody//tr["+sayi+"]/td/b");
            sayi++;
        }
        return list;
    }

    //AdminPage >>> SolPanelList >>> Packages >>> AddNewPackagesPage >>> DescriptionTextBox
    @FindBy(xpath = "//*[@id=\"content\"]/div/form/div/div[2]/div[4]/div/div[3]/div[2]")
    public  WebElement packagesDescriptionTextBox;

    //AdminPage >>> SolPanelList >>> Packages >>> AddNewPackagesPage >>> Onay
    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement newPackagesOnay;

    //AdminPage >>> SolPanelList >>> Packages >>> Listede daha önceki test'ten oluşturulan package locate!
    @FindBy(xpath = "//*[text()='New Test Packages']")
    public WebElement packageLocate;

    //AdminPage >>> SolPanelList >>> Packages >>> EditButton
    @FindBy(xpath = "//*[@class='btn btn-warning btn-sm']")
    public WebElement packageEditButton;


}
