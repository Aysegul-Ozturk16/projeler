package StepDefinations;

import PageObjectModel.Page_ebebek;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class favorilerim_stepDefination {
    WebDriver driver;
    Page_ebebek pageFavorilerim = new Page_ebebek();

    @Given("Websitesine gidilir")
    public void websitesine_gidilir() {
        driver = Driver.getDriver();
        driver.get("https://www.e-bebek.com/");
        driver.manage().window().maximize();
        pageFavorilerim.reklam_click();

    }

    @Given("My Account butonuna tiklanir")
    public void my_account_butonuna_tiklanir() {
        pageFavorilerim.myAccount_click();
    }

    @Given("Login butonuna tiklanir")
    public void login_butonuna_tiklanir() {
        pageFavorilerim.loginBtn_click();

    }

    @Given("Phone number girilir")
    public void phone_number_girilir() {
        pageFavorilerim.phoneNumber_sendKey();

    }

    @Given("Login_Sign Up butonuna tiklanir")
    public void Login_Sign_Up_butonuna_tiklanir() {
        pageFavorilerim.login_signUpBtn_click();
    }

    @Given("Password butonuna tiklanir")
    public void password_butonuna_tiklanir() {
        pageFavorilerim.password_sendKey();
    }

    @Given("Submit butonuna tiklanir")
    public void submit_butonuna_tiklanir() {
        pageFavorilerim.submitBtn_click();

    }

    @Given("Categories'a tiklanir")
    public void categories_a_tiklanir() {
        pageFavorilerim.categories_click();
    }

    @Given("Beslenmeye tiklanir")
    public void beslenmeye_tiklanir() {
        pageFavorilerim.beslenme_click();
    }

    @Given("Biberon mamalarina tiklanir")
    public void biberon_mamalarina_tiklanir() {
        pageFavorilerim.biberonMmamalari_click();
    }

    @Given("İlk urun favorilere eklenir")
    public void ilk_urun_favorilere_eklenir() {
        pageFavorilerim.favorite_click();
    }

    @Given("New list secilir")
    public void new_list_secilir() {
        pageFavorilerim.newListChose_click();
    }

    @Given("Save lists tiklanir")
    public void save_lists_tiklanir() {
        pageFavorilerim.saveBtn_click();
    }

    @Given("My Account2'ye tiklanir")
    public void my_account2_ye_tiklanir() {
        pageFavorilerim.myAccount2_click();

    }

    @Given("My Lists secilir")
    public void my_lists_secilir() {
        pageFavorilerim.myList_click();
    }

    @Given("New list cop kovasina tasinir")
    public void new_list_cop_kovasina_tasinir() {
        pageFavorilerim.copKovasi_click();
    }

    @Given("Delete butoonuna tiklanir")
    public void delete_butoonuna_tiklanir() {
        pageFavorilerim.deleteBtn_click();
    }

    @Given("My Account3'e tiklanir")
    public void my_account3_e_tiklanir() {
        pageFavorilerim.myAccount2_click();

    }

    @When("Log Out tiklanir")
    public void log_out_tiklanir() {
        pageFavorilerim.signOutBtn_click();

    }

    @Then("Ekran katilir ve test bitirilir")
    public void ekran_katilir_ve_test_bitirilir() {

        Driver.closeDriver();

    }
    //çalıştı

}
