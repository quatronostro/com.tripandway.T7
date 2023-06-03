package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TawAdminPage {

    public TawAdminPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

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


}
