package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TawUserHomePage {

    public TawUserHomePage(){PageFactory.initElements(Driver.getDriver(), this);}

    //HomePage >>> Logo
    @FindBy(xpath = "//*[@*='logo']")
    WebElement homePageLogo;

    //Registration >>> Name Textbox
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement labelRegistrationInput;

    //Registration >>> Email Textbox
    @FindBy(xpath="//input[@type='email']")
    public WebElement labelRegistrationMail;

    //Registration >>> password Textbox
    @FindBy(xpath="//input[@type='password']")
    public WebElement labelRegistrationPass;

    //Registration >>> button
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement registrationButton;

    //Registration >>> Onay
    @FindBy(xpath ="//*[contains(text(), 'Please check your email to verify your registration. Check your spam folder too.')]")
    public WebElement registrationOnay;

}
