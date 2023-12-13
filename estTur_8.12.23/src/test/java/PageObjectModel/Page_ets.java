package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_ets extends AbstractClass{
    WebDriver driver;
    public Page_ets(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "(//button[@type='button'])[2]")
    private WebElement girisBtn;
    @FindBy(css = "input[name='email']")
    private WebElement eposta;
    @FindBy(name="password")
    private WebElement password;
    @FindBy(css = "button[type='submit']")
    private WebElement loginBtn;
    @FindBy(css = "p[class='MuiFormHelperText-root Mui-error css-3qyf6h']")
    private WebElement actual;


    @FindBy(xpath = "(//button[@type='button'])[3]")
    private WebElement uyeOl;
    @FindBy(name="name")
    private WebElement isimGir;
    @FindBy(name="surname")
    private WebElement soyisimGir;
    @FindBy(name="email")
    private WebElement emailGir;
    @FindBy(xpath = "(//input[@class='MuiInputBase-input MuiInput-input css-1il896l'])[4]")
    private WebElement telNoGir;
    @FindBy(name="password")
    private WebElement sifreGir;
    @FindBy(name="rePassword")
    private WebElement sifreTekrarGir;
    @FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body2 css-ljd33k'])[1]")
    private WebElement onay1;
    @FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body2 css-ljd33k'])[2]")
    private WebElement onay2;
    @FindBy()
    private WebElement aktiveKodKapat;






    public void girisBtn_click(){clickFunctions(girisBtn);}
    public void eposta_sendKey(String eposta_){sendKeyFunctions(eposta,eposta_);}
    public void password_sendKey(String password_){sendKeyFunctions(password,password_);}
    public void loginBtn_click(){clickFunctions(loginBtn);}
    public void actual_assertion(){AssertionFunction(actual,"E-posta adresiniz sistemimizde kayıtlı değildir. Lütfen üyelik oluşturunuz.");}



    public void uyeOlBtn_click(){clickFunctions(uyeOl);}
    public void isimGir_sendKey(String isim){sendKeyFunctions(isimGir,isim);}
    public void soyisimGir_sendKey(String soyisim){sendKeyFunctions(soyisimGir,soyisim);}
    public void emailGir_sendKey(String email){sendKeyFunctions(emailGir,email);}
    public void telNoGir_sendKey(String telNo){sendKeyFunctions(telNoGir,telNo);}
    public void sifreGir_sendKey(String sifre){sendKeyFunctions(sifreGir,sifre);}
    public void sifreTekrarGir_sendKey(String sifreTekrar){sendKeyFunctions(sifreTekrarGir,sifreTekrar);}
    public void onay1_click(){clickFunctions(onay1);}
    public void onay2_click(){clickFunctions(onay2);}
    public void aktiveKodKapat_click(){clickFunctions(aktiveKodKapat);}
}
