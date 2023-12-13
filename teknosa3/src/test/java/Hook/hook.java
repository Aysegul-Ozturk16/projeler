package Hook;

import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class hook {
    static WebDriver driver;
    private static final ConfigReader configReader = new ConfigReader();


    @BeforeAll
    public static void setUp(){
        driver=Driver.getDriver();
       //driver.get(configReader.getBrowser());
        driver.get(configReader.getUrl());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
    }
    @AfterAll
    public static void tearDown(){Driver.closeDriver();
    }
}
