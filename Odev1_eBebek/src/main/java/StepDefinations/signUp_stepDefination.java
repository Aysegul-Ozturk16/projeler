package StepDefinations;

import PageObjectModel.eBebek_page;
import Utulities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class signUp_stepDefination {
     WebDriver driver;

    eBebek_page eBebekPage=new eBebek_page();

    @Given("go to ebebek website")
    public void go_to_ebebek_website() {
        driver= Driver.getDriver();
        driver.get("https://www.e-bebek.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

    }
    @Given("click my account button")
    public void click_my_account_button() {
        eBebekPage.myAccountBtn_click();

    }
    @Given("click create account button")
    public void click_create_account_button() {
        eBebekPage.createAccountBtn_click();

    }

    @Given("sendkey phone number")
    public void sendkey_phone_number() {
        eBebekPage.phoneNumber_sendKeys();

    }
    @Given("click signup button")
    public void click_signup_button() {
        eBebekPage.signUpBtn_click();

    }
    @Given("sendkey firstname")
    public void sendkey_firstname() {
        eBebekPage.firstName_SendKey();

    }
    @Given("sendkey lastname")
    public void sendkey_lastname() {
        eBebekPage.lastName_sendKey();
    }

    @Given("sendkey email")
    public void sendkey_email() {
        eBebekPage.email_sendKey();

    }
    @Given("sendkey password")
    public void sendkey_password() {
        eBebekPage.password_sendKey();

    }
    @Given("click permissions1")
    public void click_permissions1() {
        eBebekPage.permission1_click();

    }
    @Given("click permissions2")
    public void click_permissions2() {
        eBebekPage.permission2_click();

    }
    @Given("click permissions3")
    public void click_permissions3() {
        eBebekPage.permission3_click();

    }
    @Given("click permissions4")
    public void click_permissions4() {
        eBebekPage.permission4_click();

    }
    @When("click create accunt")
    public void click_create_accunt() {
        eBebekPage.signUpBtn_click();

    }
    @Then("finish test")
    public void finish_test() {
       // driver.quit();

    }

    //çalıştı
}
