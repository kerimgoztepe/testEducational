package com.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "src/test/java/com/step_definitions",
        plugin = {"pretty"},
        dryRun = false,
        tags = "@education"


)

public class TestRunner {

}
