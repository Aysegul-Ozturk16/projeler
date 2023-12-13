package StepDefinitions;

import PageObjectModel.Page_siemens;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class siemens_stepDefinitions{
    static WebDriver driver;
    Page_siemens pageSiemens=new Page_siemens();

    @Given("Urunler sekmesine tiklanir")
    public void urunler_sekmesine_tiklanir() {
       driver= Driver.getDriver();
       pageSiemens.urunler_click();

    }
    @Given("Tum buzdolaplari acilir")
    public void tum_buzdolaplari_acilir() {
        pageSiemens.buzdolaplari_click();

    }
    @Given("Iki urun karsilastirmaya eklenir")
    public void iki_urun_karsilastirmaya_eklenir() {
        pageSiemens.karsilastirmayaEkle_click();


    }
    @Given("Urunlerin dogrulugu kontrol edilir")
    public void urunlerin_dogrulugu_kontrol_edilir() {
        pageSiemens.karsilatirmaKontrol();

    }
    @When("Urunler karsilastirilir ve sogutucu kapasitesi buyuk olan sepete eklenir")
    public void urunler_karsilastirilir_ve_sogutucu_kapasitesi_buyuk_olan_sepete_eklenir() {
       pageSiemens.sepeteEkleme();

    }
    @Then("Dogru urunun sepete eklendigi kontrol edilir")
    public void dogru_urunun_sepete_eklendigi_kontrol_edilir() {
        pageSiemens.sepeteEkleKontrol();


    }


}
