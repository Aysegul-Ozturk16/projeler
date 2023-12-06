package Runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"StepDefinations","Utilities"},
        plugin = {"pretty","html:target/cucumber-html-report","json:target/cucumber.json"},
        tags= "@Dene-me"
)
public class testRunner {

}
