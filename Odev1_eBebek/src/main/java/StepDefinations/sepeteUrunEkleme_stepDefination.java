package StepDefinations;

import PageObjectModel.eBebek_page;
import Utulities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class sepeteUrunEkleme_stepDefination {

    //1- E-bebek ana sayfasına gidilir (https://www.e-bebek.com/)
    //2- Arama çubuğuna “biberon” yazılır ve aratılır
    //3- Çıkan ilk ürüne tıklanır
    //4- İlgili ürün sepete eklenir
    //5- Sepete eklendiği kontrol edilir

     private WebDriver driver;

    eBebek_page ebebekPage=new eBebek_page();

    @Given("E-bebek ana sayfasina gidilir")
    public void e_bebek_ana_sayfasina_gidilir() {
        driver= Driver.getDriver();
        driver.get("https://www.e-bebek.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    @Given("Arama cubuguna “biberon” yazilir ve aratilir")
    public void arama_cubuguna_biberon_yazilir_ve_aratilir() {
        ebebekPage.aramaKutusu_sendKeys();


    }
    @Given("cikan ilk urune tiklanir")
    public void cikan_ilk_urune_tiklanir() {
        ebebekPage.ilkUrun_click();

    }
    @Given("İlgili urun sepete eklenir")
    public void ilgili_urun_sepete_eklenir() {
        ebebekPage.sepeteEkleBtn_click();

    }
    @When("Sepete eklendigi kontrol edilir")
    public void sepete_eklendigi_kontrol_edilir() {
        ebebekPage.sepetiGotBtn_click();

    }
    @Then("test bitirilir")
    public void test_bitirilir() {
       // driver.quit();


    }

    //çalıştı


}
