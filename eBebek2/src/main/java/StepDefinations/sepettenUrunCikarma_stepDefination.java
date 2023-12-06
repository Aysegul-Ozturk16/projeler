package StepDefinations;

import PageObjectModel.Page_sepettenUrunCikarma;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class sepettenUrunCikarma_stepDefination {
    private WebDriver driver;

    Page_sepettenUrunCikarma pageSepettenUrunCikarma=new Page_sepettenUrunCikarma();
    @Given("go to website")
    public void go_to_website() {
        driver=Driver.getDriver();
        driver.get("https://www.e-bebek.com/");
        driver.manage().window().maximize();
    }
    @Given("type biberon search bar")
    public void type_biberon_search_bar() {
        pageSepettenUrunCikarma.seachBar_sendKey();

    }
    @Given("click sepete ekle for first product")
    public void click_sepete_ekle_for_first_product() {
        pageSepettenUrunCikarma.sepeteEkleBtn_click();

    }
    @Given("click sepeti gor button")
    public void click_sepeti_gor_button() {
        pageSepettenUrunCikarma.sepetiGorBtn_click();

    }
    @When("click on the trash can amblem")
    public void click_on_the_trash_can_amblem() {
        pageSepettenUrunCikarma.removeProductBtn_click();
        pageSepettenUrunCikarma.Assert();

    }
    @Then("the test is finish")
    public void the_test_is_finish() {
        //driver.quit();

    }
    //çalıştı



}
