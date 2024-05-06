package runner;


import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/reports/cucumber.html", "json:target/reports/cucumber.json"},
        glue = "stepsDefinition",
        features = "src/test/resources/features",
        tags = "@loginDemo",
        dryRun = false
)


public class Runner {

}
