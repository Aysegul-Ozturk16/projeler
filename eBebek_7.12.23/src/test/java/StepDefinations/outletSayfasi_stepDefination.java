package StepDefinations;

import PageObjectModel.Page_ebebek;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class outletSayfasi_stepDefination {
    private WebDriver driver;
    Page_ebebek pageOutletSayfasi=new Page_ebebek();
    @Given("Siteye gidilir")
    public void siteye_gidilir() {
        driver= Driver.getDriver();
        driver.get("https://www.e-bebek.com/");
        driver.manage().window().maximize();
        pageOutletSayfasi.reklam_click();

    }
    @Given("Outlete tiklanir")
    public void outlete_tiklanir() {
        pageOutletSayfasi.OutletPage_click();

    }
    @Given("Akilli siralama yapilir")
    public void akilli_siralama_yapilir() {
        pageOutletSayfasi.akilliArama_click();
        pageOutletSayfasi.enDusuk_click();
    }
    @Given("En dusuk fiyata gore secilir")
    public void en_dusuk_fiyata_gore_secilir() {
        pageOutletSayfasi.enDusuk_click();
    }

    @Given("besinci urun sepete eklenir")
    public void besinci_urun_sepete_eklenir() {pageOutletSayfasi.besinciUrunBtn_click(); }
    @Given("Sepete ekle butonuna tiklanir")
    public void sepete_ekle_butonuna_tiklanir() {
        pageOutletSayfasi.sepeteEkleBtn_click();
    }
    @Given("Sepeti gor butonuna tiklanir")
    public void sepeti_gor_butonuna_tiklanir() {
        pageOutletSayfasi.sepetiGorBtn_click();
    }
    @Given("Urun adedi bir tane arttirilir")
    public void urun_adedi_bir_tane_arttirilir() {
        pageOutletSayfasi.arttirBtn_click();
    }
    @When("Alisverisi tamamla butonuna tiklanir")
    public void alisverisi_tamamla_butonuna_tiklanir() {
        pageOutletSayfasi.alisverisiTamamlaBtn_click();
    }
    @Then("Test bitirilir")
    public void test_bitirilir() {
        Driver.closeDriver();

    }
    //çalıştı

}
