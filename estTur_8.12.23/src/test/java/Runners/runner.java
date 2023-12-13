package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"StepDefinations","Utilities"},
        plugin = {"pretty","html:target/cucumber-html-report","json:target/cucumber.json"},
        tags= "@ets"
)

public class runner {


}
