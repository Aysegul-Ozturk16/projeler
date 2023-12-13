package StepDefinitions;

import PageObjectModel.Page_teknosa;
import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class teknosa_stepDefination {
     WebDriver driver;
     ConfigReader configReader = new ConfigReader();
    Page_teknosa pageTeknosa=new Page_teknosa();

    @Given("Tum urunlerden beyaz esya olarak tum buzdolapklarine gidilir")
    public void tum_urunlerden_beyaz_esya_olarak_tum_buzdolapklarine_gidilir() {
       driver= Driver.getDriver();
       pageTeknosa.buzdolaplarineGidilir();

    }
    @Given("iki urun karsilastirmaya eklenir")
    public void iki_urun_karsilastirmaya_eklenir() {
        pageTeknosa.karsilastirma();

    }
    @Given("Urunler kontrol edilir")
    public void urunler_kontrol_edilir() {
        pageTeknosa.urunKontrolu();

    }
    @When("Buzdolabi net kapasitesi altiyuzden buyuk olan sepete eklenir")
    public void buzdolabi_net_kapasitesi_altiyuzden_buyuk_olan_sepete_eklenir() {
        pageTeknosa.kapasiteyeGoreSepeteEkleme();

    }
    @Then("Urunun dogrulugu kontol edilir")
    public void urunun_dogrulugu_kontol_edilir() {
        pageTeknosa.sepetKontrol();


    }
}
