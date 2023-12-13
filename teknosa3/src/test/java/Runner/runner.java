package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/favorilerim.feature",
        glue = {"StepDefinations","Hook"},
        plugin = {"pretty","html:target/cucumber-html-report","json:target/cucumber.json"},
        tags= "@Teknosa"
)
public class runner {
}