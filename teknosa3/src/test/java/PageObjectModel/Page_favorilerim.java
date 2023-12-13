package PageObjectModel;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Page_favorilerim extends AbstractClass{
    private WebDriver driver;

    private static final ConfigReader configReader = new ConfigReader();

    public Page_favorilerim(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="ins-editable-button-1580496494")
    private WebElement tamamBtn;

    @FindBy(css = "a[class='btn-user']")
    private WebElement girisBtn;
    @FindBy(css = "a[class='btn btn-secondary homeCallLogin secondCallLogin']")
    private WebElement girisBtn2;
    @FindBy(css = "input[id='j_username1']")
    private WebElement eposta_;
    @FindBy(id="newLoginStepSecond")
    private WebElement continueBtn;
    @FindBy(id="j_password")
    private WebElement sifre_;
    @FindBy(id="customerLoginButton")
    private WebElement girisYapBt3;

    @FindBy(xpath = "(//span[text()='Tüm Ürünler'])[2]")
    private WebElement tumUrunler;
    @FindBy(xpath = "(//span[text()='Bilgisayar & Tablet'])[2]")
    private WebElement bilgisayarTablet;
    @FindBy(xpath = "(//a[@href='/laptop-notebook-c-116004'])[2]")
    private WebElement tumunuGor;
    @FindBy(xpath = "(//button[@class='prd-favorite btn-add-favorites'])[1]")
    private WebElement favorilereEkle;
    @FindBy(xpath = "(//a[@href='/hesabim/uyelik-bilgilerim'])[1]")
    private WebElement hesabimBtn;
    @FindBy(xpath = "//span[text()='Listelerim']")
    private WebElement listelerim;

    @FindBy(xpath = "//div[text()='Favorilerim']")
    private WebElement favorilerimBtn;
    @FindBy(xpath = "(//a[@class='prd-row-link'])[2]")
    private WebElement actual;

    @FindBy(xpath = "(//button[@id='addToCartButton'])[1]")
    private WebElement sepeteEkleBtn;
    @FindBy(css = "a[class='btn btn-primary']")
    private WebElement sepeteGitBtn;
    @FindBy(css = "a[href='/hp-255-g8-7n4w6aa11-ryzen-5-5500u-156-4-gb-ram-256-gb-ssd-fhd-freedos-laptop-p-786290824']")
    private WebElement sepettekiUrun;


    static String expected= configReader.getExpected();
    public  void girisYapilir(){
        String eposta= configReader.getEposta();
        String sifre= configReader.getSifre();

        clickFunctions(tamamBtn);
        clickFunctions(girisBtn);
        clickFunctions(girisBtn2);
        sendKeysFunctions(eposta_,eposta);
        clickFunctions(continueBtn);
        sendKeysFunctions(sifre_,sifre);
        clickFunctions(girisYapBt3);
        //wait.until(ExpectedConditions.visibilityOf(tumunuGor));
    }
    public void urunSecilir_favorilereEklenir(){
        clickFunctions(tumUrunler);
        clickFunctions(bilgisayarTablet);
        clickFunctions(tumunuGor);
        clickFunctions(favorilereEkle);
    }
    public void urunSepeteEkleme(){
        clickFunctions(hesabimBtn);
        clickFunctions(listelerim);
        clickFunctions(favorilerimBtn);
        assertFunctions(actual,expected);
        clickFunctions(sepeteEkleBtn);

    }
    public void sepeteEklenmeKontol(){

        clickFunctions(sepeteGitBtn);
        assertFunctions(sepettekiUrun,expected);

    }
    //çalıştı


}
