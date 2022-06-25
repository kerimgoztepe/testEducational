package com.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "src/test/java/com/step_definitions",
        plugin = {"pretty"},
        dryRun = false,
        tags = "@education"


)

public class TestRunner extends AbstractTestNGCucumberTests {

}
