package StepDefinations;
import PageObjectModel.Page_favorilerim;
import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class favorilerim_stepDef {
     static WebDriver driver;

    Page_favorilerim pageFavorilerim=new Page_favorilerim();


    @Given("sisteme giris yapilir")
    public void sisteme_giris_yapilir() {
        driver= Driver.getDriver();
        pageFavorilerim.girisYapilir();

    }
    @Given("Urun secilir ve favorilere eklenir")
    public void urun_secilir_ve_favorilere_eklenir() {
        pageFavorilerim.urunSecilir_favorilereEklenir();


    }
    @When("Urun sepete eklenir")
    public void urun_sepete_eklenir() {
        pageFavorilerim.urunSepeteEkleme();


    }
    @Then("Urunun sepete eklendigi dogrulanir")
    public void urunun_sepete_eklendigi_dogrulanir() {
        pageFavorilerim.sepeteEklenmeKontol();


    }

    //chrome, edge ve firefox ile çalıştı.



}
