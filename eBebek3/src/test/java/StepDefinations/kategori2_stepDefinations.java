package StepDefinations;

import PageObjectModel.Page_kategori2;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class kategori2_stepDefinations {
    private WebDriver driver;
    Page_kategori2 pageKategori2=new Page_kategori2();

    @Given("ebebek websitesine gidilir")
    public void ebebek_websitesine_gidilir() {
      driver=Driver.getDriver();
      driver.manage().window().maximize();
      driver.get("https://www.e-bebek.com/");
    }
    @Given("hesap olustura tiklanir")
    public void hesap_olustura_tiklanir() {
        pageKategori2.hesapOlustur_click();

    }
    @Given("kayit ol butonun tiklanir")
    public void kayit_ol_butonun_tiklanir() {
        pageKategori2.kayitOlBtn_click();
    }
    @Given("telefon numarasi {string} girilir")
    public void telefon_numarasi_girilir(String tel_No) {
        pageKategori2.telno_sendKey(tel_No);

    }
    @Given("uye ol butonuna tiklanir")
    public void uye_ol_butonuna_tiklanir() {
        pageKategori2.uyeOlBtn_click();
    }
    @Given("ad {string} girilir")
    public void ad_girilir(String ad_) {
        pageKategori2.adGir_sendKey(ad_);
    }
    @Given("soyad {string} girilir")
    public void soyad_girilir(String soyad) {
        pageKategori2.soyadGir_sendKey(soyad);

    }
    @Given("eposta {string} girilir")
    public void eposta_girilir(String eposta) {
        pageKategori2.epostaGir_click(eposta);

    }
    @Given("sifre {string} girilir")
    public void sifre_girilir(String sifre) {
        pageKategori2.sifreGir_sendKey(sifre);

    }
    @Given("kullanici sozlesmesi onaylanır")
    public void kullanici_sozlesmesi_onaylanır() {
        pageKategori2.onay1_click();

    }
    @Given("gizlilik politikasi onaylanır")
    public void gizlilik_politikasi_onaylanır() {
        pageKategori2.onay2_click();

    }
    @Given("onay3 onaylanir")
    public void onay3_onaylanir() {
        pageKategori2.onay3_click();

    }
    @Given("onay4 onaylanir")
    public void onay4_onaylanir() {
        pageKategori2.onay4_click();

    }
    @When("hesap olustur bıtonuna tiklanir")
    public void hesap_olustur_bıtonuna_tiklanir() {
        pageKategori2.hesapOlusturBtn_click();

    }
    @Then("test bitirilir")
    public void test_bitirilir() {
        //Driver.closeDriver();

    }





}
