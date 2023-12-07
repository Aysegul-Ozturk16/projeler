package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.IExpectedExceptionsHolder;

public class Page_ebebek extends AbstractClass{
     WebDriver driver;
    public Page_ebebek(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "a[href='/my-account/update-profile']")
    private WebElement myAccount;
    @FindBy(id="lnkLoginNavNode")
    private WebElement loginBtn;
    @FindBy(id="txtPhoneNumberMobile")
    private WebElement phoneNumber;
    @FindBy(id="btnSubmitLogin")
    private WebElement login_sigUpBtn;
    @FindBy(id="txtPassword")
    private WebElement password;
    @FindBy(id="btnSubmitPassword")
    private WebElement submitBtn;
    @FindBy(id="lnkEbebekCategoryNavNode")
    private WebElement categories;
    @FindBy(xpath = "//span[text()='Beslenme']")
    private WebElement beslenme;
    @FindBy(xpath = "//span[text()='Biberon Mamaları']")
    private WebElement biberonMamalari;
    @FindBy(xpath = "(//img[@class='heart-icon'])[1]")
    private WebElement favorite;
    @FindBy(xpath="(//p[@class='product-name wl-list-name'])[2]")
    private WebElement newListChose;
    @FindBy(css = "button[class='btn btn-primary wl-add-btn']")
    private WebElement saveBtn;
    @FindBy(css = "a[href='/my-account/update-profile']")
    private WebElement myAccount2;
    @FindBy(id="lnkWishListNavNode")
    private WebElement myList;
    @FindBy(css = "button[class='delete delete-details']")
    private WebElement copKovasi;
    @FindBy(css = "button[class='delete-btn']")
    private WebElement deleteBtn;
    @FindBy(id="lnkSignOutNavNode")
    private WebElement signOutBtn;


    @FindBy(css = "span[id='lnkHeaderHediyeNavNode']")
    private WebElement hediye;
    @FindBy(id="lnkHeaderOutletNavNode")
    private WebElement outletPage;
    @FindBy(xpath = "(//i[@class='icon icon-arrow-bottom'])[2]")
    private WebElement akilliArama;
    @FindBy(xpath = "//a[text()='En Düşük Fiyata Göre']")
    private WebElement enDusuk;
    @FindBy(xpath = "(//button[text()='Sepete Ekle'])[5]")
    private WebElement besinciUrunBtn;
    @FindBy(xpath = "//button[@class='btn add ng-star-inserted']")
    private WebElement sepeteEkleBtn;
    @FindBy(id="btnShowCart")
    private WebElement sepetiGorBtn;
    @FindBy(css = "button[class='inc-product']")
    private WebElement arttirBtn;
    @FindBy(id="btnGoToShippingAddress")
    private WebElement alisverisiTamamlaBtn;
    @FindBy(css = "span[class='ins-close-button']")
    private WebElement reklam;

    @FindBy(xpath = "(//a[text()='Bebek Giyim'])[1]")
    private WebElement bebekGiyim;

    @FindBy(xpath = "//span[text()='Bebetto']")
    private WebElement bebetto;
    @FindBy(xpath = "(//button[@id='addToCartBtn'])[2]")
    private WebElement sepeteEkleBtnn;
    @FindBy(xpath = "(//button[@class='inc-product'])[2]")
    private WebElement arttirBtn2;
    @FindBy(xpath = "(//button[@type='button'])[5]")
    private WebElement azaltBtn;
    @FindBy(css = "button[class='btn add ng-star-inserted']")
    private WebElement sepeteEkleBtn3;
    @FindBy(css = "img[src='https://cdn05.e-bebek.com/mnresize/1600/1600/media/p/basic-polar-hirka-kiz-bebek_8682766507348_01.jpg']")
    private WebElement gercek;




    public void myAccount_click(){
        clickFunctions(myAccount);
    }
    public void loginBtn_click(){
        clickFunctions(loginBtn);
    }
    public void phoneNumber_sendKey(){
        sendKeyFunctions(phoneNumber,"365485819");
    }
    public void login_signUpBtn_click(){
        clickFunctions(login_sigUpBtn);
    }
    public void password_sendKey(){
       sendKeyFunctions(password,"16.3.98Bb");
    }
    public void submitBtn_click(){
        clickFunctions(submitBtn);
    }
    public void categories_click(){
        clickFunctions(categories);
    }
    public void beslenme_click(){
        clickFunctions(beslenme);
    }
    public void biberonMmamalari_click(){
        clickFunctions(biberonMamalari);
    }
    public void favorite_click(){
        clickFunctions(favorite); wait.until(ExpectedConditions.visibilityOf(favorite));
    }
    public void newListChose_click(){
        clickFunctions(newListChose);
    }
    public void saveBtn_click(){
        clickFunctions(saveBtn);
    }
    public void myAccount2_click(){
        clickFunctions(myAccount2);
    }
    public void myList_click(){
        clickFunctions(myList);
    }
    public void copKovasi_click(){
        clickFunctions(copKovasi);
    }
    public void deleteBtn_click(){
        clickFunctions(deleteBtn);
    }
    public void signOutBtn_click(){clickFunctions(signOutBtn);}




    public void OutletPage_click(){clickFunctions(outletPage);}
    public void akilliArama_click(){

        clickFunctions(akilliArama);
    }
    public void enDusuk_click(){
        clickFunctions(enDusuk);
    }
    public void besinciUrunBtn_click(){clickFunctions(besinciUrunBtn);}
    public void sepeteEkleBtn_click(){clickFunctions(sepeteEkleBtnn);}
    public void sepetiGorBtn_click(){clickFunctions(sepetiGorBtn);}
    public void arttirBtn_click(){clickFunctions(arttirBtn);}
    public void alisverisiTamamlaBtn_click(){clickFunctions(alisverisiTamamlaBtn);}
    public void reklam_click(){clickFunctions(reklam);}


    public void hediye_click(){clickFunctions(hediye);}
    public void bebekGiyim_click(){clickFunctions(bebekGiyim);}

    public void bebetto_click(){clickFunctions(bebetto);}
    public void sepeteEkleBtnn_click(){clickFunctions(sepeteEkleBtnn);}
    public void arttirBtn2_click(){clickFunctions(arttirBtn2); clickFunctions(arttirBtn2);}
    public void azaltBtn_click(){clickFunctions(azaltBtn);}
    public void sepeteEkleBtn3_click(){clickFunctions(sepeteEkleBtn3);}
    public void gercek_assertion(){Assertion(gercek,"Basic Polar Hırka Kız Bebek");}
}
