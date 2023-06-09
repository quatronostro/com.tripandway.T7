package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
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





    //AdminPage >>> adminProfileDropDownMenu >>>  logout button
    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    public WebElement buttonAdminPageAdminProfileLoguotButton;

//    // AdminPage >>> Blog Section Menu
//    @FindBy(xpath = "//a[@aria-controls='collapseBlog']")
//    public WebElement blogSectionMenu;
//
//    // AdminPage  >>> Blog Seciton Menu >>> Blogs Elemneti
//    @FindBy(xpath = "//a[text()=\'Blogs\']")
//    public WebElement blogsElement;
//
//    // AdminPage  >>> Blog Seciton Menu >>> Add New Button
//    @FindBy(xpath = "//div[@class='container-fluid']/div/div/div/a")
//    public WebElement blogsAddNewButton;
//
//    // AdminPage  >>> Blog Seciton Menu >>> Search Textbox
//    @FindBy(xpath = "//input[@type='search']")
//    public WebElement blogsSearchTextBox;
//
//    // AdminPage  >>> Blog Seciton Menu >>> Add New Button >>> Add Blog
//    @FindBy(xpath = "//input[@name='blog_title']")
//    public WebElement addBlogNameTextBox;
//
//    @FindBy(xpath = "//input[@name='blog_slug']")
//    public WebElement addBlugSlugTextbox;
//    @FindBy(xpath = "//input[@name='blog_photo']")
//    public WebElement blogChooseFileButton;
//
//    @FindBy(xpath = "//h6[text()='Edit Blog']")
//    public WebElement blogEditPageViewTitle;
//
//    @FindBy(xpath = "//button[@type='submit']")
//    public WebElement blogAddSubmitButton;
//
//    @FindBy(xpath = "//div[@class='toast toast-success']")
//    public WebElement newBlogAddSuccessfulyMessage;
//
//    @FindBy(xpath = "//*[@id=\"dataTable\"]/tbody/tr/td[5]/a[1]")
//    public WebElement blogEditButton;
//
//    @FindBy(xpath = "//*[@id=\"dataTable\"]/tbody/tr/td[5]/a[2]")
//    public WebElement blogDeleteButton;
//
//    @FindBy(xpath = "//*[@class='btn btn-danger btn-sm']")
//    public WebElement blogDeleteSuccessfulyMessage;

    //**************************MA*********************************************
    //AdminPage >>> SolPanelList >>> DestinationsButton     **MY**
    @FindBy(xpath = "//li[@class='nav-item '][5]")
    public WebElement destinationsButton;

    //AdminPage >>> SolPanelList >>> Destinations >>> AddNewButton
    @FindBy(xpath = "//div[@class='float-right d-inline']")
    public WebElement destinationsAddNewButton;

    //AdminPage >>> SolPanelList >>> Destinations >>> AddNewButton >>> DestinationsNameBox
    @FindBy(xpath = "//input[@name='d_name']")
    public WebElement destinationsNameBox;

    //AdminPage >>> SolPanelList >>> Destinations >>> AddNewDestinationsPage >>> ChooseFileButton
    @FindBy(xpath = "//input[@name='d_photo']")
    public WebElement destinationsChooseFileButton;

    //AdminPage >>> SolPanelList >>> Destinations >>> AddNewDestinationsPage >>> SubmitButton
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement destinationsSubmitButton;

    //AdminPage >>> SolPanelList >>> Destinations >>> AddNewDestinationsPage >>> IntroductionsBox
    @FindBy(xpath = "(//div[@class='note-editing-area'])[1]")
    public WebElement destinationsIntroductionBox;

    //AdminPage >>> SolPanelList >>> Destinations >>> AddNewDestinationsPage >>> SuccessfullyAdded Alert
    @FindBy(xpath = "//*[@id='page-top']")
    public WebElement destinationsAddedSuccessfully;

    //AdminPage >>> SolPanelList >>> Destinations >>> DestinationsEditPage >>> DestinationsTable
    @FindBy(xpath = "//*[@id=\"dataTable\"]/tbody//td[3]")
    public List<WebElement> bodyElement;

    @FindBy(xpath = "//*[text()='Next']")
    public WebElement destinationsEditPageNextButton;

    @FindBy(xpath = "//*[@name='d_name']")
    public WebElement destinationsEditNameBox;

    //AdminPage >>> SolPanelList >>> Destinations >>> DestinationsEditPage >>> DestinationsUpdateButton
    @FindBy(xpath = "//button[text()='Update']")
    public WebElement destinationsUpdateButton;

    //AdminPage >>> SolPanelList >>> Destinations >>> DestinationsEditPage >>> EditSuccessfully Alert
    @FindBy(xpath = "//*[@id='page-top']")
    public WebElement destinationsEditSuccessfully;

    //HomePage >>> Navbar >>> FAQ Button
    @FindBy(xpath = "(//*[text()='FAQ'])[2]")
    public WebElement FAQPageButton;

    //AdminPage >>> SolPanelList >>> GeneralSettingLink
    @FindBy(xpath = "//*[text()='General Settings']")
    public WebElement destinationsGeneralSettingLink;
    //AdminPage >>> SolPanelList >>> GeneralSettingPage
    @FindBy(xpath = "(//*[@class='bg-white py-2 collapse-inner rounded'])[1]")
    public WebElement destinationsGenSetPage;
    //AdminPage >>> SolPanelList >>> PageSettingLink
    @FindBy(xpath = "//*[text()='Page Settings']")
    public WebElement destinationsPageSettingLink;
    //AdminPage >>> SolPanelList >>> PageSettingPage
    @FindBy(xpath = "(//*[@class='bg-white py-2 collapse-inner rounded'])[2]")
    public WebElement destinationsPageSetPage;
    //AdminPage >>> SolPanelList >>> PaymentSettingLink
    @FindBy(xpath = "//*[text()='Payment Settings']")
    public WebElement destinationsPaymentSettingLink;
    //AdminPage >>> SolPanelList >>> PaymentSettingPage
    @FindBy(xpath = "(//*[@class='bg-white py-2 collapse-inner rounded'])[3]")
    public WebElement destinationsPaySetPage;
    //AdminPage >>> SolPanelList >>> DynamicPageLink
    @FindBy(xpath = "//*[text()='Dynamic Pages']")
    public WebElement destinationsDynamicPageLink;
    //AdminPage >>> SolPanelList >>> LanguagePageLink
    @FindBy(xpath = "//*[text()='Language']")
    public WebElement destinationsLanguagePageLink;
    //AdminPage >>> SolPanelList >>> Website Section Link
    @FindBy(xpath = "//*[text()='Website Section']")
    public WebElement destinationsWebSitSectionLink;
    //AdminPage >>> SolPanelList >>> Website Section Page
    @FindBy(xpath = "(//*[@class='bg-white py-2 collapse-inner rounded'])[5]")
    public WebElement destinationsWebSitSecPage;
    //AdminPage >>> SolPanelList >>> Email Template Link
    @FindBy(xpath = "//*[text()='Email Template']")
    public WebElement destinationsEmailTempLink;




}
