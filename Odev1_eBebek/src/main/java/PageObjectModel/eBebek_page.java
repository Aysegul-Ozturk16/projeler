package PageObjectModel;

import Utulities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class eBebek_page extends AbstractClass{
    private WebDriver driver;

    public eBebek_page(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//input[@id='txtSearchBox'])[1]")
    private WebElement aramaKutusu;
    public void aramaKutusu_sendKeys(){

        sendKeysFunctions(aramaKutusu,"biberon");
        aramaKutusu.sendKeys(Keys.ENTER);
    }

    @FindBy(css = "img[src='https://cdn05.e-bebek.com/mnresize/300/300/media/p/premature-biberon-seti_5430000435895_01.jpg']")
    private WebElement ilkUrun;
    public void ilkUrun_click(){
        clickFunctions(ilkUrun);
    }

    @FindBy(css = "button[id='addToCartBtn']")
    private WebElement sepeteEkleBtn;
    public void sepeteEkleBtn_click(){
        clickFunctions(sepeteEkleBtn);
    }

    @FindBy(css = "a[id='btnShowCart']")
    private WebElement sepetiGorBtn;
    public void sepetiGotBtn_click() {
        clickFunctions(sepetiGorBtn);
    }




    @FindBy(css = "span[id='lnkMyAccount']")
    private WebElement myAccountBtn;
    public void myAccountBtn_click(){
        clickFunctions(myAccountBtn);
    }
    @FindBy(css = "nav[class='orangeBackground ng-star-inserted']")
    private WebElement createAccountBtn;
    public void createAccountBtn_click(){
        clickFunctions(createAccountBtn);
    }

    @FindBy(css = "input[id='txtPhoneNumberMobile']")
    private WebElement phoneNumber;

    public void phoneNumber_sendKeys(){

        sendKeysFunctions(phoneNumber,"365485819");
    }

    @FindBy(css = "button[type='submit']")
    private WebElement signUpBtn;
    public void signUpBtn_click(){
        clickFunctions(signUpBtn);
    }
    @FindBy(css = "input[id='txtFirstNameRegister']")
    private WebElement firstName;
    public void firstName_SendKey(){
        sendKeysFunctions(firstName,"Ayşegül");
    }
    @FindBy(css = "input[id='txtLastNameRegister']")
    private WebElement lastName;
    public void lastName_sendKey(){
        sendKeysFunctions(lastName,"ÖZTÜRK");
    }
    @FindBy(css = "input[id='txtEmailRegister']")
    private WebElement email;
    public void email_sendKey(){
        sendKeysFunctions(email,"ozturkaysegul.1998@gmail.com");
    }
    @FindBy(css = "input[id='txtSetPassword']")
    private WebElement password;
    public void password_sendKey(){
        sendKeysFunctions(password,"16.3.98bB");
    }
    @FindBy(xpath = "(//div[@class='checkbox'])[1]")
    private WebElement permission1;
    public void permission1_click(){
        clickFunctions(permission1);
    }
    @FindBy(xpath = "(//div[@class='checkbox'])[2]")
    private WebElement permission2;
    public void permission2_click(){
        clickFunctions(permission2);
    }
    @FindBy(xpath = "(//div[@class='checkbox'])[3]")
    private WebElement permission3;
    public void permission3_click(){
        clickFunctions(permission3);
    }
    @FindBy(xpath = "(//div[@class='checkbox'])[4]")
    private WebElement permission4;
    public void permission4_click(){
        clickFunctions(permission4);
    }

    @FindBy(css = "button[id='btnCreateAccount']")
    private WebElement signUp_btn;
    public void signUp_btn_click(){
        clickFunctions(signUp_btn);
    }


}
