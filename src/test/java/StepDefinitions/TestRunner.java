package StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( 
features="src/test/java/FeatureFile",
glue= {"StepDefinitions"})
public class TestRunner {

}

