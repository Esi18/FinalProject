package project.tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "project"
)
public class CucumberRunner extends AbstractTestNGCucumberTests {


}
