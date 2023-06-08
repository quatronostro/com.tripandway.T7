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

    //AdminPage >>> SolPanelList >>> Subscribers
    @FindBy(xpath = "//*[@data-target='#collapseSubscriber']")
    public WebElement subscribersButton;

    //AdminPage >>> SolPanelList >>> Subscribers >>> AllSubscribersButton
    @FindBy(xpath = "//*[@id=\"collapseSubscriber\"]/div/a[1]")
    public WebElement allSubscribersButton;

    //AdminPage >>> SolPanelList >>> Subscribers >>> AllSubscribers >>> SLButton
    @FindBy(className = "sorting_asc")
    public WebElement allSubscribersSLButton;

    //AdminPage >>> SolPanelList >>> Subscribers >>> AllSubscribers >>> TableİlkHücre
    @FindBy(xpath = "//*[@id=\"dataTable\"]/tbody/tr[1]/td[1]")
    public WebElement lastSubscriberNumber;

    //AdminPage >>> SolPanelList >>> Subscribers >>> AllSubscribers >>> Listenin en altındaki "Showing 1 to 10 of 173 entries" texti
    @FindBy(id = "dataTable_info")
    public WebElement dataTableInfoText;

    //AdminPage >>> SolPanelList >>> Subscribers >>> Send Email to Subscribers >>> SubjectBox
    @FindBy(xpath = "//*[@*='form-control']")
    public WebElement sendEmailToSubscribersSubjectBox;

    //AdminPage >>> SolPanelList >>> Subscribers >>> Send Email to Subscribers
    @FindBy(xpath = "//*[@id=\"collapseSubscriber\"]/div/a[2]")
    public WebElement sendEmailToSubscribersButton;

    //AdminPage >>> SolPanelList >>> OrderButton
    @FindBy(xpath = "//*[@id=\"accordionSidebar\"]/li[11]/a")
    public WebElement orderButton;

    //AdminPage >>> SolPanelList >>> OrderPage >>> SLButton
    @FindBy(className = "sorting_asc")
    public WebElement orderPageSLButton;

    //AdminPage >>> SolPanelList >>> OrderPage >>> TableİlkHücre
    @FindBy(xpath = "//*[@id=\"dataTable\"]/tbody/tr[1]/td[1]")
    public WebElement lastOrderNumber;

    //AdminPage >>> adminProfileDropDown
    @FindBy(id = "userDropdown")
    public WebElement dropDownAdminProfile;

    //AdminPage >>> adminProfileDropDownMenu
    @FindBy(xpath = "//*[@id=\"content\"]/nav/ul/li[2]/div")
    public WebElement dropDownMenuAdminProfile;

    //AdminPage >>> adminProfileDropDownMenu >>> changePasswordButton
    @FindBy(xpath = "//*[@id=\"content\"]/nav/ul/li[2]/div/a[1]")
    public WebElement changePasswordButton;

    //AdminPage >>> adminProfileDropDownMenu >>> changePhotoButton
    @FindBy(xpath = "//*[@id=\"content\"]/nav/ul/li[2]/div/a[2]")
    public WebElement changePhotoButton;

    // AdminPage >>> Blog Section Menu
    @FindBy(xpath = "//a[@aria-controls='collapseBlog']")
    public WebElement blogSectionMenu;

    // AdminPage  >>> Blog Seciton Menu >>> Blogs Elemneti
    @FindBy(xpath = "//a[text()=\'Blogs\']")
    public WebElement blogsElement;

    // AdminPage  >>> Blog Seciton Menu >>> Add New Button
    @FindBy(xpath = "//div[@class='container-fluid']/div/div/div/a")
    public WebElement blogsAddNewButton;

    // AdminPage  >>> Blog Seciton Menu >>> Search Textbox
    @FindBy(xpath = "//input[@type='search']")
    public WebElement blogsSearchTextBox;

    // AdminPage  >>> Blog Seciton Menu >>> Add New Button >>> Add Blog
    @FindBy(xpath = "//input[@name='blog_title']")
    public WebElement addBlogNameTextBox;

    @FindBy(xpath = "//input[@name='blog_slug']")
    public WebElement addBlugSlugTextbox;
    @FindBy(xpath = "//input[@name='blog_photo']")
    public WebElement blogChooseFileButton;

    @FindBy(xpath = "//h6[text()='Edit Blog']")
    public WebElement blogEditPageViewTitle;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement blogAddSubmitButton;

    @FindBy(xpath = "//div[@class='toast toast-success']")
    public WebElement newBlogAddSuccessfulyMessage;

    @FindBy(xpath = "//*[@id=\"dataTable\"]/tbody/tr/td[5]/a[1]")
    public WebElement blogEditButton;

    @FindBy(xpath = "//*[@id=\"dataTable\"]/tbody/tr/td[5]/a[2]")
    public WebElement blogDeleteButton;

    @FindBy(xpath = "//*[@class='btn btn-danger btn-sm']")
    public WebElement blogDeleteSuccessfulyMessage;





}
