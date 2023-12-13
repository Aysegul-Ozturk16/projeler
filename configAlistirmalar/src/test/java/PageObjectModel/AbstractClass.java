package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public abstract class AbstractClass {
    WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    public void clickFunctions(WebElement clickElement) {
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }
    public void sendKeyFunctions(WebElement sendKeyElement, String value){
        wait.until(ExpectedConditions.visibilityOf(sendKeyElement));
        sendKeyElement.sendKeys(value);
    }
    public void assertFunctions(WebElement actual, String expected){
        Assert.assertEquals(actual.getText(),expected);
        System.out.println("Doğru ürün görüntülendi");

    }

}
