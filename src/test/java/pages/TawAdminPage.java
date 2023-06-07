package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

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


    //AdminPage >>> SolPanelList >>> Packages >>> AddNewPackagesPage >>> DescriptionTextBox
    @FindBy(xpath = "//*[@id=\"content\"]/div/form/div/div[2]/div[4]/div/div[3]/div[2]")
    public  WebElement packagesDescriptionTextBox;

    //AdminPage >>> SolPanelList >>> Packages >>> AddNewPackagesPage >>> Onay
    @FindBy(xpath = "//div[@class='toast toast-success']")
    public WebElement newPackagesOnay;

    //AdminPage >>> SolPanelList >>> Packages >>> EditButton
    @FindBy(xpath = "//*[@class='btn btn-warning btn-sm']")
    public WebElement packageEditButton;

    //AdminPage >>> SolPanelList >>> Packages >>> SearchBox
    @FindBy(xpath = "//input[@type='search']")
    public WebElement packagesSearchBox;

    //AdminPage >>> SolPanelList >>> Packages >>> EditPackagesPage >>> DescriptionTextBox
    @FindBy(xpath = "//*[@id=\"content\"]/div/form/div/div[2]/div[5]/div/div[3]/div[2]")
    public  WebElement packagesEditDescriptionTextBox;

    //AdminPage >>> SolPanelList >>> Packages >>> DeleteButonu
    @FindBy(xpath = "//*[@id=\"dataTable\"]/tbody/tr/td[7]/a[2]")
    public WebElement packageDeleteButton;


}
