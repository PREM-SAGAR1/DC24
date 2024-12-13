package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/GoogleSearch.feature",glue= {"stepDefinations"},
monochrome=true,
plugin ={"pretty","junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HtmlReports/report"}

		)
public class TestRunner 
{
	

}
