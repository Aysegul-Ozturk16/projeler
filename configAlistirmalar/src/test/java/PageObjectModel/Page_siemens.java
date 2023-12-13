package PageObjectModel;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Page_siemens extends AbstractClass {
    static WebDriver driver;

    public Page_siemens() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Ürünler']")
    private WebElement urunler;
    @FindBy(xpath = "//span[text()='Tümünü reddet']")
    private WebElement cerezler;
    @FindBy(xpath = "(//a[@href='/tr/online-satis/buzdolaplari-ve-derin-dondurucular'])[1]")
    private WebElement buzdolaplari;
    @FindBy(xpath = "(//a[@href='/tr/online-satis/buzdolaplari-ve-derin-dondurucular/ankastre-buzdolaplari-ve-derin-dondurucular'])[1]")
    private WebElement buzdolaplari_ankastre;
    @FindBy(xpath = "(//div[@class='product-tile-title'])[1]")
    private WebElement tumMakineler;
    @FindBy(xpath = "(//strong[text()='Karşılaştırmaya ekle'])[1]")
    private WebElement karsilastirma1;
    @FindBy(xpath = "(//strong[text()='Karşılaştırmaya ekle'])[2]")
    private WebElement karsilastirma2;
    @FindBy(xpath = "(//strong[text()='Karşılaştırmaya ekle'])[8]")
    private WebElement karsilastirma3;
    @FindBy(xpath = "(//a[@class='a-link a-link-inline '])[2]")
    private WebElement karsilatirmaBtn;

    @FindBy(xpath = "//span[text()=' KI82LADE0']")
    private WebElement karsilastirilan1;
    @FindBy(xpath = "//span[text()=' KU15RAFF0']")
    private WebElement karsilastirilan2;
    @FindBy(xpath = "(//label[@class='a-formlabel checkbox'])[4]")
    private WebElement farkliliklarBtn;
    @FindBy(xpath = "(//i[@class='icon icon-shoppingcart icon-m'])[1]")
    private WebElement sepeteEkle1;
    @FindBy(xpath = "(//i[@class='icon icon-shoppingcart icon-m'])[2]")
    private WebElement sepeteEkle2;
    @FindBy(css = "i[class='icon icon-m icon-shoppingcart']")
    private WebElement sepetIkonu;
    @FindBy(css = "span[class='fragment std-header-6 normal']")
    private WebElement sepetekiUrun;


    public void urunler_click() {
        clickFunctions(cerezler);
        clickFunctions(urunler);
    }

    public void buzdolaplari_click() {
        clickFunctions(buzdolaplari);
        clickFunctions(buzdolaplari_ankastre);
        clickFunctions(tumMakineler);
    }

    public void karsilastirmayaEkle_click() {
        clickFunctions(karsilastirma1);
        wait.until(ExpectedConditions.elementToBeClickable(karsilastirma1));
        clickFunctions(karsilastirma2);
        wait.until(ExpectedConditions.elementToBeClickable(karsilastirma3));
        clickFunctions(karsilastirma3);
        clickFunctions(karsilatirmaBtn);
    }

    public void karsilatirmaKontrol() {
        assertFunctions(karsilastirilan1, "expected1");
        assertFunctions(karsilastirilan2, "expected2");
    }

    public void sepeteEkleme() {
        ConfigReader configReader = new ConfigReader();
        int sogutucuKapasitesi1 = configReader.getIntValue("sogutucuKapasitesi1");
        int sogutucuKapasitesi2 = configReader.getIntValue("sogutucuKapasitesi2");

        if (sogutucuKapasitesi1 > sogutucuKapasitesi2) {
            System.out.println(karsilastirilan1 + " ürününün soğutucu kapasitesi daha fazladır.");
            clickFunctions(sepeteEkle1);

        } else {
            System.out.println(" " + karsilastirilan2 + "ürününün soğutucu kapasitesi daha fazladır");
            clickFunctions(sepeteEkle2);
        }

    }

    public void sepeteEkleKontrol() {
        clickFunctions(sepetIkonu);
        assertFunctions(sepetekiUrun, "expected1");


    }

}
