package pages;

import org.openqa.selenium.WebElement;
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
    @FindBy(xpath = "//*[@*='p_photo']")
    public  WebElement packagesChooseFileButton;



}
