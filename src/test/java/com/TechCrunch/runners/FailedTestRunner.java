package com.TechCrunch.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/TechCrunch/stepDefs",
        plugin = {"html:target/failed-html-report"}
)
public class FailedTestRunner {
}
