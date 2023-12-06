package StepDefinations;

import PageObjectModel.Page_hesapBilgilerim;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class hesapBilgilerim_stepDefination {
     private WebDriver driver;

    Page_hesapBilgilerim pageHesapBilgilerim=new Page_hesapBilgilerim();

    @Given("websitesine gidilir")
    public void websitesine_gidilir() {
        driver= Driver.getDriver();
        driver.get("https://www.e-bebek.com/");
        driver.manage().window().maximize();

    }
    @Given("reklam kapatilir")
    public void reklam_kapatilir() {
        pageHesapBilgilerim.reklamKaptma();

    }
    @Given("hesabimButonuna tikla")
    public void hesabimButonuna_tikla() {
        pageHesapBilgilerim.hesabimBtn_click();

    }
    @Given("girisYapa tiklanir")
    public void giriYapa_tiklanir() {
        pageHesapBilgilerim.hesapOlusturBtn_click();


    }
    @Given("telefon numarasi girilir {string}")
    public void telefon_numarasi_girilir(String telNo) {
        pageHesapBilgilerim.telnOGir_sendKey(telNo);

    }
    @Given("girisYap butonuna tiklanir")
    public void girisYap_butonuna_tiklanir() {
        pageHesapBilgilerim.girisYapBtn_click();


    }
    @Given("sifre girilir {string}")
    public void sifre_girilir(String sifre) {
        pageHesapBilgilerim.sifreGir_sendKey(sifre);

    }
    @Given("giris_yap butonuna tiklanir")
    public void giris_yap_butonuna_tiklanir() {
        pageHesapBilgilerim.giris_yap_btn_click();

    }
    @Given("hesabim_butonuna tiklanir")
    public void hesabim_butonuna_tiklanir() {
        pageHesapBilgilerim.hesabim_btn_click();
    }
    @Given("siparislerime tiklanir")
    public void siparislerime_tiklanir() {
        pageHesapBilgilerim.siparislerimBtn_click();

    }
    @Given("kisisel bilgilerime tiklanir")
    public void kisisel_bilgilerime_tiklanir() {
        pageHesapBilgilerim.kisiselBilgilerim_click();

    }
    @Given("bilgilerimi duzenleye gir")
    public void bilgilerimi_duzenleye_gir() {
        pageHesapBilgilerim.bilgilerimiGuncelle_click();

    }
    @Given("ad girilir {string}")
    public void ad_girilir(String name) {
        pageHesapBilgilerim.adGir_sendKey(name);

    }
    @Given("soyad girilir {string}")
    public void soyad_girilir(String lastname) {
        pageHesapBilgilerim.soyadGir_sendKey(lastname);

    }

    @Given("cinsiyet secilir")
    public void cinsiyet_secilir() {
        pageHesapBilgilerim.cinsiyetSec_click();

    }
    @Given("dogum tarihi secilir {string}")
    public void dogum_tarihi_secilir(String dogumTarihi) {
        pageHesapBilgilerim.dogumTarihiGir_senKey(dogumTarihi);

    }
    @When("kaydet butonuna tiklanir")
    public void kaydet_butonuna_tiklanir() {
        pageHesapBilgilerim.kaydetBtn_click();
       //pageHesapBilgilerim.hesabim_btn_click();
        //pageHesapBilgilerim.cikisYp_click();

    }
    @Then("testi bitir")
    public void testi_bitir() {

       Driver.closeDriver();

    }

}
