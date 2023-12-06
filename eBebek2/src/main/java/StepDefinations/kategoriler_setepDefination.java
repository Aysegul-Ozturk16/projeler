package StepDefinations;

import PageObjectModel.Page_kategoriler;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class kategoriler_setepDefination {
    private WebDriver driver;

    Page_kategoriler pageKategoriler=new Page_kategoriler();

    @Given("go to websitee")
    public void go_to_websitee() {
        driver = Driver.getDriver();
        driver.get("https://www.e-bebek.com/");
        driver.manage().window().maximize();
    }
    @Given("click -Kategoriler- section")
    public void click_kategoriler_section() {
       pageKategoriler.kategorilerSection_click();

    }
    @Given("click -Giyim ve Tekstil- section")
    public void click_giyim_ve_tekstil_section() {
        pageKategoriler.giyimTekstilSection_click();

    }
    @Given("click -Bebek Coraplari- section")
    public void click_bebek_coraplari_section() {
        pageKategoriler.bebekCorapSection_click();

    }
    @Given("click -Bebek Soket Corap- section")
    public void click_bebek_soket_corap_section() {
        pageKategoriler.bebekSoketCorapSection_click();

    }
    @Given("add first product to the cart")
    public void add_first_product_to_the_cart() {
        pageKategoriler.firstProduct_click();

    }
    @Given("click -Sepete Ekle- button")
    public void click_sepete_ekle_button() {
        pageKategoriler.sepeteEkleBtn1_click();
    }
    @Given("click -Alisverise Devam Et- section")
    public void click_alisverise_devam_et_section() {
        pageKategoriler.alisveriseDevemBtn_click();
    }
    @Given("add second product to the cart")
    public void add_second_product_to_the_cart() {
        pageKategoriler.secondProduct_click();

    }
    @Given("click -Sepete Ekle- button for second product")
    public void click_sepete_ekle_button_for_second_product() {
        pageKategoriler.sepeteEkleBtn2_click();

    }
    @Given("click -Sepeti Gor- button")
    public void click_sepeti_gor_button() {
        pageKategoriler.sepetiGorBtn_click();

    }
    @When("click -Alisverisi tamamla- button")
    public void click_alisverisi_tamamla_button() {
        pageKategoriler.alisverisiTamamlaBtn_click();
        pageKategoriler.Assert();
    }
    @Then("finish test")
    public void finish_test() {
        //driver.close();

    }


}
