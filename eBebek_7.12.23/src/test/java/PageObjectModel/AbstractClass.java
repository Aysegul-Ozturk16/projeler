package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public abstract class AbstractClass {
    private final WebDriver driver= Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

    public void clickFunctions(WebElement clickElement) {
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void sendKeyFunctions(WebElement sendKeyElemet, String value) {
        wait.until(ExpectedConditions.visibilityOf(sendKeyElemet));
        sendKeyElemet.sendKeys(value);
    }

    public void dropDownFuntions(WebElement dropDownElement, String element) {
        Select slc = new Select(dropDownElement);
        slc.selectByVisibleText(element);
    }
    public void Assertion(WebElement actual, String expected){
        Assert.assertEquals(actual.getText(),expected);
        System.out.println("doğru ürün");
    }

}
