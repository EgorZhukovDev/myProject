package cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/cucumber/features",
        glue = {"src/test/java/cucumber/stepDefinition", "src/test/java/cucumber/utility"},
        plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json"}
)
public class TestRunner {
}
