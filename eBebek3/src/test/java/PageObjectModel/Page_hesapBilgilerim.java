package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Page_hesapBilgilerim extends AbstractClass{
     WebDriver driver;

    public Page_hesapBilgilerim(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "span[class='ins-close-button'")
    private WebElement reklam;
    @FindBy(css = "a[href='/my-account/update-profile']")
    private WebElement hesabimBtn;
    @FindBy(css = "a[id='lnkLoginNavNode']")
    private WebElement hesapOlusturBtn;
    @FindBy(css = "input[id='txtPhoneNumberMobile']")
    private WebElement telNoGir;
    @FindBy(css = "button[id='btnSubmitLogin']")
    private WebElement girisYapBtn;
    @FindBy(css = "input[type='password']")
    private WebElement sifreGir;
    @FindBy(css = "button[type='submit']")
    private WebElement giris_yap_btn;
    @FindBy(css = "span[id='lnkMyAccount']")
    private WebElement hesabim_btn;
    @FindBy(css = "a[id='lnkOrderHistoryNavNode']")
    private WebElement siparislerimBtn;
    @FindBy(css = "a[id='btnMyProfile']")
    private WebElement kisiselBilgilerim;
    @FindBy(css = "p[class='d-none d-lg-block m-0']")
    private WebElement bilgilerimiGuncelle;
    @FindBy(css = "input[name='firstName']")
    private WebElement adGir;
    @FindBy(css = "input[name='lastName']")
    private WebElement soyadGir;
    @FindBy(css = "input[name='email']")
    private WebElement emailGir;
    @FindBy(css = "label[id='btnUserGenderFemale']")
    private WebElement cinsiyetSec;
    @FindBy(css = "input[type='date']")
    private WebElement dogumTarihiGir;
    @FindBy(css = "button[class='add']")
    private WebElement kaydetBtn;

    @FindBy(css = "(//nav[@class='defaultBackground ng-star-inserted'])[1]")
    private WebElement cikis;
    @FindBy(css = "a[id='lnkSignOutNavNode']")
    private WebElement cikisYap;




    public void reklamKaptma(){

        clickFunction(reklam);}
    public void hesabimBtn_click(){
        clickFunction(hesabimBtn);
    }
    public void hesapOlusturBtn_click(){
        clickFunction(hesapOlusturBtn);
    }
    public void telnOGir_sendKey(String telNo){
        sendKeyFunction(telNoGir,telNo);
    }

    public void girisYapBtn_click(){
        clickFunction(girisYapBtn);
    }
    public void sifreGir_sendKey(String sifre){
        sendKeyFunction(sifreGir,sifre);
    }
    public void giris_yap_btn_click(){
        clickFunction(giris_yap_btn);
    }
    public void hesabim_btn_click(){
        clickFunction(hesabim_btn);
    }
    public void siparislerimBtn_click(){
        clickFunction(siparislerimBtn);
    }
    public void kisiselBilgilerim_click(){
        clickFunction(kisiselBilgilerim);
    }
    public void bilgilerimiGuncelle_click(){
        clickFunction(bilgilerimiGuncelle);
    }
    public void adGir_sendKey(String name){

        adGir.clear();
        sendKeyFunction(adGir,name);
    }
    public void soyadGir_sendKey(String lastname){

        soyadGir.clear();
        sendKeyFunction(soyadGir,lastname);
    }
    public void emailGir_sendKey(String email){
        wait.until(ExpectedConditions.elementToBeClickable(emailGir));
        emailGir.clear();
        wait.until(ExpectedConditions.elementToBeClickable(emailGir));
        sendKeyFunction(emailGir,email);
    }
    public void cinsiyetSec_click(){
        clickFunction(cinsiyetSec);
    }
    public void dogumTarihiGir_senKey(String dogumTarihi){

        dogumTarihiGir.clear();
        sendKeyFunction(dogumTarihiGir,dogumTarihi);
    }
    public void kaydetBtn_click(){
        clickFunction(kaydetBtn);
    }
    public void cikis_click(){
        clickFunction(cikis);
    }
    public void cikisYp_click(){
        clickFunction(cikisYap);
    }

}
