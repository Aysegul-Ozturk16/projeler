package StepDefinations;

import PageObjectModel.loginTest_page;
import Utulities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class loginTest_stepDefinations {
    private WebDriver driver;
    loginTest_page loginTestPage=new loginTest_page();

    @Given("go to website")
    public void go_to_website() {
        driver= Driver.getDriver();
        driver.get("https://www.e-bebek.com/");
        driver.manage().window().maximize();

    }
    @Given("click my account button")
    public void click_my_account_button() {
        loginTestPage.myAccountBtn_click();

    }
    @Given("click signup button")
    public void click_signup_button() {
        loginTestPage.signupBtn_click();

    }
    @Given("sendkey phone number")
    public void sendkey_phone_number() {
        //loginTestPage.phoneNumber_click();
        loginTestPage.phoneNumber_sendKey();

    }
    @When("click login button")
    public void click_login_button() {
        loginTestPage.loginBtn_click();

    }
    @Then("test finish")
    public void test_finish() {
        driver.close();


    }

}
