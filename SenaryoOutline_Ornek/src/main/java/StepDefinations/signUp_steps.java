package StepDefinations;

import PageObjectModel.Page_signUp;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class signUp_steps {
    private WebDriver driver;
    Page_signUp pageSignUp=new Page_signUp();

    @Given("go website")
    public void go_website() {
        driver= Driver.getDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();

    }
    @Given("click login button")
    public void click_login_button() {
        pageSignUp.loginBtn_click();
    }
    @Given("type name {string}")
    public void type_name(String name) {
        pageSignUp.name_sendKey(name);

    }
    @Given("type email {string}")
    public void type_email(String email) {
        pageSignUp.email_sendKey(email);
    }
    @When("click signUp button")
    public void click_sign_up_button() {
      pageSignUp.signUpBtn_click();


    }
    @Then("finished test")
    public void finished_test() throws InterruptedException {
       Thread.sleep(2000);
       Driver.closeDriver();

    }

    //çalıştı


}
