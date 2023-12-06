package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbstractClass {
    private WebDriver driver= Driver.getDriver();
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    public void clickFuntions(WebElement clickElement){
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }
    public void sendKeyFunction(WebElement sendKeyElement, String value){
        wait.until(ExpectedConditions.visibilityOf(sendKeyElement));
        sendKeyElement.sendKeys(value);

    }
    public void dropDownFunction(WebElement dropDownElement, String element){
        Select slc=new Select(dropDownElement);
        slc.selectByVisibleText(element);

    }


}
