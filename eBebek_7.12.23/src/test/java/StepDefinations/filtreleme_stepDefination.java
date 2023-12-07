package StepDefinations;

import PageObjectModel.Page_ebebek;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class filtreleme_stepDefination {
    private WebDriver driver;
    Page_ebebek pageFiltreleme=new Page_ebebek();

    @Given("Ebebeke gidilir")
    public void Ebebeke_gidilir() {
       driver=Driver.getDriver();
       driver.get("https://www.e-bebek.com/");
        driver.manage().window().maximize();
        pageFiltreleme.reklam_click();

    }
    @Given("Hediye basligi secilir")
    public void hediye_basligi_secilir() {pageFiltreleme.hediye_click();

    }
    @Given("Bebek giyime tiklanir")
    public void bebek_giyime_tiklanir() {pageFiltreleme.bebekGiyim_click();

    }

    @Given("Markalardan bebetto secilir")
    public void markalardan_bebetto_secilir() {pageFiltreleme.bebetto_click();

    }
    @Given("İkinci urun sepete eklenir")
    public void ikinci_urun_sepete_eklenir() {pageFiltreleme.sepeteEkleBtnn_click();

    }
    @Given("Urun adedi iki arttirilir")
    public void urun_adedi_iki_arttirilir() {pageFiltreleme.arttirBtn2_click();

    }
    @Given("Urun adedi bir azaltilir")
    public void urun_adedi_bir_azaltilir() {pageFiltreleme.azaltBtn_click();

    }
    @Given("Urun sepete eklenir")
    public void urun_sepete_eklenir() {pageFiltreleme.sepeteEkleBtn3_click();

    }
    @Given("Sepeti gor butonu tiklanir")
    public void sepeti_gor_butonu_tiklanir() {pageFiltreleme.sepetiGorBtn_click();

    }
    @When("Sepette dogru urunler varsa basari mesaji iletilir")
    public void sepette_dogru_urunler_varsa_basari_mesaji_iletilir() {pageFiltreleme.gercek_assertion();

    }
    @Then("Test son bulur")
    public void test_son_bulur() {
        Driver.closeDriver();

    }

}
