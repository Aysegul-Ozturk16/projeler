package PageObjectModel;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_teknosa extends AbstractClass{

     WebDriver driver;
    public Page_teknosa(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//div[@class='ins-editable ins-element-editable'])[2]")
    private WebElement tamamBtn;
    @FindBy(xpath = "(//span[text()='Tüm Ürünler'])[2]")
    private WebElement tumUrunler;
    @FindBy(xpath = "(//span[text()='Beyaz Eşya ve Ankastre'])[1]")
    private WebElement beyazEsya;
    @FindBy(xpath = "//a[text()='Tüm Buzdolapları']")
    private WebElement tumBuzdolaplari;


    @FindBy(css = "label[for='plp_compare_switch']")
    private WebElement karsilastirmaAc;
    @FindBy(css = "label[for='compare781710179']")
    private WebElement ilkUrun;
    @FindBy(css = "label[for='compare781710181']")
    private WebElement ikinciUrun;
    @FindBy(xpath = "//span[text()='Karşılaştır']")
    private WebElement karsilastirmaBtn;

    @FindBy(xpath = "(//div[@class='cpp-bar-title'])[1]")
    private WebElement kontrol1;
    @FindBy(xpath = "(//div[@class='cpp-bar-title'])[2]")
    private WebElement kontrol2;

    @FindBy(xpath = "(//a[@class='prd-link'])[1]")
    private WebElement ilkUrunBtn;
    @FindBy(xpath = "(//a[@class='prd-link'])[2]")
    private WebElement ikinciUrunBtn;
    @FindBy(css = "h1[class='pdp-title']")
    private WebElement sepetKontrol;



ConfigReader configReader=new ConfigReader();
    public void buzdolaplarineGidilir(){
        clickFunctions(tamamBtn);
        clickFunctions(tumUrunler);
        clickFunctions(beyazEsya);
        clickFunctions(tumBuzdolaplari);
    }
    public void karsilastirma(){
        clickFunctions(karsilastirmaAc);
        clickFunctions(ilkUrun);
        clickFunctions(ikinciUrun);
        clickFunctions(karsilastirmaBtn);
    }

    String ilkUrunBeklenen= "Teka RBF 78720 SS 510 L Solo Buzdolabı";
    String ikinciUrunBeklenen= "Teka RTF 15810 SS TTM 620 L Buzdolabı";
    public void urunKontrolu(){

        assertFunctions(kontrol1,ilkUrunBeklenen);
        assertFunctions(kontrol2,ikinciUrunBeklenen);

    }
    public void kapasiteyeGoreSepeteEkleme(){
        int netKapasite1=configReader.getIntValue("netKapasite1");
        int netKapasite2=configReader.getIntValue("netKapasite2");
        if(netKapasite1>netKapasite2){
            System.out.println(kontrol1+" "+"  1. ürün daha fazla net kapasiteye sahiptir");
            clickFunctions(ilkUrunBtn);
        }else{
            System.out.println(kontrol2+" "+"  2. ürün daha fazla net kapasiteye sahiptir");
            clickFunctions(ikinciUrunBtn);
        }
    }
    public void sepetKontrol(){
        assertFunctions(sepetKontrol,ikinciUrunBeklenen);
    }

}
