package hooks;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Regressivo",
        features = {"src/test/java/resources/features"},
        glue = {"stepDefinitions"},
        plugin = {"pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class CucumberRunnerTest{
    public CucumberRunnerTest() {
    }
}

