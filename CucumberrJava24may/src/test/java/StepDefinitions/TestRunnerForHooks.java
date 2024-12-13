package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\HooksDemoo\\HooksDEM.feature",glue= {"stepsForHOOKS"},
monochrome=true

)
public class TestRunnerForHooks 
{
	

}
