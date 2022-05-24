package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "not @ignore",
        plugin = {"pretty", "html:results/cucumber.html", "junit:results/Cucumber.xml"},
        features = "src/test/java/features/bdd.feature",
        glue = "steps",
        monochrome = true)

public class RunnerTests {

}