package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturesWithTags/Tags.feature",
glue= {"stepDefinations"},
tags= ("@regression and not @smoke")

		)
public class TestRunner_RunWithSingleTag 
{
	

}
