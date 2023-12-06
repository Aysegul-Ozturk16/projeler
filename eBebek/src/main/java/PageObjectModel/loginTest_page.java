package PageObjectModel;

import Utulities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginTest_page extends AbstractClass{
     WebDriver driver;

    public loginTest_page(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "a[href='/my-account/update-profile']")
    private WebElement myAccountBtn;
    public void myAccountBtn_click(){
        clickFunctions(myAccountBtn);
    }
    @FindBy(css="a[id='lnkLoginNavNode']")
    private WebElement signupBtn;
    public void signupBtn_click(){
        clickFunctions(signupBtn);
    }
    @FindBy(css = "input[id='txtPhoneNumberMobile']")
    private WebElement phoneNumber;
    //public void phoneNumber_click(){
       // clickFunctions(phoneNumber);}
    public void phoneNumber_sendKey(){
        sendKeysFunctions(phoneNumber,"365484819");
    }
    @FindBy(css = "button[id='btnSubmitLogin']")
    private WebElement loginBtn;
    public void loginBtn_click(){
        clickFunctions(loginBtn);

    }

    //çalıştı.
}
