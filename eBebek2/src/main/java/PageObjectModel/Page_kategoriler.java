package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_kategoriler extends AbstractClass{
    WebDriver driver;
    public Page_kategoriler(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "span[id='lnkEbebekCategoryNavNode']")
    private WebElement kategorilerSection;
    public void kategorilerSection_click(){
        clickFunctions(kategorilerSection);
    }
    @FindBy(xpath = "//span[text()='Giyim & Tekstil']")
    private WebElement giyimTekstilSection;
    public void giyimTekstilSection_click(){
        clickFunctions(giyimTekstilSection);
    }
    @FindBy(css = "img[src='https://cdn05.e-bebek.com/media/c/bebek-coraplari-logo.png']")
    private WebElement bebekCorapSection;
    public void bebekCorapSection_click(){
        clickFunctions(bebekCorapSection);
    }

    @FindBy(css = "input[id='chk4128']")
    private WebElement bebekSoketCorapSection;
    public void bebekSoketCorapSection_click(){
        clickFunctions(bebekSoketCorapSection);
    }
    @FindBy(xpath = "(//button[@id='addToCartBtn'])[1]")
    private WebElement firstProduct;
    public void firstProduct_click(){
        clickFunctions(firstProduct);
    }
    @FindBy(css = "button[class='btn add ng-star-inserted']")
    private WebElement sepeteEkleBtn1;
    public void sepeteEkleBtn1_click(){
        clickFunctions(sepeteEkleBtn1);
    }
    @FindBy(css = "button[id='btnContinueShopping']")
    private WebElement alisveriseDevamBtn;
    public void alisveriseDevemBtn_click(){
        clickFunctions(alisveriseDevamBtn);
    }
    @FindBy(xpath = "(//button[@class='btn close-btn ng-star-inserted'])[2]")
    private WebElement secondProduct;
    public void secondProduct_click(){
        clickFunctions(secondProduct);
    }

    @FindBy(css = "button[class='btn add ng-star-inserted']")
    private WebElement sepeteEkleBtn2;
    public void sepeteEkleBtn2_click(){
        clickFunctions(sepeteEkleBtn2);
    }
    @FindBy (css = "a[id='btnShowCart']")
    private WebElement sepetiGorBtn;
    public void sepetiGorBtn_click(){
        clickFunctions(sepetiGorBtn);
    }
    @FindBy(css = "button[id='btnGoToShippingAddress']")
    private WebElement alisverisiTamamlaBtn;
    public void alisverisiTamamlaBtn_click(){
        clickFunctions(alisverisiTamamlaBtn);
    }
    @FindBy(xpath = "//h1[text()='Üyelik']")
    private WebElement verify;
    public void Assert(){
        Assertion(verify,"Üyelik");
    }

}
