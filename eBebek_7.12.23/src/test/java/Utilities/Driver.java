package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("driver.chrome.driver", "C:\\Users\\burak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
    public static void closeDriver(){
        if( driver!=null ){
            driver.quit();
            driver=null;

        }
    }
}
