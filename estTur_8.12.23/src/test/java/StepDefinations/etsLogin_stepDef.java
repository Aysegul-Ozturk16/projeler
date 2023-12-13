package StepDefinations;

import PageObjectModel.Page_ets;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class etsLogin_stepDef {
     WebDriver driver;
    Page_ets pageEts=new Page_ets();

    @Given("Ets tur sitesine gider")
    public void ets_tur_sitesine_gider() {
        driver= Driver.getDriver();
        driver.get("https://www.etstur.com/");
        driver.manage().window().maximize();
    }
    @Given("Giris yap butonuna tiklanir")
    public void giris_yap_butonuna_tiklanir() {
        pageEts.girisBtn_click();

    }
    @Given("Eposta girilir {string}")
    public void eposta_girilir(String eposta) {
        pageEts.eposta_sendKey(eposta);

    }
    @Given("Password girilir {string}")
    public void password_girilir(String password) {
        pageEts.password_sendKey(password);

    }
    @When("Login butonuna tiklanir")
    public void login_butonuna_tiklanir() {
        pageEts.loginBtn_click();

    }
    @Then("Giris yapilamadigina dair hata verir")
    public void giris_yapilamadigina_dair_hata_verir() {
        pageEts.actual_assertion();
        Driver.closeDriver();


    }
    //ÇALIŞTI

}
