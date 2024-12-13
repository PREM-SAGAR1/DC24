package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Featureswithtags//Tags.feature",
glue= {"StepDefinitions"},
tags = ("@regression and not @smoke")

		
                             
)
public class TestRunnerr_RunWithSingleTag
{
	

}
