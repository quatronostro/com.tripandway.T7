package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


public class TawUserHomePage {

    public TawUserHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //HomePage >>> LogoImage
    @FindBy(xpath = "//*[@*='logo']")
    public WebElement homePageLogo;

    //HomePage >>> Registration >>> NameTextbox
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement labelRegistrationInput;

    //HomePage >>> Registration >>> EmailTextbox
    @FindBy(xpath = "//input[@type='email']")
    public WebElement labelRegistrationMail;


    //Registration >>> password Textbox
    @FindBy(xpath = "//input[@type='password']")
    public WebElement labelRegistrationPass;

    //HomePage >>> Registration >>> MakeRegistrationButton
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement MakeRegistrationButton;

    //HomePage >>> Registration >>> Onay
    @FindBy(xpath = "//*[contains(text(), 'Please check your email to verify your registration. Check your spam folder too.')]")
    public WebElement registrationOnay;


    //HomePage >>> Slider kısmı
    @FindBy(xpath = "//div[@class='slider']")
    public WebElement slider;

    //HomePage >>> Slider kısmı sağa kaydır buttonu
    @FindBy(xpath = "(//div[@class='owl-next'])[1]")
    public WebElement sliderSagaKaydirButton;

    //HomePage >>> Slider kısmı sağa kaydır buttonu
    @FindBy(xpath = "(//div[@class='owl-prev'])[1]")
    public WebElement sliderSolaKaydirButton;

    //HomePage >>> Slider kısmı radio buttonlar
    @FindBy(xpath = "(//div[@class='owl-dots'])[1]/div")
    public List<WebElement> radioButtonSliderButunButtonlar;

    //HomePage >>> Slider kısmı ilk tanıtım image
    @FindBy(xpath = "(//div[@class='owl-stage'])[1]/div[3]/div")
    public WebElement imageBackgroundSliderBirinciBackground;

    //HomePage >>> Slider kısmı ilk tanıtım başlık text'i
    @FindBy(xpath = "(//div[@class='text-animated'])[7]")
    public WebElement labelSliderBirinciTanitimBaslikTexti;

    //HomePage >>> Slider kısmı ilk tanıtım açıklama text'i
    @FindBy(xpath = "(//div[@class='text-animated'])[8]")
    public WebElement labelSliderBirinciTanitimAciklamaTexti;

    //HomePage >>> Slider kısmı ilk tanıtım read more buttonu
    @FindBy(xpath = "(//div[@class='text-animated'])[9]/ul/li")
    public WebElement sliderIlkTanitimReadMoreButton;

}

