package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TawUserDashboard {

    public TawUserDashboard(){PageFactory.initElements(Driver.getDriver(), this);}


    // User Dashboad >>> Payment History
    @FindBy(xpath = "//a[@href='https://qa.tripandway.com/traveller/order']")
    public WebElement paymetHistorysElement;

    // User Dashboad >>> Payment History
    @FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div")
    public WebElement viewAllPaymenstTitle;

    @FindBy(xpath = "//tbody/tr[2]/td[5]")
    public WebElement paymentHistoryPagePackageName;

    // User Dashboad >>> Payment History
    @FindBy(xpath = "(//tbody/tr[2]/td[8])/a")
    public WebElement viewAllPaymentsActionButton;

    // User Dashboad >>> Payment History >>> Order Detail
    @FindBy(xpath = "//tbody/tr[4]/td[2]")
    public WebElement orderDetailCurrencyElement;

    @FindBy(xpath = "//tbody/tr[5]/td[2]")
    public WebElement orderDetailPaidAmountElement;

    @FindBy(xpath = "//tbody/tr[11]/td[2]")
    public WebElement orderDetailPaymentStatusElement;

    //HomePage >>> UserLoginButton
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/a[2]")
    public WebElement userLoginButton;

    public static TawUserHomePage tawUserLogin;

    public static void tawUserAccountLogin(){

        tawUserLogin = new TawUserHomePage();

        tawUserLogin.userEmailTextbox.sendKeys(ConfigReader.getProperty("userEmail"));
        tawUserLogin.userPasswordTextbox.sendKeys(ConfigReader.getProperty("userPass"));
        tawUserLogin.userLoginSubmitButton.click();
    }

    //User Dashboard >>> Payment History >>> TableFirstRow
    @FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div/div/table/tbody/tr[1]")
    public WebElement paymentDashboardTableFirstRow;

    //User Dashboard >>> Header >>> PackagesButton
    @FindBy(xpath = "//*[@id=\"menu\"]/li[4]")
    public WebElement headerPackagesButton;

    //UserDashboard >>> Header >>> Packages >>> Package
    @FindBy(xpath = "/html/body/div[7]/div/div[2]/div[3]/div[2]")
    public WebElement somePackageButton;

    //UserDashboard >>> Header >>> Packgaes >>>PackagesBodyText
    @FindBy(xpath = "/html/body/div[7]/div/div")
    public WebElement packagesBodyText;

    //UserDashboard >>> Header >>> Packages >>> BookYourSeatButton
    @FindBy(xpath = "/html/body/div[7]/div/div/div[2]/div/div[2]/div/form/div[2]/button")
    public WebElement packagesBookYourSeatButton;

    //UserDashboard >>> Header >>> Packages >>> BookYourSeatButton >>> Payment PageBodyText
    @FindBy(xpath = "/html/body/div[7]/div/div/div")
    public WebElement packagesPaymentBodyText;

    //UserDashboard >>> Header >>> Packages >>> BookYourSeatButton >>> PayWithCardButton
    @FindBy(className = "stripe-button-el")
    public WebElement packagesPaymentPayWithCardButton;

    //UserDashboard >>> Header >>> Packages >>> BookYourSeat >>> PayWithCard >>> CardNumberBox
    @FindBy(id = "card_number")
    public WebElement cardNumberBox;

    //UserDashboard >>> Header >>> Packages >>> BookYourSeat >>> PayWithCard >>> CardExpDayBox
    @FindBy(xpath = "//*[@id=\"cc-exp\"]")
    public WebElement cardExpDayBox;

    //UserDashboard >>> Header >>> Packages >>> BookYourSeat >>> PayWithCard >>> CardCCVBox
    @FindBy(xpath = "//*[@id=\"cc-csc\"]")
    public WebElement cardCCVBox;

    //UserDashboard >>> Header >>> Packages >>> BookYourSeat >>> PayWithCard >>> PayButton
    @FindBy(xpath = "//*[@id=\"submitButton\"]/span/span")
    public WebElement payButton;


}
