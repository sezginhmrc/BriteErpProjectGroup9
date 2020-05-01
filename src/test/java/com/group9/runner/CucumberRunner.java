package com.group9.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/group9/step_definitions",
        features = "src/test/resources/features",
        plugin = {
                "html:target/-default-report",
                "json:target/cucumber1.json"
        }
)
public class CucumberRunner {


}

