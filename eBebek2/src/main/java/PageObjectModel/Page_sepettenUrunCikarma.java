package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_sepettenUrunCikarma extends AbstractClass{
    WebDriver driver;

    public  Page_sepettenUrunCikarma(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "(//input[@id='txtSearchBox'])[1]")
    private WebElement searchBar;
    public void seachBar_sendKey(){
        sendKeyFunctions(searchBar,"biberon");
        searchBar.sendKeys(Keys.ENTER);
    }
    @FindBy (xpath = "(//button[@id='addToCartBtn'])[1]")
    private WebElement sepeteEkleBtn;
    public void sepeteEkleBtn_click(){
        clickFunctions(sepeteEkleBtn);
    }
    @FindBy(css = "a[id='btnShowCart']")
    private WebElement sepetiGorBtn;
    public void sepetiGorBtn_click(){
        clickFunctions(sepetiGorBtn);
    }
    @FindBy(css = "i[id='iconRemoveProduct']")
    private WebElement removeProduct;
    public void removeProductBtn_click(){
        clickFunctions(removeProduct);
    }
    @FindBy(xpath = "//h2[text()=' Sepetinizde ürün bulunmamaktadır. ']")
    private WebElement control;
    public void Assert(){
        Assertion(control,"Sepetinizde ürün bulunmamaktadır.");
    }

}
