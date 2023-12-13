package StepDefinations;

import PageObjectModel.Page_ets;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class etsUyeOl_stepDef {
    private WebDriver driver;
    Page_ets pageUyeOl=new Page_ets();

    @Given("Ets sitesine gidilir")
    public void ets_sitesine_gidilir() {
        driver= Driver.getDriver();
        driver.get("https://www.etstur.com/");
        driver.manage().window().maximize();

    }
    @Given("Uye ol butonuna tiklanir")
    public void uye_ol_butonuna_tiklanir() {
        pageUyeOl.uyeOlBtn_click();

    }
    @Given("İsim girilir {string}")
    public void isim_girilir(String isim) {
        pageUyeOl.isimGir_sendKey(isim);

    }
    @Given("Soyisim girilir {string}")
    public void soyisim_girilir(String soyisim) {
        pageUyeOl.soyisimGir_sendKey(soyisim);

    }
    @Given("Email girlir {string}")
    public void email_girlir(String email) {
        pageUyeOl.emailGir_sendKey(email);

    }
    @Given("Tel no girilir {string}")
    public void tel_no_girilir(String telNo) {
        pageUyeOl.telNoGir_sendKey(telNo);

    }
    @Given("Sifre girilir {string}")
    public void sifre_girilir(String sifre) {
        pageUyeOl.sifreGir_sendKey(sifre);

    }
    @Given("Sifre tekrar girilir {string}")
    public void sifre_tekrar_girilir(String sifreTekrar) {
        pageUyeOl.sifreTekrarGir_sendKey(sifreTekrar);

    }
    @Given("Onay1 tiklanir")
    public void onay1_tiklanir() {
        pageUyeOl.onay1_click();

    }
    @Given("Onay2 tiklanir")
    public void onay2_tiklanir() {
        pageUyeOl.onay2_click();
        pageUyeOl.loginBtn_click();

    }
    @When("Aktivasyon kodu kapatilir")
    public void aktivasyon_kodu_kapatilir() {
        pageUyeOl.aktiveKodKapat_click();

    }
    @Then("Sayfa kapatilir")
    public void sayfa_kapatilir() {
        Driver.closeDriver();

    }

}
