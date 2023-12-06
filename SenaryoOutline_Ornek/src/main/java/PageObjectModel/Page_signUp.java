package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_signUp extends AbstractClass{
    WebDriver driver;

    public Page_signUp(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "a[href='/login']")
    private WebElement loginBtn;
    public void loginBtn_click(){
        clickFuntions(loginBtn);
    }
    @FindBy(css = "input[name='name']")
    private WebElement typeName;
    public void name_sendKey(String name){
        sendKeyFunction(typeName,name);
    }
    @FindBy(xpath = "(//input[@name='email'])[2]")
    private WebElement typeemail;
    public void email_sendKey(String email){
        sendKeyFunction(typeemail,email);
    }
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement signUpBtn;
    public void signUpBtn_click(){
        clickFuntions(signUpBtn);
    }

}
