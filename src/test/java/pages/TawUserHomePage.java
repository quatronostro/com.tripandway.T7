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

    //HomePage >>> Slider kısmı ikinci tanıtım image
    @FindBy(xpath = "(//div[@style='background-image:url(https://qa.tripandway.com/public/uploads/slider-3.jpg);'])[2]")
    public WebElement imageBackgroundSliderIkinciBackground;

    //HomePage >>> Slider kısmı ikinci tanıtım başlık text'i
    @FindBy(xpath = "(//h1[text()='The World is So Beautiful'])[2]")
    public WebElement labelSliderIkinciTanitimBaslikTexti;

    //HomePage >>> Slider kısmı ikinci tanıtım açıklama text'i
    @FindBy(xpath = "(//div[@class='col-md-7 col-sm-12 '])[4]/div/div/div[2]")
    public WebElement labelSliderIkinciTanitimAciklamaTexti;

    //HomePage >>> Slider kısmı ikinci tanıtım read more buttonu
    @FindBy(xpath = "(//div[@class='col-md-7 col-sm-12 '])[4]/div/div/div[3]/ul/li/a")
    public WebElement sliderIkinciTanitimReadMoreButton;

    //HomePage >>> Slider kısmı üçüncü tanıtım image
    @FindBy(xpath = "(//div[@style='background-image:url(https://qa.tripandway.com/public/uploads/slider-4.jpg);'])[2]")
    public WebElement imageBackgroundSliderUcuncuBackground;

    //HomePage >>> Slider kısmı üçüncü tanıtım başlık text'i
    @FindBy(xpath = "(//div[@class='col-md-7 col-sm-12 '])[5]/div/div/div[1]")
    public WebElement labelSliderUcuncuTanitimBaslikTexti;

    //HomePage >>> Slider kısmı üçüncü tanıtım açıklama text'i
    @FindBy(xpath = "(//div[@class='col-md-7 col-sm-12 '])[5]/div/div/div[2]")
    public WebElement labelSliderUcuncuTanitimAciklamaTexti;

    //HomePage >>> Slider kısmı üçüncü tanıtım read more buttonu
    @FindBy(xpath = "(//div[@class='col-md-7 col-sm-12 '])[5]/div/div/div[3]/ul/li/a")
    public WebElement sliderUcuncuTanitimReadMoreButton;

    //HomePage >>> Our Services kısmının tamamı
    @FindBy(xpath = "//div[@class='service-area pt_80 pb_80']")
    public WebElement ourServicesAlani;

    //HomePage >>> Our Services kısmının başlıgı
    @FindBy(xpath = "(//div[@class='headline'])[1]")
    public WebElement labelHomePageBodyOurServicesBaslikTexti;

    //HomePage >>> Our Services kısmının başlıgının altındaki aciklama texti
    @FindBy(xpath = "(//div[@class='main-headline'])[1]/p")
    public WebElement labelHomePageBodyOurservicesAciklamaTexti;

    //HomePage >>> Our Services kısmının birinci hizmeti
    @FindBy(xpath = "(//div[@class='row'])[11]/div[1]")
    public WebElement homePageBodyOurServicesBirinciHizmet;

    //HomePage >>> Our Services kısmının birinci hizmetinin logosu
    @FindBy(xpath = "(//div[@class='row'])[11]/div[1]/div/a/i")
    public WebElement logoHomePageBodyOurServicesBirinciHizmetLogosu;

    //HomePage >>> Our Services kısmının birinci hizmetinin basligi
    @FindBy(xpath = "(//div[@class='row'])[11]/div[1]/div/a/div/h4")
    public WebElement labelHomePageOurServicesBirinciHizmetBaslikTexti;

    //HomePage >>> Our Services kısmının birinci hizmetinin aciklama texti
    @FindBy(xpath = "(//div[@class='row'])[11]/div[1]/div/a/div/p[2]")
    public WebElement labelHomePageOurServicesBirinciHizmetAciklamaTexti;

    //HomePage >>> Our Services kısmının ikinci hizmeti
    @FindBy(xpath = "(//div[@class='row'])[11]/div[2]")
    public WebElement homePageBodyOurServicesIkinciHizmet;

    //HomePage >>> Our Services kısmının ikinci hizmetinin logosu
    @FindBy(xpath = "(//div[@class='row'])[11]/div[2]/div/a/i")
    public WebElement logoHomePageBodyOurServicesIkinciHizmetLogosu;

    //HomePage >>> Our Services kısmının ikinci hizmetinin basligi
    @FindBy(xpath = "(//div[@class='row'])[11]/div[2]/div/a/div/h4")
    public WebElement labelHomePageOurServicesIkinciHizmetBaslikTexti;

    //HomePage >>> Our Services kısmının ikinci hizmetinin aciklama texti
    @FindBy(xpath = "(//div[@class='row'])[11]/div[2]/div/a/div/p[2]")
    public WebElement labelHomePageOurServicesIkinciHizmetAciklamaTexti;

    //HomePage >>> Our Services kısmının ucuncu hizmeti
    @FindBy(xpath = "(//div[@class='row'])[11]/div[3]")
    public WebElement homePageBodyOurServicesUcuncuHizmet;

    //HomePage >>> Our Services kısmının ucuncu hizmetinin logosu
    @FindBy(xpath = "(//div[@class='row'])[11]/div[3]/div/a/i")
    public WebElement logoHomePageBodyOurServicesUcuncuHizmetLogosu;

    //HomePage >>> Our Services kısmının ucuncu hizmetinin basligi
    @FindBy(xpath = "(//div[@class='row'])[11]/div[3]/div/a/div/h4")
    public WebElement labelHomePageOurServicesUcuncuHizmetBaslikTexti;

    //HomePage >>> Our Services kısmının ucuncu hizmetinin aciklama texti
    @FindBy(xpath = "(//div[@class='row'])[11]/div[3]/div/a/div/p[2]")
    public WebElement labelHomePageOurServicesUcuncuHizmetAciklamaTexti;

    //HomePage >>> Our Services kısmının dorduncu hizmeti
    @FindBy(xpath = "(//div[@class='row'])[11]/div[4]")
    public WebElement homePageBodyOurServicesDorduncuHizmet;

    //HomePage >>> Our Services kısmının Dorduncu hizmetinin logosu
    @FindBy(xpath = "(//div[@class='row'])[11]/div[4]/div/a/i")
    public WebElement logoHomePageBodyOurServicesDorduncuHizmetLogosu;

    //HomePage >>> Our Services kısmının Dorduncu hizmetinin basligi
    @FindBy(xpath = "(//div[@class='row'])[11]/div[4]/div/a/div/h4")
    public WebElement labelHomePageOurServicesDorduncuHizmetBaslikTexti;

    //HomePage >>> Our Services kısmının Dorduncu hizmetinin aciklama texti
    @FindBy(xpath = "(//div[@class='row'])[11]/div[4]/div/a/div/p[2]")
    public WebElement labelHomePageOurServicesDorduncuHizmetAciklamaTexti;

    //HomePage >>> Our Services kısmının besinci hizmeti
    @FindBy(xpath = "(//div[@class='row'])[11]/div[5]")
    public WebElement homePageBodyOurServicesBesinciHizmet;

    //HomePage >>> Our Services kısmının besinci hizmetinin logosu
    @FindBy(xpath = "(//div[@class='row'])[11]/div[5]/div/a/i")
    public WebElement logoHomePageBodyOurServicesBesinciHizmetLogosu;

    //HomePage >>> Our Services kısmının besinci hizmetinin basligi
    @FindBy(xpath = "(//div[@class='row'])[11]/div[5]/div/a/div/h4")
    public WebElement labelHomePageOurServicesBesinciHizmetBaslikTexti;

    //HomePage >>> Our Services kısmının besinci hizmetinin aciklama texti
    @FindBy(xpath = "(//div[@class='row'])[11]/div[5]/div/a/div/p[2]")
    public WebElement labelHomePageOurServicesBesinciHizmetAciklamaTexti;

    //HomePage >>> Our Services kısmının Altinci hizmeti
    @FindBy(xpath = "(//div[@class='row'])[11]/div[6]")
    public WebElement homePageBodyOurServicesAltinciHizmet;

    //HomePage >>> Our Services kısmının Altinci hizmetinin logosu
    @FindBy(xpath = "(//div[@class='row'])[11]/div[6]/div/a/i")
    public WebElement logoHomePageBodyOurServicesAltinciHizmetLogosu;

    //HomePage >>> Our Services kısmının Altinci hizmetinin basligi
    @FindBy(xpath = "(//div[@class='row'])[11]/div[6]/div/a/div/h4")
    public WebElement labelHomePageOurServicesAltinciHizmetBaslikTexti;

    //HomePage >>> Our Services kısmının Altinci hizmetinin aciklama texti
    @FindBy(xpath = "(//div[@class='row'])[11]/div[6]/div/a/div/p[2]")
    public WebElement labelHomePageOurServicesAltinciHizmetAciklamaTexti;

    //HomePage >>> Featured Packages kısmının tamamı
    @FindBy(xpath = "//div[@class='featured-package bg-area pt_80 pb_80']")
    public WebElement featurePackagesAlani;

    //HomePage >>> Featured Packages kısmının başlığı
    @FindBy(xpath = "//h2[text()='FEATURED PACKAGES']")
    public WebElement labelHomePageBodyFeaturedPackagesBaslikTexti;

    //HomePage >>> Featured Packages kısmı açıklama texti
    @FindBy(xpath = "(//div[@class='main-headline'])[2]/p")
    public WebElement labelHomePageBodyFeaturedPackagesAciklamaTexti;

    //HomePage >>> Featured Packages kısmı radio buttonlari
    @FindBy(xpath = "(//div[@class='owl-dots'])[2]/div")
    public List<WebElement> radioButtonFeaturePackagesRadioButtonlari;

    //HomePage >>> Featured Packages kısmının birinci paketi
    @FindBy(xpath = "(//div[@class='owl-stage'])[2]/div[1]")
    public WebElement homePageBodyFeaturedPackagesBirinciPaket;

    //HomePage >>> Featured Packages kısmının birinci paketin kişi başı fiyatı
    @FindBy(xpath = "(//div[@class='owl-stage'])[2]/div[1]/div/div/span")
    public WebElement labelHomePageBodyFeaturedPackagesBirinciPaketKisiBasiFiyat;

    //HomePage >>> Featured Packages kısmının birinci paketin başlığı
    @FindBy(xpath = "(//div[@class='owl-stage'])[2]/div[1]/div/div/h4")
    public WebElement labelHomePageBodyFeaturedPackagesBirinciPaketBaslik;

    //HomePage >>> Featured Packages kısmının birinci paketin aciklama texti
    @FindBy(xpath = "(//div[@class='owl-stage'])[2]/div[1]/div/div/p[2]")
    public WebElement labelHomePageBodyFeaturedPackagesBirinciPaketAciklamaTexti;

    //HomePage >>> Featured Packages kısmının Ikinci paketi
    @FindBy(xpath = "(//div[@class='owl-stage'])[2]/div[2]")
    public WebElement homePageBodyFeaturedPackagesIkinciPaket;

    //HomePage >>> Featured Packages kısmının Ikinci paketin kişi başı fiyatı
    @FindBy(xpath = "(//div[@class='owl-stage'])[2]/div[2]/div/div/span")
    public WebElement labelHomePageBodyFeaturedPackagesIkinciPaketKisiBasiFiyat;

    //HomePage >>> Featured Packages kısmının Ikinci paketin başlığı
    @FindBy(xpath = "(//div[@class='owl-stage'])[2]/div[2]/div/div/h4")
    public WebElement labelHomePageBodyFeaturedPackagesIkinciPaketBaslik;

    //HomePage >>> Featured Packages kısmının Ikinci paketin aciklama texti
    @FindBy(xpath = "(//div[@class='owl-stage'])[2]/div[2]/div/div/p[2]")
    public WebElement labelHomePageBodyFeaturedPackagesIkinciPaketAciklamaTexti;

    //HomePage >>> Featured Packages kısmının Ucuncu paketi
    @FindBy(xpath = "(//div[@class='owl-stage'])[2]/div[3]")
    public WebElement homePageBodyFeaturedPackagesUcuncuPaket;

    //HomePage >>> Featured Packages kısmının Ucuncu paketin kişi başı fiyatı
    @FindBy(xpath = "(//div[@class='owl-stage'])[2]/div[3]/div/div/span")
    public WebElement labelHomePageBodyFeaturedPackagesUcuncuPaketKisiBasiFiyat;

    //HomePage >>> Featured Packages kısmının Ucuncu paketin başlığı
    @FindBy(xpath = "(//a[text()='3 days in Bangkok'])[1]")
    public WebElement labelHomePageBodyFeaturedPackagesUcuncuPaketBaslik;

    //HomePage >>> Featured Packages kısmının Ucuncu paketin aciklama texti
    @FindBy(xpath = "(//div[@class='owl-stage'])[2]/div[3]/div/div/p[2]")
    public WebElement labelHomePageBodyFeaturedPackagesUcuncuPaketAciklamaTexti;

    //HomePage >>> Featured Packages kısmının Dorduncu paketi
    @FindBy(xpath = "(//div[@class='owl-stage'])[2]/div[4]")
    public WebElement homePageBodyFeaturedPackagesDorduncuPaket;

    //HomePage >>> Featured Packages kısmının Dorduncu paketin kişi başı fiyatı
    @FindBy(xpath = "(//div[@class='owl-stage'])[2]/div[4]/div/div/span")
    public WebElement labelHomePageBodyFeaturedPackagesDorduncuPaketKisiBasiFiyat;

    //HomePage >>> Featured Packages kısmının Dorduncu paketin başlığı
    @FindBy(xpath = "(//div[@class='owl-stage'])[2]/div[4]/div/div/h4")
    public WebElement labelHomePageBodyFeaturedPackagesDorduncuPaketBaslik;

    //HomePage >>> Featured Packages kısmının Dorduncu paketin aciklama texti
    @FindBy(xpath = "(//div[@class='owl-stage'])[2]/div[4]/div/div/p[2]")
    public WebElement labelHomePageBodyFeaturedPackagesDorduncuPaketAciklamaTexti;

    //HomePage >>> Sirket Basarilari Kisminin tamami
    @FindBy(xpath = "//div[@class='counterup-area pt_70 pb_100']")
    public WebElement sirketBasarilariAlani;

    //HomePage >>> Sirket Basarilari Kisminin birinci baslik texti
    @FindBy(xpath = "(//div[@class='row'])[14]/div[1]/div/div/h2")
    public WebElement labelHomePageBodySirketBasarilariBirinciBaslikTexti;

    //HomePage >>> Sirket Basarilari Kisminin Birinci aciklama texti
    @FindBy(xpath = "(//div[@class='row'])[14]/div[1]/div/div/h4")
    public WebElement labelHomePageBodySirketBasarilariBirinciAciklamaTexti;

    //HomePage >>> Sirket Basarilari Kisminin Ikinci baslik texti
    @FindBy(xpath = "(//div[@class='row'])[14]/div[2]/div/div/h2")
    public WebElement labelHomePageBodySirketBasarilariIkinciBaslikTexti;

    //HomePage >>> Sirket Basarilari Kisminin Ikinci aciklama texti
    @FindBy(xpath = "(//div[@class='row'])[14]/div[2]/div/div/h4")
    public WebElement labelHomePageBodySirketBasarilariIkinciAciklamaTexti;

    //HomePage >>> Sirket Basarilari Kisminin Ucuncu baslik texti
    @FindBy(xpath = "(//div[@class='row'])[14]/div[3]/div/div/h2")
    public WebElement labelHomePageBodySirketBasarilariUcuncuBaslikTexti;

    //HomePage >>> Sirket Basarilari Kisminin Ucuncu aciklama texti
    @FindBy(xpath = "(//div[@class='row'])[14]/div[3]/div/div/h4")
    public WebElement labelHomePageBodySirketBasarilariUcuncuAciklamaTexti;

    //HomePage >>> Sirket Basarilari Kisminin Dorduncu baslik texti
    @FindBy(xpath = "(//div[@class='row'])[14]/div[4]/div/div/h2")
    public WebElement labelHomePageBodySirketBasarilariDorduncuBaslikTexti;

    //HomePage >>> Sirket Basarilari Kisminin Dorduncu aciklama texti
    @FindBy(xpath = "(//div[@class='row'])[14]/div[4]/div/div/h4")
    public WebElement labelHomePageBodySirketBasarilariDorduncuAciklamaTexti;

    //HomePage >>> Destinations kisminin tamami
    @FindBy(xpath = "//div[@class='portfolio-page pt_80 pb_80']")
    public WebElement destinationsAlani;

    //HomePage >>> Destinations kisminin baslik texti
    @FindBy(xpath = "(//div[@class='main-headline'])[3]/div")
    public WebElement labelHomePageBodyDestinationsBaslikTexti;

    //HomePage >>> Destinations kisminin aciklama texti
    @FindBy(xpath = "(//div[@class='main-headline'])[3]/p")
    public WebElement labelHomePageBodyDestinationsAciklamaTexti;

    //HomePage >>> Destinations kisminin Birinci Destination'nı
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[1]")
    public WebElement homepageBodyBirinciDestination;

    //HomePage >>> Destinations kisminin Birinci Destinationun Image'i
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[1]/div[1]/img")
    public WebElement imageDestinationHomePageBodyBirinciDestinationImage;

    //HomePage >>> Destinations kisminin Birinci Destination'ın Baslig texti
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[1]/div[2]")
    public WebElement labelHomePageDestinationsBirinciDestinationBaslikTexti;

    //HomePage >>> Destinations kisminin Birinci Destination'ın ikonu
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[1]/div/div[2]/a/i")
    public WebElement iconHomePageBodyDestinationsBirinciDestinationIcon;

    //HomePage >>> Destinations kisminin Birinci Destination ikonuna tıklanınca acılan fotograf
    @FindBy(xpath = "//img[@class='mfp-img']")
    public WebElement imageDestinationHomePageBodyBirinciDestinationIkonunaTiklanincaAcilanImage;

    //HomePage >>> Destinations kisminin Birinci Destination ikonuna tıklanınca acılan fotograf sola kaydir buttonu
    @FindBy(xpath = "//button[@title='Previous (Left arrow key)']")
    public WebElement buttonDestinationHomePageBodyBirinciDestinationIkonunaTiklanincaAcilanSolButton;

    //HomePage >>> Destinations kisminin Birinci Destination ikonuna tıklanınca acılan fotograf saga kaydir buttonu
    @FindBy(xpath = "//button[@title='Next (Right arrow key)']")
    public WebElement buttonDestinationHomePageBodyBirinciDestinationIkonunaTiklanincaAcilanSagButton;

    //HomePage >>> Destinations kisminin Birinci Destination ikonuna tıklanınca acılan fotograf close ikonu
    @FindBy(xpath = "//button[@title='Close (Esc)']")
    public WebElement iconDestinationHomePageBodyBirinciDestinationIkonunaTiklanincaAcilanCloseIcon;

    //HomePage >>> Destinations kisminin Birinci Destination ikonuna tıklanınca acılan fotograf altındaki sayi texti
    @FindBy(xpath = "//div[@class='mfp-counter']")
    public WebElement labelDestinationHomePageBodyBirinciDestinationIkonunaTiklanincaAcilanSayiTexti;

    //HomePage >>> Destinations kisminin Ikınci Destination'nı
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[2]")
    public WebElement homepageBodyIkinciDestination;

    //HomePage >>> Destinations kisminin Ikinci Destinationun Image'i
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[2]/div[1]/img")
    public WebElement imageDestinationHomePageBodyIkinciDestinationImage;

    //HomePage >>> Destinations kisminin Ikinci Destination'ın Baslig texti
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[2]/div[2]")
    public WebElement labelHomePageDestinationsIkinciDestinationBaslikTexti;

    //HomePage >>> Destinations kisminin Ikinci Destination'ın ikonu
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[2]/div/div[2]/a/i")
    public WebElement iconHomePageBodyDestinationsIkinciDestinationIcon;

    //HomePage >>> Destinations kisminin ikinci Destination ikonuna tıklanınca acılan fotograf
    @FindBy(xpath = "//img[@class='mfp-img']")
    public WebElement imageDestinationHomePageBodyIkinciDestinationIkonunaTiklanincaAcilanImage;

    //HomePage >>> Destinations kisminin Ikinci Destination ikonuna tıklanınca acılan fotograf sola kaydir buttonu
    @FindBy(xpath = "//button[@title='Previous (Left arrow key)']")
    public WebElement buttonDestinationHomePageBodyIkinciDestinationIkonunaTiklanincaAcilanSolButton;

    //HomePage >>> Destinations kisminin Ikinci Destination ikonuna tıklanınca acılan fotograf saga kaydir buttonu
    @FindBy(xpath = "//button[@title='Next (Right arrow key)']")
    public WebElement buttonDestinationHomePageBodyIkinciDestinationIkonunaTiklanincaAcilanSagButton;

    //HomePage >>> Destinations kisminin Ikinci Destination ikonuna tıklanınca acılan fotograf close ikonu
    @FindBy(xpath = "//button[@title='Close (Esc)']")
    public WebElement iconDestinationHomePageBodyIkinciDestinationIkonunaTiklanincaAcilanCloseIcon;

    //HomePage >>> Destinations kisminin Ikinci Destination ikonuna tıklanınca acılan fotograf altındaki sayi texti
    @FindBy(xpath = "//div[@class='mfp-counter']")
    public WebElement labelDestinationHomePageBodyIkinciDestinationIkonunaTiklanincaAcilanSayiTexti;

    //HomePage >>> Destinations kisminin Ucuncu Destination'nı
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[3]")
    public WebElement homepageBodyUcuncuDestination;

    //HomePage >>> Destinations kisminin Ucuncu Destinationun Image'i
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[3]/div[1]/img")
    public WebElement imageDestinationHomePageBodyUcuncuDestinationImage;

    //HomePage >>> Destinations kisminin Ucuncu Destination'ın Baslig texti
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[3]/div[2]")
    public WebElement labelHomePageDestinationsUcuncuDestinationBaslikTexti;

    //HomePage >>> Destinations kisminin Ucuncu Destination'ın ikonu
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[3]/div/div[2]/a/i")
    public WebElement iconHomePageBodyDestinationsUcuncuDestinationIcon;

    //HomePage >>> Destinations kisminin Ucuncu Destination ikonuna tıklanınca acılan fotograf
    @FindBy(xpath = "//img[@class='mfp-img']")
    public WebElement imageDestinationHomePageBodyUcuncuDestinationIkonunaTiklanincaAcilanImage;

    //HomePage >>> Destinations kisminin Ucuncu Destination ikonuna tıklanınca acılan fotograf sola kaydir buttonu
    @FindBy(xpath = "//button[@title='Previous (Left arrow key)']")
    public WebElement buttonDestinationHomePageBodyUcuncuDestinationIkonunaTiklanincaAcilanSolButton;

    //HomePage >>> Destinations kisminin Ucuncu Destination ikonuna tıklanınca acılan fotograf saga kaydir buttonu
    @FindBy(xpath = "//button[@title='Next (Right arrow key)']")
    public WebElement buttonDestinationHomePageBodyUcuncuDestinationIkonunaTiklanincaAcilanSagButton;

    //HomePage >>> Destinations kisminin Ucuncu Destination ikonuna tıklanınca acılan fotograf close ikonu
    @FindBy(xpath = "//button[@title='Close (Esc)']")
    public WebElement iconDestinationHomePageBodyUcuncuDestinationIkonunaTiklanincaAcilanCloseIcon;

    //HomePage >>> Destinations kisminin Ucuncu Destination ikonuna tıklanınca acılan fotograf altındaki sayi texti
    @FindBy(xpath = "//div[@class='mfp-counter']")
    public WebElement labelDestinationHomePageBodyUcuncuDestinationIkonunaTiklanincaAcilanSayiTexti;

    //HomePage >>> Destinations kisminin Dorduncu Destination'nı
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[4]")
    public WebElement homepageBodyDorduncuDestination;

    //HomePage >>> Destinations kisminin Dorduncu Destinationun Image'i
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[4]/div[1]/img")
    public WebElement imageDestinationHomePageBodyDorduncuDestinationImage;

    //HomePage >>> Destinations kisminin Dorduncu Destination'ın Baslig texti
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[4]/div[2]")
    public WebElement labelHomePageDestinationsDorduncuDestinationBaslikTexti;

    //HomePage >>> Destinations kisminin Dorduncu Destination'ın ikonu
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[4]/div/div[2]/a/i")
    public WebElement iconHomePageBodyDestinationsDorduncuDestinationIcon;

    //HomePage >>> Destinations kisminin Dorduncu Destination ikonuna tıklanınca acılan fotograf
    @FindBy(xpath = "//img[@class='mfp-img']")
    public WebElement imageDestinationHomePageBodyDorduncuDestinationIkonunaTiklanincaAcilanImage;

    //HomePage >>> Destinations kisminin Dorduncu Destination ikonuna tıklanınca acılan fotograf sola kaydir buttonu
    @FindBy(xpath = "//button[@title='Previous (Left arrow key)']")
    public WebElement buttonDestinationHomePageBodyDorduncuDestinationIkonunaTiklanincaAcilanSolButton;

    //HomePage >>> Destinations kisminin Dorduncu Destination ikonuna tıklanınca acılan fotograf saga kaydir buttonu
    @FindBy(xpath = "//button[@title='Next (Right arrow key)']")
    public WebElement buttonDestinationHomePageBodyDorduncuDestinationIkonunaTiklanincaAcilanSagButton;

    //HomePage >>> Destinations kisminin Dorduncu Destination ikonuna tıklanınca acılan fotograf close ikonu
    @FindBy(xpath = "//button[@title='Close (Esc)']")
    public WebElement iconDestinationHomePageBodyDorduncuDestinationIkonunaTiklanincaAcilanCloseIcon;

    //HomePage >>> Destinations kisminin Dorduncu Destination ikonuna tıklanınca acılan fotograf altındaki sayi texti
    @FindBy(xpath = "//div[@class='mfp-counter']")
    public WebElement labelDestinationHomePageBodyDorduncuDestinationIkonunaTiklanincaAcilanSayiTexti;

    //HomePage >>> Destinations kisminin Besinci Destination'nı
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[5]")
    public WebElement homepageBodyBesinciDestination;

    //HomePage >>> Destinations kisminin Besinci Destinationun Image'i
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[5]/div[1]/img")
    public WebElement imageDestinationHomePageBodyBesinciDestinationImage;

    //HomePage >>> Destinations kisminin Besinci Destination'ın Baslig texti
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[5]/div[2]")
    public WebElement labelHomePageDestinationsBesinciDestinationBaslikTexti;

    //HomePage >>> Destinations kisminin Besinci Destination'ın ikonu
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[5]/div/div[2]/a/i")
    public WebElement iconHomePageBodyDestinationsBesinciDestinationIcon;

    //HomePage >>> Destinations kisminin Besinci Destination ikonuna tıklanınca acılan fotograf
    @FindBy(xpath = "//img[@class='mfp-img']")
    public WebElement imageDestinationHomePageBodyBesinciDestinationIkonunaTiklanincaAcilanImage;

    //HomePage >>> Destinations kisminin Besinci Destination ikonuna tıklanınca acılan fotograf sola kaydir buttonu
    @FindBy(xpath = "//button[@title='Previous (Left arrow key)']")
    public WebElement buttonDestinationHomePageBodyBesinciDestinationIkonunaTiklanincaAcilanSolButton;

    //HomePage >>> Destinations kisminin Besinci Destination ikonuna tıklanınca acılan fotograf saga kaydir buttonu
    @FindBy(xpath = "//button[@title='Next (Right arrow key)']")
    public WebElement buttonDestinationHomePageBodyBesinciDestinationIkonunaTiklanincaAcilanSagButton;

    //HomePage >>> Destinations kisminin Besinci Destination ikonuna tıklanınca acılan fotograf close ikonu
    @FindBy(xpath = "//button[@title='Close (Esc)']")
    public WebElement iconDestinationHomePageBodyBesinciDestinationIkonunaTiklanincaAcilanCloseIcon;

    //HomePage >>> Destinations kisminin Besinci Destination ikonuna tıklanınca acılan fotograf altındaki sayi texti
    @FindBy(xpath = "//div[@class='mfp-counter']")
    public WebElement labelDestinationHomePageBodyBesinciDestinationIkonunaTiklanincaAcilanSayiTexti;

    //HomePage >>> Destinations kisminin Altinci Destination'nı
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[6]")
    public WebElement homepageBodyAltinciDestination;

    //HomePage >>> Destinations kisminin Altinci Destinationun Image'i
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[6]/div[1]/img")
    public WebElement imageDestinationHomePageBodyAltinciDestinationImage;

    //HomePage >>> Destinations kisminin Altinci Destination'ın Baslig texti
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[6]/div[2]")
    public WebElement labelHomePageDestinationsAltinciDestinationBaslikTexti;

    //HomePage >>> Destinations kisminin Altinci Destination'ın ikonu
    @FindBy(xpath = "(//div[@class='row mt_10'])/div[6]/div/div[2]/a/i")
    public WebElement iconHomePageBodyDestinationsAltinciDestinationIcon;

    //HomePage >>> Destinations kisminin Altinci Destination ikonuna tıklanınca acılan fotograf
    @FindBy(xpath = "//img[@class='mfp-img']")
    public WebElement imageDestinationHomePageBodyAltinciDestinationIkonunaTiklanincaAcilanImage;

    //HomePage >>> Destinations kisminin Altinci Destination ikonuna tıklanınca acılan fotograf sola kaydir buttonu
    @FindBy(xpath = "//button[@title='Previous (Left arrow key)']")
    public WebElement buttonDestinationHomePageBodyAltinciDestinationIkonunaTiklanincaAcilanSolButton;

    //HomePage >>> Destinations kisminin Altinci Destination ikonuna tıklanınca acılan fotograf saga kaydir buttonu
    @FindBy(xpath = "//button[@title='Next (Right arrow key)']")
    public WebElement buttonDestinationHomePageBodyAltinciDestinationIkonunaTiklanincaAcilanSagButton;

    //HomePage >>> Destinations kisminin Altinci Destination ikonuna tıklanınca acılan fotograf close ikonu
    @FindBy(xpath = "//button[@title='Close (Esc)']")
    public WebElement iconDestinationHomePageBodyAltinciDestinationIkonunaTiklanincaAcilanCloseIcon;

    //HomePage >>> Destinations kisminin Altinci Destination ikonuna tıklanınca acılan fotograf altındaki sayi texti
    @FindBy(xpath = "//div[@class='mfp-counter']")
    public WebElement labelDestinationHomePageBodyAltinciDestinationIkonunaTiklanincaAcilanSayiTexti;

    //HomePage >>> Destinations kismi see all Destinations button
    @FindBy(xpath = "(//a[text()='See All Destinations'])")
    public WebElement buttonHomePageBodySeeAllDestinationsButton;

    //HomePage >>> Team Members Kısminin tamamı
    @FindBy(xpath = "//div[@class='team-area bg-area pt_80 pb_80']")
    public WebElement homePageBodyTeamMembersAlani;

    //HomePage >>> Team Members Kısminin baslik texti
    @FindBy(xpath = "//h2[text()='Team Members']")
    public WebElement labelHomePageBodyTeamMembersBaslikTexti;

    //HomePage >>> Team Members Kısminin aciklama texti
    @FindBy(xpath = "(//div[@class='main-headline'])[4]/p")
    public WebElement labelHomePageBodyTeamMembersAciklamaTexti;

    //HomePage >>> Team Members Kısminin birinci üyesi
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[5]")
    public WebElement homePageBodyTeamMembersBirinciUye;

    //HomePage >>> Team Members Kısminin birinci üyesi isim text
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[5]/div/div/a")
    public WebElement labelHomePageBodyTeamMembersBirinciUyeIsimTexti;

    //HomePage >>> Team Members Kısminin birinci üyesi görev text
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[5]/div/div/p")
    public WebElement labelHomePageBodyTeamMembersBirinciUyeGorevTexti;

    //HomePage >>> Team Members Kısminin birinci üyesi isim ve görev kusutusu
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[5]/div/div[2]")
    public WebElement labelHomePageBodyTeamMembersBirinciUyeIsimVeGorevKutusu;

    //HomePage >>> Team Members Kısminin birinci üyesi Facebook icon
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[5]/div/div/div[2]/ul/li[1]")
    public WebElement iconHomePageBodyTeamMembersBirinciUyeFacebookIcon;

    //HomePage >>> Team Members Kısminin birinci üyesi twitter icon
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[5]/div/div/div[2]/ul/li[2]")
    public WebElement iconHomePageBodyTeamMembersBirinciUyeTwitterIcon;

    //HomePage >>> Team Members Kısminin birinci üyesi LinkedIn icon
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[5]/div/div/div[2]/ul/li[3]")
    public WebElement iconHomePageBodyTeamMembersBirinciUyeLinkedInIcon;

    //HomePage >>> Team Members Kısminin birinci üyesi tüm icon'lar
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[5]/div/div/div[2]/ul/li")
    public List<WebElement> iconHomePageBodyTeamMembersBirinciUyeTumIconlar;

    //HomePage >>> Team Members Kısminin Ikinci üyesi
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[6]")
    public WebElement homePageBodyTeamMembersIkinciUye;

    //HomePage >>> Team Members Kısminin Ikinci üyesi isim text
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[6]/div/div/a")
    public WebElement labelHomePageBodyTeamMembersIkinciUyeIsimTexti;

    //HomePage >>> Team Members Kısminin Ikinci üyesi görev text
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[6]/div/div/p")
    public WebElement labelHomePageBodyTeamMembersIkinciUyeGorevTexti;

    //HomePage >>> Team Members Kısminin Ikinci üyesi isim ve görev kusutusu
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[6]/div/div[2]")
    public WebElement labelHomePageBodyTeamMembersIkinciUyeIsimVeGorevKutusu;

    //HomePage >>> Team Members Kısminin Ikinci üyesi Facebook icon
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[6]/div/div/div[2]/ul/li[1]")
    public WebElement iconHomePageBodyTeamMembersIkinciUyeFacebookIcon;

    //HomePage >>> Team Members Kısminin Ikinci üyesi twitter icon
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[6]/div/div/div[2]/ul/li[2]")
    public WebElement iconHomePageBodyTeamMembersIkinciUyeTwitterIcon;

    //HomePage >>> Team Members Kısminin Ikinci üyesi LinkedIn icon
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[6]/div/div/div[2]/ul/li[3]")
    public WebElement iconHomePageBodyTeamMembersIkinciUyeLinkedInIcon;

    //HomePage >>> Team Members Kısminin Ikinci üyesi tüm icon'lar
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[6]/div/div/div[2]/ul/li")
    public List<WebElement> iconHomePageBodyTeamMembersIkinciUyeTumIconlar;

    //HomePage >>> Team Members Kısminin Ucuncu üyesi
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[7]")
    public WebElement homePageBodyTeamMembersUcuncuUye;

    //HomePage >>> Team Members Kısminin Ucuncu üyesi isim text
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[7]/div/div/a")
    public WebElement labelHomePageBodyTeamMembersUcuncuUyeIsimTexti;

    //HomePage >>> Team Members Kısminin Ucuncu üyesi görev text
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[7]/div/div/p")
    public WebElement labelHomePageBodyTeamMembersUcuncuUyeGorevTexti;

    //HomePage >>> Team Members Kısminin Ucuncu üyesi isim ve görev kusutusu
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[7]/div/div[2]")
    public WebElement labelHomePageBodyTeamMembersUcuncuUyeIsimVeGorevKutusu;

    //HomePage >>> Team Members Kısminin Ucuncu üyesi Facebook icon
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[7]/div/div/div[2]/ul/li[1]")
    public WebElement iconHomePageBodyTeamMembersUcuncuUyeFacebookIcon;

    //HomePage >>> Team Members Kısminin Ucuncu üyesi twitter icon
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[7]/div/div/div[2]/ul/li[2]")
    public WebElement iconHomePageBodyTeamMembersUcuncuUyeTwitterIcon;

    //HomePage >>> Team Members Kısminin Ucuncu üyesi LinkedIn icon
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[7]/div/div/div[2]/ul/li[3]")
    public WebElement iconHomePageBodyTeamMembersUcuncuUyeLinkedInIcon;

    //HomePage >>> Team Members Kısminin Ucuncu üyesi tüm icon'lar
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[7]/div/div/div[2]/ul/li")
    public List<WebElement> iconHomePageBodyTeamMembersUcuncuUyeTumIconlar;

    //HomePage >>> Team Members Kısminin Dorduncu üyesi
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[8]")
    public WebElement homePageBodyTeamMembersDorduncuUye;

    //HomePage >>> Team Members Kısminin Dorduncu üyesi isim text
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[8]/div/div/a")
    public WebElement labelHomePageBodyTeamMembersDorduncuUyeIsimTexti;

    //HomePage >>> Team Members Kısminin Dorduncu üyesi görev text
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[8]/div/div/p")
    public WebElement labelHomePageBodyTeamMembersDorduncuUyeGorevTexti;

    //HomePage >>> Team Members Kısminin Dorduncu üyesi isim ve görev kusutusu
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[8]/div/div[2]")
    public WebElement labelHomePageBodyTeamMembersDorduncuUyeIsimVeGorevKutusu;

    //HomePage >>> Team Members Kısminin Dorduncu üyesi Facebook icon
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[8]/div/div/div[2]/ul/li[1]")
    public WebElement iconHomePageBodyTeamMembersDorduncuUyeFacebookIcon;

    //HomePage >>> Team Members Kısminin Dorduncu üyesi twitter icon
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[8]/div/div/div[2]/ul/li[2]")
    public WebElement iconHomePageBodyTeamMembersDorduncuUyeTwitterIcon;

    //HomePage >>> Team Members Kısminin Dorduncu üyesi LinkedIn icon
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[8]/div/div/div[2]/ul/li[3]")
    public WebElement iconHomePageBodyTeamMembersDorduncuUyeLinkedInIcon;

    //HomePage >>> Team Members Kısminin Dorduncu üyesi tüm icon'lar
    @FindBy(xpath = "(//div[@class='owl-stage'])[3]/div[8]/div/div/div[2]/ul/li")
    public List<WebElement> iconHomePageBodyTeamMembersDorduncuUyeTumIconlar;

    //HomePage >>> Testimonial kısmının tamamı
    @FindBy(xpath = "//div[@class='testimonial-area pt_80 pb_80']")
    public WebElement homePageBodyTestimonialAlani;

    //HomePage >>> Testimonial kısmının baslik texti
    @FindBy(xpath = "//h2[text()='Testimonial']")
    public WebElement labelHomePageBodyTestimonialBaslikTexti;

    //HomePage >>> Testimonial kısmının aciklama texti
    @FindBy(xpath = "(//div[@class='main-headline white'])[1]/p")
    public WebElement labelHomePageBodyTestimonialAciklamaTexti;

    //HomePage >>> Testimonial kısmının bütün radio buttonlari
    @FindBy(xpath = "(//div[@class='owl-dots'])[3]/div")
    public List<WebElement> radioButtonHomePageBodyTestimonialButunRadioButtonlar;

    //HomePage >>> Testimonial kısmının birinci radio buttonu
    @FindBy(xpath = "(//div[@class='owl-dots'])[3]/div[1]")
    public WebElement radiButtonHomePageBoydTestimonialBirinciRadioButton;

    //HomePage >>> Testimonial kısmının Ikinci radio buttonu
    @FindBy(xpath = "(//div[@class='owl-dots'])[3]/div[2]")
    public WebElement radiButtonHomePageBoydTestimonialIkinciRadioButton;

    //HomePage >>> Testimonial kısmının Ucuncu radio buttonu
    @FindBy(xpath = "(//div[@class='owl-dots'])[3]/div[3]")
    public WebElement radiButtonHomePageBoydTestimonialUcuncuRadioButton;

    //HomePage >>> Testimonial kısmının Dorduncu radio buttonu
    @FindBy(xpath = "(//div[@class='owl-dots'])[3]/div[4]")
    public WebElement radiButtonHomePageBoydTestimonialDorduncuRadioButton;

    //HomePage >>> Testimonial kısmının birinci üyesinin fotografı
    @FindBy(xpath = "(//div[@class='owl-stage'])[4]/div[1]/div/div[1]")
    public WebElement imageProfileHomePageBodyTestimonialBirinciUyeImage;

    //HomePage >>> Testimonial kısmının birinci üyesinin ismi
    @FindBy(xpath = "(//div[@class='owl-stage'])[4]/div[1]/div/div[2]/h2")
    public WebElement  labelHomePageBodyTestimonialBirinciUyeIsimTexti;

    //HomePage >>> Testimonial kısmının birinci üyesinin görev texti
    @FindBy(xpath = "(//div[@class='owl-stage'])[4]/div[1]/div/div[2]/h3")
    public WebElement  labelHomePageBodyTestimonialBirinciUyeGorevTexti;

    //HomePage >>> Testimonial kısmının birinci üye aciklama texti
    @FindBy(xpath = "(//div[@class='owl-stage'])[4]/div[1]/div/div[2]/div")
    public WebElement  labelHomePageBodyTestimonialBirinciUyeAciklamaTexti;

    //HomePage >>> Testimonial kısmının Ikinci üyesinin fotografı
    @FindBy(xpath = "(//div[@class='owl-stage'])[4]/div[2]/div/div[1]")
    public WebElement imageProfileHomePageBodyTestimonialIkinciUyeImage;

    //HomePage >>> Testimonial kısmının Ikinci üyesinin ismi
    @FindBy(xpath = "(//div[@class='owl-stage'])[4]/div[2]/div/div[2]/h2")
    public WebElement  labelHomePageBodyTestimonialIkinciUyeIsimTexti;

    //HomePage >>> Testimonial kısmının Ikinci üyesinin görev texti
    @FindBy(xpath = "(//div[@class='owl-stage'])[4]/div[2]/div/div[2]/h3")
    public WebElement  labelHomePageBodyTestimonialIkinciUyeGorevTexti;

    //HomePage >>> Testimonial kısmının Ikinci üye aciklama texti
    @FindBy(xpath = "(//div[@class='owl-stage'])[4]/div[2]/div/div[2]/div")
    public WebElement  labelHomePageBodyTestimonialIkinciUyeAciklamaTexti;

    //HomePage >>> Testimonial kısmının Ucuncu üyesinin fotografı
    @FindBy(xpath = "(//div[@class='owl-stage'])[4]/div[3]/div/div[1]")
    public WebElement imageProfileHomePageBodyTestimonialUcuncuUyeImage;

    //HomePage >>> Testimonial kısmının Ucuncu üyesinin ismi
    @FindBy(xpath = "(//div[@class='owl-stage'])[4]/div[3]/div/div[2]/h2")
    public WebElement  labelHomePageBodyTestimonialUcuncuUyeIsimTexti;

    //HomePage >>> Testimonial kısmının Ucuncu üyesinin görev texti
    @FindBy(xpath = "(//div[@class='owl-stage'])[4]/div[3]/div/div[2]/h3")
    public WebElement  labelHomePageBodyTestimonialUcuncuUyeGorevTexti;

    //HomePage >>> Testimonial kısmının Ucuncu üye aciklama texti
    @FindBy(xpath = "(//div[@class='owl-stage'])[4]/div[3]/div/div[2]/div")
    public WebElement  labelHomePageBodyTestimonialUcuncuUyeAciklamaTexti;

    //HomePage >>> Testimonial kısmının Dorduncu üyesinin fotografı
    @FindBy(xpath = "(//div[@class='owl-stage'])[4]/div[4]/div/div[1]")
    public WebElement imageProfileHomePageBodyTestimonialDorduncuUyeImage;

    //HomePage >>> Testimonial kısmının Dorduncu üyesinin ismi
    @FindBy(xpath = "(//div[@class='owl-stage'])[4]/div[4]/div/div[2]/h2")
    public WebElement  labelHomePageBodyTestimonialDorduncuUyeIsimTexti;

    //HomePage >>> Testimonial kısmının Dorduncu üyesinin görev texti
    @FindBy(xpath = "(//div[@class='owl-stage'])[4]/div[4]/div/div[2]/h3")
    public WebElement  labelHomePageBodyTestimonialDorduncuUyeGorevTexti;

    //HomePage >>> Testimonial kısmının Dorduncu üye aciklama texti
    @FindBy(xpath = "(//div[@class='owl-stage'])[4]/div[4]/div/div[2]/div")
    public WebElement  labelHomePageBodyTestimonialDorduncuUyeAciklamaTexti;



}

