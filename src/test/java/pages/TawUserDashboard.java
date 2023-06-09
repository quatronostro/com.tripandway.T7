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
    @FindBy(xpath = "//*[text()='View All Payments']")
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

    // User Dashboad >>> Update Profile Title
    @FindBy(xpath = "/html/body/div[6]/div/div/div[1]/div/ul/li[3]/a")
    public WebElement updateProfilTitle;


    // User Dashboad >>> Update Profile
    @FindBy(xpath = "/html/body/div[6]/div/div/div[1]/div/ul/li[3]/a")
    public WebElement updateProfilSekmesi;


    // User Dashboad >>> Update Profile >>> NameTitle
    @FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div/div/div/form/div/div[1]/div[1]/label")
    public WebElement updateProfileNameTitle;

    // User Dashboad >>> Update Profile >>> Name Butonu
    @FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div/div/div/form/div/div[1]/div[1]/input")
    public  WebElement updateProfileNameButonu;

    // User Dashboad >>> Update Profile >>> PhoneTitle
    @FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div/div/div/form/div/div[2]/div[1]/label")
    public WebElement updateProfilePhoneTitle;

    // User Dashboad >>> Update Profile >>> PhoneButonu
    @FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div/div/div/form/div/div[2]/div[1]/input")
    public WebElement updatepro;

    // User Dashboad >>> Update Profile >>> AddressTitle
    @FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div/div/div/form/div/div[3]/div[1]/label")
    public WebElement updateProfileAdressTitle;

    // User Dashboad >>> Update Profile >>> AddressButonu
    @FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div/div/div/form/div/div[3]/div[1]/input")
    public WebElement updateProfileAdressButonu;

    // User Dashboad >>> Update Profile >>> CityTitle
    @FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div/div/div/form/div/div[4]/div[1]/label")
    public  WebElement updateProfilCityTitle;

    // User Dashboad >>> Update Profile >>> CityButonu
    @FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div/div/div/form/div/div[4]/div[1]/input")
    public  WebElement updateProfilCityButonu;

    // User Dashboad >>> Update Profile >>> EmailAddressTitle
    @FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div/div/div/form/div/div[1]/div[2]/label")
    public  WebElement updateProfilEmailAddressTitle;

    // User Dashboad >>> Update Profile >>> EmailAddressButonu
    @FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div/div/div/form/div/div[1]/div[2]/input")
    public  WebElement updateProfilEmailAddressButonu;

    // User Dashboad >>> Update Profile >>> CountryTitle
    @FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div/div/div/form/div/div[2]/div[2]/label")
    public WebElement updateProfilCountryTitle;


    // User Dashboad >>> Update Profile >>> CountryButonu
    @FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div/div/div/form/div/div[2]/div[2]/input")
    public WebElement updateProfilCountryButonu;

    // User Dashboad >>> Update Profile >>> StateTitle
    @FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div/div/div/form/div/div[3]/div[2]/label")
    public  WebElement updateProfilStateTitle;

    // User Dashboad >>> Update Profile >>> StateButonu
    @FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div/div/div/form/div/div[3]/div[2]/input")
    public  WebElement updateProfilStateButonu;

    // User Dashboad >>> Update Profile >>> ZipCodeTitle
    @FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div/div/div/form/div/div[4]/div[2]/label")
    public  WebElement updateProfilZipCodeTitle;

    // User Dashboad >>> Update Profile >>> ZipCodeButonu
    @FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div/div/div/form/div/div[4]/div[2]/input")
    public  WebElement updateProfilZipCodeButonu;

    // User Dashboad >>> Update Profile >>> UpdateButonu
    @FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div/div/div/form/div/button")
    public  WebElement updateButonu;

    // User Dashboad >>> Update Profile >>> SuccessfullyTitle
    @FindBy(xpath = "/html/head")
    public WebElement successfullyTitle;

    // User Dashboad >>> Update Profile >>> LoginButonu
    @FindBy(xpath = "// User Dashboad >>> Update Profile >>>")
    public WebElement loginButonu;















}
