package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_kategori2 extends AbstractClass{
     WebDriver driver;
    public Page_kategori2(){
        driver=Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "span[id='lnkMyAccount']")
    private WebElement hesapOlustur;
    @FindBy(css = "a[id='lnkLoginNavNode']")
    private WebElement kayitOlBtn;
    @FindBy(css = "input[id='txtPhoneNumberMobile']")
    private WebElement typeTelNo;
    @FindBy(css = "button[id='btnSubmitLogin']")
    private WebElement uyeOlBtn;
    @FindBy(css = "input[id='txtFirstNameRegister']")
    private WebElement adGir;
    @FindBy(css = "input[id='txtLastNameRegister']")
    private WebElement soyadGir;
    @FindBy(css = "input[id='txtEmailRegister']")
    private WebElement epostaGir;
    @FindBy(css = "input[id='txtSetPassword']")
    private WebElement sifreGir;
    @FindBy(xpath = "(//div[@class='checkbox'])[1]")
    private WebElement onay1;
    @FindBy(xpath = "(//div[@class='checkbox'])[2]")
    private WebElement onay2;
    @FindBy(xpath = "(//div[@class='checkbox'])[3]")
    private WebElement onay3;
    @FindBy(xpath = "(//div[@class='checkbox'])[4]")
    private WebElement onay4;
    @FindBy(css = "button[id='btnCreateAccount']")
    private WebElement hesapOlusturBtn;





    public void hesapOlustur_click(){
        clickFunction(hesapOlustur);
    }
    public void kayitOlBtn_click(){
        clickFunction(kayitOlBtn);
    }
    public void telno_sendKey(String telNo){
        sendKeyFunction(typeTelNo, telNo);

    }
    public void uyeOlBtn_click(){
        clickFunction(uyeOlBtn);
    }
    public void adGir_sendKey(String ad){
        sendKeyFunction(adGir,ad);
    }

    public void soyadGir_sendKey(String soyad){
    sendKeyFunction(soyadGir,soyad);
    }
    public void epostaGir_click(String mail){
        sendKeyFunction(epostaGir,mail);
    }
    public void sifreGir_sendKey(String sifre){
        sendKeyFunction(sifreGir,sifre);
    }
    public void onay1_click(){
        clickFunction(onay1);
    }
    public void onay2_click(){
        clickFunction(onay2);
    }
    public void onay3_click(){
        clickFunction(onay3);
    }
    public void onay4_click(){
        clickFunction(onay4);
    }
    public void hesapOlusturBtn_click(){
        clickFunction(hesapOlusturBtn);
    }









}
